.class public Lbacktraceio/library/breadcrumbs/BacktraceBreadcrumbsLogManager;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final LOG_TAG:Ljava/lang/String;

.field private final backtraceQueueFileHelper:Lbacktraceio/library/breadcrumbs/BacktraceQueueFileHelper;

.field private breadcrumbId:J

.field private final maxAttributeSizeBytes:I

.field private final maxMessageSizeBytes:I


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Lbacktraceio/library/breadcrumbs/BacktraceBreadcrumbsLogManager;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lbacktraceio/library/breadcrumbs/BacktraceBreadcrumbsLogManager;->LOG_TAG:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lbacktraceio/library/breadcrumbs/BacktraceBreadcrumbsLogManager;->breadcrumbId:J

    const/16 v0, 0x400

    iput v0, p0, Lbacktraceio/library/breadcrumbs/BacktraceBreadcrumbsLogManager;->maxMessageSizeBytes:I

    iput v0, p0, Lbacktraceio/library/breadcrumbs/BacktraceBreadcrumbsLogManager;->maxAttributeSizeBytes:I

    new-instance v0, Lbacktraceio/library/breadcrumbs/BacktraceQueueFileHelper;

    invoke-direct {v0, p1, p2}, Lbacktraceio/library/breadcrumbs/BacktraceQueueFileHelper;-><init>(Ljava/lang/String;I)V

    iput-object v0, p0, Lbacktraceio/library/breadcrumbs/BacktraceBreadcrumbsLogManager;->backtraceQueueFileHelper:Lbacktraceio/library/breadcrumbs/BacktraceQueueFileHelper;

    return-void
.end method


# virtual methods
.method public addBreadcrumb(Ljava/lang/String;Ljava/util/Map;Lbacktraceio/library/enums/BacktraceBreadcrumbType;Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;)Z
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lbacktraceio/library/enums/BacktraceBreadcrumbType;",
            "Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;",
            ")Z"
        }
    .end annotation

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0x400

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    const/4 v4, 0x0

    invoke-virtual {p1, v4, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v5, "timestamp"

    invoke-virtual {v2, v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v0, "id"

    iget-wide v5, p0, Lbacktraceio/library/breadcrumbs/BacktraceBreadcrumbsLogManager;->breadcrumbId:J

    const-wide/16 v7, 0x1

    add-long/2addr v7, v5

    iput-wide v7, p0, Lbacktraceio/library/breadcrumbs/BacktraceBreadcrumbsLogManager;->breadcrumbId:J

    invoke-virtual {v2, v0, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v0, "level"

    invoke-virtual {p4}, Lbacktraceio/library/enums/BacktraceBreadcrumbLevel;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {v2, v0, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p4, "type"

    invoke-virtual {p3}, Lbacktraceio/library/enums/BacktraceBreadcrumbType;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v2, p4, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p3, "message"

    invoke-virtual {v2, p3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    if-eqz p2, :cond_2

    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    move p3, v4

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/util/Map$Entry;

    invoke-interface {p4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-interface {p4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    add-int/2addr p3, v0

    if-ge p3, v3, :cond_0

    invoke-interface {p4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p4

    invoke-virtual {p1, v0, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lorg/json/JSONObject;->length()I

    move-result p2

    if-lez p2, :cond_2

    const-string p2, "attributes"

    invoke-virtual {v2, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "\n"

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p3

    const-string p4, "\\n"

    const-string v0, ""

    invoke-virtual {p3, p4, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Lbacktraceio/library/breadcrumbs/BacktraceBreadcrumbsLogManager;->backtraceQueueFileHelper:Lbacktraceio/library/breadcrumbs/BacktraceQueueFileHelper;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    invoke-virtual {p2, p1}, Lbacktraceio/library/breadcrumbs/BacktraceQueueFileHelper;->add([B)Z

    move-result p1

    return p1

    :catch_0
    iget-object p1, p0, Lbacktraceio/library/breadcrumbs/BacktraceBreadcrumbsLogManager;->LOG_TAG:Ljava/lang/String;

    const-string p2, "Could not create the breadcrumb JSON"

    invoke-static {p1, p2}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v4
.end method

.method public clear()Z
    .locals 3

    iget-object v0, p0, Lbacktraceio/library/breadcrumbs/BacktraceBreadcrumbsLogManager;->backtraceQueueFileHelper:Lbacktraceio/library/breadcrumbs/BacktraceQueueFileHelper;

    invoke-virtual {v0}, Lbacktraceio/library/breadcrumbs/BacktraceQueueFileHelper;->clear()Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lbacktraceio/library/breadcrumbs/BacktraceBreadcrumbsLogManager;->breadcrumbId:J

    :cond_0
    return v0
.end method

.method public getCurrentBreadcrumbId()J
    .locals 2

    iget-wide v0, p0, Lbacktraceio/library/breadcrumbs/BacktraceBreadcrumbsLogManager;->breadcrumbId:J

    return-wide v0
.end method

.method public setCurrentBreadcrumbId(J)V
    .locals 0

    iput-wide p1, p0, Lbacktraceio/library/breadcrumbs/BacktraceBreadcrumbsLogManager;->breadcrumbId:J

    return-void
.end method
