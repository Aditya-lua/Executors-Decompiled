.class public final Lcom/google/android/gms/internal/measurement/f3;
.super Lcom/google/android/gms/internal/measurement/j3;
.source "SourceFile"


# instance fields
.field public final synthetic e:Lcom/google/android/gms/internal/measurement/k3;

.field public final synthetic f:Lcom/google/android/gms/internal/measurement/v3;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/v3;Lcom/google/android/gms/internal/measurement/k3;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/f3;->e:Lcom/google/android/gms/internal/measurement/k3;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/f3;->f:Lcom/google/android/gms/internal/measurement/v3;

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/j3;-><init>(Lcom/google/android/gms/internal/measurement/v3;Z)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/f3;->f:Lcom/google/android/gms/internal/measurement/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/v3;->m()Lcom/google/android/gms/internal/measurement/u1;

    move-result-object v0

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/u1;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/f3;->e:Lcom/google/android/gms/internal/measurement/k3;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/measurement/u1;->setEventInterceptor(Lcom/google/android/gms/internal/measurement/e2;)V

    return-void
.end method
