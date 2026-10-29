.class public final Lcom/google/android/gms/internal/measurement/t7;
.super Lcom/google/android/gms/internal/measurement/gb;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/pc;


# static fields
.field private static final zzd:Lcom/google/android/gms/internal/measurement/t7;


# instance fields
.field private zzb:Lcom/google/android/gms/internal/measurement/pb;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/t7;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/t7;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/t7;->zzd:Lcom/google/android/gms/internal/measurement/t7;

    const-class v1, Lcom/google/android/gms/internal/measurement/t7;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/measurement/gb;->t(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/gb;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/gb;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/gb;->A()Lcom/google/android/gms/internal/measurement/pb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/t7;->zzb:Lcom/google/android/gms/internal/measurement/pb;

    return-void
.end method

.method public static H()Lcom/google/android/gms/internal/measurement/t7;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/t7;->zzd:Lcom/google/android/gms/internal/measurement/t7;

    return-object v0
.end method

.method public static synthetic J()Lcom/google/android/gms/internal/measurement/t7;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/t7;->zzd:Lcom/google/android/gms/internal/measurement/t7;

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

    sget-object p1, Lcom/google/android/gms/internal/measurement/t7;->zzd:Lcom/google/android/gms/internal/measurement/t7;

    return-object p1

    :cond_0
    throw p3

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/measurement/s7;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/measurement/s7;-><init>([B)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/measurement/t7;

    invoke-direct {p1}, Lcom/google/android/gms/internal/measurement/t7;-><init>()V

    return-object p1

    :cond_3
    const-string p1, "zzb"

    const-class p2, Lcom/google/android/gms/internal/measurement/v7;

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lcom/google/android/gms/internal/measurement/t7;->zzd:Lcom/google/android/gms/internal/measurement/t7;

    const-string p3, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b"

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

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/t7;->zzb:Lcom/google/android/gms/internal/measurement/pb;

    return-object v0
.end method

.method public final G()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/t7;->zzb:Lcom/google/android/gms/internal/measurement/pb;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method
