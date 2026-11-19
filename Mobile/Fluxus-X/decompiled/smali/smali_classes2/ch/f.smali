.class public final Lch/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhm/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lch/f$a;,
        Lch/f$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\r\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0016R(\u0010 \u001a\u00020\u00188\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0018\n\u0004\u0008\u0019\u0010\u001a\u0012\u0004\u0008\u001f\u0010\u0003\u001a\u0004\u0008\u001b\u0010\u001c\"\u0004\u0008\u001d\u0010\u001eR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\"\u001a\u0004\u0008#\u0010$\u00a8\u0006&"
    }
    d2 = {
        "Lch/f;",
        "Lhm/i;",
        "<init>",
        "()V",
        "",
        "instant",
        "",
        "a",
        "(Z)V",
        "Lhm/i$a;",
        "mode",
        "b",
        "(Lhm/i$a;Leu/b;)Ljava/lang/Object;",
        "d",
        "(Leu/b;)Ljava/lang/Object;",
        "Lch/f$a;",
        "h",
        "(Lhm/i$a;)Lch/f$a;",
        "installState",
        "f",
        "(Lch/f$a;)V",
        "Lav/x;",
        "Lav/x;",
        "installStartedOrCompleted",
        "Lch/c;",
        "c",
        "Lch/c;",
        "getBackgroundInstallScheduler$NativeShell_googleProdRelease",
        "()Lch/c;",
        "setBackgroundInstallScheduler$NativeShell_googleProdRelease",
        "(Lch/c;)V",
        "getBackgroundInstallScheduler$NativeShell_googleProdRelease$annotations",
        "backgroundInstallScheduler",
        "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;",
        "Lzt/h;",
        "e",
        "()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;",
        "sdkInstallCounter",
        "NativeShell_googleProdRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lch/f;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lav/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lav/x<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static c:Lch/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final d:Lzt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lch/f;

    invoke-direct {v0}, Lch/f;-><init>()V

    sput-object v0, Lch/f;->a:Lch/f;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v1, v0}, Lav/z;->c(Lav/d2;ILjava/lang/Object;)Lav/x;

    move-result-object v2

    sput-object v2, Lch/f;->b:Lav/x;

    new-instance v2, Lch/c;

    invoke-direct {v2, v0, v1, v0}, Lch/c;-><init>(Lav/l0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v2, Lch/f;->c:Lch/c;

    new-instance v0, Lch/e;

    invoke-direct {v0}, Lch/e;-><init>()V

    invoke-static {v0}, Lzt/i;->a(Lkotlin/jvm/functions/Function0;)Lzt/h;

    move-result-object v0

    sput-object v0, Lch/f;->d:Lzt/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic c()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;
    .locals 1

    invoke-static {}, Lch/f;->g()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;

    move-result-object v0

    return-object v0
.end method

.method public static final g()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;
    .locals 4

    sget-object v0, Lfn/c;->a:Lfn/c;

    sget-object v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;->COUNTER:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    invoke-static {v0}, Lkotlin/collections/p0;->c(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    new-instance v1, Lfn/c$a;

    const-string v2, "GmaSdkInstallState"

    invoke-direct {v1, v2, v0}, Lfn/c$a;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    const/4 v0, 0x6

    const/4 v2, 0x1

    const/16 v3, 0x7ea

    invoke-interface {v1, v3, v0, v2}, Lfn/a;->b(III)V

    const-string v0, "Counts the install state of the GMA SDK when install requested"

    invoke-interface {v1, v0}, Lfn/a;->a(Ljava/lang/String;)V

    invoke-virtual {v1}, Lfn/c$a;->d()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Z)V
    .locals 3

    const-string v0, "gmasdk"

    invoke-static {v0}, Lai/h;->k(Ljava/lang/String;)Z

    move-result v1

    const-string v2, "GmaAdsInstaller"

    if-eqz v1, :cond_1

    const-string p1, "GMA SDK already installed"

    invoke-static {v2, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lch/f$a;->a:Lch/f$a;

    invoke-virtual {p0, p1}, Lch/f;->f(Lch/f$a;)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->j0()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lch/f;->b:Lav/x;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-interface {p1, v0}, Lav/x;->s(Ljava/lang/Object;)Z

    :cond_0
    return-void

    :cond_1
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v1

    invoke-interface {v1}, Lbi/i;->r3()Z

    move-result v1

    if-eqz v1, :cond_2

    if-nez p1, :cond_2

    const-string p1, "Defer GMA SDK install"

    invoke-static {v2, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lch/f$a;->b:Lch/f$a;

    invoke-virtual {p0, p1}, Lch/f;->f(Lch/f$a;)V

    invoke-static {v0}, Lai/h;->l(Ljava/lang/String;)V

    return-void

    :cond_2
    const-string p1, "Installing GMA SDK"

    invoke-static {v2, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lch/f$a;->c:Lch/f$a;

    invoke-virtual {p0, p1}, Lch/f;->f(Lch/f$a;)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->j0()Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Lch/f;->b:Lav/x;

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-interface {p1, v1}, Lav/x;->s(Ljava/lang/Object;)Z

    :cond_3
    invoke-static {v0}, Lai/h;->m(Ljava/lang/String;)V

    return-void
.end method

.method public b(Lhm/i$a;Leu/b;)Ljava/lang/Object;
    .locals 4
    .param p1    # Lhm/i$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhm/i$a;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "gmasdk"

    invoke-static {v0}, Lai/h;->k(Ljava/lang/String;)Z

    move-result v1

    const-string v2, "GmaAdsInstaller"

    if-eqz v1, :cond_0

    const-string p1, "GMA SDK already installed"

    invoke-static {v2, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lch/f$a;->a:Lch/f$a;

    invoke-virtual {p0, p1}, Lch/f;->f(Lch/f$a;)V

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Triggered Gmasdk install: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, p1}, Lch/f;->h(Lhm/i$a;)Lch/f$a;

    move-result-object v1

    invoke-virtual {p0, v1}, Lch/f;->f(Lch/f$a;)V

    sget-object v1, Lch/f$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_3

    const/4 v0, 0x2

    if-ne p1, v0, :cond_2

    sget-object p1, Lch/f;->c:Lch/c;

    invoke-virtual {p1, p2}, Lch/c;->d(Leu/b;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_2
    new-instance p1, Lzt/l;

    invoke-direct {p1}, Lzt/l;-><init>()V

    throw p1

    :cond_3
    invoke-static {v0}, Lai/h;->l(Ljava/lang/String;)V

    :goto_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final synthetic d(Leu/b;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p1, Lch/f$c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lch/f$c;

    iget v1, v0, Lch/f$c;->v:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lch/f$c;->v:I

    goto :goto_0

    :cond_0
    new-instance v0, Lch/f$c;

    invoke-direct {v0, p0, p1}, Lch/f$c;-><init>(Lch/f;Leu/b;)V

    :goto_0
    iget-object p1, v0, Lch/f$c;->t:Ljava/lang/Object;

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lch/f$c;->v:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    sget-object p1, Lch/f;->b:Lav/x;

    iput v4, v0, Lch/f$c;->v:I

    invoke-interface {p1, v0}, Lav/w0;->y(Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    sget-object p1, Lai/h;->a:Lai/h;

    iput v3, v0, Lch/f$c;->v:I

    const-string v2, "gmasdk"

    invoke-virtual {p1, v2, v4, v0}, Lai/h;->i(Ljava/lang/String;ZLeu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final e()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;
    .locals 1

    sget-object v0, Lch/f;->d:Lzt/h;

    invoke-interface {v0}, Lzt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;

    return-object v0
.end method

.method public final f(Lch/f$a;)V
    .locals 6

    invoke-virtual {p0}, Lch/f;->e()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;

    move-result-object v0

    sget-object v1, Lfn/c;->a:Lfn/c;

    new-instance v1, Lfn/c$b;

    invoke-direct {v1}, Lfn/c$b;-><init>()V

    const-string v2, "InstallState"

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, v2, p1}, Lfn/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lfn/c$b;->l()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;

    move-result-object v1

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-wide/16 v2, 0x0

    invoke-static/range {v0 .. v5}, Lfn/c;->g(Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;DILjava/lang/Object;)Z

    return-void
.end method

.method public final h(Lhm/i$a;)Lch/f$a;
    .locals 1

    sget-object v0, Lch/f$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    sget-object p1, Lch/f$a;->d:Lch/f$a;

    return-object p1

    :cond_0
    new-instance p1, Lzt/l;

    invoke-direct {p1}, Lzt/l;-><init>()V

    throw p1

    :cond_1
    sget-object p1, Lch/f$a;->b:Lch/f$a;

    return-object p1
.end method
