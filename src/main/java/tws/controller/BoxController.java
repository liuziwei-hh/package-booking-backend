package tws.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tws.entity.Box;
import tws.repository.BoxMapper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/orderTable")
public class BoxController {

    @Autowired
    private BoxMapper boxMapper;

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public void insertOrderTable(@RequestBody Box box) {
        int i = boxMapper.insert(box);
    }

    @GetMapping("")
    public ResponseEntity<List<Box>> getAllBoxyStatus(@RequestBody Map<String, String> map) {
        String status = map.get("status");
        if(status == null || "".equals(status)){
            status = "";
        }
        List<Box> list = boxMapper.selectAllByStatus(status);
        return ResponseEntity.ok(list);
    }

    @PatchMapping("/{num}/boxDate")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateOrderTablePatchDateByOrderNum(@PathVariable("num") String num, @RequestBody Map<String, String> map) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(map.get("fetchDate"));
        int i = boxMapper.updatePatchPackageDateByOrderNum(num, date);
    }
}