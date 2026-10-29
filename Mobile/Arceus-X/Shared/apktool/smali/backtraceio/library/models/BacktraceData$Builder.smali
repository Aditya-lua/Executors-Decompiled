.class public Lbacktraceio/library/models/BacktraceData$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbacktraceio/library/models/BacktraceData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private agentVersion:Ljava/lang/String;

.field private annotations:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private attributes:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private classifiers:[Ljava/lang/String;

.field private langVersion:Ljava/lang/String;

.field private mainThread:Ljava/lang/String;

.field private final report:Lbacktraceio/library/models/json/BacktraceReport;

.field private sourceCode:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lbacktraceio/library/models/json/SourceCode;",
            ">;"
        }
    .end annotation
.end field

.field private symbolication:Ljava/lang/String;

.field private threadInformationMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lbacktraceio/library/models/json/ThreadInformation;",
            ">;"
        }
    .end annotation
.end field

.field private timestamp:J

.field private uuid:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lbacktraceio/library/models/json/BacktraceReport;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lbacktraceio/library/models/BacktraceData$Builder;->symbolication:Ljava/lang/String;

    iput-object p1, p0, Lbacktraceio/library/models/BacktraceData$Builder;->report:Lbacktraceio/library/models/json/BacktraceReport;

    invoke-direct {p0, p1}, Lbacktraceio/library/models/BacktraceData$Builder;->setDefaultReportInformation(Lbacktraceio/library/models/json/BacktraceReport;)Lbacktraceio/library/models/BacktraceData$Builder;

    invoke-direct {p0}, Lbacktraceio/library/models/BacktraceData$Builder;->setDefaultThreadsInformation()Lbacktraceio/library/models/BacktraceData$Builder;

    return-void
.end method

.method private setAnnotations(Ljava/util/Map;)Lbacktraceio/library/models/BacktraceData$Builder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lbacktraceio/library/models/BacktraceData$Builder;"
        }
    .end annotation

    invoke-static {}, Lbacktraceio/library/models/BacktraceData;->access$000()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Setting annotations"

    invoke-static {v0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lbacktraceio/library/models/BacktraceData$Builder;->attributes:Ljava/util/Map;

    if-eqz v0, :cond_0

    const-string v1, "error.message"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbacktraceio/library/models/BacktraceData$Builder;->attributes:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0, p1}, Lbacktraceio/library/models/json/Annotations;->getAnnotations(Ljava/lang/Object;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lbacktraceio/library/models/BacktraceData$Builder;->annotations:Ljava/util/Map;

    return-object p0
.end method

.method private setDefaultReportInformation(Lbacktraceio/library/models/json/BacktraceReport;)Lbacktraceio/library/models/BacktraceData$Builder;
    .locals 2

    iget-object v0, p1, Lbacktraceio/library/models/json/BacktraceReport;->uuid:Ljava/util/UUID;

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lbacktraceio/library/models/BacktraceData$Builder;->uuid:Ljava/lang/String;

    iget-wide v0, p1, Lbacktraceio/library/models/json/BacktraceReport;->timestamp:J

    iput-wide v0, p0, Lbacktraceio/library/models/BacktraceData$Builder;->timestamp:J

    iget-object v0, p1, Lbacktraceio/library/models/json/BacktraceReport;->exceptionTypeReport:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    iget-object p1, p1, Lbacktraceio/library/models/json/BacktraceReport;->classifier:Ljava/lang/String;

    aput-object p1, v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lbacktraceio/library/models/BacktraceData$Builder;->classifiers:[Ljava/lang/String;

    const-string p1, "java.version"

    invoke-static {p1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lbacktraceio/library/models/BacktraceData$Builder;->langVersion:Ljava/lang/String;

    sget-object p1, Lbacktraceio/library/base/BacktraceBase;->version:Ljava/lang/String;

    iput-object p1, p0, Lbacktraceio/library/models/BacktraceData$Builder;->agentVersion:Ljava/lang/String;

    return-object p0
.end method

.method private setDefaultThreadsInformation()Lbacktraceio/library/models/BacktraceData$Builder;
    .locals 3

    invoke-static {}, Lbacktraceio/library/models/BacktraceData;->access$000()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Setting threads information"

    invoke-static {v0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lbacktraceio/library/models/json/ThreadData;

    iget-object v1, p0, Lbacktraceio/library/models/BacktraceData$Builder;->report:Lbacktraceio/library/models/json/BacktraceReport;

    iget-object v1, v1, Lbacktraceio/library/models/json/BacktraceReport;->diagnosticStack:Ljava/util/List;

    invoke-direct {v0, v1}, Lbacktraceio/library/models/json/ThreadData;-><init>(Ljava/util/List;)V

    new-instance v1, Lbacktraceio/library/models/json/SourceCodeData;

    iget-object v2, p0, Lbacktraceio/library/models/BacktraceData$Builder;->report:Lbacktraceio/library/models/json/BacktraceReport;

    iget-object v2, v2, Lbacktraceio/library/models/json/BacktraceReport;->diagnosticStack:Ljava/util/List;

    invoke-direct {v1, v2}, Lbacktraceio/library/models/json/SourceCodeData;-><init>(Ljava/util/List;)V

    invoke-virtual {v0}, Lbacktraceio/library/models/json/ThreadData;->getMainThread()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lbacktraceio/library/models/BacktraceData$Builder;->mainThread:Ljava/lang/String;

    iget-object v0, v0, Lbacktraceio/library/models/json/ThreadData;->threadInformation:Ljava/util/Map;

    iput-object v0, p0, Lbacktraceio/library/models/BacktraceData$Builder;->threadInformationMap:Ljava/util/Map;

    iget-object v0, v1, Lbacktraceio/library/models/json/SourceCodeData;->data:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, v1, Lbacktraceio/library/models/json/SourceCodeData;->data:Ljava/util/Map;

    :goto_0
    iput-object v0, p0, Lbacktraceio/library/models/BacktraceData$Builder;->sourceCode:Ljava/util/Map;

    return-object p0
.end method


# virtual methods
.method public build()Lbacktraceio/library/models/BacktraceData;
    .locals 14

    new-instance v0, Lbacktraceio/library/models/BacktraceData;

    iget-object v1, p0, Lbacktraceio/library/models/BacktraceData$Builder;->uuid:Ljava/lang/String;

    iget-object v2, p0, Lbacktraceio/library/models/BacktraceData$Builder;->symbolication:Ljava/lang/String;

    iget-wide v3, p0, Lbacktraceio/library/models/BacktraceData$Builder;->timestamp:J

    iget-object v5, p0, Lbacktraceio/library/models/BacktraceData$Builder;->langVersion:Ljava/lang/String;

    iget-object v6, p0, Lbacktraceio/library/models/BacktraceData$Builder;->agentVersion:Ljava/lang/String;

    iget-object v7, p0, Lbacktraceio/library/models/BacktraceData$Builder;->attributes:Ljava/util/Map;

    iget-object v8, p0, Lbacktraceio/library/models/BacktraceData$Builder;->mainThread:Ljava/lang/String;

    iget-object v9, p0, Lbacktraceio/library/models/BacktraceData$Builder;->classifiers:[Ljava/lang/String;

    iget-object v10, p0, Lbacktraceio/library/models/BacktraceData$Builder;->report:Lbacktraceio/library/models/json/BacktraceReport;

    iget-object v11, p0, Lbacktraceio/library/models/BacktraceData$Builder;->annotations:Ljava/util/Map;

    iget-object v12, p0, Lbacktraceio/library/models/BacktraceData$Builder;->sourceCode:Ljava/util/Map;

    iget-object v13, p0, Lbacktraceio/library/models/BacktraceData$Builder;->threadInformationMap:Ljava/util/Map;

    invoke-direct/range {v0 .. v13}, Lbacktraceio/library/models/BacktraceData;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;[Ljava/lang/String;Lbacktraceio/library/models/json/BacktraceReport;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V

    return-object v0
.end method

.method public setAttributes(Landroid/content/Context;Ljava/util/Map;)Lbacktraceio/library/models/BacktraceData$Builder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lbacktraceio/library/models/BacktraceData$Builder;"
        }
    .end annotation

    invoke-static {}, Lbacktraceio/library/models/BacktraceData;->access$000()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Setting attributes"

    invoke-static {v0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lbacktraceio/library/models/json/BacktraceAttributes;

    iget-object v1, p0, Lbacktraceio/library/models/BacktraceData$Builder;->report:Lbacktraceio/library/models/json/BacktraceReport;

    invoke-direct {v0, p1, v1, p2}, Lbacktraceio/library/models/json/BacktraceAttributes;-><init>(Landroid/content/Context;Lbacktraceio/library/models/json/BacktraceReport;Ljava/util/Map;)V

    iget-object p1, v0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    iput-object p1, p0, Lbacktraceio/library/models/BacktraceData$Builder;->attributes:Ljava/util/Map;

    invoke-virtual {v0}, Lbacktraceio/library/models/json/BacktraceAttributes;->getComplexAttributes()Ljava/util/Map;

    move-result-object p1

    invoke-direct {p0, p1}, Lbacktraceio/library/models/BacktraceData$Builder;->setAnnotations(Ljava/util/Map;)Lbacktraceio/library/models/BacktraceData$Builder;

    return-object p0
.end method

.method public setSymbolication(Ljava/lang/String;)Lbacktraceio/library/models/BacktraceData$Builder;
    .locals 0

    iput-object p1, p0, Lbacktraceio/library/models/BacktraceData$Builder;->symbolication:Ljava/lang/String;

    return-object p0
.end method
