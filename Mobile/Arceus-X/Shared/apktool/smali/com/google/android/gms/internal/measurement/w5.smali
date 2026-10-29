.class public final Lcom/google/android/gms/internal/measurement/w5;
.super Lcom/google/android/gms/internal/measurement/gb;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/pc;


# static fields
.field private static final zzn:Lcom/google/android/gms/internal/measurement/w5;


# instance fields
.field private zzb:I

.field private zzd:Ljava/lang/String;

.field private zze:Ljava/lang/String;

.field private zzf:Ljava/lang/String;

.field private zzg:J

.field private zzh:Ljava/lang/String;

.field private zzi:Ljava/lang/String;

.field private zzj:Ljava/lang/String;

.field private zzk:J

.field private zzl:Lcom/google/android/gms/internal/measurement/ic;

.field private zzm:Lcom/google/android/gms/internal/measurement/ic;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/w5;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/w5;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/w5;->zzn:Lcom/google/android/gms/internal/measurement/w5;

    const-class v1, Lcom/google/android/gms/internal/measurement/w5;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/measurement/gb;->t(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/gb;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/gb;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/ic;->a()Lcom/google/android/gms/internal/measurement/ic;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzl:Lcom/google/android/gms/internal/measurement/ic;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/ic;->a()Lcom/google/android/gms/internal/measurement/ic;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzm:Lcom/google/android/gms/internal/measurement/ic;

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzd:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zze:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzf:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzh:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzi:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzj:Ljava/lang/String;

    return-void
.end method

.method public static synthetic Q()Lcom/google/android/gms/internal/measurement/w5;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/w5;->zzn:Lcom/google/android/gms/internal/measurement/w5;

    return-object v0
.end method

.method public static h0()Lcom/google/android/gms/internal/measurement/s5;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/w5;->zzn:Lcom/google/android/gms/internal/measurement/w5;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/gb;->p()Lcom/google/android/gms/internal/measurement/cb;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/s5;

    return-object v0
.end method

.method public static i0()Lcom/google/android/gms/internal/measurement/w5;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/w5;->zzn:Lcom/google/android/gms/internal/measurement/w5;

    return-object v0
.end method


# virtual methods
.method public final E(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    add-int/lit8 p1, p1, -0x1

    if-eqz p1, :cond_4

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    const/4 v0, 0x4

    const/4 v1, 0x0

    if-eq p1, v0, :cond_1

    const/4 v0, 0x5

    if-ne p1, v0, :cond_0

    sget-object p1, Lcom/google/android/gms/internal/measurement/w5;->zzn:Lcom/google/android/gms/internal/measurement/w5;

    return-object p1

    :cond_0
    throw v1

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/measurement/s5;

    invoke-direct {p1, v1}, Lcom/google/android/gms/internal/measurement/s5;-><init>([B)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/measurement/w5;

    invoke-direct {p1}, Lcom/google/android/gms/internal/measurement/w5;-><init>()V

    return-object p1

    :cond_3
    sget-object v10, Lcom/google/android/gms/internal/measurement/t5;->a:Lcom/google/android/gms/internal/measurement/hc;

    const-string v11, "zzm"

    sget-object v12, Lcom/google/android/gms/internal/measurement/u5;->a:Lcom/google/android/gms/internal/measurement/hc;

    const-string v0, "zzb"

    const-string v1, "zzd"

    const-string v2, "zze"

    const-string v3, "zzf"

    const-string v4, "zzg"

    const-string v5, "zzh"

    const-string v6, "zzi"

    const-string v7, "zzj"

    const-string v8, "zzk"

    const-string v9, "zzl"

    filled-new-array/range {v0 .. v12}, [Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lcom/google/android/gms/internal/measurement/w5;->zzn:Lcom/google/android/gms/internal/measurement/w5;

    const-string v1, "\u0004\n\u0000\u0001\u0001\n\n\u0002\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1002\u0003\u0005\u1008\u0004\u0006\u1008\u0005\u0007\u1008\u0006\u0008\u1002\u0007\t2\n2"

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/measurement/gb;->v(Lcom/google/android/gms/internal/measurement/oc;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic F(Ljava/lang/String;)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzb:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzb:I

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/w5;->zzh:Ljava/lang/String;

    return-void
.end method

.method public final synthetic G()V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzb:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzb:I

    sget-object v0, Lcom/google/android/gms/internal/measurement/w5;->zzn:Lcom/google/android/gms/internal/measurement/w5;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/w5;->zzh:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzh:Ljava/lang/String;

    return-void
.end method

.method public final synthetic H(Ljava/lang/String;)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzb:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzb:I

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/w5;->zzi:Ljava/lang/String;

    return-void
.end method

.method public final synthetic J()V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzb:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzb:I

    sget-object v0, Lcom/google/android/gms/internal/measurement/w5;->zzn:Lcom/google/android/gms/internal/measurement/w5;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/w5;->zzi:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzi:Ljava/lang/String;

    return-void
.end method

.method public final synthetic K(Ljava/lang/String;)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzb:I

    or-int/lit8 v0, v0, 0x40

    iput v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzb:I

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/w5;->zzj:Ljava/lang/String;

    return-void
.end method

.method public final synthetic M()V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzb:I

    and-int/lit8 v0, v0, -0x41

    iput v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzb:I

    sget-object v0, Lcom/google/android/gms/internal/measurement/w5;->zzn:Lcom/google/android/gms/internal/measurement/w5;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/w5;->zzj:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzj:Ljava/lang/String;

    return-void
.end method

.method public final synthetic N(J)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzb:I

    or-int/lit16 v0, v0, 0x80

    iput v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzb:I

    iput-wide p1, p0, Lcom/google/android/gms/internal/measurement/w5;->zzk:J

    return-void
.end method

.method public final synthetic O()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzl:Lcom/google/android/gms/internal/measurement/ic;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/ic;->f()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzl:Lcom/google/android/gms/internal/measurement/ic;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/ic;->c()Lcom/google/android/gms/internal/measurement/ic;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzl:Lcom/google/android/gms/internal/measurement/ic;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzl:Lcom/google/android/gms/internal/measurement/ic;

    return-object v0
.end method

.method public final synthetic P()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzm:Lcom/google/android/gms/internal/measurement/ic;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/ic;->f()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzm:Lcom/google/android/gms/internal/measurement/ic;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/ic;->c()Lcom/google/android/gms/internal/measurement/ic;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzm:Lcom/google/android/gms/internal/measurement/ic;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzm:Lcom/google/android/gms/internal/measurement/ic;

    return-object v0
.end method

.method public final R()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzb:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final S()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzd:Ljava/lang/String;

    return-object v0
.end method

.method public final T()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzb:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final U()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zze:Ljava/lang/String;

    return-object v0
.end method

.method public final V()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzb:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final W()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzf:Ljava/lang/String;

    return-object v0
.end method

.method public final X()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzb:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final Y()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzg:J

    return-wide v0
.end method

.method public final Z()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzb:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final a0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzh:Ljava/lang/String;

    return-object v0
.end method

.method public final b0()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzb:I

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final c0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzi:Ljava/lang/String;

    return-object v0
.end method

.method public final d0()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzb:I

    and-int/lit8 v0, v0, 0x40

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final e0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzj:Ljava/lang/String;

    return-object v0
.end method

.method public final f0()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzb:I

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final g0()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzk:J

    return-wide v0
.end method

.method public final synthetic j0(Ljava/lang/String;)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzb:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzb:I

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/w5;->zzd:Ljava/lang/String;

    return-void
.end method

.method public final synthetic k0()V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzb:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzb:I

    sget-object v0, Lcom/google/android/gms/internal/measurement/w5;->zzn:Lcom/google/android/gms/internal/measurement/w5;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/w5;->zzd:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzd:Ljava/lang/String;

    return-void
.end method

.method public final synthetic l0(Ljava/lang/String;)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzb:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzb:I

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/w5;->zze:Ljava/lang/String;

    return-void
.end method

.method public final synthetic m0()V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzb:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzb:I

    sget-object v0, Lcom/google/android/gms/internal/measurement/w5;->zzn:Lcom/google/android/gms/internal/measurement/w5;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/w5;->zze:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zze:Ljava/lang/String;

    return-void
.end method

.method public final synthetic n0(Ljava/lang/String;)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzb:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzb:I

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/w5;->zzf:Ljava/lang/String;

    return-void
.end method

.method public final synthetic o0()V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzb:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzb:I

    sget-object v0, Lcom/google/android/gms/internal/measurement/w5;->zzn:Lcom/google/android/gms/internal/measurement/w5;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/w5;->zzf:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzf:Ljava/lang/String;

    return-void
.end method

.method public final synthetic p0(J)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzb:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/google/android/gms/internal/measurement/w5;->zzb:I

    iput-wide p1, p0, Lcom/google/android/gms/internal/measurement/w5;->zzg:J

    return-void
.end method
