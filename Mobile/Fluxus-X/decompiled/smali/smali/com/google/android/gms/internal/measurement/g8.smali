.class public final Lcom/google/android/gms/internal/measurement/g8;
.super Lcom/google/android/gms/internal/measurement/kb;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/tc;


# static fields
.field private static final zzj:Lcom/google/android/gms/internal/measurement/g8;


# instance fields
.field private zzb:I

.field private zzd:I

.field private zze:Lcom/google/android/gms/internal/measurement/tb;

.field private zzf:Ljava/lang/String;

.field private zzg:Ljava/lang/String;

.field private zzh:Z

.field private zzi:D


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/g8;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/g8;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/g8;->zzj:Lcom/google/android/gms/internal/measurement/g8;

    const-class v1, Lcom/google/android/gms/internal/measurement/g8;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/measurement/kb;->t(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/kb;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/kb;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/kb;->z()Lcom/google/android/gms/internal/measurement/tb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/g8;->zze:Lcom/google/android/gms/internal/measurement/tb;

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/g8;->zzf:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/g8;->zzg:Ljava/lang/String;

    return-void
.end method

.method public static synthetic N()Lcom/google/android/gms/internal/measurement/g8;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/g8;->zzj:Lcom/google/android/gms/internal/measurement/g8;

    return-object v0
.end method


# virtual methods
.method public final E(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

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

    sget-object p1, Lcom/google/android/gms/internal/measurement/g8;->zzj:Lcom/google/android/gms/internal/measurement/g8;

    return-object p1

    :cond_0
    throw p3

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/measurement/d8;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/measurement/d8;-><init>([B)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/measurement/g8;

    invoke-direct {p1}, Lcom/google/android/gms/internal/measurement/g8;-><init>()V

    return-object p1

    :cond_3
    sget-object v2, Lcom/google/android/gms/internal/measurement/e8;->a:Lcom/google/android/gms/internal/measurement/pb;

    const-string v7, "zzh"

    const-string v8, "zzi"

    const-string v0, "zzb"

    const-string v1, "zzd"

    const-string v3, "zze"

    const-class v4, Lcom/google/android/gms/internal/measurement/g8;

    const-string v5, "zzf"

    const-string v6, "zzg"

    filled-new-array/range {v0 .. v8}, [Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lcom/google/android/gms/internal/measurement/g8;->zzj:Lcom/google/android/gms/internal/measurement/g8;

    const-string p3, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u180c\u0000\u0002\u001b\u0003\u1008\u0001\u0004\u1008\u0002\u0005\u1007\u0003\u0006\u1000\u0004"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/measurement/kb;->u(Lcom/google/android/gms/internal/measurement/sc;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final F()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/g8;->zze:Lcom/google/android/gms/internal/measurement/tb;

    return-object v0
.end method

.method public final G()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/g8;->zzf:Ljava/lang/String;

    return-object v0
.end method

.method public final H()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/g8;->zzb:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final I()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/g8;->zzg:Ljava/lang/String;

    return-object v0
.end method

.method public final J()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/g8;->zzb:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final K()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/g8;->zzh:Z

    return v0
.end method

.method public final L()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/g8;->zzb:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final M()D
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/measurement/g8;->zzi:D

    return-wide v0
.end method

.method public final O()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/g8;->zzd:I

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/f8;->a(I)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method
