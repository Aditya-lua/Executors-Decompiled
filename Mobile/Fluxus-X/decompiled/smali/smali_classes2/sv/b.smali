.class public final Lsv/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmv/a0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lsv/b;",
        "Lmv/a0;",
        "<init>",
        "()V",
        "Lmv/a0$a;",
        "chain",
        "Lmv/h0;",
        "intercept",
        "(Lmv/a0$a;)Lmv/h0;",
        "",
        "code",
        "",
        "a",
        "(I)Z",
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
.field public static final a:Lsv/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lsv/b;

    invoke-direct {v0}, Lsv/b;-><init>()V

    sput-object v0, Lsv/b;->a:Lsv/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)Z
    .locals 2

    const/16 v0, 0x64

    const/4 v1, 0x1

    if-ne p1, v0, :cond_0

    return v1

    :cond_0
    const/16 v0, 0x66

    if-gt v0, p1, :cond_1

    const/16 v0, 0xc8

    if-ge p1, v0, :cond_1

    return v1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public intercept(Lmv/a0$a;)Lmv/h0;
    .locals 18
    .param p1    # Lmv/a0$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "close"

    const-string v2, "chain"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lsv/g;

    invoke-virtual {v0}, Lsv/g;->g()Lrv/h;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lsv/g;->j()Lmv/f0;

    move-result-object v3

    invoke-virtual {v3}, Lmv/f0;->a()Lmv/g0;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v3}, Lmv/f0;->i()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lsv/f;->c(Ljava/lang/String;)Z

    move-result v6

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eqz v6, :cond_0

    if-eqz v0, :cond_0

    move v6, v8

    goto :goto_0

    :cond_0
    move v6, v7

    :goto_0
    const-string v9, "Connection"

    invoke-virtual {v3, v9}, Lmv/f0;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v11, "upgrade"

    invoke-static {v11, v10, v8}, Lkotlin/text/x;->E(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v10

    const/4 v12, 0x0

    :try_start_0
    invoke-virtual {v2, v3}, Lrv/h;->x(Lmv/f0;)V

    if-eqz v6, :cond_4

    const-string v6, "100-continue"

    const-string v13, "Expect"

    invoke-virtual {v3, v13}, Lmv/f0;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v6, v13, v8}, Lkotlin/text/x;->E(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-virtual {v2}, Lrv/h;->h()V

    invoke-virtual {v2, v8}, Lrv/h;->s(Z)Lmv/h0$a;

    move-result-object v6
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-virtual {v2}, Lrv/h;->u()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    move v13, v7

    goto :goto_1

    :catch_0
    move-exception v0

    move v13, v8

    goto :goto_3

    :catch_1
    move-exception v0

    move v13, v8

    move-object v6, v12

    goto :goto_3

    :cond_1
    move v13, v8

    move-object v6, v12

    :goto_1
    if-nez v6, :cond_3

    :try_start_2
    invoke-virtual {v0}, Lmv/g0;->f()Z

    move-result v14

    if-eqz v14, :cond_2

    invoke-virtual {v2}, Lrv/h;->h()V

    invoke-virtual {v2, v3, v8}, Lrv/h;->e(Lmv/f0;Z)Lew/j0;

    move-result-object v14

    invoke-static {v14}, Lew/v;->b(Lew/j0;)Lew/f;

    move-result-object v14

    invoke-virtual {v0, v14}, Lmv/g0;->h(Lew/f;)V

    goto :goto_2

    :catch_2
    move-exception v0

    goto :goto_3

    :cond_2
    invoke-virtual {v2, v3, v7}, Lrv/h;->e(Lmv/f0;Z)Lew/j0;

    move-result-object v14

    invoke-static {v14}, Lew/v;->b(Lew/j0;)Lew/f;

    move-result-object v14

    invoke-virtual {v0, v14}, Lmv/g0;->h(Lew/f;)V

    invoke-interface {v14}, Lew/j0;->close()V

    goto :goto_2

    :cond_3
    invoke-virtual {v2}, Lrv/h;->q()V

    invoke-virtual {v2}, Lrv/h;->j()Lrv/n;

    move-result-object v14

    invoke-virtual {v14}, Lrv/n;->r()Z

    move-result v14

    if-nez v14, :cond_5

    invoke-virtual {v2}, Lrv/h;->p()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :cond_4
    :try_start_3
    invoke-virtual {v2}, Lrv/h;->q()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    move v13, v8

    move-object v6, v12

    :cond_5
    :goto_2
    if-eqz v0, :cond_6

    :try_start_4
    invoke-virtual {v0}, Lmv/g0;->f()Z

    move-result v0

    if-nez v0, :cond_7

    :cond_6
    invoke-virtual {v2}, Lrv/h;->g()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    :cond_7
    move-object v0, v6

    move-object v6, v12

    goto :goto_4

    :goto_3
    instance-of v14, v0, Luv/a;

    if-nez v14, :cond_17

    invoke-virtual {v2}, Lrv/h;->m()Z

    move-result v14

    if-eqz v14, :cond_16

    move-object/from16 v17, v6

    move-object v6, v0

    move-object/from16 v0, v17

    :goto_4
    if-nez v0, :cond_8

    :try_start_5
    invoke-virtual {v2, v7}, Lrv/h;->s(Z)Lmv/h0$a;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    if-eqz v13, :cond_8

    invoke-virtual {v2}, Lrv/h;->u()V

    move v13, v7

    goto :goto_5

    :catch_3
    move-exception v0

    move-object/from16 v15, p0

    goto/16 :goto_c

    :cond_8
    :goto_5
    invoke-virtual {v0, v3}, Lmv/h0$a;->q(Lmv/f0;)Lmv/h0$a;

    move-result-object v0

    invoke-virtual {v2}, Lrv/h;->j()Lrv/n;

    move-result-object v14

    invoke-virtual {v14}, Lrv/n;->n()Lmv/x;

    move-result-object v14

    invoke-virtual {v0, v14}, Lmv/h0$a;->h(Lmv/x;)Lmv/h0$a;

    move-result-object v0

    invoke-virtual {v0, v4, v5}, Lmv/h0$a;->r(J)Lmv/h0$a;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v14

    invoke-virtual {v0, v14, v15}, Lmv/h0$a;->p(J)Lmv/h0$a;

    move-result-object v0

    invoke-virtual {v0}, Lmv/h0$a;->c()Lmv/h0;

    move-result-object v0

    invoke-virtual {v0}, Lmv/h0;->f()I

    move-result v14
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    move-object/from16 v15, p0

    :goto_6
    :try_start_6
    invoke-virtual {v15, v14}, Lsv/b;->a(I)Z

    move-result v16

    if-eqz v16, :cond_a

    invoke-virtual {v2, v7}, Lrv/h;->s(Z)Lmv/h0$a;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    if-eqz v13, :cond_9

    invoke-virtual {v2}, Lrv/h;->u()V

    goto :goto_7

    :catch_4
    move-exception v0

    goto/16 :goto_c

    :cond_9
    :goto_7
    invoke-virtual {v0, v3}, Lmv/h0$a;->q(Lmv/f0;)Lmv/h0$a;

    move-result-object v0

    invoke-virtual {v2}, Lrv/h;->j()Lrv/n;

    move-result-object v14

    invoke-virtual {v14}, Lrv/n;->n()Lmv/x;

    move-result-object v14

    invoke-virtual {v0, v14}, Lmv/h0$a;->h(Lmv/x;)Lmv/h0$a;

    move-result-object v0

    invoke-virtual {v0, v4, v5}, Lmv/h0$a;->r(J)Lmv/h0$a;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    invoke-virtual {v0, v7, v8}, Lmv/h0$a;->p(J)Lmv/h0$a;

    move-result-object v0

    invoke-virtual {v0}, Lmv/h0$a;->c()Lmv/h0;

    move-result-object v0

    invoke-virtual {v0}, Lmv/h0;->f()I

    move-result v14

    const/4 v7, 0x0

    const/4 v8, 0x1

    goto :goto_6

    :cond_a
    invoke-virtual {v2, v0}, Lrv/h;->t(Lmv/h0;)V

    const/16 v3, 0x65

    if-ne v14, v3, :cond_b

    const/4 v3, 0x1

    goto :goto_8

    :cond_b
    const/4 v3, 0x0

    :goto_8
    if-eqz v3, :cond_d

    invoke-virtual {v2}, Lrv/h;->j()Lrv/n;

    move-result-object v4

    invoke-virtual {v4}, Lrv/n;->r()Z

    move-result v4

    if-nez v4, :cond_c

    goto :goto_9

    :cond_c
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Unexpected 101 code on HTTP/2 connection"

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    :goto_9
    const/4 v4, 0x2

    if-eqz v3, :cond_e

    invoke-static {v0, v9, v12, v4, v12}, Lmv/h0;->n(Lmv/h0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x1

    invoke-static {v11, v3, v5}, Lkotlin/text/x;->E(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_e

    const/4 v7, 0x1

    goto :goto_a

    :cond_e
    const/4 v7, 0x0

    :goto_a
    if-eqz v10, :cond_f

    if-eqz v7, :cond_f

    invoke-virtual {v0}, Lmv/h0;->s()Lmv/h0$a;

    move-result-object v3

    new-instance v5, Lnv/h;

    invoke-virtual {v0}, Lmv/h0;->b()Lmv/i0;

    move-result-object v7

    invoke-virtual {v7}, Lmv/i0;->f()Lmv/b0;

    move-result-object v7

    invoke-virtual {v0}, Lmv/h0;->b()Lmv/i0;

    move-result-object v0

    invoke-virtual {v0}, Lmv/i0;->e()J

    move-result-wide v10

    invoke-direct {v5, v7, v10, v11}, Lnv/h;-><init>(Lmv/b0;J)V

    invoke-virtual {v3, v5}, Lmv/h0$a;->b(Lmv/i0;)Lmv/h0$a;

    move-result-object v0

    invoke-virtual {v2}, Lrv/h;->w()Lew/k0;

    move-result-object v3

    invoke-virtual {v0, v3}, Lmv/h0$a;->s(Lew/k0;)Lmv/h0$a;

    move-result-object v0

    invoke-virtual {v0}, Lmv/h0$a;->c()Lmv/h0;

    move-result-object v0

    goto :goto_b

    :cond_f
    invoke-virtual {v2, v0}, Lrv/h;->r(Lmv/h0;)Lmv/i0;

    move-result-object v3

    invoke-virtual {v0}, Lmv/h0;->s()Lmv/h0$a;

    move-result-object v0

    invoke-virtual {v0, v3}, Lmv/h0$a;->b(Lmv/i0;)Lmv/h0$a;

    move-result-object v0

    new-instance v5, Lsv/b$a;

    invoke-direct {v5, v2, v3}, Lsv/b$a;-><init>(Lrv/h;Lmv/i0;)V

    invoke-virtual {v0, v5}, Lmv/h0$a;->t(Lmv/l0;)Lmv/h0$a;

    move-result-object v0

    invoke-virtual {v0}, Lmv/h0$a;->c()Lmv/h0;

    move-result-object v0

    :goto_b
    invoke-virtual {v0}, Lmv/h0;->z()Lmv/f0;

    move-result-object v3

    invoke-virtual {v3, v9}, Lmv/f0;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x1

    invoke-static {v1, v3, v5}, Lkotlin/text/x;->E(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3

    if-nez v3, :cond_10

    invoke-static {v0, v9, v12, v4, v12}, Lmv/h0;->n(Lmv/h0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3, v5}, Lkotlin/text/x;->E(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_11

    :cond_10
    invoke-virtual {v2}, Lrv/h;->p()V

    :cond_11
    const/16 v1, 0xcc

    if-eq v14, v1, :cond_12

    const/16 v1, 0xcd

    if-ne v14, v1, :cond_13

    :cond_12
    invoke-virtual {v0}, Lmv/h0;->b()Lmv/i0;

    move-result-object v1

    invoke-virtual {v1}, Lmv/i0;->e()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-gtz v1, :cond_14

    :cond_13
    return-object v0

    :cond_14
    new-instance v1, Ljava/net/ProtocolException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HTTP "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " had non-zero Content-Length: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lmv/h0;->b()Lmv/i0;

    move-result-object v0

    invoke-virtual {v0}, Lmv/i0;->e()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4

    :goto_c
    if-eqz v6, :cond_15

    invoke-static {v6, v0}, Lzt/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    throw v6

    :cond_15
    throw v0

    :cond_16
    move-object/from16 v15, p0

    throw v0

    :cond_17
    move-object/from16 v15, p0

    throw v0
.end method
