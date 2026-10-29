.class public final Lcom/withpersona/sdk2/inquiry/selfie/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/selfie/i$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a)\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b*\u00020\u00002\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a\u0011\u0010\u0010\u001a\u00020\u0001*\u00020\u000f\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lfn/p0;",
        "Lkn/a;",
        "d",
        "(Lfn/p0;)Lkn/a;",
        "",
        "a",
        "(Lkn/a;)Ljava/lang/String;",
        "Lqq/c;",
        "sdkFilesManager",
        "Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;",
        "poseInfo",
        "Ljt/n;",
        "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;",
        "b",
        "(Lfn/p0;Lqq/c;Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;)Ljava/lang/Object;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;",
        "c",
        "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;)Lkn/a;",
        "selfie_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lkn/a;)Ljava/lang/String;
    .locals 1
    .param p0    # Lkn/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/withpersona/sdk2/inquiry/selfie/i$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/4 v0, 0x5

    if-ne p0, v0, :cond_0

    const-string p0, "down"

    return-object p0

    :cond_0
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0

    :cond_1
    const-string p0, "up"

    return-object p0

    :cond_2
    const-string p0, "right"

    return-object p0

    :cond_3
    const-string p0, "left"

    return-object p0

    :cond_4
    const-string p0, "center"

    return-object p0
.end method

.method public static final b(Lfn/p0;Lqq/c;Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;)Ljava/lang/Object;
    .locals 9
    .param p0    # Lfn/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lqq/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sdkFilesManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "poseInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lfn/p0;->a()Landroid/graphics/Bitmap;

    move-result-object v1

    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    const-string v0, "jpg"

    invoke-virtual {p1, v0}, Lqq/c;->e(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v3, 0x50

    invoke-virtual {v1, v0, v3, v2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/4 v0, 0x0

    :try_start_2
    invoke-static {v2, v0}, Lut/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    sget-object v0, Ljt/n;->b:Ljt/n$a;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    const-string p1, "getAbsolutePath(...)"

    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/selfie/i;->d(Lfn/p0;)Lkn/a;

    move-result-object v5

    sget-object v4, Lcom/withpersona/sdk2/inquiry/selfie/Selfie$a;->b:Lcom/withpersona/sdk2/inquiry/selfie/Selfie$a;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;->g()Ljava/lang/String;

    move-result-object v8

    new-instance v2, Lcom/withpersona/sdk2/inquiry/selfie/Selfie$SelfieImage;

    invoke-direct/range {v2 .. v8}, Lcom/withpersona/sdk2/inquiry/selfie/Selfie$SelfieImage;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/Selfie$a;Lkn/a;JLjava/lang/String;)V

    invoke-static {v2}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    return-object p0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_1

    :catch_0
    move-exception v0

    move-object p0, v0

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object p0, v0

    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    move-exception v0

    move-object p1, v0

    :try_start_4
    invoke-static {v2, p0}, Lut/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw p1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_0
    :try_start_5
    sget-object p1, Ljt/n;->b:Ljt/n$a;

    invoke-static {p0}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    return-object p0

    :goto_1
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    throw p0
.end method

.method public static final c(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;)Lkn/a;
    .locals 1
    .param p0    # Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/withpersona/sdk2/inquiry/selfie/i$a;->b:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/4 v0, 0x5

    if-ne p0, v0, :cond_0

    sget-object p0, Lkn/a;->e:Lkn/a;

    return-object p0

    :cond_0
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Lkn/a;->d:Lkn/a;

    return-object p0

    :cond_2
    sget-object p0, Lkn/a;->c:Lkn/a;

    return-object p0

    :cond_3
    sget-object p0, Lkn/a;->b:Lkn/a;

    return-object p0

    :cond_4
    sget-object p0, Lkn/a;->a:Lkn/a;

    return-object p0
.end method

.method public static final d(Lfn/p0;)Lkn/a;
    .locals 1
    .param p0    # Lfn/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lfn/p0$a;

    if-eqz v0, :cond_0

    sget-object p0, Lkn/a;->a:Lkn/a;

    return-object p0

    :cond_0
    instance-of v0, p0, Lfn/p0$c;

    if-eqz v0, :cond_1

    sget-object p0, Lkn/a;->b:Lkn/a;

    return-object p0

    :cond_1
    instance-of v0, p0, Lfn/p0$d;

    if-eqz v0, :cond_2

    sget-object p0, Lkn/a;->c:Lkn/a;

    return-object p0

    :cond_2
    instance-of v0, p0, Lfn/p0$e;

    if-eqz v0, :cond_3

    sget-object p0, Lkn/a;->d:Lkn/a;

    return-object p0

    :cond_3
    instance-of p0, p0, Lfn/p0$b;

    if-eqz p0, :cond_4

    sget-object p0, Lkn/a;->e:Lkn/a;

    return-object p0

    :cond_4
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0
.end method
