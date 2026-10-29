.class public Lo5/y;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo5/y$a;
    }
.end annotation


# static fields
.field public static a:Lo5/q;

.field public static b:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/lang/ref/WeakReference<",
            "Lw1/a<",
            "Landroid/view/ViewGroup;",
            "Ljava/util/ArrayList<",
            "Lo5/q;",
            ">;>;>;>;"
        }
    .end annotation
.end field

.field public static c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/view/ViewGroup;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo5/a;

    invoke-direct {v0}, Lo5/a;-><init>()V

    sput-object v0, Lo5/y;->a:Lo5/q;

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Lo5/y;->b:Ljava/lang/ThreadLocal;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lo5/y;->c:Ljava/util/ArrayList;

    return-void
.end method

.method public static a(Landroid/view/ViewGroup;Lo5/q;)V
    .locals 1
    .param p0    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Lo5/y;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->isLaidOut()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lo5/y;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-nez p1, :cond_0

    sget-object p1, Lo5/y;->a:Lo5/q;

    :cond_0
    invoke-virtual {p1}, Lo5/q;->r()Lo5/q;

    move-result-object p1

    invoke-static {p0, p1}, Lo5/y;->h(Landroid/view/ViewGroup;Lo5/q;)V

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lo5/n;->f(Landroid/view/ViewGroup;Lo5/n;)V

    invoke-static {p0, p1}, Lo5/y;->g(Landroid/view/ViewGroup;Lo5/q;)V

    :cond_1
    return-void
.end method

.method public static b(Lo5/n;Lo5/q;)V
    .locals 3

    invoke-virtual {p0}, Lo5/n;->d()Landroid/view/ViewGroup;

    move-result-object v0

    sget-object v1, Lo5/y;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-static {v0}, Lo5/n;->c(Landroid/view/ViewGroup;)Lo5/n;

    move-result-object v1

    if-nez p1, :cond_1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lo5/n;->b()V

    :cond_0
    invoke-virtual {p0}, Lo5/n;->a()V

    return-void

    :cond_1
    sget-object v2, Lo5/y;->c:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lo5/q;->r()Lo5/q;

    move-result-object p1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lo5/n;->e()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Lo5/q;->r0(Z)V

    :cond_2
    invoke-static {v0, p1}, Lo5/y;->h(Landroid/view/ViewGroup;Lo5/q;)V

    invoke-virtual {p0}, Lo5/n;->a()V

    invoke-static {v0, p1}, Lo5/y;->g(Landroid/view/ViewGroup;Lo5/q;)V

    :cond_3
    return-void
.end method

.method public static c(Landroid/view/ViewGroup;Lo5/q;)Lo5/a0;
    .locals 3
    .param p0    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lo5/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Lo5/y;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->isLaidOut()Z

    move-result v0

    if-eqz v0, :cond_2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x22

    if-ge v0, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lo5/q;->Y()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lo5/y;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lo5/q;->r()Lo5/q;

    move-result-object p1

    new-instance v0, Lo5/b0;

    invoke-direct {v0}, Lo5/b0;-><init>()V

    invoke-virtual {v0, p1}, Lo5/b0;->D0(Lo5/q;)Lo5/b0;

    invoke-static {p0, v0}, Lo5/y;->h(Landroid/view/ViewGroup;Lo5/q;)V

    invoke-static {p0, v1}, Lo5/n;->f(Landroid/view/ViewGroup;Lo5/n;)V

    invoke-static {p0, v0}, Lo5/y;->g(Landroid/view/ViewGroup;Lo5/q;)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    invoke-virtual {v0}, Lo5/q;->v()Lo5/a0;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "The Transition must support seeking."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    :goto_0
    return-object v1
.end method

.method public static d(Landroid/view/ViewGroup;)V
    .locals 3

    sget-object v0, Lo5/y;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-static {}, Lo5/y;->e()Lw1/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lw1/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo5/q;

    invoke-virtual {v2, p0}, Lo5/q;->x(Landroid/view/ViewGroup;)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static e()Lw1/a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lw1/a<",
            "Landroid/view/ViewGroup;",
            "Ljava/util/ArrayList<",
            "Lo5/q;",
            ">;>;"
        }
    .end annotation

    sget-object v0, Lo5/y;->b:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw1/a;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lw1/a;

    invoke-direct {v0}, Lw1/a;-><init>()V

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sget-object v2, Lo5/y;->b:Ljava/lang/ThreadLocal;

    invoke-virtual {v2, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static f(Lo5/n;Lo5/q;)V
    .locals 0
    .param p0    # Lo5/n;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p0, p1}, Lo5/y;->b(Lo5/n;Lo5/q;)V

    return-void
.end method

.method public static g(Landroid/view/ViewGroup;Lo5/q;)V
    .locals 1

    if-eqz p1, :cond_0

    if-eqz p0, :cond_0

    new-instance v0, Lo5/y$a;

    invoke-direct {v0, p1, p0}, Lo5/y$a;-><init>(Lo5/q;Landroid/view/ViewGroup;)V

    invoke-virtual {p0, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    :cond_0
    return-void
.end method

.method public static h(Landroid/view/ViewGroup;Lo5/q;)V
    .locals 4

    invoke-static {}, Lo5/y;->e()Lw1/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lw1/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v2, v2, 0x1

    check-cast v3, Lo5/q;

    invoke-virtual {v3, p0}, Lo5/q;->j0(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    const/4 v0, 0x1

    invoke-virtual {p1, p0, v0}, Lo5/q;->p(Landroid/view/ViewGroup;Z)V

    :cond_1
    invoke-static {p0}, Lo5/n;->c(Landroid/view/ViewGroup;)Lo5/n;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lo5/n;->b()V

    :cond_2
    return-void
.end method
