.class public final Lnb/pe;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:Lcom/google/android/gms/internal/measurement/y6;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/util/Map;

.field public final e:Lnb/za;

.field public final f:J

.field public final g:J

.field public final h:J

.field public final i:I


# direct methods
.method public synthetic constructor <init>(JLcom/google/android/gms/internal/measurement/y6;Ljava/lang/String;Ljava/util/Map;Lnb/za;JJJI[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lnb/pe;->a:J

    iput-object p3, p0, Lnb/pe;->b:Lcom/google/android/gms/internal/measurement/y6;

    iput-object p4, p0, Lnb/pe;->c:Ljava/lang/String;

    iput-object p5, p0, Lnb/pe;->d:Ljava/util/Map;

    iput-object p6, p0, Lnb/pe;->e:Lnb/za;

    iput-wide p7, p0, Lnb/pe;->f:J

    iput-wide p9, p0, Lnb/pe;->g:J

    iput-wide p11, p0, Lnb/pe;->h:J

    iput p13, p0, Lnb/pe;->i:I

    return-void
.end method


# virtual methods
.method public final a()Lnb/yd;
    .locals 5

    new-instance v0, Lnb/yd;

    iget-object v1, p0, Lnb/pe;->c:Ljava/lang/String;

    iget-object v2, p0, Lnb/pe;->d:Ljava/util/Map;

    iget-object v3, p0, Lnb/pe;->e:Lnb/za;

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lnb/yd;-><init>(Ljava/lang/String;Ljava/util/Map;Lnb/za;Lcom/google/android/gms/internal/measurement/p7;)V

    return-object v0
.end method

.method public final b()Lcom/google/android/gms/measurement/internal/zzom;
    .locals 11

    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    iget-object v0, p0, Lnb/pe;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v5, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-wide v1, p0, Lnb/pe;->a:J

    iget-object v0, p0, Lnb/pe;->b:Lcom/google/android/gms/internal/measurement/y6;

    iget-object v4, p0, Lnb/pe;->c:Ljava/lang/String;

    iget-object v3, p0, Lnb/pe;->e:Lnb/za;

    iget-wide v7, p0, Lnb/pe;->g:J

    move-object v6, v0

    new-instance v0, Lcom/google/android/gms/measurement/internal/zzom;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/r9;->d()[B

    move-result-object v6

    invoke-virtual {v3}, Lnb/za;->zza()I

    move-result v3

    const-string v9, ""

    move-object v10, v6

    move v6, v3

    move-object v3, v10

    invoke-direct/range {v0 .. v9}, Lcom/google/android/gms/measurement/internal/zzom;-><init>(J[BLjava/lang/String;Landroid/os/Bundle;IJLjava/lang/String;)V

    return-object v0
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, Lnb/pe;->a:J

    return-wide v0
.end method

.method public final d()Lcom/google/android/gms/internal/measurement/y6;
    .locals 1

    iget-object v0, p0, Lnb/pe;->b:Lcom/google/android/gms/internal/measurement/y6;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnb/pe;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final f()Lnb/za;
    .locals 1

    iget-object v0, p0, Lnb/pe;->e:Lnb/za;

    return-object v0
.end method

.method public final g()J
    .locals 2

    iget-wide v0, p0, Lnb/pe;->f:J

    return-wide v0
.end method

.method public final h()J
    .locals 2

    iget-wide v0, p0, Lnb/pe;->h:J

    return-wide v0
.end method

.method public final i()I
    .locals 1

    iget v0, p0, Lnb/pe;->i:I

    return v0
.end method
