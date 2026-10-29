.class public Lwj/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a()Z
    .locals 1

    invoke-static {}, Lwj/c;->b()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lgk/t;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public static b()Z
    .locals 1

    invoke-static {}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeIsLuaLoginEnabled()Z

    move-result v0

    return v0
.end method
