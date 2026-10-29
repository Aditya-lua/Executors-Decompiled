.class public Landroidx/datastore/preferences/protobuf/g$a;
.super Landroidx/datastore/preferences/protobuf/g$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/datastore/preferences/protobuf/g;->k()Landroidx/datastore/preferences/protobuf/g$g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public a:I

.field public final b:I

.field public final synthetic c:Landroidx/datastore/preferences/protobuf/g;


# direct methods
.method public constructor <init>(Landroidx/datastore/preferences/protobuf/g;)V
    .locals 1

    iput-object p1, p0, Landroidx/datastore/preferences/protobuf/g$a;->c:Landroidx/datastore/preferences/protobuf/g;

    invoke-direct {p0}, Landroidx/datastore/preferences/protobuf/g$c;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Landroidx/datastore/preferences/protobuf/g$a;->a:I

    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/g;->size()I

    move-result p1

    iput p1, p0, Landroidx/datastore/preferences/protobuf/g$a;->b:I

    return-void
.end method


# virtual methods
.method public c()B
    .locals 2

    iget v0, p0, Landroidx/datastore/preferences/protobuf/g$a;->a:I

    iget v1, p0, Landroidx/datastore/preferences/protobuf/g$a;->b:I

    if-ge v0, v1, :cond_0

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Landroidx/datastore/preferences/protobuf/g$a;->a:I

    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/g$a;->c:Landroidx/datastore/preferences/protobuf/g;

    invoke-virtual {v1, v0}, Landroidx/datastore/preferences/protobuf/g;->i(I)B

    move-result v0

    return v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public hasNext()Z
    .locals 2

    iget v0, p0, Landroidx/datastore/preferences/protobuf/g$a;->a:I

    iget v1, p0, Landroidx/datastore/preferences/protobuf/g$a;->b:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
