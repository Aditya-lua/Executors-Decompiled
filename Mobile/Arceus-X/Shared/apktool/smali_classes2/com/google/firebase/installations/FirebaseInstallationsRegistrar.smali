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

.method public static synthetic a(Lmf/d;)Lzf/h;
    .locals 6

    new-instance v0, Lzf/g;

    const-class v1, Lff/e;

    invoke-interface {p0, v1}, Lmf/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lff/e;

    const-class v2, Lwf/i;

    invoke-interface {p0, v2}, Lmf/d;->g(Ljava/lang/Class;)Lyf/b;

    move-result-object v2

    const-class v3, Lkf/a;

    const-class v4, Ljava/util/concurrent/ExecutorService;

    invoke-static {v3, v4}, Lmf/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lmf/e0;

    move-result-object v3

    invoke-interface {p0, v3}, Lmf/d;->f(Lmf/e0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/concurrent/ExecutorService;

    const-class v4, Lkf/b;

    const-class v5, Ljava/util/concurrent/Executor;

    invoke-static {v4, v5}, Lmf/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lmf/e0;

    move-result-object v4

    invoke-interface {p0, v4}, Lmf/d;->f(Lmf/e0;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/concurrent/Executor;

    invoke-static {p0}, Lnf/y;->a(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object p0

    invoke-direct {v0, v1, v2, v3, p0}, Lzf/g;-><init>(Lff/e;Lyf/b;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lmf/c<",
            "*>;>;"
        }
    .end annotation

    const-class v0, Lzf/h;

    invoke-static {v0}, Lmf/c;->c(Ljava/lang/Class;)Lmf/c$b;

    move-result-object v0

    const-string v1, "fire-installations"

    invoke-virtual {v0, v1}, Lmf/c$b;->h(Ljava/lang/String;)Lmf/c$b;

    move-result-object v0

    const-class v2, Lff/e;

    invoke-static {v2}, Lmf/r;->j(Ljava/lang/Class;)Lmf/r;

    move-result-object v2

    invoke-virtual {v0, v2}, Lmf/c$b;->b(Lmf/r;)Lmf/c$b;

    move-result-object v0

    const-class v2, Lwf/i;

    invoke-static {v2}, Lmf/r;->h(Ljava/lang/Class;)Lmf/r;

    move-result-object v2

    invoke-virtual {v0, v2}, Lmf/c$b;->b(Lmf/r;)Lmf/c$b;

    move-result-object v0

    const-class v2, Lkf/a;

    const-class v3, Ljava/util/concurrent/ExecutorService;

    invoke-static {v2, v3}, Lmf/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lmf/e0;

    move-result-object v2

    invoke-static {v2}, Lmf/r;->k(Lmf/e0;)Lmf/r;

    move-result-object v2

    invoke-virtual {v0, v2}, Lmf/c$b;->b(Lmf/r;)Lmf/c$b;

    move-result-object v0

    const-class v2, Lkf/b;

    const-class v3, Ljava/util/concurrent/Executor;

    invoke-static {v2, v3}, Lmf/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lmf/e0;

    move-result-object v2

    invoke-static {v2}, Lmf/r;->k(Lmf/e0;)Lmf/r;

    move-result-object v2

    invoke-virtual {v0, v2}, Lmf/c$b;->b(Lmf/r;)Lmf/c$b;

    move-result-object v0

    new-instance v2, Lzf/j;

    invoke-direct {v2}, Lzf/j;-><init>()V

    invoke-virtual {v0, v2}, Lmf/c$b;->f(Lmf/g;)Lmf/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lmf/c$b;->d()Lmf/c;

    move-result-object v0

    invoke-static {}, Lwf/h;->a()Lmf/c;

    move-result-object v2

    const-string v3, "19.0.1"

    invoke-static {v1, v3}, Lhg/h;->b(Ljava/lang/String;Ljava/lang/String;)Lmf/c;

    move-result-object v1

    filled-new-array {v0, v2, v1}, [Lmf/c;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
