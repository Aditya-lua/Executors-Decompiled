.class public final enum Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\t\u0008\u0087\u0081\u0002\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\u0008\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\r\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;",
        "Landroid/os/Parcelable;",
        "",
        "",
        "type",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
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
        "Ljava/lang/String;",
        "j",
        "()Ljava/lang/String;",
        "b",
        "c",
        "document_release"
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
            "Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final enum b:Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;

.field public static final enum c:Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;

.field public static final synthetic d:[Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;

.field public static final synthetic e:Lqt/a;


# instance fields
.field public final a:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;

    const/4 v1, 0x0

    const-string v2, "upload"

    const-string v3, "UPLOAD"

    invoke-direct {v0, v3, v1, v2}, Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;->b:Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;

    const/4 v1, 0x1

    const-string v2, "manual"

    const-string v3, "MANUAL"

    invoke-direct {v0, v3, v1, v2}, Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;->c:Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;->a()[Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;

    move-result-object v0

    sput-object v0, Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;->d:[Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;->e:Lqt/a;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/CaptureMethod$a;

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/document/CaptureMethod$a;-><init>()V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;->a:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic a()[Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;
    .locals 2

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;->b:Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;

    sget-object v1, Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;->c:Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;

    filled-new-array {v0, v1}, [Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;
    .locals 1

    const-class v0, Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;

    return-object p0
.end method

.method public static values()[Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;->d:[Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;

    return-object v0
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final j()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1    # Landroid/os/Parcel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
