.class public final Lcom/google/android/gms/internal/measurement/u3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/measurement/v3;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/v3;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/u3;->a:Lcom/google/android/gms/internal/measurement/v3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/m3;

    invoke-direct {v0, p0, p2, p1}, Lcom/google/android/gms/internal/measurement/m3;-><init>(Lcom/google/android/gms/internal/measurement/u3;Landroid/os/Bundle;Landroid/app/Activity;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/u3;->a:Lcom/google/android/gms/internal/measurement/v3;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/measurement/v3;->i(Lcom/google/android/gms/internal/measurement/j3;)V

    return-void
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/s3;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/measurement/s3;-><init>(Lcom/google/android/gms/internal/measurement/u3;Landroid/app/Activity;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/u3;->a:Lcom/google/android/gms/internal/measurement/v3;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/measurement/v3;->i(Lcom/google/android/gms/internal/measurement/j3;)V

    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/p3;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/measurement/p3;-><init>(Lcom/google/android/gms/internal/measurement/u3;Landroid/app/Activity;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/u3;->a:Lcom/google/android/gms/internal/measurement/v3;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/measurement/v3;->i(Lcom/google/android/gms/internal/measurement/j3;)V

    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/o3;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/measurement/o3;-><init>(Lcom/google/android/gms/internal/measurement/u3;Landroid/app/Activity;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/u3;->a:Lcom/google/android/gms/internal/measurement/v3;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/measurement/v3;->i(Lcom/google/android/gms/internal/measurement/j3;)V

    return-void
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/measurement/r1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/r1;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/measurement/r3;

    invoke-direct {v1, p0, p1, v0}, Lcom/google/android/gms/internal/measurement/r3;-><init>(Lcom/google/android/gms/internal/measurement/u3;Landroid/app/Activity;Lcom/google/android/gms/internal/measurement/r1;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/u3;->a:Lcom/google/android/gms/internal/measurement/v3;

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/measurement/v3;->i(Lcom/google/android/gms/internal/measurement/j3;)V

    const-wide/16 v1, 0x32

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/r1;->u2(J)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p2, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/n3;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/measurement/n3;-><init>(Lcom/google/android/gms/internal/measurement/u3;Landroid/app/Activity;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/u3;->a:Lcom/google/android/gms/internal/measurement/v3;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/measurement/v3;->i(Lcom/google/android/gms/internal/measurement/j3;)V

    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/q3;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/measurement/q3;-><init>(Lcom/google/android/gms/internal/measurement/u3;Landroid/app/Activity;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/u3;->a:Lcom/google/android/gms/internal/measurement/v3;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/measurement/v3;->i(Lcom/google/android/gms/internal/measurement/j3;)V

    return-void
.end method
