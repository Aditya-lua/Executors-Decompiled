.class public final Lf4/f$g$b$a;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf4/f$g$b;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "",
        "d",
        "()V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic i:Lf4/f$g;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>(Lf4/f$g;Ljava/lang/Object;Landroid/view/ViewGroup;)V
    .locals 0

    iput-object p1, p0, Lf4/f$g$b$a;->i:Lf4/f$g;

    iput-object p2, p0, Lf4/f$g$b$a;->j:Ljava/lang/Object;

    iput-object p3, p0, Lf4/f$g$b$a;->k:Landroid/view/ViewGroup;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lf4/f$g;Landroid/view/ViewGroup;)V
    .locals 0

    invoke-static {p0, p1}, Lf4/f$g$b$a;->f(Lf4/f$g;Landroid/view/ViewGroup;)V

    return-void
.end method

.method public static synthetic b(Lf4/f$g;)V
    .locals 0

    invoke-static {p0}, Lf4/f$g$b$a;->h(Lf4/f$g;)V

    return-void
.end method

.method public static final f(Lf4/f$g;Landroid/view/ViewGroup;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lf4/f$g;->w()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf4/f$h;

    invoke-virtual {v0}, Lf4/f$f;->a()Lf4/c1$d;

    move-result-object v0

    invoke-virtual {v0}, Lf4/c1$d;->h()Lf4/q;

    move-result-object v1

    invoke-virtual {v1}, Lf4/q;->j0()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lf4/c1$d;->g()Lf4/c1$d$b;

    move-result-object v0

    invoke-virtual {v0, v1, p1}, Lf4/c1$d$b;->b(Landroid/view/View;Landroid/view/ViewGroup;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static final h(Lf4/f$g;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    invoke-static {v0}, Lf4/k0;->N0(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "FragmentManager"

    const-string v1, "Transition for all operations has completed"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-virtual {p0}, Lf4/f$g;->w()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf4/f$h;

    invoke-virtual {v1}, Lf4/f$f;->a()Lf4/c1$d;

    move-result-object v1

    invoke-virtual {v1, p0}, Lf4/c1$d;->e(Lf4/c1$b;)V

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public final d()V
    .locals 6

    iget-object v0, p0, Lf4/f$g$b$a;->i:Lf4/f$g;

    invoke-virtual {v0}, Lf4/f$g;->w()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    const-string v2, "FragmentManager"

    const/4 v3, 0x2

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf4/f$h;

    invoke-virtual {v1}, Lf4/f$f;->a()Lf4/c1$d;

    move-result-object v1

    invoke-virtual {v1}, Lf4/c1$d;->m()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v3}, Lf4/k0;->N0(I)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "Completing animating immediately"

    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    new-instance v0, Lu2/e;

    invoke-direct {v0}, Lu2/e;-><init>()V

    iget-object v1, p0, Lf4/f$g$b$a;->i:Lf4/f$g;

    invoke-virtual {v1}, Lf4/f$g;->v()Lf4/w0;

    move-result-object v1

    iget-object v2, p0, Lf4/f$g$b$a;->i:Lf4/f$g;

    invoke-virtual {v2}, Lf4/f$g;->w()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf4/f$h;

    invoke-virtual {v2}, Lf4/f$f;->a()Lf4/c1$d;

    move-result-object v2

    invoke-virtual {v2}, Lf4/c1$d;->h()Lf4/q;

    move-result-object v2

    iget-object v3, p0, Lf4/f$g$b$a;->j:Ljava/lang/Object;

    iget-object v4, p0, Lf4/f$g$b$a;->i:Lf4/f$g;

    new-instance v5, Lf4/n;

    invoke-direct {v5, v4}, Lf4/n;-><init>(Lf4/f$g;)V

    invoke-virtual {v1, v2, v3, v0, v5}, Lf4/w0;->w(Lf4/q;Ljava/lang/Object;Lu2/e;Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lu2/e;->a()V

    return-void

    :cond_3
    :goto_0
    invoke-static {v3}, Lf4/k0;->N0(I)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "Animating to start"

    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    iget-object v0, p0, Lf4/f$g$b$a;->i:Lf4/f$g;

    invoke-virtual {v0}, Lf4/f$g;->v()Lf4/w0;

    move-result-object v0

    iget-object v1, p0, Lf4/f$g$b$a;->i:Lf4/f$g;

    invoke-virtual {v1}, Lf4/f$g;->s()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v2, p0, Lf4/f$g$b$a;->i:Lf4/f$g;

    iget-object v3, p0, Lf4/f$g$b$a;->k:Landroid/view/ViewGroup;

    new-instance v4, Lf4/m;

    invoke-direct {v4, v2, v3}, Lf4/m;-><init>(Lf4/f$g;Landroid/view/ViewGroup;)V

    invoke-virtual {v0, v1, v4}, Lf4/w0;->d(Ljava/lang/Object;Ljava/lang/Runnable;)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lf4/f$g$b$a;->d()V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method
