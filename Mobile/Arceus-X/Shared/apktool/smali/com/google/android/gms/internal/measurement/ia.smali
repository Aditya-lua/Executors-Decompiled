.class public final Lcom/google/android/gms/internal/measurement/ia;
.super Lcom/google/android/gms/internal/measurement/ja;
.source "SourceFile"


# instance fields
.field public b:I

.field public c:I

.field public d:I


# direct methods
.method public synthetic constructor <init>([BIIZ[B)V
    .locals 0

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/ja;-><init>([B)V

    const p1, 0x7fffffff

    iput p1, p0, Lcom/google/android/gms/internal/measurement/ia;->d:I

    const/4 p1, 0x0

    iput p1, p0, Lcom/google/android/gms/internal/measurement/ia;->b:I

    return-void
.end method


# virtual methods
.method public final c(I)I
    .locals 3

    iget p1, p0, Lcom/google/android/gms/internal/measurement/ia;->d:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/measurement/ia;->d:I

    iget v1, p0, Lcom/google/android/gms/internal/measurement/ia;->b:I

    iget v2, p0, Lcom/google/android/gms/internal/measurement/ia;->c:I

    add-int/2addr v1, v2

    iput v1, p0, Lcom/google/android/gms/internal/measurement/ia;->b:I

    if-lez v1, :cond_0

    iput v1, p0, Lcom/google/android/gms/internal/measurement/ia;->c:I

    iput v0, p0, Lcom/google/android/gms/internal/measurement/ia;->b:I

    return p1

    :cond_0
    iput v0, p0, Lcom/google/android/gms/internal/measurement/ia;->c:I

    return p1
.end method
