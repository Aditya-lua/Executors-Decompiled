.class public final Lcom/google/android/gms/internal/play_billing/q2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lcom/google/android/gms/internal/play_billing/q2;

.field public static final c:Lcom/google/android/gms/internal/play_billing/q2;


# instance fields
.field public final a:Ljava/lang/Throwable;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-boolean v0, Lcom/google/android/gms/internal/play_billing/s9;->d:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sput-object v1, Lcom/google/android/gms/internal/play_billing/q2;->c:Lcom/google/android/gms/internal/play_billing/q2;

    sput-object v1, Lcom/google/android/gms/internal/play_billing/q2;->b:Lcom/google/android/gms/internal/play_billing/q2;

    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/play_billing/q2;

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/internal/play_billing/q2;-><init>(ZLjava/lang/Throwable;)V

    sput-object v0, Lcom/google/android/gms/internal/play_billing/q2;->c:Lcom/google/android/gms/internal/play_billing/q2;

    new-instance v0, Lcom/google/android/gms/internal/play_billing/q2;

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/internal/play_billing/q2;-><init>(ZLjava/lang/Throwable;)V

    sput-object v0, Lcom/google/android/gms/internal/play_billing/q2;->b:Lcom/google/android/gms/internal/play_billing/q2;

    return-void
.end method

.method public constructor <init>(ZLjava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/play_billing/q2;->a:Ljava/lang/Throwable;

    return-void
.end method
