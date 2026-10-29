.class public final Lcom/google/android/gms/internal/play_billing/i1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field public final a:Lcom/google/android/gms/internal/play_billing/m1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/play_billing/m1<",
            "TV;>;"
        }
    .end annotation
.end field

.field public final b:Lcom/google/android/gms/internal/play_billing/i2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/play_billing/i2<",
            "+TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/play_billing/m1;Lcom/google/android/gms/internal/play_billing/i2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/i1;->a:Lcom/google/android/gms/internal/play_billing/m1;

    iput-object p2, p0, Lcom/google/android/gms/internal/play_billing/i1;->b:Lcom/google/android/gms/internal/play_billing/i2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/i1;->a:Lcom/google/android/gms/internal/play_billing/m1;

    iget-object v0, v0, Lcom/google/android/gms/internal/play_billing/s1;->a:Ljava/lang/Object;

    if-eq v0, p0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/i1;->b:Lcom/google/android/gms/internal/play_billing/i2;

    iget-object v1, p0, Lcom/google/android/gms/internal/play_billing/i1;->a:Lcom/google/android/gms/internal/play_billing/m1;

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/m1;->l(Lcom/google/android/gms/internal/play_billing/i2;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1, p0, v0}, Lcom/google/android/gms/internal/play_billing/s1;->k(Lcom/google/android/gms/internal/play_billing/s1;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/i1;->a:Lcom/google/android/gms/internal/play_billing/m1;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/play_billing/m1;->o(Lcom/google/android/gms/internal/play_billing/m1;Z)V

    :cond_1
    :goto_0
    return-void
.end method
