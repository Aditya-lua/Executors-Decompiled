.class public Lcom/google/firebase/datatransport/TransportRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-transport"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lof/d;)Lz7/i;
    .locals 1

    const-class v0, Landroid/content/Context;

    invoke-interface {p0, v0}, Lof/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Lc8/t;->f(Landroid/content/Context;)V

    invoke-static {}, Lc8/t;->c()Lc8/t;

    move-result-object p0

    sget-object v0, La8/a;->g:La8/a;

    invoke-virtual {p0, v0}, Lc8/t;->g(Lc8/f;)Lz7/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lof/d;)Lz7/i;
    .locals 1

    const-class v0, Landroid/content/Context;

    invoke-interface {p0, v0}, Lof/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Lc8/t;->f(Landroid/content/Context;)V

    invoke-static {}, Lc8/t;->c()Lc8/t;

    move-result-object p0

    sget-object v0, La8/a;->h:La8/a;

    invoke-virtual {p0, v0}, Lc8/t;->g(Lc8/f;)Lz7/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lof/d;)Lz7/i;
    .locals 1

    const-class v0, Landroid/content/Context;

    invoke-interface {p0, v0}, Lof/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Lc8/t;->f(Landroid/content/Context;)V

    invoke-static {}, Lc8/t;->c()Lc8/t;

    move-result-object p0

    sget-object v0, La8/a;->h:La8/a;

    invoke-virtual {p0, v0}, Lc8/t;->g(Lc8/f;)Lz7/i;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 6
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lof/c<",
            "*>;>;"
        }
    .end annotation

    const-class v0, Lz7/i;

    invoke-static {v0}, Lof/c;->c(Ljava/lang/Class;)Lof/c$b;

    move-result-object v1

    const-string v2, "fire-transport"

    invoke-virtual {v1, v2}, Lof/c$b;->h(Ljava/lang/String;)Lof/c$b;

    move-result-object v1

    const-class v3, Landroid/content/Context;

    invoke-static {v3}, Lof/r;->j(Ljava/lang/Class;)Lof/r;

    move-result-object v4

    invoke-virtual {v1, v4}, Lof/c$b;->b(Lof/r;)Lof/c$b;

    move-result-object v1

    new-instance v4, Lrf/c;

    invoke-direct {v4}, Lrf/c;-><init>()V

    invoke-virtual {v1, v4}, Lof/c$b;->f(Lof/g;)Lof/c$b;

    move-result-object v1

    invoke-virtual {v1}, Lof/c$b;->d()Lof/c;

    move-result-object v1

    const-class v4, Lrf/a;

    invoke-static {v4, v0}, Lof/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lof/e0;

    move-result-object v4

    invoke-static {v4}, Lof/c;->e(Lof/e0;)Lof/c$b;

    move-result-object v4

    invoke-static {v3}, Lof/r;->j(Ljava/lang/Class;)Lof/r;

    move-result-object v5

    invoke-virtual {v4, v5}, Lof/c$b;->b(Lof/r;)Lof/c$b;

    move-result-object v4

    new-instance v5, Lrf/d;

    invoke-direct {v5}, Lrf/d;-><init>()V

    invoke-virtual {v4, v5}, Lof/c$b;->f(Lof/g;)Lof/c$b;

    move-result-object v4

    invoke-virtual {v4}, Lof/c$b;->d()Lof/c;

    move-result-object v4

    const-class v5, Lrf/b;

    invoke-static {v5, v0}, Lof/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lof/e0;

    move-result-object v0

    invoke-static {v0}, Lof/c;->e(Lof/e0;)Lof/c$b;

    move-result-object v0

    invoke-static {v3}, Lof/r;->j(Ljava/lang/Class;)Lof/r;

    move-result-object v3

    invoke-virtual {v0, v3}, Lof/c$b;->b(Lof/r;)Lof/c$b;

    move-result-object v0

    new-instance v3, Lrf/e;

    invoke-direct {v3}, Lrf/e;-><init>()V

    invoke-virtual {v0, v3}, Lof/c$b;->f(Lof/g;)Lof/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lof/c$b;->d()Lof/c;

    move-result-object v0

    const-string v3, "18.2.0"

    invoke-static {v2, v3}, Ljg/h;->b(Ljava/lang/String;Ljava/lang/String;)Lof/c;

    move-result-object v2

    filled-new-array {v1, v4, v0, v2}, [Lof/c;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
