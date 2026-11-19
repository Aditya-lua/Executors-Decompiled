.class public final Lcom/google/android/gms/internal/measurement/kh;
.super Lcom/google/android/gms/internal/measurement/k;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 3

    const-string v0, "internal.platform"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/k;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/k;->b:Ljava/util/Map;

    new-instance v1, Lcom/google/android/gms/internal/measurement/jh;

    const-string v2, "getVersion"

    invoke-direct {v1, p0, v2}, Lcom/google/android/gms/internal/measurement/jh;-><init>(Lcom/google/android/gms/internal/measurement/kh;Ljava/lang/String;)V

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final h(Lcom/google/android/gms/internal/measurement/y4;Ljava/util/List;)Lcom/google/android/gms/internal/measurement/q;
    .locals 0

    sget-object p1, Lcom/google/android/gms/internal/measurement/q;->Co:Lcom/google/android/gms/internal/measurement/q;

    return-object p1
.end method
