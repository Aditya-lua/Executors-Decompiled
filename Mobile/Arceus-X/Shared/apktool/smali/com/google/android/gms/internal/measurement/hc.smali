.class public final Lcom/google/android/gms/internal/measurement/hc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/google/android/gms/internal/measurement/gc;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/wd;Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/wd;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p2, Lcom/google/android/gms/internal/measurement/gc;

    const-string p4, ""

    invoke-direct {p2, p1, p4, p3, p4}, Lcom/google/android/gms/internal/measurement/gc;-><init>(Lcom/google/android/gms/internal/measurement/wd;Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/wd;Ljava/lang/Object;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/hc;->a:Lcom/google/android/gms/internal/measurement/gc;

    return-void
.end method

.method public static a(Lcom/google/android/gms/internal/measurement/wd;Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/wd;Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/hc;
    .locals 0

    new-instance p1, Lcom/google/android/gms/internal/measurement/hc;

    const-string p3, ""

    invoke-direct {p1, p0, p3, p2, p3}, Lcom/google/android/gms/internal/measurement/hc;-><init>(Lcom/google/android/gms/internal/measurement/wd;Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/wd;Ljava/lang/Object;)V

    return-object p1
.end method

.method public static b(Lcom/google/android/gms/internal/measurement/ma;Lcom/google/android/gms/internal/measurement/gc;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/gc;->a:Lcom/google/android/gms/internal/measurement/wd;

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, p2}, Lcom/google/android/gms/internal/measurement/wa;->f(Lcom/google/android/gms/internal/measurement/ma;Lcom/google/android/gms/internal/measurement/wd;ILjava/lang/Object;)V

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/gc;->c:Lcom/google/android/gms/internal/measurement/wd;

    const/4 p2, 0x2

    invoke-static {p0, p1, p2, p3}, Lcom/google/android/gms/internal/measurement/wa;->f(Lcom/google/android/gms/internal/measurement/ma;Lcom/google/android/gms/internal/measurement/wd;ILjava/lang/Object;)V

    return-void
.end method

.method public static c(Lcom/google/android/gms/internal/measurement/gc;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/gc;->a:Lcom/google/android/gms/internal/measurement/wd;

    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/gc;->c:Lcom/google/android/gms/internal/measurement/wd;

    const/4 v1, 0x1

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/measurement/wa;->h(Lcom/google/android/gms/internal/measurement/wd;ILjava/lang/Object;)I

    move-result p1

    const/4 v0, 0x2

    invoke-static {p0, v0, p2}, Lcom/google/android/gms/internal/measurement/wa;->h(Lcom/google/android/gms/internal/measurement/wd;ILjava/lang/Object;)I

    move-result p0

    add-int/2addr p1, p0

    return p1
.end method


# virtual methods
.method public final d(ILjava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/hc;->a:Lcom/google/android/gms/internal/measurement/gc;

    shl-int/lit8 p1, p1, 0x3

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result p1

    invoke-static {v0, p2, p3}, Lcom/google/android/gms/internal/measurement/hc;->c(Lcom/google/android/gms/internal/measurement/gc;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p2

    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/ma;->G(I)I

    move-result p3

    add-int/2addr p3, p2

    add-int/2addr p1, p3

    return p1
.end method

.method public final e()Lcom/google/android/gms/internal/measurement/gc;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/hc;->a:Lcom/google/android/gms/internal/measurement/gc;

    return-object v0
.end method
