.class public Lao/x$a;
.super Lho/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lao/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lho/b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lho/h;Lho/g;)Lho/f;
    .locals 5

    invoke-interface {p2}, Lho/g;->a()Lho/d;

    move-result-object v0

    invoke-interface {p1}, Lho/h;->d()I

    move-result v1

    sget v2, Lco/f;->a:I

    if-lt v1, v2, :cond_0

    invoke-static {}, Lho/f;->c()Lho/f;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {p1}, Lho/h;->e()I

    move-result v1

    invoke-interface {p1}, Lho/h;->c()I

    move-result v2

    invoke-interface {p1}, Lho/h;->d()I

    move-result v3

    add-int/2addr v2, v3

    invoke-interface {p2}, Lho/g;->b()Lfo/j;

    move-result-object p2

    invoke-virtual {p2}, Lfo/j;->f()Z

    move-result p2

    const/4 v3, 0x1

    xor-int/2addr p2, v3

    invoke-interface {p1}, Lho/h;->b()Lfo/i;

    move-result-object v4

    invoke-virtual {v4}, Lfo/i;->a()Ljava/lang/CharSequence;

    move-result-object v4

    invoke-static {v4, v1, v2, p2}, Lao/x;->l(Ljava/lang/CharSequence;IIZ)Lao/x$b;

    move-result-object p2

    if-nez p2, :cond_1

    invoke-static {}, Lho/f;->c()Lho/f;

    move-result-object p1

    return-object p1

    :cond_1
    iget v1, p2, Lao/x$b;->b:I

    new-instance v2, Lao/y;

    invoke-interface {p1}, Lho/h;->d()I

    move-result v4

    invoke-interface {p1}, Lho/h;->c()I

    move-result p1

    sub-int p1, v1, p1

    invoke-direct {v2, v4, p1}, Lao/y;-><init>(II)V

    instance-of p1, v0, Lao/x;

    const/4 v4, 0x0

    if-eqz p1, :cond_3

    invoke-interface {v0}, Lho/d;->f()Leo/a;

    move-result-object p1

    check-cast p1, Leo/q;

    iget-object v0, p2, Lao/x$b;->a:Leo/q;

    invoke-static {p1, v0}, Lao/x;->k(Leo/q;Leo/q;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    new-array p1, v3, [Lho/d;

    aput-object v2, p1, v4

    invoke-static {p1}, Lho/f;->d([Lho/d;)Lho/f;

    move-result-object p1

    invoke-virtual {p1, v1}, Lho/f;->a(I)Lho/f;

    move-result-object p1

    return-object p1

    :cond_3
    :goto_0
    new-instance p1, Lao/x;

    iget-object v0, p2, Lao/x$b;->a:Leo/q;

    invoke-direct {p1, v0}, Lao/x;-><init>(Leo/q;)V

    iget-object p2, p2, Lao/x$b;->a:Leo/q;

    invoke-virtual {p2, v3}, Leo/q;->q(Z)V

    const/4 p2, 0x2

    new-array p2, p2, [Lho/d;

    aput-object p1, p2, v4

    aput-object v2, p2, v3

    invoke-static {p2}, Lho/f;->d([Lho/d;)Lho/f;

    move-result-object p1

    invoke-virtual {p1, v1}, Lho/f;->a(I)Lho/f;

    move-result-object p1

    return-object p1
.end method
