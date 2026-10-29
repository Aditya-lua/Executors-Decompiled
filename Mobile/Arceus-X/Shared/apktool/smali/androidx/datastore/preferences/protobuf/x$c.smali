.class public abstract Landroidx/datastore/preferences/protobuf/x$c;
.super Landroidx/datastore/preferences/protobuf/x;
.source "SourceFile"

# interfaces
.implements Landroidx/datastore/preferences/protobuf/s0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/datastore/preferences/protobuf/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Landroidx/datastore/preferences/protobuf/x$c<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Ljava/lang/Object;",
        ">",
        "Landroidx/datastore/preferences/protobuf/x<",
        "TMessageType;TBuilderType;>;",
        "Landroidx/datastore/preferences/protobuf/s0;"
    }
.end annotation


# instance fields
.field protected extensions:Landroidx/datastore/preferences/protobuf/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/datastore/preferences/protobuf/t<",
            "Landroidx/datastore/preferences/protobuf/x$d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/datastore/preferences/protobuf/x;-><init>()V

    invoke-static {}, Landroidx/datastore/preferences/protobuf/t;->h()Landroidx/datastore/preferences/protobuf/t;

    move-result-object v0

    iput-object v0, p0, Landroidx/datastore/preferences/protobuf/x$c;->extensions:Landroidx/datastore/preferences/protobuf/t;

    return-void
.end method


# virtual methods
.method public U()Landroidx/datastore/preferences/protobuf/t;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/datastore/preferences/protobuf/t<",
            "Landroidx/datastore/preferences/protobuf/x$d;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/x$c;->extensions:Landroidx/datastore/preferences/protobuf/t;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/t;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/x$c;->extensions:Landroidx/datastore/preferences/protobuf/t;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/t;->b()Landroidx/datastore/preferences/protobuf/t;

    move-result-object v0

    iput-object v0, p0, Landroidx/datastore/preferences/protobuf/x$c;->extensions:Landroidx/datastore/preferences/protobuf/t;

    :cond_0
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/x$c;->extensions:Landroidx/datastore/preferences/protobuf/t;

    return-object v0
.end method

.method public bridge synthetic a()Landroidx/datastore/preferences/protobuf/r0$a;
    .locals 1

    invoke-super {p0}, Landroidx/datastore/preferences/protobuf/x;->T()Landroidx/datastore/preferences/protobuf/x$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic e()Landroidx/datastore/preferences/protobuf/r0$a;
    .locals 1

    invoke-super {p0}, Landroidx/datastore/preferences/protobuf/x;->M()Landroidx/datastore/preferences/protobuf/x$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic f()Landroidx/datastore/preferences/protobuf/r0;
    .locals 1

    invoke-super {p0}, Landroidx/datastore/preferences/protobuf/x;->D()Landroidx/datastore/preferences/protobuf/x;

    move-result-object v0

    return-object v0
.end method
