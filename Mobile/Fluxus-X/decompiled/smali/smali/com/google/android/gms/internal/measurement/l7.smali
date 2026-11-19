.class public final Lcom/google/android/gms/internal/measurement/l7;
.super Lcom/google/android/gms/internal/measurement/kb;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/tc;


# static fields
.field private static final zzf:Lcom/google/android/gms/internal/measurement/l7;


# instance fields
.field private zzb:I

.field private zzd:I

.field private zze:Lcom/google/android/gms/internal/measurement/sb;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/l7;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/l7;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/l7;->zzf:Lcom/google/android/gms/internal/measurement/l7;

    const-class v1, Lcom/google/android/gms/internal/measurement/l7;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/measurement/kb;->t(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/kb;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/kb;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/kb;->x()Lcom/google/android/gms/internal/measurement/sb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/l7;->zze:Lcom/google/android/gms/internal/measurement/sb;

    return-void
.end method

.method public static K()Lcom/google/android/gms/internal/measurement/k7;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/l7;->zzf:Lcom/google/android/gms/internal/measurement/l7;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/kb;->p()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/k7;

    return-object v0
.end method

.method public static synthetic N()Lcom/google/android/gms/internal/measurement/l7;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/l7;->zzf:Lcom/google/android/gms/internal/measurement/l7;

    return-object v0
.end method


# virtual methods
.method public final E(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
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

    sget-object p1, Lcom/google/android/gms/internal/measurement/l7;->zzf:Lcom/google/android/gms/internal/measurement/l7;

    return-object p1

    :cond_0
    throw p3

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/measurement/k7;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/measurement/k7;-><init>([B)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/measurement/l7;

    invoke-direct {p1}, Lcom/google/android/gms/internal/measurement/l7;-><init>()V

    return-object p1

    :cond_3
    const-string p1, "zzd"

    const-string p2, "zze"

    const-string p3, "zzb"

    filled-new-array {p3, p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lcom/google/android/gms/internal/measurement/l7;->zzf:Lcom/google/android/gms/internal/measurement/l7;

    const-string p3, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u0014"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/measurement/kb;->u(Lcom/google/android/gms/internal/measurement/sc;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final F()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/measurement/l7;->zzb:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final G()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/l7;->zzd:I

    return v0
.end method

.method public final H()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/l7;->zze:Lcom/google/android/gms/internal/measurement/sb;

    return-object v0
.end method

.method public final I()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/l7;->zze:Lcom/google/android/gms/internal/measurement/sb;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final J(I)J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/l7;->zze:Lcom/google/android/gms/internal/measurement/sb;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/measurement/sb;->w0(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public final synthetic L(I)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/l7;->zzb:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/measurement/l7;->zzb:I

    iput p1, p0, Lcom/google/android/gms/internal/measurement/l7;->zzd:I

    return-void
.end method

.method public final synthetic M(Ljava/lang/Iterable;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/l7;->zze:Lcom/google/android/gms/internal/measurement/sb;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/tb;->zza()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/kb;->y(Lcom/google/android/gms/internal/measurement/sb;)Lcom/google/android/gms/internal/measurement/sb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/l7;->zze:Lcom/google/android/gms/internal/measurement/sb;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/l7;->zze:Lcom/google/android/gms/internal/measurement/sb;

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/measurement/v9;->h(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method
