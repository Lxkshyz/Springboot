package net.engineeringdigest.journalApp.controller;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {
    public Map<Long, JournalEntry> journalEntries = new HashMap<>();
    @GetMapping
    public List<JournalEntry> getJournalEntries() {
        return new ArrayList<>(journalEntries.values());
    }
    @PostMapping
    public void createJournalEntry(@RequestBody JournalEntry journalEntry) {
        journalEntries.put(journalEntry.getUserId(), journalEntry);
    }
}