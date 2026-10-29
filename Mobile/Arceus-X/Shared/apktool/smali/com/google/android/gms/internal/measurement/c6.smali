.class public final Lcom/google/android/gms/internal/measurement/c6;
.super Lcom/google/android/gms/internal/measurement/gb;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/pc;


# static fields
.field private static final zzh:Lcom/google/android/gms/internal/measurement/c6;


# instance fields
.field private zzb:I

.field private zzd:I

.field private zze:Lcom/google/android/gms/internal/measurement/f7;

.field private zzf:Lcom/google/android/gms/internal/measurement/f7;

.field private zzg:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/c6;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/c6;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/c6;->zzh:Lcom/google/android/gms/internal/measurement/c6;

    const-class v1, Lcom/google/android/gms/internal/measurement/c6;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/measurement/gb;->t(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/gb;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/gb;-><init>()V

    return-void
.end method

.method public static O()Lcom/google/android/gms/internal/measurement/b6;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/c6;->zzh:Lcom/google/android/gms/internal/measurement/c6;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/gb;->p()Lcom/google/android/gms/internal/measurement/cb;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/b6;

    return-object v0
.end method

.method public static synthetic T()Lcom/google/android/gms/internal/measurement/c6;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/c6;->zzh:Lcom/google/android/gms/internal/measurement/c6;

    return-object v0
.end method


# virtual methods
.method public final E(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    add-int/lit8 p1, p1, -0x1

    if-eqz p1, :cond_4

    const/4 p2, 0x2

    if-eq p1, p2, :cond_3

    const/4 p2, 0x3

    if-eq p1, p2, :cond_2

    const/4 p2, 0x4

    const/4 p3, 0x0

    if-eq p1, p2, :cond_1

    const/4 p2, 0x5

    if-ne p1, p2, :cond_0

    sget-object p1, Lcom/google/android/gms/internal/measurement/c6;->zzh:Lcom/google/android/gms/internal/measurement/c6;

    return-object p1

    :cond_0
    throw p3

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/measurement/b6;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/measurement/b6;-><init>([B)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/measurement/c6;

    invoke-direct {p1}, Lcom/google/android/gms/internal/measurement/c6;-><init>()V

    return-object p1

    :cond_3
    const-string p1, "zzf"

    const-string p2, "zzg"

    const-string p3, "zzb"

    const-string v0, "zzd"

    const-string v1, "zze"

    filled-new-array {p3, v0, v1, p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lcom/google/android/gms/internal/measurement/c6;->zzh:Lcom/google/android/gms/internal/measurement/c6;

    const-string p3, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1007\u0003"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/measurement/gb;->v(Lcom/google/android/gms/internal/measurement/oc;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final F()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/measurement/c6;->zzb:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final G()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/c6;->zzd:I

    return v0
.end method

.method public final H()Lcom/google/android/gms/internal/measurement/f7;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/c6;->zze:Lcom/google/android/gms/internal/measurement/f7;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/f7;->Q()Lcom/google/android/gms/internal/measurement/f7;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final J()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/c6;->zzb:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final K()Lcom/google/android/gms/internal/measurement/f7;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/c6;->zzf:Lcom/google/android/gms/internal/measurement/f7;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/f7;->Q()Lcom/google/android/gms/internal/measurement/f7;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final M()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/c6;->zzb:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final N()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/c6;->zzg:Z

    return v0
.end method

.method public final synthetic P(I)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/c6;->zzb:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/measurement/c6;->zzb:I

    iput p1, p0, Lcom/google/android/gms/internal/measurement/c6;->zzd:I

    return-void
.end method

.method public final synthetic Q(Lcom/google/android/gms/internal/measurement/f7;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/c6;->zze:Lcom/google/android/gms/internal/measurement/f7;

    iget p1, p0, Lcom/google/android/gms/internal/measurement/c6;->zzb:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Lcom/google/android/gms/internal/measurement/c6;->zzb:I

    return-void
.end method

.method public final synthetic R(Lcom/google/android/gms/internal/measurement/f7;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/c6;->zzf:Lcom/google/android/gms/internal/measurement/f7;

    iget p1, p0, Lcom/google/android/gms/internal/measurement/c6;->zzb:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, Lcom/google/android/gms/internal/measurement/c6;->zzb:I

    return-void
.end method

.method public final synthetic S(Z)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/c6;->zzb:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/google/android/gms/internal/measurement/c6;->zzb:I

    iput-boolean p1, p0, Lcom/google/android/gms/internal/measurement/c6;->zzg:Z

    return-void
.end method
