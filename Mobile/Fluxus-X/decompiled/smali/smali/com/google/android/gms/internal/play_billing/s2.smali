.class public final Lcom/google/android/gms/internal/play_billing/s2;
.super Lcom/google/android/gms/internal/play_billing/t4;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/play_billing/y5;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/play_billing/s2;


# instance fields
.field private zzd:I

.field private zze:Lcom/google/android/gms/internal/play_billing/x2;

.field private zzf:Lcom/google/android/gms/internal/play_billing/x2;

.field private zzg:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/play_billing/s2;

    invoke-direct {v0}, Lcom/google/android/gms/internal/play_billing/s2;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/play_billing/s2;->zzb:Lcom/google/android/gms/internal/play_billing/s2;

    const-class v1, Lcom/google/android/gms/internal/play_billing/s2;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/play_billing/t4;->i(Ljava/lang/Class;Lcom/google/android/gms/internal/play_billing/t4;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/play_billing/t4;-><init>()V

    return-void
.end method

.method public static bridge synthetic B()Lcom/google/android/gms/internal/play_billing/s2;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/s2;->zzb:Lcom/google/android/gms/internal/play_billing/s2;

    return-object v0
.end method


# virtual methods
.method public final p(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
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

    sget-object p1, Lcom/google/android/gms/internal/play_billing/s2;->zzb:Lcom/google/android/gms/internal/play_billing/s2;

    return-object p1

    :cond_0
    throw p3

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/play_billing/r2;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/play_billing/r2;-><init>(Lcom/google/android/gms/internal/play_billing/v2;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/play_billing/s2;

    invoke-direct {p1}, Lcom/google/android/gms/internal/play_billing/s2;-><init>()V

    return-object p1

    :cond_3
    const-string p1, "zzg"

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/a3;->a()Lcom/google/android/gms/internal/play_billing/w4;

    move-result-object p2

    const-string p3, "zzd"

    const-string v0, "zze"

    const-string v1, "zzf"

    filled-new-array {p3, v0, v1, p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lcom/google/android/gms/internal/play_billing/s2;->zzb:Lcom/google/android/gms/internal/play_billing/s2;

    const-string p3, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u180c\u0002"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/play_billing/t4;->z(Lcom/google/android/gms/internal/play_billing/x5;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
