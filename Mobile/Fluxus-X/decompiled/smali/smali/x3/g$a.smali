.class public final Lx3/g$a;
.super Landroidx/datastore/preferences/protobuf/x$a;
.source "SourceFile"

# interfaces
.implements Landroidx/datastore/preferences/protobuf/s0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx3/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/datastore/preferences/protobuf/x$a<",
        "Lx3/g;",
        "Lx3/g$a;",
        ">;",
        "Landroidx/datastore/preferences/protobuf/s0;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-static {}, Lx3/g;->U()Lx3/g;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/datastore/preferences/protobuf/x$a;-><init>(Landroidx/datastore/preferences/protobuf/x;)V

    return-void
.end method

.method public synthetic constructor <init>(Lx3/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lx3/g$a;-><init>()V

    return-void
.end method


# virtual methods
.method public G(Ljava/lang/Iterable;)Lx3/g$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "Ljava/lang/String;",
            ">;)",
            "Lx3/g$a;"
        }
    .end annotation

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/x$a;->v()V

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/x$a;->b:Landroidx/datastore/preferences/protobuf/x;

    check-cast v0, Lx3/g;

    invoke-static {v0, p1}, Lx3/g;->V(Lx3/g;Ljava/lang/Iterable;)V

    return-object p0
.end method
