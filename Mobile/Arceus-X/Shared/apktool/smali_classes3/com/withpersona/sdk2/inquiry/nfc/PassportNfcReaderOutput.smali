.class public abstract Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput$Cancel;,
        Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput$Error;,
        Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput$a;,
        Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput$ReenterDetails;,
        Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput$ShowTroubleshootingTips;,
        Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput$Success;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\u0008\tB\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u0082\u0001\u0005\n\u000b\u000c\r\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;",
        "Landroid/os/Parcelable;",
        "<init>",
        "()V",
        "Success",
        "Cancel",
        "Error",
        "ShowTroubleshootingTips",
        "ReenterDetails",
        "a",
        "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput$Cancel;",
        "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput$Error;",
        "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput$ReenterDetails;",
        "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput$ShowTroubleshootingTips;",
        "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput$Success;",
        "nfc_release"
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
    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;-><init>()V

    return-void
.end method
