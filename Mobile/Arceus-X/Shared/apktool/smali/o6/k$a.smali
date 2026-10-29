.class public final Lo6/k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo6/j$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo6/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lo6/j$a<",
        "Lk6/h0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lo6/k$a;",
        "Lo6/j$a;",
        "Lk6/h0;",
        "<init>",
        "()V",
        "data",
        "Lx6/p;",
        "options",
        "Lk6/s;",
        "imageLoader",
        "Lo6/j;",
        "b",
        "(Lk6/h0;Lx6/p;Lk6/s;)Lo6/j;",
        "coil-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lx6/p;Lk6/s;)Lo6/j;
    .locals 0

    check-cast p1, Lk6/h0;

    invoke-virtual {p0, p1, p2, p3}, Lo6/k$a;->b(Lk6/h0;Lx6/p;Lk6/s;)Lo6/j;

    move-result-object p1

    return-object p1
.end method

.method public b(Lk6/h0;Lx6/p;Lk6/s;)Lo6/j;
    .locals 0
    .param p1    # Lk6/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lx6/p;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lk6/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {p1}, Le7/h0;->n(Lk6/h0;)Z

    move-result p3

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance p3, Lo6/k;

    invoke-direct {p3, p1, p2}, Lo6/k;-><init>(Lk6/h0;Lx6/p;)V

    return-object p3
.end method
