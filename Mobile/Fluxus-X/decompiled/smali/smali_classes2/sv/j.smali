.class public final Lsv/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmv/a0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsv/j$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001f\u0010\u000c\u001a\u00020\u00112\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J#\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0018\u001a\u00020\u00082\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ!\u0010\u001f\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0018\u001a\u00020\u00082\u0006\u0010\u001e\u001a\u00020\u001dH\u0002\u00a2\u0006\u0004\u0008\u001f\u0010 J\u001f\u0010#\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u00082\u0006\u0010\"\u001a\u00020!H\u0002\u00a2\u0006\u0004\u0008#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010%\u00a8\u0006&"
    }
    d2 = {
        "Lsv/j;",
        "Lmv/a0;",
        "Lmv/d0;",
        "client",
        "<init>",
        "(Lmv/d0;)V",
        "Lmv/a0$a;",
        "chain",
        "Lmv/h0;",
        "intercept",
        "(Lmv/a0$a;)Lmv/h0;",
        "Ljava/io/IOException;",
        "e",
        "Lrv/m;",
        "call",
        "Lmv/f0;",
        "userRequest",
        "",
        "d",
        "(Ljava/io/IOException;Lrv/m;Lmv/f0;)Z",
        "(Ljava/io/IOException;Lmv/f0;)Z",
        "requestSendStarted",
        "c",
        "(Ljava/io/IOException;Z)Z",
        "userResponse",
        "Lrv/h;",
        "exchange",
        "b",
        "(Lmv/h0;Lrv/h;)Lmv/f0;",
        "",
        "method",
        "a",
        "(Lmv/h0;Ljava/lang/String;)Lmv/f0;",
        "",
        "defaultDelay",
        "f",
        "(Lmv/h0;I)I",
        "Lmv/d0;",
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


# static fields
.field public static final b:Lsv/j$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lmv/d0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lsv/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lsv/j$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lsv/j;->b:Lsv/j$a;

    return-void
.end method

.method public constructor <init>(Lmv/d0;)V
    .locals 1
    .param p1    # Lmv/d0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "client"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsv/j;->a:Lmv/d0;

    return-void
.end method


# virtual methods
.method public final a(Lmv/h0;Ljava/lang/String;)Lmv/f0;
    .locals 8

    iget-object v0, p0, Lsv/j;->a:Lmv/d0;

    invoke-virtual {v0}, Lmv/d0;->s()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    const-string v0, "Location"

    const/4 v2, 0x2

    invoke-static {p1, v0, v1, v2, v1}, Lmv/h0;->n(Lmv/h0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    invoke-virtual {p1}, Lmv/h0;->z()Lmv/f0;

    move-result-object v2

    invoke-virtual {v2}, Lmv/f0;->m()Lmv/z;

    move-result-object v2

    invoke-virtual {v2, v0}, Lmv/z;->s(Ljava/lang/String;)Lmv/z;

    move-result-object v0

    if-nez v0, :cond_2

    return-object v1

    :cond_2
    invoke-virtual {v0}, Lmv/z;->t()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lmv/h0;->z()Lmv/f0;

    move-result-object v3

    invoke-virtual {v3}, Lmv/f0;->m()Lmv/z;

    move-result-object v3

    invoke-virtual {v3}, Lmv/z;->t()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    iget-object v2, p0, Lsv/j;->a:Lmv/d0;

    invoke-virtual {v2}, Lmv/d0;->t()Z

    move-result v2

    if-nez v2, :cond_3

    return-object v1

    :cond_3
    invoke-virtual {p1}, Lmv/h0;->z()Lmv/f0;

    move-result-object v2

    invoke-virtual {v2}, Lmv/f0;->j()Lmv/f0$a;

    move-result-object v2

    invoke-static {p2}, Lsv/f;->c(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-virtual {p1}, Lmv/h0;->f()I

    move-result v3

    sget-object v4, Lsv/f;->a:Lsv/f;

    invoke-virtual {v4, p2}, Lsv/f;->e(Ljava/lang/String;)Z

    move-result v5

    const/16 v6, 0x133

    const/16 v7, 0x134

    if-nez v5, :cond_5

    if-eq v3, v7, :cond_5

    if-ne v3, v6, :cond_4

    goto :goto_0

    :cond_4
    const/4 v5, 0x0

    goto :goto_1

    :cond_5
    :goto_0
    const/4 v5, 0x1

    :goto_1
    invoke-virtual {v4, p2}, Lsv/f;->d(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_6

    if-eq v3, v7, :cond_6

    if-eq v3, v6, :cond_6

    const-string p2, "GET"

    invoke-virtual {v2, p2, v1}, Lmv/f0$a;->o(Ljava/lang/String;Lmv/g0;)Lmv/f0$a;

    goto :goto_2

    :cond_6
    if-eqz v5, :cond_7

    invoke-virtual {p1}, Lmv/h0;->z()Lmv/f0;

    move-result-object v1

    invoke-virtual {v1}, Lmv/f0;->a()Lmv/g0;

    move-result-object v1

    :cond_7
    invoke-virtual {v2, p2, v1}, Lmv/f0$a;->o(Ljava/lang/String;Lmv/g0;)Lmv/f0$a;

    :goto_2
    if-nez v5, :cond_8

    const-string p2, "Transfer-Encoding"

    invoke-virtual {v2, p2}, Lmv/f0$a;->q(Ljava/lang/String;)Lmv/f0$a;

    const-string p2, "Content-Length"

    invoke-virtual {v2, p2}, Lmv/f0$a;->q(Ljava/lang/String;)Lmv/f0$a;

    const-string p2, "Content-Type"

    invoke-virtual {v2, p2}, Lmv/f0$a;->q(Ljava/lang/String;)Lmv/f0$a;

    :cond_8
    invoke-virtual {p1}, Lmv/h0;->z()Lmv/f0;

    move-result-object p1

    invoke-virtual {p1}, Lmv/f0;->m()Lmv/z;

    move-result-object p1

    invoke-static {p1, v0}, Lnv/q;->f(Lmv/z;Lmv/z;)Z

    move-result p1

    if-nez p1, :cond_9

    const-string p1, "Authorization"

    invoke-virtual {v2, p1}, Lmv/f0$a;->q(Ljava/lang/String;)Lmv/f0$a;

    :cond_9
    invoke-virtual {v2, v0}, Lmv/f0$a;->v(Lmv/z;)Lmv/f0$a;

    move-result-object p1

    invoke-virtual {p1}, Lmv/f0$a;->b()Lmv/f0;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lmv/h0;Lrv/h;)Lmv/f0;
    .locals 5

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lrv/h;->j()Lrv/n;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lrv/n;->u()Lmv/j0;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    invoke-virtual {p1}, Lmv/h0;->f()I

    move-result v2

    invoke-virtual {p1}, Lmv/h0;->z()Lmv/f0;

    move-result-object v3

    invoke-virtual {v3}, Lmv/f0;->i()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x133

    if-eq v2, v4, :cond_10

    const/16 v4, 0x134

    if-eq v2, v4, :cond_10

    const/16 v4, 0x191

    if-eq v2, v4, :cond_f

    const/16 v4, 0x1a5

    if-eq v2, v4, :cond_b

    const/16 p2, 0x1f7

    if-eq v2, p2, :cond_8

    const/16 p2, 0x197

    if-eq v2, p2, :cond_6

    const/16 p2, 0x198

    if-eq v2, p2, :cond_1

    packed-switch v2, :pswitch_data_0

    return-object v0

    :cond_1
    iget-object v1, p0, Lsv/j;->a:Lmv/d0;

    invoke-virtual {v1}, Lmv/d0;->H()Z

    move-result v1

    if-nez v1, :cond_2

    return-object v0

    :cond_2
    invoke-virtual {p1}, Lmv/h0;->z()Lmv/f0;

    move-result-object v1

    invoke-virtual {v1}, Lmv/f0;->a()Lmv/g0;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lmv/g0;->g()Z

    move-result v1

    if-eqz v1, :cond_3

    return-object v0

    :cond_3
    invoke-virtual {p1}, Lmv/h0;->u()Lmv/h0;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lmv/h0;->f()I

    move-result v1

    if-ne v1, p2, :cond_4

    return-object v0

    :cond_4
    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Lsv/j;->f(Lmv/h0;I)I

    move-result p2

    if-lez p2, :cond_5

    return-object v0

    :cond_5
    invoke-virtual {p1}, Lmv/h0;->z()Lmv/f0;

    move-result-object p1

    return-object p1

    :cond_6
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lmv/j0;->b()Ljava/net/Proxy;

    move-result-object p2

    invoke-virtual {p2}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object p2

    sget-object v0, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-ne p2, v0, :cond_7

    iget-object p2, p0, Lsv/j;->a:Lmv/d0;

    invoke-virtual {p2}, Lmv/d0;->E()Lmv/b;

    move-result-object p2

    invoke-interface {p2, v1, p1}, Lmv/b;->a(Lmv/j0;Lmv/h0;)Lmv/f0;

    move-result-object p1

    return-object p1

    :cond_7
    new-instance p1, Ljava/net/ProtocolException;

    const-string p2, "Received HTTP_PROXY_AUTH (407) code while not using proxy"

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    invoke-virtual {p1}, Lmv/h0;->u()Lmv/h0;

    move-result-object v1

    if-eqz v1, :cond_9

    invoke-virtual {v1}, Lmv/h0;->f()I

    move-result v1

    if-ne v1, p2, :cond_9

    return-object v0

    :cond_9
    const p2, 0x7fffffff

    invoke-virtual {p0, p1, p2}, Lsv/j;->f(Lmv/h0;I)I

    move-result p2

    if-nez p2, :cond_a

    invoke-virtual {p1}, Lmv/h0;->z()Lmv/f0;

    move-result-object p1

    return-object p1

    :cond_a
    return-object v0

    :cond_b
    invoke-virtual {p1}, Lmv/h0;->z()Lmv/f0;

    move-result-object v1

    invoke-virtual {v1}, Lmv/f0;->a()Lmv/g0;

    move-result-object v1

    if-eqz v1, :cond_c

    invoke-virtual {v1}, Lmv/g0;->g()Z

    move-result v1

    if-eqz v1, :cond_c

    return-object v0

    :cond_c
    if-eqz p2, :cond_e

    invoke-virtual {p2}, Lrv/h;->n()Z

    move-result v1

    if-nez v1, :cond_d

    goto :goto_1

    :cond_d
    invoke-virtual {p2}, Lrv/h;->j()Lrv/n;

    move-result-object p2

    invoke-virtual {p2}, Lrv/n;->t()V

    invoke-virtual {p1}, Lmv/h0;->z()Lmv/f0;

    move-result-object p1

    return-object p1

    :cond_e
    :goto_1
    return-object v0

    :cond_f
    iget-object p2, p0, Lsv/j;->a:Lmv/d0;

    invoke-virtual {p2}, Lmv/d0;->f()Lmv/b;

    move-result-object p2

    invoke-interface {p2, v1, p1}, Lmv/b;->a(Lmv/j0;Lmv/h0;)Lmv/f0;

    move-result-object p1

    return-object p1

    :cond_10
    :pswitch_0
    invoke-virtual {p0, p1, v3}, Lsv/j;->a(Lmv/h0;Ljava/lang/String;)Lmv/f0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x12c
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Ljava/io/IOException;Z)Z
    .locals 3

    instance-of v0, p1, Ljava/net/ProtocolException;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    instance-of v0, p1, Ljava/io/InterruptedIOException;

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    instance-of p1, p1, Ljava/net/SocketTimeoutException;

    if-eqz p1, :cond_1

    if-nez p2, :cond_1

    return v2

    :cond_1
    return v1

    :cond_2
    instance-of p2, p1, Ljavax/net/ssl/SSLHandshakeException;

    if-eqz p2, :cond_3

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    instance-of p2, p2, Ljava/security/cert/CertificateException;

    if-eqz p2, :cond_3

    return v1

    :cond_3
    instance-of p1, p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    if-eqz p1, :cond_4

    return v1

    :cond_4
    return v2
.end method

.method public final d(Ljava/io/IOException;Lrv/m;Lmv/f0;)Z
    .locals 4

    instance-of v0, p1, Luv/a;

    xor-int/lit8 v1, v0, 0x1

    iget-object v2, p0, Lsv/j;->a:Lmv/d0;

    invoke-virtual {v2}, Lmv/d0;->H()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    return v3

    :cond_0
    if-nez v0, :cond_1

    invoke-virtual {p0, p1, p3}, Lsv/j;->e(Ljava/io/IOException;Lmv/f0;)Z

    move-result p3

    if-eqz p3, :cond_1

    return v3

    :cond_1
    invoke-virtual {p0, p1, v1}, Lsv/j;->c(Ljava/io/IOException;Z)Z

    move-result p1

    if-nez p1, :cond_2

    return v3

    :cond_2
    invoke-virtual {p2}, Lrv/m;->F()Z

    move-result p1

    if-nez p1, :cond_3

    return v3

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method public final e(Ljava/io/IOException;Lmv/f0;)Z
    .locals 0

    invoke-virtual {p2}, Lmv/f0;->a()Lmv/g0;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lmv/g0;->g()Z

    move-result p2

    if-nez p2, :cond_1

    :cond_0
    instance-of p1, p1, Ljava/io/FileNotFoundException;

    if-eqz p1, :cond_2

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final f(Lmv/h0;I)I
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "Retry-After"

    invoke-static {p1, v2, v0, v1, v0}, Lmv/h0;->n(Lmv/h0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    return p2

    :cond_0
    new-instance p2, Lkotlin/text/Regex;

    const-string v0, "\\d+"

    invoke-direct {p2, v0}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Lkotlin/text/Regex;->f(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "valueOf(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    return p1

    :cond_1
    const p1, 0x7fffffff

    return p1
.end method

.method public intercept(Lmv/a0$a;)Lmv/h0;
    .locals 11
    .param p1    # Lmv/a0$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "chain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lsv/g;

    invoke-virtual {p1}, Lsv/g;->j()Lmv/f0;

    move-result-object v0

    invoke-virtual {p1}, Lsv/g;->e()Lrv/m;

    move-result-object v1

    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    move v8, v3

    move-object v7, v4

    :goto_0
    move v6, v5

    :goto_1
    invoke-virtual {v1, v0, v6, p1}, Lrv/m;->k(Lmv/f0;ZLsv/g;)V

    :try_start_0
    invoke-virtual {v1}, Lrv/m;->m()Z

    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v6, :cond_6

    :try_start_1
    invoke-virtual {p1, v0}, Lsv/g;->a(Lmv/f0;)Lmv/h0;

    move-result-object v6
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v6}, Lmv/h0;->s()Lmv/h0$a;

    move-result-object v6

    invoke-virtual {v6, v0}, Lmv/h0$a;->q(Lmv/f0;)Lmv/h0$a;

    move-result-object v0

    if-eqz v7, :cond_0

    invoke-static {v7}, Lnv/i;->a(Lmv/h0;)Lmv/h0;

    move-result-object v6

    goto :goto_2

    :catchall_0
    move-exception p1

    move v3, v5

    goto/16 :goto_3

    :cond_0
    move-object v6, v4

    :goto_2
    invoke-virtual {v0, v6}, Lmv/h0$a;->n(Lmv/h0;)Lmv/h0$a;

    move-result-object v0

    invoke-virtual {v0}, Lmv/h0$a;->c()Lmv/h0;

    move-result-object v7

    invoke-virtual {v1}, Lrv/m;->s()Lrv/h;

    move-result-object v0

    invoke-virtual {p0, v7, v0}, Lsv/j;->b(Lmv/h0;Lrv/h;)Lmv/f0;

    move-result-object v6

    if-nez v6, :cond_2

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lrv/h;->o()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {v1}, Lrv/m;->G()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_1
    :try_start_3
    invoke-virtual {v1}, Lrv/m;->q()Lmv/s;

    move-result-object p1

    invoke-virtual {p1, v1, v7, v4}, Lmv/s;->followUpDecision(Lmv/e;Lmv/h0;Lmv/f0;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    invoke-virtual {v1, v3}, Lrv/m;->l(Z)V

    return-object v7

    :catchall_1
    move-exception p1

    goto/16 :goto_3

    :cond_2
    :try_start_4
    invoke-virtual {v6}, Lmv/f0;->a()Lmv/g0;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lmv/g0;->g()Z

    move-result v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz v0, :cond_3

    :try_start_5
    invoke-virtual {v1}, Lrv/m;->q()Lmv/s;

    move-result-object p1

    invoke-virtual {p1, v1, v7, v4}, Lmv/s;->followUpDecision(Lmv/e;Lmv/h0;Lmv/f0;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    invoke-virtual {v1, v3}, Lrv/m;->l(Z)V

    return-object v7

    :cond_3
    :try_start_6
    invoke-virtual {v7}, Lmv/h0;->b()Lmv/i0;

    move-result-object v0

    invoke-static {v0}, Lnv/n;->f(Ljava/io/Closeable;)V

    add-int/lit8 v8, v8, 0x1

    const/16 v0, 0x14

    if-gt v8, v0, :cond_4

    invoke-virtual {v1}, Lrv/m;->q()Lmv/s;

    move-result-object v0

    invoke-virtual {v0, v1, v7, v6}, Lmv/s;->followUpDecision(Lmv/e;Lmv/h0;Lmv/f0;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    invoke-virtual {v1, v5}, Lrv/m;->l(Z)V

    move-object v0, v6

    goto :goto_0

    :cond_4
    :try_start_7
    invoke-virtual {v1}, Lrv/m;->q()Lmv/s;

    move-result-object p1

    invoke-virtual {p1, v1, v7, v4}, Lmv/s;->followUpDecision(Lmv/e;Lmv/h0;Lmv/f0;)V

    new-instance p1, Ljava/net/ProtocolException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Too many follow-up requests: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_0
    move-exception v6

    invoke-virtual {p0, v6, v1, v0}, Lsv/j;->d(Ljava/io/IOException;Lrv/m;Lmv/f0;)Z

    move-result v9

    invoke-virtual {v1}, Lrv/m;->q()Lmv/s;

    move-result-object v10

    invoke-virtual {v10, v1, v6, v9}, Lmv/s;->retryDecision(Lmv/e;Ljava/io/IOException;Z)V

    if-eqz v9, :cond_5

    check-cast v2, Ljava/util/Collection;

    invoke-static {v2, v6}, Lkotlin/collections/CollectionsKt;->x0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    invoke-virtual {v1, v5}, Lrv/m;->l(Z)V

    move v6, v3

    goto/16 :goto_1

    :cond_5
    :try_start_8
    invoke-static {v6, v2}, Lnv/n;->G(Ljava/lang/Exception;Ljava/util/List;)Ljava/lang/Throwable;

    move-result-object p1

    throw p1

    :cond_6
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Canceled"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :goto_3
    invoke-virtual {v1, v3}, Lrv/m;->l(Z)V

    throw p1
.end method
