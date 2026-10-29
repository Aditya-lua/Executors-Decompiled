.class public final enum Lnb/p8;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum b:Lnb/p8;

.field public static final enum c:Lnb/p8;

.field public static final enum d:Lnb/p8;

.field public static final enum e:Lnb/p8;

.field public static final synthetic f:[Lnb/p8;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lnb/p8;

    const-string v1, "AD_STORAGE"

    const/4 v2, 0x0

    const-string v3, "ad_storage"

    invoke-direct {v0, v1, v2, v3}, Lnb/p8;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lnb/p8;->b:Lnb/p8;

    new-instance v1, Lnb/p8;

    const-string v2, "ANALYTICS_STORAGE"

    const/4 v3, 0x1

    const-string v4, "analytics_storage"

    invoke-direct {v1, v2, v3, v4}, Lnb/p8;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lnb/p8;->c:Lnb/p8;

    new-instance v2, Lnb/p8;

    const-string v3, "AD_USER_DATA"

    const/4 v4, 0x2

    const-string v5, "ad_user_data"

    invoke-direct {v2, v3, v4, v5}, Lnb/p8;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lnb/p8;->d:Lnb/p8;

    new-instance v3, Lnb/p8;

    const-string v4, "AD_PERSONALIZATION"

    const/4 v5, 0x3

    const-string v6, "ad_personalization"

    invoke-direct {v3, v4, v5, v6}, Lnb/p8;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lnb/p8;->e:Lnb/p8;

    filled-new-array {v0, v1, v2, v3}, [Lnb/p8;

    move-result-object v0

    sput-object v0, Lnb/p8;->f:[Lnb/p8;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lnb/p8;->a:Ljava/lang/String;

    return-void
.end method

.method public static values()[Lnb/p8;
    .locals 1

    sget-object v0, Lnb/p8;->f:[Lnb/p8;

    invoke-virtual {v0}, [Lnb/p8;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnb/p8;

    return-object v0
.end method
