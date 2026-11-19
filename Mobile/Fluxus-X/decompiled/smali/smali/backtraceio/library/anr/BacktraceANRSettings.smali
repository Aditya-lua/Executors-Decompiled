.class public Lbacktraceio/library/anr/BacktraceANRSettings;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final DEFAULT_ANR_TIMEOUT:I = 0x1388


# instance fields
.field private final debug:Z

.field private final onApplicationNotRespondingEvent:Lbacktraceio/library/watchdog/OnApplicationNotRespondingEvent;

.field private final timeout:I


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/16 v2, 0x1388

    .line 1
    invoke-direct {p0, v2, v0, v1}, Lbacktraceio/library/anr/BacktraceANRSettings;-><init>(ILbacktraceio/library/watchdog/OnApplicationNotRespondingEvent;Z)V

    return-void
.end method

.method public constructor <init>(ILbacktraceio/library/watchdog/OnApplicationNotRespondingEvent;Z)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lbacktraceio/library/anr/BacktraceANRSettings;->timeout:I

    .line 4
    iput-object p2, p0, Lbacktraceio/library/anr/BacktraceANRSettings;->onApplicationNotRespondingEvent:Lbacktraceio/library/watchdog/OnApplicationNotRespondingEvent;

    .line 5
    iput-boolean p3, p0, Lbacktraceio/library/anr/BacktraceANRSettings;->debug:Z

    return-void
.end method


# virtual methods
.method public getOnApplicationNotRespondingEvent()Lbacktraceio/library/watchdog/OnApplicationNotRespondingEvent;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/anr/BacktraceANRSettings;->onApplicationNotRespondingEvent:Lbacktraceio/library/watchdog/OnApplicationNotRespondingEvent;

    return-object v0
.end method

.method public getTimeout()I
    .locals 1

    iget v0, p0, Lbacktraceio/library/anr/BacktraceANRSettings;->timeout:I

    return v0
.end method

.method public isDebug()Z
    .locals 1

    iget-boolean v0, p0, Lbacktraceio/library/anr/BacktraceANRSettings;->debug:Z

    return v0
.end method
