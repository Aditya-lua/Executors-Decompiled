.class public final Lcom/google/android/gms/internal/measurement/wc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/dd;


# instance fields
.field public final a:Lcom/google/android/gms/internal/measurement/sc;

.field public final b:Lcom/google/android/gms/internal/measurement/pd;

.field public final c:Z

.field public final d:Lcom/google/android/gms/internal/measurement/wa;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/pd;Lcom/google/android/gms/internal/measurement/wa;Lcom/google/android/gms/internal/measurement/sc;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/wc;->b:Lcom/google/android/gms/internal/measurement/pd;

    instance-of p1, p3, Lcom/google/android/gms/internal/measurement/hb;

    iput-boolean p1, p0, Lcom/google/android/gms/internal/measurement/wc;->c:Z

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/wc;->d:Lcom/google/android/gms/internal/measurement/wa;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/wc;->a:Lcom/google/android/gms/internal/measurement/sc;

    return-void
.end method

.method public static g(Lcom/google/android/gms/internal/measurement/pd;Lcom/google/android/gms/internal/measurement/wa;Lcom/google/android/gms/internal/measurement/sc;)Lcom/google/android/gms/internal/measurement/wc;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/wc;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/measurement/wc;-><init>(Lcom/google/android/gms/internal/measurement/pd;Lcom/google/android/gms/internal/measurement/wa;Lcom/google/android/gms/internal/measurement/sc;)V

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/measurement/hb;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/hb;->zzb:Lcom/google/android/gms/internal/measurement/ab;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/ab;->e()Z

    move-result p1

    return p1
.end method

.method public final b(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/wc;->b:Lcom/google/android/gms/internal/measurement/pd;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/fd;->d(Lcom/google/android/gms/internal/measurement/pd;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/wc;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/wc;->d:Lcom/google/android/gms/internal/measurement/wa;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/fd;->c(Lcom/google/android/gms/internal/measurement/wa;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final c(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/wc;->b:Lcom/google/android/gms/internal/measurement/pd;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/pd;->b(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/wc;->d:Lcom/google/android/gms/internal/measurement/wa;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/wa;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public final d(Ljava/lang/Object;[BIILcom/google/android/gms/internal/measurement/z9;)V
    .locals 0

    move-object p2, p1

    check-cast p2, Lcom/google/android/gms/internal/measurement/kb;

    iget-object p3, p2, Lcom/google/android/gms/internal/measurement/kb;->zzc:Lcom/google/android/gms/internal/measurement/qd;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/qd;->a()Lcom/google/android/gms/internal/measurement/qd;

    move-result-object p4

    if-eq p3, p4, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/qd;->b()Lcom/google/android/gms/internal/measurement/qd;

    move-result-object p3

    iput-object p3, p2, Lcom/google/android/gms/internal/measurement/kb;->zzc:Lcom/google/android/gms/internal/measurement/qd;

    :goto_0
    check-cast p1, Lcom/google/android/gms/internal/measurement/hb;

    const/4 p1, 0x0

    throw p1
.end method

.method public final e(Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/ce;)V
    .locals 5

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/measurement/hb;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/hb;->zzb:Lcom/google/android/gms/internal/measurement/ab;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/ab;->c()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/za;

    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/za;->zzc()Lcom/google/android/gms/internal/measurement/be;

    move-result-object v3

    sget-object v4, Lcom/google/android/gms/internal/measurement/be;->i:Lcom/google/android/gms/internal/measurement/be;

    if-ne v3, v4, :cond_1

    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/za;->zzd()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/za;->zze()Z

    move-result v3

    if-nez v3, :cond_1

    instance-of v3, v1, Lcom/google/android/gms/internal/measurement/yb;

    if-eqz v3, :cond_0

    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/za;->zza()I

    move-result v2

    check-cast v1, Lcom/google/android/gms/internal/measurement/yb;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/yb;->a()Lcom/google/android/gms/internal/measurement/ac;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/bc;->c()Lcom/google/android/gms/internal/measurement/la;

    move-result-object v1

    invoke-interface {p2, v2, v1}, Lcom/google/android/gms/internal/measurement/ce;->J(ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/za;->zza()I

    move-result v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p2, v2, v1}, Lcom/google/android/gms/internal/measurement/ce;->J(ILjava/lang/Object;)V

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Found invalid MessageSet item."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    check-cast p1, Lcom/google/android/gms/internal/measurement/kb;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/kb;->zzc:Lcom/google/android/gms/internal/measurement/qd;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/measurement/qd;->f(Lcom/google/android/gms/internal/measurement/ce;)V

    return-void
.end method

.method public final f(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/measurement/kb;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/kb;->zzc:Lcom/google/android/gms/internal/measurement/qd;

    move-object v1, p2

    check-cast v1, Lcom/google/android/gms/internal/measurement/kb;

    iget-object v1, v1, Lcom/google/android/gms/internal/measurement/kb;->zzc:Lcom/google/android/gms/internal/measurement/qd;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/wc;->c:Z

    if-eqz v0, :cond_1

    check-cast p1, Lcom/google/android/gms/internal/measurement/hb;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/hb;->zzb:Lcom/google/android/gms/internal/measurement/ab;

    check-cast p2, Lcom/google/android/gms/internal/measurement/hb;

    iget-object p2, p2, Lcom/google/android/gms/internal/measurement/hb;->zzb:Lcom/google/android/gms/internal/measurement/ab;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/measurement/ab;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public final zza()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/wc;->a:Lcom/google/android/gms/internal/measurement/sc;

    instance-of v1, v0, Lcom/google/android/gms/internal/measurement/kb;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/google/android/gms/internal/measurement/kb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/kb;->m()Lcom/google/android/gms/internal/measurement/kb;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/sc;->e()Lcom/google/android/gms/internal/measurement/rc;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/rc;->T()Lcom/google/android/gms/internal/measurement/sc;

    move-result-object v0

    return-object v0
.end method

.method public final zzc(Ljava/lang/Object;)I
    .locals 2

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/measurement/kb;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/kb;->zzc:Lcom/google/android/gms/internal/measurement/qd;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/measurement/wc;->c:Z

    if-eqz v1, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/measurement/hb;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/hb;->zzb:Lcom/google/android/gms/internal/measurement/ab;

    mul-int/lit8 v0, v0, 0x35

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/ab;->a:Lcom/google/android/gms/internal/measurement/ld;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/ld;->hashCode()I

    move-result p1

    add-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method public final zze(Ljava/lang/Object;)I
    .locals 2

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/measurement/kb;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/kb;->zzc:Lcom/google/android/gms/internal/measurement/qd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/qd;->h()I

    move-result v0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/measurement/wc;->c:Z

    if-eqz v1, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/measurement/hb;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/hb;->zzb:Lcom/google/android/gms/internal/measurement/ab;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/ab;->g()I

    move-result p1

    add-int/2addr v0, p1

    :cond_0
    return v0
.end method
