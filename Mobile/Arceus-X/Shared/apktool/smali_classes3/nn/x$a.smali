.class public Lnn/x$a;
.super Ltn/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnn/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ltn/b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ltn/h;Ltn/g;)Ltn/f;
    .locals 5

    invoke-interface {p2}, Ltn/g;->a()Ltn/d;

    move-result-object v0

    invoke-interface {p1}, Ltn/h;->d()I

    move-result v1

    sget v2, Lpn/f;->a:I

    if-lt v1, v2, :cond_0

    invoke-static {}, Ltn/f;->c()Ltn/f;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {p1}, Ltn/h;->e()I

    move-result v1

    invoke-interface {p1}, Ltn/h;->c()I

    move-result v2

    invoke-interface {p1}, Ltn/h;->d()I

    move-result v3

    add-int/2addr v2, v3

    invoke-interface {p2}, Ltn/g;->b()Lrn/j;

    move-result-object p2

    invoke-virtual {p2}, Lrn/j;->f()Z

    move-result p2

    const/4 v3, 0x1

    xor-int/2addr p2, v3

    invoke-interface {p1}, Ltn/h;->b()Lrn/i;

    move-result-object v4

    invoke-virtual {v4}, Lrn/i;->a()Ljava/lang/CharSequence;

    move-result-object v4

    invoke-static {v4, v1, v2, p2}, Lnn/x;->l(Ljava/lang/CharSequence;IIZ)Lnn/x$b;

    move-result-object p2

    if-nez p2, :cond_1

    invoke-static {}, Ltn/f;->c()Ltn/f;

    move-result-object p1

    return-object p1

    :cond_1
    iget v1, p2, Lnn/x$b;->b:I

    new-instance v2, Lnn/y;

    invoke-interface {p1}, Ltn/h;->d()I

    move-result v4

    invoke-interface {p1}, Ltn/h;->c()I

    move-result p1

    sub-int p1, v1, p1

    invoke-direct {v2, v4, p1}, Lnn/y;-><init>(II)V

    instance-of p1, v0, Lnn/x;

    const/4 v4, 0x0

    if-eqz p1, :cond_3

    invoke-interface {v0}, Ltn/d;->d()Lqn/a;

    move-result-object p1

    check-cast p1, Lqn/q;

    iget-object v0, p2, Lnn/x$b;->a:Lqn/q;

    invoke-static {p1, v0}, Lnn/x;->k(Lqn/q;Lqn/q;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    new-array p1, v3, [Ltn/d;

    aput-object v2, p1, v4

    invoke-static {p1}, Ltn/f;->d([Ltn/d;)Ltn/f;

    move-result-object p1

    invoke-virtual {p1, v1}, Ltn/f;->a(I)Ltn/f;

    move-result-object p1

    return-object p1

    :cond_3
    :goto_0
    new-instance p1, Lnn/x;

    iget-object v0, p2, Lnn/x$b;->a:Lqn/q;

    invoke-direct {p1, v0}, Lnn/x;-><init>(Lqn/q;)V

    iget-object p2, p2, Lnn/x$b;->a:Lqn/q;

    invoke-virtual {p2, v3}, Lqn/q;->q(Z)V

    const/4 p2, 0x2

    new-array p2, p2, [Ltn/d;

    aput-object p1, p2, v4

    aput-object v2, p2, v3

    invoke-static {p2}, Ltn/f;->d([Ltn/d;)Ltn/f;

    move-result-object p1

    invoke-virtual {p1, v1}, Ltn/f;->a(I)Ltn/f;

    move-result-object p1

    return-object p1
.end method
