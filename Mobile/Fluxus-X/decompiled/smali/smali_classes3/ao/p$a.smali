.class public Lao/p$a;
.super Lho/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lao/p;
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

    invoke-interface {p1}, Lho/h;->a()Z

    move-result p2

    if-nez p2, :cond_0

    invoke-interface {p1}, Lho/h;->f()Lho/d;

    move-result-object p2

    invoke-interface {p2}, Lho/d;->f()Leo/a;

    move-result-object p2

    instance-of p2, p2, Leo/w;

    if-nez p2, :cond_0

    new-instance p2, Lao/p;

    invoke-direct {p2}, Lao/p;-><init>()V

    const/4 v0, 0x1

    new-array v0, v0, [Lho/d;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    invoke-static {v0}, Lho/f;->d([Lho/d;)Lho/f;

    move-result-object p2

    invoke-interface {p1}, Lho/h;->c()I

    move-result p1

    sget v0, Lco/f;->a:I

    add-int/2addr p1, v0

    invoke-virtual {p2, p1}, Lho/f;->a(I)Lho/f;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Lho/f;->c()Lho/f;

    move-result-object p1

    return-object p1
.end method
