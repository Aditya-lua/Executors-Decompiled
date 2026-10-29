.class public final Lpe/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpe/r;


# instance fields
.field public final a:Ljava/io/InputStream;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpe/b;->a:Ljava/io/InputStream;

    return-void
.end method

.method public static b([B)Lpe/r;
    .locals 2

    new-instance v0, Lpe/b;

    new-instance v1, Ljava/io/ByteArrayInputStream;

    invoke-direct {v1, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {v0, v1}, Lpe/b;-><init>(Ljava/io/InputStream;)V

    return-object v0
.end method


# virtual methods
.method public a()Laf/a0;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lpe/b;->a:Ljava/io/InputStream;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Laf/a0;->g0(Ljava/io/InputStream;Lcom/google/crypto/tink/shaded/protobuf/p;)Laf/a0;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Lpe/b;->a:Ljava/io/InputStream;

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    return-object v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lpe/b;->a:Ljava/io/InputStream;

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    throw v0
.end method

.method public read()Laf/j0;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lpe/b;->a:Ljava/io/InputStream;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Laf/j0;->j0(Ljava/io/InputStream;Lcom/google/crypto/tink/shaded/protobuf/p;)Laf/j0;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Lpe/b;->a:Ljava/io/InputStream;

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    return-object v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lpe/b;->a:Ljava/io/InputStream;

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    throw v0
.end method
