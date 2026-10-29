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

.method private static synthetic lambda$getComponents$0(Lmf/d;)Lhf/a;
    .locals 3

    const-class v0, Lff/e;

    invoke-interface {p0, v0}, Lmf/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lff/e;

    const-class v1, Landroid/content/Context;

    invoke-interface {p0, v1}, Lmf/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    const-class v2, Lvf/d;

    invoke-interface {p0, v2}, Lmf/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lvf/d;

    invoke-static {v0, v1, p0}, Lhf/b;->c(Lff/e;Landroid/content/Context;Lvf/d;)Lhf/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic zza(Lmf/d;)Lhf/a;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/analytics/connector/internal/AnalyticsConnectorRegistrar;->lambda$getComponents$0(Lmf/d;)Lhf/a;

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
            "Lmf/c<",
            "*>;>;"
        }
    .end annotation

    const-class v0, Lhf/a;

    invoke-static {v0}, Lmf/c;->c(Ljava/lang/Class;)Lmf/c$b;

    move-result-object v0

    const-class v1, Lff/e;

    invoke-static {v1}, Lmf/r;->j(Ljava/lang/Class;)Lmf/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Lmf/c$b;->b(Lmf/r;)Lmf/c$b;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    invoke-static {v1}, Lmf/r;->j(Ljava/lang/Class;)Lmf/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Lmf/c$b;->b(Lmf/r;)Lmf/c$b;

    move-result-object v0

    const-class v1, Lvf/d;

    invoke-static {v1}, Lmf/r;->j(Ljava/lang/Class;)Lmf/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Lmf/c$b;->b(Lmf/r;)Lmf/c$b;

    move-result-object v0

    sget-object v1, Ljf/a;->a:Ljf/a;

    invoke-virtual {v0, v1}, Lmf/c$b;->f(Lmf/g;)Lmf/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lmf/c$b;->e()Lmf/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lmf/c$b;->d()Lmf/c;

    move-result-object v0

    const-string v1, "fire-analytics"

    const-string v2, "23.0.0"

    invoke-static {v1, v2}, Lhg/h;->b(Ljava/lang/String;Ljava/lang/String;)Lmf/c;

    move-result-object v1

    filled-new-array {v0, v1}, [Lmf/c;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
