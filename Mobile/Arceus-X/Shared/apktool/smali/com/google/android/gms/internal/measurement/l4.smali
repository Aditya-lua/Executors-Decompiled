.class public final Lcom/google/android/gms/internal/measurement/l4;
.super Lcom/google/android/gms/internal/measurement/gb;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/pc;


# static fields
.field private static final zzh:Lcom/google/android/gms/internal/measurement/l4;


# instance fields
.field private zzb:I

.field private zzd:I

.field private zze:Ljava/lang/String;

.field private zzf:Z

.field private zzg:Lcom/google/android/gms/internal/measurement/pb;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/l4;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/l4;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/l4;->zzh:Lcom/google/android/gms/internal/measurement/l4;

    const-class v1, Lcom/google/android/gms/internal/measurement/l4;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/measurement/gb;->t(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/gb;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/gb;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/l4;->zze:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/gb;->A()Lcom/google/android/gms/internal/measurement/pb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/l4;->zzg:Lcom/google/android/gms/internal/measurement/pb;

    return-void
.end method

.method public static O()Lcom/google/android/gms/internal/measurement/l4;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/l4;->zzh:Lcom/google/android/gms/internal/measurement/l4;

    return-object v0
.end method

.method public static synthetic P()Lcom/google/android/gms/internal/measurement/l4;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/l4;->zzh:Lcom/google/android/gms/internal/measurement/l4;

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

    sget-object p1, Lcom/google/android/gms/internal/measurement/l4;->zzh:Lcom/google/android/gms/internal/measurement/l4;

    return-object p1

    :cond_0
    throw p3

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/measurement/i4;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/measurement/i4;-><init>([B)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/measurement/l4;

    invoke-direct {p1}, Lcom/google/android/gms/internal/measurement/l4;-><init>()V

    return-object p1

    :cond_3
    sget-object v2, Lcom/google/android/gms/internal/measurement/j4;->a:Lcom/google/android/gms/internal/measurement/lb;

    const-string v4, "zzf"

    const-string v5, "zzg"

    const-string v0, "zzb"

    const-string v1, "zzd"

    const-string v3, "zze"

    filled-new-array/range {v0 .. v5}, [Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lcom/google/android/gms/internal/measurement/l4;->zzh:Lcom/google/android/gms/internal/measurement/l4;

    const-string p3, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u180c\u0000\u0002\u1008\u0001\u0003\u1007\u0002\u0004\u001a"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/measurement/gb;->v(Lcom/google/android/gms/internal/measurement/oc;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

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

    iget v0, p0, Lcom/google/android/gms/internal/measurement/l4;->zzb:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final G()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/l4;->zzb:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final H()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/l4;->zze:Ljava/lang/String;

    return-object v0
.end method

.method public final J()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/l4;->zzb:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final K()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/l4;->zzf:Z

    return v0
.end method

.method public final M()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/l4;->zzg:Lcom/google/android/gms/internal/measurement/pb;

    return-object v0
.end method

.method public final N()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/l4;->zzg:Lcom/google/android/gms/internal/measurement/pb;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final Q()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/l4;->zzd:I

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/k4;->a(I)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method
