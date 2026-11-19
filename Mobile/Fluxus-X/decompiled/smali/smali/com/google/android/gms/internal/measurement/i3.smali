.class public final Lcom/google/android/gms/internal/measurement/i3;
.super Lcom/google/android/gms/internal/measurement/n3;
.source "SourceFile"


# instance fields
.field public final synthetic e:Z

.field public final synthetic f:Lcom/google/android/gms/internal/measurement/z3;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/z3;Z)V
    .locals 0

    iput-boolean p2, p0, Lcom/google/android/gms/internal/measurement/i3;->e:Z

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/i3;->f:Lcom/google/android/gms/internal/measurement/z3;

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/n3;-><init>(Lcom/google/android/gms/internal/measurement/z3;Z)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/i3;->f:Lcom/google/android/gms/internal/measurement/z3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/z3;->m()Lcom/google/android/gms/internal/measurement/u1;

    move-result-object v0

    invoke-static {v0}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/u1;

    iget-boolean v1, p0, Lcom/google/android/gms/internal/measurement/i3;->e:Z

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/measurement/u1;->setDataCollectionEnabled(Z)V

    return-void
.end method
