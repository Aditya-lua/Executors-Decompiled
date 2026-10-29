.class public Lnn/y;
.super Ltn/a;
.source "SourceFile"


# instance fields
.field public final a:Lqn/r;

.field public b:I

.field public c:Z


# direct methods
.method public constructor <init>(II)V
    .locals 1

    invoke-direct {p0}, Ltn/a;-><init>()V

    new-instance v0, Lqn/r;

    invoke-direct {v0}, Lqn/r;-><init>()V

    iput-object v0, p0, Lnn/y;->a:Lqn/r;

    iput p2, p0, Lnn/y;->b:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lqn/r;->q(Ljava/lang/Integer;)V

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lqn/r;->p(Ljava/lang/Integer;)V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public b(Ltn/h;)Ltn/c;
    .locals 2

    invoke-interface {p1}, Ltn/h;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lnn/y;->a:Lqn/r;

    invoke-virtual {v0}, Lqn/s;->d()Lqn/s;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Ltn/c;->d()Ltn/c;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {p1}, Ltn/h;->f()Ltn/d;

    move-result-object v0

    invoke-interface {v0}, Ltn/d;->d()Lqn/a;

    move-result-object v0

    instance-of v1, v0, Lqn/w;

    if-nez v1, :cond_2

    instance-of v0, v0, Lqn/r;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, 0x1

    :goto_1
    iput-boolean v0, p0, Lnn/y;->c:Z

    invoke-interface {p1}, Ltn/h;->e()I

    move-result p1

    invoke-static {p1}, Ltn/c;->b(I)Ltn/c;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-interface {p1}, Ltn/h;->d()I

    move-result v0

    iget v1, p0, Lnn/y;->b:I

    if-lt v0, v1, :cond_4

    invoke-interface {p1}, Ltn/h;->c()I

    move-result p1

    iget v0, p0, Lnn/y;->b:I

    add-int/2addr p1, v0

    invoke-static {p1}, Ltn/c;->a(I)Ltn/c;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {}, Ltn/c;->d()Ltn/c;

    move-result-object p1

    return-object p1
.end method

.method public d()Lqn/a;
    .locals 1

    iget-object v0, p0, Lnn/y;->a:Lqn/r;

    return-object v0
.end method

.method public e(Lqn/a;)Z
    .locals 1

    iget-boolean p1, p0, Lnn/y;->c:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lnn/y;->a:Lqn/r;

    invoke-virtual {p1}, Lqn/a;->o()Lqn/a;

    move-result-object p1

    instance-of v0, p1, Lqn/q;

    if-eqz v0, :cond_0

    check-cast p1, Lqn/q;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lqn/q;->q(Z)V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method
