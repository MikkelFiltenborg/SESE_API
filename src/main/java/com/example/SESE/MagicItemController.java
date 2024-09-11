package com.example.SESE;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Item")
public class MagicItemController
{
    MagicItemRepo repo;

    public MagicItemController(MagicItemRepo repo) {this.repo = repo;}

    @PostMapping()
    void create(@RequestBody MagicItemModel model) {repo.save(model);}

    @GetMapping("/{id}")
    MagicItemModel read(@PathVariable int id) {return repo.findById(id).get();}

    @GetMapping()
    List<MagicItemModel> getAll() {return repo.findAll();}

    @PutMapping()
    void update(@RequestBody MagicItemModel model) {repo.save(model);}

    @DeleteMapping("/{id}")
    void delete(@PathVariable int id) {repo.deleteById(id);}
}