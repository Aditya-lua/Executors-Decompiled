.class public final Lcom/google/android/gms/internal/play_billing/x0;
.super Lcom/google/android/gms/internal/play_billing/n0;
.source "SourceFile"


# instance fields
.field public final synthetic c:Lcom/google/android/gms/internal/play_billing/y0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/play_billing/y0;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/x0;->c:Lcom/google/android/gms/internal/play_billing/y0;

    invoke-direct {p0}, Lcom/google/android/gms/internal/play_billing/n0;-><init>()V

    return-void
.end method


# virtual methods
.method public final e()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final bridge synthetic get(I)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/x0;->c:Lcom/google/android/gms/internal/play_billing/y0;

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/y0;->p(Lcom/google/android/gms/internal/play_billing/y0;)I

    move-result v1

    const-string v2, "index"

    invoke-static {p1, v1, v2}, Lcom/google/android/gms/internal/play_billing/x;->a(IILjava/lang/String;)I

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/y0;->t(Lcom/google/android/gms/internal/play_billing/y0;)[Ljava/lang/Object;

    move-result-object v1

    add-int/2addr p1, p1

    aget-object v1, v1, p1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/y0;->t(Lcom/google/android/gms/internal/play_billing/y0;)[Ljava/lang/Object;

    move-result-object v0

    add-int/lit8 p1, p1, 0x1

    aget-object p1, v0, p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ljava/util/AbstractMap$SimpleImmutableEntry;

    invoke-direct {v0, v1, p1}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/x0;->c:Lcom/google/android/gms/internal/play_billing/y0;

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/y0;->p(Lcom/google/android/gms/internal/play_billing/y0;)I

    move-result v0

    return v0
.end method
