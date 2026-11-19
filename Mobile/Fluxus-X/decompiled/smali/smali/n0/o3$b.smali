.class public Ln0/o3$b;
.super Ln0/o3$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln0/o3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ln0/o3$a;-><init>()V

    return-void
.end method

.method public static r(Ln0/i4;Landroid/util/Size;)Ln0/o3$b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/i4<",
            "*>;",
            "Landroid/util/Size;",
            ")",
            "Ln0/o3$b;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ln0/i4;->F(Ln0/o3$e;)Ln0/o3$e;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Ln0/o3$b;

    invoke-direct {v1}, Ln0/o3$b;-><init>()V

    invoke-interface {v0, p1, p0, v1}, Ln0/o3$e;->a(Landroid/util/Size;Ln0/i4;Ln0/o3$b;)V

    return-object v1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Implementation is missing option unpacker for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0, v1}, Ls0/q;->u(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public A(I)Ln0/o3$b;
    .locals 0

    iput p1, p0, Ln0/o3$a;->h:I

    return-object p0
.end method

.method public B(I)Ln0/o3$b;
    .locals 1

    iget-object v0, p0, Ln0/o3$a;->b:Ln0/l1$a;

    invoke-virtual {v0, p1}, Ln0/l1$a;->v(I)V

    return-object p0
.end method

.method public C(I)Ln0/o3$b;
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Ln0/o3$a;->b:Ln0/l1$a;

    invoke-virtual {v0, p1}, Ln0/l1$a;->x(I)V

    :cond_0
    return-object p0
.end method

.method public a(Ljava/util/Collection;)Ln0/o3$b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ln0/u;",
            ">;)",
            "Ln0/o3$b;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/u;

    iget-object v1, p0, Ln0/o3$a;->b:Ln0/l1$a;

    invoke-virtual {v1, v0}, Ln0/l1$a;->c(Ln0/u;)V

    iget-object v1, p0, Ln0/o3$a;->e:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Ln0/o3$a;->e:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object p0
.end method

.method public b(Ljava/util/Collection;)Ln0/o3$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroid/hardware/camera2/CameraDevice$StateCallback;",
            ">;)",
            "Ln0/o3$b;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/camera2/CameraDevice$StateCallback;

    invoke-virtual {p0, v0}, Ln0/o3$b;->f(Landroid/hardware/camera2/CameraDevice$StateCallback;)Ln0/o3$b;

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public c(Ljava/util/Collection;)Ln0/o3$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ln0/u;",
            ">;)",
            "Ln0/o3$b;"
        }
    .end annotation

    iget-object v0, p0, Ln0/o3$a;->b:Ln0/l1$a;

    invoke-virtual {v0, p1}, Ln0/l1$a;->a(Ljava/util/Collection;)V

    return-object p0
.end method

.method public d(Ljava/util/List;)Ln0/o3$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;",
            ">;)",
            "Ln0/o3$b;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    invoke-virtual {p0, v0}, Ln0/o3$b;->k(Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)Ln0/o3$b;

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public e(Ln0/u;)Ln0/o3$b;
    .locals 1

    iget-object v0, p0, Ln0/o3$a;->b:Ln0/l1$a;

    invoke-virtual {v0, p1}, Ln0/l1$a;->c(Ln0/u;)V

    iget-object v0, p0, Ln0/o3$a;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ln0/o3$a;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object p0
.end method

.method public f(Landroid/hardware/camera2/CameraDevice$StateCallback;)Ln0/o3$b;
    .locals 1

    iget-object v0, p0, Ln0/o3$a;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    iget-object v0, p0, Ln0/o3$a;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public g(Ln0/n1;)Ln0/o3$b;
    .locals 1

    iget-object v0, p0, Ln0/o3$a;->b:Ln0/l1$a;

    invoke-virtual {v0, p1}, Ln0/l1$a;->e(Ln0/n1;)V

    return-object p0
.end method

.method public h(Ln0/u1;)Ln0/o3$b;
    .locals 1

    sget-object v0, Lg0/k0;->d:Lg0/k0;

    invoke-virtual {p0, p1, v0}, Ln0/o3$b;->i(Ln0/u1;Lg0/k0;)Ln0/o3$b;

    move-result-object p1

    return-object p1
.end method

.method public i(Ln0/u1;Lg0/k0;)Ln0/o3$b;
    .locals 0

    invoke-static {p1}, Ln0/o3$f;->a(Ln0/u1;)Ln0/o3$f$a;

    move-result-object p1

    invoke-virtual {p1, p2}, Ln0/o3$f$a;->b(Lg0/k0;)Ln0/o3$f$a;

    move-result-object p1

    invoke-virtual {p1}, Ln0/o3$f$a;->a()Ln0/o3$f;

    move-result-object p1

    iget-object p2, p0, Ln0/o3$a;->a:Ljava/util/Set;

    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public j(Ln0/u;)Ln0/o3$b;
    .locals 1

    iget-object v0, p0, Ln0/o3$a;->b:Ln0/l1$a;

    invoke-virtual {v0, p1}, Ln0/l1$a;->c(Ln0/u;)V

    return-object p0
.end method

.method public k(Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)Ln0/o3$b;
    .locals 1

    iget-object v0, p0, Ln0/o3$a;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    iget-object v0, p0, Ln0/o3$a;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public l(Ln0/u1;)Ln0/o3$b;
    .locals 1

    sget-object v0, Lg0/k0;->d:Lg0/k0;

    invoke-virtual {p0, p1, v0}, Ln0/o3$b;->m(Ln0/u1;Lg0/k0;)Ln0/o3$b;

    move-result-object p1

    return-object p1
.end method

.method public m(Ln0/u1;Lg0/k0;)Ln0/o3$b;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, -0x1

    invoke-virtual {p0, p1, p2, v0, v1}, Ln0/o3$b;->n(Ln0/u1;Lg0/k0;Ljava/lang/String;I)Ln0/o3$b;

    move-result-object p1

    return-object p1
.end method

.method public n(Ln0/u1;Lg0/k0;Ljava/lang/String;I)Ln0/o3$b;
    .locals 1

    invoke-static {p1}, Ln0/o3$f;->a(Ln0/u1;)Ln0/o3$f$a;

    move-result-object v0

    invoke-virtual {v0, p3}, Ln0/o3$f$a;->d(Ljava/lang/String;)Ln0/o3$f$a;

    move-result-object p3

    invoke-virtual {p3, p2}, Ln0/o3$f$a;->b(Lg0/k0;)Ln0/o3$f$a;

    move-result-object p2

    invoke-virtual {p2, p4}, Ln0/o3$f$a;->c(I)Ln0/o3$f$a;

    move-result-object p2

    invoke-virtual {p2}, Ln0/o3$f$a;->a()Ln0/o3$f;

    move-result-object p2

    iget-object p3, p0, Ln0/o3$a;->a:Ljava/util/Set;

    invoke-interface {p3, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object p2, p0, Ln0/o3$a;->b:Ln0/l1$a;

    invoke-virtual {p2, p1}, Ln0/l1$a;->f(Ln0/u1;)V

    return-object p0
.end method

.method public o(Ljava/lang/String;Ljava/lang/Object;)Ln0/o3$b;
    .locals 1

    iget-object v0, p0, Ln0/o3$a;->b:Ln0/l1$a;

    invoke-virtual {v0, p1, p2}, Ln0/l1$a;->g(Ljava/lang/String;Ljava/lang/Object;)V

    return-object p0
.end method

.method public p()Ln0/o3;
    .locals 10

    new-instance v0, Ln0/o3;

    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Ln0/o3$a;->a:Ljava/util/Set;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Ln0/o3$a;->c:Ljava/util/List;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v3, Ljava/util/ArrayList;

    iget-object v4, p0, Ln0/o3$a;->d:Ljava/util/List;

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v4, Ljava/util/ArrayList;

    iget-object v5, p0, Ln0/o3$a;->e:Ljava/util/List;

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v5, p0, Ln0/o3$a;->b:Ln0/l1$a;

    invoke-virtual {v5}, Ln0/l1$a;->h()Ln0/l1;

    move-result-object v5

    iget-object v6, p0, Ln0/o3$a;->f:Ln0/o3$d;

    iget-object v7, p0, Ln0/o3$a;->g:Landroid/hardware/camera2/params/InputConfiguration;

    iget v8, p0, Ln0/o3$a;->h:I

    iget-object v9, p0, Ln0/o3$a;->i:Ln0/o3$f;

    invoke-direct/range {v0 .. v9}, Ln0/o3;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ln0/l1;Ln0/o3$d;Landroid/hardware/camera2/params/InputConfiguration;ILn0/o3$f;)V

    return-object v0
.end method

.method public q()Ln0/o3$b;
    .locals 1

    iget-object v0, p0, Ln0/o3$a;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    iget-object v0, p0, Ln0/o3$a;->b:Ln0/l1$a;

    invoke-virtual {v0}, Ln0/l1$a;->i()V

    return-object p0
.end method

.method public s()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ln0/u;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ln0/o3$a;->e:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public t(Ln0/u;)Z
    .locals 2

    iget-object v0, p0, Ln0/o3$a;->b:Ln0/l1$a;

    invoke-virtual {v0, p1}, Ln0/l1$a;->o(Ln0/u;)Z

    move-result v0

    iget-object v1, p0, Ln0/o3$a;->e:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    move-result p1

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public u(Ln0/o3$d;)Ln0/o3$b;
    .locals 0

    iput-object p1, p0, Ln0/o3$a;->f:Ln0/o3$d;

    return-object p0
.end method

.method public v(Landroid/util/Range;)Ln0/o3$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;)",
            "Ln0/o3$b;"
        }
    .end annotation

    iget-object v0, p0, Ln0/o3$a;->b:Ln0/l1$a;

    invoke-virtual {v0, p1}, Ln0/l1$a;->q(Landroid/util/Range;)V

    return-object p0
.end method

.method public w(Ln0/n1;)Ln0/o3$b;
    .locals 1

    iget-object v0, p0, Ln0/o3$a;->b:Ln0/l1$a;

    invoke-virtual {v0, p1}, Ln0/l1$a;->s(Ln0/n1;)V

    return-object p0
.end method

.method public x(Landroid/hardware/camera2/params/InputConfiguration;)Ln0/o3$b;
    .locals 0

    iput-object p1, p0, Ln0/o3$a;->g:Landroid/hardware/camera2/params/InputConfiguration;

    return-object p0
.end method

.method public y(Ln0/u1;)Ln0/o3$b;
    .locals 0

    invoke-static {p1}, Ln0/o3$f;->a(Ln0/u1;)Ln0/o3$f$a;

    move-result-object p1

    invoke-virtual {p1}, Ln0/o3$f$a;->a()Ln0/o3$f;

    move-result-object p1

    iput-object p1, p0, Ln0/o3$a;->i:Ln0/o3$f;

    return-object p0
.end method

.method public z(I)Ln0/o3$b;
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Ln0/o3$a;->b:Ln0/l1$a;

    invoke-virtual {v0, p1}, Ln0/l1$a;->u(I)V

    :cond_0
    return-object p0
.end method
