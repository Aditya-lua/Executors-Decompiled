.class public Lj6/a;
.super Lbacktraceio/library/base/BacktraceBase;
.source "SourceFile"


# instance fields
.field public a:Lbacktraceio/library/anr/BacktraceANRHandler;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lj6/b;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lj6/a;-><init>(Landroid/content/Context;Lj6/b;Lbacktraceio/library/interfaces/Database;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lj6/b;Lbacktraceio/library/interfaces/Database;)V
    .locals 1

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-direct {p0, p1, p2, p3, v0}, Lj6/a;-><init>(Landroid/content/Context;Lj6/b;Lbacktraceio/library/interfaces/Database;Ljava/util/Map;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lj6/b;Lbacktraceio/library/interfaces/Database;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lj6/b;",
            "Lbacktraceio/library/interfaces/Database;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    .line 4
    invoke-direct/range {v0 .. v5}, Lj6/a;-><init>(Landroid/content/Context;Lj6/b;Lbacktraceio/library/interfaces/Database;Ljava/util/Map;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lj6/b;Lbacktraceio/library/interfaces/Database;Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lj6/b;",
            "Lbacktraceio/library/interfaces/Database;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 5
    invoke-direct/range {v0 .. v5}, Lj6/a;-><init>(Landroid/content/Context;Lj6/b;Lbacktraceio/library/interfaces/Database;Ljava/util/Map;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lj6/b;Lbacktraceio/library/interfaces/Database;Ljava/util/Map;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lj6/b;",
            "Lbacktraceio/library/interfaces/Database;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 6
    invoke-direct/range {p0 .. p5}, Lbacktraceio/library/base/BacktraceBase;-><init>(Landroid/content/Context;Lj6/b;Lbacktraceio/library/interfaces/Database;Ljava/util/Map;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lj6/b;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lj6/b;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0, p3}, Lj6/a;-><init>(Landroid/content/Context;Lj6/b;Lbacktraceio/library/interfaces/Database;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public a(Lbacktraceio/library/anr/AnrType;Lbacktraceio/library/anr/BacktraceANRSettings;)Lbacktraceio/library/anr/BacktraceANRHandler;
    .locals 2

    sget-object v0, Lbacktraceio/library/anr/AnrType;->ApplicationExit:Lbacktraceio/library/anr/AnrType;

    if-ne p1, v0, :cond_0

    new-instance p1, Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler;

    iget-object p2, p0, Lbacktraceio/library/base/BacktraceBase;->context:Landroid/content/Context;

    invoke-direct {p1, p0, p2}, Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler;-><init>(Lj6/a;Landroid/content/Context;)V

    return-object p1

    :cond_0
    sget-object v0, Lbacktraceio/library/anr/AnrType;->Threshold:Lbacktraceio/library/anr/AnrType;

    if-ne p1, v0, :cond_1

    new-instance p1, Lbacktraceio/library/watchdog/BacktraceANRHandlerWatchdog;

    invoke-virtual {p2}, Lbacktraceio/library/anr/BacktraceANRSettings;->getTimeout()I

    move-result v0

    invoke-virtual {p2}, Lbacktraceio/library/anr/BacktraceANRSettings;->isDebug()Z

    move-result p2

    invoke-direct {p1, p0, v0, p2}, Lbacktraceio/library/watchdog/BacktraceANRHandlerWatchdog;-><init>(Lj6/a;IZ)V

    return-object p1

    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsupported type of ANR: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public b(ILbacktraceio/library/watchdog/OnApplicationNotRespondingEvent;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lj6/a;->c(ILbacktraceio/library/watchdog/OnApplicationNotRespondingEvent;Z)V

    return-void
.end method

.method public c(ILbacktraceio/library/watchdog/OnApplicationNotRespondingEvent;Z)V
    .locals 1

    new-instance v0, Lbacktraceio/library/anr/BacktraceANRSettings;

    invoke-direct {v0, p1, p2, p3}, Lbacktraceio/library/anr/BacktraceANRSettings;-><init>(ILbacktraceio/library/watchdog/OnApplicationNotRespondingEvent;Z)V

    invoke-virtual {p0, v0}, Lj6/a;->e(Lbacktraceio/library/anr/BacktraceANRSettings;)V

    return-void
.end method

.method public d(Lbacktraceio/library/anr/AnrType;Lbacktraceio/library/anr/BacktraceANRSettings;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lj6/a;->f(Lbacktraceio/library/anr/AnrType;Lbacktraceio/library/anr/BacktraceANRSettings;)Lbacktraceio/library/anr/BacktraceANRHandler;

    move-result-object p1

    iput-object p1, p0, Lj6/a;->a:Lbacktraceio/library/anr/BacktraceANRHandler;

    return-void
.end method

.method public e(Lbacktraceio/library/anr/BacktraceANRSettings;)V
    .locals 1

    sget-object v0, Lbacktraceio/library/anr/AnrType;->Threshold:Lbacktraceio/library/anr/AnrType;

    invoke-virtual {p0, v0, p1}, Lj6/a;->d(Lbacktraceio/library/anr/AnrType;Lbacktraceio/library/anr/BacktraceANRSettings;)V

    return-void
.end method

.method public f(Lbacktraceio/library/anr/AnrType;Lbacktraceio/library/anr/BacktraceANRSettings;)Lbacktraceio/library/anr/BacktraceANRHandler;
    .locals 1

    invoke-virtual {p0, p1, p2}, Lj6/a;->a(Lbacktraceio/library/anr/AnrType;Lbacktraceio/library/anr/BacktraceANRSettings;)Lbacktraceio/library/anr/BacktraceANRHandler;

    move-result-object p1

    invoke-virtual {p2}, Lbacktraceio/library/anr/BacktraceANRSettings;->getOnApplicationNotRespondingEvent()Lbacktraceio/library/watchdog/OnApplicationNotRespondingEvent;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lbacktraceio/library/anr/BacktraceANRSettings;->getOnApplicationNotRespondingEvent()Lbacktraceio/library/watchdog/OnApplicationNotRespondingEvent;

    move-result-object p2

    invoke-interface {p1, p2}, Lbacktraceio/library/anr/BacktraceANRHandler;->setOnApplicationNotRespondingEvent(Lbacktraceio/library/watchdog/OnApplicationNotRespondingEvent;)V

    :cond_0
    return-object p1
.end method

.method public g(Ljava/lang/Throwable;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lj6/a;->h(Ljava/lang/Throwable;Lbacktraceio/library/events/OnServerResponseEventListener;)V

    return-void
.end method

.method public h(Ljava/lang/Throwable;Lbacktraceio/library/events/OnServerResponseEventListener;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, p2}, Lj6/a;->i(Ljava/lang/Throwable;Ljava/util/Map;Lbacktraceio/library/events/OnServerResponseEventListener;)V

    return-void
.end method

.method public i(Ljava/lang/Throwable;Ljava/util/Map;Lbacktraceio/library/events/OnServerResponseEventListener;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lbacktraceio/library/events/OnServerResponseEventListener;",
            ")V"
        }
    .end annotation

    new-instance v0, Lbacktraceio/library/models/json/BacktraceReport;

    invoke-direct {v0, p1, p2}, Lbacktraceio/library/models/json/BacktraceReport;-><init>(Ljava/lang/Throwable;Ljava/util/Map;)V

    invoke-super {p0, v0, p3}, Lbacktraceio/library/base/BacktraceBase;->send(Lbacktraceio/library/models/json/BacktraceReport;Lbacktraceio/library/events/OnServerResponseEventListener;)V

    return-void
.end method

.method public send(Lbacktraceio/library/models/json/BacktraceReport;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lj6/a;->send(Lbacktraceio/library/models/json/BacktraceReport;Lbacktraceio/library/events/OnServerResponseEventListener;)V

    return-void
.end method

.method public send(Lbacktraceio/library/models/json/BacktraceReport;Lbacktraceio/library/events/OnServerResponseEventListener;)V
    .locals 0

    .line 2
    invoke-super {p0, p1, p2}, Lbacktraceio/library/base/BacktraceBase;->send(Lbacktraceio/library/models/json/BacktraceReport;Lbacktraceio/library/events/OnServerResponseEventListener;)V

    return-void
.end method
