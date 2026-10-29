.class public final enum Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0087\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0006\u0010\u0008\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tj\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;",
        "Landroid/os/Parcelable;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "REQUIRE",
        "OPTIONAL",
        "NONE",
        "describeContents",
        "",
        "writeToParcel",
        "",
        "dest",
        "Landroid/os/Parcel;",
        "flags",
        "Companion",
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

.annotation runtime Lum/i;
    generateAdapter = false
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lqt/a;

.field private static final synthetic $VALUES:[Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final Companion:Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final enum NONE:Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;

.field public static final enum OPTIONAL:Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;

.field public static final enum REQUIRE:Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;


# direct methods
.method private static final synthetic $values()[Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;
    .locals 3

    sget-object v0, Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;->REQUIRE:Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;

    sget-object v1, Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;->OPTIONAL:Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;

    sget-object v2, Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;->NONE:Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;

    filled-new-array {v0, v1, v2}, [Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;

    const-string v1, "REQUIRE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;->REQUIRE:Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;

    const-string v1, "OPTIONAL"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;->OPTIONAL:Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;

    const-string v1, "NONE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;->NONE:Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;->$values()[Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;

    move-result-object v0

    sput-object v0, Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;->$VALUES:[Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;->$ENTRIES:Lqt/a;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;->Companion:Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement$Companion;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement$Creator;

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement$Creator;-><init>()V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lqt/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lqt/a<",
            "Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;->$ENTRIES:Lqt/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;
    .locals 1

    const-class v0, Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;

    return-object p0
.end method

.method public static values()[Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;->$VALUES:[Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;

    return-object v0
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
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
