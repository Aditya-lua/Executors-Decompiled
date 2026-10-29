.class public Lo1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/z1;


# instance fields
.field public final c:Ln0/z1;

.field public final d:Ln0/k3;

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
.method public constructor <init>(Ln0/z1;Ln0/k3;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo1/e;->e:Ljava/util/Map;

    iput-object p1, p0, Lo1/e;->c:Ln0/z1;

    iput-object p2, p0, Lo1/e;->d:Ln0/k3;

    return-void
.end method

.method public static d(Ln0/a2$c;Landroid/util/Size;)Ln0/a2$c;
    .locals 10

    invoke-virtual {p0}, Ln0/a2$c;->e()I

    move-result v0

    invoke-virtual {p0}, Ln0/a2$c;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Ln0/a2$c;->c()I

    move-result v2

    invoke-virtual {p0}, Ln0/a2$c;->f()I

    move-result v3

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v4

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result v5

    invoke-virtual {p0}, Ln0/a2$c;->j()I

    move-result v6

    invoke-virtual {p0}, Ln0/a2$c;->b()I

    move-result v7

    invoke-virtual {p0}, Ln0/a2$c;->d()I

    move-result v8

    invoke-virtual {p0}, Ln0/a2$c;->g()I

    move-result v9

    invoke-static/range {v0 .. v9}, Ln0/a2$c;->a(ILjava/lang/String;IIIIIIII)Ln0/a2$c;

    move-result-object p0

    return-object p0
.end method

.method private f(I)Ln0/a2;
    .locals 2

    iget-object v0, p0, Lo1/e;->e:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo1/e;->e:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln0/a2;

    return-object p1

    :cond_0
    iget-object v0, p0, Lo1/e;->c:Ln0/z1;

    invoke-interface {v0, p1}, Ln0/z1;->a(I)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo1/e;->c:Ln0/z1;

    invoke-interface {v0, p1}, Ln0/z1;->b(I)Ln0/a2;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Ln0/a2;

    invoke-virtual {p0, p1}, Lo1/e;->e(I)Landroid/util/Size;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v0, v1}, Lo1/e;->c(Ln0/a2;Landroid/util/Size;)Ln0/a2;

    move-result-object v0

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lo1/e;->e:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method public a(I)Z
    .locals 2

    iget-object v0, p0, Lo1/e;->c:Ln0/z1;

    invoke-interface {v0, p1}, Ln0/z1;->a(I)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-direct {p0, p1}, Lo1/e;->f(I)Ln0/a2;

    move-result-object p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public b(I)Ln0/a2;
    .locals 0

    invoke-direct {p0, p1}, Lo1/e;->f(I)Ln0/a2;

    move-result-object p1

    return-object p1
.end method

.method public final c(Ln0/a2;Landroid/util/Size;)Ln0/a2;
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ln0/a2;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln0/a2$c;

    invoke-static {v2, p2}, Lo1/e;->d(Ln0/a2$c;Landroid/util/Size;)Ln0/a2$c;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    invoke-interface {p1}, Ln0/a2;->a()I

    move-result p2

    invoke-interface {p1}, Ln0/a2;->e()I

    move-result v1

    invoke-interface {p1}, Ln0/a2;->f()Ljava/util/List;

    move-result-object p1

    invoke-static {p2, v1, p1, v0}, Ln0/a2$b;->h(IILjava/util/List;Ljava/util/List;)Ln0/a2$b;

    move-result-object p1

    return-object p1
.end method

.method public final e(I)Landroid/util/Size;
    .locals 2

    iget-object v0, p0, Lo1/e;->d:Ln0/k3;

    const-class v1, Landroidx/camera/video/internal/compat/quirk/StretchedVideoResolutionQuirk;

    invoke-virtual {v0, v1}, Ln0/k3;->c(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/video/internal/compat/quirk/StretchedVideoResolutionQuirk;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Landroidx/camera/video/internal/compat/quirk/StretchedVideoResolutionQuirk;->g(I)Landroid/util/Size;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method
