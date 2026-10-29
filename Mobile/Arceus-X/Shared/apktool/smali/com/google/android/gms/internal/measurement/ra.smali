.class public final Lcom/google/android/gms/internal/measurement/ra;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile b:Lcom/google/android/gms/internal/measurement/ra;

.field public static final c:Lcom/google/android/gms/internal/measurement/ra;


# instance fields
.field public final a:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/ra;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/ra;-><init>(Z)V

    sput-object v0, Lcom/google/android/gms/internal/measurement/ra;->c:Lcom/google/android/gms/internal/measurement/ra;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Ljava/util/Map;

    return-void
.end method

.method public static a()Lcom/google/android/gms/internal/measurement/ra;
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/measurement/ra;->b:Lcom/google/android/gms/internal/measurement/ra;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-class v0, Lcom/google/android/gms/internal/measurement/ra;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/measurement/ra;->b:Lcom/google/android/gms/internal/measurement/ra;

    if-eqz v1, :cond_1

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_1
    sget-object v1, Lcom/google/android/gms/internal/measurement/wc;->c:Lcom/google/android/gms/internal/measurement/wc;

    const-class v1, Lcom/google/android/gms/internal/measurement/ra;

    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/za;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/measurement/ra;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/measurement/ra;->b:Lcom/google/android/gms/internal/measurement/ra;

    monitor-exit v0

    return-object v1

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public final b(Lcom/google/android/gms/internal/measurement/oc;I)Lcom/google/android/gms/internal/measurement/fb;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/qa;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/qa;-><init>(Ljava/lang/Object;I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/fb;

    return-object p1
.end method
