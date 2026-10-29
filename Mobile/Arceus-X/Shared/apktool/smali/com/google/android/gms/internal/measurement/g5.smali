.class public final Lcom/google/android/gms/internal/measurement/g5;
.super Lcom/google/android/gms/internal/measurement/gb;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/pc;


# static fields
.field private static final zzu:Lcom/google/android/gms/internal/measurement/g5;


# instance fields
.field private zzb:I

.field private zzd:J

.field private zze:Ljava/lang/String;

.field private zzf:I

.field private zzg:Lcom/google/android/gms/internal/measurement/pb;

.field private zzh:Lcom/google/android/gms/internal/measurement/pb;

.field private zzi:Lcom/google/android/gms/internal/measurement/pb;

.field private zzj:Ljava/lang/String;

.field private zzk:Z

.field private zzl:Lcom/google/android/gms/internal/measurement/pb;

.field private zzm:Lcom/google/android/gms/internal/measurement/pb;

.field private zzn:Ljava/lang/String;

.field private zzo:Ljava/lang/String;

.field private zzp:Lcom/google/android/gms/internal/measurement/a5;

.field private zzq:Lcom/google/android/gms/internal/measurement/k5;

.field private zzr:Lcom/google/android/gms/internal/measurement/q5;

.field private zzs:Lcom/google/android/gms/internal/measurement/m5;

.field private zzt:Lcom/google/android/gms/internal/measurement/i5;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/g5;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/g5;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/g5;->zzu:Lcom/google/android/gms/internal/measurement/g5;

    const-class v1, Lcom/google/android/gms/internal/measurement/g5;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/measurement/gb;->t(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/gb;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/gb;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/g5;->zze:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/gb;->A()Lcom/google/android/gms/internal/measurement/pb;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/measurement/g5;->zzg:Lcom/google/android/gms/internal/measurement/pb;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/gb;->A()Lcom/google/android/gms/internal/measurement/pb;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/measurement/g5;->zzh:Lcom/google/android/gms/internal/measurement/pb;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/gb;->A()Lcom/google/android/gms/internal/measurement/pb;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/measurement/g5;->zzi:Lcom/google/android/gms/internal/measurement/pb;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/g5;->zzj:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/gb;->A()Lcom/google/android/gms/internal/measurement/pb;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/measurement/g5;->zzl:Lcom/google/android/gms/internal/measurement/pb;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/gb;->A()Lcom/google/android/gms/internal/measurement/pb;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/measurement/g5;->zzm:Lcom/google/android/gms/internal/measurement/pb;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/g5;->zzn:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/g5;->zzo:Ljava/lang/String;

    return-void
.end method

.method public static X()Lcom/google/android/gms/internal/measurement/f5;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/g5;->zzu:Lcom/google/android/gms/internal/measurement/g5;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/gb;->p()Lcom/google/android/gms/internal/measurement/cb;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/f5;

    return-object v0
.end method

.method public static Y()Lcom/google/android/gms/internal/measurement/g5;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/g5;->zzu:Lcom/google/android/gms/internal/measurement/g5;

    return-object v0
.end method

.method public static synthetic c0()Lcom/google/android/gms/internal/measurement/g5;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/g5;->zzu:Lcom/google/android/gms/internal/measurement/g5;

    return-object v0
.end method


# virtual methods
.method public final E(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    add-int/lit8 v0, p1, -0x1

    if-eqz v0, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    const/4 v2, 0x0

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/measurement/g5;->zzu:Lcom/google/android/gms/internal/measurement/g5;

    return-object v0

    :cond_0
    throw v2

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/measurement/f5;

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/measurement/f5;-><init>([B)V

    return-object v0

    :cond_2
    new-instance v0, Lcom/google/android/gms/internal/measurement/g5;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/g5;-><init>()V

    return-object v0

    :cond_3
    const-string v22, "zzs"

    const-string v23, "zzt"

    const-string v1, "zzb"

    const-string v2, "zzd"

    const-string v3, "zze"

    const-string v4, "zzf"

    const-string v5, "zzg"

    const-class v6, Lcom/google/android/gms/internal/measurement/o5;

    const-string v7, "zzh"

    const-class v8, Lcom/google/android/gms/internal/measurement/e5;

    const-string v9, "zzi"

    const-class v10, Lcom/google/android/gms/internal/measurement/x3;

    const-string v11, "zzj"

    const-string v12, "zzk"

    const-string v13, "zzl"

    const-class v14, Lcom/google/android/gms/internal/measurement/y7;

    const-string v15, "zzm"

    const-class v16, Lcom/google/android/gms/internal/measurement/c5;

    const-string v17, "zzn"

    const-string v18, "zzo"

    const-string v19, "zzp"

    const-string v20, "zzq"

    const-string v21, "zzr"

    filled-new-array/range {v1 .. v23}, [Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/measurement/g5;->zzu:Lcom/google/android/gms/internal/measurement/g5;

    const-string v2, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001\u1002\u0000\u0002\u1008\u0001\u0003\u1004\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u1008\u0003\u0008\u1007\u0004\t\u001b\n\u001b\u000b\u1008\u0005\u000e\u1008\u0006\u000f\u1009\u0007\u0010\u1009\u0008\u0011\u1009\t\u0012\u1009\n\u0013\u1009\u000b"

    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/measurement/gb;->v(Lcom/google/android/gms/internal/measurement/oc;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_4
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    return-object v0
.end method

.method public final F()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/measurement/g5;->zzb:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final G()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/measurement/g5;->zzd:J

    return-wide v0
.end method

.method public final H()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/g5;->zzb:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final J()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/g5;->zze:Ljava/lang/String;

    return-object v0
.end method

.method public final K()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/g5;->zzg:Lcom/google/android/gms/internal/measurement/pb;

    return-object v0
.end method

.method public final M()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/g5;->zzh:Lcom/google/android/gms/internal/measurement/pb;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final N(I)Lcom/google/android/gms/internal/measurement/e5;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/g5;->zzh:Lcom/google/android/gms/internal/measurement/pb;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/e5;

    return-object p1
.end method

.method public final O()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/g5;->zzi:Lcom/google/android/gms/internal/measurement/pb;

    return-object v0
.end method

.method public final P()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/g5;->zzl:Lcom/google/android/gms/internal/measurement/pb;

    return-object v0
.end method

.method public final Q()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/g5;->zzl:Lcom/google/android/gms/internal/measurement/pb;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final R()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/g5;->zzm:Lcom/google/android/gms/internal/measurement/pb;

    return-object v0
.end method

.method public final S()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/g5;->zzn:Ljava/lang/String;

    return-object v0
.end method

.method public final T()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/g5;->zzb:I

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final U()Lcom/google/android/gms/internal/measurement/a5;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/g5;->zzp:Lcom/google/android/gms/internal/measurement/a5;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/a5;->N()Lcom/google/android/gms/internal/measurement/a5;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final V()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/g5;->zzb:I

    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final W()Lcom/google/android/gms/internal/measurement/q5;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/g5;->zzr:Lcom/google/android/gms/internal/measurement/q5;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/q5;->K()Lcom/google/android/gms/internal/measurement/q5;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final synthetic Z(ILcom/google/android/gms/internal/measurement/e5;)V
    .locals 2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/g5;->zzh:Lcom/google/android/gms/internal/measurement/pb;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/pb;->zza()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/gb;->B(Lcom/google/android/gms/internal/measurement/pb;)Lcom/google/android/gms/internal/measurement/pb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/g5;->zzh:Lcom/google/android/gms/internal/measurement/pb;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/g5;->zzh:Lcom/google/android/gms/internal/measurement/pb;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final synthetic a0()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/gb;->A()Lcom/google/android/gms/internal/measurement/pb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/g5;->zzi:Lcom/google/android/gms/internal/measurement/pb;

    return-void
.end method

.method public final synthetic b0()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/gb;->A()Lcom/google/android/gms/internal/measurement/pb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/g5;->zzl:Lcom/google/android/gms/internal/measurement/pb;

    return-void
.end method
