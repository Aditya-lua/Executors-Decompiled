.class public final Lm9/a2;
.super Lf4/q;
.source "SourceFile"

# interfaces
.implements Lm9/j;


# static fields
.field public static final g0:Ljava/util/WeakHashMap;


# instance fields
.field public final f0:Lm9/z1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    sput-object v0, Lm9/a2;->g0:Ljava/util/WeakHashMap;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lf4/q;-><init>()V

    new-instance v0, Lm9/z1;

    invoke-direct {v0}, Lm9/z1;-><init>()V

    iput-object v0, p0, Lm9/a2;->f0:Lm9/z1;

    return-void
.end method

.method public static b2(Lf4/v;)Lm9/a2;
    .locals 5

    const-string v0, "SLifecycleFragmentImpl"

    invoke-virtual {p0}, Lf4/v;->l1()Lf4/k0;

    move-result-object v1

    sget-object v2, Lm9/a2;->g0:Ljava/util/WeakHashMap;

    invoke-virtual {v2, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/ref/WeakReference;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm9/a2;

    if-eqz v3, :cond_0

    return-object v3

    :cond_0
    :try_start_0
    invoke-virtual {v1, v0}, Lf4/k0;->n0(Ljava/lang/String;)Lf4/q;

    move-result-object v3

    check-cast v3, Lm9/a2;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lf4/q;->v0()Z

    move-result v4

    if-eqz v4, :cond_2

    :cond_1
    new-instance v3, Lm9/a2;

    invoke-direct {v3}, Lm9/a2;-><init>()V

    invoke-virtual {v1}, Lf4/k0;->r()Lf4/t0;

    move-result-object v1

    invoke-virtual {v1, v3, v0}, Lf4/t0;->d(Lf4/q;Ljava/lang/String;)Lf4/t0;

    move-result-object v0

    invoke-virtual {v0}, Lf4/t0;->h()I

    :cond_2
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v2, p0, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v3

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl"

    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method


# virtual methods
.method public final A0(IILandroid/content/Intent;)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Lf4/q;->A0(IILandroid/content/Intent;)V

    iget-object v0, p0, Lm9/a2;->f0:Lm9/z1;

    invoke-virtual {v0, p1, p2, p3}, Lm9/z1;->f(IILandroid/content/Intent;)V

    return-void
.end method

.method public final F0(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Lf4/q;->F0(Landroid/os/Bundle;)V

    iget-object v0, p0, Lm9/a2;->f0:Lm9/z1;

    invoke-virtual {v0, p1}, Lm9/z1;->c(Landroid/os/Bundle;)V

    return-void
.end method

.method public final K0()V
    .locals 1

    invoke-super {p0}, Lf4/q;->K0()V

    iget-object v0, p0, Lm9/a2;->f0:Lm9/z1;

    invoke-virtual {v0}, Lm9/z1;->i()V

    return-void
.end method

.method public final a1()V
    .locals 1

    invoke-super {p0}, Lf4/q;->a1()V

    iget-object v0, p0, Lm9/a2;->f0:Lm9/z1;

    invoke-virtual {v0}, Lm9/z1;->e()V

    return-void
.end method

.method public final b1(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Lf4/q;->b1(Landroid/os/Bundle;)V

    iget-object v0, p0, Lm9/a2;->f0:Lm9/z1;

    invoke-virtual {v0, p1}, Lm9/z1;->g(Landroid/os/Bundle;)V

    return-void
.end method

.method public final c1()V
    .locals 1

    invoke-super {p0}, Lf4/q;->c1()V

    iget-object v0, p0, Lm9/a2;->f0:Lm9/z1;

    invoke-virtual {v0}, Lm9/z1;->d()V

    return-void
.end method

.method public final d(Ljava/lang/String;Ljava/lang/Class;)Lm9/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lm9/i;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    iget-object v0, p0, Lm9/a2;->f0:Lm9/z1;

    invoke-virtual {v0, p1, p2}, Lm9/z1;->a(Ljava/lang/String;Ljava/lang/Class;)Lm9/i;

    move-result-object p1

    return-object p1
.end method

.method public final d1()V
    .locals 1

    invoke-super {p0}, Lf4/q;->d1()V

    iget-object v0, p0, Lm9/a2;->f0:Lm9/z1;

    invoke-virtual {v0}, Lm9/z1;->h()V

    return-void
.end method

.method public final f(Ljava/lang/String;Lm9/i;)V
    .locals 1
    .param p2    # Lm9/i;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lm9/a2;->f0:Lm9/z1;

    invoke-virtual {v0, p1, p2}, Lm9/z1;->b(Ljava/lang/String;Lm9/i;)V

    return-void
.end method

.method public final g()Landroid/app/Activity;
    .locals 1

    invoke-virtual {p0}, Lf4/q;->p()Lf4/v;

    move-result-object v0

    return-object v0
.end method

.method public final l(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 1

    invoke-super {p0, p1, p2, p3, p4}, Lf4/q;->l(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    iget-object v0, p0, Lm9/a2;->f0:Lm9/z1;

    invoke-virtual {v0, p1, p2, p3, p4}, Lm9/z1;->j(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    return-void
.end method
