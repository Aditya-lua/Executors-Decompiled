.class public Lbacktraceio/library/models/database/BacktraceDatabaseRecord;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final transient LOG_TAG:Ljava/lang/String; = "BacktraceDatabaseRecord"


# instance fields
.field private diagnosticDataPath:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "DataPath"
    .end annotation
.end field

.field public id:Ljava/util/UUID;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "Id"
    .end annotation
.end field

.field public transient locked:Z

.field private final transient path:Ljava/lang/String;

.field private transient record:Lbacktraceio/library/models/BacktraceData;

.field private recordPath:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "RecordName"
    .end annotation
.end field

.field private final transient recordWriter:Lbacktraceio/library/interfaces/DatabaseRecordWriter;

.field private reportPath:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "ReportPath"
    .end annotation
.end field

.field private size:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "Size"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lbacktraceio/library/models/BacktraceData;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->locked:Z

    .line 3
    invoke-virtual {p1}, Lbacktraceio/library/models/BacktraceData;->getUuid()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    iput-object v0, p0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->id:Ljava/util/UUID;

    .line 4
    iput-object p1, p0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->record:Lbacktraceio/library/models/BacktraceData;

    .line 5
    iput-object p2, p0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->path:Ljava/lang/String;

    .line 6
    new-instance p1, Lbacktraceio/library/models/database/BacktraceDatabaseRecordWriter;

    invoke-direct {p1, p2}, Lbacktraceio/library/models/database/BacktraceDatabaseRecordWriter;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->recordWriter:Lbacktraceio/library/interfaces/DatabaseRecordWriter;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->locked:Z

    .line 9
    invoke-static {p1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object p1

    iput-object p1, p0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->id:Ljava/util/UUID;

    .line 10
    iput-object p3, p0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->recordPath:Ljava/lang/String;

    .line 11
    iput-object p4, p0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->diagnosticDataPath:Ljava/lang/String;

    .line 12
    iput-object p5, p0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->reportPath:Ljava/lang/String;

    .line 13
    iput-object p2, p0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->path:Ljava/lang/String;

    .line 14
    iput-wide p6, p0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->size:J

    .line 15
    new-instance p1, Lbacktraceio/library/models/database/BacktraceDatabaseRecordWriter;

    invoke-direct {p1, p2}, Lbacktraceio/library/models/database/BacktraceDatabaseRecordWriter;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->recordWriter:Lbacktraceio/library/interfaces/DatabaseRecordWriter;

    .line 16
    invoke-virtual {p0}, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->getBacktraceData()Lbacktraceio/library/models/BacktraceData;

    move-result-object p1

    iput-object p1, p0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->record:Lbacktraceio/library/models/BacktraceData;

    return-void
.end method

.method private delete(Ljava/lang/String;)V
    .locals 3

    .line 5
    :try_start_0
    invoke-static {p1}, Lbacktraceio/library/common/FileHelper;->isFileExists(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6
    sget-object v0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->LOG_TAG:Ljava/lang/String;

    const-string v1, "Passed path exist, trying delete file on database record"

    invoke-static {v0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->delete()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_0
    return-void

    .line 8
    :goto_0
    sget-object v1, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->LOG_TAG:Ljava/lang/String;

    const-string v2, "Cannot delete file: %s"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1, v0}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method

.method public static readFromFile(Ljava/io/File;)Lbacktraceio/library/models/database/BacktraceDatabaseRecord;
    .locals 2

    sget-object v0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->LOG_TAG:Ljava/lang/String;

    const-string v1, "Reading JSON from passed file"

    invoke-static {v0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p0}, Lbacktraceio/library/common/FileHelper;->readFile(Ljava/io/File;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lbacktraceio/library/common/BacktraceStringHelper;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string p0, "JSON from passed file is null or empty"

    invoke-static {v0, p0}, Lbacktraceio/library/logger/BacktraceLogger;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-class v0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;

    invoke-static {p0, v0}, Lbacktraceio/library/common/BacktraceSerializeHelper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;

    return-object p0
.end method

.method private save(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 12
    const-string v0, ""

    if-nez p1, :cond_0

    .line 13
    :try_start_0
    sget-object p1, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->LOG_TAG:Ljava/lang/String;

    const-string p2, "Passed data parameter is null"

    invoke-static {p1, p2}, Lbacktraceio/library/logger/BacktraceLogger;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-object v0

    :catch_0
    move-exception p1

    goto :goto_0

    .line 14
    :cond_0
    invoke-static {p1}, Lbacktraceio/library/common/BacktraceSerializeHelper;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 15
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    .line 16
    iget-wide v1, p0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->size:J

    array-length v3, p1

    int-to-long v3, v3

    add-long/2addr v1, v3

    iput-wide v1, p0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->size:J

    .line 17
    iget-object v1, p0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->recordWriter:Lbacktraceio/library/interfaces/DatabaseRecordWriter;

    invoke-interface {v1, p1, p2}, Lbacktraceio/library/interfaces/DatabaseRecordWriter;->write([BLjava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 18
    :goto_0
    sget-object p2, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->LOG_TAG:Ljava/lang/String;

    const-string v1, "Received IOException while saving data to database"

    invoke-static {p2, v1, p1}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-object v0
.end method


# virtual methods
.method public close()Z
    .locals 3

    sget-object v0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->LOG_TAG:Ljava/lang/String;

    const-string v1, "Trying unlock database record"

    invoke-static {v0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v1, 0x0

    :try_start_0
    iput-boolean v1, p0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->locked:Z

    const/4 v2, 0x0

    iput-object v2, p0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->record:Lbacktraceio/library/models/BacktraceData;

    const-string v2, "Record unlocked"

    invoke-static {v0, v2}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    sget-object v0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->LOG_TAG:Ljava/lang/String;

    const-string v2, "Can not unlock record"

    invoke-static {v0, v2}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v1
.end method

.method public delete()V
    .locals 2

    .line 1
    sget-object v0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->LOG_TAG:Ljava/lang/String;

    const-string v1, "Trying delete files from database"

    invoke-static {v0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->reportPath:Ljava/lang/String;

    invoke-direct {p0, v0}, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->delete(Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->diagnosticDataPath:Ljava/lang/String;

    invoke-direct {p0, v0}, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->delete(Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->recordPath:Ljava/lang/String;

    invoke-direct {p0, v0}, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->delete(Ljava/lang/String;)V

    return-void
.end method

.method public getBacktraceData()Lbacktraceio/library/models/BacktraceData;
    .locals 5

    .line 2
    iget-object v0, p0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->record:Lbacktraceio/library/models/BacktraceData;

    if-eqz v0, :cond_0

    return-object v0

    .line 3
    :cond_0
    invoke-virtual {p0}, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->valid()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    .line 4
    sget-object v0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->LOG_TAG:Ljava/lang/String;

    const-string v2, "Database record is invalid"

    invoke-static {v0, v2}, Lbacktraceio/library/logger/BacktraceLogger;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1

    .line 5
    :cond_1
    new-instance v0, Ljava/io/File;

    iget-object v2, p0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->diagnosticDataPath:Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lbacktraceio/library/common/FileHelper;->readFile(Ljava/io/File;)Ljava/lang/String;

    move-result-object v0

    .line 6
    new-instance v2, Ljava/io/File;

    iget-object v3, p0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->reportPath:Ljava/lang/String;

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Lbacktraceio/library/common/FileHelper;->readFile(Ljava/io/File;)Ljava/lang/String;

    move-result-object v2

    .line 7
    :try_start_0
    sget-object v3, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->LOG_TAG:Ljava/lang/String;

    const-string v4, "Deserialization diagnostic data"

    invoke-static {v3, v4}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    const-class v3, Lbacktraceio/library/models/BacktraceData;

    invoke-static {v0, v3}, Lbacktraceio/library/common/BacktraceSerializeHelper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbacktraceio/library/models/BacktraceData;

    .line 9
    const-class v3, Lbacktraceio/library/models/json/BacktraceReport;

    invoke-static {v2, v3}, Lbacktraceio/library/common/BacktraceSerializeHelper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbacktraceio/library/models/json/BacktraceReport;

    iput-object v2, v0, Lbacktraceio/library/models/BacktraceData;->report:Lbacktraceio/library/models/json/BacktraceReport;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 10
    sget-object v2, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->LOG_TAG:Ljava/lang/String;

    const-string v3, "Exception occurs on deserialization of diagnostic data"

    invoke-static {v2, v3, v0}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-object v1
.end method

.method public getBacktraceData(Landroid/content/Context;)Lbacktraceio/library/models/BacktraceData;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->getBacktraceData()Lbacktraceio/library/models/BacktraceData;

    move-result-object p1

    return-object p1
.end method

.method public getDiagnosticDataPath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->diagnosticDataPath:Ljava/lang/String;

    return-object v0
.end method

.method public getRecordPath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->recordPath:Ljava/lang/String;

    return-object v0
.end method

.method public getReportPath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->reportPath:Ljava/lang/String;

    return-object v0
.end method

.method public getSize()J
    .locals 2

    iget-wide v0, p0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->size:J

    return-wide v0
.end method

.method public save()Z
    .locals 6

    .line 1
    :try_start_0
    sget-object v0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->LOG_TAG:Ljava/lang/String;

    const-string v1, "Trying saving data to internal app storage"

    invoke-static {v0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v1, p0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->record:Lbacktraceio/library/models/BacktraceData;

    const-string v2, "%s-attachment"

    iget-object v3, p0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->id:Ljava/util/UUID;

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v1, v2}, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->save(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->diagnosticDataPath:Ljava/lang/String;

    .line 3
    iget-object v1, p0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->record:Lbacktraceio/library/models/BacktraceData;

    invoke-virtual {v1}, Lbacktraceio/library/models/BacktraceData;->getReport()Lbacktraceio/library/models/json/BacktraceReport;

    move-result-object v1

    const-string v2, "%s-report"

    iget-object v3, p0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->id:Ljava/util/UUID;

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v1, v2}, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->save(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->reportPath:Ljava/lang/String;

    .line 4
    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->path:Ljava/lang/String;

    const-string v3, "%s-record.json"

    iget-object v4, p0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->id:Ljava/util/UUID;

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    .line 5
    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->recordPath:Ljava/lang/String;

    .line 6
    invoke-static {p0}, Lbacktraceio/library/common/BacktraceSerializeHelper;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 7
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    .line 8
    iget-wide v2, p0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->size:J

    array-length v1, v1

    int-to-long v4, v1

    add-long/2addr v2, v4

    iput-wide v2, p0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->size:J

    .line 9
    iget-object v1, p0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->recordWriter:Lbacktraceio/library/interfaces/DatabaseRecordWriter;

    const-string v2, "%s-record"

    iget-object v3, p0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->id:Ljava/util/UUID;

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, p0, v2}, Lbacktraceio/library/interfaces/DatabaseRecordWriter;->write(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    const-string v1, "Saving data to internal app storage successful"

    invoke-static {v0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    move-exception v0

    .line 11
    sget-object v1, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->LOG_TAG:Ljava/lang/String;

    const-string v2, "Received IOException while saving data to database"

    invoke-static {v1, v2, v0}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 v0, 0x0

    return v0
.end method

.method public valid()Z
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->diagnosticDataPath:Ljava/lang/String;

    invoke-static {v0}, Lbacktraceio/library/common/FileHelper;->isFileExists(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->reportPath:Ljava/lang/String;

    invoke-static {v0}, Lbacktraceio/library/common/FileHelper;->isFileExists(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
