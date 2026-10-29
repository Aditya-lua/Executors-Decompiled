.class public final Lcom/withpersona/sdk2/camera/AutoCaptureRule$FrontOrBackRule$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/camera/AutoCaptureRule$FrontOrBackRule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/withpersona/sdk2/camera/AutoCaptureRule$FrontOrBackRule;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
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

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Parcel;)Lcom/withpersona/sdk2/camera/AutoCaptureRule$FrontOrBackRule;
    .locals 1

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/withpersona/sdk2/camera/AutoCaptureRule$FrontOrBackRule;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-direct {v0, p1}, Lcom/withpersona/sdk2/camera/AutoCaptureRule$FrontOrBackRule;-><init>(Z)V

    return-object v0
.end method

.method public final b(I)[Lcom/withpersona/sdk2/camera/AutoCaptureRule$FrontOrBackRule;
    .locals 0

    new-array p1, p1, [Lcom/withpersona/sdk2/camera/AutoCaptureRule$FrontOrBackRule;

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/camera/AutoCaptureRule$FrontOrBackRule$a;->a(Landroid/os/Parcel;)Lcom/withpersona/sdk2/camera/AutoCaptureRule$FrontOrBackRule;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/camera/AutoCaptureRule$FrontOrBackRule$a;->b(I)[Lcom/withpersona/sdk2/camera/AutoCaptureRule$FrontOrBackRule;

    move-result-object p1

    return-object p1
.end method
