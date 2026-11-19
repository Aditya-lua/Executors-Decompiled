.class public Lbacktraceio/library/services/BacktraceDatabaseFileContext;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbacktraceio/library/interfaces/DatabaseFileContext;


# static fields
.field private static final transient LOG_TAG:Ljava/lang/String; = "BacktraceDatabaseFileContext"


# instance fields
.field private final _crashpadDatabasePathPrefix:Ljava/lang/String;

.field private final _databaseDirectory:Ljava/io/File;

.field private final _databasePath:Ljava/lang/String;

.field private final _maxDatabaseSize:J

.field private final _maxRecordNumber:I

.field private final recordFilterRegex:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;JI)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ".*-record.json"

    iput-object v0, p0, Lbacktraceio/library/services/BacktraceDatabaseFileContext;->recordFilterRegex:Ljava/lang/String;

    const-string v0, "crashpad"

    iput-object v0, p0, Lbacktraceio/library/services/BacktraceDatabaseFileContext;->_crashpadDatabasePathPrefix:Ljava/lang/String;

    iput-object p1, p0, Lbacktraceio/library/services/BacktraceDatabaseFileContext;->_databasePath:Ljava/lang/String;

    iput-wide p2, p0, Lbacktraceio/library/services/BacktraceDatabaseFileContext;->_maxDatabaseSize:J

    iput p4, p0, Lbacktraceio/library/services/BacktraceDatabaseFileContext;->_maxRecordNumber:I

    new-instance p2, Ljava/io/File;

    invoke-direct {p2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lbacktraceio/library/services/BacktraceDatabaseFileContext;->_databaseDirectory:Ljava/io/File;

    return-void
.end method

.method public static synthetic a(Ljava/util/regex/Pattern;Ljava/io/File;)Z
    .locals 0

    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public clear()V
    .locals 2

    sget-object v0, Lbacktraceio/library/services/BacktraceDatabaseFileContext;->LOG_TAG:Ljava/lang/String;

    const-string v1, "Removing all files from database file context"

    invoke-static {v0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lbacktraceio/library/services/BacktraceDatabaseFileContext;->getAll()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public getAll()Ljava/lang/Iterable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Iterable<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceDatabaseFileContext;->_databaseDirectory:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0

    :cond_0
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getRecords()Ljava/lang/Iterable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Iterable<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    sget-object v0, Lbacktraceio/library/services/BacktraceDatabaseFileContext;->LOG_TAG:Ljava/lang/String;

    const-string v1, "Getting files from file context"

    invoke-static {v0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, ".*-record.json"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    iget-object v1, p0, Lbacktraceio/library/services/BacktraceDatabaseFileContext;->_databaseDirectory:Ljava/io/File;

    new-instance v2, Lbacktraceio/library/services/a;

    invoke-direct {v2, v0}, Lbacktraceio/library/services/a;-><init>(Ljava/util/regex/Pattern;)V

    invoke-virtual {v1, v2}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0

    :cond_0
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public removeOrphaned(Ljava/lang/Iterable;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "Lbacktraceio/library/models/database/BacktraceDatabaseRecord;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lbacktraceio/library/services/BacktraceDatabaseFileContext;->LOG_TAG:Ljava/lang/String;

    const-string v1, "Removing orphaned files from file context"

    invoke-static {v0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;

    iget-object v1, v1, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->id:Ljava/util/UUID;

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lbacktraceio/library/services/BacktraceDatabaseFileContext;->getAll()Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "crashpad"

    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {v1}, Lbacktraceio/library/common/FileHelper;->getFileExtension(Ljava/io/File;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "json"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    sget-object v2, Lbacktraceio/library/services/BacktraceDatabaseFileContext;->LOG_TAG:Ljava/lang/String;

    const-string v3, "Deleting file - it is not a JSON file"

    invoke-static {v2, v3}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    goto :goto_1

    :cond_3
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x2d

    invoke-virtual {v2, v3}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_4

    sget-object v2, Lbacktraceio/library/services/BacktraceDatabaseFileContext;->LOG_TAG:Ljava/lang/String;

    const-string v3, "Deleting file - name is incorrect"

    invoke-static {v2, v3}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    goto :goto_1

    :cond_4
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v3, v4, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    sget-object v2, Lbacktraceio/library/services/BacktraceDatabaseFileContext;->LOG_TAG:Ljava/lang/String;

    const-string v3, "Deleting file - file id is not in existing collection"

    invoke-static {v2, v3}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    goto :goto_1

    :cond_5
    return-void
.end method

.method public validFileConsistency()Z
    .locals 12

    sget-object v0, Lbacktraceio/library/services/BacktraceDatabaseFileContext;->LOG_TAG:Ljava/lang/String;

    const-string v1, "Checking the consistency of files in file context"

    invoke-static {v0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lbacktraceio/library/services/BacktraceDatabaseFileContext;->getAll()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-wide/16 v1, 0x0

    move-wide v3, v1

    move-wide v5, v3

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/io/File;

    invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v8

    const-string v9, ".*-record.json"

    invoke-virtual {v8, v9}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v8

    const/4 v9, 0x0

    if-eqz v8, :cond_1

    const-wide/16 v10, 0x1

    add-long/2addr v3, v10

    iget v8, p0, Lbacktraceio/library/services/BacktraceDatabaseFileContext;->_maxRecordNumber:I

    if-eqz v8, :cond_1

    int-to-long v10, v8

    cmp-long v8, v10, v3

    if-gez v8, :cond_1

    sget-object v0, Lbacktraceio/library/services/BacktraceDatabaseFileContext;->LOG_TAG:Ljava/lang/String;

    const-string v1, "Total number of records is bigger than allowed"

    invoke-static {v0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v9

    :cond_1
    invoke-virtual {v7}, Ljava/io/File;->length()J

    move-result-wide v7

    add-long/2addr v5, v7

    iget-wide v7, p0, Lbacktraceio/library/services/BacktraceDatabaseFileContext;->_maxDatabaseSize:J

    cmp-long v10, v7, v1

    if-eqz v10, :cond_0

    cmp-long v7, v5, v7

    if-lez v7, :cond_0

    sget-object v0, Lbacktraceio/library/services/BacktraceDatabaseFileContext;->LOG_TAG:Ljava/lang/String;

    const-string v1, "Database size is bigger than allowed"

    invoke-static {v0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v9

    :cond_2
    const/4 v0, 0x1

    return v0
.end method
