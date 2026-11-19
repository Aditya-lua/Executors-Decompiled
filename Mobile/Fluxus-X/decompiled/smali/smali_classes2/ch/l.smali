.class public final Lch/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a#\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\"\u001b\u0010\u000c\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\r"
    }
    d2 = {
        "Lch/b;",
        "phase",
        "",
        "result",
        "",
        "e",
        "(Lch/b;Ljava/lang/String;)V",
        "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;",
        "a",
        "Lzt/h;",
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
.field public static final a:Lzt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lch/k;

    invoke-direct {v0}, Lch/k;-><init>()V

    invoke-static {v0}, Lzt/i;->a(Lkotlin/jvm/functions/Function0;)Lzt/h;

    move-result-object v0

    sput-object v0, Lch/l;->a:Lzt/h;

    return-void
.end method

.method public static synthetic a()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;
    .locals 1

    invoke-static {}, Lch/l;->d()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic b(Lch/b;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lch/l;->e(Lch/b;Ljava/lang/String;)V

    return-void
.end method

.method public static final c()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;
    .locals 1

    sget-object v0, Lch/l;->a:Lzt/h;

    invoke-interface {v0}, Lzt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;

    return-object v0
.end method

.method public static final d()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;
    .locals 4

    sget-object v0, Lfn/c;->a:Lfn/c;

    sget-object v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;->EVENT_INGEST:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    invoke-static {v0}, Lkotlin/collections/p0;->c(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    new-instance v1, Lfn/c$a;

    const-string v2, "RewardedVideoGetQueryInfoResult"

    invoke-direct {v1, v2, v0}, Lfn/c$a;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->b6()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Lfn/a;->c(Ljava/lang/Integer;)V

    const/16 v0, 0x8

    const/16 v2, 0xb

    const/16 v3, 0x7ea

    invoke-interface {v1, v3, v0, v2}, Lfn/a;->b(III)V

    const-string v0, "Outcome (success / bounded failure reason) of a rewarded-video getQueryInfo attempt"

    invoke-interface {v1, v0}, Lfn/a;->a(Ljava/lang/String;)V

    invoke-virtual {v1}, Lfn/c$a;->d()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;

    move-result-object v0

    return-object v0
.end method

.method public static final e(Lch/b;Ljava/lang/String;)V
    .locals 6

    invoke-static {}, Lch/l;->c()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;

    move-result-object v0

    sget-object v1, Lfn/c;->a:Lfn/c;

    new-instance v1, Lfn/c$b;

    invoke-direct {v1}, Lfn/c$b;-><init>()V

    sget-object v2, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;->ADD_OS_INFO:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    sget-object v3, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;->ADD_UNIVERSE_ID:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    sget-object v4, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;->ADD_PLAY_SESSION_ID:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    sget-object v5, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;->ADD_PLACE_ID:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    filled-new-array {v2, v3, v4, v5}, [Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v1, v2}, Lfn/b;->a(Ljava/lang/Iterable;)Lfn/b;

    const-string v2, "phase"

    invoke-virtual {p0}, Lch/b;->b()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v1, v2, p0}, Lfn/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    const-string p0, "result"

    invoke-interface {v1, p0, p1}, Lfn/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v1}, Lfn/c$b;->l()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;

    move-result-object p0

    invoke-static {v0, p0}, Lfn/c;->h(Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;)Z

    return-void
.end method

.method public static synthetic f(Lch/b;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, Lch/l;->e(Lch/b;Ljava/lang/String;)V

    return-void
.end method
