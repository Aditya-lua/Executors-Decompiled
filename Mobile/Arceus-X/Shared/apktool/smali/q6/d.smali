.class public final Lq6/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lq6/c<",
        "Lk6/h0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lq6/d;",
        "Lq6/c;",
        "Lk6/h0;",
        "<init>",
        "()V",
        "data",
        "Lx6/p;",
        "options",
        "",
        "b",
        "(Lk6/h0;Lx6/p;)Ljava/lang/String;",
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
.method public bridge synthetic a(Ljava/lang/Object;Lx6/p;)Ljava/lang/String;
    .locals 0

    check-cast p1, Lk6/h0;

    invoke-virtual {p0, p1, p2}, Lq6/d;->b(Lk6/h0;Lx6/p;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public b(Lk6/h0;Lx6/p;)Ljava/lang/String;
    .locals 0
    .param p1    # Lk6/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lx6/p;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-virtual {p1}, Lk6/h0;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
