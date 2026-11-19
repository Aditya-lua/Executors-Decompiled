.class public Lcom/google/firebase/installations/FirebaseInstallationsRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-installations"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lof/d;)Lbg/h;
    .locals 6

    new-instance v0, Lbg/g;

    const-class v1, Lhf/e;

    invoke-interface {p0, v1}, Lof/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhf/e;

    const-class v2, Lyf/i;

    invoke-interface {p0, v2}, Lof/d;->d(Ljava/lang/Class;)Lag/b;

    move-result-object v2

    const-class v3, Lmf/a;

    const-class v4, Ljava/util/concurrent/ExecutorService;

    invoke-static {v3, v4}, Lof/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lof/e0;

    move-result-object v3

    invoke-interface {p0, v3}, Lof/d;->f(Lof/e0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/concurrent/ExecutorService;

    const-class v4, Lmf/b;

    const-class v5, Ljava/util/concurrent/Executor;

    invoke-static {v4, v5}, Lof/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lof/e0;

    move-result-object v4

    invoke-interface {p0, v4}, Lof/d;->f(Lof/e0;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/concurrent/Executor;

    invoke-static {p0}, Lpf/y;->a(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object p0

    invoke-direct {v0, v1, v2, v3, p0}, Lbg/g;-><init>(Lhf/e;Lag/b;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lof/c<",
            "*>;>;"
        }
    .end annotation

    const-class v0, Lbg/h;

    invoke-static {v0}, Lof/c;->c(Ljava/lang/Class;)Lof/c$b;

    move-result-object v0

    const-string v1, "fire-installations"

    invoke-virtual {v0, v1}, Lof/c$b;->h(Ljava/lang/String;)Lof/c$b;

    move-result-object v0

    const-class v2, Lhf/e;

    invoke-static {v2}, Lof/r;->j(Ljava/lang/Class;)Lof/r;

    move-result-object v2

    invoke-virtual {v0, v2}, Lof/c$b;->b(Lof/r;)Lof/c$b;

    move-result-object v0

    const-class v2, Lyf/i;

    invoke-static {v2}, Lof/r;->h(Ljava/lang/Class;)Lof/r;

    move-result-object v2

    invoke-virtual {v0, v2}, Lof/c$b;->b(Lof/r;)Lof/c$b;

    move-result-object v0

    const-class v2, Lmf/a;

    const-class v3, Ljava/util/concurrent/ExecutorService;

    invoke-static {v2, v3}, Lof/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lof/e0;

    move-result-object v2

    invoke-static {v2}, Lof/r;->k(Lof/e0;)Lof/r;

    move-result-object v2

    invoke-virtual {v0, v2}, Lof/c$b;->b(Lof/r;)Lof/c$b;

    move-result-object v0

    const-class v2, Lmf/b;

    const-class v3, Ljava/util/concurrent/Executor;

    invoke-static {v2, v3}, Lof/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lof/e0;

    move-result-object v2

    invoke-static {v2}, Lof/r;->k(Lof/e0;)Lof/r;

    move-result-object v2

    invoke-virtual {v0, v2}, Lof/c$b;->b(Lof/r;)Lof/c$b;

    move-result-object v0

    new-instance v2, Lbg/j;

    invoke-direct {v2}, Lbg/j;-><init>()V

    invoke-virtual {v0, v2}, Lof/c$b;->f(Lof/g;)Lof/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lof/c$b;->d()Lof/c;

    move-result-object v0

    invoke-static {}, Lyf/h;->a()Lof/c;

    move-result-object v2

    const-string v3, "19.0.1"

    invoke-static {v1, v3}, Ljg/h;->b(Ljava/lang/String;Ljava/lang/String;)Lof/c;

    move-result-object v1

    filled-new-array {v0, v2, v1}, [Lof/c;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
