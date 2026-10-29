.class public final Lt6/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\"\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0002\u0010\u0003\"\u001a\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0003\"\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0003\"\u0015\u0010\r\u001a\u00020\u0001*\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\u000c\"\u0015\u0010\u000f\u001a\u00020\u0005*\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u000e\"\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u0008*\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0002\u0010\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "Lk6/l$c;",
        "",
        "a",
        "Lk6/l$c;",
        "httpMethodKey",
        "Lt6/n;",
        "b",
        "httpHeadersKey",
        "Lt6/p;",
        "c",
        "httpBodyKey",
        "Lx6/p;",
        "(Lx6/p;)Ljava/lang/String;",
        "httpMethod",
        "(Lx6/p;)Lt6/n;",
        "httpHeaders",
        "(Lx6/p;)Lt6/p;",
        "httpBody",
        "coil-network-core_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lk6/l$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk6/l$c<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lk6/l$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk6/l$c<",
            "Lt6/n;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:Lk6/l$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk6/l$c<",
            "Lt6/p;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lk6/l$c;

    const-string v1, "GET"

    invoke-direct {v0, v1}, Lk6/l$c;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lt6/h;->a:Lk6/l$c;

    new-instance v0, Lk6/l$c;

    sget-object v1, Lt6/n;->c:Lt6/n;

    invoke-direct {v0, v1}, Lk6/l$c;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lt6/h;->b:Lk6/l$c;

    new-instance v0, Lk6/l$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lk6/l$c;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lt6/h;->c:Lk6/l$c;

    return-void
.end method

.method public static final a(Lx6/p;)Lt6/p;
    .locals 1
    .param p0    # Lx6/p;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    sget-object v0, Lt6/h;->c:Lk6/l$c;

    invoke-static {p0, v0}, Lk6/m;->b(Lx6/p;Lk6/l$c;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lt6/p;

    return-object p0
.end method

.method public static final b(Lx6/p;)Lt6/n;
    .locals 1
    .param p0    # Lx6/p;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lt6/h;->b:Lk6/l$c;

    invoke-static {p0, v0}, Lk6/m;->b(Lx6/p;Lk6/l$c;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lt6/n;

    return-object p0
.end method

.method public static final c(Lx6/p;)Ljava/lang/String;
    .locals 1
    .param p0    # Lx6/p;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lt6/h;->a:Lk6/l$c;

    invoke-static {p0, v0}, Lk6/m;->b(Lx6/p;Lk6/l$c;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method
