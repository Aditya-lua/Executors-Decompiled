.class public final Lcom/google/android/gms/internal/play_billing/p9;
.super Lcom/google/android/gms/internal/play_billing/t4;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/play_billing/y5;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/play_billing/p9;


# instance fields
.field private zzd:I

.field private zze:I

.field private zzf:Z

.field private zzg:J

.field private zzh:Z

.field private zzi:I

.field private zzj:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/play_billing/p9;

    invoke-direct {v0}, Lcom/google/android/gms/internal/play_billing/p9;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/play_billing/p9;->zzb:Lcom/google/android/gms/internal/play_billing/p9;

    const-class v1, Lcom/google/android/gms/internal/play_billing/p9;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/play_billing/t4;->i(Ljava/lang/Class;Lcom/google/android/gms/internal/play_billing/t4;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/play_billing/t4;-><init>()V

    return-void
.end method

.method public static B()Lcom/google/android/gms/internal/play_billing/n9;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/p9;->zzb:Lcom/google/android/gms/internal/play_billing/p9;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/t4;->r()Lcom/google/android/gms/internal/play_billing/p4;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/n9;

    return-object v0
.end method

.method public static bridge synthetic C()Lcom/google/android/gms/internal/play_billing/p9;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/p9;->zzb:Lcom/google/android/gms/internal/play_billing/p9;

    return-object v0
.end method

.method public static synthetic D(Lcom/google/android/gms/internal/play_billing/p9;Z)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/play_billing/p9;->zzd:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/google/android/gms/internal/play_billing/p9;->zzd:I

    iput-boolean p1, p0, Lcom/google/android/gms/internal/play_billing/p9;->zzh:Z

    return-void
.end method

.method public static synthetic E(Lcom/google/android/gms/internal/play_billing/p9;I)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/play_billing/p9;->zzd:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/google/android/gms/internal/play_billing/p9;->zzd:I

    iput p1, p0, Lcom/google/android/gms/internal/play_billing/p9;->zzi:I

    return-void
.end method

.method public static synthetic F(Lcom/google/android/gms/internal/play_billing/p9;J)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/play_billing/p9;->zzd:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/google/android/gms/internal/play_billing/p9;->zzd:I

    iput-wide p1, p0, Lcom/google/android/gms/internal/play_billing/p9;->zzg:J

    return-void
.end method

.method public static synthetic G(Lcom/google/android/gms/internal/play_billing/p9;I)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/play_billing/p9;->zzd:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Lcom/google/android/gms/internal/play_billing/p9;->zzd:I

    iput p1, p0, Lcom/google/android/gms/internal/play_billing/p9;->zzj:I

    return-void
.end method

.method public static synthetic H(Lcom/google/android/gms/internal/play_billing/p9;Z)V
    .locals 0

    iget p1, p0, Lcom/google/android/gms/internal/play_billing/p9;->zzd:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Lcom/google/android/gms/internal/play_billing/p9;->zzd:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/play_billing/p9;->zzf:Z

    return-void
.end method


# virtual methods
.method public final p(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

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

    sget-object p1, Lcom/google/android/gms/internal/play_billing/p9;->zzb:Lcom/google/android/gms/internal/play_billing/p9;

    return-object p1

    :cond_0
    throw p3

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/play_billing/n9;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/play_billing/n9;-><init>(Lcom/google/android/gms/internal/play_billing/o9;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/play_billing/p9;

    invoke-direct {p1}, Lcom/google/android/gms/internal/play_billing/p9;-><init>()V

    return-object p1

    :cond_3
    const-string v5, "zzi"

    const-string v6, "zzj"

    const-string v0, "zzd"

    const-string v1, "zze"

    const-string v2, "zzf"

    const-string v3, "zzg"

    const-string v4, "zzh"

    filled-new-array/range {v0 .. v6}, [Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lcom/google/android/gms/internal/play_billing/p9;->zzb:Lcom/google/android/gms/internal/play_billing/p9;

    const-string p3, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1007\u0001\u0003\u1002\u0002\u0004\u1007\u0003\u0005\u1004\u0004\u0006\u1004\u0005"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/play_billing/t4;->z(Lcom/google/android/gms/internal/play_billing/x5;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
