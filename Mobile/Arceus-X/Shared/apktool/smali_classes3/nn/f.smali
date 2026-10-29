.class public Lnn/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lqn/e<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lnn/f;->a:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public a(Lqn/e;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Ljava/lang/Object;",
            ">(",
            "Lqn/e<",
            "TD;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lqn/e;->c()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0, v0}, Lnn/f;->c(Ljava/lang/Class;)Lqn/e;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnn/f;->a:Ljava/util/Map;

    invoke-virtual {p1}, Lqn/e;->c()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Lqn/e;->a(Lqn/e;)V

    return-void
.end method

.method public b(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TV;>;",
            "Ljava/lang/String;",
            ")TV;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lnn/f;->c(Ljava/lang/Class;)Lqn/e;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1, p2}, Lqn/e;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final c(Ljava/lang/Class;)Lqn/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TV;>;)",
            "Lqn/e<",
            "TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lnn/f;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lqn/e;

    return-object p1
.end method
