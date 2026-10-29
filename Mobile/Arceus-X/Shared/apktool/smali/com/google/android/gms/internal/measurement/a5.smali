.class public final Lcom/google/android/gms/internal/measurement/a5;
.super Lcom/google/android/gms/internal/measurement/gb;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/pc;


# static fields
.field private static final zzi:Lcom/google/android/gms/internal/measurement/a5;


# instance fields
.field private zzb:I

.field private zzd:Lcom/google/android/gms/internal/measurement/pb;

.field private zze:Lcom/google/android/gms/internal/measurement/pb;

.field private zzf:Lcom/google/android/gms/internal/measurement/pb;

.field private zzg:Z

.field private zzh:Lcom/google/android/gms/internal/measurement/pb;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/a5;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/a5;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/a5;->zzi:Lcom/google/android/gms/internal/measurement/a5;

    const-class v1, Lcom/google/android/gms/internal/measurement/a5;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/measurement/gb;->t(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/gb;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/gb;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/gb;->A()Lcom/google/android/gms/internal/measurement/pb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/a5;->zzd:Lcom/google/android/gms/internal/measurement/pb;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/gb;->A()Lcom/google/android/gms/internal/measurement/pb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/a5;->zze:Lcom/google/android/gms/internal/measurement/pb;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/gb;->A()Lcom/google/android/gms/internal/measurement/pb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/a5;->zzf:Lcom/google/android/gms/internal/measurement/pb;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/gb;->A()Lcom/google/android/gms/internal/measurement/pb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/a5;->zzh:Lcom/google/android/gms/internal/measurement/pb;

    return-void
.end method

.method public static N()Lcom/google/android/gms/internal/measurement/a5;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/a5;->zzi:Lcom/google/android/gms/internal/measurement/a5;

    return-object v0
.end method

.method public static synthetic O()Lcom/google/android/gms/internal/measurement/a5;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/a5;->zzi:Lcom/google/android/gms/internal/measurement/a5;

    return-object v0
.end method


# virtual methods
.method public final E(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

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

    sget-object p1, Lcom/google/android/gms/internal/measurement/a5;->zzi:Lcom/google/android/gms/internal/measurement/a5;

    return-object p1

    :cond_0
    throw p3

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/measurement/m4;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/measurement/m4;-><init>([B)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/measurement/a5;

    invoke-direct {p1}, Lcom/google/android/gms/internal/measurement/a5;-><init>()V

    return-object p1

    :cond_3
    const-string v8, "zzh"

    const-class v9, Lcom/google/android/gms/internal/measurement/o4;

    const-string v0, "zzb"

    const-string v1, "zzd"

    const-class v2, Lcom/google/android/gms/internal/measurement/o4;

    const-string v3, "zze"

    const-class v4, Lcom/google/android/gms/internal/measurement/q4;

    const-string v5, "zzf"

    const-class v6, Lcom/google/android/gms/internal/measurement/x4;

    const-string v7, "zzg"

    filled-new-array/range {v0 .. v9}, [Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lcom/google/android/gms/internal/measurement/a5;->zzi:Lcom/google/android/gms/internal/measurement/a5;

    const-string p3, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u1007\u0000\u0005\u001b"

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

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/a5;->zzd:Lcom/google/android/gms/internal/measurement/pb;

    return-object v0
.end method

.method public final G()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/a5;->zze:Lcom/google/android/gms/internal/measurement/pb;

    return-object v0
.end method

.method public final H()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/a5;->zzf:Lcom/google/android/gms/internal/measurement/pb;

    return-object v0
.end method

.method public final J()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/measurement/a5;->zzb:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final K()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/a5;->zzg:Z

    return v0
.end method

.method public final M()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/a5;->zzh:Lcom/google/android/gms/internal/measurement/pb;

    return-object v0
.end method
