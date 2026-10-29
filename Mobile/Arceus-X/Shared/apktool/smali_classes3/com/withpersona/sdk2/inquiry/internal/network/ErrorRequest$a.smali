.class public final enum Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0087\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Camera",
        "Network",
        "Permissions",
        "Nfc",
        "Other",
        "inquiry-internal_release"
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

.field private static final synthetic $VALUES:[Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;

.field public static final enum Camera:Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;
    .annotation runtime Lum/g;
        name = "camera"
    .end annotation
.end field

.field public static final enum Network:Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;
    .annotation runtime Lum/g;
        name = "network"
    .end annotation
.end field

.field public static final enum Nfc:Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;
    .annotation runtime Lum/g;
        name = "nfc"
    .end annotation
.end field

.field public static final enum Other:Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;
    .annotation runtime Lum/g;
        name = "other"
    .end annotation
.end field

.field public static final enum Permissions:Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;
    .annotation runtime Lum/g;
        name = "permissions"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;

    const-string v1, "Camera"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;->Camera:Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;

    const-string v1, "Network"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;->Network:Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;

    const-string v1, "Permissions"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;->Permissions:Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;

    const-string v1, "Nfc"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;->Nfc:Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;

    const-string v1, "Other"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;->Other:Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;->a()[Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;

    move-result-object v0

    sput-object v0, Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;->$VALUES:[Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;->$ENTRIES:Lqt/a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static final synthetic a()[Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;
    .locals 5

    sget-object v0, Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;->Camera:Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;

    sget-object v1, Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;->Network:Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;

    sget-object v2, Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;->Permissions:Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;

    sget-object v3, Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;->Nfc:Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;

    sget-object v4, Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;->Other:Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;
    .locals 1

    const-class v0, Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;

    return-object p0
.end method

.method public static values()[Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;->$VALUES:[Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;

    return-object v0
.end method
