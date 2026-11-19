.class public final Lcom/google/android/gms/internal/measurement/w6;
.super Lcom/google/android/gms/internal/measurement/kb;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/tc;


# static fields
.field private static final zzj:Lcom/google/android/gms/internal/measurement/w6;


# instance fields
.field private zzb:I

.field private zzd:Ljava/lang/String;

.field private zze:Ljava/lang/String;

.field private zzf:J

.field private zzg:F

.field private zzh:D

.field private zzi:Lcom/google/android/gms/internal/measurement/tb;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/w6;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/w6;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/w6;->zzj:Lcom/google/android/gms/internal/measurement/w6;

    const-class v1, Lcom/google/android/gms/internal/measurement/w6;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/measurement/kb;->t(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/kb;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/kb;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/w6;->zzd:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/w6;->zze:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/kb;->z()Lcom/google/android/gms/internal/measurement/tb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/w6;->zzi:Lcom/google/android/gms/internal/measurement/tb;

    return-void
.end method

.method public static S()Lcom/google/android/gms/internal/measurement/v6;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/w6;->zzj:Lcom/google/android/gms/internal/measurement/w6;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/kb;->p()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/v6;

    return-object v0
.end method

.method public static synthetic e0()Lcom/google/android/gms/internal/measurement/w6;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/w6;->zzj:Lcom/google/android/gms/internal/measurement/w6;

    return-object v0
.end method


# virtual methods
.method public final E(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

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

    sget-object p1, Lcom/google/android/gms/internal/measurement/w6;->zzj:Lcom/google/android/gms/internal/measurement/w6;

    return-object p1

    :cond_0
    throw p3

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/measurement/v6;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/measurement/v6;-><init>([B)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/measurement/w6;

    invoke-direct {p1}, Lcom/google/android/gms/internal/measurement/w6;-><init>()V

    return-object p1

    :cond_3
    const-string v6, "zzi"

    const-class v7, Lcom/google/android/gms/internal/measurement/w6;

    const-string v0, "zzb"

    const-string v1, "zzd"

    const-string v2, "zze"

    const-string v3, "zzf"

    const-string v4, "zzg"

    const-string v5, "zzh"

    filled-new-array/range {v0 .. v7}, [Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lcom/google/android/gms/internal/measurement/w6;->zzj:Lcom/google/android/gms/internal/measurement/w6;

    const-string p3, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1002\u0002\u0004\u1001\u0003\u0005\u1000\u0004\u0006\u001b"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/measurement/kb;->u(Lcom/google/android/gms/internal/measurement/sc;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

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

    iget v0, p0, Lcom/google/android/gms/internal/measurement/w6;->zzb:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final G()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/w6;->zzd:Ljava/lang/String;

    return-object v0
.end method

.method public final H()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/w6;->zzb:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final I()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/w6;->zze:Ljava/lang/String;

    return-object v0
.end method

.method public final J()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/w6;->zzb:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final K()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/measurement/w6;->zzf:J

    return-wide v0
.end method

.method public final L()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/w6;->zzb:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final M()F
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/w6;->zzg:F

    return v0
.end method

.method public final N()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/w6;->zzb:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final O()D
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/measurement/w6;->zzh:D

    return-wide v0
.end method

.method public final P()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/w6;->zzi:Lcom/google/android/gms/internal/measurement/tb;

    return-object v0
.end method

.method public final R()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/w6;->zzi:Lcom/google/android/gms/internal/measurement/tb;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final synthetic U(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/google/android/gms/internal/measurement/w6;->zzb:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/measurement/w6;->zzb:I

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/w6;->zzd:Ljava/lang/String;

    return-void
.end method

.method public final synthetic V(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/google/android/gms/internal/measurement/w6;->zzb:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/google/android/gms/internal/measurement/w6;->zzb:I

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/w6;->zze:Ljava/lang/String;

    return-void
.end method

.method public final synthetic W()V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/w6;->zzb:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/google/android/gms/internal/measurement/w6;->zzb:I

    sget-object v0, Lcom/google/android/gms/internal/measurement/w6;->zzj:Lcom/google/android/gms/internal/measurement/w6;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/w6;->zze:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/w6;->zze:Ljava/lang/String;

    return-void
.end method

.method public final synthetic X(J)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/w6;->zzb:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/google/android/gms/internal/measurement/w6;->zzb:I

    iput-wide p1, p0, Lcom/google/android/gms/internal/measurement/w6;->zzf:J

    return-void
.end method

.method public final synthetic Y()V
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/measurement/w6;->zzb:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Lcom/google/android/gms/internal/measurement/w6;->zzb:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/measurement/w6;->zzf:J

    return-void
.end method

.method public final synthetic Z(D)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/w6;->zzb:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/google/android/gms/internal/measurement/w6;->zzb:I

    iput-wide p1, p0, Lcom/google/android/gms/internal/measurement/w6;->zzh:D

    return-void
.end method

.method public final synthetic a0()V
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/measurement/w6;->zzb:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Lcom/google/android/gms/internal/measurement/w6;->zzb:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/measurement/w6;->zzh:D

    return-void
.end method

.method public final synthetic b0(Lcom/google/android/gms/internal/measurement/w6;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/w6;->f0()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/w6;->zzi:Lcom/google/android/gms/internal/measurement/tb;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final synthetic c0(Ljava/lang/Iterable;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/w6;->f0()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/w6;->zzi:Lcom/google/android/gms/internal/measurement/tb;

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/measurement/v9;->h(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method public final synthetic d0()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/kb;->z()Lcom/google/android/gms/internal/measurement/tb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/w6;->zzi:Lcom/google/android/gms/internal/measurement/tb;

    return-void
.end method

.method public final f0()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/w6;->zzi:Lcom/google/android/gms/internal/measurement/tb;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/tb;->zza()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/kb;->B(Lcom/google/android/gms/internal/measurement/tb;)Lcom/google/android/gms/internal/measurement/tb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/w6;->zzi:Lcom/google/android/gms/internal/measurement/tb;

    :cond_0
    return-void
.end method
