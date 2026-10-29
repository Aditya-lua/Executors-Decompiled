.class public final Lcom/google/android/gms/internal/measurement/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/measurement/k;

.field public final synthetic b:Lcom/google/android/gms/internal/measurement/u4;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/k;Lcom/google/android/gms/internal/measurement/u4;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/b0;->a:Lcom/google/android/gms/internal/measurement/k;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/b0;->b:Lcom/google/android/gms/internal/measurement/u4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 5

    check-cast p1, Lcom/google/android/gms/internal/measurement/q;

    instance-of v0, p1, Lcom/google/android/gms/internal/measurement/v;

    check-cast p2, Lcom/google/android/gms/internal/measurement/q;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    instance-of p1, p2, Lcom/google/android/gms/internal/measurement/v;

    if-nez p1, :cond_0

    return v2

    :cond_0
    return v1

    :cond_1
    instance-of v0, p2, Lcom/google/android/gms/internal/measurement/v;

    if-eqz v0, :cond_2

    const/4 p1, -0x1

    return p1

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/b0;->a:Lcom/google/android/gms/internal/measurement/k;

    if-nez v0, :cond_3

    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/q;->zzc()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2}, Lcom/google/android/gms/internal/measurement/q;->zzc()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1

    :cond_3
    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/b0;->b:Lcom/google/android/gms/internal/measurement/u4;

    const/4 v4, 0x2

    new-array v4, v4, [Lcom/google/android/gms/internal/measurement/q;

    aput-object p1, v4, v1

    aput-object p2, v4, v2

    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, v3, p1}, Lcom/google/android/gms/internal/measurement/k;->h(Lcom/google/android/gms/internal/measurement/u4;Ljava/util/List;)Lcom/google/android/gms/internal/measurement/q;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/q;->zzd()Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p1

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/measurement/v5;->i(D)D

    move-result-wide p1

    double-to-int p1, p1

    return p1
.end method
