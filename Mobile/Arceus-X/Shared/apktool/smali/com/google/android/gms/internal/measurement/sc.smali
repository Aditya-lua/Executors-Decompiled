.class public final Lcom/google/android/gms/internal/measurement/sc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/zc;


# instance fields
.field public final a:Lcom/google/android/gms/internal/measurement/oc;

.field public final b:Lcom/google/android/gms/internal/measurement/ld;

.field public final c:Z

.field public final d:Lcom/google/android/gms/internal/measurement/sa;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/ld;Lcom/google/android/gms/internal/measurement/sa;Lcom/google/android/gms/internal/measurement/oc;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/sc;->b:Lcom/google/android/gms/internal/measurement/ld;

    instance-of p1, p3, Lcom/google/android/gms/internal/measurement/db;

    iput-boolean p1, p0, Lcom/google/android/gms/internal/measurement/sc;->c:Z

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/sc;->d:Lcom/google/android/gms/internal/measurement/sa;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/sc;->a:Lcom/google/android/gms/internal/measurement/oc;

    return-void
.end method

.method public static g(Lcom/google/android/gms/internal/measurement/ld;Lcom/google/android/gms/internal/measurement/sa;Lcom/google/android/gms/internal/measurement/oc;)Lcom/google/android/gms/internal/measurement/sc;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/sc;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/measurement/sc;-><init>(Lcom/google/android/gms/internal/measurement/ld;Lcom/google/android/gms/internal/measurement/sa;Lcom/google/android/gms/internal/measurement/oc;)V

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/measurement/db;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/db;->zzb:Lcom/google/android/gms/internal/measurement/wa;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/wa;->e()Z

    move-result p1

    return p1
.end method

.method public final b(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/sc;->b:Lcom/google/android/gms/internal/measurement/ld;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/bd;->d(Lcom/google/android/gms/internal/measurement/ld;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/sc;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/sc;->d:Lcom/google/android/gms/internal/measurement/sa;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/bd;->c(Lcom/google/android/gms/internal/measurement/sa;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final c(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/sc;->b:Lcom/google/android/gms/internal/measurement/ld;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/ld;->b(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/sc;->d:Lcom/google/android/gms/internal/measurement/sa;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/sa;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public final d(Ljava/lang/Object;[BIILcom/google/android/gms/internal/measurement/v9;)V
    .locals 0

    move-object p2, p1

    check-cast p2, Lcom/google/android/gms/internal/measurement/gb;

    iget-object p3, p2, Lcom/google/android/gms/internal/measurement/gb;->zzc:Lcom/google/android/gms/internal/measurement/md;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/md;->a()Lcom/google/android/gms/internal/measurement/md;

    move-result-object p4

    if-eq p3, p4, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/md;->b()Lcom/google/android/gms/internal/measurement/md;

    move-result-object p3

    iput-object p3, p2, Lcom/google/android/gms/internal/measurement/gb;->zzc:Lcom/google/android/gms/internal/measurement/md;

    :goto_0
    check-cast p1, Lcom/google/android/gms/internal/measurement/db;

    const/4 p1, 0x0

    throw p1
.end method

.method public final e(Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/yd;)V
    .locals 5

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/measurement/db;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/db;->zzb:Lcom/google/android/gms/internal/measurement/wa;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/wa;->c()Ljava/util/Iterator;

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

    check-cast v2, Lcom/google/android/gms/internal/measurement/va;

    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/va;->zzc()Lcom/google/android/gms/internal/measurement/xd;

    move-result-object v3

    sget-object v4, Lcom/google/android/gms/internal/measurement/xd;->i:Lcom/google/android/gms/internal/measurement/xd;

    if-ne v3, v4, :cond_1

    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/va;->zzd()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/va;->zze()Z

    move-result v3

    if-nez v3, :cond_1

    instance-of v3, v1, Lcom/google/android/gms/internal/measurement/ub;

    if-eqz v3, :cond_0

    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/va;->zza()I

    move-result v2

    check-cast v1, Lcom/google/android/gms/internal/measurement/ub;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/ub;->a()Lcom/google/android/gms/internal/measurement/wb;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/xb;->c()Lcom/google/android/gms/internal/measurement/ha;

    move-result-object v1

    invoke-interface {p2, v2, v1}, Lcom/google/android/gms/internal/measurement/yd;->J(ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/va;->zza()I

    move-result v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p2, v2, v1}, Lcom/google/android/gms/internal/measurement/yd;->J(ILjava/lang/Object;)V

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Found invalid MessageSet item."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    check-cast p1, Lcom/google/android/gms/internal/measurement/gb;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/gb;->zzc:Lcom/google/android/gms/internal/measurement/md;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/measurement/md;->f(Lcom/google/android/gms/internal/measurement/yd;)V

    return-void
.end method

.method public final f(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/measurement/gb;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/gb;->zzc:Lcom/google/android/gms/internal/measurement/md;

    move-object v1, p2

    check-cast v1, Lcom/google/android/gms/internal/measurement/gb;

    iget-object v1, v1, Lcom/google/android/gms/internal/measurement/gb;->zzc:Lcom/google/android/gms/internal/measurement/md;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/sc;->c:Z

    if-eqz v0, :cond_1

    check-cast p1, Lcom/google/android/gms/internal/measurement/db;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/db;->zzb:Lcom/google/android/gms/internal/measurement/wa;

    check-cast p2, Lcom/google/android/gms/internal/measurement/db;

    iget-object p2, p2, Lcom/google/android/gms/internal/measurement/db;->zzb:Lcom/google/android/gms/internal/measurement/wa;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/measurement/wa;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public final zza()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/sc;->a:Lcom/google/android/gms/internal/measurement/oc;

    instance-of v1, v0, Lcom/google/android/gms/internal/measurement/gb;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/google/android/gms/internal/measurement/gb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/gb;->m()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/oc;->e()Lcom/google/android/gms/internal/measurement/nc;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/nc;->L()Lcom/google/android/gms/internal/measurement/oc;

    move-result-object v0

    return-object v0
.end method

.method public final zzc(Ljava/lang/Object;)I
    .locals 2

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/measurement/gb;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/gb;->zzc:Lcom/google/android/gms/internal/measurement/md;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/measurement/sc;->c:Z

    if-eqz v1, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/measurement/db;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/db;->zzb:Lcom/google/android/gms/internal/measurement/wa;

    mul-int/lit8 v0, v0, 0x35

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/wa;->a:Lcom/google/android/gms/internal/measurement/hd;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/hd;->hashCode()I

    move-result p1

    add-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method public final zze(Ljava/lang/Object;)I
    .locals 2

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/measurement/gb;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/gb;->zzc:Lcom/google/android/gms/internal/measurement/md;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/md;->h()I

    move-result v0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/measurement/sc;->c:Z

    if-eqz v1, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/measurement/db;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/db;->zzb:Lcom/google/android/gms/internal/measurement/wa;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/wa;->g()I

    move-result p1

    add-int/2addr v0, p1

    :cond_0
    return v0
.end method
