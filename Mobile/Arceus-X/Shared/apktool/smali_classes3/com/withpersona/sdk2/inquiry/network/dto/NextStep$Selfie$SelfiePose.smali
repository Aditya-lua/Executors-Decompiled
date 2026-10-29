.class public final enum Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "SelfiePose"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0087\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "CENTER",
        "LEFT",
        "RIGHT",
        "UP",
        "DOWN",
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

.field private static final synthetic $VALUES:[Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;

.field public static final enum CENTER:Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;
    .annotation runtime Lum/g;
        name = "center"
    .end annotation
.end field

.field public static final enum DOWN:Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;
    .annotation runtime Lum/g;
        name = "down"
    .end annotation
.end field

.field public static final enum LEFT:Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;
    .annotation runtime Lum/g;
        name = "left"
    .end annotation
.end field

.field public static final enum RIGHT:Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;
    .annotation runtime Lum/g;
        name = "right"
    .end annotation
.end field

.field public static final enum UP:Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;
    .annotation runtime Lum/g;
        name = "up"
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;
    .locals 5

    sget-object v0, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;->CENTER:Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;

    sget-object v1, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;->LEFT:Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;

    sget-object v2, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;->RIGHT:Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;

    sget-object v3, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;->UP:Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;

    sget-object v4, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;->DOWN:Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;

    const-string v1, "CENTER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;->CENTER:Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;

    const-string v1, "LEFT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;->LEFT:Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;

    const-string v1, "RIGHT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;->RIGHT:Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;

    const-string v1, "UP"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;->UP:Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;

    const-string v1, "DOWN"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;->DOWN:Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;->$values()[Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;

    move-result-object v0

    sput-object v0, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;->$VALUES:[Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;->$ENTRIES:Lqt/a;

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
            "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;->$ENTRIES:Lqt/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;
    .locals 1

    const-class v0, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;

    return-object p0
.end method

.method public static values()[Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;->$VALUES:[Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;

    return-object v0
.end method
