.class public final Ltg/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltl/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/d$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\t\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u001a\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Ltg/d;",
        "Ltl/i;",
        "<init>",
        "()V",
        "",
        "instant",
        "",
        "a",
        "(Z)V",
        "c",
        "(Lnt/b;)Ljava/lang/Object;",
        "Ltg/d$a;",
        "installState",
        "e",
        "(Ltg/d$a;)V",
        "Lku/x;",
        "b",
        "Lku/x;",
        "installStartedOrCompleted",
        "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;",
        "Ljt/h;",
        "d",
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
.field public static final a:Ltg/d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lku/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lku/x<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:Ljt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ltg/d;

    invoke-direct {v0}, Ltg/d;-><init>()V

    sput-object v0, Ltg/d;->a:Ltg/d;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v1, v0}, Lku/z;->c(Lku/d2;ILjava/lang/Object;)Lku/x;

    move-result-object v0

    sput-object v0, Ltg/d;->b:Lku/x;

    new-instance v0, Ltg/c;

    invoke-direct {v0}, Ltg/c;-><init>()V

    invoke-static {v0}, Ljt/i;->b(Lkotlin/jvm/functions/Function0;)Ljt/h;

    move-result-object v0

    sput-object v0, Ltg/d;->c:Ljt/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;
    .locals 1

    invoke-static {}, Ltg/d;->f()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;

    move-result-object v0

    return-object v0
.end method

.method public static final f()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;
    .locals 4

    sget-object v0, Lsm/c;->a:Lsm/c;

    sget-object v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;->COUNTER:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    invoke-static {v0}, Lkotlin/collections/p0;->c(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    new-instance v1, Lsm/c$a;

    const-string v2, "GmaSdkInstallState"

    invoke-direct {v1, v2, v0}, Lsm/c$a;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    const/4 v0, 0x6

    const/4 v2, 0x1

    const/16 v3, 0x7ea

    invoke-interface {v1, v3, v0, v2}, Lsm/a;->b(III)V

    const-string v0, "Counts the install state of the GMA SDK when install requested"

    invoke-interface {v1, v0}, Lsm/a;->a(Ljava/lang/String;)V

    invoke-virtual {v1}, Lsm/c$a;->d()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Z)V
    .locals 3

    const-string v0, "gmasdk"

    invoke-static {v0}, Lsh/g;->j(Ljava/lang/String;)Z

    move-result v1

    const-string v2, "GmaAdsInstaller"

    if-eqz v1, :cond_1

    const-string p1, "GMA SDK already installed"

    invoke-static {v2, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Ltg/d$a;->a:Ltg/d$a;

    invoke-virtual {p0, p1}, Ltg/d;->e(Ltg/d$a;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->g0()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Ltg/d;->b:Lku/x;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-interface {p1, v0}, Lku/x;->s(Ljava/lang/Object;)Z

    :cond_0
    return-void

    :cond_1
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->k3()Z

    move-result v1

    if-eqz v1, :cond_2

    if-nez p1, :cond_2

    const-string p1, "Defer GMA SDK install"

    invoke-static {v2, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Ltg/d$a;->b:Ltg/d$a;

    invoke-virtual {p0, p1}, Ltg/d;->e(Ltg/d$a;)V

    invoke-static {v0}, Lsh/g;->k(Ljava/lang/String;)V

    return-void

    :cond_2
    const-string p1, "Installing GMA SDK"

    invoke-static {v2, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Ltg/d$a;->c:Ltg/d$a;

    invoke-virtual {p0, p1}, Ltg/d;->e(Ltg/d$a;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->g0()Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Ltg/d;->b:Lku/x;

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-interface {p1, v1}, Lku/x;->s(Ljava/lang/Object;)Z

    :cond_3
    invoke-static {v0}, Lsh/g;->l(Ljava/lang/String;)V

    return-void
.end method

.method public final synthetic c(Lnt/b;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p1, Ltg/d$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ltg/d$b;

    iget v1, v0, Ltg/d$b;->v:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ltg/d$b;->v:I

    goto :goto_0

    :cond_0
    new-instance v0, Ltg/d$b;

    invoke-direct {v0, p0, p1}, Ltg/d$b;-><init>(Ltg/d;Lnt/b;)V

    :goto_0
    iget-object p1, v0, Ltg/d$b;->t:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Ltg/d$b;->v:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    sget-object p1, Ltg/d;->b:Lku/x;

    iput v4, v0, Ltg/d$b;->v:I

    invoke-interface {p1, v0}, Lku/w0;->B(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    sget-object p1, Lsh/g;->a:Lsh/g;

    iput v3, v0, Ltg/d$b;->v:I

    const-string v2, "gmasdk"

    invoke-virtual {p1, v2, v4, v0}, Lsh/g;->h(Ljava/lang/String;ZLnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final d()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;
    .locals 1

    sget-object v0, Ltg/d;->c:Ljt/h;

    invoke-interface {v0}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;

    return-object v0
.end method

.method public final e(Ltg/d$a;)V
    .locals 6

    invoke-virtual {p0}, Ltg/d;->d()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;

    move-result-object v0

    sget-object v1, Lsm/c;->a:Lsm/c;

    new-instance v1, Lsm/c$b;

    invoke-direct {v1}, Lsm/c$b;-><init>()V

    const-string v2, "InstallState"

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, v2, p1}, Lsm/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lsm/c$b;->l()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;

    move-result-object v1

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-wide/16 v2, 0x0

    invoke-static/range {v0 .. v5}, Lsm/c;->g(Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;DILjava/lang/Object;)Z

    return-void
.end method
