.class public final Ltg/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a#\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\"\u001b\u0010\u000c\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\r"
    }
    d2 = {
        "Ltg/b;",
        "phase",
        "",
        "result",
        "",
        "e",
        "(Ltg/b;Ljava/lang/String;)V",
        "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;",
        "a",
        "Ljt/h;",
        "c",
        "()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;",
        "getQueryInfoResultConfig",
        "NativeShell_googleProdRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Ljt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltg/i;

    invoke-direct {v0}, Ltg/i;-><init>()V

    invoke-static {v0}, Ljt/i;->b(Lkotlin/jvm/functions/Function0;)Ljt/h;

    move-result-object v0

    sput-object v0, Ltg/j;->a:Ljt/h;

    return-void
.end method

.method public static synthetic a()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;
    .locals 1

    invoke-static {}, Ltg/j;->d()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic b(Ltg/b;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Ltg/j;->e(Ltg/b;Ljava/lang/String;)V

    return-void
.end method

.method public static final c()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;
    .locals 1

    sget-object v0, Ltg/j;->a:Ljt/h;

    invoke-interface {v0}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;

    return-object v0
.end method

.method public static final d()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;
    .locals 4

    sget-object v0, Lsm/c;->a:Lsm/c;

    sget-object v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;->EVENT_INGEST:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    invoke-static {v0}, Lkotlin/collections/p0;->c(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    new-instance v1, Lsm/c$a;

    const-string v2, "RewardedVideoGetQueryInfoResult"

    invoke-direct {v1, v2, v0}, Lsm/c$a;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->Z5()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Lsm/a;->c(Ljava/lang/Integer;)V

    const/16 v0, 0x8

    const/16 v2, 0xb

    const/16 v3, 0x7ea

    invoke-interface {v1, v3, v0, v2}, Lsm/a;->b(III)V

    const-string v0, "Outcome (success / bounded failure reason) of a rewarded-video getQueryInfo attempt"

    invoke-interface {v1, v0}, Lsm/a;->a(Ljava/lang/String;)V

    invoke-virtual {v1}, Lsm/c$a;->d()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;

    move-result-object v0

    return-object v0
.end method

.method public static final e(Ltg/b;Ljava/lang/String;)V
    .locals 6

    invoke-static {}, Ltg/j;->c()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;

    move-result-object v0

    sget-object v1, Lsm/c;->a:Lsm/c;

    new-instance v1, Lsm/c$b;

    invoke-direct {v1}, Lsm/c$b;-><init>()V

    sget-object v2, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;->ADD_OS_INFO:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    sget-object v3, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;->ADD_UNIVERSE_ID:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    sget-object v4, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;->ADD_PLAY_SESSION_ID:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    sget-object v5, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;->ADD_PLACE_ID:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    filled-new-array {v2, v3, v4, v5}, [Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v1, v2}, Lsm/b;->a(Ljava/lang/Iterable;)Lsm/b;

    const-string v2, "phase"

    invoke-virtual {p0}, Ltg/b;->b()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v1, v2, p0}, Lsm/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    const-string p0, "result"

    invoke-interface {v1, p0, p1}, Lsm/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v1}, Lsm/c$b;->l()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;

    move-result-object p0

    invoke-static {v0, p0}, Lsm/c;->h(Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;)Z

    return-void
.end method

.method public static synthetic f(Ltg/b;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, Ltg/j;->e(Ltg/b;Ljava/lang/String;)V

    return-void
.end method
