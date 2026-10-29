.class public final Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderOutput$Failed;
.super Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderOutput;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderOutput;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Failed"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0011\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderOutput$Failed;",
        "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderOutput;",
        "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult;",
        "result",
        "",
        "transitionComponentName",
        "<init>",
        "(Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult;Ljava/lang/String;)V",
        "",
        "describeContents",
        "()I",
        "Landroid/os/Parcel;",
        "dest",
        "flags",
        "",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "a",
        "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult;",
        "()Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult;",
        "b",
        "Ljava/lang/String;",
        "f",
        "()Ljava/lang/String;",
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


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderOutput$Failed;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderOutput$Failed$a;

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderOutput$Failed$a;-><init>()V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderOutput$Failed;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult;Ljava/lang/String;)V
    .locals 1
    .param p1    # Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderOutput;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderOutput$Failed;->a:Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderOutput$Failed;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderOutput$Failed;->a:Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult;

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderOutput$Failed;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1
    .param p1    # Landroid/os/Parcel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderOutput$Failed;->a:Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderOutput$Failed;->b:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
