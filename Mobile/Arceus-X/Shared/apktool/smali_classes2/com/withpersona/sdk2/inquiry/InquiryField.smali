.class public abstract Lcom/withpersona/sdk2/inquiry/InquiryField;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/InquiryField$BooleanField;,
        Lcom/withpersona/sdk2/inquiry/InquiryField$ChoicesField;,
        Lcom/withpersona/sdk2/inquiry/InquiryField$DateField;,
        Lcom/withpersona/sdk2/inquiry/InquiryField$DatetimeField;,
        Lcom/withpersona/sdk2/inquiry/InquiryField$FloatField;,
        Lcom/withpersona/sdk2/inquiry/InquiryField$IntegerField;,
        Lcom/withpersona/sdk2/inquiry/InquiryField$MultiChoicesField;,
        Lcom/withpersona/sdk2/inquiry/InquiryField$StringField;,
        Lcom/withpersona/sdk2/inquiry/InquiryField$UnknownField;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\u0008\t\n\u000b\u000cB\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/InquiryField;",
        "Landroid/os/Parcelable;",
        "<init>",
        "()V",
        "IntegerField",
        "BooleanField",
        "StringField",
        "FloatField",
        "DateField",
        "DatetimeField",
        "ChoicesField",
        "MultiChoicesField",
        "UnknownField",
        "Lcom/withpersona/sdk2/inquiry/InquiryField$BooleanField;",
        "Lcom/withpersona/sdk2/inquiry/InquiryField$ChoicesField;",
        "Lcom/withpersona/sdk2/inquiry/InquiryField$DateField;",
        "Lcom/withpersona/sdk2/inquiry/InquiryField$DatetimeField;",
        "Lcom/withpersona/sdk2/inquiry/InquiryField$FloatField;",
        "Lcom/withpersona/sdk2/inquiry/InquiryField$IntegerField;",
        "Lcom/withpersona/sdk2/inquiry/InquiryField$MultiChoicesField;",
        "Lcom/withpersona/sdk2/inquiry/InquiryField$StringField;",
        "Lcom/withpersona/sdk2/inquiry/InquiryField$UnknownField;",
        "inquiry-dynamic-feature_release"
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
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/InquiryField;-><init>()V

    return-void
.end method
