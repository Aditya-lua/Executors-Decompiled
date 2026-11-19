.class public final Lov/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmv/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lov/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J#\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ#\u0010\u0012\u001a\u00020\u0011*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lov/a;",
        "Lmv/b;",
        "Lmv/r;",
        "defaultDns",
        "<init>",
        "(Lmv/r;)V",
        "Lmv/j0;",
        "route",
        "Lmv/h0;",
        "response",
        "Lmv/f0;",
        "a",
        "(Lmv/j0;Lmv/h0;)Lmv/f0;",
        "Ljava/net/Proxy;",
        "Lmv/z;",
        "url",
        "dns",
        "Ljava/net/InetAddress;",
        "b",
        "(Ljava/net/Proxy;Lmv/z;Lmv/r;)Ljava/net/InetAddress;",
        "d",
        "Lmv/r;",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final d:Lmv/r;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lmv/r;)V
    .locals 1
    .param p1    # Lmv/r;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "defaultDns"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lov/a;->d:Lmv/r;

    return-void
.end method

.method public synthetic constructor <init>(Lmv/r;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    sget-object p1, Lmv/r;->b:Lmv/r;

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lov/a;-><init>(Lmv/r;)V

    return-void
.end method


# virtual methods
.method public a(Lmv/j0;Lmv/h0;)Lmv/f0;
    .locals 18
    .param p1    # Lmv/j0;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lmv/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "response"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lmv/h0;->e()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v2}, Lmv/h0;->z()Lmv/f0;

    move-result-object v3

    invoke-virtual {v3}, Lmv/f0;->m()Lmv/z;

    move-result-object v4

    invoke-virtual {v2}, Lmv/h0;->f()I

    move-result v2

    const/16 v5, 0x197

    const/4 v6, 0x1

    if-ne v2, v5, :cond_0

    move v2, v6

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual/range {p1 .. p1}, Lmv/j0;->b()Ljava/net/Proxy;

    move-result-object v5

    if-nez v5, :cond_2

    :cond_1
    sget-object v5, Ljava/net/Proxy;->NO_PROXY:Ljava/net/Proxy;

    :cond_2
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lmv/i;

    const-string v8, "Basic"

    invoke-virtual {v7}, Lmv/i;->c()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9, v6}, Lkotlin/text/x;->E(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v8

    if-nez v8, :cond_4

    goto :goto_1

    :cond_4
    if-eqz p1, :cond_5

    invoke-virtual/range {p1 .. p1}, Lmv/j0;->a()Lmv/a;

    move-result-object v8

    if-eqz v8, :cond_5

    invoke-virtual {v8}, Lmv/a;->c()Lmv/r;

    move-result-object v8

    if-nez v8, :cond_6

    :cond_5
    iget-object v8, v0, Lov/a;->d:Lmv/r;

    :cond_6
    if-eqz v2, :cond_7

    invoke-virtual {v5}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    move-result-object v9

    const-string v10, "null cannot be cast to non-null type java.net.InetSocketAddress"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v9, Ljava/net/InetSocketAddress;

    invoke-virtual {v9}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, v5, v4, v8}, Lov/a;->b(Ljava/net/Proxy;Lmv/z;Lmv/r;)Ljava/net/InetAddress;

    move-result-object v11

    invoke-virtual {v9}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v12

    invoke-virtual {v4}, Lmv/z;->t()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v7}, Lmv/i;->b()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v7}, Lmv/i;->c()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v4}, Lmv/z;->v()Ljava/net/URL;

    move-result-object v16

    sget-object v17, Ljava/net/Authenticator$RequestorType;->PROXY:Ljava/net/Authenticator$RequestorType;

    invoke-static/range {v10 .. v17}, Ljava/net/Authenticator;->requestPasswordAuthentication(Ljava/lang/String;Ljava/net/InetAddress;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URL;Ljava/net/Authenticator$RequestorType;)Ljava/net/PasswordAuthentication;

    move-result-object v8

    goto :goto_2

    :cond_7
    invoke-virtual {v4}, Lmv/z;->h()Ljava/lang/String;

    move-result-object v9

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, v5, v4, v8}, Lov/a;->b(Ljava/net/Proxy;Lmv/z;Lmv/r;)Ljava/net/InetAddress;

    move-result-object v10

    invoke-virtual {v4}, Lmv/z;->m()I

    move-result v11

    invoke-virtual {v4}, Lmv/z;->t()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v7}, Lmv/i;->b()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v7}, Lmv/i;->c()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v4}, Lmv/z;->v()Ljava/net/URL;

    move-result-object v15

    sget-object v16, Ljava/net/Authenticator$RequestorType;->SERVER:Ljava/net/Authenticator$RequestorType;

    invoke-static/range {v9 .. v16}, Ljava/net/Authenticator;->requestPasswordAuthentication(Ljava/lang/String;Ljava/net/InetAddress;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URL;Ljava/net/Authenticator$RequestorType;)Ljava/net/PasswordAuthentication;

    move-result-object v8

    :goto_2
    if-eqz v8, :cond_3

    if-eqz v2, :cond_8

    const-string v1, "Proxy-Authorization"

    goto :goto_3

    :cond_8
    const-string v1, "Authorization"

    :goto_3
    invoke-virtual {v8}, Ljava/net/PasswordAuthentication;->getUserName()Ljava/lang/String;

    move-result-object v2

    const-string v4, "getUserName(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/net/PasswordAuthentication;->getPassword()[C

    move-result-object v4

    const-string v5, "getPassword(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Ljava/lang/String;

    invoke-direct {v5, v4}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v7}, Lmv/i;->a()Ljava/nio/charset/Charset;

    move-result-object v4

    invoke-static {v2, v5, v4}, Lmv/p;->a(Ljava/lang/String;Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3}, Lmv/f0;->j()Lmv/f0$a;

    move-result-object v3

    invoke-virtual {v3, v1, v2}, Lmv/f0$a;->m(Ljava/lang/String;Ljava/lang/String;)Lmv/f0$a;

    move-result-object v1

    invoke-virtual {v1}, Lmv/f0$a;->b()Lmv/f0;

    move-result-object v1

    return-object v1

    :cond_9
    const/4 v1, 0x0

    return-object v1
.end method

.method public final b(Ljava/net/Proxy;Lmv/z;Lmv/r;)Ljava/net/InetAddress;
    .locals 2

    invoke-virtual {p1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    sget-object v1, Lov/a$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    :goto_0
    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    invoke-virtual {p2}, Lmv/z;->h()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, p1}, Lmv/r;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/net/InetAddress;

    return-object p1

    :cond_1
    invoke-virtual {p1}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type java.net.InetSocketAddress"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/net/InetSocketAddress;

    invoke-virtual {p1}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object p1

    const-string p2, "getAddress(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
