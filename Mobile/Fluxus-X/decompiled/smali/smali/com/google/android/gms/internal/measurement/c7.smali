.class public final Lcom/google/android/gms/internal/measurement/c7;
.super Lcom/google/android/gms/internal/measurement/kb;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/tc;


# static fields
.field private static final zzh:Lcom/google/android/gms/internal/measurement/c7;


# instance fields
.field private zzb:I

.field private zzd:Lcom/google/android/gms/internal/measurement/tb;

.field private zze:Ljava/lang/String;

.field private zzf:Ljava/lang/String;

.field private zzg:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/c7;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/c7;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/c7;->zzh:Lcom/google/android/gms/internal/measurement/c7;

    const-class v1, Lcom/google/android/gms/internal/measurement/c7;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/measurement/kb;->t(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/kb;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/kb;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/kb;->z()Lcom/google/android/gms/internal/measurement/tb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/c7;->zzd:Lcom/google/android/gms/internal/measurement/tb;

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/c7;->zze:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/c7;->zzf:Ljava/lang/String;

    return-void
.end method

.method public static M()Lcom/google/android/gms/internal/measurement/z6;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/c7;->zzh:Lcom/google/android/gms/internal/measurement/c7;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/kb;->p()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/z6;

    return-object v0
.end method

.method public static N(Lcom/google/android/gms/internal/measurement/c7;)Lcom/google/android/gms/internal/measurement/z6;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/c7;->zzh:Lcom/google/android/gms/internal/measurement/c7;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/kb;->p()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/measurement/gb;->x(Lcom/google/android/gms/internal/measurement/kb;)Lcom/google/android/gms/internal/measurement/gb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/z6;

    return-object v0
.end method

.method public static synthetic W()Lcom/google/android/gms/internal/measurement/c7;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/c7;->zzh:Lcom/google/android/gms/internal/measurement/c7;

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

    sget-object p1, Lcom/google/android/gms/internal/measurement/c7;->zzh:Lcom/google/android/gms/internal/measurement/c7;

    return-object p1

    :cond_0
    throw p3

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/measurement/z6;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/measurement/z6;-><init>([B)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/measurement/c7;

    invoke-direct {p1}, Lcom/google/android/gms/internal/measurement/c7;-><init>()V

    return-object p1

    :cond_3
    const-string v5, "zzg"

    sget-object v6, Lcom/google/android/gms/internal/measurement/b7;->a:Lcom/google/android/gms/internal/measurement/pb;

    const-string v0, "zzb"

    const-string v1, "zzd"

    const-class v2, Lcom/google/android/gms/internal/measurement/e7;

    const-string v3, "zze"

    const-string v4, "zzf"

    filled-new-array/range {v0 .. v6}, [Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lcom/google/android/gms/internal/measurement/c7;->zzh:Lcom/google/android/gms/internal/measurement/c7;

    const-string p3, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007\u1008\u0000\u0008\u1008\u0001\t\u180c\u0002"

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

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/c7;->zzd:Lcom/google/android/gms/internal/measurement/tb;

    return-object v0
.end method

.method public final G()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/c7;->zzd:Lcom/google/android/gms/internal/measurement/tb;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final H(I)Lcom/google/android/gms/internal/measurement/e7;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/c7;->zzd:Lcom/google/android/gms/internal/measurement/tb;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/e7;

    return-object p1
.end method

.method public final I()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/measurement/c7;->zzb:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final J()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/c7;->zze:Ljava/lang/String;

    return-object v0
.end method

.method public final K()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/c7;->zzb:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final L()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/c7;->zzf:Ljava/lang/String;

    return-object v0
.end method

.method public final synthetic O(ILcom/google/android/gms/internal/measurement/e7;)V
    .locals 1

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/c7;->X()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/c7;->zzd:Lcom/google/android/gms/internal/measurement/tb;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final synthetic P(Lcom/google/android/gms/internal/measurement/e7;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/c7;->X()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/c7;->zzd:Lcom/google/android/gms/internal/measurement/tb;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final synthetic R(Ljava/lang/Iterable;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/c7;->X()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/c7;->zzd:Lcom/google/android/gms/internal/measurement/tb;

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/measurement/v9;->h(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method public final synthetic S()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/kb;->z()Lcom/google/android/gms/internal/measurement/tb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/c7;->zzd:Lcom/google/android/gms/internal/measurement/tb;

    return-void
.end method

.method public final synthetic U(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/google/android/gms/internal/measurement/c7;->zzb:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/measurement/c7;->zzb:I

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/c7;->zze:Ljava/lang/String;

    return-void
.end method

.method public final synthetic V(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/google/android/gms/internal/measurement/c7;->zzb:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/google/android/gms/internal/measurement/c7;->zzb:I

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/c7;->zzf:Ljava/lang/String;

    return-void
.end method

.method public final X()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/c7;->zzd:Lcom/google/android/gms/internal/measurement/tb;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/tb;->zza()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/kb;->B(Lcom/google/android/gms/internal/measurement/tb;)Lcom/google/android/gms/internal/measurement/tb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/c7;->zzd:Lcom/google/android/gms/internal/measurement/tb;

    :cond_0
    return-void
.end method
