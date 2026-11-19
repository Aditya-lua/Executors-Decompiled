.class public final Lcom/google/android/gms/internal/play_billing/a9;
.super Lcom/google/android/gms/internal/play_billing/t4;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/play_billing/y5;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/play_billing/a9;


# instance fields
.field private zzd:I

.field private zze:Lcom/google/android/gms/internal/play_billing/y4;

.field private zzf:I

.field private zzg:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/play_billing/a9;

    invoke-direct {v0}, Lcom/google/android/gms/internal/play_billing/a9;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/play_billing/a9;->zzb:Lcom/google/android/gms/internal/play_billing/a9;

    const-class v1, Lcom/google/android/gms/internal/play_billing/a9;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/play_billing/t4;->i(Ljava/lang/Class;Lcom/google/android/gms/internal/play_billing/t4;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/play_billing/t4;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/t4;->x()Lcom/google/android/gms/internal/play_billing/y4;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/play_billing/a9;->zze:Lcom/google/android/gms/internal/play_billing/y4;

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/play_billing/a9;->zzg:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic B()Lcom/google/android/gms/internal/play_billing/a9;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/a9;->zzb:Lcom/google/android/gms/internal/play_billing/a9;

    return-object v0
.end method


# virtual methods
.method public final p(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

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

    sget-object p1, Lcom/google/android/gms/internal/play_billing/a9;->zzb:Lcom/google/android/gms/internal/play_billing/a9;

    return-object p1

    :cond_0
    throw p3

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/play_billing/y8;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/play_billing/y8;-><init>(Lcom/google/android/gms/internal/play_billing/z8;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/play_billing/a9;

    invoke-direct {p1}, Lcom/google/android/gms/internal/play_billing/a9;-><init>()V

    return-object p1

    :cond_3
    const-string p1, "zzf"

    const-string p2, "zzg"

    const-string p3, "zzd"

    const-string v0, "zze"

    filled-new-array {p3, v0, p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lcom/google/android/gms/internal/play_billing/a9;->zzb:Lcom/google/android/gms/internal/play_billing/a9;

    const-string p3, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002\u1004\u0000\u0003\u1008\u0001"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/play_billing/t4;->z(Lcom/google/android/gms/internal/play_billing/x5;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
