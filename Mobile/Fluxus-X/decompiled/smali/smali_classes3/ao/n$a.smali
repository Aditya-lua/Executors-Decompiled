.class public Lao/n$a;
.super Lho/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lao/n;
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
    .locals 8

    invoke-interface {p1}, Lho/h;->e()I

    move-result v0

    invoke-interface {p1}, Lho/h;->b()Lfo/i;

    move-result-object v1

    invoke-virtual {v1}, Lfo/i;->a()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {p1}, Lho/h;->d()I

    move-result v2

    const/4 v3, 0x4

    if-ge v2, v3, :cond_2

    invoke-interface {v1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    const/16 v3, 0x3c

    if-ne v2, v3, :cond_2

    const/4 v2, 0x1

    move v3, v2

    :goto_0
    const/4 v4, 0x7

    if-gt v3, v4, :cond_2

    if-ne v3, v4, :cond_0

    invoke-interface {p2}, Lho/g;->a()Lho/d;

    move-result-object v4

    invoke-interface {v4}, Lho/d;->f()Leo/a;

    move-result-object v4

    instance-of v4, v4, Leo/w;

    if-nez v4, :cond_1

    invoke-interface {p1}, Lho/h;->f()Lho/d;

    move-result-object v4

    invoke-interface {v4}, Lho/d;->e()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {}, Lao/n;->k()[[Ljava/util/regex/Pattern;

    move-result-object v4

    aget-object v4, v4, v3

    const/4 v5, 0x0

    aget-object v4, v4, v5

    invoke-static {}, Lao/n;->k()[[Ljava/util/regex/Pattern;

    move-result-object v6

    aget-object v6, v6, v3

    aget-object v6, v6, v2

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v7

    invoke-interface {v1, v0, v7}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/regex/Matcher;->find()Z

    move-result v4

    if-eqz v4, :cond_1

    new-instance p2, Lao/n;

    const/4 v0, 0x0

    invoke-direct {p2, v6, v0}, Lao/n;-><init>(Ljava/util/regex/Pattern;Lao/o;)V

    new-array v0, v2, [Lho/d;

    aput-object p2, v0, v5

    invoke-static {v0}, Lho/f;->d([Lho/d;)Lho/f;

    move-result-object p2

    invoke-interface {p1}, Lho/h;->getIndex()I

    move-result p1

    invoke-virtual {p2, p1}, Lho/f;->b(I)Lho/f;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    invoke-static {}, Lho/f;->c()Lho/f;

    move-result-object p1

    return-object p1
.end method
