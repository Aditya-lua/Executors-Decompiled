.class public final Lre/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcf/j0$b;


# direct methods
.method public constructor <init>(Lcf/j0$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lre/q;->a:Lcf/j0$b;

    return-void
.end method

.method public static b(Lre/p;)Lre/q;
    .locals 1

    new-instance v0, Lre/q;

    invoke-virtual {p0}, Lre/p;->n()Lcf/j0;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y;->Y()Lcom/google/crypto/tink/shaded/protobuf/y$a;

    move-result-object p0

    check-cast p0, Lcf/j0$b;

    invoke-direct {v0, p0}, Lre/q;-><init>(Lcf/j0$b;)V

    return-object v0
.end method


# virtual methods
.method public declared-synchronized a()Lre/p;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lre/q;->a:Lcf/j0$b;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v0

    check-cast v0, Lcf/j0;

    invoke-static {v0}, Lre/p;->i(Lcf/j0;)Lre/p;

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
