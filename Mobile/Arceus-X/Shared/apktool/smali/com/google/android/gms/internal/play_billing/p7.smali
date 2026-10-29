.class public final Lcom/google/android/gms/internal/play_billing/p7;
.super Lcom/google/android/gms/internal/play_billing/t4;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/play_billing/y5;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/play_billing/p7;


# instance fields
.field private zzd:I

.field private zze:I

.field private zzf:Ljava/lang/Object;

.field private zzg:I

.field private zzh:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/play_billing/p7;

    invoke-direct {v0}, Lcom/google/android/gms/internal/play_billing/p7;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/play_billing/p7;->zzb:Lcom/google/android/gms/internal/play_billing/p7;

    const-class v1, Lcom/google/android/gms/internal/play_billing/p7;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/play_billing/t4;->i(Ljava/lang/Class;Lcom/google/android/gms/internal/play_billing/t4;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/play_billing/t4;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/play_billing/p7;->zze:I

    return-void
.end method

.method public static synthetic B(Lcom/google/android/gms/internal/play_billing/p7;I)V
    .locals 0

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/google/android/gms/internal/play_billing/p7;->zzg:I

    iget p1, p0, Lcom/google/android/gms/internal/play_billing/p7;->zzd:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/play_billing/p7;->zzd:I

    return-void
.end method

.method public static C()Lcom/google/android/gms/internal/play_billing/n7;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/p7;->zzb:Lcom/google/android/gms/internal/play_billing/p7;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/t4;->r()Lcom/google/android/gms/internal/play_billing/p4;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/n7;

    return-object v0
.end method

.method public static bridge synthetic D()Lcom/google/android/gms/internal/play_billing/p7;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/p7;->zzb:Lcom/google/android/gms/internal/play_billing/p7;

    return-object v0
.end method

.method public static synthetic F(Lcom/google/android/gms/internal/play_billing/p7;Lcom/google/android/gms/internal/play_billing/z7;)V
    .locals 0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/z7;->zza()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/play_billing/p7;->zzh:I

    iget p1, p0, Lcom/google/android/gms/internal/play_billing/p7;->zzd:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Lcom/google/android/gms/internal/play_billing/p7;->zzd:I

    return-void
.end method

.method public static synthetic G(Lcom/google/android/gms/internal/play_billing/p7;Lcom/google/android/gms/internal/play_billing/o8;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/p7;->zzf:Ljava/lang/Object;

    const/4 p1, 0x2

    iput p1, p0, Lcom/google/android/gms/internal/play_billing/p7;->zze:I

    return-void
.end method

.method public static synthetic H(Lcom/google/android/gms/internal/play_billing/p7;Lcom/google/android/gms/internal/play_billing/u8;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/p7;->zzf:Ljava/lang/Object;

    const/4 p1, 0x4

    iput p1, p0, Lcom/google/android/gms/internal/play_billing/p7;->zze:I

    return-void
.end method

.method public static synthetic I(Lcom/google/android/gms/internal/play_billing/p7;Lcom/google/android/gms/internal/play_billing/p9;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/p7;->zzf:Ljava/lang/Object;

    const/4 p1, 0x3

    iput p1, p0, Lcom/google/android/gms/internal/play_billing/p7;->zze:I

    return-void
.end method


# virtual methods
.method public final E()Lcom/google/android/gms/internal/play_billing/u8;
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/play_billing/p7;->zze:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/p7;->zzf:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/play_billing/u8;

    return-object v0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/u8;->C()Lcom/google/android/gms/internal/play_billing/u8;

    move-result-object v0

    return-object v0
.end method

.method public final p(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

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

    sget-object p1, Lcom/google/android/gms/internal/play_billing/p7;->zzb:Lcom/google/android/gms/internal/play_billing/p7;

    return-object p1

    :cond_0
    throw p3

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/play_billing/n7;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/play_billing/n7;-><init>(Lcom/google/android/gms/internal/play_billing/o7;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/play_billing/p7;

    invoke-direct {p1}, Lcom/google/android/gms/internal/play_billing/p7;-><init>()V

    return-object p1

    :cond_3
    sget-object v4, Lcom/google/android/gms/internal/play_billing/m7;->a:Lcom/google/android/gms/internal/play_billing/w4;

    const-string v8, "zzh"

    sget-object v9, Lcom/google/android/gms/internal/play_billing/y7;->a:Lcom/google/android/gms/internal/play_billing/w4;

    const-string v0, "zzf"

    const-string v1, "zze"

    const-string v2, "zzd"

    const-string v3, "zzg"

    const-class v5, Lcom/google/android/gms/internal/play_billing/o8;

    const-class v6, Lcom/google/android/gms/internal/play_billing/p9;

    const-class v7, Lcom/google/android/gms/internal/play_billing/u8;

    filled-new-array/range {v0 .. v9}, [Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lcom/google/android/gms/internal/play_billing/p7;->zzb:Lcom/google/android/gms/internal/play_billing/p7;

    const-string p3, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u180c\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005\u180c\u0001"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/play_billing/t4;->z(Lcom/google/android/gms/internal/play_billing/x5;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
