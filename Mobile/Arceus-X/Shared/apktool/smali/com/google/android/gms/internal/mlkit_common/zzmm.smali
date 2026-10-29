.class public final enum Lcom/google/android/gms/internal/mlkit_common/zzmm;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_common/zzba;


# static fields
.field public static final enum zza:Lcom/google/android/gms/internal/mlkit_common/zzmm;

.field public static final enum zzb:Lcom/google/android/gms/internal/mlkit_common/zzmm;

.field private static final synthetic zzc:[Lcom/google/android/gms/internal/mlkit_common/zzmm;


# instance fields
.field private final zzd:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/mlkit_common/zzmm;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/mlkit_common/zzmm;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_common/zzmm;->zza:Lcom/google/android/gms/internal/mlkit_common/zzmm;

    new-instance v1, Lcom/google/android/gms/internal/mlkit_common/zzmm;

    const-string v2, "TRANSLATE"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Lcom/google/android/gms/internal/mlkit_common/zzmm;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/google/android/gms/internal/mlkit_common/zzmm;->zzb:Lcom/google/android/gms/internal/mlkit_common/zzmm;

    filled-new-array {v0, v1}, [Lcom/google/android/gms/internal/mlkit_common/zzmm;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_common/zzmm;->zzc:[Lcom/google/android/gms/internal/mlkit_common/zzmm;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/google/android/gms/internal/mlkit_common/zzmm;->zzd:I

    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/mlkit_common/zzmm;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/mlkit_common/zzmm;->zzc:[Lcom/google/android/gms/internal/mlkit_common/zzmm;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/mlkit_common/zzmm;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/mlkit_common/zzmm;

    return-object v0
.end method

.method public static zzb(I)Lcom/google/android/gms/internal/mlkit_common/zzmm;
    .locals 5

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_common/zzmm;->values()[Lcom/google/android/gms/internal/mlkit_common/zzmm;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    iget v4, v3, Lcom/google/android/gms/internal/mlkit_common/zzmm;->zzd:I

    if-ne v4, p0, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    sget-object p0, Lcom/google/android/gms/internal/mlkit_common/zzmm;->zza:Lcom/google/android/gms/internal/mlkit_common/zzmm;

    return-object p0
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzmm;->zzd:I

    return v0
.end method
