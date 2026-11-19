.class public final Lcom/google/android/gms/internal/play_billing/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/android/gms/internal/play_billing/c0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    new-instance v0, Lcom/google/android/gms/internal/play_billing/p;

    invoke-direct {v0}, Lcom/google/android/gms/internal/play_billing/p;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    new-instance v0, Lcom/google/android/gms/internal/play_billing/q;

    invoke-direct {v0}, Lcom/google/android/gms/internal/play_billing/q;-><init>()V

    :goto_0
    sput-object v0, Lcom/google/android/gms/internal/play_billing/r;->a:Lcom/google/android/gms/internal/play_billing/c0;

    return-void
.end method

.method public static a()Lcom/google/android/gms/internal/play_billing/c0;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/r;->a:Lcom/google/android/gms/internal/play_billing/c0;

    return-object v0
.end method
