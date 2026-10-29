.class public final Lpe/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Laf/j0$b;


# direct methods
.method public constructor <init>(Laf/j0$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpe/q;->a:Laf/j0$b;

    return-void
.end method

.method public static b(Lpe/p;)Lpe/q;
    .locals 1

    new-instance v0, Lpe/q;

    invoke-virtual {p0}, Lpe/p;->n()Laf/j0;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y;->Y()Lcom/google/crypto/tink/shaded/protobuf/y$a;

    move-result-object p0

    check-cast p0, Laf/j0$b;

    invoke-direct {v0, p0}, Lpe/q;-><init>(Laf/j0$b;)V

    return-object v0
.end method


# virtual methods
.method public declared-synchronized a()Lpe/p;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lpe/q;->a:Laf/j0$b;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v0

    check-cast v0, Laf/j0;

    invoke-static {v0}, Lpe/p;->i(Laf/j0;)Lpe/p;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
