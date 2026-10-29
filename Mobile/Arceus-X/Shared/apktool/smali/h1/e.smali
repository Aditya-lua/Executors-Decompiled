.class public Lh1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/z1;


# instance fields
.field public final c:Ln0/z1;

.field public final d:Lg0/k0;

.field public final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ln0/a2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ln0/z1;Lg0/k0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lh1/e;->e:Ljava/util/Map;

    iput-object p1, p0, Lh1/e;->c:Ln0/z1;

    iput-object p2, p0, Lh1/e;->d:Lg0/k0;

    return-void
.end method

.method public static c(Ln0/a2;Lg0/k0;)Ln0/a2;
    .locals 5

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ln0/a2;->b()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln0/a2$c;

    invoke-static {v3, p1}, Ln1/b;->f(Ln0/a2$c;Lg0/k0;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_3

    return-object v0

    :cond_3
    invoke-interface {p0}, Ln0/a2;->a()I

    move-result p1

    invoke-interface {p0}, Ln0/a2;->e()I

    move-result v0

    invoke-interface {p0}, Ln0/a2;->f()Ljava/util/List;

    move-result-object p0

    invoke-static {p1, v0, p0, v1}, Ln0/a2$b;->h(IILjava/util/List;Ljava/util/List;)Ln0/a2$b;

    move-result-object p0

    return-object p0
.end method

.method private d(I)Ln0/a2;
    .locals 2

    iget-object v0, p0, Lh1/e;->e:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh1/e;->e:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln0/a2;

    return-object p1

    :cond_0
    iget-object v0, p0, Lh1/e;->c:Ln0/z1;

    invoke-interface {v0, p1}, Ln0/z1;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lh1/e;->c:Ln0/z1;

    invoke-interface {v0, p1}, Ln0/z1;->b(I)Ln0/a2;

    move-result-object v0

    iget-object v1, p0, Lh1/e;->d:Lg0/k0;

    invoke-static {v0, v1}, Lh1/e;->c(Ln0/a2;Lg0/k0;)Ln0/a2;

    move-result-object v0

    iget-object v1, p0, Lh1/e;->e:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public a(I)Z
    .locals 2

    iget-object v0, p0, Lh1/e;->c:Ln0/z1;

    invoke-interface {v0, p1}, Ln0/z1;->a(I)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-direct {p0, p1}, Lh1/e;->d(I)Ln0/a2;

    move-result-object p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public b(I)Ln0/a2;
    .locals 0

    invoke-direct {p0, p1}, Lh1/e;->d(I)Ln0/a2;

    move-result-object p1

    return-object p1
.end method
