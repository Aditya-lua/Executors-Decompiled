.class public final Lcom/google/android/gms/internal/play_billing/m4;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Throwable;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/play_billing/m4;

    new-instance v1, Lcom/google/android/gms/internal/play_billing/l3;

    const-string v2, "Failure occurred while trying to finish a future."

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/play_billing/l3;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/play_billing/m4;-><init>(Ljava/lang/Throwable;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-boolean v0, Lcom/google/android/gms/internal/play_billing/s9;->d:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/m4;->a:Ljava/lang/Throwable;

    return-void
.end method
