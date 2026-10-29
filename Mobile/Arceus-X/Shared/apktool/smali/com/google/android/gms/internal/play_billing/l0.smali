.class public final Lcom/google/android/gms/internal/play_billing/l0;
.super Lcom/google/android/gms/internal/play_billing/n0;
.source "SourceFile"


# instance fields
.field public final transient c:I

.field public final transient d:I

.field public final synthetic e:Lcom/google/android/gms/internal/play_billing/n0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/play_billing/n0;II)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/l0;->e:Lcom/google/android/gms/internal/play_billing/n0;

    invoke-direct {p0}, Lcom/google/android/gms/internal/play_billing/n0;-><init>()V

    iput p2, p0, Lcom/google/android/gms/internal/play_billing/l0;->c:I

    iput p3, p0, Lcom/google/android/gms/internal/play_billing/l0;->d:I

    return-void
.end method


# virtual methods
.method public final b()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/l0;->e:Lcom/google/android/gms/internal/play_billing/n0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/j0;->c()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/play_billing/l0;->c:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/google/android/gms/internal/play_billing/l0;->d:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final c()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/l0;->e:Lcom/google/android/gms/internal/play_billing/n0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/j0;->c()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/play_billing/l0;->c:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final e()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final f()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/l0;->e:Lcom/google/android/gms/internal/play_billing/n0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/j0;->f()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final g(II)Lcom/google/android/gms/internal/play_billing/n0;
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/play_billing/l0;->d:I

    invoke-static {p1, p2, v0}, Lcom/google/android/gms/internal/play_billing/x;->d(III)V

    iget v0, p0, Lcom/google/android/gms/internal/play_billing/l0;->c:I

    iget-object v1, p0, Lcom/google/android/gms/internal/play_billing/l0;->e:Lcom/google/android/gms/internal/play_billing/n0;

    add-int/2addr p1, v0

    add-int/2addr p2, v0

    invoke-virtual {v1, p1, p2}, Lcom/google/android/gms/internal/play_billing/n0;->g(II)Lcom/google/android/gms/internal/play_billing/n0;

    move-result-object p1

    return-object p1
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/play_billing/l0;->d:I

    const-string v1, "index"

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/x;->a(IILjava/lang/String;)I

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/l0;->e:Lcom/google/android/gms/internal/play_billing/n0;

    iget v1, p0, Lcom/google/android/gms/internal/play_billing/l0;->c:I

    add-int/2addr p1, v1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/play_billing/l0;->d:I

    return v0
.end method

.method public final bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/play_billing/n0;->g(II)Lcom/google/android/gms/internal/play_billing/n0;

    move-result-object p1

    return-object p1
.end method
