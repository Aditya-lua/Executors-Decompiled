.class public Lcom/appsflyer/internal/AFk1tSDK;
.super Ljava/lang/Object;


# direct methods
.method public static AFKeystoreWrapper([BBJ)V
    .locals 5

    const/4 v0, 0x0

    :goto_0
    array-length v1, p0

    if-ge v0, v1, :cond_1

    const-wide/16 v1, 0x1

    shl-long/2addr v1, v0

    and-long/2addr v1, p2

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-eqz v1, :cond_0

    aget-byte v1, p0, v0

    xor-int/2addr v1, p1

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method
