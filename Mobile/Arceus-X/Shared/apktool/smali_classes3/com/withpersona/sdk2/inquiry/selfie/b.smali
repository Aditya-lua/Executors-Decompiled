.class public interface abstract Lcom/withpersona/sdk2/inquiry/selfie/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/inquiry/selfie/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008v\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u0082\u0001\u0003\n\u000b\u000c\u00a8\u0006\r\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/selfie/b;",
        "Lcom/withpersona/sdk2/inquiry/selfie/a;",
        "",
        "n",
        "()J",
        "startCaptureTimestamp",
        "",
        "o",
        "()Z",
        "manualCaptureEnabled",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;",
        "selfie_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract n()J
.end method

.method public o()Z
    .locals 7

    invoke-interface {p0}, Lcom/withpersona/sdk2/inquiry/selfie/a;->k()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;

    move-result-object v0

    invoke-interface {p0}, Lcom/withpersona/sdk2/inquiry/selfie/a;->f()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;->j()Z

    move-result v1

    if-nez v1, :cond_0

    return v2

    :cond_0
    invoke-interface {p0}, Lcom/withpersona/sdk2/inquiry/selfie/a;->f()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;->g()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-interface {p0}, Lcom/withpersona/sdk2/inquiry/selfie/b;->n()J

    move-result-wide v5

    sub-long/2addr v3, v5

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;->i()J

    move-result-wide v0

    cmp-long v0, v3, v0

    if-lez v0, :cond_1

    goto :goto_0

    :cond_1
    return v2

    :cond_2
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
