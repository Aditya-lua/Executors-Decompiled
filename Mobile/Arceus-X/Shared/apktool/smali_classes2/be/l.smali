.class public final Lbe/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lae/k0;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lzd/f;

.field public final c:Lbe/n;

.field public final d:Ljava/util/concurrent/Executor;

.field public final e:Lzd/t;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lbe/n;Lzd/f;Lzd/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbe/l;->a:Landroid/content/Context;

    iput-object p4, p0, Lbe/l;->b:Lzd/f;

    iput-object p3, p0, Lbe/l;->c:Lbe/n;

    iput-object p2, p0, Lbe/l;->d:Ljava/util/concurrent/Executor;

    iput-object p5, p0, Lbe/l;->e:Lzd/t;

    return-void
.end method

.method public static bridge synthetic b(Lbe/l;)Lbe/n;
    .locals 0

    iget-object p0, p0, Lbe/l;->c:Lbe/n;

    return-object p0
.end method

.method public static bridge synthetic c(Lbe/l;Ljava/util/List;Lae/i0;)V
    .locals 0

    invoke-virtual {p0, p1}, Lbe/l;->e(Ljava/util/List;)Ljava/lang/Integer;

    move-result-object p0

    if-nez p0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-nez p1, :cond_1

    invoke-interface {p2}, Lae/i0;->zzc()V

    return-void

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-interface {p2, p0}, Lae/i0;->a(I)V

    return-void
.end method

.method public static bridge synthetic d(Lbe/l;Lae/i0;)V
    .locals 3

    const-string v0, "SplitCompat"

    const/16 v1, -0xc

    :try_start_0
    iget-object p0, p0, Lbe/l;->a:Landroid/content/Context;

    invoke-static {p0}, Lbe/n0;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Lzd/a;->f(Landroid/content/Context;)Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p0, :cond_0

    const-string p0, "Emulating splits failed."

    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-interface {p1, v1}, Lae/i0;->a(I)V

    return-void

    :cond_0
    const-string p0, "Splits installed."

    invoke-static {v0, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-interface {p1}, Lae/i0;->zza()V

    return-void

    :catch_0
    move-exception p0

    const-string v2, "Error emulating splits."

    invoke-static {v0, v2, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    invoke-interface {p1, v1}, Lae/i0;->a(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Lae/i0;)V
    .locals 2

    invoke-static {}, Lzd/a;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbe/l;->d:Ljava/util/concurrent/Executor;

    new-instance v1, Lbe/k;

    invoke-direct {v1, p0, p1, p2}, Lbe/k;-><init>(Lbe/l;Ljava/util/List;Lae/i0;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Ingestion should only be called in SplitCompat mode."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final e(Ljava/util/List;)Ljava/lang/Integer;
    .locals 12

    const-string v0, "SplitCompat"

    const/16 v1, -0xd

    :try_start_0
    new-instance v2, Ljava/io/RandomAccessFile;

    iget-object v3, p0, Lbe/l;->b:Lzd/f;

    invoke-virtual {v3}, Lzd/f;->d()Ljava/io/File;

    move-result-object v3

    const-string v4, "rw"

    invoke-direct {v2, v3, v4}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_5

    const/4 v3, 0x0

    :try_start_1
    invoke-virtual {v2}, Ljava/nio/channels/FileChannel;->tryLock()Ljava/nio/channels/FileLock;

    move-result-object v4
    :try_end_1
    .catch Ljava/nio/channels/OverlappingFileLockException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_12

    :catch_0
    move-object v4, v3

    :goto_0
    if-eqz v4, :cond_9

    :try_start_2
    const-string v3, "Copying splits."

    invoke-static {v0, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v5, 0x0

    if-eqz v3, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/Intent;

    const-string v6, "split_id"

    invoke-virtual {v3, v6}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Lbe/l;->a:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v7

    invoke-virtual {v3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v3

    const-string v8, "r"

    invoke-virtual {v7, v3, v8}, Landroid/content/ContentResolver;->openAssetFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    move-result-object v3
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    iget-object v7, p0, Lbe/l;->b:Lzd/f;

    invoke-virtual {v7, v6}, Lzd/f;->e(Ljava/lang/String;)Ljava/io/File;

    move-result-object v7

    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-virtual {v7}, Ljava/io/File;->length()J

    move-result-wide v8

    invoke-virtual {v3}, Landroid/content/res/AssetFileDescriptor;->getLength()J

    move-result-wide v10

    cmp-long v8, v8, v10

    if-eqz v8, :cond_1

    goto :goto_2

    :catchall_1
    move-exception p1

    goto :goto_9

    :cond_1
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v8

    if-nez v8, :cond_3

    :goto_2
    iget-object v8, p0, Lbe/l;->b:Lzd/f;

    invoke-virtual {v8, v6}, Lzd/f;->g(Ljava/lang/String;)Ljava/io/File;

    move-result-object v6

    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v6

    if-nez v6, :cond_3

    new-instance v6, Ljava/io/BufferedInputStream;

    invoke-virtual {v3}, Landroid/content/res/AssetFileDescriptor;->createInputStream()Ljava/io/FileInputStream;

    move-result-object v8

    invoke-direct {v6, v8}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    new-instance v8, Ljava/io/FileOutputStream;

    invoke-direct {v8, v7}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    const/16 v7, 0x1000

    :try_start_5
    new-array v7, v7, [B

    :goto_3
    invoke-virtual {v6, v7}, Ljava/io/InputStream;->read([B)I

    move-result v9

    if-lez v9, :cond_2

    invoke-virtual {v8, v7, v5, v9}, Ljava/io/OutputStream;->write([BII)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception p1

    goto :goto_4

    :cond_2
    :try_start_6
    invoke-virtual {v8}, Ljava/io/OutputStream;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :try_start_7
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    goto :goto_8

    :catchall_3
    move-exception p1

    goto :goto_6

    :goto_4
    :try_start_8
    invoke-virtual {v8}, Ljava/io/OutputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    goto :goto_5

    :catchall_4
    move-exception v5

    :try_start_9
    invoke-static {p1, v5}, Lbe/j;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_5
    throw p1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    :goto_6
    :try_start_a
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    goto :goto_7

    :catchall_5
    move-exception v5

    :try_start_b
    invoke-static {p1, v5}, Lbe/j;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_7
    throw p1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    :cond_3
    :goto_8
    if-eqz v3, :cond_0

    :try_start_c
    invoke-virtual {v3}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_1
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    goto/16 :goto_1

    :catch_1
    move-exception p1

    goto/16 :goto_10

    :goto_9
    if-eqz v3, :cond_4

    :try_start_d
    invoke-virtual {v3}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    goto :goto_a

    :catchall_6
    move-exception v3

    :try_start_e
    invoke-static {p1, v3}, Lbe/j;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_4
    :goto_a
    throw p1

    :cond_5
    const-string p1, "Splits copied."

    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_1
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    :try_start_f
    iget-object p1, p0, Lbe/l;->b:Lzd/f;

    invoke-virtual {p1}, Lzd/f;->b()Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p1
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_4
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    const/16 v3, -0xb

    :try_start_10
    iget-object v6, p0, Lbe/l;->c:Lbe/n;

    invoke-virtual {v6, p1}, Lbe/n;->c([Ljava/io/File;)Z

    move-result v6

    if-eqz v6, :cond_7

    iget-object v6, p0, Lbe/l;->c:Lbe/n;

    invoke-virtual {v6, p1}, Lbe/n;->a([Ljava/io/File;)Z

    move-result p1
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_3
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    if-eqz p1, :cond_7

    :try_start_11
    iget-object p1, p0, Lbe/l;->b:Lzd/f;

    invoke-virtual {p1}, Lzd/f;->b()Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    array-length v3, p1

    :goto_b
    add-int/lit8 v3, v3, -0x1

    if-ltz v3, :cond_6

    aget-object v6, p1, v3

    invoke-static {v6}, Lzd/f;->m(Ljava/io/File;)V

    aget-object v6, p1, v3

    iget-object v7, p0, Lbe/l;->b:Lzd/f;

    invoke-virtual {v7, v6}, Lzd/f;->f(Ljava/io/File;)Ljava/io/File;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/io/File;->renameTo(Ljava/io/File;)Z
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_2
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    goto :goto_b

    :catch_2
    move-exception p1

    goto :goto_c

    :cond_6
    :try_start_12
    const-string p1, "Splits verified."

    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_11

    :goto_c
    const-string v3, "Cannot write verified split."

    invoke-static {v0, v3, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_d
    move v5, v1

    goto :goto_11

    :catch_3
    move-exception p1

    goto :goto_f

    :cond_7
    const-string p1, "Split verification failed."

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_e
    move v5, v3

    goto :goto_11

    :goto_f
    const-string v5, "Error verifying splits."

    invoke-static {v0, v5, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_e

    :catch_4
    move-exception p1

    const-string v3, "Cannot access directory for unverified splits."

    invoke-static {v0, v3, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_d

    :goto_10
    const-string v3, "Error copying splits."

    invoke-static {v0, v3, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_d

    :goto_11
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v4}, Ljava/nio/channels/FileLock;->release()V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_0

    goto :goto_14

    :goto_12
    if-eqz v2, :cond_8

    :try_start_13
    invoke-virtual {v2}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_7

    goto :goto_13

    :catchall_7
    move-exception v2

    :try_start_14
    invoke-static {p1, v2}, Lbe/j;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_13

    :catch_5
    move-exception p1

    goto :goto_15

    :cond_8
    :goto_13
    throw p1

    :cond_9
    :goto_14
    if-eqz v2, :cond_a

    invoke-virtual {v2}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_5

    :cond_a
    return-object v3

    :goto_15
    const-string v2, "Error locking files."

    invoke-static {v0, v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
