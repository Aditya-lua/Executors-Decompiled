.class public Lbacktraceio/library/models/database/BacktraceDatabaseSettings;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private _maxDatabaseSize:J

.field private autoSendMode:Z

.field private databasePath:Ljava/lang/String;

.field private maxRecordCount:I

.field private retryBehavior:Lbacktraceio/library/enums/database/RetryBehavior;

.field private retryInterval:I

.field private retryLimit:I

.field private retryOrder:Lbacktraceio/library/enums/database/RetryOrder;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Lbacktraceio/library/enums/database/RetryOrder;->Queue:Lbacktraceio/library/enums/database/RetryOrder;

    invoke-direct {p0, p1, v0}, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;-><init>(Ljava/lang/String;Lbacktraceio/library/enums/database/RetryOrder;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lbacktraceio/library/enums/database/RetryOrder;)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->maxRecordCount:I

    const-wide/16 v1, 0x0

    .line 4
    iput-wide v1, p0, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->_maxDatabaseSize:J

    .line 5
    iput-boolean v0, p0, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->autoSendMode:Z

    .line 6
    sget-object v0, Lbacktraceio/library/enums/database/RetryBehavior;->ByInterval:Lbacktraceio/library/enums/database/RetryBehavior;

    iput-object v0, p0, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->retryBehavior:Lbacktraceio/library/enums/database/RetryBehavior;

    const/4 v0, 0x5

    .line 7
    iput v0, p0, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->retryInterval:I

    const/4 v0, 0x3

    .line 8
    iput v0, p0, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->retryLimit:I

    .line 9
    sget-object v0, Lbacktraceio/library/enums/database/RetryOrder;->Stack:Lbacktraceio/library/enums/database/RetryOrder;

    .line 10
    iput-object p1, p0, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->databasePath:Ljava/lang/String;

    .line 11
    iput-object p2, p0, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->retryOrder:Lbacktraceio/library/enums/database/RetryOrder;

    return-void
.end method


# virtual methods
.method public getDatabasePath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->databasePath:Ljava/lang/String;

    return-object v0
.end method

.method public getMaxDatabaseSize()J
    .locals 4

    iget-wide v0, p0, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->_maxDatabaseSize:J

    const-wide/32 v2, 0xf4240

    mul-long/2addr v0, v2

    return-wide v0
.end method

.method public getMaxRecordCount()I
    .locals 1

    iget v0, p0, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->maxRecordCount:I

    return v0
.end method

.method public getRetryBehavior()Lbacktraceio/library/enums/database/RetryBehavior;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->retryBehavior:Lbacktraceio/library/enums/database/RetryBehavior;

    return-object v0
.end method

.method public getRetryInterval()I
    .locals 1

    iget v0, p0, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->retryInterval:I

    return v0
.end method

.method public getRetryLimit()I
    .locals 1

    iget v0, p0, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->retryLimit:I

    return v0
.end method

.method public getRetryOrder()Lbacktraceio/library/enums/database/RetryOrder;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->retryOrder:Lbacktraceio/library/enums/database/RetryOrder;

    return-object v0
.end method

.method public isAutoSendMode()Z
    .locals 1

    iget-boolean v0, p0, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->autoSendMode:Z

    return v0
.end method

.method public setAutoSendMode(Z)V
    .locals 0

    iput-boolean p1, p0, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->autoSendMode:Z

    return-void
.end method

.method public setDatabasePath(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->databasePath:Ljava/lang/String;

    return-void
.end method

.method public setMaxDatabaseSize(J)V
    .locals 0

    iput-wide p1, p0, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->_maxDatabaseSize:J

    return-void
.end method

.method public setMaxRecordCount(I)V
    .locals 0

    iput p1, p0, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->maxRecordCount:I

    return-void
.end method

.method public setRetryBehavior(Lbacktraceio/library/enums/database/RetryBehavior;)V
    .locals 0

    iput-object p1, p0, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->retryBehavior:Lbacktraceio/library/enums/database/RetryBehavior;

    return-void
.end method

.method public setRetryInterval(I)V
    .locals 1

    if-lez p1, :cond_0

    iput p1, p0, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->retryInterval:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Retry interval value must be grader than zero"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setRetryLimit(I)V
    .locals 1

    iget v0, p0, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->retryInterval:I

    if-lez v0, :cond_0

    iput p1, p0, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->retryLimit:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Retry limit value must be grader than zero"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setRetryOrder(Lbacktraceio/library/enums/database/RetryOrder;)V
    .locals 0

    iput-object p1, p0, Lbacktraceio/library/models/database/BacktraceDatabaseSettings;->retryOrder:Lbacktraceio/library/enums/database/RetryOrder;

    return-void
.end method
