.class public final Lcom/google/android/gms/internal/play_billing/y9;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lcom/google/android/gms/internal/play_billing/v9;)Lcom/google/android/gms/internal/play_billing/i2;
    .locals 3
    .param p0    # Lcom/google/android/gms/internal/play_billing/v9;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/play_billing/t9;

    invoke-direct {v0}, Lcom/google/android/gms/internal/play_billing/t9;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/play_billing/x9;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/play_billing/x9;-><init>(Lcom/google/android/gms/internal/play_billing/t9;)V

    iput-object v1, v0, Lcom/google/android/gms/internal/play_billing/t9;->b:Lcom/google/android/gms/internal/play_billing/x9;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    iput-object v2, v0, Lcom/google/android/gms/internal/play_billing/t9;->a:Ljava/lang/Object;

    :try_start_0
    invoke-interface {p0, v0}, Lcom/google/android/gms/internal/play_billing/v9;->a(Lcom/google/android/gms/internal/play_billing/t9;)Ljava/lang/Object;

    move-result-object p0

    iput-object p0, v0, Lcom/google/android/gms/internal/play_billing/t9;->a:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception p0

    invoke-virtual {v1, p0}, Lcom/google/android/gms/internal/play_billing/x9;->d(Ljava/lang/Throwable;)Z

    return-object v1
.end method
