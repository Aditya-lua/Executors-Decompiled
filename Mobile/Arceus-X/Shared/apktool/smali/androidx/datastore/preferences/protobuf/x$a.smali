.class public abstract Landroidx/datastore/preferences/protobuf/x$a;
.super Landroidx/datastore/preferences/protobuf/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/datastore/preferences/protobuf/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Landroidx/datastore/preferences/protobuf/x<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Landroidx/datastore/preferences/protobuf/x$a<",
        "TMessageType;TBuilderType;>;>",
        "Landroidx/datastore/preferences/protobuf/a$a<",
        "TMessageType;TBuilderType;>;"
    }
.end annotation


# instance fields
.field public final a:Landroidx/datastore/preferences/protobuf/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TMessageType;"
        }
    .end annotation
.end field

.field public b:Landroidx/datastore/preferences/protobuf/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TMessageType;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/datastore/preferences/protobuf/x;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)V"
        }
    .end annotation

    invoke-direct {p0}, Landroidx/datastore/preferences/protobuf/a$a;-><init>()V

    iput-object p1, p0, Landroidx/datastore/preferences/protobuf/x$a;->a:Landroidx/datastore/preferences/protobuf/x;

    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/x;->I()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-direct {p0}, Landroidx/datastore/preferences/protobuf/x$a;->D()Landroidx/datastore/preferences/protobuf/x;

    move-result-object p1

    iput-object p1, p0, Landroidx/datastore/preferences/protobuf/x$a;->b:Landroidx/datastore/preferences/protobuf/x;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Default instance must be immutable."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static C(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<MessageType:",
            "Ljava/lang/Object;",
            ">(TMessageType;TMessageType;)V"
        }
    .end annotation

    invoke-static {}, Landroidx/datastore/preferences/protobuf/c1;->a()Landroidx/datastore/preferences/protobuf/c1;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/datastore/preferences/protobuf/c1;->d(Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/g1;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Landroidx/datastore/preferences/protobuf/g1;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method private D()Landroidx/datastore/preferences/protobuf/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/x$a;->a:Landroidx/datastore/preferences/protobuf/x;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/x;->O()Landroidx/datastore/preferences/protobuf/x;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public A(Landroidx/datastore/preferences/protobuf/x;)Landroidx/datastore/preferences/protobuf/x$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)TBuilderType;"
        }
    .end annotation

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/x$a;->w()Landroidx/datastore/preferences/protobuf/x;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/datastore/preferences/protobuf/x;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/x$a;->t()V

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/x$a;->b:Landroidx/datastore/preferences/protobuf/x;

    invoke-static {v0, p1}, Landroidx/datastore/preferences/protobuf/x$a;->C(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0
.end method

.method public bridge synthetic build()Landroidx/datastore/preferences/protobuf/r0;
    .locals 1

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/x$a;->q()Landroidx/datastore/preferences/protobuf/x;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/x$a;->s()Landroidx/datastore/preferences/protobuf/x$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d()Landroidx/datastore/preferences/protobuf/r0;
    .locals 1

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/x$a;->r()Landroidx/datastore/preferences/protobuf/x;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic f()Landroidx/datastore/preferences/protobuf/r0;
    .locals 1

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/x$a;->w()Landroidx/datastore/preferences/protobuf/x;

    move-result-object v0

    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/x$a;->b:Landroidx/datastore/preferences/protobuf/x;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroidx/datastore/preferences/protobuf/x;->H(Landroidx/datastore/preferences/protobuf/x;Z)Z

    move-result v0

    return v0
.end method

.method public bridge synthetic n(Landroidx/datastore/preferences/protobuf/a;)Landroidx/datastore/preferences/protobuf/a$a;
    .locals 0

    check-cast p1, Landroidx/datastore/preferences/protobuf/x;

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/x$a;->x(Landroidx/datastore/preferences/protobuf/x;)Landroidx/datastore/preferences/protobuf/x$a;

    move-result-object p1

    return-object p1
.end method

.method public final q()Landroidx/datastore/preferences/protobuf/x;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/x$a;->r()Landroidx/datastore/preferences/protobuf/x;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/x;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/a$a;->p(Landroidx/datastore/preferences/protobuf/r0;)Landroidx/datastore/preferences/protobuf/m1;

    move-result-object v0

    throw v0
.end method

.method public r()Landroidx/datastore/preferences/protobuf/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/x$a;->b:Landroidx/datastore/preferences/protobuf/x;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/x;->I()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/x$a;->b:Landroidx/datastore/preferences/protobuf/x;

    return-object v0

    :cond_0
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/x$a;->b:Landroidx/datastore/preferences/protobuf/x;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/x;->J()V

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/x$a;->b:Landroidx/datastore/preferences/protobuf/x;

    return-object v0
.end method

.method public s()Landroidx/datastore/preferences/protobuf/x$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TBuilderType;"
        }
    .end annotation

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/x$a;->w()Landroidx/datastore/preferences/protobuf/x;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/x;->M()Landroidx/datastore/preferences/protobuf/x$a;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/x$a;->r()Landroidx/datastore/preferences/protobuf/x;

    move-result-object v1

    iput-object v1, v0, Landroidx/datastore/preferences/protobuf/x$a;->b:Landroidx/datastore/preferences/protobuf/x;

    return-object v0
.end method

.method public final t()V
    .locals 1

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/x$a;->b:Landroidx/datastore/preferences/protobuf/x;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/x;->I()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/x$a;->v()V

    :cond_0
    return-void
.end method

.method public v()V
    .locals 2

    invoke-direct {p0}, Landroidx/datastore/preferences/protobuf/x$a;->D()Landroidx/datastore/preferences/protobuf/x;

    move-result-object v0

    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/x$a;->b:Landroidx/datastore/preferences/protobuf/x;

    invoke-static {v0, v1}, Landroidx/datastore/preferences/protobuf/x$a;->C(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Landroidx/datastore/preferences/protobuf/x$a;->b:Landroidx/datastore/preferences/protobuf/x;

    return-void
.end method

.method public w()Landroidx/datastore/preferences/protobuf/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/x$a;->a:Landroidx/datastore/preferences/protobuf/x;

    return-object v0
.end method

.method public x(Landroidx/datastore/preferences/protobuf/x;)Landroidx/datastore/preferences/protobuf/x$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)TBuilderType;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/x$a;->A(Landroidx/datastore/preferences/protobuf/x;)Landroidx/datastore/preferences/protobuf/x$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic y(Landroidx/datastore/preferences/protobuf/h;Landroidx/datastore/preferences/protobuf/o;)Landroidx/datastore/preferences/protobuf/r0$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/x$a;->z(Landroidx/datastore/preferences/protobuf/h;Landroidx/datastore/preferences/protobuf/o;)Landroidx/datastore/preferences/protobuf/x$a;

    move-result-object p1

    return-object p1
.end method

.method public z(Landroidx/datastore/preferences/protobuf/h;Landroidx/datastore/preferences/protobuf/o;)Landroidx/datastore/preferences/protobuf/x$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/datastore/preferences/protobuf/h;",
            "Landroidx/datastore/preferences/protobuf/o;",
            ")TBuilderType;"
        }
    .end annotation

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/x$a;->t()V

    :try_start_0
    invoke-static {}, Landroidx/datastore/preferences/protobuf/c1;->a()Landroidx/datastore/preferences/protobuf/c1;

    move-result-object v0

    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/x$a;->b:Landroidx/datastore/preferences/protobuf/x;

    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/protobuf/c1;->d(Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/g1;

    move-result-object v0

    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/x$a;->b:Landroidx/datastore/preferences/protobuf/x;

    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/i;->Q(Landroidx/datastore/preferences/protobuf/h;)Landroidx/datastore/preferences/protobuf/i;

    move-result-object p1

    invoke-interface {v0, v1, p1, p2}, Landroidx/datastore/preferences/protobuf/g1;->h(Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/f1;Landroidx/datastore/preferences/protobuf/o;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    instance-of p2, p2, Ljava/io/IOException;

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    check-cast p1, Ljava/io/IOException;

    throw p1

    :cond_0
    throw p1
.end method
