.class public Lbacktraceio/library/services/BacktraceDatabaseContext;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbacktraceio/library/interfaces/DatabaseContext;


# static fields
.field private static final transient LOG_TAG:Ljava/lang/String; = "BacktraceDatabaseContext"


# instance fields
.field private final _path:Ljava/lang/String;

.field private final _retryNumber:I

.field private final batchRetry:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/Queue<",
            "Lbacktraceio/library/models/database/BacktraceDatabaseRecord;",
            ">;>;"
        }
    .end annotation
.end field

.field private final retryOrder:Lbacktraceio/library/enums/database/RetryOrder;

.field private final totalRecords:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final totalSize:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lbacktraceio/library/models/database/BacktraceDatabaseSettings;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-direct {p0, p2}, Lbacktraceio/library/services/BacktraceDatabaseContext;-><init>(Lbacktraceio/library/models/database/BacktraceDatabaseSettings;)V

    return-void
.end method

.method public constructor <init>(Lbacktraceio/library/models/database/BacktraceDatabaseSettings;)V
    .locals 2

    .line 2
    invoke-virtual {p1}, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->getDatabasePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->getRetryLimit()I

    move-result v1

    invoke-virtual {p1}, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->getRetryOrder()Lbacktraceio/library/enums/database/RetryOrder;

    move-result-object p1

    invoke-direct {p0, v0, v1, p1}, Lbacktraceio/library/services/BacktraceDatabaseContext;-><init>(Ljava/lang/String;ILbacktraceio/library/enums/database/RetryOrder;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILbacktraceio/library/enums/database/RetryOrder;)V
    .locals 3

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->batchRetry:Ljava/util/Map;

    .line 5
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v0, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->totalSize:Ljava/util/concurrent/atomic/AtomicLong;

    .line 6
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->totalRecords:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 7
    iput-object p1, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->_path:Ljava/lang/String;

    .line 8
    iput p2, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->_retryNumber:I

    .line 9
    iput-object p3, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->retryOrder:Lbacktraceio/library/enums/database/RetryOrder;

    .line 10
    invoke-direct {p0}, Lbacktraceio/library/services/BacktraceDatabaseContext;->setupBatch()V

    return-void
.end method

.method private addToFirstBatch(Lbacktraceio/library/models/database/BacktraceDatabaseRecord;)V
    .locals 3

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->batchRetry:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->batchRetry:Ljava/util/Map;

    new-instance v2, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v1, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->batchRetry:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Queue;

    if-nez v1, :cond_1

    new-instance v1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iget-object v2, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->batchRetry:Ljava/util/Map;

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-interface {v1, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private getFirstRecord()Lbacktraceio/library/models/database/BacktraceDatabaseRecord;
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lbacktraceio/library/services/BacktraceDatabaseContext;->getRecordFromCache(Z)Lbacktraceio/library/models/database/BacktraceDatabaseRecord;

    move-result-object v0

    return-object v0
.end method

.method private getLastRecord()Lbacktraceio/library/models/database/BacktraceDatabaseRecord;
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lbacktraceio/library/services/BacktraceDatabaseContext;->getRecordFromCache(Z)Lbacktraceio/library/models/database/BacktraceDatabaseRecord;

    move-result-object v0

    return-object v0
.end method

.method private getRecordFromCache(Z)Lbacktraceio/library/models/database/BacktraceDatabaseRecord;
    .locals 5

    iget v0, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->_retryNumber:I

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    :goto_0
    if-ltz v0, :cond_4

    iget-object v2, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->batchRetry:Ljava/util/Map;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Queue;

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    if-eqz p1, :cond_1

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v3}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    move-object v2, v3

    :cond_1
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;

    if-eqz v3, :cond_2

    iget-boolean v4, v3, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->locked:Z

    if-nez v4, :cond_2

    iput-boolean v1, v3, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->locked:Z

    return-object v3

    :cond_3
    :goto_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_4
    const/4 p1, 0x0

    return-object p1
.end method

.method private incrementBatches()V
    .locals 5

    iget v0, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->_retryNumber:I

    add-int/lit8 v0, v0, -0x2

    :goto_0
    if-ltz v0, :cond_0

    iget-object v1, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->batchRetry:Ljava/util/Map;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Queue;

    iget-object v2, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->batchRetry:Ljava/util/Map;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v4, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v4}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->batchRetry:Ljava/util/Map;

    add-int/lit8 v3, v0, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private removeMaxRetries()V
    .locals 5

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->batchRetry:Ljava/util/Map;

    iget v1, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->_retryNumber:I

    add-int/lit8 v1, v1, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;

    invoke-virtual {v1}, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->valid()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->delete()V

    iget-object v2, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->totalRecords:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    iget-object v2, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->totalSize:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v1}, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->getSize()J

    move-result-wide v3

    neg-long v3, v3

    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    goto :goto_0

    :cond_1
    return-void
.end method

.method private setupBatch()V
    .locals 4

    iget v0, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->_retryNumber:I

    if-lez v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->_retryNumber:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->batchRetry:Ljava/util/Map;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-instance v3, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v3}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Retry number must be greater than 0!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public add(Lbacktraceio/library/models/BacktraceData;)Lbacktraceio/library/models/database/BacktraceDatabaseRecord;
    .locals 2

    .line 1
    sget-object v0, Lbacktraceio/library/services/BacktraceDatabaseContext;->LOG_TAG:Ljava/lang/String;

    const-string v1, "Adding new record to database context"

    invoke-static {v0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p1, :cond_0

    .line 2
    new-instance v0, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;

    iget-object v1, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->_path:Ljava/lang/String;

    invoke-direct {v0, p1, v1}, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;-><init>(Lbacktraceio/library/models/BacktraceData;Ljava/lang/String;)V

    .line 3
    invoke-virtual {v0}, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->save()Z

    .line 4
    invoke-virtual {p0, v0}, Lbacktraceio/library/services/BacktraceDatabaseContext;->add(Lbacktraceio/library/models/database/BacktraceDatabaseRecord;)Lbacktraceio/library/models/database/BacktraceDatabaseRecord;

    move-result-object p1

    return-object p1

    .line 5
    :cond_0
    const-string p1, "BacktraceData is null"

    invoke-static {v0, p1}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "BacktraceData"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public add(Lbacktraceio/library/models/database/BacktraceDatabaseRecord;)Lbacktraceio/library/models/database/BacktraceDatabaseRecord;
    .locals 3

    .line 7
    sget-object v0, Lbacktraceio/library/services/BacktraceDatabaseContext;->LOG_TAG:Ljava/lang/String;

    const-string v1, "Adding new record to database context"

    invoke-static {v0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p1, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->locked:Z

    .line 9
    iget-object v0, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->totalSize:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p1}, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->getSize()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    .line 10
    invoke-direct {p0, p1}, Lbacktraceio/library/services/BacktraceDatabaseContext;->addToFirstBatch(Lbacktraceio/library/models/database/BacktraceDatabaseRecord;)V

    .line 11
    iget-object v0, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->totalRecords:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    return-object p1

    .line 12
    :cond_0
    const-string p1, "Backtrace database record is null"

    invoke-static {v0, p1}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "BacktraceDatabaseRecord"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public clear()V
    .locals 3

    sget-object v0, Lbacktraceio/library/services/BacktraceDatabaseContext;->LOG_TAG:Ljava/lang/String;

    const-string v1, "Deleting all records from database context"

    invoke-static {v0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->batchRetry:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Queue;

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;

    invoke-virtual {v2}, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->delete()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->totalRecords:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->totalSize:Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->batchRetry:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Queue;

    invoke-interface {v1}, Ljava/util/Collection;->clear()V

    goto :goto_1

    :cond_2
    return-void
.end method

.method public contains(Lbacktraceio/library/models/database/BacktraceDatabaseRecord;)Z
    .locals 4

    if-eqz p1, :cond_3

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->batchRetry:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Queue;

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;

    if-eqz v2, :cond_1

    iget-object v2, v2, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->id:Ljava/util/UUID;

    iget-object v3, p1, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->id:Ljava/util/UUID;

    if-ne v2, v3, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1

    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "BacktraceDatabaseRecord"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public count()I
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->totalRecords:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    return v0
.end method

.method public delete(Lbacktraceio/library/models/database/BacktraceDatabaseRecord;)Z
    .locals 8

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->batchRetry:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    iget-object v3, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->batchRetry:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Queue;

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;

    if-eqz v3, :cond_3

    iget-object v4, p1, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->id:Ljava/util/UUID;

    iget-object v5, v3, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->id:Ljava/util/UUID;

    invoke-virtual {v4, v5}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {v3}, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->delete()V

    :try_start_0
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    iget-object v4, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->totalRecords:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    iget-object v4, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->totalSize:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v3}, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->getSize()J

    move-result-wide v5

    neg-long v5, v5

    invoke-virtual {v4, v5, v6}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    move-exception v4

    sget-object v5, Lbacktraceio/library/services/BacktraceDatabaseContext;->LOG_TAG:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Exception on removing record "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v3, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->id:Ljava/util/UUID;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " from db context: "

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v3}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :cond_5
    return v0
.end method

.method public first()Lbacktraceio/library/models/database/BacktraceDatabaseRecord;
    .locals 2

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->retryOrder:Lbacktraceio/library/enums/database/RetryOrder;

    sget-object v1, Lbacktraceio/library/enums/database/RetryOrder;->Queue:Lbacktraceio/library/enums/database/RetryOrder;

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, Lbacktraceio/library/services/BacktraceDatabaseContext;->getFirstRecord()Lbacktraceio/library/models/database/BacktraceDatabaseRecord;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-direct {p0}, Lbacktraceio/library/services/BacktraceDatabaseContext;->getLastRecord()Lbacktraceio/library/models/database/BacktraceDatabaseRecord;

    move-result-object v0

    return-object v0
.end method

.method public get()Ljava/lang/Iterable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Iterable<",
            "Lbacktraceio/library/models/database/BacktraceDatabaseRecord;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->batchRetry:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public getDatabaseSize()J
    .locals 2

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->totalSize:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    return-wide v0
.end method

.method public incrementBatchRetry()V
    .locals 0

    invoke-direct {p0}, Lbacktraceio/library/services/BacktraceDatabaseContext;->removeMaxRetries()V

    invoke-direct {p0}, Lbacktraceio/library/services/BacktraceDatabaseContext;->incrementBatches()V

    return-void
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->totalRecords:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public last()Lbacktraceio/library/models/database/BacktraceDatabaseRecord;
    .locals 2

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceDatabaseContext;->retryOrder:Lbacktraceio/library/enums/database/RetryOrder;

    sget-object v1, Lbacktraceio/library/enums/database/RetryOrder;->Queue:Lbacktraceio/library/enums/database/RetryOrder;

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, Lbacktraceio/library/services/BacktraceDatabaseContext;->getLastRecord()Lbacktraceio/library/models/database/BacktraceDatabaseRecord;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-direct {p0}, Lbacktraceio/library/services/BacktraceDatabaseContext;->getFirstRecord()Lbacktraceio/library/models/database/BacktraceDatabaseRecord;

    move-result-object v0

    return-object v0
.end method

.method public removeOldestRecord()Z
    .locals 2

    sget-object v0, Lbacktraceio/library/services/BacktraceDatabaseContext;->LOG_TAG:Ljava/lang/String;

    const-string v1, "Removing oldest record from database context"

    invoke-static {v0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lbacktraceio/library/services/BacktraceDatabaseContext;->first()Lbacktraceio/library/models/database/BacktraceDatabaseRecord;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, "Oldest record in database is null"

    invoke-static {v0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {p0, v1}, Lbacktraceio/library/services/BacktraceDatabaseContext;->delete(Lbacktraceio/library/models/database/BacktraceDatabaseRecord;)Z

    move-result v0

    return v0
.end method
