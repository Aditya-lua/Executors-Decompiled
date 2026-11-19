.class public Landroidx/camera/view/PreviewView$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg0/a2$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/view/PreviewView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroidx/camera/view/PreviewView;


# direct methods
.method public constructor <init>(Landroidx/camera/view/PreviewView;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/view/PreviewView$a;->a:Landroidx/camera/view/PreviewView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(Landroidx/camera/view/PreviewView$a;Lg0/v2;)V
    .locals 0

    iget-object p0, p0, Landroidx/camera/view/PreviewView$a;->a:Landroidx/camera/view/PreviewView;

    iget-object p0, p0, Landroidx/camera/view/PreviewView;->o:Lg0/a2$c;

    invoke-interface {p0, p1}, Lg0/a2$c;->a(Lg0/v2;)V

    return-void
.end method

.method public static synthetic c(Landroidx/camera/view/PreviewView$a;Landroidx/camera/view/a;Ln0/p0;)V
    .locals 1

    iget-object p0, p0, Landroidx/camera/view/PreviewView$a;->a:Landroidx/camera/view/PreviewView;

    iget-object p0, p0, Landroidx/camera/view/PreviewView;->g:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lp1/t;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, Landroidx/camera/view/PreviewView$e;->a:Landroidx/camera/view/PreviewView$e;

    invoke-virtual {p1, p0}, Landroidx/camera/view/a;->i(Landroidx/camera/view/PreviewView$e;)V

    :cond_0
    invoke-virtual {p1}, Landroidx/camera/view/a;->f()V

    invoke-interface {p2}, Ln0/p0;->b()Ln0/a3;

    move-result-object p0

    invoke-interface {p0, p1}, Ln0/a3;->d(Ln0/a3$a;)V

    return-void
.end method

.method public static synthetic d(Landroidx/camera/view/PreviewView$a;Ln0/p0;Lg0/v2;Lg0/v2$h;)V
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Preview transformation info updated. "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "PreviewView"

    invoke-static {v1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1}, Ln0/p0;->k()Ln0/o0;

    move-result-object p1

    invoke-interface {p1}, Lg0/t;->i()I

    move-result p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p1, :cond_0

    move p1, v1

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    iget-object v2, p0, Landroidx/camera/view/PreviewView$a;->a:Landroidx/camera/view/PreviewView;

    iget-object v2, v2, Landroidx/camera/view/PreviewView;->d:Landroidx/camera/view/b;

    invoke-virtual {p2}, Lg0/v2;->q()Landroid/util/Size;

    move-result-object p2

    invoke-virtual {v2, p3, p2, p1}, Landroidx/camera/view/b;->r(Lg0/v2$h;Landroid/util/Size;Z)V

    invoke-virtual {p3}, Lg0/v2$h;->d()I

    move-result p1

    const/4 p2, -0x1

    if-eq p1, p2, :cond_2

    iget-object p1, p0, Landroidx/camera/view/PreviewView$a;->a:Landroidx/camera/view/PreviewView;

    iget-object p2, p1, Landroidx/camera/view/PreviewView;->b:Landroidx/camera/view/c;

    if-eqz p2, :cond_1

    instance-of p2, p2, Landroidx/camera/view/d;

    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    iput-boolean v0, p1, Landroidx/camera/view/PreviewView;->e:Z

    goto :goto_2

    :cond_2
    :goto_1
    iget-object p1, p0, Landroidx/camera/view/PreviewView$a;->a:Landroidx/camera/view/PreviewView;

    iput-boolean v1, p1, Landroidx/camera/view/PreviewView;->e:Z

    :goto_2
    iget-object p0, p0, Landroidx/camera/view/PreviewView$a;->a:Landroidx/camera/view/PreviewView;

    invoke-virtual {p0}, Landroidx/camera/view/PreviewView;->e()V

    return-void
.end method


# virtual methods
.method public a(Lg0/v2;)V
    .locals 5

    invoke-static {}, Lp0/z;->d()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/camera/view/PreviewView$a;->a:Landroidx/camera/view/PreviewView;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Ll2/b;->i(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lp1/u;

    invoke-direct {v1, p0, p1}, Lp1/u;-><init>(Landroidx/camera/view/PreviewView$a;Lg0/v2;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    const-string v0, "PreviewView"

    const-string v1, "Surface requested by Preview."

    invoke-static {v0, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lg0/v2;->m()Ln0/p0;

    move-result-object v0

    iget-object v1, p0, Landroidx/camera/view/PreviewView$a;->a:Landroidx/camera/view/PreviewView;

    invoke-interface {v0}, Ln0/p0;->k()Ln0/o0;

    move-result-object v2

    iput-object v2, v1, Landroidx/camera/view/PreviewView;->k:Ln0/o0;

    iget-object v1, p0, Landroidx/camera/view/PreviewView$a;->a:Landroidx/camera/view/PreviewView;

    iget-object v1, v1, Landroidx/camera/view/PreviewView;->i:Lp1/x;

    invoke-interface {v0}, Ln0/p0;->k()Ln0/o0;

    move-result-object v2

    invoke-interface {v2}, Ln0/o0;->h()Landroid/graphics/Rect;

    move-result-object v2

    invoke-virtual {v1, v2}, Lp1/x;->g(Landroid/graphics/Rect;)V

    iget-object v1, p0, Landroidx/camera/view/PreviewView$a;->a:Landroidx/camera/view/PreviewView;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Ll2/b;->i(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object v1

    new-instance v2, Lp1/v;

    invoke-direct {v2, p0, v0, p1}, Lp1/v;-><init>(Landroidx/camera/view/PreviewView$a;Ln0/p0;Lg0/v2;)V

    invoke-virtual {p1, v1, v2}, Lg0/v2;->x(Ljava/util/concurrent/Executor;Lg0/v2$i;)V

    iget-object v1, p0, Landroidx/camera/view/PreviewView$a;->a:Landroidx/camera/view/PreviewView;

    iget-object v2, v1, Landroidx/camera/view/PreviewView;->b:Landroidx/camera/view/c;

    iget-object v1, v1, Landroidx/camera/view/PreviewView;->a:Landroidx/camera/view/PreviewView$c;

    invoke-static {v2, p1, v1}, Landroidx/camera/view/PreviewView;->f(Landroidx/camera/view/c;Lg0/v2;Landroidx/camera/view/PreviewView$c;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Landroidx/camera/view/PreviewView$a;->a:Landroidx/camera/view/PreviewView;

    iget-object v2, v1, Landroidx/camera/view/PreviewView;->a:Landroidx/camera/view/PreviewView$c;

    invoke-static {p1, v2}, Landroidx/camera/view/PreviewView;->g(Lg0/v2;Landroidx/camera/view/PreviewView$c;)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v2, Landroidx/camera/view/e;

    iget-object v3, p0, Landroidx/camera/view/PreviewView$a;->a:Landroidx/camera/view/PreviewView;

    iget-object v4, v3, Landroidx/camera/view/PreviewView;->d:Landroidx/camera/view/b;

    invoke-direct {v2, v3, v4}, Landroidx/camera/view/e;-><init>(Landroid/widget/FrameLayout;Landroidx/camera/view/b;)V

    goto :goto_0

    :cond_1
    new-instance v2, Landroidx/camera/view/d;

    iget-object v3, p0, Landroidx/camera/view/PreviewView$a;->a:Landroidx/camera/view/PreviewView;

    iget-object v4, v3, Landroidx/camera/view/PreviewView;->d:Landroidx/camera/view/b;

    invoke-direct {v2, v3, v4}, Landroidx/camera/view/d;-><init>(Landroid/widget/FrameLayout;Landroidx/camera/view/b;)V

    :goto_0
    iput-object v2, v1, Landroidx/camera/view/PreviewView;->b:Landroidx/camera/view/c;

    :cond_2
    new-instance v1, Landroidx/camera/view/a;

    invoke-interface {v0}, Ln0/p0;->k()Ln0/o0;

    move-result-object v2

    iget-object v3, p0, Landroidx/camera/view/PreviewView$a;->a:Landroidx/camera/view/PreviewView;

    iget-object v4, v3, Landroidx/camera/view/PreviewView;->f:Landroidx/lifecycle/d0;

    iget-object v3, v3, Landroidx/camera/view/PreviewView;->b:Landroidx/camera/view/c;

    invoke-direct {v1, v2, v4, v3}, Landroidx/camera/view/a;-><init>(Ln0/o0;Landroidx/lifecycle/d0;Landroidx/camera/view/c;)V

    iget-object v2, p0, Landroidx/camera/view/PreviewView$a;->a:Landroidx/camera/view/PreviewView;

    iget-object v2, v2, Landroidx/camera/view/PreviewView;->g:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    invoke-interface {v0}, Ln0/p0;->b()Ln0/a3;

    move-result-object v2

    iget-object v3, p0, Landroidx/camera/view/PreviewView$a;->a:Landroidx/camera/view/PreviewView;

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Ll2/b;->i(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Ln0/a3;->c(Ljava/util/concurrent/Executor;Ln0/a3$a;)V

    iget-object v2, p0, Landroidx/camera/view/PreviewView$a;->a:Landroidx/camera/view/PreviewView;

    iget-object v2, v2, Landroidx/camera/view/PreviewView;->b:Landroidx/camera/view/c;

    new-instance v3, Lp1/w;

    invoke-direct {v3, p0, v1, v0}, Lp1/w;-><init>(Landroidx/camera/view/PreviewView$a;Landroidx/camera/view/a;Ln0/p0;)V

    invoke-virtual {v2, p1, v3}, Landroidx/camera/view/c;->g(Lg0/v2;Landroidx/camera/view/c$a;)V

    iget-object p1, p0, Landroidx/camera/view/PreviewView$a;->a:Landroidx/camera/view/PreviewView;

    iget-object v0, p1, Landroidx/camera/view/PreviewView;->c:Lp1/f0;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_3

    iget-object p1, p0, Landroidx/camera/view/PreviewView$a;->a:Landroidx/camera/view/PreviewView;

    iget-object v0, p1, Landroidx/camera/view/PreviewView;->c:Lp1/f0;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_3
    iget-object p1, p0, Landroidx/camera/view/PreviewView$a;->a:Landroidx/camera/view/PreviewView;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method
