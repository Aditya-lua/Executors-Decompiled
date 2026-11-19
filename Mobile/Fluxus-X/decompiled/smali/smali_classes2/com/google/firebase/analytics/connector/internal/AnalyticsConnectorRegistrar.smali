.class public Lcom/google/firebase/analytics/connector/internal/AnalyticsConnectorRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static synthetic lambda$getComponents$0(Lof/d;)Lkf/a;
    .locals 3

    const-class v0, Lhf/e;

    invoke-interface {p0, v0}, Lof/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhf/e;

    const-class v1, Landroid/content/Context;

    invoke-interface {p0, v1}, Lof/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    const-class v2, Lxf/d;

    invoke-interface {p0, v2}, Lof/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lxf/d;

    invoke-static {v0, v1, p0}, Lkf/b;->c(Lhf/e;Landroid/content/Context;Lxf/d;)Lkf/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic zza(Lof/d;)Lkf/a;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/analytics/connector/internal/AnalyticsConnectorRegistrar;->lambda$getComponents$0(Lof/d;)Lkf/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    .annotation build Landroidx/annotation/Keep;
    .end annotation

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

    const-class v0, Lkf/a;

    invoke-static {v0}, Lof/c;->c(Ljava/lang/Class;)Lof/c$b;

    move-result-object v0

    const-class v1, Lhf/e;

    invoke-static {v1}, Lof/r;->j(Ljava/lang/Class;)Lof/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Lof/c$b;->b(Lof/r;)Lof/c$b;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    invoke-static {v1}, Lof/r;->j(Ljava/lang/Class;)Lof/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Lof/c$b;->b(Lof/r;)Lof/c$b;

    move-result-object v0

    const-class v1, Lxf/d;

    invoke-static {v1}, Lof/r;->j(Ljava/lang/Class;)Lof/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Lof/c$b;->b(Lof/r;)Lof/c$b;

    move-result-object v0

    sget-object v1, Llf/a;->a:Llf/a;

    invoke-virtual {v0, v1}, Lof/c$b;->f(Lof/g;)Lof/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lof/c$b;->e()Lof/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lof/c$b;->d()Lof/c;

    move-result-object v0

    const-string v1, "fire-analytics"

    const-string v2, "23.0.0"

    invoke-static {v1, v2}, Ljg/h;->b(Ljava/lang/String;Ljava/lang/String;)Lof/c;

    move-result-object v1

    filled-new-array {v0, v1}, [Lof/c;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
