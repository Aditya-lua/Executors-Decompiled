.class public Lao/l$a;
.super Lho/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lao/l;
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
    .locals 2

    invoke-interface {p1}, Lho/h;->d()I

    move-result p2

    sget v0, Lco/f;->a:I

    if-lt p2, v0, :cond_0

    invoke-static {}, Lho/f;->c()Lho/f;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {p1}, Lho/h;->e()I

    move-result v0

    invoke-interface {p1}, Lho/h;->b()Lfo/i;

    move-result-object p1

    invoke-virtual {p1}, Lfo/i;->a()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-static {p1, v0, p2}, Lao/l;->l(Ljava/lang/CharSequence;II)Lao/l;

    move-result-object p1

    if-eqz p1, :cond_1

    const/4 p2, 0x1

    new-array p2, p2, [Lho/d;

    const/4 v1, 0x0

    aput-object p1, p2, v1

    invoke-static {p2}, Lho/f;->d([Lho/d;)Lho/f;

    move-result-object p2

    invoke-static {p1}, Lao/l;->k(Lao/l;)Leo/h;

    move-result-object p1

    invoke-virtual {p1}, Leo/h;->t()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    add-int/2addr v0, p1

    invoke-virtual {p2, v0}, Lho/f;->b(I)Lho/f;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {}, Lho/f;->c()Lho/f;

    move-result-object p1

    return-object p1
.end method
