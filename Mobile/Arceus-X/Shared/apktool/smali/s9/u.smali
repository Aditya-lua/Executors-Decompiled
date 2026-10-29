.class public final Ls9/u;
.super Lk9/e;
.source "SourceFile"

# interfaces
.implements Lr9/c;


# static fields
.field public static final k:Lk9/a$g;

.field public static final l:Lk9/a$a;

.field public static final m:Lk9/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lk9/a$g;

    invoke-direct {v0}, Lk9/a$g;-><init>()V

    sput-object v0, Ls9/u;->k:Lk9/a$g;

    new-instance v1, Ls9/p;

    invoke-direct {v1}, Ls9/p;-><init>()V

    sput-object v1, Ls9/u;->l:Lk9/a$a;

    new-instance v2, Lk9/a;

    const-string v3, "ModuleInstall.API"

    invoke-direct {v2, v3, v1, v0}, Lk9/a;-><init>(Ljava/lang/String;Lk9/a$a;Lk9/a$g;)V

    sput-object v2, Ls9/u;->m:Lk9/a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    sget-object v0, Ls9/u;->m:Lk9/a;

    sget-object v1, Lk9/a$d;->Jo:Lk9/a$d$c;

    sget-object v2, Lk9/e$a;->c:Lk9/e$a;

    invoke-direct {p0, p1, v0, v1, v2}, Lk9/e;-><init>(Landroid/content/Context;Lk9/a;Lk9/a$d;Lk9/e$a;)V

    return-void
.end method

.method public static final varargs P(Z[Lk9/h;)Lcom/google/android/gms/common/moduleinstall/internal/ApiFeatureRequest;
    .locals 4

    const-string v0, "Requested APIs must not be null."

    invoke-static {p1, v0}, Ln9/m;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    array-length v0, p1

    const/4 v1, 0x0

    if-lez v0, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    const-string v3, "Please provide at least one OptionalModuleApi."

    invoke-static {v2, v3}, Ln9/m;->b(ZLjava/lang/Object;)V

    :goto_1
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    const-string v3, "Requested API must not be null."

    invoke-static {v2, v3}, Ln9/m;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1, p0}, Lcom/google/android/gms/common/moduleinstall/internal/ApiFeatureRequest;->w3(Ljava/util/List;Z)Lcom/google/android/gms/common/moduleinstall/internal/ApiFeatureRequest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lr9/d;)Lcom/google/android/gms/tasks/Task;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr9/d;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lcom/google/android/gms/common/moduleinstall/ModuleInstallResponse;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/moduleinstall/internal/ApiFeatureRequest;->a(Lr9/d;)Lcom/google/android/gms/common/moduleinstall/internal/ApiFeatureRequest;

    move-result-object v4

    invoke-virtual {p1}, Lr9/d;->b()Lr9/a;

    move-result-object v3

    invoke-virtual {p1}, Lr9/d;->c()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-virtual {v4}, Lcom/google/android/gms/common/moduleinstall/internal/ApiFeatureRequest;->v3()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p1, Lcom/google/android/gms/common/moduleinstall/ModuleInstallResponse;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lcom/google/android/gms/common/moduleinstall/ModuleInstallResponse;-><init>(I)V

    invoke-static {p1}, Lsb/m;->f(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v6, 0x1

    if-nez v3, :cond_1

    invoke-static {}, Ll9/u;->c()Ll9/u$a;

    move-result-object p1

    sget-object v0, Lbb/k;->a:Lcom/google/android/gms/common/Feature;

    filled-new-array {v0}, [Lcom/google/android/gms/common/Feature;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll9/u$a;->d([Lcom/google/android/gms/common/Feature;)Ll9/u$a;

    invoke-virtual {p1, v6}, Ll9/u$a;->c(Z)Ll9/u$a;

    const/16 v0, 0x6aa8

    invoke-virtual {p1, v0}, Ll9/u$a;->e(I)Ll9/u$a;

    new-instance v0, Ls9/o;

    invoke-direct {v0, p0, v4}, Ls9/o;-><init>(Ls9/u;Lcom/google/android/gms/common/moduleinstall/internal/ApiFeatureRequest;)V

    invoke-virtual {p1, v0}, Ll9/u$a;->b(Ll9/q;)Ll9/u$a;

    invoke-virtual {p1}, Ll9/u$a;->a()Ll9/u;

    move-result-object p1

    invoke-virtual {p0, p1}, Lk9/e;->z(Ll9/u;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {v3}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    const-class v0, Lr9/a;

    if-nez p1, :cond_2

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v3, p1}, Lk9/e;->J(Ljava/lang/Object;Ljava/lang/String;)Ll9/k;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, p1, v0}, Ll9/l;->b(Ljava/lang/Object;Ljava/util/concurrent/Executor;Ljava/lang/String;)Ll9/k;

    move-result-object p1

    :goto_0
    new-instance v5, Ls9/c;

    invoke-direct {v5, p1}, Ls9/c;-><init>(Ll9/k;)V

    new-instance v2, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    new-instance v0, Ls9/k;

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Ls9/k;-><init>(Ls9/u;Ljava/util/concurrent/atomic/AtomicReference;Lr9/a;Lcom/google/android/gms/common/moduleinstall/internal/ApiFeatureRequest;Ls9/c;)V

    new-instance v3, Ls9/l;

    invoke-direct {v3, p0, v5}, Ls9/l;-><init>(Ls9/u;Ls9/c;)V

    invoke-static {}, Ll9/p;->a()Ll9/p$a;

    move-result-object v4

    invoke-virtual {v4, p1}, Ll9/p$a;->g(Ll9/k;)Ll9/p$a;

    sget-object p1, Lbb/k;->a:Lcom/google/android/gms/common/Feature;

    filled-new-array {p1}, [Lcom/google/android/gms/common/Feature;

    move-result-object p1

    invoke-virtual {v4, p1}, Ll9/p$a;->d([Lcom/google/android/gms/common/Feature;)Ll9/p$a;

    invoke-virtual {v4, v6}, Ll9/p$a;->c(Z)Ll9/p$a;

    invoke-virtual {v4, v0}, Ll9/p$a;->b(Ll9/q;)Ll9/p$a;

    invoke-virtual {v4, v3}, Ll9/p$a;->f(Ll9/q;)Ll9/p$a;

    const/16 p1, 0x6aa9

    invoke-virtual {v4, p1}, Ll9/p$a;->e(I)Ll9/p$a;

    invoke-virtual {v4}, Ll9/p$a;->a()Ll9/p;

    move-result-object p1

    invoke-virtual {p0, p1}, Lk9/e;->A(Ll9/p;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance v0, Ls9/m;

    invoke-direct {v0, v2}, Ls9/m;-><init>(Ljava/util/concurrent/atomic/AtomicReference;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->o(Lsb/j;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final varargs n([Lk9/h;)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lk9/h;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lcom/google/android/gms/common/moduleinstall/ModuleAvailabilityResponse;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {v0, p1}, Ls9/u;->P(Z[Lk9/h;)Lcom/google/android/gms/common/moduleinstall/internal/ApiFeatureRequest;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/common/moduleinstall/internal/ApiFeatureRequest;->v3()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance p1, Lcom/google/android/gms/common/moduleinstall/ModuleAvailabilityResponse;

    const/4 v1, 0x1

    invoke-direct {p1, v1, v0}, Lcom/google/android/gms/common/moduleinstall/ModuleAvailabilityResponse;-><init>(ZI)V

    invoke-static {p1}, Lsb/m;->f(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Ll9/u;->c()Ll9/u$a;

    move-result-object v1

    sget-object v2, Lbb/k;->a:Lcom/google/android/gms/common/Feature;

    filled-new-array {v2}, [Lcom/google/android/gms/common/Feature;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll9/u$a;->d([Lcom/google/android/gms/common/Feature;)Ll9/u$a;

    const/16 v2, 0x6aa5

    invoke-virtual {v1, v2}, Ll9/u$a;->e(I)Ll9/u$a;

    invoke-virtual {v1, v0}, Ll9/u$a;->c(Z)Ll9/u$a;

    new-instance v0, Ls9/n;

    invoke-direct {v0, p0, p1}, Ls9/n;-><init>(Ls9/u;Lcom/google/android/gms/common/moduleinstall/internal/ApiFeatureRequest;)V

    invoke-virtual {v1, v0}, Ll9/u$a;->b(Ll9/q;)Ll9/u$a;

    invoke-virtual {v1}, Ll9/u$a;->a()Ll9/u;

    move-result-object p1

    invoke-virtual {p0, p1}, Lk9/e;->z(Ll9/u;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
