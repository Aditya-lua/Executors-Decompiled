.class public abstract Lk9/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk9/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk9/e$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<O::",
        "Lk9/a$d;",
        ">",
        "Ljava/lang/Object;",
        "Lk9/g<",
        "TO;>;"
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public final c:Lk9/a;

.field public final d:Lk9/a$d;

.field public final e:Ll9/b;

.field public final f:Landroid/os/Looper;

.field public final g:I

.field public final h:Lk9/f;

.field public final i:Ll9/s;

.field public final j:Ll9/f;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lk9/a;Lk9/a$d;Lk9/e$a;)V
    .locals 6
    .param p1    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lk9/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lk9/a$d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lk9/e$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lk9/a<",
            "TO;>;TO;",
            "Lk9/e$a;",
            ")V"
        }
    .end annotation

    move-object v2, p1

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    .line 1
    invoke-direct/range {v0 .. v5}, Lk9/e;-><init>(Landroid/content/Context;Landroid/app/Activity;Lk9/a;Lk9/a$d;Lk9/e$a;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/app/Activity;Lk9/a;Lk9/a$d;Lk9/e$a;)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Null context is not permitted."

    invoke-static {p1, v0}, Ln9/m;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Api must not be null."

    .line 3
    invoke-static {p3, v0}, Ln9/m;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead."

    .line 4
    invoke-static {p5, v0}, Ln9/m;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "The provided context did not have an application context."

    .line 6
    invoke-static {v0, v1}, Ln9/m;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iput-object v0, p0, Lk9/e;->a:Landroid/content/Context;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-lt v1, v2, :cond_0

    .line 7
    invoke-virtual {p1}, Landroid/content/Context;->getAttributionTag()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p0, p1}, Lk9/e;->E(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    .line 9
    :goto_0
    iput-object p1, p0, Lk9/e;->b:Ljava/lang/String;

    iput-object p3, p0, Lk9/e;->c:Lk9/a;

    iput-object p4, p0, Lk9/e;->d:Lk9/a$d;

    .line 10
    iget-object v1, p5, Lk9/e$a;->b:Landroid/os/Looper;

    iput-object v1, p0, Lk9/e;->f:Landroid/os/Looper;

    .line 11
    invoke-static {p3, p4, p1}, Ll9/b;->a(Lk9/a;Lk9/a$d;Ljava/lang/String;)Ll9/b;

    move-result-object p1

    iput-object p1, p0, Lk9/e;->e:Ll9/b;

    .line 12
    new-instance p3, Ll9/o0;

    invoke-direct {p3, p0}, Ll9/o0;-><init>(Lk9/e;)V

    iput-object p3, p0, Lk9/e;->h:Lk9/f;

    .line 13
    invoke-static {v0}, Ll9/f;->v(Landroid/content/Context;)Ll9/f;

    move-result-object p3

    iput-object p3, p0, Lk9/e;->j:Ll9/f;

    .line 14
    invoke-virtual {p3}, Ll9/f;->l()I

    move-result p4

    iput p4, p0, Lk9/e;->g:I

    .line 15
    iget-object p4, p5, Lk9/e$a;->a:Ll9/s;

    iput-object p4, p0, Lk9/e;->i:Ll9/s;

    if-eqz p2, :cond_1

    instance-of p4, p2, Lcom/google/android/gms/common/api/GoogleApiActivity;

    if-nez p4, :cond_1

    .line 16
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p4

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p5

    if-ne p4, p5, :cond_1

    .line 17
    invoke-static {p2, p3, p1}, Ll9/a0;->u(Landroid/app/Activity;Ll9/f;Ll9/b;)V

    .line 18
    :cond_1
    invoke-virtual {p3, p0}, Ll9/f;->J(Lk9/e;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lk9/a;Lk9/a$d;Lk9/e$a;)V
    .locals 6
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lk9/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lk9/a$d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lk9/e$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lk9/a<",
            "TO;>;TO;",
            "Lk9/e$a;",
            ")V"
        }
    .end annotation

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    .line 19
    invoke-direct/range {v0 .. v5}, Lk9/e;-><init>(Landroid/content/Context;Landroid/app/Activity;Lk9/a;Lk9/a$d;Lk9/e$a;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lk9/a;Lk9/a$d;Ll9/s;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lk9/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lk9/a$d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Ll9/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lk9/a<",
            "TO;>;TO;",
            "Ll9/s;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 20
    new-instance v0, Lk9/e$a$a;

    invoke-direct {v0}, Lk9/e$a$a;-><init>()V

    invoke-virtual {v0, p4}, Lk9/e$a$a;->b(Ll9/s;)Lk9/e$a$a;

    invoke-virtual {v0}, Lk9/e$a$a;->a()Lk9/e$a;

    move-result-object p4

    invoke-direct {p0, p1, p2, p3, p4}, Lk9/e;-><init>(Landroid/content/Context;Lk9/a;Lk9/a$d;Lk9/e$a;)V

    return-void
.end method


# virtual methods
.method public A(Ll9/p;)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .param p1    # Ll9/p;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation runtime Lcom/google/errorprone/annotations/ResultIgnorabilityUnspecified;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lk9/a$b;",
            ">(",
            "Ll9/p<",
            "TA;*>;)",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Ll9/p;->a:Ll9/o;

    invoke-virtual {v0}, Ll9/o;->b()Ll9/k$a;

    move-result-object v0

    const-string v1, "Listener has already been released."

    invoke-static {v0, v1}, Ln9/m;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Ll9/p;->b:Ll9/w;

    invoke-virtual {v0}, Ll9/w;->a()Ll9/k$a;

    move-result-object v0

    invoke-static {v0, v1}, Ln9/m;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Ll9/p;->a:Ll9/o;

    iget-object v1, p1, Ll9/p;->b:Ll9/w;

    iget-object p1, p1, Ll9/p;->c:Ljava/lang/Runnable;

    iget-object v2, p0, Lk9/e;->j:Ll9/f;

    invoke-virtual {v2, p0, v0, v1, p1}, Ll9/f;->y(Lk9/e;Ll9/o;Ll9/w;Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public B(Ll9/k$a;I)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .param p1    # Ll9/k$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation runtime Lcom/google/errorprone/annotations/ResultIgnorabilityUnspecified;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll9/k$a<",
            "*>;I)",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    const-string v0, "Listener key cannot be null."

    invoke-static {p1, v0}, Ln9/m;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lk9/e;->j:Ll9/f;

    invoke-virtual {v0, p0, p1, p2}, Ll9/f;->z(Lk9/e;Ll9/k$a;I)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public C(Lcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;
    .locals 1
    .param p1    # Lcom/google/android/gms/common/api/internal/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lk9/a$b;",
            "T:",
            "Lcom/google/android/gms/common/api/internal/a<",
            "+",
            "Lk9/n;",
            "TA;>;>(TT;)TT;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, v0, p1}, Lk9/e;->N(ILcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;

    return-object p1
.end method

.method public D(Ll9/u;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .param p1    # Ll9/u;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation runtime Lcom/google/errorprone/annotations/ResultIgnorabilityUnspecified;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            "A::",
            "Lk9/a$b;",
            ">(",
            "Ll9/u<",
            "TA;TTResult;>;)",
            "Lcom/google/android/gms/tasks/Task<",
            "TTResult;>;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, v0, p1}, Lk9/e;->O(ILl9/u;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public E(Landroid/content/Context;)Ljava/lang/String;
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 p1, 0x0

    return-object p1
.end method

.method public F()Lk9/a$d;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TO;"
        }
    .end annotation

    iget-object v0, p0, Lk9/e;->d:Lk9/a$d;

    return-object v0
.end method

.method public G()Landroid/content/Context;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lk9/e;->a:Landroid/content/Context;

    return-object v0
.end method

.method public H()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lk9/e;->b:Ljava/lang/String;

    return-object v0
.end method

.method public I()Landroid/os/Looper;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lk9/e;->f:Landroid/os/Looper;

    return-object v0
.end method

.method public J(Ljava/lang/Object;Ljava/lang/String;)Ll9/k;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<",
            "L:Ljava/lang/Object;",
            ">(T",
            "L;",
            "Ljava/lang/String;",
            ")",
            "Ll9/k<",
            "T",
            "L;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lk9/e;->f:Landroid/os/Looper;

    invoke-static {p1, v0, p2}, Ll9/l;->a(Ljava/lang/Object;Landroid/os/Looper;Ljava/lang/String;)Ll9/k;

    move-result-object p1

    return-object p1
.end method

.method public final K()I
    .locals 1

    iget v0, p0, Lk9/e;->g:I

    return v0
.end method

.method public final L(Landroid/os/Looper;Ll9/j0;)Lk9/a$f;
    .locals 8

    invoke-virtual {p0}, Lk9/e;->x()Ln9/d$a;

    move-result-object v0

    invoke-virtual {v0}, Ln9/d$a;->a()Ln9/d;

    move-result-object v4

    iget-object v0, p0, Lk9/e;->c:Lk9/a;

    invoke-virtual {v0}, Lk9/a;->a()Lk9/a$a;

    move-result-object v0

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lk9/a$a;

    iget-object v5, p0, Lk9/e;->d:Lk9/a$d;

    iget-object v2, p0, Lk9/e;->a:Landroid/content/Context;

    move-object v7, p2

    move-object v3, p1

    move-object v6, p2

    invoke-virtual/range {v1 .. v7}, Lk9/a$a;->a(Landroid/content/Context;Landroid/os/Looper;Ln9/d;Ljava/lang/Object;Lk9/f$a;Lk9/f$b;)Lk9/a$f;

    move-result-object p1

    invoke-virtual {p0}, Lk9/e;->H()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    instance-of v0, p1, Ln9/c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ln9/c;

    invoke-virtual {v0, p2}, Ln9/c;->setAttributionTag(Ljava/lang/String;)V

    :cond_0
    if-eqz p2, :cond_1

    instance-of v0, p1, Ll9/m;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Ll9/m;

    invoke-virtual {v0, p2}, Ll9/m;->d(Ljava/lang/String;)V

    :cond_1
    return-object p1
.end method

.method public final M(Landroid/content/Context;Landroid/os/Handler;)Ll9/f1;
    .locals 2

    new-instance v0, Ll9/f1;

    invoke-virtual {p0}, Lk9/e;->x()Ln9/d$a;

    move-result-object v1

    invoke-virtual {v1}, Ln9/d$a;->a()Ln9/d;

    move-result-object v1

    invoke-direct {v0, p1, p2, v1}, Ll9/f1;-><init>(Landroid/content/Context;Landroid/os/Handler;Ln9/d;)V

    return-object v0
.end method

.method public final N(ILcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;
    .locals 1
    .param p2    # Lcom/google/android/gms/common/api/internal/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p2}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->l()V

    iget-object v0, p0, Lk9/e;->j:Ll9/f;

    invoke-virtual {v0, p0, p1, p2}, Ll9/f;->E(Lk9/e;ILcom/google/android/gms/common/api/internal/a;)V

    return-object p2
.end method

.method public final O(ILl9/u;)Lcom/google/android/gms/tasks/Task;
    .locals 6
    .param p2    # Ll9/u;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v4, Lsb/k;

    invoke-direct {v4}, Lsb/k;-><init>()V

    iget-object v5, p0, Lk9/e;->i:Ll9/s;

    iget-object v0, p0, Lk9/e;->j:Ll9/f;

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    invoke-virtual/range {v0 .. v5}, Ll9/f;->F(Lk9/e;ILl9/u;Lsb/k;Ll9/s;)V

    invoke-virtual {v4}, Lsb/k;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final u()Ll9/b;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ll9/b<",
            "TO;>;"
        }
    .end annotation

    iget-object v0, p0, Lk9/e;->e:Ll9/b;

    return-object v0
.end method

.method public w()Lk9/f;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lk9/e;->h:Lk9/f;

    return-object v0
.end method

.method public x()Ln9/d$a;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Ln9/d$a;

    invoke-direct {v0}, Ln9/d$a;-><init>()V

    iget-object v1, p0, Lk9/e;->d:Lk9/a$d;

    instance-of v2, v1, Lk9/a$d$b;

    if-eqz v2, :cond_0

    check-cast v1, Lk9/a$d$b;

    invoke-interface {v1}, Lk9/a$d$b;->w2()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->G2()Landroid/accounts/Account;

    move-result-object v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lk9/e;->d:Lk9/a$d;

    instance-of v2, v1, Lk9/a$d$a;

    if-eqz v2, :cond_1

    check-cast v1, Lk9/a$d$a;

    invoke-interface {v1}, Lk9/a$d$a;->G2()Landroid/accounts/Account;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Ln9/d$a;->d(Landroid/accounts/Account;)Ln9/d$a;

    iget-object v1, p0, Lk9/e;->d:Lk9/a$d;

    instance-of v2, v1, Lk9/a$d$b;

    if-eqz v2, :cond_3

    check-cast v1, Lk9/a$d$b;

    invoke-interface {v1}, Lk9/a$d$b;->w2()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    move-result-object v1

    if-nez v1, :cond_2

    sget-object v1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->B3()Ljava/util/Set;

    move-result-object v1

    goto :goto_1

    :cond_3
    sget-object v1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    :goto_1
    invoke-virtual {v0, v1}, Ln9/d$a;->c(Ljava/util/Collection;)Ln9/d$a;

    iget-object v1, p0, Lk9/e;->a:Landroid/content/Context;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln9/d$a;->e(Ljava/lang/String;)Ln9/d$a;

    iget-object v1, p0, Lk9/e;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln9/d$a;->b(Ljava/lang/String;)Ln9/d$a;

    return-object v0
.end method

.method public y(Ll9/u;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .param p1    # Ll9/u;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation runtime Lcom/google/errorprone/annotations/ResultIgnorabilityUnspecified;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            "A::",
            "Lk9/a$b;",
            ">(",
            "Ll9/u<",
            "TA;TTResult;>;)",
            "Lcom/google/android/gms/tasks/Task<",
            "TTResult;>;"
        }
    .end annotation

    const/4 v0, 0x2

    invoke-virtual {p0, v0, p1}, Lk9/e;->O(ILl9/u;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public z(Ll9/u;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .param p1    # Ll9/u;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation runtime Lcom/google/errorprone/annotations/ResultIgnorabilityUnspecified;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            "A::",
            "Lk9/a$b;",
            ">(",
            "Ll9/u<",
            "TA;TTResult;>;)",
            "Lcom/google/android/gms/tasks/Task<",
            "TTResult;>;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Lk9/e;->O(ILl9/u;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
