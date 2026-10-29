.class public abstract Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/governmentid/Screen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Overlay"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$Barcode;,
        Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$CornersOnly;,
        Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$Custom;,
        Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$GenericFront;,
        Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$Passport;,
        Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$Rectangle;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\u0008\tB\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\u000c\r\u000e\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;",
        "Landroid/os/Parcelable;",
        "<init>",
        "()V",
        "Rectangle",
        "Passport",
        "Barcode",
        "CornersOnly",
        "GenericFront",
        "Custom",
        "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$Barcode;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$CornersOnly;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$Custom;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$GenericFront;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$Passport;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay$Rectangle;",
        "government-id_release"
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
    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;-><init>()V

    return-void
.end method
