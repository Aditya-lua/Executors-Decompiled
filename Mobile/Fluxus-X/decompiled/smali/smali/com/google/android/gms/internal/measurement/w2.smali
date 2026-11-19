.class public final Lcom/google/android/gms/internal/measurement/w2;
.super Lcom/google/android/gms/internal/measurement/n3;
.source "SourceFile"


# instance fields
.field public final synthetic e:Ljava/lang/Runnable;

.field public final synthetic f:Lcom/google/android/gms/internal/measurement/z3;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/z3;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/w2;->e:Ljava/lang/Runnable;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/w2;->f:Lcom/google/android/gms/internal/measurement/z3;

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/n3;-><init>(Lcom/google/android/gms/internal/measurement/z3;Z)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/w2;->f:Lcom/google/android/gms/internal/measurement/z3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/z3;->m()Lcom/google/android/gms/internal/measurement/u1;

    move-result-object v0

    invoke-static {v0}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/u1;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/w2;->e:Ljava/lang/Runnable;

    new-instance v2, Lcom/google/android/gms/internal/measurement/v2;

    invoke-direct {v2, p0, v1}, Lcom/google/android/gms/internal/measurement/v2;-><init>(Lcom/google/android/gms/internal/measurement/w2;Ljava/lang/Runnable;)V

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/measurement/u1;->retrieveAndUploadBatches(Lcom/google/android/gms/internal/measurement/a2;)V

    return-void
.end method
