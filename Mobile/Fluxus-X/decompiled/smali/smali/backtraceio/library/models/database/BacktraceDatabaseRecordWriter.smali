.class public Lbacktraceio/library/models/database/BacktraceDatabaseRecordWriter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbacktraceio/library/interfaces/DatabaseRecordWriter;


# static fields
.field private static final transient LOG_TAG:Ljava/lang/String; = "BacktraceDatabaseRecordWriter"


# instance fields
.field private final _destinationPath:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbacktraceio/library/models/database/BacktraceDatabaseRecordWriter;->_destinationPath:Ljava/lang/String;

    return-void
.end method

.method private saveTemporaryFile(Ljava/lang/String;[B)V
    .locals 2

    sget-object v0, Lbacktraceio/library/models/database/BacktraceDatabaseRecordWriter;->LOG_TAG:Ljava/lang/String;

    const-string v1, "Saving temporary file"

    invoke-static {v0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/io/FileOutputStream;->write([B)V

    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V

    return-void
.end method

.method private saveValidRecord(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lbacktraceio/library/models/database/BacktraceDatabaseRecordWriter;->LOG_TAG:Ljava/lang/String;

    const-string v1, "Can not rename file"

    invoke-static {v0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Ljava/io/IOException;

    const-string v1, "Can not rename file. Source path: %s, destination path: %s"

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private toJsonFile(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    if-nez p1, :cond_0

    sget-object p1, Lbacktraceio/library/models/database/BacktraceDatabaseRecordWriter;->LOG_TAG:Ljava/lang/String;

    const-string v0, "Passed object to serialization is null"

    invoke-static {p1, v0}, Lbacktraceio/library/logger/BacktraceLogger;->w(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, ""

    return-object p1

    :cond_0
    invoke-static {p1}, Lbacktraceio/library/common/BacktraceSerializeHelper;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public write(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lbacktraceio/library/models/database/BacktraceDatabaseRecordWriter;->toJsonFile(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 2
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    .line 3
    invoke-virtual {p0, p1, p2}, Lbacktraceio/library/models/database/BacktraceDatabaseRecordWriter;->write([BLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public write([BLjava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 4
    const-string v0, "%s.json"

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {v0, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    .line 5
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lbacktraceio/library/models/database/BacktraceDatabaseRecordWriter;->_destinationPath:Ljava/lang/String;

    const-string v2, "temp_%s"

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    .line 6
    invoke-direct {p0, v0, p1}, Lbacktraceio/library/models/database/BacktraceDatabaseRecordWriter;->saveTemporaryFile(Ljava/lang/String;[B)V

    .line 7
    new-instance p1, Ljava/io/File;

    iget-object v1, p0, Lbacktraceio/library/models/database/BacktraceDatabaseRecordWriter;->_destinationPath:Ljava/lang/String;

    invoke-direct {p1, v1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    .line 8
    invoke-direct {p0, v0, p1}, Lbacktraceio/library/models/database/BacktraceDatabaseRecordWriter;->saveValidRecord(Ljava/lang/String;Ljava/lang/String;)V

    return-object p1
.end method
