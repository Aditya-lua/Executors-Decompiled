.class public final Leb/f4;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/io/InputStream;Leb/h4;)Leb/e4;
    .locals 0

    :try_start_0
    invoke-static {p0, p1}, Leb/f4;->b(Ljava/io/InputStream;Leb/h4;)Leb/e4;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {p1}, Leb/h4;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    return-object p0

    :catchall_0
    move-exception p0

    :try_start_2
    invoke-virtual {p1}, Leb/h4;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    throw p0
.end method

.method public static final b(Ljava/io/InputStream;Leb/h4;)Leb/e4;
    .locals 10

    const-string v0, "Error in decoding CborValue from bytes"

    :try_start_0
    invoke-virtual {p1}, Leb/h4;->d()Leb/g4;

    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    if-eqz v1, :cond_10

    :try_start_1
    invoke-virtual {v1}, Leb/g4;->a()B

    move-result v2

    invoke-virtual {v1}, Leb/g4;->b()B

    move-result v3

    const/16 v4, -0x80

    const-wide/16 v5, 0x3e8

    const/4 v7, 0x0

    if-eq v3, v4, :cond_d

    const/16 v4, -0x60

    if-eq v3, v4, :cond_6

    const/16 v4, -0x40

    if-eq v3, v4, :cond_5

    const/16 v4, -0x20

    if-eq v3, v4, :cond_4

    if-eqz v3, :cond_2

    const/16 v4, 0x20

    if-eq v3, v4, :cond_2

    const/16 v4, 0x40

    if-eq v3, v4, :cond_1

    const/16 v4, 0x60

    if-ne v3, v4, :cond_0

    invoke-virtual {p1}, Leb/h4;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    int-to-long v3, v3

    invoke-static {v2, v3, v4, p0, p1}, Leb/f4;->c(BJLjava/io/InputStream;Leb/h4;)V

    new-instance p0, Leb/c4;

    invoke-direct {p0, v1}, Leb/c4;-><init>(Ljava/lang/String;)V

    return-object p0

    :catch_0
    move-exception p0

    goto/16 :goto_5

    :catch_1
    move-exception p0

    goto/16 :goto_5

    :cond_0
    new-instance p0, Leb/y3;

    invoke-virtual {v1}, Leb/g4;->c()I

    move-result p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unidentifiable major type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Leb/y3;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-virtual {p1}, Leb/h4;->g()[B

    move-result-object v1

    array-length v3, v1

    int-to-long v4, v3

    invoke-static {v2, v4, v5, p0, p1}, Leb/f4;->c(BJLjava/io/InputStream;Leb/h4;)V

    new-instance p0, Leb/x3;

    invoke-static {v1, v7, v3}, Leb/m3;->m([BII)Leb/m3;

    move-result-object p1

    invoke-direct {p0, p1}, Leb/x3;-><init>(Leb/m3;)V

    return-object p0

    :cond_2
    invoke-virtual {p1}, Leb/h4;->b()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v1, v3, v5

    if-lez v1, :cond_3

    move-wide v5, v3

    goto :goto_0

    :cond_3
    not-long v5, v3

    :goto_0
    invoke-static {v2, v5, v6, p0, p1}, Leb/f4;->c(BJLjava/io/InputStream;Leb/h4;)V

    new-instance p0, Leb/z3;

    invoke-direct {p0, v3, v4}, Leb/z3;-><init>(J)V

    return-object p0

    :cond_4
    invoke-virtual {p1}, Leb/h4;->f()Z

    move-result p0

    new-instance p1, Leb/w3;

    invoke-direct {p1, p0}, Leb/w3;-><init>(Z)V

    return-object p1

    :cond_5
    new-instance p0, Leb/y3;

    const-string p1, "Tags are currently unsupported"

    invoke-direct {p0, p1}, Leb/y3;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    invoke-virtual {p1}, Leb/h4;->c()J

    move-result-wide v3

    cmp-long v1, v3, v5

    if-gtz v1, :cond_c

    invoke-static {v2, v3, v4, p0, p1}, Leb/f4;->c(BJLjava/io/InputStream;Leb/h4;)V

    long-to-int v1, v3

    new-array v2, v1, [Leb/a4;

    const/4 v5, 0x0

    move v6, v7

    :goto_1
    int-to-long v8, v6

    cmp-long v8, v8, v3

    if-gez v8, :cond_9

    invoke-static {p0, p1}, Leb/f4;->b(Ljava/io/InputStream;Leb/h4;)Leb/e4;

    move-result-object v8

    if-eqz v5, :cond_8

    invoke-interface {v8, v5}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v9

    if-lez v9, :cond_7

    goto :goto_2

    :cond_7
    new-instance p0, Leb/u3;

    const-string p1, "Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: %s\nCurrent key: %s"

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v1, v2}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Leb/u3;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8
    :goto_2
    new-instance v5, Leb/a4;

    invoke-static {p0, p1}, Leb/f4;->b(Ljava/io/InputStream;Leb/h4;)Leb/e4;

    move-result-object v9

    invoke-direct {v5, v8, v9}, Leb/a4;-><init>(Leb/e4;Leb/e4;)V

    aput-object v5, v2, v6

    add-int/lit8 v6, v6, 0x1

    move-object v5, v8

    goto :goto_1

    :cond_9
    new-instance p0, Ljava/util/TreeMap;

    invoke-direct {p0}, Ljava/util/TreeMap;-><init>()V

    :goto_3
    if-ge v7, v1, :cond_b

    aget-object p1, v2, v7

    invoke-virtual {p1}, Leb/a4;->a()Leb/e4;

    move-result-object v3

    invoke-interface {p0, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    invoke-virtual {p1}, Leb/a4;->a()Leb/e4;

    move-result-object v3

    invoke-virtual {p1}, Leb/a4;->b()Leb/e4;

    move-result-object p1

    invoke-interface {p0, v3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_a
    new-instance p0, Leb/u3;

    const-string p1, "Attempted to add duplicate key to canonical CBOR Map."

    invoke-direct {p0, p1}, Leb/u3;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_b
    new-instance p1, Leb/b4;

    invoke-static {p0}, Leb/l1;->e(Ljava/util/Map;)Leb/l1;

    move-result-object p0

    invoke-direct {p1, p0}, Leb/b4;-><init>(Leb/l1;)V

    return-object p1

    :cond_c
    new-instance p0, Leb/y3;

    const-string p1, "Parser being asked to read a large CBOR map"

    invoke-direct {p0, p1}, Leb/y3;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_d
    invoke-virtual {p1}, Leb/h4;->a()J

    move-result-wide v3

    cmp-long v1, v3, v5

    if-gtz v1, :cond_f

    invoke-static {v2, v3, v4, p0, p1}, Leb/f4;->c(BJLjava/io/InputStream;Leb/h4;)V

    long-to-int v1, v3

    new-array v1, v1, [Leb/e4;

    :goto_4
    int-to-long v5, v7

    cmp-long v2, v5, v3

    if-gez v2, :cond_e

    invoke-static {p0, p1}, Leb/f4;->b(Ljava/io/InputStream;Leb/h4;)Leb/e4;

    move-result-object v2

    aput-object v2, v1, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    :cond_e
    new-instance p0, Leb/v3;

    invoke-static {v1}, Leb/e1;->i([Ljava/lang/Object;)Leb/e1;

    move-result-object p1

    invoke-direct {p0, p1}, Leb/v3;-><init>(Leb/e1;)V

    return-object p0

    :cond_f
    new-instance p0, Leb/y3;

    const-string p1, "Parser being asked to read a large CBOR array"

    invoke-direct {p0, p1}, Leb/y3;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    :goto_5
    new-instance p1, Leb/y3;

    invoke-direct {p1, v0, p0}, Leb/y3;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_10
    new-instance p0, Leb/y3;

    const-string p1, "Parser being asked to parse an empty input stream"

    invoke-direct {p0, p1}, Leb/y3;-><init>(Ljava/lang/String;)V

    throw p0

    :catch_2
    move-exception p0

    new-instance p1, Leb/y3;

    invoke-direct {p1, v0, p0}, Leb/y3;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static final c(BJLjava/io/InputStream;Leb/h4;)V
    .locals 2

    const-string p3, "Integer value "

    packed-switch p0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const-wide v0, 0x100000000L

    cmp-long p0, p1, v0

    if-ltz p0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Leb/u3;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " after add info could have been represented in 0-4 additional bytes, but used 8"

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Leb/u3;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_1
    const-wide/32 v0, 0x10000

    cmp-long p0, p1, v0

    if-ltz p0, :cond_1

    goto :goto_0

    :cond_1
    new-instance p0, Leb/u3;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " after add info could have been represented in 0-2 additional bytes, but used 4"

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Leb/u3;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_2
    const-wide/16 v0, 0x100

    cmp-long p0, p1, v0

    if-ltz p0, :cond_2

    goto :goto_0

    :cond_2
    new-instance p0, Leb/u3;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " after add info could have been represented in 0-1 additional bytes, but used 2"

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Leb/u3;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_3
    const-wide/16 v0, 0x18

    cmp-long p0, p1, v0

    if-ltz p0, :cond_3

    :goto_0
    return-void

    :cond_3
    new-instance p0, Leb/u3;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " after add info could have been represented in 0 additional bytes, but used 1"

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Leb/u3;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_data_0
    .packed-switch 0x18
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
