.class public final Lcom/google/android/gms/internal/play_billing/u7;
.super Lcom/google/android/gms/internal/play_billing/t4;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/play_billing/y5;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/play_billing/u7;


# instance fields
.field private zzd:I

.field private zze:I

.field private zzf:Ljava/lang/String;

.field private zzg:I

.field private zzh:Ljava/lang/String;

.field private zzi:I

.field private zzj:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/play_billing/u7;

    invoke-direct {v0}, Lcom/google/android/gms/internal/play_billing/u7;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/play_billing/u7;->zzb:Lcom/google/android/gms/internal/play_billing/u7;

    const-class v1, Lcom/google/android/gms/internal/play_billing/u7;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/play_billing/t4;->i(Ljava/lang/Class;Lcom/google/android/gms/internal/play_billing/t4;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/play_billing/t4;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/play_billing/u7;->zzf:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/play_billing/u7;->zzh:Ljava/lang/String;

    return-void
.end method

.method public static synthetic B(Lcom/google/android/gms/internal/play_billing/u7;I)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/play_billing/u7;->zzd:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/play_billing/u7;->zzd:I

    iput p1, p0, Lcom/google/android/gms/internal/play_billing/u7;->zze:I

    return-void
.end method

.method public static C()Lcom/google/android/gms/internal/play_billing/q7;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/u7;->zzb:Lcom/google/android/gms/internal/play_billing/u7;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/t4;->r()Lcom/google/android/gms/internal/play_billing/p4;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/q7;

    return-object v0
.end method

.method public static bridge synthetic D()Lcom/google/android/gms/internal/play_billing/u7;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/u7;->zzb:Lcom/google/android/gms/internal/play_billing/u7;

    return-object v0
.end method

.method public static synthetic E(Lcom/google/android/gms/internal/play_billing/u7;Ljava/lang/String;)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/play_billing/u7;->zzd:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/google/android/gms/internal/play_billing/u7;->zzd:I

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/u7;->zzh:Ljava/lang/String;

    return-void
.end method

.method public static synthetic F(Lcom/google/android/gms/internal/play_billing/u7;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/google/android/gms/internal/play_billing/u7;->zzd:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/google/android/gms/internal/play_billing/u7;->zzd:I

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/u7;->zzf:Ljava/lang/String;

    return-void
.end method

.method public static synthetic G(Lcom/google/android/gms/internal/play_billing/u7;I)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/play_billing/u7;->zzd:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Lcom/google/android/gms/internal/play_billing/u7;->zzd:I

    iput p1, p0, Lcom/google/android/gms/internal/play_billing/u7;->zzj:I

    return-void
.end method

.method public static synthetic H(Lcom/google/android/gms/internal/play_billing/u7;I)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/play_billing/u7;->zzd:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/google/android/gms/internal/play_billing/u7;->zzd:I

    iput p1, p0, Lcom/google/android/gms/internal/play_billing/u7;->zzi:I

    return-void
.end method

.method public static synthetic I(Lcom/google/android/gms/internal/play_billing/u7;Lcom/google/android/gms/internal/play_billing/s7;)V
    .locals 0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/s7;->zza()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/play_billing/u7;->zzg:I

    iget p1, p0, Lcom/google/android/gms/internal/play_billing/u7;->zzd:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, Lcom/google/android/gms/internal/play_billing/u7;->zzd:I

    return-void
.end method


# virtual methods
.method public final p(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
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

    sget-object p1, Lcom/google/android/gms/internal/play_billing/u7;->zzb:Lcom/google/android/gms/internal/play_billing/u7;

    return-object p1

    :cond_0
    throw p3

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/play_billing/q7;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/play_billing/q7;-><init>(Lcom/google/android/gms/internal/play_billing/t7;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/play_billing/u7;

    invoke-direct {p1}, Lcom/google/android/gms/internal/play_billing/u7;-><init>()V

    return-object p1

    :cond_3
    sget-object v4, Lcom/google/android/gms/internal/play_billing/r7;->a:Lcom/google/android/gms/internal/play_billing/w4;

    const-string v6, "zzi"

    const-string v7, "zzj"

    const-string v0, "zzd"

    const-string v1, "zze"

    const-string v2, "zzf"

    const-string v3, "zzg"

    const-string v5, "zzh"

    filled-new-array/range {v0 .. v7}, [Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lcom/google/android/gms/internal/play_billing/u7;->zzb:Lcom/google/android/gms/internal/play_billing/u7;

    const-string p3, "\u0004\u0006\u0000\u0001\u0001\u0008\u0006\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1008\u0001\u0004\u180c\u0002\u0005\u1008\u0003\u0007\u1004\u0004\u0008\u1004\u0005"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/play_billing/t4;->z(Lcom/google/android/gms/internal/play_billing/x5;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
