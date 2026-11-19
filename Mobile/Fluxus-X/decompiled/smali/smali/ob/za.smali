.class public final Lob/za;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:Ljava/net/URL;

.field public final b:[B

.field public final c:Lob/xa;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/util/Map;

.field public final synthetic f:Lob/ab;


# direct methods
.method public constructor <init>(Lob/ab;Ljava/lang/String;Ljava/net/URL;[BLjava/util/Map;Lob/xa;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/za;->f:Lob/ab;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2}, Lo9/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p3}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p6}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p3, p0, Lob/za;->a:Ljava/net/URL;

    iput-object p4, p0, Lob/za;->b:[B

    iput-object p6, p0, Lob/za;->c:Lob/xa;

    iput-object p2, p0, Lob/za;->d:Ljava/lang/String;

    iput-object p5, p0, Lob/za;->e:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final synthetic a(ILjava/lang/Exception;[BLjava/util/Map;)V
    .locals 6

    iget-object v0, p0, Lob/za;->c:Lob/xa;

    iget-object v1, p0, Lob/za;->d:Ljava/lang/String;

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-interface/range {v0 .. v5}, Lob/xa;->a(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V

    return-void
.end method

.method public final b(ILjava/lang/Exception;[BLjava/util/Map;)V
    .locals 7

    iget-object v0, p0, Lob/za;->f:Lob/ab;

    iget-object v0, v0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->b()Lob/h7;

    move-result-object v0

    new-instance v1, Lob/ya;

    move-object v2, p0

    move v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lob/ya;-><init>(Lob/za;ILjava/lang/Exception;[BLjava/util/Map;)V

    invoke-virtual {v0, v1}, Lob/h7;->t(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final run()V
    .locals 10

    const-string v0, "Error closing HTTP compressed POST connection output stream. appId"

    iget-object v1, p0, Lob/za;->f:Lob/ab;

    invoke-virtual {v1}, Lob/o8;->g()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    :try_start_0
    iget-object v4, p0, Lob/za;->a:Ljava/net/URL;

    sget v5, Lcom/google/android/gms/internal/measurement/m1;->a:I

    invoke-virtual {v4}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v4

    instance-of v5, v4, Ljava/net/HttpURLConnection;

    if-eqz v5, :cond_4

    check-cast v4, Ljava/net/HttpURLConnection;

    invoke-virtual {v4, v2}, Ljava/net/URLConnection;->setDefaultUseCaches(Z)V

    iget-object v1, v1, Lob/o8;->a:Lob/l7;

    invoke-virtual {v1}, Lob/l7;->w()Lob/m;

    const v5, 0xea60

    invoke-virtual {v4, v5}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    invoke-virtual {v1}, Lob/l7;->w()Lob/m;

    const v5, 0xee48

    invoke-virtual {v4, v5}, Ljava/net/URLConnection;->setReadTimeout(I)V

    invoke-virtual {v4, v2}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Ljava/net/URLConnection;->setDoInput(Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_5
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    :try_start_1
    iget-object v6, p0, Lob/za;->e:Ljava/util/Map;

    if-eqz v6, :cond_0

    invoke-interface {v6}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v4, v8, v7}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto/16 :goto_8

    :catch_0
    move-exception v1

    goto/16 :goto_a

    :cond_0
    iget-object v6, p0, Lob/za;->b:[B
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v6, :cond_1

    :try_start_2
    invoke-virtual {v1}, Lob/l7;->c()Lob/f;

    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    new-instance v7, Ljava/util/zip/GZIPOutputStream;

    invoke-direct {v7, v1}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V

    invoke-virtual {v7, v6}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v7}, Ljava/io/OutputStream;->close()V

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    iget-object v6, p0, Lob/za;->f:Lob/ab;

    iget-object v6, v6, Lob/o8;->a:Lob/l7;

    invoke-virtual {v6}, Lob/l7;->a()Lob/b6;

    move-result-object v6

    invoke-virtual {v6}, Lob/b6;->w()Lob/z5;

    move-result-object v6

    const-string v7, "Uploading data. size"

    array-length v8, v1

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v6, v7, v9}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v4, v5}, Ljava/net/URLConnection;->setDoOutput(Z)V

    const-string v5, "Content-Encoding"

    const-string v6, "gzip"

    invoke-virtual {v4, v5, v6}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v8}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    invoke-virtual {v4}, Ljava/net/URLConnection;->connect()V

    invoke-virtual {v4}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v5
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-virtual {v5, v1}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v5}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v1

    goto :goto_1

    :catch_1
    move-exception v1

    goto :goto_2

    :goto_1
    move-object v6, v3

    goto/16 :goto_d

    :goto_2
    move-object v6, v3

    goto/16 :goto_10

    :catch_2
    move-exception v1

    :try_start_5
    iget-object v5, p0, Lob/za;->f:Lob/ab;

    iget-object v5, v5, Lob/o8;->a:Lob/l7;

    invoke-virtual {v5}, Lob/l7;->a()Lob/b6;

    move-result-object v5

    invoke-virtual {v5}, Lob/b6;->o()Lob/z5;

    move-result-object v5

    const-string v6, "Failed to gzip post request content"

    invoke-virtual {v5, v6, v1}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    throw v1

    :cond_1
    :goto_3
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v1
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    invoke-virtual {v4}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v5
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    :try_start_7
    new-instance v6, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v6}, Ljava/io/ByteArrayOutputStream;-><init>()V

    invoke-virtual {v4}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v7
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    const/16 v8, 0x400

    :try_start_8
    new-array v8, v8, [B

    :goto_4
    invoke-virtual {v7, v8}, Ljava/io/InputStream;->read([B)I

    move-result v9

    if-lez v9, :cond_2

    invoke-virtual {v6, v8, v2, v9}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_4

    :catchall_2
    move-exception v2

    goto :goto_5

    :cond_2
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :try_start_9
    invoke-virtual {v7}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_3
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    invoke-virtual {p0, v1, v3, v2, v5}, Lob/za;->b(ILjava/lang/Exception;[BLjava/util/Map;)V

    return-void

    :catchall_3
    move-exception v2

    goto :goto_6

    :catch_3
    move-exception v2

    goto :goto_7

    :catchall_4
    move-exception v2

    move-object v7, v3

    :goto_5
    if-eqz v7, :cond_3

    :try_start_a
    invoke-virtual {v7}, Ljava/io/InputStream;->close()V

    :cond_3
    throw v2
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_3
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    :goto_6
    move-object v6, v2

    move v2, v1

    move-object v1, v6

    move-object v6, v5

    move-object v5, v3

    goto :goto_d

    :goto_7
    move-object v6, v2

    move v2, v1

    move-object v1, v6

    move-object v6, v5

    move-object v5, v3

    goto :goto_10

    :catchall_5
    move-exception v2

    move-object v5, v2

    move v2, v1

    move-object v1, v5

    :goto_8
    move-object v5, v3

    :goto_9
    move-object v6, v5

    goto :goto_d

    :catch_4
    move-exception v2

    move-object v5, v2

    move v2, v1

    move-object v1, v5

    :goto_a
    move-object v5, v3

    :goto_b
    move-object v6, v5

    goto :goto_10

    :catchall_6
    move-exception v1

    goto :goto_c

    :catch_5
    move-exception v1

    goto :goto_f

    :cond_4
    :try_start_b
    new-instance v1, Ljava/io/IOException;

    const-string v4, "Failed to obtain HTTP connection"

    invoke-direct {v1, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_5
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    :goto_c
    move-object v4, v3

    move-object v5, v4

    goto :goto_9

    :goto_d
    if-eqz v5, :cond_5

    :try_start_c
    invoke-virtual {v5}, Ljava/io/OutputStream;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_6

    goto :goto_e

    :catch_6
    move-exception v5

    iget-object v7, p0, Lob/za;->f:Lob/ab;

    iget-object v7, v7, Lob/o8;->a:Lob/l7;

    invoke-virtual {v7}, Lob/l7;->a()Lob/b6;

    move-result-object v7

    invoke-virtual {v7}, Lob/b6;->o()Lob/z5;

    move-result-object v7

    iget-object v8, p0, Lob/za;->d:Ljava/lang/String;

    invoke-static {v8}, Lob/b6;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v7, v0, v8, v5}, Lob/z5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_5
    :goto_e
    if-eqz v4, :cond_6

    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_6
    invoke-virtual {p0, v2, v3, v3, v6}, Lob/za;->b(ILjava/lang/Exception;[BLjava/util/Map;)V

    throw v1

    :goto_f
    move-object v4, v3

    move-object v5, v4

    goto :goto_b

    :goto_10
    if-eqz v5, :cond_7

    :try_start_d
    invoke-virtual {v5}, Ljava/io/OutputStream;->close()V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_7

    goto :goto_11

    :catch_7
    move-exception v5

    iget-object v7, p0, Lob/za;->f:Lob/ab;

    iget-object v7, v7, Lob/o8;->a:Lob/l7;

    invoke-virtual {v7}, Lob/l7;->a()Lob/b6;

    move-result-object v7

    invoke-virtual {v7}, Lob/b6;->o()Lob/z5;

    move-result-object v7

    iget-object v8, p0, Lob/za;->d:Ljava/lang/String;

    invoke-static {v8}, Lob/b6;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v7, v0, v8, v5}, Lob/z5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_7
    :goto_11
    if-eqz v4, :cond_8

    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_8
    invoke-virtual {p0, v2, v1, v3, v6}, Lob/za;->b(ILjava/lang/Exception;[BLjava/util/Map;)V

    return-void
.end method
