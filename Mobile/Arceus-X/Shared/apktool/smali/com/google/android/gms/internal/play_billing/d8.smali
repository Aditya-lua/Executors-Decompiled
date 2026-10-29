.class public final Lcom/google/android/gms/internal/play_billing/d8;
.super Lcom/google/android/gms/internal/play_billing/t4;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/play_billing/y5;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/play_billing/d8;


# instance fields
.field private zzd:I

.field private zze:Ljava/lang/String;

.field private zzf:I

.field private zzg:Lcom/google/android/gms/internal/play_billing/x4;

.field private zzh:Lcom/google/android/gms/internal/play_billing/y4;

.field private zzi:Lcom/google/android/gms/internal/play_billing/u7;

.field private zzj:Z

.field private zzk:Z

.field private zzl:Lcom/google/android/gms/internal/play_billing/e9;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/play_billing/d8;

    invoke-direct {v0}, Lcom/google/android/gms/internal/play_billing/d8;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/play_billing/d8;->zzb:Lcom/google/android/gms/internal/play_billing/d8;

    const-class v1, Lcom/google/android/gms/internal/play_billing/d8;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/play_billing/t4;->i(Ljava/lang/Class;Lcom/google/android/gms/internal/play_billing/t4;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/play_billing/t4;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/play_billing/d8;->zze:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/t4;->w()Lcom/google/android/gms/internal/play_billing/x4;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/play_billing/d8;->zzg:Lcom/google/android/gms/internal/play_billing/x4;

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/t4;->x()Lcom/google/android/gms/internal/play_billing/y4;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/play_billing/d8;->zzh:Lcom/google/android/gms/internal/play_billing/y4;

    return-void
.end method

.method public static B()Lcom/google/android/gms/internal/play_billing/a8;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/d8;->zzb:Lcom/google/android/gms/internal/play_billing/d8;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/t4;->r()Lcom/google/android/gms/internal/play_billing/p4;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/a8;

    return-object v0
.end method

.method public static bridge synthetic C()Lcom/google/android/gms/internal/play_billing/d8;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/d8;->zzb:Lcom/google/android/gms/internal/play_billing/d8;

    return-object v0
.end method

.method public static synthetic D(Lcom/google/android/gms/internal/play_billing/d8;Lcom/google/android/gms/internal/play_billing/z7;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/d8;->zzg:Lcom/google/android/gms/internal/play_billing/x4;

    invoke-interface {v0}, Lcom/google/android/gms/internal/play_billing/y4;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v1, v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/play_billing/x4;->v(I)Lcom/google/android/gms/internal/play_billing/x4;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/play_billing/d8;->zzg:Lcom/google/android/gms/internal/play_billing/x4;

    :cond_0
    iget-object p0, p0, Lcom/google/android/gms/internal/play_billing/d8;->zzg:Lcom/google/android/gms/internal/play_billing/x4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/z7;->zza()I

    move-result p1

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/play_billing/x4;->w(I)V

    return-void
.end method

.method public static synthetic E(Lcom/google/android/gms/internal/play_billing/d8;Lcom/google/android/gms/internal/play_billing/u7;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/d8;->zzi:Lcom/google/android/gms/internal/play_billing/u7;

    iget p1, p0, Lcom/google/android/gms/internal/play_billing/d8;->zzd:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, Lcom/google/android/gms/internal/play_billing/d8;->zzd:I

    return-void
.end method

.method public static synthetic F(Lcom/google/android/gms/internal/play_billing/d8;Ljava/lang/String;)V
    .locals 0

    iget p1, p0, Lcom/google/android/gms/internal/play_billing/d8;->zzd:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/play_billing/d8;->zzd:I

    const-string p1, "ProxyBillingBroadcastReceiver"

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/d8;->zze:Ljava/lang/String;

    return-void
.end method

.method public static synthetic G(Lcom/google/android/gms/internal/play_billing/d8;Lcom/google/android/gms/internal/play_billing/e9;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/d8;->zzl:Lcom/google/android/gms/internal/play_billing/e9;

    iget p1, p0, Lcom/google/android/gms/internal/play_billing/d8;->zzd:I

    or-int/lit8 p1, p1, 0x20

    iput p1, p0, Lcom/google/android/gms/internal/play_billing/d8;->zzd:I

    return-void
.end method

.method public static synthetic H(Lcom/google/android/gms/internal/play_billing/d8;I)V
    .locals 0

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/google/android/gms/internal/play_billing/d8;->zzf:I

    iget p1, p0, Lcom/google/android/gms/internal/play_billing/d8;->zzd:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Lcom/google/android/gms/internal/play_billing/d8;->zzd:I

    return-void
.end method


# virtual methods
.method public final p(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

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

    sget-object p1, Lcom/google/android/gms/internal/play_billing/d8;->zzb:Lcom/google/android/gms/internal/play_billing/d8;

    return-object p1

    :cond_0
    throw p3

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/play_billing/a8;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/play_billing/a8;-><init>(Lcom/google/android/gms/internal/play_billing/c8;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/play_billing/d8;

    invoke-direct {p1}, Lcom/google/android/gms/internal/play_billing/d8;-><init>()V

    return-object p1

    :cond_3
    sget-object v3, Lcom/google/android/gms/internal/play_billing/b8;->a:Lcom/google/android/gms/internal/play_billing/w4;

    sget-object v5, Lcom/google/android/gms/internal/play_billing/y7;->a:Lcom/google/android/gms/internal/play_billing/w4;

    const-string v10, "zzk"

    const-string v11, "zzl"

    const-string v0, "zzd"

    const-string v1, "zze"

    const-string v2, "zzf"

    const-string v4, "zzg"

    const-string v6, "zzh"

    const-class v7, Lcom/google/android/gms/internal/play_billing/a9;

    const-string v8, "zzi"

    const-string v9, "zzj"

    filled-new-array/range {v0 .. v11}, [Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lcom/google/android/gms/internal/play_billing/d8;->zzb:Lcom/google/android/gms/internal/play_billing/d8;

    const-string p3, "\u0004\u0008\u0000\u0001\u0001\u0008\u0008\u0000\u0002\u0000\u0001\u1008\u0000\u0002\u180c\u0001\u0003\u082c\u0004\u001b\u0005\u1009\u0002\u0006\u1007\u0003\u0007\u1007\u0004\u0008\u1009\u0005"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/play_billing/t4;->z(Lcom/google/android/gms/internal/play_billing/x5;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
