.class public final Lcom/google/android/gms/internal/measurement/z7;
.super Lcom/google/android/gms/internal/measurement/kb;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/tc;


# static fields
.field private static final zzf:Lcom/google/android/gms/internal/measurement/z7;


# instance fields
.field private zzb:I

.field private zzd:Ljava/lang/String;

.field private zze:Lcom/google/android/gms/internal/measurement/tb;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/z7;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/z7;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/z7;->zzf:Lcom/google/android/gms/internal/measurement/z7;

    const-class v1, Lcom/google/android/gms/internal/measurement/z7;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/measurement/kb;->t(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/kb;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/kb;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/z7;->zzd:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/kb;->z()Lcom/google/android/gms/internal/measurement/tb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/z7;->zze:Lcom/google/android/gms/internal/measurement/tb;

    return-void
.end method

.method public static synthetic H()Lcom/google/android/gms/internal/measurement/z7;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/z7;->zzf:Lcom/google/android/gms/internal/measurement/z7;

    return-object v0
.end method


# virtual methods
.method public final E(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
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

    sget-object p1, Lcom/google/android/gms/internal/measurement/z7;->zzf:Lcom/google/android/gms/internal/measurement/z7;

    return-object p1

    :cond_0
    throw p3

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/measurement/y7;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/measurement/y7;-><init>([B)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/measurement/z7;

    invoke-direct {p1}, Lcom/google/android/gms/internal/measurement/z7;-><init>()V

    return-object p1

    :cond_3
    const-string p1, "zze"

    const-class p2, Lcom/google/android/gms/internal/measurement/g8;

    const-string p3, "zzb"

    const-string v0, "zzd"

    filled-new-array {p3, v0, p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lcom/google/android/gms/internal/measurement/z7;->zzf:Lcom/google/android/gms/internal/measurement/z7;

    const-string p3, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001b"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/measurement/kb;->u(Lcom/google/android/gms/internal/measurement/sc;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final F()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/z7;->zzd:Ljava/lang/String;

    return-object v0
.end method

.method public final G()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/z7;->zze:Lcom/google/android/gms/internal/measurement/tb;

    return-object v0
.end method
