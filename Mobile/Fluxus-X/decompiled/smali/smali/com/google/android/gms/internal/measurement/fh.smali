.class public final Lcom/google/android/gms/internal/measurement/fh;
.super Lcom/google/android/gms/internal/measurement/k;
.source "SourceFile"


# instance fields
.field public final c:Lcom/google/android/gms/internal/measurement/kg;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/kg;)V
    .locals 5

    const-string v0, "internal.logger"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/k;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/fh;->c:Lcom/google/android/gms/internal/measurement/kg;

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/k;->b:Ljava/util/Map;

    new-instance v0, Lcom/google/android/gms/internal/measurement/eh;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, p0, v1, v2}, Lcom/google/android/gms/internal/measurement/eh;-><init>(Lcom/google/android/gms/internal/measurement/fh;ZZ)V

    const-string v3, "log"

    invoke-interface {p1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/k;->b:Ljava/util/Map;

    new-instance v0, Lcom/google/android/gms/internal/measurement/he;

    const-string v4, "silent"

    invoke-direct {v0, p0, v4}, Lcom/google/android/gms/internal/measurement/he;-><init>(Lcom/google/android/gms/internal/measurement/fh;Ljava/lang/String;)V

    invoke-interface {p1, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/k;->b:Ljava/util/Map;

    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/k;

    new-instance v0, Lcom/google/android/gms/internal/measurement/eh;

    invoke-direct {v0, p0, v2, v2}, Lcom/google/android/gms/internal/measurement/eh;-><init>(Lcom/google/android/gms/internal/measurement/fh;ZZ)V

    invoke-virtual {p1, v3, v0}, Lcom/google/android/gms/internal/measurement/k;->d(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/q;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/k;->b:Ljava/util/Map;

    new-instance v0, Lcom/google/android/gms/internal/measurement/jf;

    const-string v2, "unmonitored"

    invoke-direct {v0, p0, v2}, Lcom/google/android/gms/internal/measurement/jf;-><init>(Lcom/google/android/gms/internal/measurement/fh;Ljava/lang/String;)V

    invoke-interface {p1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/k;->b:Ljava/util/Map;

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/k;

    new-instance v0, Lcom/google/android/gms/internal/measurement/eh;

    invoke-direct {v0, p0, v1, v1}, Lcom/google/android/gms/internal/measurement/eh;-><init>(Lcom/google/android/gms/internal/measurement/fh;ZZ)V

    invoke-virtual {p1, v3, v0}, Lcom/google/android/gms/internal/measurement/k;->d(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/q;)V

    return-void
.end method


# virtual methods
.method public final h(Lcom/google/android/gms/internal/measurement/y4;Ljava/util/List;)Lcom/google/android/gms/internal/measurement/q;
    .locals 0

    sget-object p1, Lcom/google/android/gms/internal/measurement/q;->Co:Lcom/google/android/gms/internal/measurement/q;

    return-object p1
.end method

.method public final synthetic j()Lcom/google/android/gms/internal/measurement/kg;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/fh;->c:Lcom/google/android/gms/internal/measurement/kg;

    return-object v0
.end method
