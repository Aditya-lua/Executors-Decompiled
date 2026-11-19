.class public final Lcom/google/android/gms/internal/play_billing/v6;
.super Lcom/google/android/gms/internal/play_billing/t6;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/play_billing/t6;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/play_billing/t4;

    iget-object v0, p1, Lcom/google/android/gms/internal/play_billing/t4;->zzc:Lcom/google/android/gms/internal/play_billing/u6;

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/u6;->c()Lcom/google/android/gms/internal/play_billing/u6;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/u6;->f()Lcom/google/android/gms/internal/play_billing/u6;

    move-result-object v0

    iput-object v0, p1, Lcom/google/android/gms/internal/play_billing/t4;->zzc:Lcom/google/android/gms/internal/play_billing/u6;

    :cond_0
    return-object v0
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/play_billing/t4;

    iget-object p1, p1, Lcom/google/android/gms/internal/play_billing/t4;->zzc:Lcom/google/android/gms/internal/play_billing/u6;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/u6;->h()V

    return-void
.end method
