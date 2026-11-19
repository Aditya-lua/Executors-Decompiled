.class public Lao/y;
.super Lho/a;
.source "SourceFile"


# instance fields
.field public final a:Leo/r;

.field public b:I

.field public c:Z


# direct methods
.method public constructor <init>(II)V
    .locals 1

    invoke-direct {p0}, Lho/a;-><init>()V

    new-instance v0, Leo/r;

    invoke-direct {v0}, Leo/r;-><init>()V

    iput-object v0, p0, Lao/y;->a:Leo/r;

    iput p2, p0, Lao/y;->b:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Leo/r;->q(Ljava/lang/Integer;)V

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Leo/r;->p(Ljava/lang/Integer;)V

    return-void
.end method


# virtual methods
.method public a(Lho/h;)Lho/c;
    .locals 2

    invoke-interface {p1}, Lho/h;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lao/y;->a:Leo/r;

    invoke-virtual {v0}, Leo/s;->d()Leo/s;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lho/c;->d()Lho/c;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {p1}, Lho/h;->f()Lho/d;

    move-result-object v0

    invoke-interface {v0}, Lho/d;->f()Leo/a;

    move-result-object v0

    instance-of v1, v0, Leo/w;

    if-nez v1, :cond_2

    instance-of v0, v0, Leo/r;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, 0x1

    :goto_1
    iput-boolean v0, p0, Lao/y;->c:Z

    invoke-interface {p1}, Lho/h;->e()I

    move-result p1

    invoke-static {p1}, Lho/c;->b(I)Lho/c;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-interface {p1}, Lho/h;->d()I

    move-result v0

    iget v1, p0, Lao/y;->b:I

    if-lt v0, v1, :cond_4

    invoke-interface {p1}, Lho/h;->c()I

    move-result p1

    iget v0, p0, Lao/y;->b:I

    add-int/2addr p1, v0

    invoke-static {p1}, Lho/c;->a(I)Lho/c;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {}, Lho/c;->d()Lho/c;

    move-result-object p1

    return-object p1
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public f()Leo/a;
    .locals 1

    iget-object v0, p0, Lao/y;->a:Leo/r;

    return-object v0
.end method

.method public g(Leo/a;)Z
    .locals 1

    iget-boolean p1, p0, Lao/y;->c:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lao/y;->a:Leo/r;

    invoke-virtual {p1}, Leo/a;->o()Leo/a;

    move-result-object p1

    instance-of v0, p1, Leo/q;

    if-eqz v0, :cond_0

    check-cast p1, Leo/q;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Leo/q;->q(Z)V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method
