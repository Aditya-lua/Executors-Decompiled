.class public final Lcom/google/android/gms/internal/measurement/a3;
.super Lcom/google/android/gms/internal/measurement/j3;
.source "SourceFile"


# instance fields
.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Lcom/google/android/gms/internal/measurement/v3;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/v3;ZILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput-object p4, p0, Lcom/google/android/gms/internal/measurement/a3;->e:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/internal/measurement/a3;->f:Ljava/lang/Object;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/a3;->g:Lcom/google/android/gms/internal/measurement/v3;

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/j3;-><init>(Lcom/google/android/gms/internal/measurement/v3;Z)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/a3;->g:Lcom/google/android/gms/internal/measurement/v3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/v3;->m()Lcom/google/android/gms/internal/measurement/u1;

    move-result-object v0

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/google/android/gms/internal/measurement/u1;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/a3;->f:Ljava/lang/Object;

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/a3;->e:Ljava/lang/String;

    invoke-static {v0}, Ly9/b;->u2(Ljava/lang/Object;)Ly9/a;

    move-result-object v4

    const/4 v0, 0x0

    invoke-static {v0}, Ly9/b;->u2(Ljava/lang/Object;)Ly9/a;

    move-result-object v5

    invoke-static {v0}, Ly9/b;->u2(Ljava/lang/Object;)Ly9/a;

    move-result-object v6

    const/4 v2, 0x5

    invoke-interface/range {v1 .. v6}, Lcom/google/android/gms/internal/measurement/u1;->logHealthData(ILjava/lang/String;Ly9/a;Ly9/a;Ly9/a;)V

    return-void
.end method
