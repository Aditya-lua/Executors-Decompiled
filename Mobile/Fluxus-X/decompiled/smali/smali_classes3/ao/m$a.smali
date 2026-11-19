.class public Lao/m$a;
.super Lho/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lao/m;
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

    invoke-interface {p1}, Lho/h;->d()I

    move-result v0

    sget v1, Lco/f;->a:I

    if-lt v0, v1, :cond_0

    invoke-static {}, Lho/f;->c()Lho/f;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {p1}, Lho/h;->b()Lfo/i;

    move-result-object v0

    invoke-interface {p1}, Lho/h;->e()I

    move-result p1

    invoke-virtual {v0}, Lfo/i;->a()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    const/16 v2, 0x23

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v1, v2, :cond_1

    invoke-virtual {v0}, Lfo/i;->a()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-virtual {v0, p1, v1}, Lfo/i;->d(II)Lfo/i;

    move-result-object v1

    invoke-static {v1}, Lao/m;->k(Lfo/i;)Lao/m;

    move-result-object v1

    if-eqz v1, :cond_1

    new-array p1, v4, [Lho/d;

    aput-object v1, p1, v3

    invoke-static {p1}, Lho/f;->d([Lho/d;)Lho/f;

    move-result-object p1

    invoke-virtual {v0}, Lfo/i;->a()Ljava/lang/CharSequence;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p2

    invoke-virtual {p1, p2}, Lho/f;->b(I)Lho/f;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {v0}, Lfo/i;->a()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {v1, p1}, Lao/m;->l(Ljava/lang/CharSequence;I)I

    move-result p1

    if-lez p1, :cond_2

    invoke-interface {p2}, Lho/g;->b()Lfo/j;

    move-result-object p2

    invoke-virtual {p2}, Lfo/j;->f()Z

    move-result v1

    if-nez v1, :cond_2

    new-instance v1, Lao/m;

    invoke-direct {v1, p1, p2}, Lao/m;-><init>(ILfo/j;)V

    new-array p1, v4, [Lho/d;

    aput-object v1, p1, v3

    invoke-static {p1}, Lho/f;->d([Lho/d;)Lho/f;

    move-result-object p1

    invoke-virtual {v0}, Lfo/i;->a()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-virtual {p1, v0}, Lho/f;->b(I)Lho/f;

    move-result-object p1

    invoke-virtual {p2}, Lfo/j;->d()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    invoke-virtual {p1, p2}, Lho/f;->e(I)Lho/f;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-static {}, Lho/f;->c()Lho/f;

    move-result-object p1

    return-object p1
.end method
