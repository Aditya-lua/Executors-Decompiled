.class public final Lcom/google/android/gms/internal/measurement/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public a:I

.field public final synthetic b:Lcom/google/android/gms/internal/measurement/u;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/u;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/t;->b:Lcom/google/android/gms/internal/measurement/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput p1, p0, Lcom/google/android/gms/internal/measurement/t;->a:I

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/t;->b:Lcom/google/android/gms/internal/measurement/u;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/u;->b()Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lcom/google/android/gms/internal/measurement/t;->a:I

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-ge v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final bridge synthetic next()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/t;->b:Lcom/google/android/gms/internal/measurement/u;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/u;->b()Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lcom/google/android/gms/internal/measurement/t;->a:I

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v2, v1, :cond_0

    add-int/lit8 v1, v2, 0x1

    new-instance v3, Lcom/google/android/gms/internal/measurement/u;

    iput v1, p0, Lcom/google/android/gms/internal/measurement/t;->a:I

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/u;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Lcom/google/android/gms/internal/measurement/u;-><init>(Ljava/lang/String;)V

    return-object v3

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
