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

.method public static synthetic a(Lmf/d;)Ly7/i;
    .locals 1

    const-class v0, Landroid/content/Context;

    invoke-interface {p0, v0}, Lmf/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Lb8/t;->f(Landroid/content/Context;)V

    invoke-static {}, Lb8/t;->c()Lb8/t;

    move-result-object p0

    sget-object v0, Lz7/a;->g:Lz7/a;

    invoke-virtual {p0, v0}, Lb8/t;->g(Lb8/f;)Ly7/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lmf/d;)Ly7/i;
    .locals 1

    const-class v0, Landroid/content/Context;

    invoke-interface {p0, v0}, Lmf/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Lb8/t;->f(Landroid/content/Context;)V

    invoke-static {}, Lb8/t;->c()Lb8/t;

    move-result-object p0

    sget-object v0, Lz7/a;->h:Lz7/a;

    invoke-virtual {p0, v0}, Lb8/t;->g(Lb8/f;)Ly7/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lmf/d;)Ly7/i;
    .locals 1

    const-class v0, Landroid/content/Context;

    invoke-interface {p0, v0}, Lmf/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Lb8/t;->f(Landroid/content/Context;)V

    invoke-static {}, Lb8/t;->c()Lb8/t;

    move-result-object p0

    sget-object v0, Lz7/a;->h:Lz7/a;

    invoke-virtual {p0, v0}, Lb8/t;->g(Lb8/f;)Ly7/i;

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
            "Lmf/c<",
            "*>;>;"
        }
    .end annotation

    const-class v0, Ly7/i;

    invoke-static {v0}, Lmf/c;->c(Ljava/lang/Class;)Lmf/c$b;

    move-result-object v1

    const-string v2, "fire-transport"

    invoke-virtual {v1, v2}, Lmf/c$b;->h(Ljava/lang/String;)Lmf/c$b;

    move-result-object v1

    const-class v3, Landroid/content/Context;

    invoke-static {v3}, Lmf/r;->j(Ljava/lang/Class;)Lmf/r;

    move-result-object v4

    invoke-virtual {v1, v4}, Lmf/c$b;->b(Lmf/r;)Lmf/c$b;

    move-result-object v1

    new-instance v4, Lpf/c;

    invoke-direct {v4}, Lpf/c;-><init>()V

    invoke-virtual {v1, v4}, Lmf/c$b;->f(Lmf/g;)Lmf/c$b;

    move-result-object v1

    invoke-virtual {v1}, Lmf/c$b;->d()Lmf/c;

    move-result-object v1

    const-class v4, Lpf/a;

    invoke-static {v4, v0}, Lmf/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lmf/e0;

    move-result-object v4

    invoke-static {v4}, Lmf/c;->e(Lmf/e0;)Lmf/c$b;

    move-result-object v4

    invoke-static {v3}, Lmf/r;->j(Ljava/lang/Class;)Lmf/r;

    move-result-object v5

    invoke-virtual {v4, v5}, Lmf/c$b;->b(Lmf/r;)Lmf/c$b;

    move-result-object v4

    new-instance v5, Lpf/d;

    invoke-direct {v5}, Lpf/d;-><init>()V

    invoke-virtual {v4, v5}, Lmf/c$b;->f(Lmf/g;)Lmf/c$b;

    move-result-object v4

    invoke-virtual {v4}, Lmf/c$b;->d()Lmf/c;

    move-result-object v4

    const-class v5, Lpf/b;

    invoke-static {v5, v0}, Lmf/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lmf/e0;

    move-result-object v0

    invoke-static {v0}, Lmf/c;->e(Lmf/e0;)Lmf/c$b;

    move-result-object v0

    invoke-static {v3}, Lmf/r;->j(Ljava/lang/Class;)Lmf/r;

    move-result-object v3

    invoke-virtual {v0, v3}, Lmf/c$b;->b(Lmf/r;)Lmf/c$b;

    move-result-object v0

    new-instance v3, Lpf/e;

    invoke-direct {v3}, Lpf/e;-><init>()V

    invoke-virtual {v0, v3}, Lmf/c$b;->f(Lmf/g;)Lmf/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lmf/c$b;->d()Lmf/c;

    move-result-object v0

    const-string v3, "18.2.0"

    invoke-static {v2, v3}, Lhg/h;->b(Ljava/lang/String;Ljava/lang/String;)Lmf/c;

    move-result-object v2

    filled-new-array {v1, v4, v0, v2}, [Lmf/c;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
