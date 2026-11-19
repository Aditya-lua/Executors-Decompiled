.class public final Lt9/v;
.super Ll9/g;
.source "SourceFile"

# interfaces
.implements Ls9/d;


# static fields
.field public static final k:Ll9/a$g;

.field public static final l:Ll9/a$a;

.field public static final m:Ll9/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ll9/a$g;

    invoke-direct {v0}, Ll9/a$g;-><init>()V

    sput-object v0, Lt9/v;->k:Ll9/a$g;

    new-instance v1, Lt9/q;

    invoke-direct {v1}, Lt9/q;-><init>()V

    sput-object v1, Lt9/v;->l:Ll9/a$a;

    new-instance v2, Ll9/a;

    const-string v3, "ModuleInstall.API"

    invoke-direct {v2, v3, v1, v0}, Ll9/a;-><init>(Ljava/lang/String;Ll9/a$a;Ll9/a$g;)V

    sput-object v2, Lt9/v;->m:Ll9/a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    sget-object v0, Lt9/v;->m:Ll9/a;

    sget-object v1, Ll9/a$d;->Oo:Ll9/a$d$c;

    sget-object v2, Ll9/g$a;->c:Ll9/g$a;

    invoke-direct {p0, p1, v0, v1, v2}, Ll9/g;-><init>(Landroid/content/Context;Ll9/a;Ll9/a$d;Ll9/g$a;)V

    return-void
.end method

.method public static final varargs P(Z[Ll9/j;)Lt9/a;
    .locals 4

    const-string v0, "Requested APIs must not be null."

    invoke-static {p1, v0}, Lo9/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    array-length v0, p1

    const/4 v1, 0x0

    if-lez v0, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    const-string v3, "Please provide at least one OptionalModuleApi."

    invoke-static {v2, v3}, Lo9/s;->b(ZLjava/lang/Object;)V

    :goto_1
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    const-string v3, "Requested API must not be null."

    invoke-static {v2, v3}, Lo9/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1, p0}, Lt9/a;->B3(Ljava/util/List;Z)Lt9/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final h(Ls9/f;)Lcom/google/android/gms/tasks/Task;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls9/f;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ls9/g;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lt9/a;->a(Ls9/f;)Lt9/a;

    move-result-object v4

    invoke-virtual {p1}, Ls9/f;->b()Ls9/a;

    move-result-object v3

    invoke-virtual {p1}, Ls9/f;->c()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-virtual {v4}, Lt9/a;->A3()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p1, Ls9/g;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ls9/g;-><init>(I)V

    invoke-static {p1}, Ltb/m;->f(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v6, 0x1

    if-nez v3, :cond_1

    invoke-static {}, Lm9/u;->c()Lm9/u$a;

    move-result-object p1

    sget-object v0, Lcb/k;->a:Lk9/d;

    filled-new-array {v0}, [Lk9/d;

    move-result-object v0

    invoke-virtual {p1, v0}, Lm9/u$a;->d([Lk9/d;)Lm9/u$a;

    invoke-virtual {p1, v6}, Lm9/u$a;->c(Z)Lm9/u$a;

    const/16 v0, 0x6aa8

    invoke-virtual {p1, v0}, Lm9/u$a;->e(I)Lm9/u$a;

    new-instance v0, Lt9/p;

    invoke-direct {v0, p0, v4}, Lt9/p;-><init>(Lt9/v;Lt9/a;)V

    invoke-virtual {p1, v0}, Lm9/u$a;->b(Lm9/q;)Lm9/u$a;

    invoke-virtual {p1}, Lm9/u$a;->a()Lm9/u;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll9/g;->z(Lm9/u;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {v3}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    const-class v0, Ls9/a;

    if-nez p1, :cond_2

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v3, p1}, Ll9/g;->J(Ljava/lang/Object;Ljava/lang/String;)Lm9/k;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, p1, v0}, Lm9/l;->b(Ljava/lang/Object;Ljava/util/concurrent/Executor;Ljava/lang/String;)Lm9/k;

    move-result-object p1

    :goto_0
    new-instance v5, Lt9/d;

    invoke-direct {v5, p1}, Lt9/d;-><init>(Lm9/k;)V

    new-instance v2, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    new-instance v0, Lt9/l;

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lt9/l;-><init>(Lt9/v;Ljava/util/concurrent/atomic/AtomicReference;Ls9/a;Lt9/a;Lt9/d;)V

    new-instance v3, Lt9/m;

    invoke-direct {v3, p0, v5}, Lt9/m;-><init>(Lt9/v;Lt9/d;)V

    invoke-static {}, Lm9/p;->a()Lm9/p$a;

    move-result-object v4

    invoke-virtual {v4, p1}, Lm9/p$a;->g(Lm9/k;)Lm9/p$a;

    sget-object p1, Lcb/k;->a:Lk9/d;

    filled-new-array {p1}, [Lk9/d;

    move-result-object p1

    invoke-virtual {v4, p1}, Lm9/p$a;->d([Lk9/d;)Lm9/p$a;

    invoke-virtual {v4, v6}, Lm9/p$a;->c(Z)Lm9/p$a;

    invoke-virtual {v4, v0}, Lm9/p$a;->b(Lm9/q;)Lm9/p$a;

    invoke-virtual {v4, v3}, Lm9/p$a;->f(Lm9/q;)Lm9/p$a;

    const/16 p1, 0x6aa9

    invoke-virtual {v4, p1}, Lm9/p$a;->e(I)Lm9/p$a;

    invoke-virtual {v4}, Lm9/p$a;->a()Lm9/p;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll9/g;->A(Lm9/p;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance v0, Lt9/n;

    invoke-direct {v0, v2}, Lt9/n;-><init>(Ljava/util/concurrent/atomic/AtomicReference;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->o(Ltb/j;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final varargs o([Ll9/j;)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ll9/j;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ls9/b;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {v0, p1}, Lt9/v;->P(Z[Ll9/j;)Lt9/a;

    move-result-object p1

    invoke-virtual {p1}, Lt9/a;->A3()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance p1, Ls9/b;

    const/4 v1, 0x1

    invoke-direct {p1, v1, v0}, Ls9/b;-><init>(ZI)V

    invoke-static {p1}, Ltb/m;->f(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Lm9/u;->c()Lm9/u$a;

    move-result-object v1

    sget-object v2, Lcb/k;->a:Lk9/d;

    filled-new-array {v2}, [Lk9/d;

    move-result-object v2

    invoke-virtual {v1, v2}, Lm9/u$a;->d([Lk9/d;)Lm9/u$a;

    const/16 v2, 0x6aa5

    invoke-virtual {v1, v2}, Lm9/u$a;->e(I)Lm9/u$a;

    invoke-virtual {v1, v0}, Lm9/u$a;->c(Z)Lm9/u$a;

    new-instance v0, Lt9/o;

    invoke-direct {v0, p0, p1}, Lt9/o;-><init>(Lt9/v;Lt9/a;)V

    invoke-virtual {v1, v0}, Lm9/u$a;->b(Lm9/q;)Lm9/u$a;

    invoke-virtual {v1}, Lm9/u$a;->a()Lm9/u;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll9/g;->z(Lm9/u;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
