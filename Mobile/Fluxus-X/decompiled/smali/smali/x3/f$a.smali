.class public final Lx3/f$a;
.super Landroidx/datastore/preferences/protobuf/x$a;
.source "SourceFile"

# interfaces
.implements Landroidx/datastore/preferences/protobuf/s0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx3/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/datastore/preferences/protobuf/x$a<",
        "Lx3/f;",
        "Lx3/f$a;",
        ">;",
        "Landroidx/datastore/preferences/protobuf/s0;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-static {}, Lx3/f;->U()Lx3/f;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/datastore/preferences/protobuf/x$a;-><init>(Landroidx/datastore/preferences/protobuf/x;)V

    return-void
.end method

.method public synthetic constructor <init>(Lx3/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lx3/f$a;-><init>()V

    return-void
.end method


# virtual methods
.method public G(Ljava/lang/String;Lx3/h;)Lx3/f$a;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/x$a;->v()V

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/x$a;->b:Landroidx/datastore/preferences/protobuf/x;

    check-cast v0, Lx3/f;

    invoke-static {v0}, Lx3/f;->V(Lx3/f;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method
