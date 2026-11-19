.class public Lqi/b;
.super Lal/d;
.source "SourceFile"


# instance fields
.field public d:Lnh/j;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lal/d;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lqi/b;->d:Lnh/j;

    invoke-super {p0}, Lal/d;->a()V

    return-void
.end method

.method public d(Landroid/content/Context;)V
    .locals 1

    invoke-super {p0, p1}, Lal/d;->d(Landroid/content/Context;)V

    new-instance p1, Lnh/j;

    invoke-direct {p1}, Lnh/j;-><init>()V

    iput-object p1, p0, Lqi/b;->d:Lnh/j;

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->N0()I

    move-result v0

    invoke-virtual {p1, v0}, Lnh/j;->a(I)V

    return-void
.end method

.method public g(Landroid/content/Context;)V
    .locals 1

    new-instance v0, Lri/o;

    invoke-direct {v0}, Lri/o;-><init>()V

    invoke-virtual {p0, v0}, Lal/d;->f(Lal/b;)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->G5()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lri/d;

    invoke-direct {v0}, Lri/d;-><init>()V

    invoke-virtual {p0, v0}, Lal/d;->f(Lal/b;)V

    :cond_0
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->A()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lri/a;

    invoke-direct {v0}, Lri/a;-><init>()V

    invoke-virtual {p0, v0}, Lal/d;->f(Lal/b;)V

    :cond_1
    new-instance v0, Lri/e;

    invoke-direct {v0}, Lri/e;-><init>()V

    invoke-virtual {p0, v0}, Lal/d;->f(Lal/b;)V

    new-instance v0, Lri/b;

    invoke-direct {v0}, Lri/b;-><init>()V

    invoke-virtual {p0, v0}, Lal/d;->f(Lal/b;)V

    new-instance v0, Lri/m;

    invoke-direct {v0}, Lri/m;-><init>()V

    invoke-virtual {p0, v0}, Lal/d;->f(Lal/b;)V

    new-instance v0, Lri/l;

    invoke-direct {v0, p1}, Lri/l;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0}, Lal/d;->f(Lal/b;)V

    new-instance p1, Lri/h;

    invoke-direct {p1}, Lri/h;-><init>()V

    invoke-virtual {p0, p1}, Lal/d;->f(Lal/b;)V

    new-instance p1, Lri/j;

    invoke-direct {p1}, Lri/j;-><init>()V

    invoke-virtual {p0, p1}, Lal/d;->f(Lal/b;)V

    new-instance p1, Lri/g;

    invoke-direct {p1}, Lri/g;-><init>()V

    invoke-virtual {p0, p1}, Lal/d;->f(Lal/b;)V

    return-void
.end method

.method public h()V
    .locals 0

    return-void
.end method

.method public i()V
    .locals 1

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->V2()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Leh/v0;->t()V

    :cond_0
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->Q2()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lqi/b;->a()V

    :cond_1
    return-void
.end method

.method public onFilterTouchEventForSecurity(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object v0, p0, Lqi/b;->d:Lnh/j;

    invoke-virtual {v0, p1}, Lnh/j;->b(Landroid/view/MotionEvent;)Z

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
