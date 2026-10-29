.class public abstract Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult$Failure;,
        Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult$Success;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00088&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\nR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00058&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\r\u0082\u0001\u0002\u0011\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult;",
        "Landroid/os/Parcelable;",
        "<init>",
        "()V",
        "",
        "",
        "g",
        "()Ljava/util/Map;",
        "Llp/b;",
        "f",
        "()Llp/b;",
        "operation",
        "a",
        "()Ljava/lang/String;",
        "nonce",
        "Success",
        "Failure",
        "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult$Failure;",
        "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult$Success;",
        "jp-my-number_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract f()Llp/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public final g()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {}, Lkotlin/collections/j0;->d()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult;->f()Llp/b;

    move-result-object v1

    invoke-virtual {v1}, Llp/b;->c()Ljava/lang/String;

    move-result-object v1

    const-string v2, "operation"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult;->a()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, "nonce"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    :cond_0
    instance-of v1, p0, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult$Success;

    if-eqz v1, :cond_1

    move-object v1, p0

    check-cast v1, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult$Success;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult$Success;->i()Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanData;

    move-result-object v1

    invoke-interface {v1}, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanData;->j2()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    goto :goto_0

    :cond_1
    instance-of v1, p0, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult$Failure;

    if-eqz v1, :cond_2

    move-object v1, p0

    check-cast v1, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult$Failure;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult$Failure;->i()Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError;

    move-result-object v1

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanError;->a()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    :goto_0
    invoke-static {v0}, Lkotlin/collections/j0;->c(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :cond_2
    new-instance v0, Ljt/l;

    invoke-direct {v0}, Ljt/l;-><init>()V

    throw v0
.end method
