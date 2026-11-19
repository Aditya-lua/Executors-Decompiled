.class public Lao/x;
.super Lho/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lao/x$c;,
        Lao/x$b;,
        Lao/x$a;
    }
.end annotation


# instance fields
.field public final a:Leo/q;

.field public b:Z

.field public c:I


# direct methods
.method public constructor <init>(Leo/q;)V
    .locals 0

    invoke-direct {p0}, Lho/a;-><init>()V

    iput-object p1, p0, Lao/x;->a:Leo/q;

    return-void
.end method

.method public static bridge synthetic k(Leo/q;Leo/q;)Z
    .locals 0

    invoke-static {p0, p1}, Lao/x;->n(Leo/q;Leo/q;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic l(Ljava/lang/CharSequence;IIZ)Lao/x$b;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lao/x;->o(Ljava/lang/CharSequence;IIZ)Lao/x$b;

    move-result-object p0

    return-object p0
.end method

.method public static m(Ljava/lang/CharSequence;I)Z
    .locals 2

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ge p1, v0, :cond_0

    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p0

    const/16 p1, 0x9

    if-eq p0, p1, :cond_0

    const/16 p1, 0x20

    if-eq p0, p1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    return v1
.end method

.method public static n(Leo/q;Leo/q;)Z
    .locals 1

    instance-of v0, p0, Leo/c;

    if-eqz v0, :cond_0

    instance-of v0, p1, Leo/c;

    if-eqz v0, :cond_0

    check-cast p0, Leo/c;

    invoke-virtual {p0}, Leo/c;->r()Ljava/lang/String;

    move-result-object p0

    check-cast p1, Leo/c;

    invoke-virtual {p1}, Leo/c;->r()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_0
    instance-of v0, p0, Leo/v;

    if-eqz v0, :cond_1

    instance-of v0, p1, Leo/v;

    if-eqz v0, :cond_1

    check-cast p0, Leo/v;

    invoke-virtual {p0}, Leo/v;->r()Ljava/lang/String;

    move-result-object p0

    check-cast p1, Leo/v;

    invoke-virtual {p1}, Leo/v;->r()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static o(Ljava/lang/CharSequence;IIZ)Lao/x$b;
    .locals 7

    invoke-static {p0, p1}, Lao/x;->p(Ljava/lang/CharSequence;I)Lao/x$c;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget-object v2, v0, Lao/x$c;->a:Leo/q;

    iget v0, v0, Lao/x$c;->b:I

    sub-int p1, v0, p1

    add-int/2addr p2, p1

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p1

    move v3, p2

    :goto_0
    const/4 v4, 0x1

    if-ge v0, p1, :cond_3

    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    const/16 v6, 0x9

    if-ne v5, v6, :cond_1

    invoke-static {v3}, Lco/f;->a(I)I

    move-result v4

    add-int/2addr v3, v4

    goto :goto_1

    :cond_1
    const/16 v6, 0x20

    if-ne v5, v6, :cond_2

    add-int/lit8 v3, v3, 0x1

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    move p0, v4

    goto :goto_2

    :cond_3
    const/4 p0, 0x0

    :goto_2
    if-eqz p3, :cond_5

    instance-of p1, v2, Leo/v;

    if-eqz p1, :cond_4

    move-object p1, v2

    check-cast p1, Leo/v;

    invoke-virtual {p1}, Leo/v;->s()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-eq p1, v4, :cond_4

    return-object v1

    :cond_4
    if-nez p0, :cond_5

    return-object v1

    :cond_5
    if-eqz p0, :cond_6

    sub-int p0, v3, p2

    sget p1, Lco/f;->a:I

    if-le p0, p1, :cond_7

    :cond_6
    add-int/lit8 v3, p2, 0x1

    :cond_7
    new-instance p0, Lao/x$b;

    invoke-direct {p0, v2, v3}, Lao/x$b;-><init>(Leo/q;I)V

    return-object p0
.end method

.method public static p(Ljava/lang/CharSequence;I)Lao/x$c;
    .locals 2

    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v1, 0x2a

    if-eq v0, v1, :cond_0

    const/16 v1, 0x2b

    if-eq v0, v1, :cond_0

    const/16 v1, 0x2d

    if-eq v0, v1, :cond_0

    invoke-static {p0, p1}, Lao/x;->q(Ljava/lang/CharSequence;I)Lao/x$c;

    move-result-object p0

    return-object p0

    :cond_0
    add-int/lit8 p1, p1, 0x1

    invoke-static {p0, p1}, Lao/x;->m(Ljava/lang/CharSequence;I)Z

    move-result p0

    if-eqz p0, :cond_1

    new-instance p0, Leo/c;

    invoke-direct {p0}, Leo/c;-><init>()V

    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Leo/c;->s(Ljava/lang/String;)V

    new-instance v0, Lao/x$c;

    invoke-direct {v0, p0, p1}, Lao/x$c;-><init>(Leo/q;I)V

    return-object v0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static q(Ljava/lang/CharSequence;I)Lao/x$c;
    .locals 6

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    move v2, p1

    :goto_0
    const/4 v3, 0x0

    if-ge v2, v0, :cond_2

    invoke-interface {p0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    const/16 v5, 0x29

    if-eq v4, v5, :cond_1

    const/16 v5, 0x2e

    if-eq v4, v5, :cond_1

    packed-switch v4, :pswitch_data_0

    return-object v3

    :pswitch_0
    add-int/lit8 v1, v1, 0x1

    const/16 v4, 0x9

    if-le v1, v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    if-lt v1, v0, :cond_2

    add-int/lit8 v0, v2, 0x1

    invoke-static {p0, v0}, Lao/x;->m(Ljava/lang/CharSequence;I)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0, p1, v2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Leo/v;

    invoke-direct {p1}, Leo/v;-><init>()V

    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p1, p0}, Leo/v;->v(Ljava/lang/Integer;)V

    invoke-static {v4}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Leo/v;->u(Ljava/lang/String;)V

    new-instance p0, Lao/x$c;

    invoke-direct {p0, p1, v0}, Lao/x$c;-><init>(Leo/q;I)V

    return-object p0

    :cond_2
    return-object v3

    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(Lho/h;)Lho/c;
    .locals 2

    invoke-interface {p1}, Lho/h;->a()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Lao/x;->b:Z

    const/4 v0, 0x0

    iput v0, p0, Lao/x;->c:I

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lao/x;->b:Z

    if-eqz v0, :cond_1

    iget v0, p0, Lao/x;->c:I

    add-int/2addr v0, v1

    iput v0, p0, Lao/x;->c:I

    :cond_1
    :goto_0
    invoke-interface {p1}, Lho/h;->getIndex()I

    move-result p1

    invoke-static {p1}, Lho/c;->b(I)Lho/c;

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

    iget-object v0, p0, Lao/x;->a:Leo/q;

    return-object v0
.end method

.method public g(Leo/a;)Z
    .locals 2

    instance-of p1, p1, Leo/r;

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    iget-boolean p1, p0, Lao/x;->b:Z

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    iget p1, p0, Lao/x;->c:I

    if-ne p1, v1, :cond_0

    iget-object p1, p0, Lao/x;->a:Leo/q;

    invoke-virtual {p1, v0}, Leo/q;->q(Z)V

    iput-boolean v0, p0, Lao/x;->b:Z

    :cond_0
    return v1

    :cond_1
    return v0
.end method
