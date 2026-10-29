.class public abstract Lcom/withpersona/sdk2/inquiry/selfie/Selfie;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/selfie/Selfie$a;,
        Lcom/withpersona/sdk2/inquiry/selfie/Selfie$SelfieImage;,
        Lcom/withpersona/sdk2/inquiry/selfie/Selfie$SelfieVideo;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0003\u0005\u000c\rB\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00088&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\n\u0082\u0001\u0002\u000e\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;",
        "Landroid/os/Parcelable;",
        "<init>",
        "()V",
        "",
        "a",
        "()Ljava/lang/String;",
        "absoluteFilePath",
        "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$a;",
        "f",
        "()Lcom/withpersona/sdk2/inquiry/selfie/Selfie$a;",
        "captureMethod",
        "SelfieImage",
        "SelfieVideo",
        "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$SelfieImage;",
        "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$SelfieVideo;",
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
    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/selfie/Selfie;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract f()Lcom/withpersona/sdk2/inquiry/selfie/Selfie$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
