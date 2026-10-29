package backtraceio.library.interfaces;

import backtraceio.library.models.database.BacktraceDatabaseRecord;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public interface DatabaseFileContext {
    void clear();

    Iterable<File> getAll();

    Iterable<File> getRecords();

    void removeOrphaned(Iterable<BacktraceDatabaseRecord> iterable);

    boolean validFileConsistency();
}
