.class public final Lcom/google/android/gms/internal/measurement/j7;
.super Lcom/google/android/gms/internal/measurement/kb;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/tc;


# static fields
.field private static final zzg:Lcom/google/android/gms/internal/measurement/j7;


# instance fields
.field private zzb:Lcom/google/android/gms/internal/measurement/sb;

.field private zzd:Lcom/google/android/gms/internal/measurement/sb;

.field private zze:Lcom/google/android/gms/internal/measurement/tb;

.field private zzf:Lcom/google/android/gms/internal/measurement/tb;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/j7;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/j7;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/j7;->zzg:Lcom/google/android/gms/internal/measurement/j7;

    const-class v1, Lcom/google/android/gms/internal/measurement/j7;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/measurement/kb;->t(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/kb;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/kb;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/kb;->x()Lcom/google/android/gms/internal/measurement/sb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/j7;->zzb:Lcom/google/android/gms/internal/measurement/sb;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/kb;->x()Lcom/google/android/gms/internal/measurement/sb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/j7;->zzd:Lcom/google/android/gms/internal/measurement/sb;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/kb;->z()Lcom/google/android/gms/internal/measurement/tb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/j7;->zze:Lcom/google/android/gms/internal/measurement/tb;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/kb;->z()Lcom/google/android/gms/internal/measurement/tb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/j7;->zzf:Lcom/google/android/gms/internal/measurement/tb;

    return-void
.end method

.method public static N()Lcom/google/android/gms/internal/measurement/i7;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/j7;->zzg:Lcom/google/android/gms/internal/measurement/j7;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/kb;->p()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/i7;

    return-object v0
.end method

.method public static O()Lcom/google/android/gms/internal/measurement/j7;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/j7;->zzg:Lcom/google/android/gms/internal/measurement/j7;

    return-object v0
.end method

.method public static synthetic Z()Lcom/google/android/gms/internal/measurement/j7;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/j7;->zzg:Lcom/google/android/gms/internal/measurement/j7;

    return-object v0
.end method


# virtual methods
.method public final E(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

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

    sget-object p1, Lcom/google/android/gms/internal/measurement/j7;->zzg:Lcom/google/android/gms/internal/measurement/j7;

    return-object p1

    :cond_0
    throw p3

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/measurement/i7;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/measurement/i7;-><init>([B)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/measurement/j7;

    invoke-direct {p1}, Lcom/google/android/gms/internal/measurement/j7;-><init>()V

    return-object p1

    :cond_3
    const-string v4, "zzf"

    const-class v5, Lcom/google/android/gms/internal/measurement/l7;

    const-string v0, "zzb"

    const-string v1, "zzd"

    const-string v2, "zze"

    const-class v3, Lcom/google/android/gms/internal/measurement/q6;

    filled-new-array/range {v0 .. v5}, [Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lcom/google/android/gms/internal/measurement/j7;->zzg:Lcom/google/android/gms/internal/measurement/j7;

    const-string p3, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b"

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

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/j7;->zzb:Lcom/google/android/gms/internal/measurement/sb;

    return-object v0
.end method

.method public final G()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/j7;->zzb:Lcom/google/android/gms/internal/measurement/sb;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final H()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/j7;->zzd:Lcom/google/android/gms/internal/measurement/sb;

    return-object v0
.end method

.method public final I()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/j7;->zzd:Lcom/google/android/gms/internal/measurement/sb;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final J()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/j7;->zze:Lcom/google/android/gms/internal/measurement/tb;

    return-object v0
.end method

.method public final K()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/j7;->zze:Lcom/google/android/gms/internal/measurement/tb;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final L()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/j7;->zzf:Lcom/google/android/gms/internal/measurement/tb;

    return-object v0
.end method

.method public final M()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/j7;->zzf:Lcom/google/android/gms/internal/measurement/tb;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final synthetic P(Ljava/lang/Iterable;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/j7;->zzb:Lcom/google/android/gms/internal/measurement/sb;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/tb;->zza()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/kb;->y(Lcom/google/android/gms/internal/measurement/sb;)Lcom/google/android/gms/internal/measurement/sb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/j7;->zzb:Lcom/google/android/gms/internal/measurement/sb;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/j7;->zzb:Lcom/google/android/gms/internal/measurement/sb;

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/measurement/v9;->h(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method public final synthetic R()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/kb;->x()Lcom/google/android/gms/internal/measurement/sb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/j7;->zzb:Lcom/google/android/gms/internal/measurement/sb;

    return-void
.end method

.method public final synthetic S(Ljava/lang/Iterable;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/j7;->zzd:Lcom/google/android/gms/internal/measurement/sb;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/tb;->zza()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/kb;->y(Lcom/google/android/gms/internal/measurement/sb;)Lcom/google/android/gms/internal/measurement/sb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/j7;->zzd:Lcom/google/android/gms/internal/measurement/sb;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/j7;->zzd:Lcom/google/android/gms/internal/measurement/sb;

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/measurement/v9;->h(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method public final synthetic U()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/kb;->x()Lcom/google/android/gms/internal/measurement/sb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/j7;->zzd:Lcom/google/android/gms/internal/measurement/sb;

    return-void
.end method

.method public final synthetic V(Ljava/lang/Iterable;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/j7;->zze:Lcom/google/android/gms/internal/measurement/tb;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/tb;->zza()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/kb;->B(Lcom/google/android/gms/internal/measurement/tb;)Lcom/google/android/gms/internal/measurement/tb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/j7;->zze:Lcom/google/android/gms/internal/measurement/tb;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/j7;->zze:Lcom/google/android/gms/internal/measurement/tb;

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/measurement/v9;->h(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method public final synthetic W()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/kb;->z()Lcom/google/android/gms/internal/measurement/tb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/j7;->zze:Lcom/google/android/gms/internal/measurement/tb;

    return-void
.end method

.method public final synthetic X(Ljava/lang/Iterable;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/j7;->zzf:Lcom/google/android/gms/internal/measurement/tb;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/tb;->zza()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/kb;->B(Lcom/google/android/gms/internal/measurement/tb;)Lcom/google/android/gms/internal/measurement/tb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/j7;->zzf:Lcom/google/android/gms/internal/measurement/tb;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/j7;->zzf:Lcom/google/android/gms/internal/measurement/tb;

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/measurement/v9;->h(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method public final synthetic Y()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/kb;->z()Lcom/google/android/gms/internal/measurement/tb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/j7;->zzf:Lcom/google/android/gms/internal/measurement/tb;

    return-void
.end method
