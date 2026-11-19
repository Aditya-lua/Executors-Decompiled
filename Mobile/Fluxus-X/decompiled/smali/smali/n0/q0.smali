.class public final Ln0/q0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const-string p0, "DEFAULT"

    return-object p0

    :cond_0
    const-string p0, "ULTRA_HIGH_RESOLUTION_CAMERA"

    return-object p0

    :cond_1
    const-string p0, "CONCURRENT_CAMERA"

    return-object p0
.end method
