.class public abstract Lcom/google/android/gms/internal/measurement/e1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/android/gms/internal/measurement/e1;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/google/android/gms/internal/measurement/w0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/w0;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/w0;->e(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/c1;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/c1;->a(Z)Lcom/google/android/gms/internal/measurement/c1;

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/measurement/c1;->c(I)Lcom/google/android/gms/internal/measurement/c1;

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/measurement/c1;->d(I)Lcom/google/android/gms/internal/measurement/c1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/c1;->b()Lcom/google/android/gms/internal/measurement/e1;

    new-instance v0, Lcom/google/android/gms/internal/measurement/w0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/w0;-><init>()V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/w0;->e(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/c1;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/c1;->a(Z)Lcom/google/android/gms/internal/measurement/c1;

    const/4 v4, 0x4

    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/measurement/c1;->c(I)Lcom/google/android/gms/internal/measurement/c1;

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/measurement/c1;->d(I)Lcom/google/android/gms/internal/measurement/c1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/c1;->b()Lcom/google/android/gms/internal/measurement/e1;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/measurement/e1;->a:Lcom/google/android/gms/internal/measurement/e1;

    new-instance v0, Lcom/google/android/gms/internal/measurement/w0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/w0;-><init>()V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/w0;->e(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/c1;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/c1;->a(Z)Lcom/google/android/gms/internal/measurement/c1;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/c1;->c(I)Lcom/google/android/gms/internal/measurement/c1;

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/measurement/c1;->d(I)Lcom/google/android/gms/internal/measurement/c1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/c1;->b()Lcom/google/android/gms/internal/measurement/e1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Ljava/lang/String;
.end method

.method public abstract b()Z
.end method

.method public abstract c()Lcom/google/android/gms/internal/measurement/u0;
.end method

.method public abstract d()Lcom/google/android/gms/internal/measurement/v0;
.end method

.method public abstract e()I
.end method

.method public abstract f()I
.end method
