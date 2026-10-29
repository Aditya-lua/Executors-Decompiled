.class public final Lak/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwg/c$d;
.implements Lcom/roblox/protocols/webview/a$f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lak/a0$a;,
        Lak/a0$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0002\u0018\u001aB+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u001eR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010 \u00a8\u0006#"
    }
    d2 = {
        "Lak/a0;",
        "Lwg/c$d;",
        "Lcom/roblox/protocols/webview/a$f;",
        "Lj/b;",
        "activity",
        "",
        "containerViewId",
        "Lkm/f;",
        "linkingProtocol",
        "Lyi/a;",
        "nativeViewModel",
        "<init>",
        "(Lj/b;ILkm/f;Lyi/a;)V",
        "",
        "i",
        "()Z",
        "Lnl/a;",
        "params",
        "",
        "g",
        "(Lnl/a;)V",
        "d",
        "e",
        "()V",
        "a",
        "Lj/b;",
        "b",
        "I",
        "c",
        "Lkm/f;",
        "Lyi/a;",
        "Lcom/roblox/protocols/webview/WebViewProtocol;",
        "Lcom/roblox/protocols/webview/WebViewProtocol;",
        "webViewProtocol",
        "f",
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
.field public static final f:Lak/a0$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lj/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:I

.field public final c:Lkm/f;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lyi/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Lcom/roblox/protocols/webview/WebViewProtocol;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lak/a0$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lak/a0$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lak/a0;->f:Lak/a0$b;

    return-void
.end method

.method public constructor <init>(Lj/b;ILkm/f;Lyi/a;)V
    .locals 1
    .param p1    # Lj/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkm/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lyi/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkingProtocol"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nativeViewModel"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lak/a0;->a:Lj/b;

    .line 3
    iput p2, p0, Lak/a0;->b:I

    .line 4
    iput-object p3, p0, Lak/a0;->c:Lkm/f;

    .line 5
    iput-object p4, p0, Lak/a0;->d:Lyi/a;

    .line 6
    new-instance p1, Lcom/roblox/protocols/webview/WebViewProtocol;

    invoke-direct {p1, p0}, Lcom/roblox/protocols/webview/WebViewProtocol;-><init>(Lcom/roblox/protocols/webview/a$f;)V

    iput-object p1, p0, Lak/a0;->e:Lcom/roblox/protocols/webview/WebViewProtocol;

    return-void
.end method

.method public synthetic constructor <init>(Lj/b;ILkm/f;Lyi/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    .line 7
    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object p3

    const-string p6, "sharedInstance(...)"

    invoke-static {p3, p6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    .line 8
    sget-object p4, Lyi/a;->a:Lyi/a;

    .line 9
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lak/a0;-><init>(Lj/b;ILkm/f;Lyi/a;)V

    return-void
.end method

.method public static synthetic a(Lak/a0;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lak/a0;->f(Lak/a0;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Lcom/roblox/client/c;Lak/a0;Le/m0;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lak/a0;->h(Lcom/roblox/client/c;Lak/a0;Le/m0;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lak/a0;)Lkm/f;
    .locals 0

    iget-object p0, p0, Lak/a0;->c:Lkm/f;

    return-object p0
.end method

.method public static final f(Lak/a0;Ljava/lang/String;)V
    .locals 0

    iget-object p0, p0, Lak/a0;->e:Lcom/roblox/protocols/webview/WebViewProtocol;

    invoke-virtual {p0, p1}, Lcom/roblox/protocols/webview/WebViewProtocol;->u(Ljava/lang/String;)V

    return-void
.end method

.method public static final h(Lcom/roblox/client/c;Lak/a0;Le/m0;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$addCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "BrowserServiceAdapter"

    const-string v0, "handleOnBackPressed: ... (1) It is RobloxWebDialogFragment:"

    invoke-static {p2, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/roblox/client/c;->h3()Z

    move-result p2

    if-nez p2, :cond_0

    invoke-virtual {p0}, Lcom/roblox/client/c;->e3()Z

    move-result p0

    if-nez p0, :cond_1

    :cond_0
    iget-object p0, p1, Lak/a0;->e:Lcom/roblox/protocols/webview/WebViewProtocol;

    invoke-virtual {p0}, Lcom/roblox/protocols/webview/WebViewProtocol;->v()V

    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method private final i()Z
    .locals 3

    iget-object v0, p0, Lak/a0;->a:Lj/b;

    invoke-virtual {v0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    const-string v1, "getSupportFragmentManager(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->U0()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return v2

    :cond_0
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->u0()I

    move-result v1

    if-nez v1, :cond_1

    return v2

    :cond_1
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->b1()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/FragmentManager;->c1(Ljava/lang/String;I)V

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->a1()V

    :goto_0
    return v2
.end method


# virtual methods
.method public d(Lnl/a;)V
    .locals 3
    .param p1    # Lnl/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lak/a0;->a:Lj/b;

    invoke-virtual {v0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    const-string v1, "WebDialogFragment_BrowserService"

    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->n0(Ljava/lang/String;)Landroidx/fragment/app/c;

    move-result-object v0

    instance-of v1, v0, Lcom/roblox/client/c;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/roblox/client/c;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    const-string v1, "BrowserServiceAdapter"

    const-string v2, "updateWebView: Found the fragment. Updating..."

    invoke-static {v1, v2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v0, p1}, Lcom/roblox/client/c;->H3(Lnl/a;)V

    :cond_1
    return-void
.end method

.method public e()V
    .locals 2

    const-string v0, "BrowserServiceAdapter"

    const-string v1, "closeWebView:"

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->b1()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lak/a0;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lak/a0;->e:Lcom/roblox/protocols/webview/WebViewProtocol;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/roblox/protocols/webview/WebViewProtocol;->v()V

    :cond_0
    return-void

    :cond_1
    invoke-direct {p0}, Lak/a0;->i()Z

    return-void
.end method

.method public g(Lnl/a;)V
    .locals 8
    .param p1    # Lnl/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "openWebView: params = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "BrowserServiceAdapter"

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p1, Lnl/a;->d:Ljava/lang/Boolean;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v1, Lsg/y0;

    invoke-direct {v1}, Lsg/y0;-><init>()V

    :goto_0
    move-object v3, v1

    goto :goto_1

    :cond_0
    new-instance v1, Lak/a0$a;

    invoke-direct {v1}, Lak/a0$a;-><init>()V

    goto :goto_0

    :goto_1
    invoke-virtual {v3}, Landroidx/fragment/app/c;->a()Landroidx/lifecycle/l;

    move-result-object v1

    new-instance v2, Lwg/b;

    invoke-direct {v2}, Lwg/b;-><init>()V

    invoke-virtual {v1, v2}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    new-instance v2, Lwg/a;

    invoke-direct {v2}, Lwg/a;-><init>()V

    invoke-virtual {v1, v2}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    sget-object v1, Lak/a0;->f:Lak/a0$b;

    iget-object v2, p0, Lak/a0;->d:Lyi/a;

    invoke-virtual {v2}, Lyi/a;->a()Lnu/p0;

    move-result-object v2

    invoke-interface {v2}, Lnu/p0;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-virtual {v1, p1, v2}, Lak/a0$b;->a(Lnl/a;Z)Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v3, p1}, Landroidx/fragment/app/c;->O1(Landroid/os/Bundle;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->b1()Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Lak/y;

    invoke-direct {p1, p0}, Lak/y;-><init>(Lak/a0;)V

    invoke-virtual {v3, p1}, Lcom/roblox/client/c;->B3(Lcom/roblox/client/c$i;)V

    iget-object p1, p0, Lak/a0;->a:Lj/b;

    invoke-virtual {p1}, Le/p;->Q()Le/p0;

    move-result-object v2

    new-instance v5, Lak/z;

    invoke-direct {v5, v3, p0}, Lak/z;-><init>(Lcom/roblox/client/c;Lak/a0;)V

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Le/q0;->b(Le/p0;Landroidx/lifecycle/s;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Le/m0;

    :cond_1
    new-instance p1, Lak/a0$c;

    invoke-direct {p1, p0}, Lak/a0$c;-><init>(Lak/a0;)V

    invoke-virtual {v3, p1}, Lcom/roblox/client/c;->C3(Lcom/roblox/client/c$j;)V

    iget-object p1, p0, Lak/a0;->a:Lj/b;

    invoke-virtual {p1}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    const-string v1, "getSupportFragmentManager(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->r()Landroidx/fragment/app/h;

    move-result-object p1

    if-nez v0, :cond_2

    sget v0, Lsg/g0;->b:I

    sget v1, Lsg/g0;->a:I

    invoke-virtual {p1, v0, v1}, Landroidx/fragment/app/h;->q(II)Landroidx/fragment/app/h;

    :cond_2
    iget v0, p0, Lak/a0;->b:I

    const-string v1, "WebDialogFragment_BrowserService"

    invoke-virtual {p1, v0, v3, v1}, Landroidx/fragment/app/h;->o(ILandroidx/fragment/app/c;Ljava/lang/String;)Landroidx/fragment/app/h;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/fragment/app/h;->f(Ljava/lang/String;)Landroidx/fragment/app/h;

    invoke-virtual {p1}, Landroidx/fragment/app/h;->h()I

    return-void
.end method
