.class public final Lik/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfh/b$d;
.implements Lcom/roblox/protocols/webview/a$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lik/a0$a;,
        Lik/a0$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0002\u0018\u001aB+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u001eR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010 \u00a8\u0006#"
    }
    d2 = {
        "Lik/a0;",
        "Lfh/b$d;",
        "Lcom/roblox/protocols/webview/a$d;",
        "Lj/b;",
        "activity",
        "",
        "containerViewId",
        "Lym/g;",
        "linkingProtocol",
        "Lgj/a;",
        "nativeViewModel",
        "<init>",
        "(Lj/b;ILym/g;Lgj/a;)V",
        "",
        "i",
        "()Z",
        "Lbm/a;",
        "params",
        "",
        "d",
        "(Lbm/a;)V",
        "g",
        "e",
        "()V",
        "a",
        "Lj/b;",
        "b",
        "I",
        "c",
        "Lym/g;",
        "Lgj/a;",
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
.field public static final f:Lik/a0$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lj/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:I

.field public final c:Lym/g;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lgj/a;
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

    new-instance v0, Lik/a0$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lik/a0$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lik/a0;->f:Lik/a0$b;

    return-void
.end method

.method public constructor <init>(Lj/b;ILym/g;Lgj/a;)V
    .locals 1
    .param p1    # Lj/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lym/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lgj/a;
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
    iput-object p1, p0, Lik/a0;->a:Lj/b;

    .line 3
    iput p2, p0, Lik/a0;->b:I

    .line 4
    iput-object p3, p0, Lik/a0;->c:Lym/g;

    .line 5
    iput-object p4, p0, Lik/a0;->d:Lgj/a;

    .line 6
    new-instance p1, Lcom/roblox/protocols/webview/WebViewProtocol;

    invoke-direct {p1, p0}, Lcom/roblox/protocols/webview/WebViewProtocol;-><init>(Lcom/roblox/protocols/webview/a$d;)V

    iput-object p1, p0, Lik/a0;->e:Lcom/roblox/protocols/webview/WebViewProtocol;

    return-void
.end method

.method public synthetic constructor <init>(Lj/b;ILym/g;Lgj/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    .line 7
    invoke-static {}, Lym/g;->G()Lym/g;

    move-result-object p3

    const-string p6, "sharedInstance(...)"

    invoke-static {p3, p6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    .line 8
    sget-object p4, Lgj/a;->a:Lgj/a;

    .line 9
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lik/a0;-><init>(Lj/b;ILym/g;Lgj/a;)V

    return-void
.end method

.method public static synthetic a(Lik/a0;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lik/a0;->f(Lik/a0;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Lcom/roblox/client/c;Lik/a0;Le/m0;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lik/a0;->h(Lcom/roblox/client/c;Lik/a0;Le/m0;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lik/a0;)Lym/g;
    .locals 0

    iget-object p0, p0, Lik/a0;->c:Lym/g;

    return-object p0
.end method

.method public static final f(Lik/a0;Ljava/lang/String;)V
    .locals 0

    iget-object p0, p0, Lik/a0;->e:Lcom/roblox/protocols/webview/WebViewProtocol;

    invoke-virtual {p0, p1}, Lcom/roblox/protocols/webview/WebViewProtocol;->s(Ljava/lang/String;)V

    return-void
.end method

.method public static final h(Lcom/roblox/client/c;Lik/a0;Le/m0;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$addCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "BrowserServiceAdapter"

    const-string v0, "handleOnBackPressed: ... (1) It is RobloxWebDialogFragment:"

    invoke-static {p2, v0}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/roblox/client/c;->h3()Z

    move-result p2

    if-nez p2, :cond_0

    invoke-virtual {p0}, Lcom/roblox/client/c;->e3()Z

    move-result p0

    if-nez p0, :cond_1

    :cond_0
    iget-object p0, p1, Lik/a0;->e:Lcom/roblox/protocols/webview/WebViewProtocol;

    invoke-virtual {p0}, Lcom/roblox/protocols/webview/WebViewProtocol;->t()V

    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method private final i()Z
    .locals 3

    iget-object v0, p0, Lik/a0;->a:Lj/b;

    invoke-virtual {v0}, Lf4/v;->l1()Lf4/k0;

    move-result-object v0

    const-string v1, "getSupportFragmentManager(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lf4/k0;->U0()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return v2

    :cond_0
    invoke-virtual {v0}, Lf4/k0;->u0()I

    move-result v1

    if-nez v1, :cond_1

    return v2

    :cond_1
    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lf4/k0;->c1(Ljava/lang/String;I)V

    return v2
.end method


# virtual methods
.method public d(Lbm/a;)V
    .locals 8
    .param p1    # Lbm/a;
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

    invoke-static {v1, v0}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p1, Lbm/a;->d:Ljava/lang/Boolean;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v1, Lbh/y0;

    invoke-direct {v1}, Lbh/y0;-><init>()V

    :goto_0
    move-object v3, v1

    goto :goto_1

    :cond_0
    new-instance v1, Lik/a0$a;

    invoke-direct {v1}, Lik/a0$a;-><init>()V

    goto :goto_0

    :goto_1
    invoke-virtual {v3}, Lf4/q;->a()Landroidx/lifecycle/l;

    move-result-object v1

    new-instance v2, Lfh/a;

    invoke-direct {v2}, Lfh/a;-><init>()V

    invoke-virtual {v1, v2}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    sget-object v1, Lik/a0;->f:Lik/a0$b;

    iget-object v2, p0, Lik/a0;->d:Lgj/a;

    invoke-virtual {v2}, Lgj/a;->a()Ldv/p0;

    move-result-object v2

    invoke-interface {v2}, Ldv/p0;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-virtual {v1, p1, v2}, Lik/a0$b;->a(Lbm/a;Z)Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v3, p1}, Lf4/q;->O1(Landroid/os/Bundle;)V

    new-instance p1, Lik/y;

    invoke-direct {p1, p0}, Lik/y;-><init>(Lik/a0;)V

    invoke-virtual {v3, p1}, Lcom/roblox/client/c;->B3(Lcom/roblox/client/c$i;)V

    iget-object p1, p0, Lik/a0;->a:Lj/b;

    invoke-virtual {p1}, Le/p;->P()Le/p0;

    move-result-object v2

    new-instance v5, Lik/z;

    invoke-direct {v5, v3, p0}, Lik/z;-><init>(Lcom/roblox/client/c;Lik/a0;)V

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Le/q0;->b(Le/p0;Landroidx/lifecycle/s;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Le/m0;

    new-instance p1, Lik/a0$c;

    invoke-direct {p1, p0}, Lik/a0$c;-><init>(Lik/a0;)V

    invoke-virtual {v3, p1}, Lcom/roblox/client/c;->C3(Lcom/roblox/client/c$j;)V

    iget-object p1, p0, Lik/a0;->a:Lj/b;

    invoke-virtual {p1}, Lf4/v;->l1()Lf4/k0;

    move-result-object p1

    const-string v1, "getSupportFragmentManager(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lf4/k0;->r()Lf4/t0;

    move-result-object p1

    if-nez v0, :cond_1

    sget v0, Lbh/g0;->b:I

    sget v1, Lbh/g0;->a:I

    invoke-virtual {p1, v0, v1}, Lf4/t0;->q(II)Lf4/t0;

    :cond_1
    iget v0, p0, Lik/a0;->b:I

    const-string v1, "WebDialogFragment_BrowserService"

    invoke-virtual {p1, v0, v3, v1}, Lf4/t0;->o(ILf4/q;Ljava/lang/String;)Lf4/t0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lf4/t0;->f(Ljava/lang/String;)Lf4/t0;

    invoke-virtual {p1}, Lf4/t0;->h()I

    return-void
.end method

.method public e()V
    .locals 2

    const-string v0, "BrowserServiceAdapter"

    const-string v1, "closeWebView:"

    invoke-static {v0, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-direct {p0}, Lik/a0;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lik/a0;->e:Lcom/roblox/protocols/webview/WebViewProtocol;

    invoke-virtual {v0}, Lcom/roblox/protocols/webview/WebViewProtocol;->t()V

    :cond_0
    return-void
.end method

.method public g(Lbm/a;)V
    .locals 3
    .param p1    # Lbm/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lik/a0;->a:Lj/b;

    invoke-virtual {v0}, Lf4/v;->l1()Lf4/k0;

    move-result-object v0

    const-string v1, "WebDialogFragment_BrowserService"

    invoke-virtual {v0, v1}, Lf4/k0;->n0(Ljava/lang/String;)Lf4/q;

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

    invoke-static {v1, v2}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v0, p1}, Lcom/roblox/client/c;->H3(Lbm/a;)V

    :cond_1
    return-void
.end method
