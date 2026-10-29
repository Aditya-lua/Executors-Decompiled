.class public Lnn/l$a;
.super Ltn/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnn/l;
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
    .locals 2

    invoke-interface {p1}, Ltn/h;->d()I

    move-result p2

    sget v0, Lpn/f;->a:I

    if-lt p2, v0, :cond_0

    invoke-static {}, Ltn/f;->c()Ltn/f;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {p1}, Ltn/h;->e()I

    move-result v0

    invoke-interface {p1}, Ltn/h;->b()Lrn/i;

    move-result-object p1

    invoke-virtual {p1}, Lrn/i;->a()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-static {p1, v0, p2}, Lnn/l;->l(Ljava/lang/CharSequence;II)Lnn/l;

    move-result-object p1

    if-eqz p1, :cond_1

    const/4 p2, 0x1

    new-array p2, p2, [Ltn/d;

    const/4 v1, 0x0

    aput-object p1, p2, v1

    invoke-static {p2}, Ltn/f;->d([Ltn/d;)Ltn/f;

    move-result-object p2

    invoke-static {p1}, Lnn/l;->k(Lnn/l;)Lqn/h;

    move-result-object p1

    invoke-virtual {p1}, Lqn/h;->t()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    add-int/2addr v0, p1

    invoke-virtual {p2, v0}, Ltn/f;->b(I)Ltn/f;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {}, Ltn/f;->c()Ltn/f;

    move-result-object p1

    return-object p1
.end method
