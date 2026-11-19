.class public final Lcom/google/android/gms/internal/play_billing/i9;
.super Lcom/google/android/gms/internal/play_billing/t4;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/play_billing/y5;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/play_billing/i9;


# instance fields
.field private zzd:I

.field private zze:Lcom/google/android/gms/internal/play_billing/u7;

.field private zzf:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/play_billing/i9;

    invoke-direct {v0}, Lcom/google/android/gms/internal/play_billing/i9;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/play_billing/i9;->zzb:Lcom/google/android/gms/internal/play_billing/i9;

    const-class v1, Lcom/google/android/gms/internal/play_billing/i9;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/play_billing/t4;->i(Ljava/lang/Class;Lcom/google/android/gms/internal/play_billing/t4;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/play_billing/t4;-><init>()V

    return-void
.end method

.method public static B()Lcom/google/android/gms/internal/play_billing/f9;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/i9;->zzb:Lcom/google/android/gms/internal/play_billing/i9;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/t4;->r()Lcom/google/android/gms/internal/play_billing/p4;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/f9;

    return-object v0
.end method

.method public static bridge synthetic C()Lcom/google/android/gms/internal/play_billing/i9;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/i9;->zzb:Lcom/google/android/gms/internal/play_billing/i9;

    return-object v0
.end method

.method public static synthetic D(Lcom/google/android/gms/internal/play_billing/i9;Lcom/google/android/gms/internal/play_billing/u7;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/i9;->zze:Lcom/google/android/gms/internal/play_billing/u7;

    iget p1, p0, Lcom/google/android/gms/internal/play_billing/i9;->zzd:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/play_billing/i9;->zzd:I

    return-void
.end method

.method public static synthetic E(Lcom/google/android/gms/internal/play_billing/i9;J)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/play_billing/i9;->zzd:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/google/android/gms/internal/play_billing/i9;->zzd:I

    iput-wide p1, p0, Lcom/google/android/gms/internal/play_billing/i9;->zzf:J

    return-void
.end method


# virtual methods
.method public final p(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

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

    sget-object p1, Lcom/google/android/gms/internal/play_billing/i9;->zzb:Lcom/google/android/gms/internal/play_billing/i9;

    return-object p1

    :cond_0
    throw p3

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/play_billing/f9;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/play_billing/f9;-><init>(Lcom/google/android/gms/internal/play_billing/h9;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/play_billing/i9;

    invoke-direct {p1}, Lcom/google/android/gms/internal/play_billing/i9;-><init>()V

    return-object p1

    :cond_3
    const-string p1, "zze"

    const-string p2, "zzf"

    const-string p3, "zzd"

    filled-new-array {p3, p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lcom/google/android/gms/internal/play_billing/i9;->zzb:Lcom/google/android/gms/internal/play_billing/i9;

    const-string p3, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1002\u0001"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/play_billing/t4;->z(Lcom/google/android/gms/internal/play_billing/x5;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
