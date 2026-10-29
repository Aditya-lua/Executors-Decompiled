.class public final Lyn/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u001a\r\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "",
        "a",
        "()Z",
        "device_release"
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
.method public static final a()Z
    .locals 13

    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    sget-object v2, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    if-nez v2, :cond_1

    return v1

    :cond_1
    sget-object v3, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    if-nez v3, :cond_2

    return v1

    :cond_2
    sget-object v4, Landroid/os/Build;->HARDWARE:Ljava/lang/String;

    if-nez v4, :cond_3

    return v1

    :cond_3
    sget-object v5, Landroid/os/Build;->MODEL:Ljava/lang/String;

    if-nez v5, :cond_4

    return v1

    :cond_4
    sget-object v6, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    if-nez v6, :cond_5

    return v1

    :cond_5
    sget-object v7, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    if-nez v7, :cond_6

    return v1

    :cond_6
    new-instance v8, Ljava/io/File;

    const-string v9, "/storage/emulated/0/Android/data/com.android.ld.appstore/files"

    invoke-direct {v8, v9}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    move-result v8

    const/4 v9, 0x0

    if-nez v8, :cond_8

    new-instance v8, Ljava/io/File;

    const-string v10, "/storage/emulated/0/Android/data/com.android.ld.appstore/cache"

    invoke-direct {v8, v10}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    move-result v8

    if-eqz v8, :cond_7

    goto :goto_0

    :cond_7
    move v8, v9

    goto :goto_1

    :cond_8
    :goto_0
    move v8, v1

    :goto_1
    const-string v10, "generic"

    const/4 v11, 0x2

    const/4 v12, 0x0

    invoke-static {v0, v10, v9, v11, v12}, Lkotlin/text/x;->T(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {v2, v10, v9, v11, v12}, Lkotlin/text/x;->T(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    :cond_9
    invoke-static {v3, v10, v9, v11, v12}, Lkotlin/text/x;->T(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    const-string v0, "unknown"

    invoke-static {v3, v0, v9, v11, v12}, Lkotlin/text/x;->T(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    const-string v0, "goldfish"

    invoke-static {v4, v0, v9, v11, v12}, Lkotlin/text/StringsKt;->a0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    const-string v0, "ranchu"

    invoke-static {v4, v0, v9, v11, v12}, Lkotlin/text/StringsKt;->a0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    const-string v0, "google_sdk"

    invoke-static {v5, v0, v9, v11, v12}, Lkotlin/text/StringsKt;->a0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    const-string v2, "Emulator"

    invoke-static {v5, v2, v9, v11, v12}, Lkotlin/text/StringsKt;->a0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    const-string v2, "Android SDK built for x86"

    invoke-static {v5, v2, v9, v11, v12}, Lkotlin/text/StringsKt;->a0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    const-string v2, "Genymotion"

    invoke-static {v6, v2, v9, v11, v12}, Lkotlin/text/StringsKt;->a0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    const-string v2, "sdk_google"

    invoke-static {v7, v2, v9, v11, v12}, Lkotlin/text/StringsKt;->a0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    invoke-static {v7, v0, v9, v11, v12}, Lkotlin/text/StringsKt;->a0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    const-string v0, "sdk"

    invoke-static {v7, v0, v9, v11, v12}, Lkotlin/text/StringsKt;->a0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    const-string v0, "sdk_x86"

    invoke-static {v7, v0, v9, v11, v12}, Lkotlin/text/StringsKt;->a0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    const-string v0, "sdk_gphone64_arm64"

    invoke-static {v7, v0, v9, v11, v12}, Lkotlin/text/StringsKt;->a0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    const-string v0, "vbox86p"

    invoke-static {v7, v0, v9, v11, v12}, Lkotlin/text/StringsKt;->a0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    const-string v0, "emulator"

    invoke-static {v7, v0, v9, v11, v12}, Lkotlin/text/StringsKt;->a0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    const-string v0, "simulator"

    invoke-static {v7, v0, v9, v11, v12}, Lkotlin/text/StringsKt;->a0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    if-eqz v8, :cond_a

    goto :goto_2

    :cond_a
    return v9

    :cond_b
    :goto_2
    return v1
.end method
