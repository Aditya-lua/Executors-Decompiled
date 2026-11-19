.class public final enum Lcom/google/android/gms/internal/play_billing/z7;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/play_billing/v4;


# static fields
.field public static final enum b:Lcom/google/android/gms/internal/play_billing/z7;

.field public static final enum c:Lcom/google/android/gms/internal/play_billing/z7;

.field public static final enum d:Lcom/google/android/gms/internal/play_billing/z7;

.field public static final enum e:Lcom/google/android/gms/internal/play_billing/z7;

.field public static final enum f:Lcom/google/android/gms/internal/play_billing/z7;

.field public static final enum g:Lcom/google/android/gms/internal/play_billing/z7;

.field public static final synthetic h:[Lcom/google/android/gms/internal/play_billing/z7;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/google/android/gms/internal/play_billing/z7;

    const-string v1, "BROADCAST_ACTION_UNSPECIFIED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/play_billing/z7;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/play_billing/z7;->b:Lcom/google/android/gms/internal/play_billing/z7;

    new-instance v1, Lcom/google/android/gms/internal/play_billing/z7;

    const-string v2, "PURCHASES_UPDATED_ACTION"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Lcom/google/android/gms/internal/play_billing/z7;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/google/android/gms/internal/play_billing/z7;->c:Lcom/google/android/gms/internal/play_billing/z7;

    new-instance v2, Lcom/google/android/gms/internal/play_billing/z7;

    const-string v3, "LOCAL_PURCHASES_UPDATED_ACTION"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4}, Lcom/google/android/gms/internal/play_billing/z7;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lcom/google/android/gms/internal/play_billing/z7;->d:Lcom/google/android/gms/internal/play_billing/z7;

    new-instance v3, Lcom/google/android/gms/internal/play_billing/z7;

    const-string v4, "ALTERNATIVE_BILLING_ACTION"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5, v5}, Lcom/google/android/gms/internal/play_billing/z7;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/google/android/gms/internal/play_billing/z7;->e:Lcom/google/android/gms/internal/play_billing/z7;

    new-instance v4, Lcom/google/android/gms/internal/play_billing/z7;

    const-string v5, "IN_APP_BILLING_RESULT_UPDATE_ACTION"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6, v6}, Lcom/google/android/gms/internal/play_billing/z7;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lcom/google/android/gms/internal/play_billing/z7;->f:Lcom/google/android/gms/internal/play_billing/z7;

    new-instance v5, Lcom/google/android/gms/internal/play_billing/z7;

    const-string v6, "PLAY_BILLING_ACTIVITY_CREATED_ACTION"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7, v7}, Lcom/google/android/gms/internal/play_billing/z7;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lcom/google/android/gms/internal/play_billing/z7;->g:Lcom/google/android/gms/internal/play_billing/z7;

    filled-new-array/range {v0 .. v5}, [Lcom/google/android/gms/internal/play_billing/z7;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/play_billing/z7;->h:[Lcom/google/android/gms/internal/play_billing/z7;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/google/android/gms/internal/play_billing/z7;->a:I

    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/play_billing/z7;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/z7;->h:[Lcom/google/android/gms/internal/play_billing/z7;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/play_billing/z7;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/play_billing/z7;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/play_billing/z7;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zza()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/play_billing/z7;->a:I

    return v0
.end method
