.class public Landroidx/datastore/preferences/protobuf/x$e;
.super Landroidx/datastore/preferences/protobuf/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/datastore/preferences/protobuf/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ContainingType::",
        "Landroidx/datastore/preferences/protobuf/r0;",
        "Type:",
        "Ljava/lang/Object;",
        ">",
        "Landroidx/datastore/preferences/protobuf/m<",
        "TContainingType;TType;>;"
    }
.end annotation


# instance fields
.field public final a:Landroidx/datastore/preferences/protobuf/r0;

.field public final b:Landroidx/datastore/preferences/protobuf/x$d;


# virtual methods
.method public a()Landroidx/datastore/preferences/protobuf/s1$b;
    .locals 1

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/x$e;->b:Landroidx/datastore/preferences/protobuf/x$d;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/x$d;->g()Landroidx/datastore/preferences/protobuf/s1$b;

    move-result-object v0

    return-object v0
.end method

.method public b()Landroidx/datastore/preferences/protobuf/r0;
    .locals 1

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/x$e;->a:Landroidx/datastore/preferences/protobuf/r0;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/x$e;->b:Landroidx/datastore/preferences/protobuf/x$d;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/x$d;->getNumber()I

    move-result v0

    return v0
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/x$e;->b:Landroidx/datastore/preferences/protobuf/x$d;

    iget-boolean v0, v0, Landroidx/datastore/preferences/protobuf/x$d;->c:Z

    return v0
.end method
