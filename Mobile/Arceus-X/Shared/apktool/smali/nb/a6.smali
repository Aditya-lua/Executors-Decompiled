.class public final Lnb/a6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:Ljava/net/URL;

.field public final b:[B

.field public final c:Lnb/y5;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/util/Map;

.field public final synthetic f:Lnb/b6;


# direct methods
.method public constructor <init>(Lnb/b6;Ljava/lang/String;Ljava/net/URL;[BLjava/util/Map;Lnb/y5;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/a6;->f:Lnb/b6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p3}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p6}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p3, p0, Lnb/a6;->a:Ljava/net/URL;

    iput-object p4, p0, Lnb/a6;->b:[B

    iput-object p6, p0, Lnb/a6;->c:Lnb/y5;

    iput-object p2, p0, Lnb/a6;->d:Ljava/lang/String;

    iput-object p5, p0, Lnb/a6;->e:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 13

    const-string v1, "Error closing HTTP compressed POST connection output stream. appId"

    iget-object v0, p0, Lnb/a6;->f:Lnb/b6;

    invoke-virtual {v0}, Lnb/j8;->g()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    :try_start_0
    iget-object v4, p0, Lnb/a6;->a:Ljava/net/URL;

    sget v5, Lcom/google/android/gms/internal/measurement/m1;->a:I

    invoke-virtual {v4}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v4

    instance-of v5, v4, Ljava/net/HttpURLConnection;

    if-eqz v5, :cond_4

    check-cast v4, Ljava/net/HttpURLConnection;

    invoke-virtual {v4, v2}, Ljava/net/URLConnection;->setDefaultUseCaches(Z)V

    iget-object v5, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v5}, Lnb/g7;->w()Lnb/k;

    const v6, 0xea60

    invoke-virtual {v4, v6}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    invoke-virtual {v5}, Lnb/g7;->w()Lnb/k;

    const v6, 0xee48

    invoke-virtual {v4, v6}, Ljava/net/URLConnection;->setReadTimeout(I)V

    invoke-virtual {v4, v2}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    const/4 v6, 0x1

    invoke-virtual {v4, v6}, Ljava/net/URLConnection;->setDoInput(Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    :try_start_1
    iget-object v7, p0, Lnb/a6;->e:Ljava/util/Map;

    if-eqz v7, :cond_0

    invoke-interface {v7}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map$Entry;

    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v4, v9, v8}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_a

    :catch_0
    move-exception v0

    goto/16 :goto_b

    :cond_0
    iget-object v7, p0, Lnb/a6;->b:[B

    if-eqz v7, :cond_1

    iget-object v0, v0, Lnb/td;->b:Lnb/me;

    invoke-virtual {v0}, Lnb/me;->K0()Lnb/re;

    move-result-object v0

    invoke-virtual {v0, v7}, Lnb/re;->V([B)[B

    move-result-object v0

    invoke-virtual {v5}, Lnb/g7;->a()Lnb/w5;

    move-result-object v5

    invoke-virtual {v5}, Lnb/w5;->w()Lnb/u5;

    move-result-object v5

    const-string v7, "Uploading data. size"

    array-length v8, v0

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v5, v7, v9}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v4, v6}, Ljava/net/URLConnection;->setDoOutput(Z)V

    const-string v5, "Content-Encoding"

    const-string v6, "gzip"

    invoke-virtual {v4, v5, v6}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v8}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    invoke-virtual {v4}, Ljava/net/URLConnection;->connect()V

    invoke-virtual {v4}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v5
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v5, v0}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v5}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_3

    :goto_1
    move v6, v2

    move-object v9, v3

    move-object v3, v5

    :goto_2
    move-object v2, v0

    goto/16 :goto_d

    :goto_3
    move-object v8, v0

    move v7, v2

    move-object v10, v3

    move-object v3, v5

    goto/16 :goto_10

    :cond_1
    :goto_4
    :try_start_3
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v8
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-virtual {v4}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v11
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    :try_start_5
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    invoke-virtual {v4}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    const/16 v6, 0x400

    :try_start_6
    new-array v6, v6, [B

    :goto_5
    invoke-virtual {v5, v6}, Ljava/io/InputStream;->read([B)I

    move-result v7

    if-lez v7, :cond_2

    invoke-virtual {v0, v6, v2, v7}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_5

    :catchall_2
    move-exception v0

    goto :goto_6

    :cond_2
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v10
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :try_start_7
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    iget-object v0, p0, Lnb/a6;->f:Lnb/b6;

    iget-object v6, p0, Lnb/a6;->d:Ljava/lang/String;

    iget-object v7, p0, Lnb/a6;->c:Lnb/y5;

    iget-object v0, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->b()Lnb/c7;

    move-result-object v0

    new-instance v5, Lnb/z5;

    const/4 v9, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v5 .. v12}, Lnb/z5;-><init>(Ljava/lang/String;Lnb/y5;ILjava/lang/Throwable;[BLjava/util/Map;[B)V

    invoke-virtual {v0, v5}, Lnb/c7;->t(Ljava/lang/Runnable;)V

    return-void

    :catchall_3
    move-exception v0

    goto :goto_7

    :catch_2
    move-exception v0

    goto :goto_8

    :catchall_4
    move-exception v0

    move-object v5, v3

    :goto_6
    if-eqz v5, :cond_3

    :try_start_8
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V

    :cond_3
    throw v0
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    :goto_7
    move-object v2, v0

    move v6, v8

    move-object v9, v11

    goto :goto_d

    :goto_8
    move v7, v8

    move-object v10, v11

    :goto_9
    move-object v8, v0

    goto/16 :goto_10

    :catchall_5
    move-exception v0

    move-object v2, v0

    move-object v9, v3

    move v6, v8

    goto :goto_d

    :catch_3
    move-exception v0

    move-object v10, v3

    move v7, v8

    goto :goto_9

    :goto_a
    move v6, v2

    move-object v9, v3

    goto :goto_2

    :goto_b
    move-object v8, v0

    move v7, v2

    move-object v10, v3

    goto :goto_10

    :catchall_6
    move-exception v0

    goto :goto_c

    :catch_4
    move-exception v0

    goto :goto_f

    :cond_4
    :try_start_9
    new-instance v0, Ljava/io/IOException;

    const-string v4, "Failed to obtain HTTP connection"

    invoke-direct {v0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_4
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    :goto_c
    move v6, v2

    move-object v4, v3

    move-object v9, v4

    goto :goto_2

    :goto_d
    if-eqz v3, :cond_5

    :try_start_a
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_5

    goto :goto_e

    :catch_5
    move-exception v0

    iget-object v3, p0, Lnb/a6;->f:Lnb/b6;

    iget-object v3, v3, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v3}, Lnb/g7;->a()Lnb/w5;

    move-result-object v3

    invoke-virtual {v3}, Lnb/w5;->o()Lnb/u5;

    move-result-object v3

    iget-object v5, p0, Lnb/a6;->d:Ljava/lang/String;

    invoke-static {v5}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v3, v1, v5, v0}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_5
    :goto_e
    if-eqz v4, :cond_6

    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_6
    iget-object v0, p0, Lnb/a6;->f:Lnb/b6;

    iget-object v4, p0, Lnb/a6;->d:Ljava/lang/String;

    iget-object v5, p0, Lnb/a6;->c:Lnb/y5;

    iget-object v0, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->b()Lnb/c7;

    move-result-object v0

    new-instance v3, Lnb/z5;

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v10}, Lnb/z5;-><init>(Ljava/lang/String;Lnb/y5;ILjava/lang/Throwable;[BLjava/util/Map;[B)V

    invoke-virtual {v0, v3}, Lnb/c7;->t(Ljava/lang/Runnable;)V

    throw v2

    :goto_f
    move-object v8, v0

    move v7, v2

    move-object v4, v3

    move-object v10, v4

    :goto_10
    if-eqz v3, :cond_7

    :try_start_b
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_6

    goto :goto_11

    :catch_6
    move-exception v0

    iget-object v2, p0, Lnb/a6;->f:Lnb/b6;

    iget-object v2, v2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->o()Lnb/u5;

    move-result-object v2

    iget-object v3, p0, Lnb/a6;->d:Ljava/lang/String;

    invoke-static {v3}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v1, v3, v0}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_7
    :goto_11
    if-eqz v4, :cond_8

    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_8
    iget-object v0, p0, Lnb/a6;->f:Lnb/b6;

    iget-object v5, p0, Lnb/a6;->d:Ljava/lang/String;

    iget-object v6, p0, Lnb/a6;->c:Lnb/y5;

    iget-object v0, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->b()Lnb/c7;

    move-result-object v0

    new-instance v4, Lnb/z5;

    const/4 v9, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v4 .. v11}, Lnb/z5;-><init>(Ljava/lang/String;Lnb/y5;ILjava/lang/Throwable;[BLjava/util/Map;[B)V

    invoke-virtual {v0, v4}, Lnb/c7;->t(Ljava/lang/Runnable;)V

    return-void
.end method
