.class public final Lcom/google/android/gms/internal/measurement/f7;
.super Lcom/google/android/gms/internal/measurement/gb;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/pc;


# static fields
.field private static final zzg:Lcom/google/android/gms/internal/measurement/f7;


# instance fields
.field private zzb:Lcom/google/android/gms/internal/measurement/ob;

.field private zzd:Lcom/google/android/gms/internal/measurement/ob;

.field private zze:Lcom/google/android/gms/internal/measurement/pb;

.field private zzf:Lcom/google/android/gms/internal/measurement/pb;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/f7;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/f7;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/f7;->zzg:Lcom/google/android/gms/internal/measurement/f7;

    const-class v1, Lcom/google/android/gms/internal/measurement/f7;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/measurement/gb;->t(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/gb;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/gb;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/gb;->y()Lcom/google/android/gms/internal/measurement/ob;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/f7;->zzb:Lcom/google/android/gms/internal/measurement/ob;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/gb;->y()Lcom/google/android/gms/internal/measurement/ob;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/f7;->zzd:Lcom/google/android/gms/internal/measurement/ob;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/gb;->A()Lcom/google/android/gms/internal/measurement/pb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/f7;->zze:Lcom/google/android/gms/internal/measurement/pb;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/gb;->A()Lcom/google/android/gms/internal/measurement/pb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/f7;->zzf:Lcom/google/android/gms/internal/measurement/pb;

    return-void
.end method

.method public static P()Lcom/google/android/gms/internal/measurement/e7;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/f7;->zzg:Lcom/google/android/gms/internal/measurement/f7;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/gb;->p()Lcom/google/android/gms/internal/measurement/cb;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/e7;

    return-object v0
.end method

.method public static Q()Lcom/google/android/gms/internal/measurement/f7;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/f7;->zzg:Lcom/google/android/gms/internal/measurement/f7;

    return-object v0
.end method

.method public static synthetic Z()Lcom/google/android/gms/internal/measurement/f7;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/f7;->zzg:Lcom/google/android/gms/internal/measurement/f7;

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

    sget-object p1, Lcom/google/android/gms/internal/measurement/f7;->zzg:Lcom/google/android/gms/internal/measurement/f7;

    return-object p1

    :cond_0
    throw p3

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/measurement/e7;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/measurement/e7;-><init>([B)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/measurement/f7;

    invoke-direct {p1}, Lcom/google/android/gms/internal/measurement/f7;-><init>()V

    return-object p1

    :cond_3
    const-string v4, "zzf"

    const-class v5, Lcom/google/android/gms/internal/measurement/h7;

    const-string v0, "zzb"

    const-string v1, "zzd"

    const-string v2, "zze"

    const-class v3, Lcom/google/android/gms/internal/measurement/m6;

    filled-new-array/range {v0 .. v5}, [Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lcom/google/android/gms/internal/measurement/f7;->zzg:Lcom/google/android/gms/internal/measurement/f7;

    const-string p3, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/measurement/gb;->v(Lcom/google/android/gms/internal/measurement/oc;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

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

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/f7;->zzb:Lcom/google/android/gms/internal/measurement/ob;

    return-object v0
.end method

.method public final G()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/f7;->zzb:Lcom/google/android/gms/internal/measurement/ob;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final H()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/f7;->zzd:Lcom/google/android/gms/internal/measurement/ob;

    return-object v0
.end method

.method public final J()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/f7;->zzd:Lcom/google/android/gms/internal/measurement/ob;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final K()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/f7;->zze:Lcom/google/android/gms/internal/measurement/pb;

    return-object v0
.end method

.method public final M()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/f7;->zze:Lcom/google/android/gms/internal/measurement/pb;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final N()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/f7;->zzf:Lcom/google/android/gms/internal/measurement/pb;

    return-object v0
.end method

.method public final O()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/f7;->zzf:Lcom/google/android/gms/internal/measurement/pb;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final synthetic R(Ljava/lang/Iterable;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/f7;->zzb:Lcom/google/android/gms/internal/measurement/ob;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/pb;->zza()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/gb;->z(Lcom/google/android/gms/internal/measurement/ob;)Lcom/google/android/gms/internal/measurement/ob;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/f7;->zzb:Lcom/google/android/gms/internal/measurement/ob;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/f7;->zzb:Lcom/google/android/gms/internal/measurement/ob;

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/measurement/r9;->i(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method public final synthetic S()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/gb;->y()Lcom/google/android/gms/internal/measurement/ob;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/f7;->zzb:Lcom/google/android/gms/internal/measurement/ob;

    return-void
.end method

.method public final synthetic T(Ljava/lang/Iterable;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/f7;->zzd:Lcom/google/android/gms/internal/measurement/ob;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/pb;->zza()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/gb;->z(Lcom/google/android/gms/internal/measurement/ob;)Lcom/google/android/gms/internal/measurement/ob;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/f7;->zzd:Lcom/google/android/gms/internal/measurement/ob;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/f7;->zzd:Lcom/google/android/gms/internal/measurement/ob;

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/measurement/r9;->i(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method public final synthetic U()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/gb;->y()Lcom/google/android/gms/internal/measurement/ob;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/f7;->zzd:Lcom/google/android/gms/internal/measurement/ob;

    return-void
.end method

.method public final synthetic V(Ljava/lang/Iterable;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/f7;->zze:Lcom/google/android/gms/internal/measurement/pb;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/pb;->zza()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/gb;->B(Lcom/google/android/gms/internal/measurement/pb;)Lcom/google/android/gms/internal/measurement/pb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/f7;->zze:Lcom/google/android/gms/internal/measurement/pb;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/f7;->zze:Lcom/google/android/gms/internal/measurement/pb;

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/measurement/r9;->i(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method public final synthetic W()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/gb;->A()Lcom/google/android/gms/internal/measurement/pb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/f7;->zze:Lcom/google/android/gms/internal/measurement/pb;

    return-void
.end method

.method public final synthetic X(Ljava/lang/Iterable;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/f7;->zzf:Lcom/google/android/gms/internal/measurement/pb;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/pb;->zza()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/gb;->B(Lcom/google/android/gms/internal/measurement/pb;)Lcom/google/android/gms/internal/measurement/pb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/f7;->zzf:Lcom/google/android/gms/internal/measurement/pb;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/f7;->zzf:Lcom/google/android/gms/internal/measurement/pb;

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/measurement/r9;->i(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method public final synthetic Y()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/gb;->A()Lcom/google/android/gms/internal/measurement/pb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/f7;->zzf:Lcom/google/android/gms/internal/measurement/pb;

    return-void
.end method
