package backtraceio.library.models.database;

import backtraceio.library.common.BacktraceSerializeHelper;
import backtraceio.library.interfaces.DatabaseRecordWriter;
import backtraceio.library.logger.BacktraceLogger;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public class BacktraceDatabaseRecordWriter implements DatabaseRecordWriter {
    private static final transient String LOG_TAG = "BacktraceDatabaseRecordWriter";
    private final String _destinationPath;

    public BacktraceDatabaseRecordWriter(String str) {
        this._destinationPath = str;
    }

    private void saveTemporaryFile(String str, byte[] bArr) throws IOException {
        BacktraceLogger.d(LOG_TAG, "Saving temporary file");
        FileOutputStream fileOutputStream = new FileOutputStream(str);
        fileOutputStream.write(bArr);
        fileOutputStream.close();
    }

    private void saveValidRecord(String str, String str2) throws IOException {
        if (new File(str).renameTo(new File(str2))) {
            return;
        }
        BacktraceLogger.e(LOG_TAG, "Can not rename file");
        throw new IOException(String.format("Can not rename file. Source path: %s, destination path: %s", str, str2));
    }

    private String toJsonFile(Object obj) {
        if (obj != null) {
            return BacktraceSerializeHelper.toJson(obj);
        }
        BacktraceLogger.w(LOG_TAG, "Passed object to serialization is null");
        return "";
    }

    @Override // backtraceio.library.interfaces.DatabaseRecordWriter
    public String write(Object obj, String str) {
        return write(toJsonFile(obj).getBytes(StandardCharsets.UTF_8), str);
    }

    @Override // backtraceio.library.interfaces.DatabaseRecordWriter
    public String write(byte[] bArr, String str) throws IOException {
        String str2 = String.format("%s.json", str);
        String absolutePath = new File(this._destinationPath, String.format("temp_%s", str2)).getAbsolutePath();
        saveTemporaryFile(absolutePath, bArr);
        String absolutePath2 = new File(this._destinationPath, str2).getAbsolutePath();
        saveValidRecord(absolutePath, absolutePath2);
        return absolutePath2;
    }
}
