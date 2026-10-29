.class public final Lcom/google/android/gms/internal/play_billing/x7;
.super Lcom/google/android/gms/internal/play_billing/t4;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/play_billing/y5;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/play_billing/x7;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/play_billing/x7;

    invoke-direct {v0}, Lcom/google/android/gms/internal/play_billing/x7;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/play_billing/x7;->zzb:Lcom/google/android/gms/internal/play_billing/x7;

    const-class v1, Lcom/google/android/gms/internal/play_billing/x7;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/play_billing/t4;->i(Ljava/lang/Class;Lcom/google/android/gms/internal/play_billing/t4;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/play_billing/t4;-><init>()V

    return-void
.end method

.method public static bridge synthetic B()Lcom/google/android/gms/internal/play_billing/x7;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/x7;->zzb:Lcom/google/android/gms/internal/play_billing/x7;

    return-object v0
.end method

.method public static C()Lcom/google/android/gms/internal/play_billing/x7;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/x7;->zzb:Lcom/google/android/gms/internal/play_billing/x7;

    return-object v0
.end method


# virtual methods
.method public final p(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    add-int/lit8 p1, p1, -0x1

    if-eqz p1, :cond_4

    const/4 p2, 0x2

    const/4 p3, 0x0

    if-eq p1, p2, :cond_3

    const/4 p2, 0x3

    if-eq p1, p2, :cond_2

    const/4 p2, 0x4

    if-eq p1, p2, :cond_1

    const/4 p2, 0x5

    if-ne p1, p2, :cond_0

    sget-object p1, Lcom/google/android/gms/internal/play_billing/x7;->zzb:Lcom/google/android/gms/internal/play_billing/x7;

    return-object p1

    :cond_0
    throw p3

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/play_billing/v7;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/play_billing/v7;-><init>(Lcom/google/android/gms/internal/play_billing/w7;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/play_billing/x7;

    invoke-direct {p1}, Lcom/google/android/gms/internal/play_billing/x7;-><init>()V

    return-object p1

    :cond_3
    sget-object p1, Lcom/google/android/gms/internal/play_billing/x7;->zzb:Lcom/google/android/gms/internal/play_billing/x7;

    const-string p2, "\u0004\u0000"

    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/play_billing/t4;->z(Lcom/google/android/gms/internal/play_billing/x5;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
