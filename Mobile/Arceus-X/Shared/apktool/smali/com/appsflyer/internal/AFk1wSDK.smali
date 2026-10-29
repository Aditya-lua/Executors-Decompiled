.class public final Lcom/appsflyer/internal/AFk1wSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static AFKeystoreWrapper(II)[J
    .locals 6

    const/4 v0, 0x4

    new-array v1, v0, [J

    int-to-long v2, p0

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    const/16 p0, 0x20

    shl-long/2addr v2, p0

    int-to-long p0, p1

    and-long/2addr p0, v4

    or-long/2addr p0, v2

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    const/4 p0, 0x1

    :goto_0
    if-ge p0, v0, :cond_0

    add-int/lit8 p1, p0, -0x1

    aget-wide v2, v1, p1

    const/16 p1, 0x1e

    shr-long v4, v2, p1

    xor-long/2addr v2, v4

    const-wide/32 v4, 0x6c078965

    mul-long/2addr v2, v4

    int-to-long v4, p0

    add-long/2addr v2, v4

    aput-wide v2, v1, p0

    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method
