.class public final enum Lcom/google/firebase/analytics/FirebaseAnalytics$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/analytics/FirebaseAnalytics;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/firebase/analytics/FirebaseAnalytics$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/google/firebase/analytics/FirebaseAnalytics$b;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final enum b:Lcom/google/firebase/analytics/FirebaseAnalytics$b;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final enum c:Lcom/google/firebase/analytics/FirebaseAnalytics$b;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final enum d:Lcom/google/firebase/analytics/FirebaseAnalytics$b;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final synthetic e:[Lcom/google/firebase/analytics/FirebaseAnalytics$b;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/google/firebase/analytics/FirebaseAnalytics$b;

    const-string v1, "AD_STORAGE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/firebase/analytics/FirebaseAnalytics$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/firebase/analytics/FirebaseAnalytics$b;->a:Lcom/google/firebase/analytics/FirebaseAnalytics$b;

    new-instance v1, Lcom/google/firebase/analytics/FirebaseAnalytics$b;

    const-string v2, "ANALYTICS_STORAGE"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/google/firebase/analytics/FirebaseAnalytics$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/google/firebase/analytics/FirebaseAnalytics$b;->b:Lcom/google/firebase/analytics/FirebaseAnalytics$b;

    new-instance v2, Lcom/google/firebase/analytics/FirebaseAnalytics$b;

    const-string v3, "AD_USER_DATA"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lcom/google/firebase/analytics/FirebaseAnalytics$b;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lcom/google/firebase/analytics/FirebaseAnalytics$b;->c:Lcom/google/firebase/analytics/FirebaseAnalytics$b;

    new-instance v3, Lcom/google/firebase/analytics/FirebaseAnalytics$b;

    const-string v4, "AD_PERSONALIZATION"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Lcom/google/firebase/analytics/FirebaseAnalytics$b;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/google/firebase/analytics/FirebaseAnalytics$b;->d:Lcom/google/firebase/analytics/FirebaseAnalytics$b;

    filled-new-array {v0, v1, v2, v3}, [Lcom/google/firebase/analytics/FirebaseAnalytics$b;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/analytics/FirebaseAnalytics$b;->e:[Lcom/google/firebase/analytics/FirebaseAnalytics$b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/firebase/analytics/FirebaseAnalytics$b;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-class v0, Lcom/google/firebase/analytics/FirebaseAnalytics$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/firebase/analytics/FirebaseAnalytics$b;

    return-object p0
.end method

.method public static values()[Lcom/google/firebase/analytics/FirebaseAnalytics$b;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    sget-object v0, Lcom/google/firebase/analytics/FirebaseAnalytics$b;->e:[Lcom/google/firebase/analytics/FirebaseAnalytics$b;

    invoke-virtual {v0}, [Lcom/google/firebase/analytics/FirebaseAnalytics$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/firebase/analytics/FirebaseAnalytics$b;

    return-object v0
.end method
