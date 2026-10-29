.class public interface abstract Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$ClassificationFailedResponse;,
        Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$a;,
        Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdAcceptedResponse;,
        Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdClassesForCountry;,
        Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdRejectedResponse;,
        Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$Unknown;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008v\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\u0008\u0082\u0001\u0004\t\n\u000b\u000c\u00a8\u0006\r\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse;",
        "Landroid/os/Parcelable;",
        "Ho",
        "a",
        "IdAcceptedResponse",
        "ClassificationFailedResponse",
        "IdRejectedResponse",
        "Unknown",
        "IdClassesForCountry",
        "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$ClassificationFailedResponse;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdAcceptedResponse;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdRejectedResponse;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$Unknown;",
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


# static fields
.field public static final Ho:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$a;->a:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$a;

    sput-object v0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse;->Ho:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$a;

    return-void
.end method
