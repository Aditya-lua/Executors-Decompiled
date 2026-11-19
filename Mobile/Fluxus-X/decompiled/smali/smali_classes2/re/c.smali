.class public final Lre/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lre/s;


# instance fields
.field public final a:Ljava/io/OutputStream;


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lre/c;->a:Ljava/io/OutputStream;

    return-void
.end method

.method public static c(Ljava/io/OutputStream;)Lre/s;
    .locals 1

    new-instance v0, Lre/c;

    invoke-direct {v0, p0}, Lre/c;-><init>(Ljava/io/OutputStream;)V

    return-object v0
.end method


# virtual methods
.method public a(Lcf/j0;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lre/c;->a:Ljava/io/OutputStream;

    invoke-virtual {p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/a;->o(Ljava/io/OutputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lre/c;->a:Ljava/io/OutputStream;

    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lre/c;->a:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    throw p1
.end method

.method public b(Lcf/a0;)V
    .locals 1

    :try_start_0
    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y;->Y()Lcom/google/crypto/tink/shaded/protobuf/y$a;

    move-result-object p1

    check-cast p1, Lcf/a0$b;

    invoke-virtual {p1}, Lcf/a0$b;->D()Lcf/a0$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Lcf/a0;

    iget-object v0, p0, Lre/c;->a:Ljava/io/OutputStream;

    invoke-virtual {p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/a;->o(Ljava/io/OutputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lre/c;->a:Ljava/io/OutputStream;

    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lre/c;->a:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    throw p1
.end method
