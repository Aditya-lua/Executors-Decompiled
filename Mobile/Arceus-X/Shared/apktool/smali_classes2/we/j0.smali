.class public final Lwe/j0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwe/j0$b;,
        Lwe/j0$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<P:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lef/a;",
            "Ljava/util/List<",
            "Lwe/j0$c<",
            "TP;>;>;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lwe/j0$c<",
            "TP;>;>;"
        }
    .end annotation
.end field

.field public final c:Lwe/j0$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/j0$c<",
            "TP;>;"
        }
    .end annotation
.end field

.field public final d:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TP;>;"
        }
    .end annotation
.end field

.field public final e:Lwe/r;


# direct methods
.method public constructor <init>(Ljava/util/Map;Ljava/util/List;Lwe/j0$c;Lwe/r;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lef/a;",
            "Ljava/util/List<",
            "Lwe/j0$c<",
            "TP;>;>;>;",
            "Ljava/util/List<",
            "Lwe/j0$c<",
            "TP;>;>;",
            "Lwe/j0$c<",
            "TP;>;",
            "Lwe/r;",
            "Ljava/lang/Class<",
            "TP;>;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lwe/j0;->a:Ljava/util/Map;

    .line 4
    iput-object p2, p0, Lwe/j0;->b:Ljava/util/List;

    .line 5
    iput-object p3, p0, Lwe/j0;->c:Lwe/j0$c;

    .line 6
    iput-object p5, p0, Lwe/j0;->d:Ljava/lang/Class;

    .line 7
    iput-object p4, p0, Lwe/j0;->e:Lwe/r;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/Map;Ljava/util/List;Lwe/j0$c;Lwe/r;Ljava/lang/Class;Lwe/j0$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lwe/j0;-><init>(Ljava/util/Map;Ljava/util/List;Lwe/j0$c;Lwe/r;Ljava/lang/Class;)V

    return-void
.end method

.method public static synthetic a(Lwe/j0$c;Ljava/util/Map;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lwe/j0;->j(Lwe/j0$c;Ljava/util/Map;Ljava/util/List;)V

    return-void
.end method

.method public static i(Ljava/lang/Class;)Lwe/j0$b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TP;>;)",
            "Lwe/j0$b<",
            "TP;>;"
        }
    .end annotation

    new-instance v0, Lwe/j0$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lwe/j0$b;-><init>(Ljava/lang/Class;Lwe/j0$a;)V

    return-object v0
.end method

.method public static j(Lwe/j0$c;Ljava/util/Map;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P:",
            "Ljava/lang/Object;",
            ">(",
            "Lwe/j0$c<",
            "TP;>;",
            "Ljava/util/Map<",
            "Lef/a;",
            "Ljava/util/List<",
            "Lwe/j0$c<",
            "TP;>;>;>;",
            "Ljava/util/List<",
            "Lwe/j0$c<",
            "TP;>;>;)V"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {p0}, Lwe/j0$c;->a(Lwe/j0$c;)Lef/a;

    move-result-object v1

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-interface {v1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {p0}, Lwe/j0$c;->a(Lwe/j0$c;)Lef/a;

    move-result-object v0

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-interface {p2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public b()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Ljava/util/List<",
            "Lwe/j0$c<",
            "TP;>;>;>;"
        }
    .end annotation

    iget-object v0, p0, Lwe/j0;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public c()Lwe/r;
    .locals 1

    iget-object v0, p0, Lwe/j0;->e:Lwe/r;

    return-object v0
.end method

.method public d()Lwe/j0$c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lwe/j0$c<",
            "TP;>;"
        }
    .end annotation

    iget-object v0, p0, Lwe/j0;->c:Lwe/j0$c;

    return-object v0
.end method

.method public e([B)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Ljava/util/List<",
            "Lwe/j0$c<",
            "TP;>;>;"
        }
    .end annotation

    iget-object v0, p0, Lwe/j0;->a:Ljava/util/Map;

    invoke-static {p1}, Lef/a;->a([B)Lef/a;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1
.end method

.method public f()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "TP;>;"
        }
    .end annotation

    iget-object v0, p0, Lwe/j0;->d:Ljava/lang/Class;

    return-object v0
.end method

.method public g()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lwe/j0$c<",
            "TP;>;>;"
        }
    .end annotation

    sget-object v0, Lpe/f;->a:[B

    invoke-virtual {p0, v0}, Lwe/j0;->e([B)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public h()Z
    .locals 1

    iget-object v0, p0, Lwe/j0;->e:Lwe/r;

    invoke-virtual {v0}, Lwe/r;->b()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
