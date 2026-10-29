.class public final enum Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0087\u0081\u0002\u0018\u0000 \u00062\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "TOP",
        "BOTTOM",
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

.field private static final synthetic $VALUES:[Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;

.field public static final enum BOTTOM:Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;

.field public static final Companion:Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final enum TOP:Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;


# direct methods
.method private static final synthetic $values()[Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;
    .locals 2

    sget-object v0, Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;->TOP:Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;

    sget-object v1, Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;->BOTTOM:Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;

    filled-new-array {v0, v1}, [Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;

    const-string v1, "TOP"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;->TOP:Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;

    const-string v1, "BOTTOM"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;->BOTTOM:Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;->$values()[Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;

    move-result-object v0

    sput-object v0, Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;->$VALUES:[Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;->$ENTRIES:Lqt/a;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;->Companion:Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition$Companion;

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
            "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;->$ENTRIES:Lqt/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;
    .locals 1

    const-class v0, Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;

    return-object p0
.end method

.method public static values()[Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;->$VALUES:[Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;

    return-object v0
.end method
