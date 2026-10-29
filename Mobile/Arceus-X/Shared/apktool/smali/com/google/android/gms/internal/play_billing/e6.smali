.class public final Lcom/google/android/gms/internal/play_billing/e6;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lcom/google/android/gms/internal/play_billing/e6;


# instance fields
.field public final a:Lcom/google/android/gms/internal/play_billing/o5;

.field public final b:Ljava/util/concurrent/ConcurrentMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/play_billing/e6;

    invoke-direct {v0}, Lcom/google/android/gms/internal/play_billing/e6;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/play_billing/e6;->c:Lcom/google/android/gms/internal/play_billing/e6;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/play_billing/e6;->b:Ljava/util/concurrent/ConcurrentMap;

    new-instance v0, Lcom/google/android/gms/internal/play_billing/o5;

    invoke-direct {v0}, Lcom/google/android/gms/internal/play_billing/o5;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/play_billing/e6;->a:Lcom/google/android/gms/internal/play_billing/o5;

    return-void
.end method

.method public static a()Lcom/google/android/gms/internal/play_billing/e6;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/e6;->c:Lcom/google/android/gms/internal/play_billing/e6;

    return-object v0
.end method


# virtual methods
.method public final b(Ljava/lang/Class;)Lcom/google/android/gms/internal/play_billing/h6;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/e6;->b:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/play_billing/e6;->c(Ljava/lang/Class;)Lcom/google/android/gms/internal/play_billing/h6;

    move-result-object p1

    return-object p1

    :cond_0
    check-cast v0, Lcom/google/android/gms/internal/play_billing/h6;

    return-object v0
.end method

.method public final c(Ljava/lang/Class;)Lcom/google/android/gms/internal/play_billing/h6;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lcom/google/android/gms/internal/play_billing/h6<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/e6;->b:Ljava/util/concurrent/ConcurrentMap;

    iget-object v1, p0, Lcom/google/android/gms/internal/play_billing/e6;->a:Lcom/google/android/gms/internal/play_billing/o5;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/play_billing/o5;->a(Ljava/lang/Class;)Lcom/google/android/gms/internal/play_billing/h6;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/play_billing/h6;

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    return-object v1
.end method
