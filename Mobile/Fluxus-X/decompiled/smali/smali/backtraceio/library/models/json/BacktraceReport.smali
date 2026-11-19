.class public Lbacktraceio/library/models/json/BacktraceReport;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public attachmentPaths:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public attributes:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public classifier:Ljava/lang/String;

.field public diagnosticStack:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lbacktraceio/library/models/BacktraceStackFrame;",
            ">;"
        }
    .end annotation
.end field

.field public exception:Ljava/lang/Exception;

.field public exceptionTypeReport:Ljava/lang/Boolean;

.field public message:Ljava/lang/String;

.field private final transient originalException:Ljava/lang/Throwable;

.field public timestamp:J

.field public uuid:Ljava/util/UUID;


# direct methods
.method public constructor <init>(Ljava/lang/Exception;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Exception;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 10
    invoke-direct {p0, p1, v0, p2}, Lbacktraceio/library/models/json/BacktraceReport;-><init>(Ljava/lang/Throwable;Ljava/util/Map;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0, v0, v0}, Lbacktraceio/library/models/json/BacktraceReport;-><init>(Ljava/lang/Throwable;Ljava/util/Map;Ljava/util/List;)V

    .line 2
    iput-object p1, p0, Lbacktraceio/library/models/json/BacktraceReport;->message:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, p1, v0, p2}, Lbacktraceio/library/models/json/BacktraceReport;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, v0, p2, v0}, Lbacktraceio/library/models/json/BacktraceReport;-><init>(Ljava/lang/Throwable;Ljava/util/Map;Ljava/util/List;)V

    .line 4
    iput-object p1, p0, Lbacktraceio/library/models/json/BacktraceReport;->message:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 6
    invoke-direct {p0, v0, p2, p3}, Lbacktraceio/library/models/json/BacktraceReport;-><init>(Ljava/lang/Throwable;Ljava/util/Map;Ljava/util/List;)V

    .line 7
    iput-object p1, p0, Lbacktraceio/library/models/json/BacktraceReport;->message:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 1

    const/4 v0, 0x0

    .line 8
    invoke-direct {p0, p1, v0, v0}, Lbacktraceio/library/models/json/BacktraceReport;-><init>(Ljava/lang/Throwable;Ljava/util/Map;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 9
    invoke-direct {p0, p1, p2, v0}, Lbacktraceio/library/models/json/BacktraceReport;-><init>(Ljava/lang/Throwable;Ljava/util/Map;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;Ljava/util/Map;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    iput-object v0, p0, Lbacktraceio/library/models/json/BacktraceReport;->uuid:Ljava/util/UUID;

    .line 13
    invoke-static {}, Lbacktraceio/library/common/BacktraceTimeHelper;->getTimestampSeconds()J

    move-result-wide v0

    iput-wide v0, p0, Lbacktraceio/library/models/json/BacktraceReport;->timestamp:J

    .line 14
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lbacktraceio/library/models/json/BacktraceReport;->exceptionTypeReport:Ljava/lang/Boolean;

    .line 15
    const-string v0, ""

    iput-object v0, p0, Lbacktraceio/library/models/json/BacktraceReport;->classifier:Ljava/lang/String;

    .line 16
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lbacktraceio/library/models/json/BacktraceReport;->attributes:Ljava/util/Map;

    .line 17
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lbacktraceio/library/models/json/BacktraceReport;->attachmentPaths:Ljava/util/List;

    .line 18
    invoke-static {p2}, Lbacktraceio/library/common/CollectionUtils;->copyMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p2

    iput-object p2, p0, Lbacktraceio/library/models/json/BacktraceReport;->attributes:Ljava/util/Map;

    .line 19
    invoke-static {p3}, Lbacktraceio/library/common/CollectionUtils;->copyList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lbacktraceio/library/models/json/BacktraceReport;->attachmentPaths:Ljava/util/List;

    .line 20
    iput-object p1, p0, Lbacktraceio/library/models/json/BacktraceReport;->originalException:Ljava/lang/Throwable;

    if-eqz p1, :cond_0

    .line 21
    invoke-direct {p0, p1}, Lbacktraceio/library/models/json/BacktraceReport;->prepareException(Ljava/lang/Throwable;)Ljava/lang/Exception;

    move-result-object p2

    iput-object p2, p0, Lbacktraceio/library/models/json/BacktraceReport;->exception:Ljava/lang/Exception;

    .line 22
    invoke-direct {p0, p1}, Lbacktraceio/library/models/json/BacktraceReport;->getExceptionClassifier(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lbacktraceio/library/models/json/BacktraceReport;->classifier:Ljava/lang/String;

    .line 23
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object p1, p0, Lbacktraceio/library/models/json/BacktraceReport;->exceptionTypeReport:Ljava/lang/Boolean;

    .line 24
    :cond_0
    new-instance p1, Lbacktraceio/library/models/BacktraceStackTrace;

    iget-object p2, p0, Lbacktraceio/library/models/json/BacktraceReport;->exception:Ljava/lang/Exception;

    invoke-direct {p1, p2}, Lbacktraceio/library/models/BacktraceStackTrace;-><init>(Ljava/lang/Exception;)V

    invoke-virtual {p1}, Lbacktraceio/library/models/BacktraceStackTrace;->getStackFrames()Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Lbacktraceio/library/models/json/BacktraceReport;->diagnosticStack:Ljava/util/List;

    .line 25
    invoke-direct {p0}, Lbacktraceio/library/models/json/BacktraceReport;->setDefaultErrorTypeAttribute()V

    return-void
.end method

.method public constructor <init>(Ljava/util/UUID;JZLjava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Exception;Ljava/util/List;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/UUID;",
            "JZ",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/Exception;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Lbacktraceio/library/models/BacktraceStackFrame;",
            ">;)V"
        }
    .end annotation

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    iput-object v0, p0, Lbacktraceio/library/models/json/BacktraceReport;->uuid:Ljava/util/UUID;

    .line 28
    invoke-static {}, Lbacktraceio/library/common/BacktraceTimeHelper;->getTimestampSeconds()J

    move-result-wide v0

    iput-wide v0, p0, Lbacktraceio/library/models/json/BacktraceReport;->timestamp:J

    .line 29
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lbacktraceio/library/models/json/BacktraceReport;->exceptionTypeReport:Ljava/lang/Boolean;

    .line 30
    const-string v0, ""

    iput-object v0, p0, Lbacktraceio/library/models/json/BacktraceReport;->classifier:Ljava/lang/String;

    .line 31
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lbacktraceio/library/models/json/BacktraceReport;->attributes:Ljava/util/Map;

    .line 32
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lbacktraceio/library/models/json/BacktraceReport;->attachmentPaths:Ljava/util/List;

    .line 33
    iput-object p1, p0, Lbacktraceio/library/models/json/BacktraceReport;->uuid:Ljava/util/UUID;

    .line 34
    iput-wide p2, p0, Lbacktraceio/library/models/json/BacktraceReport;->timestamp:J

    .line 35
    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lbacktraceio/library/models/json/BacktraceReport;->exceptionTypeReport:Ljava/lang/Boolean;

    .line 36
    iput-object p5, p0, Lbacktraceio/library/models/json/BacktraceReport;->classifier:Ljava/lang/String;

    .line 37
    iput-object p6, p0, Lbacktraceio/library/models/json/BacktraceReport;->attributes:Ljava/util/Map;

    .line 38
    iput-object p7, p0, Lbacktraceio/library/models/json/BacktraceReport;->message:Ljava/lang/String;

    .line 39
    iput-object p8, p0, Lbacktraceio/library/models/json/BacktraceReport;->originalException:Ljava/lang/Throwable;

    .line 40
    iput-object p8, p0, Lbacktraceio/library/models/json/BacktraceReport;->exception:Ljava/lang/Exception;

    .line 41
    iput-object p9, p0, Lbacktraceio/library/models/json/BacktraceReport;->attachmentPaths:Ljava/util/List;

    .line 42
    iput-object p10, p0, Lbacktraceio/library/models/json/BacktraceReport;->diagnosticStack:Ljava/util/List;

    return-void
.end method

.method public static concatAttributes(Lbacktraceio/library/models/json/BacktraceReport;Ljava/util/Map;)Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbacktraceio/library/models/json/BacktraceReport;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object p0, p0, Lbacktraceio/library/models/json/BacktraceReport;->attributes:Ljava/util/Map;

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/util/HashMap;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    :goto_0
    if-nez p1, :cond_1

    return-object p0

    :cond_1
    invoke-interface {p0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-object p0
.end method

.method private getExceptionClassifier(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private prepareException(Ljava/lang/Throwable;)Ljava/lang/Exception;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/Exception;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    return-object v0
.end method

.method private setDefaultErrorTypeAttribute()V
    .locals 3

    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceReport;->attributes:Ljava/util/Map;

    const-string v1, "error.type"

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceReport;->attributes:Ljava/util/Map;

    iget-object v2, p0, Lbacktraceio/library/models/json/BacktraceReport;->exceptionTypeReport:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "Exception"

    goto :goto_0

    :cond_1
    const-string v2, "Message"

    :goto_0
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public getException()Ljava/lang/Throwable;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceReport;->originalException:Ljava/lang/Throwable;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceReport;->exception:Ljava/lang/Exception;

    return-object v0
.end method

.method public toBacktraceData(Landroid/content/Context;Ljava/util/Map;)Lbacktraceio/library/models/BacktraceData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lbacktraceio/library/models/BacktraceData;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, p2, v0}, Lbacktraceio/library/models/json/BacktraceReport;->toBacktraceData(Landroid/content/Context;Ljava/util/Map;Z)Lbacktraceio/library/models/BacktraceData;

    move-result-object p1

    return-object p1
.end method

.method public toBacktraceData(Landroid/content/Context;Ljava/util/Map;Z)Lbacktraceio/library/models/BacktraceData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;Z)",
            "Lbacktraceio/library/models/BacktraceData;"
        }
    .end annotation

    if-eqz p3, :cond_0

    .line 2
    const-string p3, "proguard"

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    .line 3
    :goto_0
    new-instance v0, Lbacktraceio/library/models/BacktraceData$Builder;

    invoke-direct {v0, p0}, Lbacktraceio/library/models/BacktraceData$Builder;-><init>(Lbacktraceio/library/models/json/BacktraceReport;)V

    invoke-virtual {v0, p1, p2}, Lbacktraceio/library/models/BacktraceData$Builder;->setAttributes(Landroid/content/Context;Ljava/util/Map;)Lbacktraceio/library/models/BacktraceData$Builder;

    move-result-object p1

    invoke-virtual {p1, p3}, Lbacktraceio/library/models/BacktraceData$Builder;->setSymbolication(Ljava/lang/String;)Lbacktraceio/library/models/BacktraceData$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lbacktraceio/library/models/BacktraceData$Builder;->build()Lbacktraceio/library/models/BacktraceData;

    move-result-object p1

    return-object p1
.end method
