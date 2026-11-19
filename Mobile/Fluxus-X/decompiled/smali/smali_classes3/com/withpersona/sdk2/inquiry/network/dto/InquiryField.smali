.class public abstract Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$BooleanField;,
        Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$ChoicesField;,
        Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$Companion;,
        Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$DateField;,
        Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$DatetimeField;,
        Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$FloatField;,
        Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$IntegerField;,
        Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$MultiChoicesField;,
        Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$StringField;,
        Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$Unknown;,
        Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$UnknownAdapter;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u0000 \u00082\u00020\u0001:\u000b\u0008\t\n\u000b\u000c\r\u000e\u000f\u0010\u0011\u0012B\u0011\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u0082\u0001\t\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;",
        "Landroid/os/Parcelable;",
        "type",
        "",
        "<init>",
        "(Ljava/lang/String;)V",
        "getType",
        "()Ljava/lang/String;",
        "Companion",
        "StringField",
        "IntegerField",
        "BooleanField",
        "FloatField",
        "DateField",
        "DatetimeField",
        "ChoicesField",
        "MultiChoicesField",
        "Unknown",
        "UnknownAdapter",
        "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$BooleanField;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$ChoicesField;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$DateField;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$DatetimeField;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$FloatField;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$IntegerField;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$MultiChoicesField;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$StringField;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$Unknown;",
        "network-inquiry_release"
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
.field public static final Companion:Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final type:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;->Companion:Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;->type:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public getType()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;->type:Ljava/lang/String;

    return-object v0
.end method
