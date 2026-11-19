.class public Lao/m;
.super Lho/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lao/m$a;
    }
.end annotation


# instance fields
.field public final a:Leo/j;

.field public final b:Lfo/j;


# direct methods
.method public constructor <init>(ILfo/j;)V
    .locals 1

    invoke-direct {p0}, Lho/a;-><init>()V

    new-instance v0, Leo/j;

    invoke-direct {v0}, Leo/j;-><init>()V

    iput-object v0, p0, Lao/m;->a:Leo/j;

    invoke-virtual {v0, p1}, Leo/j;->q(I)V

    iput-object p2, p0, Lao/m;->b:Lfo/j;

    return-void
.end method

.method public static bridge synthetic k(Lfo/i;)Lao/m;
    .locals 0

    invoke-static {p0}, Lao/m;->m(Lfo/i;)Lao/m;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic l(Ljava/lang/CharSequence;I)I
    .locals 0

    invoke-static {p0, p1}, Lao/m;->n(Ljava/lang/CharSequence;I)I

    move-result p0

    return p0
.end method

.method public static m(Lfo/i;)Lao/m;
    .locals 10

    invoke-static {p0}, Lfo/j;->g(Lfo/i;)Lfo/j;

    move-result-object p0

    invoke-static {p0}, Lgo/i;->k(Lfo/j;)Lgo/i;

    move-result-object p0

    const/16 v0, 0x23

    invoke-virtual {p0, v0}, Lgo/i;->g(C)I

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_a

    const/4 v3, 0x6

    if-le v1, v3, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-virtual {p0}, Lgo/i;->e()Z

    move-result v3

    if-nez v3, :cond_1

    new-instance p0, Lao/m;

    invoke-static {}, Lfo/j;->b()Lfo/j;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lao/m;-><init>(ILfo/j;)V

    return-object p0

    :cond_1
    invoke-virtual {p0}, Lgo/i;->l()C

    move-result v3

    const/16 v4, 0x9

    const/16 v5, 0x20

    if-eq v3, v5, :cond_2

    if-eq v3, v4, :cond_2

    return-object v2

    :cond_2
    invoke-virtual {p0}, Lgo/i;->r()I

    invoke-virtual {p0}, Lgo/i;->o()Lgo/h;

    move-result-object v2

    const/4 v3, 0x1

    move-object v6, v2

    :goto_0
    move v7, v3

    :goto_1
    invoke-virtual {p0}, Lgo/i;->e()Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-virtual {p0}, Lgo/i;->l()C

    move-result v8

    if-eq v8, v4, :cond_7

    if-eq v8, v5, :cond_7

    const/4 v9, 0x0

    if-eq v8, v0, :cond_3

    invoke-virtual {p0}, Lgo/i;->h()V

    invoke-virtual {p0}, Lgo/i;->o()Lgo/h;

    move-result-object v6

    goto :goto_2

    :cond_3
    if-eqz v7, :cond_6

    invoke-virtual {p0, v0}, Lgo/i;->g(C)I

    invoke-virtual {p0}, Lgo/i;->r()I

    move-result v7

    invoke-virtual {p0}, Lgo/i;->e()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-virtual {p0}, Lgo/i;->o()Lgo/h;

    move-result-object v6

    :cond_4
    if-lez v7, :cond_5

    goto :goto_0

    :cond_5
    :goto_2
    move v7, v9

    goto :goto_1

    :cond_6
    invoke-virtual {p0}, Lgo/i;->h()V

    invoke-virtual {p0}, Lgo/i;->o()Lgo/h;

    move-result-object v6

    goto :goto_1

    :cond_7
    invoke-virtual {p0}, Lgo/i;->h()V

    goto :goto_0

    :cond_8
    invoke-virtual {p0, v2, v6}, Lgo/i;->d(Lgo/h;Lgo/h;)Lfo/j;

    move-result-object p0

    invoke-virtual {p0}, Lfo/j;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_9

    new-instance p0, Lao/m;

    invoke-static {}, Lfo/j;->b()Lfo/j;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lao/m;-><init>(ILfo/j;)V

    return-object p0

    :cond_9
    new-instance v0, Lao/m;

    invoke-direct {v0, v1, p0}, Lao/m;-><init>(ILfo/j;)V

    return-object v0

    :cond_a
    :goto_3
    return-object v2
.end method

.method public static n(Ljava/lang/CharSequence;I)I
    .locals 3

    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/4 v1, 0x1

    const/16 v2, 0x2d

    if-eq v0, v2, :cond_1

    const/16 v2, 0x3d

    if-eq v0, v2, :cond_0

    goto :goto_0

    :cond_0
    add-int/2addr p1, v1

    invoke-static {p0, p1, v2}, Lao/m;->o(Ljava/lang/CharSequence;IC)Z

    move-result p0

    if-eqz p0, :cond_2

    return v1

    :cond_1
    add-int/2addr p1, v1

    invoke-static {p0, p1, v2}, Lao/m;->o(Ljava/lang/CharSequence;IC)Z

    move-result p0

    if-eqz p0, :cond_2

    const/4 p0, 0x2

    return p0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static o(Ljava/lang/CharSequence;IC)Z
    .locals 1

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-static {p2, p0, p1, v0}, Ljo/d;->i(CLjava/lang/CharSequence;II)I

    move-result p1

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p2

    invoke-static {p0, p1, p2}, Ljo/d;->k(Ljava/lang/CharSequence;II)I

    move-result p1

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p0

    if-lt p1, p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public a(Lho/h;)Lho/c;
    .locals 0

    invoke-static {}, Lho/c;->d()Lho/c;

    move-result-object p1

    return-object p1
.end method

.method public f()Leo/a;
    .locals 1

    iget-object v0, p0, Lao/m;->a:Leo/j;

    return-object v0
.end method

.method public j(Lfo/b;)V
    .locals 2

    iget-object v0, p0, Lao/m;->b:Lfo/j;

    iget-object v1, p0, Lao/m;->a:Leo/j;

    invoke-interface {p1, v0, v1}, Lfo/b;->b(Lfo/j;Leo/s;)V

    return-void
.end method
