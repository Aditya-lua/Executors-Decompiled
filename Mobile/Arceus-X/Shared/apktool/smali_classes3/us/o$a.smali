.class public Lus/o$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lus/m$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lus/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lqn/s;",
            ">;",
            "Lus/m$c<",
            "+",
            "Lqn/s;",
            ">;>;"
        }
    .end annotation
.end field

.field public b:Lus/m$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lus/o$a;->a:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Class;Lus/m$c;)Lus/m$b;
    .locals 1
    .param p1    # Ljava/lang/Class;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<N:",
            "Lqn/s;",
            ">(",
            "Ljava/lang/Class<",
            "TN;>;",
            "Lus/m$c<",
            "-TN;>;)",
            "Lus/m$b;"
        }
    .end annotation

    if-nez p2, :cond_0

    iget-object p2, p0, Lus/o$a;->a:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0

    :cond_0
    iget-object v0, p0, Lus/o$a;->a:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public b(Lus/g;Lus/r;)Lus/m;
    .locals 7
    .param p1    # Lus/g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lus/r;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lus/o$a;->b:Lus/m$a;

    if-nez v0, :cond_0

    new-instance v0, Lus/b;

    invoke-direct {v0}, Lus/b;-><init>()V

    :cond_0
    move-object v6, v0

    new-instance v1, Lus/o;

    new-instance v4, Lus/u;

    invoke-direct {v4}, Lus/u;-><init>()V

    iget-object v0, p0, Lus/o$a;->a:Ljava/util/Map;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v5

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lus/o;-><init>(Lus/g;Lus/r;Lus/u;Ljava/util/Map;Lus/m$a;)V

    return-object v1
.end method
