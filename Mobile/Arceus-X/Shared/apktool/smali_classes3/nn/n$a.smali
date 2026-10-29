.class public Lnn/n$a;
.super Ltn/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnn/n;
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
    .locals 8

    invoke-interface {p1}, Ltn/h;->e()I

    move-result v0

    invoke-interface {p1}, Ltn/h;->b()Lrn/i;

    move-result-object v1

    invoke-virtual {v1}, Lrn/i;->a()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {p1}, Ltn/h;->d()I

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

    invoke-interface {p2}, Ltn/g;->a()Ltn/d;

    move-result-object v4

    invoke-interface {v4}, Ltn/d;->d()Lqn/a;

    move-result-object v4

    instance-of v4, v4, Lqn/w;

    if-nez v4, :cond_1

    invoke-interface {p1}, Ltn/h;->f()Ltn/d;

    move-result-object v4

    invoke-interface {v4}, Ltn/d;->c()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {}, Lnn/n;->k()[[Ljava/util/regex/Pattern;

    move-result-object v4

    aget-object v4, v4, v3

    const/4 v5, 0x0

    aget-object v4, v4, v5

    invoke-static {}, Lnn/n;->k()[[Ljava/util/regex/Pattern;

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

    new-instance p2, Lnn/n;

    const/4 v0, 0x0

    invoke-direct {p2, v6, v0}, Lnn/n;-><init>(Ljava/util/regex/Pattern;Lnn/o;)V

    new-array v0, v2, [Ltn/d;

    aput-object p2, v0, v5

    invoke-static {v0}, Ltn/f;->d([Ltn/d;)Ltn/f;

    move-result-object p2

    invoke-interface {p1}, Ltn/h;->getIndex()I

    move-result p1

    invoke-virtual {p2, p1}, Ltn/f;->b(I)Ltn/f;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    invoke-static {}, Ltn/f;->c()Ltn/f;

    move-result-object p1

    return-object p1
.end method
