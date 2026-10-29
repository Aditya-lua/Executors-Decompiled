.class public final Lcom/google/android/gms/internal/measurement/y6;
.super Lcom/google/android/gms/internal/measurement/gb;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/pc;


# static fields
.field private static final zzh:Lcom/google/android/gms/internal/measurement/y6;


# instance fields
.field private zzb:I

.field private zzd:Lcom/google/android/gms/internal/measurement/pb;

.field private zze:Ljava/lang/String;

.field private zzf:Ljava/lang/String;

.field private zzg:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/y6;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/y6;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/y6;->zzh:Lcom/google/android/gms/internal/measurement/y6;

    const-class v1, Lcom/google/android/gms/internal/measurement/y6;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/measurement/gb;->t(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/gb;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/gb;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/gb;->A()Lcom/google/android/gms/internal/measurement/pb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/y6;->zzd:Lcom/google/android/gms/internal/measurement/pb;

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/y6;->zze:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/y6;->zzf:Ljava/lang/String;

    return-void
.end method

.method public static O()Lcom/google/android/gms/internal/measurement/v6;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/y6;->zzh:Lcom/google/android/gms/internal/measurement/y6;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/gb;->p()Lcom/google/android/gms/internal/measurement/cb;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/v6;

    return-object v0
.end method

.method public static P(Lcom/google/android/gms/internal/measurement/y6;)Lcom/google/android/gms/internal/measurement/v6;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/y6;->zzh:Lcom/google/android/gms/internal/measurement/y6;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/gb;->p()Lcom/google/android/gms/internal/measurement/cb;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/measurement/cb;->v(Lcom/google/android/gms/internal/measurement/gb;)Lcom/google/android/gms/internal/measurement/cb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/v6;

    return-object v0
.end method

.method public static synthetic W()Lcom/google/android/gms/internal/measurement/y6;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/y6;->zzh:Lcom/google/android/gms/internal/measurement/y6;

    return-object v0
.end method


# virtual methods
.method public final E(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
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

    sget-object p1, Lcom/google/android/gms/internal/measurement/y6;->zzh:Lcom/google/android/gms/internal/measurement/y6;

    return-object p1

    :cond_0
    throw p3

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/measurement/v6;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/measurement/v6;-><init>([B)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/measurement/y6;

    invoke-direct {p1}, Lcom/google/android/gms/internal/measurement/y6;-><init>()V

    return-object p1

    :cond_3
    const-string v5, "zzg"

    sget-object v6, Lcom/google/android/gms/internal/measurement/x6;->a:Lcom/google/android/gms/internal/measurement/lb;

    const-string v0, "zzb"

    const-string v1, "zzd"

    const-class v2, Lcom/google/android/gms/internal/measurement/a7;

    const-string v3, "zze"

    const-string v4, "zzf"

    filled-new-array/range {v0 .. v6}, [Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lcom/google/android/gms/internal/measurement/y6;->zzh:Lcom/google/android/gms/internal/measurement/y6;

    const-string p3, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007\u1008\u0000\u0008\u1008\u0001\t\u180c\u0002"

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

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/y6;->zzd:Lcom/google/android/gms/internal/measurement/pb;

    return-object v0
.end method

.method public final G()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/y6;->zzd:Lcom/google/android/gms/internal/measurement/pb;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final H(I)Lcom/google/android/gms/internal/measurement/a7;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/y6;->zzd:Lcom/google/android/gms/internal/measurement/pb;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/a7;

    return-object p1
.end method

.method public final J()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/measurement/y6;->zzb:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final K()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/y6;->zze:Ljava/lang/String;

    return-object v0
.end method

.method public final M()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/y6;->zzb:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final N()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/y6;->zzf:Ljava/lang/String;

    return-object v0
.end method

.method public final synthetic Q(ILcom/google/android/gms/internal/measurement/a7;)V
    .locals 1

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/y6;->X()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/y6;->zzd:Lcom/google/android/gms/internal/measurement/pb;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final synthetic R(Lcom/google/android/gms/internal/measurement/a7;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/y6;->X()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/y6;->zzd:Lcom/google/android/gms/internal/measurement/pb;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final synthetic S(Ljava/lang/Iterable;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/y6;->X()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/y6;->zzd:Lcom/google/android/gms/internal/measurement/pb;

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/measurement/r9;->i(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method public final synthetic T()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/gb;->A()Lcom/google/android/gms/internal/measurement/pb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/y6;->zzd:Lcom/google/android/gms/internal/measurement/pb;

    return-void
.end method

.method public final synthetic U(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/google/android/gms/internal/measurement/y6;->zzb:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/measurement/y6;->zzb:I

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/y6;->zze:Ljava/lang/String;

    return-void
.end method

.method public final synthetic V(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/google/android/gms/internal/measurement/y6;->zzb:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/google/android/gms/internal/measurement/y6;->zzb:I

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/y6;->zzf:Ljava/lang/String;

    return-void
.end method

.method public final X()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/y6;->zzd:Lcom/google/android/gms/internal/measurement/pb;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/pb;->zza()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/gb;->B(Lcom/google/android/gms/internal/measurement/pb;)Lcom/google/android/gms/internal/measurement/pb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/y6;->zzd:Lcom/google/android/gms/internal/measurement/pb;

    :cond_0
    return-void
.end method
