.class public final enum Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "ShowingIntegration",
        "Error",
        "Complete",
        "Paused",
        "tracking-events_release"
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
.field private static final synthetic $ENTRIES:Lqt/a;

.field private static final synthetic $VALUES:[Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;

.field public static final enum Complete:Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;
    .annotation runtime Lum/g;
        name = "complete"
    .end annotation
.end field

.field public static final enum Error:Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;
    .annotation runtime Lum/g;
        name = "error"
    .end annotation
.end field

.field public static final enum Paused:Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;
    .annotation runtime Lum/g;
        name = "paused"
    .end annotation
.end field

.field public static final enum ShowingIntegration:Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;
    .annotation runtime Lum/g;
        name = "showing_integration"
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;
    .locals 4

    sget-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;->ShowingIntegration:Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;

    sget-object v1, Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;->Error:Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;

    sget-object v2, Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;->Complete:Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;

    sget-object v3, Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;->Paused:Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;

    filled-new-array {v0, v1, v2, v3}, [Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;

    const-string v1, "ShowingIntegration"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;->ShowingIntegration:Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;

    const-string v1, "Error"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;->Error:Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;

    const-string v1, "Complete"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;->Complete:Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;

    const-string v1, "Paused"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;->Paused:Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;->$values()[Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;

    move-result-object v0

    sput-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;->$VALUES:[Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;->$ENTRIES:Lqt/a;

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
            "Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;->$ENTRIES:Lqt/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;
    .locals 1

    const-class v0, Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;

    return-object p0
.end method

.method public static values()[Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;->$VALUES:[Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationState;

    return-object v0
.end method
