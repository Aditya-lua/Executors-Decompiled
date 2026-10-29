.class public Lcom/roblox/client/hybrid/RBHybridWebView;
.super Ltk/d;
.source "SourceFile"


# instance fields
.field public d:Leh/j;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Ltk/d;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ltk/d;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roblox/client/hybrid/RBHybridWebView;->d:Leh/j;

    invoke-super {p0}, Ltk/d;->a()V

    return-void
.end method

.method public d(Landroid/content/Context;)V
    .locals 1

    invoke-super {p0, p1}, Ltk/d;->d(Landroid/content/Context;)V

    new-instance p1, Leh/j;

    invoke-direct {p1}, Leh/j;-><init>()V

    iput-object p1, p0, Lcom/roblox/client/hybrid/RBHybridWebView;->d:Leh/j;

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->H0()I

    move-result v0

    invoke-virtual {p1, v0}, Leh/j;->a(I)V

    return-void
.end method

.method public g(Landroid/content/Context;)V
    .locals 1

    new-instance v0, Lji/o;

    invoke-direct {v0}, Lji/o;-><init>()V

    invoke-virtual {p0, v0}, Ltk/d;->f(Ltk/b;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->D5()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lji/d;

    invoke-direct {v0}, Lji/d;-><init>()V

    invoke-virtual {p0, v0}, Ltk/d;->f(Ltk/b;)V

    :cond_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->B()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lji/a;

    invoke-direct {v0}, Lji/a;-><init>()V

    invoke-virtual {p0, v0}, Ltk/d;->f(Ltk/b;)V

    :cond_1
    new-instance v0, Lji/e;

    invoke-direct {v0}, Lji/e;-><init>()V

    invoke-virtual {p0, v0}, Ltk/d;->f(Ltk/b;)V

    new-instance v0, Lji/b;

    invoke-direct {v0}, Lji/b;-><init>()V

    invoke-virtual {p0, v0}, Ltk/d;->f(Ltk/b;)V

    new-instance v0, Lji/m;

    invoke-direct {v0}, Lji/m;-><init>()V

    invoke-virtual {p0, v0}, Ltk/d;->f(Ltk/b;)V

    new-instance v0, Lji/l;

    invoke-direct {v0, p1}, Lji/l;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0}, Ltk/d;->f(Ltk/b;)V

    new-instance p1, Lji/h;

    invoke-direct {p1}, Lji/h;-><init>()V

    invoke-virtual {p0, p1}, Ltk/d;->f(Ltk/b;)V

    new-instance p1, Lji/j;

    invoke-direct {p1}, Lji/j;-><init>()V

    invoke-virtual {p0, p1}, Ltk/d;->f(Ltk/b;)V

    new-instance p1, Lji/g;

    invoke-direct {p1}, Lji/g;-><init>()V

    invoke-virtual {p0, p1}, Ltk/d;->f(Ltk/b;)V

    return-void
.end method

.method public h()V
    .locals 0

    return-void
.end method

.method public i()V
    .locals 1

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->O2()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lvg/c0;->t()V

    :cond_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->J2()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/roblox/client/hybrid/RBHybridWebView;->a()V

    :cond_1
    return-void
.end method

.method public onFilterTouchEventForSecurity(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/hybrid/RBHybridWebView;->d:Leh/j;

    invoke-virtual {v0, p1}, Leh/j;->b(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/View;->onFilterTouchEventForSecurity(Landroid/view/MotionEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
