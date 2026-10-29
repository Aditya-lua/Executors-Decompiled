.class public final Landroidx/datastore/preferences/protobuf/x$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/datastore/preferences/protobuf/t$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/datastore/preferences/protobuf/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/datastore/preferences/protobuf/t$b<",
        "Landroidx/datastore/preferences/protobuf/x$d;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:Landroidx/datastore/preferences/protobuf/s1$b;

.field public final c:Z

.field public final d:Z


# virtual methods
.method public a(Landroidx/datastore/preferences/protobuf/x$d;)I
    .locals 1

    iget v0, p0, Landroidx/datastore/preferences/protobuf/x$d;->a:I

    iget p1, p1, Landroidx/datastore/preferences/protobuf/x$d;->a:I

    sub-int/2addr v0, p1

    return v0
.end method

.method public b()Landroidx/datastore/preferences/protobuf/z$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/datastore/preferences/protobuf/z$b<",
            "*>;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Landroidx/datastore/preferences/protobuf/x$d;

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/x$d;->a(Landroidx/datastore/preferences/protobuf/x$d;)I

    move-result p1

    return p1
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/datastore/preferences/protobuf/x$d;->c:Z

    return v0
.end method

.method public g()Landroidx/datastore/preferences/protobuf/s1$b;
    .locals 1

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/x$d;->b:Landroidx/datastore/preferences/protobuf/s1$b;

    return-object v0
.end method

.method public getNumber()I
    .locals 1

    iget v0, p0, Landroidx/datastore/preferences/protobuf/x$d;->a:I

    return v0
.end method

.method public k()Landroidx/datastore/preferences/protobuf/s1$c;
    .locals 1

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/x$d;->b:Landroidx/datastore/preferences/protobuf/s1$b;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/s1$b;->a()Landroidx/datastore/preferences/protobuf/s1$c;

    move-result-object v0

    return-object v0
.end method

.method public m()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/datastore/preferences/protobuf/x$d;->d:Z

    return v0
.end method

.method public p(Landroidx/datastore/preferences/protobuf/r0$a;Landroidx/datastore/preferences/protobuf/r0;)Landroidx/datastore/preferences/protobuf/r0$a;
    .locals 0

    check-cast p1, Landroidx/datastore/preferences/protobuf/x$a;

    check-cast p2, Landroidx/datastore/preferences/protobuf/x;

    invoke-virtual {p1, p2}, Landroidx/datastore/preferences/protobuf/x$a;->A(Landroidx/datastore/preferences/protobuf/x;)Landroidx/datastore/preferences/protobuf/x$a;

    move-result-object p1

    return-object p1
.end method
