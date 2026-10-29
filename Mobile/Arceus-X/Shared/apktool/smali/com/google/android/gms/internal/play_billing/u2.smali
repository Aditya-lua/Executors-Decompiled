.class public final Lcom/google/android/gms/internal/play_billing/u2;
.super Lcom/google/android/gms/internal/play_billing/t4;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/play_billing/y5;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/play_billing/u2;


# instance fields
.field private zzd:Lcom/google/android/gms/internal/play_billing/y4;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/play_billing/u2;

    invoke-direct {v0}, Lcom/google/android/gms/internal/play_billing/u2;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/play_billing/u2;->zzb:Lcom/google/android/gms/internal/play_billing/u2;

    const-class v1, Lcom/google/android/gms/internal/play_billing/u2;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/play_billing/t4;->i(Ljava/lang/Class;Lcom/google/android/gms/internal/play_billing/t4;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/play_billing/t4;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/t4;->x()Lcom/google/android/gms/internal/play_billing/y4;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/play_billing/u2;->zzd:Lcom/google/android/gms/internal/play_billing/y4;

    return-void
.end method

.method public static B()Lcom/google/android/gms/internal/play_billing/t2;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/u2;->zzb:Lcom/google/android/gms/internal/play_billing/u2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/t4;->r()Lcom/google/android/gms/internal/play_billing/p4;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/t2;

    return-object v0
.end method

.method public static bridge synthetic C()Lcom/google/android/gms/internal/play_billing/u2;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/u2;->zzb:Lcom/google/android/gms/internal/play_billing/u2;

    return-object v0
.end method

.method public static synthetic D(Lcom/google/android/gms/internal/play_billing/u2;Ljava/lang/Iterable;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/u2;->zzd:Lcom/google/android/gms/internal/play_billing/y4;

    invoke-interface {v0}, Lcom/google/android/gms/internal/play_billing/y4;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v1, v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/play_billing/y4;->r(I)Lcom/google/android/gms/internal/play_billing/y4;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/play_billing/u2;->zzd:Lcom/google/android/gms/internal/play_billing/y4;

    :cond_0
    iget-object p0, p0, Lcom/google/android/gms/internal/play_billing/u2;->zzd:Lcom/google/android/gms/internal/play_billing/y4;

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/play_billing/c3;->d(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public final p(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
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

    sget-object p1, Lcom/google/android/gms/internal/play_billing/u2;->zzb:Lcom/google/android/gms/internal/play_billing/u2;

    return-object p1

    :cond_0
    throw p3

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/play_billing/t2;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/play_billing/t2;-><init>(Lcom/google/android/gms/internal/play_billing/v2;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/play_billing/u2;

    invoke-direct {p1}, Lcom/google/android/gms/internal/play_billing/u2;-><init>()V

    return-object p1

    :cond_3
    const-string p1, "zzd"

    const-class p2, Lcom/google/android/gms/internal/play_billing/s2;

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lcom/google/android/gms/internal/play_billing/u2;->zzb:Lcom/google/android/gms/internal/play_billing/u2;

    const-string p3, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/play_billing/t4;->z(Lcom/google/android/gms/internal/play_billing/x5;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
