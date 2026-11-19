.class public Lao/c$a;
.super Lho/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lao/c;
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
    .locals 3

    invoke-interface {p1}, Lho/h;->e()I

    move-result p2

    invoke-static {p1, p2}, Lao/c;->k(Lho/h;I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Lho/h;->c()I

    move-result v0

    invoke-interface {p1}, Lho/h;->d()I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 v1, v0, 0x1

    invoke-interface {p1}, Lho/h;->b()Lfo/i;

    move-result-object p1

    invoke-virtual {p1}, Lfo/i;->a()Ljava/lang/CharSequence;

    move-result-object p1

    const/4 v2, 0x1

    add-int/2addr p2, v2

    invoke-static {p1, p2}, Ljo/d;->g(Ljava/lang/CharSequence;I)Z

    move-result p1

    if-eqz p1, :cond_0

    add-int/lit8 v1, v0, 0x2

    :cond_0
    new-instance p1, Lao/c;

    invoke-direct {p1}, Lao/c;-><init>()V

    new-array p2, v2, [Lho/d;

    const/4 v0, 0x0

    aput-object p1, p2, v0

    invoke-static {p2}, Lho/f;->d([Lho/d;)Lho/f;

    move-result-object p1

    invoke-virtual {p1, v1}, Lho/f;->a(I)Lho/f;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {}, Lho/f;->c()Lho/f;

    move-result-object p1

    return-object p1
.end method
