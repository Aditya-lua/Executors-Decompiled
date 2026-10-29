.class public Lnn/c$a;
.super Ltn/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnn/c;
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
    .locals 3

    invoke-interface {p1}, Ltn/h;->e()I

    move-result p2

    invoke-static {p1, p2}, Lnn/c;->k(Ltn/h;I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ltn/h;->c()I

    move-result v0

    invoke-interface {p1}, Ltn/h;->d()I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 v1, v0, 0x1

    invoke-interface {p1}, Ltn/h;->b()Lrn/i;

    move-result-object p1

    invoke-virtual {p1}, Lrn/i;->a()Ljava/lang/CharSequence;

    move-result-object p1

    const/4 v2, 0x1

    add-int/2addr p2, v2

    invoke-static {p1, p2}, Lvn/d;->g(Ljava/lang/CharSequence;I)Z

    move-result p1

    if-eqz p1, :cond_0

    add-int/lit8 v1, v0, 0x2

    :cond_0
    new-instance p1, Lnn/c;

    invoke-direct {p1}, Lnn/c;-><init>()V

    new-array p2, v2, [Ltn/d;

    const/4 v0, 0x0

    aput-object p1, p2, v0

    invoke-static {p2}, Ltn/f;->d([Ltn/d;)Ltn/f;

    move-result-object p1

    invoke-virtual {p1, v1}, Ltn/f;->a(I)Ltn/f;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {}, Ltn/f;->c()Ltn/f;

    move-result-object p1

    return-object p1
.end method
