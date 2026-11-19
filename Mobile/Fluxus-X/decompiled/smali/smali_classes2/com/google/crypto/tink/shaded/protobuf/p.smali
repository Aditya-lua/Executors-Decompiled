.class public Lcom/google/crypto/tink/shaded/protobuf/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/crypto/tink/shaded/protobuf/p$a;
    }
.end annotation


# static fields
.field public static volatile b:Lcom/google/crypto/tink/shaded/protobuf/p;

.field public static final c:Lcom/google/crypto/tink/shaded/protobuf/p;


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/google/crypto/tink/shaded/protobuf/p$a;",
            "Lcom/google/crypto/tink/shaded/protobuf/y$e<",
            "**>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/p;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/p;-><init>(Z)V

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/p;->c:Lcom/google/crypto/tink/shaded/protobuf/p;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/p;->a:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/p;->a:Ljava/util/Map;

    return-void
.end method

.method public static b()Lcom/google/crypto/tink/shaded/protobuf/p;
    .locals 2

    sget-boolean v0, Lcom/google/crypto/tink/shaded/protobuf/c1;->d:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/p;->c:Lcom/google/crypto/tink/shaded/protobuf/p;

    return-object v0

    :cond_0
    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/p;->b:Lcom/google/crypto/tink/shaded/protobuf/p;

    if-nez v0, :cond_2

    const-class v1, Lcom/google/crypto/tink/shaded/protobuf/p;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/p;->b:Lcom/google/crypto/tink/shaded/protobuf/p;

    if-nez v0, :cond_1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v0

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/p;->b:Lcom/google/crypto/tink/shaded/protobuf/p;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    monitor-exit v1

    return-object v0

    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_2
    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/crypto/tink/shaded/protobuf/s0;I)Lcom/google/crypto/tink/shaded/protobuf/y$e;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ContainingType::",
            "Lcom/google/crypto/tink/shaded/protobuf/s0;",
            ">(TContainingType;I)",
            "Lcom/google/crypto/tink/shaded/protobuf/y$e<",
            "TContainingType;*>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/p;->a:Ljava/util/Map;

    new-instance v1, Lcom/google/crypto/tink/shaded/protobuf/p$a;

    invoke-direct {v1, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/p$a;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/y$e;

    return-object p1
.end method
