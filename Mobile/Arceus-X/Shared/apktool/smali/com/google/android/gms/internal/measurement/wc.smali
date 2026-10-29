.class public final Lcom/google/android/gms/internal/measurement/wc;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lcom/google/android/gms/internal/measurement/wc;


# instance fields
.field public final a:Lcom/google/android/gms/internal/measurement/ad;

.field public final b:Ljava/util/concurrent/ConcurrentMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/wc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/wc;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/wc;->c:Lcom/google/android/gms/internal/measurement/wc;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/wc;->b:Ljava/util/concurrent/ConcurrentMap;

    new-instance v0, Lcom/google/android/gms/internal/measurement/fc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/fc;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/wc;->a:Lcom/google/android/gms/internal/measurement/ad;

    return-void
.end method

.method public static a()Lcom/google/android/gms/internal/measurement/wc;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/wc;->c:Lcom/google/android/gms/internal/measurement/wc;

    return-object v0
.end method


# virtual methods
.method public final b(Ljava/lang/Class;)Lcom/google/android/gms/internal/measurement/zc;
    .locals 3

    const-string v0, "messageType"

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/measurement/qb;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/wc;->b:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/zc;

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/wc;->a:Lcom/google/android/gms/internal/measurement/ad;

    invoke-interface {v2, p1}, Lcom/google/android/gms/internal/measurement/ad;->a(Ljava/lang/Class;)Lcom/google/android/gms/internal/measurement/zc;

    move-result-object v2

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/measurement/qb;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-interface {v1, p1, v2}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/zc;

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    return-object v2
.end method
