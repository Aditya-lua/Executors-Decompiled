.class public abstract Ll9/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll9/g$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<O::",
        "Ll9/a$d;",
        ">",
        "Ljava/lang/Object;",
        "Ll9/i<",
        "TO;>;"
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public final c:Ll9/a;

.field public final d:Ll9/a$d;

.field public final e:Lm9/b;

.field public final f:Landroid/os/Looper;

.field public final g:I

.field public final h:Ll9/h;

.field public final i:Lm9/s;

.field public final j:Lm9/f;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ll9/a;Ll9/a$d;Ll9/g$a;)V
    .locals 6
    .param p1    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ll9/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ll9/a$d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Ll9/g$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ll9/a<",
            "TO;>;TO;",
            "Ll9/g$a;",
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
    invoke-direct/range {v0 .. v5}, Ll9/g;-><init>(Landroid/content/Context;Landroid/app/Activity;Ll9/a;Ll9/a$d;Ll9/g$a;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/app/Activity;Ll9/a;Ll9/a$d;Ll9/g$a;)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Null context is not permitted."

    invoke-static {p1, v0}, Lo9/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Api must not be null."

    .line 3
    invoke-static {p3, v0}, Lo9/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead."

    .line 4
    invoke-static {p5, v0}, Lo9/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "The provided context did not have an application context."

    .line 6
    invoke-static {v0, v1}, Lo9/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iput-object v0, p0, Ll9/g;->a:Landroid/content/Context;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-lt v1, v2, :cond_0

    .line 7
    invoke-virtual {p1}, Landroid/content/Context;->getAttributionTag()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p0, p1}, Ll9/g;->E(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    .line 9
    :goto_0
    iput-object p1, p0, Ll9/g;->b:Ljava/lang/String;

    iput-object p3, p0, Ll9/g;->c:Ll9/a;

    iput-object p4, p0, Ll9/g;->d:Ll9/a$d;

    .line 10
    iget-object v1, p5, Ll9/g$a;->b:Landroid/os/Looper;

    iput-object v1, p0, Ll9/g;->f:Landroid/os/Looper;

    .line 11
    invoke-static {p3, p4, p1}, Lm9/b;->a(Ll9/a;Ll9/a$d;Ljava/lang/String;)Lm9/b;

    move-result-object p1

    iput-object p1, p0, Ll9/g;->e:Lm9/b;

    .line 12
    new-instance p3, Lm9/o0;

    invoke-direct {p3, p0}, Lm9/o0;-><init>(Ll9/g;)V

    iput-object p3, p0, Ll9/g;->h:Ll9/h;

    .line 13
    invoke-static {v0}, Lm9/f;->v(Landroid/content/Context;)Lm9/f;

    move-result-object p3

    iput-object p3, p0, Ll9/g;->j:Lm9/f;

    .line 14
    invoke-virtual {p3}, Lm9/f;->l()I

    move-result p4

    iput p4, p0, Ll9/g;->g:I

    .line 15
    iget-object p4, p5, Ll9/g$a;->a:Lm9/s;

    iput-object p4, p0, Ll9/g;->i:Lm9/s;

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
    invoke-static {p2, p3, p1}, Lm9/a0;->u(Landroid/app/Activity;Lm9/f;Lm9/b;)V

    .line 18
    :cond_1
    invoke-virtual {p3, p0}, Lm9/f;->J(Ll9/g;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ll9/a;Ll9/a$d;Ll9/g$a;)V
    .locals 6
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ll9/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ll9/a$d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Ll9/g$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ll9/a<",
            "TO;>;TO;",
            "Ll9/g$a;",
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
    invoke-direct/range {v0 .. v5}, Ll9/g;-><init>(Landroid/content/Context;Landroid/app/Activity;Ll9/a;Ll9/a$d;Ll9/g$a;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ll9/a;Ll9/a$d;Lm9/s;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ll9/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ll9/a$d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lm9/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ll9/a<",
            "TO;>;TO;",
            "Lm9/s;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 20
    new-instance v0, Ll9/g$a$a;

    invoke-direct {v0}, Ll9/g$a$a;-><init>()V

    invoke-virtual {v0, p4}, Ll9/g$a$a;->b(Lm9/s;)Ll9/g$a$a;

    invoke-virtual {v0}, Ll9/g$a$a;->a()Ll9/g$a;

    move-result-object p4

    invoke-direct {p0, p1, p2, p3, p4}, Ll9/g;-><init>(Landroid/content/Context;Ll9/a;Ll9/a$d;Ll9/g$a;)V

    return-void
.end method


# virtual methods
.method public A(Lm9/p;)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .param p1    # Lm9/p;
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
            "Ll9/a$b;",
            ">(",
            "Lm9/p<",
            "TA;*>;)",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lm9/p;->a:Lm9/o;

    invoke-virtual {v0}, Lm9/o;->b()Lm9/k$a;

    move-result-object v0

    const-string v1, "Listener has already been released."

    invoke-static {v0, v1}, Lo9/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lm9/p;->b:Lm9/w;

    invoke-virtual {v0}, Lm9/w;->a()Lm9/k$a;

    move-result-object v0

    invoke-static {v0, v1}, Lo9/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lm9/p;->a:Lm9/o;

    iget-object v1, p1, Lm9/p;->b:Lm9/w;

    iget-object p1, p1, Lm9/p;->c:Ljava/lang/Runnable;

    iget-object v2, p0, Ll9/g;->j:Lm9/f;

    invoke-virtual {v2, p0, v0, v1, p1}, Lm9/f;->y(Ll9/g;Lm9/o;Lm9/w;Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public B(Lm9/k$a;I)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .param p1    # Lm9/k$a;
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
            "Lm9/k$a<",
            "*>;I)",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    const-string v0, "Listener key cannot be null."

    invoke-static {p1, v0}, Lo9/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Ll9/g;->j:Lm9/f;

    invoke-virtual {v0, p0, p1, p2}, Lm9/f;->z(Ll9/g;Lm9/k$a;I)Lcom/google/android/gms/tasks/Task;

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
            "Ll9/a$b;",
            "T:",
            "Lcom/google/android/gms/common/api/internal/a<",
            "+",
            "Ll9/p;",
            "TA;>;>(TT;)TT;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, v0, p1}, Ll9/g;->N(ILcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;

    return-object p1
.end method

.method public D(Lm9/u;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .param p1    # Lm9/u;
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
            "Ll9/a$b;",
            ">(",
            "Lm9/u<",
            "TA;TTResult;>;)",
            "Lcom/google/android/gms/tasks/Task<",
            "TTResult;>;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, v0, p1}, Ll9/g;->O(ILm9/u;)Lcom/google/android/gms/tasks/Task;

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

.method public F()Ll9/a$d;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TO;"
        }
    .end annotation

    iget-object v0, p0, Ll9/g;->d:Ll9/a$d;

    return-object v0
.end method

.method public G()Landroid/content/Context;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Ll9/g;->a:Landroid/content/Context;

    return-object v0
.end method

.method public H()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ll9/g;->b:Ljava/lang/String;

    return-object v0
.end method

.method public I()Landroid/os/Looper;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Ll9/g;->f:Landroid/os/Looper;

    return-object v0
.end method

.method public J(Ljava/lang/Object;Ljava/lang/String;)Lm9/k;
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
            "Lm9/k<",
            "T",
            "L;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ll9/g;->f:Landroid/os/Looper;

    invoke-static {p1, v0, p2}, Lm9/l;->a(Ljava/lang/Object;Landroid/os/Looper;Ljava/lang/String;)Lm9/k;

    move-result-object p1

    return-object p1
.end method

.method public final K()I
    .locals 1

    iget v0, p0, Ll9/g;->g:I

    return v0
.end method

.method public final L(Landroid/os/Looper;Lm9/j0;)Ll9/a$f;
    .locals 8

    invoke-virtual {p0}, Ll9/g;->x()Lo9/f$a;

    move-result-object v0

    invoke-virtual {v0}, Lo9/f$a;->a()Lo9/f;

    move-result-object v4

    iget-object v0, p0, Ll9/g;->c:Ll9/a;

    invoke-virtual {v0}, Ll9/a;->a()Ll9/a$a;

    move-result-object v0

    invoke-static {v0}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ll9/a$a;

    iget-object v5, p0, Ll9/g;->d:Ll9/a$d;

    iget-object v2, p0, Ll9/g;->a:Landroid/content/Context;

    move-object v7, p2

    move-object v3, p1

    move-object v6, p2

    invoke-virtual/range {v1 .. v7}, Ll9/a$a;->a(Landroid/content/Context;Landroid/os/Looper;Lo9/f;Ljava/lang/Object;Ll9/h$a;Ll9/h$b;)Ll9/a$f;

    move-result-object p1

    invoke-virtual {p0}, Ll9/g;->H()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    instance-of v0, p1, Lo9/d;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lo9/d;

    invoke-virtual {v0, p2}, Lo9/d;->setAttributionTag(Ljava/lang/String;)V

    :cond_0
    if-eqz p2, :cond_1

    instance-of v0, p1, Lm9/m;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lm9/m;

    invoke-virtual {v0, p2}, Lm9/m;->d(Ljava/lang/String;)V

    :cond_1
    return-object p1
.end method

.method public final M(Landroid/content/Context;Landroid/os/Handler;)Lm9/f1;
    .locals 2

    new-instance v0, Lm9/f1;

    invoke-virtual {p0}, Ll9/g;->x()Lo9/f$a;

    move-result-object v1

    invoke-virtual {v1}, Lo9/f$a;->a()Lo9/f;

    move-result-object v1

    invoke-direct {v0, p1, p2, v1}, Lm9/f1;-><init>(Landroid/content/Context;Landroid/os/Handler;Lo9/f;)V

    return-object v0
.end method

.method public final N(ILcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;
    .locals 1
    .param p2    # Lcom/google/android/gms/common/api/internal/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p2}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->l()V

    iget-object v0, p0, Ll9/g;->j:Lm9/f;

    invoke-virtual {v0, p0, p1, p2}, Lm9/f;->E(Ll9/g;ILcom/google/android/gms/common/api/internal/a;)V

    return-object p2
.end method

.method public final O(ILm9/u;)Lcom/google/android/gms/tasks/Task;
    .locals 6
    .param p2    # Lm9/u;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v4, Ltb/k;

    invoke-direct {v4}, Ltb/k;-><init>()V

    iget-object v5, p0, Ll9/g;->i:Lm9/s;

    iget-object v0, p0, Ll9/g;->j:Lm9/f;

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    invoke-virtual/range {v0 .. v5}, Lm9/f;->F(Ll9/g;ILm9/u;Ltb/k;Lm9/s;)V

    invoke-virtual {v4}, Ltb/k;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final v()Lm9/b;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lm9/b<",
            "TO;>;"
        }
    .end annotation

    iget-object v0, p0, Ll9/g;->e:Lm9/b;

    return-object v0
.end method

.method public w()Ll9/h;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Ll9/g;->h:Ll9/h;

    return-object v0
.end method

.method public x()Lo9/f$a;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lo9/f$a;

    invoke-direct {v0}, Lo9/f$a;-><init>()V

    iget-object v1, p0, Ll9/g;->d:Ll9/a$d;

    instance-of v2, v1, Ll9/a$d$b;

    if-eqz v2, :cond_0

    check-cast v1, Ll9/a$d$b;

    invoke-interface {v1}, Ll9/a$d$b;->z2()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->K2()Landroid/accounts/Account;

    move-result-object v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Ll9/g;->d:Ll9/a$d;

    instance-of v2, v1, Ll9/a$d$a;

    if-eqz v2, :cond_1

    check-cast v1, Ll9/a$d$a;

    invoke-interface {v1}, Ll9/a$d$a;->K2()Landroid/accounts/Account;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lo9/f$a;->d(Landroid/accounts/Account;)Lo9/f$a;

    iget-object v1, p0, Ll9/g;->d:Ll9/a$d;

    instance-of v2, v1, Ll9/a$d$b;

    if-eqz v2, :cond_3

    check-cast v1, Ll9/a$d$b;

    invoke-interface {v1}, Ll9/a$d$b;->z2()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    move-result-object v1

    if-nez v1, :cond_2

    sget-object v1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->G3()Ljava/util/Set;

    move-result-object v1

    goto :goto_1

    :cond_3
    sget-object v1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    :goto_1
    invoke-virtual {v0, v1}, Lo9/f$a;->c(Ljava/util/Collection;)Lo9/f$a;

    iget-object v1, p0, Ll9/g;->a:Landroid/content/Context;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo9/f$a;->e(Ljava/lang/String;)Lo9/f$a;

    iget-object v1, p0, Ll9/g;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo9/f$a;->b(Ljava/lang/String;)Lo9/f$a;

    return-object v0
.end method

.method public y(Lm9/u;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .param p1    # Lm9/u;
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
            "Ll9/a$b;",
            ">(",
            "Lm9/u<",
            "TA;TTResult;>;)",
            "Lcom/google/android/gms/tasks/Task<",
            "TTResult;>;"
        }
    .end annotation

    const/4 v0, 0x2

    invoke-virtual {p0, v0, p1}, Ll9/g;->O(ILm9/u;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public z(Lm9/u;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .param p1    # Lm9/u;
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
            "Ll9/a$b;",
            ">(",
            "Lm9/u<",
            "TA;TTResult;>;)",
            "Lcom/google/android/gms/tasks/Task<",
            "TTResult;>;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Ll9/g;->O(ILm9/u;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
