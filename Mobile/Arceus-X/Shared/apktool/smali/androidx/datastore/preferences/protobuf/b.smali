.class public abstract Landroidx/datastore/preferences/protobuf/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/datastore/preferences/protobuf/z0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType::",
        "Landroidx/datastore/preferences/protobuf/r0;",
        ">",
        "Ljava/lang/Object;",
        "Landroidx/datastore/preferences/protobuf/z0<",
        "TMessageType;>;"
    }
.end annotation


# static fields
.field public static final a:Landroidx/datastore/preferences/protobuf/o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Landroidx/datastore/preferences/protobuf/o;->b()Landroidx/datastore/preferences/protobuf/o;

    move-result-object v0

    sput-object v0, Landroidx/datastore/preferences/protobuf/b;->a:Landroidx/datastore/preferences/protobuf/o;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Landroidx/datastore/preferences/protobuf/g;Landroidx/datastore/preferences/protobuf/o;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/b;->e(Landroidx/datastore/preferences/protobuf/g;Landroidx/datastore/preferences/protobuf/o;)Landroidx/datastore/preferences/protobuf/r0;

    move-result-object p1

    return-object p1
.end method

.method public final c(Landroidx/datastore/preferences/protobuf/r0;)Landroidx/datastore/preferences/protobuf/r0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)TMessageType;"
        }
    .end annotation

    if-eqz p1, :cond_1

    invoke-interface {p1}, Landroidx/datastore/preferences/protobuf/s0;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/b;->d(Landroidx/datastore/preferences/protobuf/r0;)Landroidx/datastore/preferences/protobuf/m1;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/m1;->a()Landroidx/datastore/preferences/protobuf/a0;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/datastore/preferences/protobuf/a0;->k(Landroidx/datastore/preferences/protobuf/r0;)Landroidx/datastore/preferences/protobuf/a0;

    move-result-object p1

    throw p1

    :cond_1
    :goto_0
    return-object p1
.end method

.method public final d(Landroidx/datastore/preferences/protobuf/r0;)Landroidx/datastore/preferences/protobuf/m1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)",
            "Landroidx/datastore/preferences/protobuf/m1;"
        }
    .end annotation

    instance-of v0, p1, Landroidx/datastore/preferences/protobuf/a;

    if-eqz v0, :cond_0

    check-cast p1, Landroidx/datastore/preferences/protobuf/a;

    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/a;->n()Landroidx/datastore/preferences/protobuf/m1;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Landroidx/datastore/preferences/protobuf/m1;

    invoke-direct {v0, p1}, Landroidx/datastore/preferences/protobuf/m1;-><init>(Landroidx/datastore/preferences/protobuf/r0;)V

    return-object v0
.end method

.method public e(Landroidx/datastore/preferences/protobuf/g;Landroidx/datastore/preferences/protobuf/o;)Landroidx/datastore/preferences/protobuf/r0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/datastore/preferences/protobuf/g;",
            "Landroidx/datastore/preferences/protobuf/o;",
            ")TMessageType;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/b;->f(Landroidx/datastore/preferences/protobuf/g;Landroidx/datastore/preferences/protobuf/o;)Landroidx/datastore/preferences/protobuf/r0;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/b;->c(Landroidx/datastore/preferences/protobuf/r0;)Landroidx/datastore/preferences/protobuf/r0;

    move-result-object p1

    return-object p1
.end method

.method public f(Landroidx/datastore/preferences/protobuf/g;Landroidx/datastore/preferences/protobuf/o;)Landroidx/datastore/preferences/protobuf/r0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/datastore/preferences/protobuf/g;",
            "Landroidx/datastore/preferences/protobuf/o;",
            ")TMessageType;"
        }
    .end annotation

    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/g;->m()Landroidx/datastore/preferences/protobuf/h;

    move-result-object p1

    invoke-interface {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/z0;->b(Landroidx/datastore/preferences/protobuf/h;Landroidx/datastore/preferences/protobuf/o;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/datastore/preferences/protobuf/r0;

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p1, v0}, Landroidx/datastore/preferences/protobuf/h;->a(I)V
    :try_end_0
    .catch Landroidx/datastore/preferences/protobuf/a0; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :catch_0
    move-exception p1

    invoke-virtual {p1, p2}, Landroidx/datastore/preferences/protobuf/a0;->k(Landroidx/datastore/preferences/protobuf/r0;)Landroidx/datastore/preferences/protobuf/a0;

    move-result-object p1

    throw p1
.end method
