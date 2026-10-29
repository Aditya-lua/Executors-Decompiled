.class public Lnn/p$a;
.super Ltn/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnn/p;
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

    invoke-interface {p1}, Ltn/h;->a()Z

    move-result p2

    if-nez p2, :cond_0

    invoke-interface {p1}, Ltn/h;->f()Ltn/d;

    move-result-object p2

    invoke-interface {p2}, Ltn/d;->d()Lqn/a;

    move-result-object p2

    instance-of p2, p2, Lqn/w;

    if-nez p2, :cond_0

    new-instance p2, Lnn/p;

    invoke-direct {p2}, Lnn/p;-><init>()V

    const/4 v0, 0x1

    new-array v0, v0, [Ltn/d;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    invoke-static {v0}, Ltn/f;->d([Ltn/d;)Ltn/f;

    move-result-object p2

    invoke-interface {p1}, Ltn/h;->c()I

    move-result p1

    sget v0, Lpn/f;->a:I

    add-int/2addr p1, v0

    invoke-virtual {p2, p1}, Ltn/f;->a(I)Ltn/f;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Ltn/f;->c()Ltn/f;

    move-result-object p1

    return-object p1
.end method
