.class public Lbacktraceio/library/models/BacktraceData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbacktraceio/library/models/BacktraceData$Builder;
    }
.end annotation


# static fields
.field private static final transient LOG_TAG:Ljava/lang/String; = "BacktraceData"


# instance fields
.field public final agent:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "agent"
    .end annotation
.end field

.field public agentVersion:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "agentVersion"
    .end annotation
.end field

.field public annotations:Ljava/util/Map;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "annotations"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public attributes:Ljava/util/Map;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "attributes"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public classifiers:[Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "classifiers"
    .end annotation
.end field

.field public final lang:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "lang"
    .end annotation
.end field

.field public langVersion:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "langVersion"
    .end annotation
.end field

.field public mainThread:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "mainThread"
    .end annotation
.end field

.field public transient report:Lbacktraceio/library/models/json/BacktraceReport;

.field public sourceCode:Ljava/util/Map;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "sourceCode"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lbacktraceio/library/models/json/SourceCode;",
            ">;"
        }
    .end annotation
.end field

.field public symbolication:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "symbolication"
    .end annotation
.end field

.field threadInformationMap:Ljava/util/Map;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "threads"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lbacktraceio/library/models/json/ThreadInformation;",
            ">;"
        }
    .end annotation
.end field

.field public timestamp:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "timestamp"
    .end annotation
.end field

.field public uuid:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "uuid"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lbacktraceio/library/models/json/BacktraceReport;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lbacktraceio/library/models/json/BacktraceReport;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    const-string v0, "java"

    iput-object v0, p0, Lbacktraceio/library/models/BacktraceData;->lang:Ljava/lang/String;

    .line 3
    const-string v0, "backtrace-android"

    iput-object v0, p0, Lbacktraceio/library/models/BacktraceData;->agent:Ljava/lang/String;

    .line 4
    new-instance v0, Lbacktraceio/library/models/BacktraceData$Builder;

    invoke-direct {v0, p2}, Lbacktraceio/library/models/BacktraceData$Builder;-><init>(Lbacktraceio/library/models/json/BacktraceReport;)V

    .line 5
    invoke-virtual {v0, p1, p3}, Lbacktraceio/library/models/BacktraceData$Builder;->setAttributes(Landroid/content/Context;Ljava/util/Map;)Lbacktraceio/library/models/BacktraceData$Builder;

    move-result-object p1

    const-string p2, ""

    .line 6
    invoke-virtual {p1, p2}, Lbacktraceio/library/models/BacktraceData$Builder;->setSymbolication(Ljava/lang/String;)Lbacktraceio/library/models/BacktraceData$Builder;

    move-result-object p1

    .line 7
    invoke-virtual {p1}, Lbacktraceio/library/models/BacktraceData$Builder;->build()Lbacktraceio/library/models/BacktraceData;

    move-result-object p1

    .line 8
    iget-object p2, p1, Lbacktraceio/library/models/BacktraceData;->uuid:Ljava/lang/String;

    iput-object p2, p0, Lbacktraceio/library/models/BacktraceData;->uuid:Ljava/lang/String;

    .line 9
    iget-object p2, p1, Lbacktraceio/library/models/BacktraceData;->symbolication:Ljava/lang/String;

    iput-object p2, p0, Lbacktraceio/library/models/BacktraceData;->symbolication:Ljava/lang/String;

    .line 10
    iget-wide p2, p1, Lbacktraceio/library/models/BacktraceData;->timestamp:J

    iput-wide p2, p0, Lbacktraceio/library/models/BacktraceData;->timestamp:J

    .line 11
    iget-object p2, p1, Lbacktraceio/library/models/BacktraceData;->langVersion:Ljava/lang/String;

    iput-object p2, p0, Lbacktraceio/library/models/BacktraceData;->langVersion:Ljava/lang/String;

    .line 12
    iget-object p2, p1, Lbacktraceio/library/models/BacktraceData;->agentVersion:Ljava/lang/String;

    iput-object p2, p0, Lbacktraceio/library/models/BacktraceData;->agentVersion:Ljava/lang/String;

    .line 13
    iget-object p2, p1, Lbacktraceio/library/models/BacktraceData;->attributes:Ljava/util/Map;

    iput-object p2, p0, Lbacktraceio/library/models/BacktraceData;->attributes:Ljava/util/Map;

    .line 14
    iget-object p2, p1, Lbacktraceio/library/models/BacktraceData;->mainThread:Ljava/lang/String;

    iput-object p2, p0, Lbacktraceio/library/models/BacktraceData;->mainThread:Ljava/lang/String;

    .line 15
    iget-object p2, p1, Lbacktraceio/library/models/BacktraceData;->report:Lbacktraceio/library/models/json/BacktraceReport;

    iput-object p2, p0, Lbacktraceio/library/models/BacktraceData;->report:Lbacktraceio/library/models/json/BacktraceReport;

    .line 16
    iget-object p2, p1, Lbacktraceio/library/models/BacktraceData;->classifiers:[Ljava/lang/String;

    iput-object p2, p0, Lbacktraceio/library/models/BacktraceData;->classifiers:[Ljava/lang/String;

    .line 17
    iget-object p2, p1, Lbacktraceio/library/models/BacktraceData;->annotations:Ljava/util/Map;

    iput-object p2, p0, Lbacktraceio/library/models/BacktraceData;->annotations:Ljava/util/Map;

    .line 18
    iget-object p2, p1, Lbacktraceio/library/models/BacktraceData;->sourceCode:Ljava/util/Map;

    iput-object p2, p0, Lbacktraceio/library/models/BacktraceData;->sourceCode:Ljava/util/Map;

    .line 19
    iget-object p1, p1, Lbacktraceio/library/models/BacktraceData;->threadInformationMap:Ljava/util/Map;

    iput-object p1, p0, Lbacktraceio/library/models/BacktraceData;->threadInformationMap:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;[Ljava/lang/String;Lbacktraceio/library/models/json/BacktraceReport;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "J",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            "Lbacktraceio/library/models/json/BacktraceReport;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lbacktraceio/library/models/json/SourceCode;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lbacktraceio/library/models/json/ThreadInformation;",
            ">;)V"
        }
    .end annotation

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    const-string v0, "java"

    iput-object v0, p0, Lbacktraceio/library/models/BacktraceData;->lang:Ljava/lang/String;

    .line 22
    const-string v0, "backtrace-android"

    iput-object v0, p0, Lbacktraceio/library/models/BacktraceData;->agent:Ljava/lang/String;

    .line 23
    iput-object p1, p0, Lbacktraceio/library/models/BacktraceData;->uuid:Ljava/lang/String;

    .line 24
    iput-object p2, p0, Lbacktraceio/library/models/BacktraceData;->symbolication:Ljava/lang/String;

    .line 25
    iput-wide p3, p0, Lbacktraceio/library/models/BacktraceData;->timestamp:J

    .line 26
    iput-object p5, p0, Lbacktraceio/library/models/BacktraceData;->langVersion:Ljava/lang/String;

    .line 27
    iput-object p6, p0, Lbacktraceio/library/models/BacktraceData;->agentVersion:Ljava/lang/String;

    .line 28
    iput-object p7, p0, Lbacktraceio/library/models/BacktraceData;->attributes:Ljava/util/Map;

    .line 29
    iput-object p8, p0, Lbacktraceio/library/models/BacktraceData;->mainThread:Ljava/lang/String;

    .line 30
    iput-object p10, p0, Lbacktraceio/library/models/BacktraceData;->report:Lbacktraceio/library/models/json/BacktraceReport;

    .line 31
    iput-object p9, p0, Lbacktraceio/library/models/BacktraceData;->classifiers:[Ljava/lang/String;

    .line 32
    iput-object p11, p0, Lbacktraceio/library/models/BacktraceData;->annotations:Ljava/util/Map;

    .line 33
    iput-object p12, p0, Lbacktraceio/library/models/BacktraceData;->sourceCode:Ljava/util/Map;

    .line 34
    iput-object p13, p0, Lbacktraceio/library/models/BacktraceData;->threadInformationMap:Ljava/util/Map;

    return-void
.end method

.method public static synthetic access$000()Ljava/lang/String;
    .locals 1

    sget-object v0, Lbacktraceio/library/models/BacktraceData;->LOG_TAG:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public getAgent()Ljava/lang/String;
    .locals 1

    const-string v0, "backtrace-android"

    return-object v0
.end method

.method public getAgentVersion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/models/BacktraceData;->agentVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getAnnotations()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lbacktraceio/library/models/BacktraceData;->annotations:Ljava/util/Map;

    return-object v0
.end method

.method public getAttachmentPaths()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lbacktraceio/library/models/BacktraceData;->report:Lbacktraceio/library/models/json/BacktraceReport;

    iget-object v0, v0, Lbacktraceio/library/models/json/BacktraceReport;->attachmentPaths:Ljava/util/List;

    return-object v0
.end method

.method public getAttachments()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0}, Lbacktraceio/library/models/BacktraceData;->getAttachmentPaths()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getAttributes()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lbacktraceio/library/models/BacktraceData;->attributes:Ljava/util/Map;

    return-object v0
.end method

.method public getClassifiers()[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/models/BacktraceData;->classifiers:[Ljava/lang/String;

    return-object v0
.end method

.method public getLang()Ljava/lang/String;
    .locals 1

    const-string v0, "java"

    return-object v0
.end method

.method public getLangVersion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/models/BacktraceData;->langVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getMainThread()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/models/BacktraceData;->mainThread:Ljava/lang/String;

    return-object v0
.end method

.method public getReport()Lbacktraceio/library/models/json/BacktraceReport;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/models/BacktraceData;->report:Lbacktraceio/library/models/json/BacktraceReport;

    return-object v0
.end method

.method public getSourceCode()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lbacktraceio/library/models/json/SourceCode;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lbacktraceio/library/models/BacktraceData;->sourceCode:Ljava/util/Map;

    return-object v0
.end method

.method public getSymbolication()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/models/BacktraceData;->symbolication:Ljava/lang/String;

    return-object v0
.end method

.method public getThreadInformationMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lbacktraceio/library/models/json/ThreadInformation;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lbacktraceio/library/models/BacktraceData;->threadInformationMap:Ljava/util/Map;

    return-object v0
.end method

.method public getTimestamp()J
    .locals 2

    iget-wide v0, p0, Lbacktraceio/library/models/BacktraceData;->timestamp:J

    return-wide v0
.end method

.method public getUuid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/models/BacktraceData;->uuid:Ljava/lang/String;

    return-object v0
.end method
