.class public Lbacktraceio/library/services/ReportExceptionTransformer;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final errorIdAttribute:Ljava/lang/String; = "error.id"

.field public static final errorParentIdAttribute:Ljava/lang/String; = "error.parent"

.field public static final errorTraceAttribute:Ljava/lang/String; = "error.trace"


# instance fields
.field private sendInnerExceptions:Z

.field private sendSuppressedExceptions:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lbacktraceio/library/services/ReportExceptionTransformer;->sendSuppressedExceptions:Z

    iput-boolean v0, p0, Lbacktraceio/library/services/ReportExceptionTransformer;->sendInnerExceptions:Z

    return-void
.end method

.method private extendReportWithNestedExceptionAttributes(Lbacktraceio/library/models/json/BacktraceReport;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p1, Lbacktraceio/library/models/json/BacktraceReport;->attributes:Ljava/util/Map;

    const-string v1, "error.trace"

    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p1, Lbacktraceio/library/models/json/BacktraceReport;->attributes:Ljava/util/Map;

    iget-object v0, p1, Lbacktraceio/library/models/json/BacktraceReport;->uuid:Ljava/util/UUID;

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "error.id"

    invoke-interface {p2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p1, Lbacktraceio/library/models/json/BacktraceReport;->attributes:Ljava/util/Map;

    const-string p2, "error.parent"

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private getSuppressedReports(Ljava/lang/Throwable;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lbacktraceio/library/models/json/BacktraceReport;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-boolean v1, p0, Lbacktraceio/library/services/ReportExceptionTransformer;->sendSuppressedExceptions:Z

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getSuppressed()[Ljava/lang/Throwable;

    move-result-object p1

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p1, v2

    new-instance v4, Lbacktraceio/library/models/json/BacktraceReport;

    invoke-direct {v4, v3, p2}, Lbacktraceio/library/models/json/BacktraceReport;-><init>(Ljava/lang/Throwable;Ljava/util/Map;)V

    invoke-direct {p0, v4, p3, p4}, Lbacktraceio/library/services/ReportExceptionTransformer;->extendReportWithNestedExceptionAttributes(Lbacktraceio/library/models/json/BacktraceReport;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-object v0
.end method


# virtual methods
.method public sendInnerExceptions(Z)V
    .locals 0

    iput-boolean p1, p0, Lbacktraceio/library/services/ReportExceptionTransformer;->sendInnerExceptions:Z

    return-void
.end method

.method public sendSuppressedExceptions(Z)V
    .locals 0

    iput-boolean p1, p0, Lbacktraceio/library/services/ReportExceptionTransformer;->sendSuppressedExceptions:Z

    return-void
.end method

.method public transformReportWithInnerExceptions(Lbacktraceio/library/models/json/BacktraceReport;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbacktraceio/library/models/json/BacktraceReport;",
            ")",
            "Ljava/util/List<",
            "Lbacktraceio/library/models/json/BacktraceReport;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p1, Lbacktraceio/library/models/json/BacktraceReport;->exceptionTypeReport:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lbacktraceio/library/models/json/BacktraceReport;->getException()Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {p0, p1, v2, v3}, Lbacktraceio/library/services/ReportExceptionTransformer;->extendReportWithNestedExceptionAttributes(Lbacktraceio/library/models/json/BacktraceReport;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, p1, Lbacktraceio/library/models/json/BacktraceReport;->uuid:Ljava/util/UUID;

    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object p1, p1, Lbacktraceio/library/models/json/BacktraceReport;->attributes:Ljava/util/Map;

    invoke-direct {p0, v1, p1, v2, v3}, Lbacktraceio/library/services/ReportExceptionTransformer;->getSuppressedReports(Ljava/lang/Throwable;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-boolean v4, p0, Lbacktraceio/library/services/ReportExceptionTransformer;->sendInnerExceptions:Z

    if-nez v4, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_4

    new-instance v4, Lbacktraceio/library/models/json/BacktraceReport;

    invoke-direct {v4, v1, p1}, Lbacktraceio/library/models/json/BacktraceReport;-><init>(Ljava/lang/Throwable;Ljava/util/Map;)V

    invoke-direct {p0, v4, v2, v3}, Lbacktraceio/library/services/ReportExceptionTransformer;->extendReportWithNestedExceptionAttributes(Lbacktraceio/library/models/json/BacktraceReport;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v3, v4, Lbacktraceio/library/models/json/BacktraceReport;->uuid:Ljava/util/UUID;

    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v1, p1, v2, v3}, Lbacktraceio/library/services/ReportExceptionTransformer;->getSuppressedReports(Ljava/lang/Throwable;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    goto :goto_0

    :cond_4
    :goto_1
    return-object v0
.end method
