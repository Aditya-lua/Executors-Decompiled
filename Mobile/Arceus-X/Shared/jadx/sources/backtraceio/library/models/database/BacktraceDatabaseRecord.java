package backtraceio.library.models.database;

import android.content.Context;
import backtraceio.library.common.BacktraceSerializeHelper;
import backtraceio.library.common.BacktraceStringHelper;
import backtraceio.library.common.FileHelper;
import backtraceio.library.interfaces.DatabaseRecordWriter;
import backtraceio.library.logger.BacktraceLogger;
import backtraceio.library.models.BacktraceData;
import backtraceio.library.models.json.BacktraceReport;
import com.google.gson.annotations.SerializedName;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class BacktraceDatabaseRecord {
    private static final transient String LOG_TAG = "BacktraceDatabaseRecord";

    @SerializedName("DataPath")
    private String diagnosticDataPath;

    /* JADX INFO: renamed from: id */
    @SerializedName("Id")
    public UUID f5328id;
    public transient boolean locked;
    private final transient String path;
    private transient BacktraceData record;

    @SerializedName("RecordName")
    private String recordPath;
    private final transient DatabaseRecordWriter recordWriter;

    @SerializedName("ReportPath")
    private String reportPath;

    @SerializedName("Size")
    private long size;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BacktraceDatabaseRecord(BacktraceData backtraceData, String str) {
        this.locked = false;
        this.f5328id = UUID.fromString(backtraceData.getUuid());
        this.record = backtraceData;
        this.path = str;
        this.recordWriter = new BacktraceDatabaseRecordWriter(str);
    }

    public static BacktraceDatabaseRecord readFromFile(File file) {
        String str = LOG_TAG;
        BacktraceLogger.m7080d(str, "Reading JSON from passed file");
        String file2 = FileHelper.readFile(file);
        if (!BacktraceStringHelper.isNullOrEmpty(file2)) {
            return (BacktraceDatabaseRecord) BacktraceSerializeHelper.fromJson(file2, BacktraceDatabaseRecord.class);
        }
        BacktraceLogger.m7083w(str, "JSON from passed file is null or empty");
        return null;
    }

    public boolean close() {
        String str = LOG_TAG;
        BacktraceLogger.m7080d(str, "Trying unlock database record");
        try {
            this.locked = false;
            this.record = null;
            BacktraceLogger.m7080d(str, "Record unlocked");
            return true;
        } catch (Exception unused) {
            BacktraceLogger.m7081e(LOG_TAG, "Can not unlock record");
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void delete() {
        BacktraceLogger.m7080d(LOG_TAG, "Trying delete files from database");
        delete(this.reportPath);
        delete(this.diagnosticDataPath);
        delete(this.recordPath);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public BacktraceData getBacktraceData(Context context) {
        return getBacktraceData();
    }

    public String getDiagnosticDataPath() {
        return this.diagnosticDataPath;
    }

    public String getRecordPath() {
        return this.recordPath;
    }

    public String getReportPath() {
        return this.reportPath;
    }

    public long getSize() {
        return this.size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean save() {
        try {
            String str = LOG_TAG;
            BacktraceLogger.m7080d(str, "Trying saving data to internal app storage");
            this.diagnosticDataPath = save(this.record, String.format("%s-attachment", this.f5328id));
            this.reportPath = save(this.record.getReport(), String.format("%s-report", this.f5328id));
            this.recordPath = new File(this.path, String.format("%s-record.json", this.f5328id)).getAbsolutePath();
            this.size += (long) BacktraceSerializeHelper.toJson(this).getBytes(StandardCharsets.UTF_8).length;
            this.recordWriter.write(this, String.format("%s-record", this.f5328id));
            BacktraceLogger.m7080d(str, "Saving data to internal app storage successful");
            return true;
        } catch (Exception e10) {
            BacktraceLogger.m7082e(LOG_TAG, "Received IOException while saving data to database", e10);
            return false;
        }
    }

    public boolean valid() {
        return FileHelper.isFileExists(this.diagnosticDataPath) && FileHelper.isFileExists(this.reportPath);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public BacktraceData getBacktraceData() {
        BacktraceData backtraceData = this.record;
        if (backtraceData != null) {
            return backtraceData;
        }
        if (!valid()) {
            BacktraceLogger.m7083w(LOG_TAG, "Database record is invalid");
            return null;
        }
        String file = FileHelper.readFile(new File(this.diagnosticDataPath));
        String file2 = FileHelper.readFile(new File(this.reportPath));
        try {
            BacktraceLogger.m7080d(LOG_TAG, "Deserialization diagnostic data");
            BacktraceData backtraceData2 = (BacktraceData) BacktraceSerializeHelper.fromJson(file, BacktraceData.class);
            backtraceData2.report = (BacktraceReport) BacktraceSerializeHelper.fromJson(file2, BacktraceReport.class);
            return backtraceData2;
        } catch (Exception e10) {
            BacktraceLogger.m7082e(LOG_TAG, "Exception occurs on deserialization of diagnostic data", e10);
            return null;
        }
    }

    private void delete(String str) {
        try {
            if (FileHelper.isFileExists(str)) {
                BacktraceLogger.m7080d(LOG_TAG, "Passed path exist, trying delete file on database record");
                new File(str).delete();
            }
        } catch (Exception e10) {
            BacktraceLogger.m7082e(LOG_TAG, String.format("Cannot delete file: %s", str), e10);
        }
    }

    public BacktraceDatabaseRecord(String str, String str2, String str3, String str4, String str5, long j10) {
        this.locked = false;
        this.f5328id = UUID.fromString(str);
        this.recordPath = str3;
        this.diagnosticDataPath = str4;
        this.reportPath = str5;
        this.path = str2;
        this.size = j10;
        this.recordWriter = new BacktraceDatabaseRecordWriter(str2);
        this.record = getBacktraceData();
    }

    private String save(Object obj, String str) {
        try {
            if (obj == null) {
                BacktraceLogger.m7083w(LOG_TAG, "Passed data parameter is null");
                return "";
            }
            byte[] bytes = BacktraceSerializeHelper.toJson(obj).getBytes(StandardCharsets.UTF_8);
            this.size += (long) bytes.length;
            return this.recordWriter.write(bytes, str);
        } catch (Exception e10) {
            BacktraceLogger.m7082e(LOG_TAG, "Received IOException while saving data to database", e10);
            return "";
        }
    }
}
