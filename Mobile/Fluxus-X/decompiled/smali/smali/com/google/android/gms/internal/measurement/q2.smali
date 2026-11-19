.class public final Lcom/google/android/gms/internal/measurement/q2;
.super Lcom/google/android/gms/internal/measurement/n3;
.source "SourceFile"


# instance fields
.field public final synthetic e:Ljava/lang/Boolean;

.field public final synthetic f:Lcom/google/android/gms/internal/measurement/z3;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/z3;Ljava/lang/Boolean;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/q2;->e:Ljava/lang/Boolean;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/q2;->f:Lcom/google/android/gms/internal/measurement/z3;

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/n3;-><init>(Lcom/google/android/gms/internal/measurement/z3;Z)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/q2;->f:Lcom/google/android/gms/internal/measurement/z3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/z3;->m()Lcom/google/android/gms/internal/measurement/u1;

    move-result-object v0

    invoke-static {v0}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/u1;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/q2;->e:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    iget-wide v2, p0, Lcom/google/android/gms/internal/measurement/n3;->a:J

    invoke-interface {v0, v1, v2, v3}, Lcom/google/android/gms/internal/measurement/u1;->setMeasurementEnabled(ZJ)V

    return-void
.end method
