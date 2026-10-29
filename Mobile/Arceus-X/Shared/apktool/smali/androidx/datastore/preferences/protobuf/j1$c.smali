.class public Landroidx/datastore/preferences/protobuf/j1$c;
.super Landroidx/datastore/preferences/protobuf/j1$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/datastore/preferences/protobuf/j1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/datastore/preferences/protobuf/j1<",
        "TK;TV;>.f;"
    }
.end annotation


# instance fields
.field public final synthetic b:Landroidx/datastore/preferences/protobuf/j1;


# direct methods
.method public constructor <init>(Landroidx/datastore/preferences/protobuf/j1;)V
    .locals 1

    .line 1
    iput-object p1, p0, Landroidx/datastore/preferences/protobuf/j1$c;->b:Landroidx/datastore/preferences/protobuf/j1;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroidx/datastore/preferences/protobuf/j1$f;-><init>(Landroidx/datastore/preferences/protobuf/j1;Landroidx/datastore/preferences/protobuf/j1$a;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/datastore/preferences/protobuf/j1;Landroidx/datastore/preferences/protobuf/j1$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Landroidx/datastore/preferences/protobuf/j1$c;-><init>(Landroidx/datastore/preferences/protobuf/j1;)V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    new-instance v0, Landroidx/datastore/preferences/protobuf/j1$b;

    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/j1$c;->b:Landroidx/datastore/preferences/protobuf/j1;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/datastore/preferences/protobuf/j1$b;-><init>(Landroidx/datastore/preferences/protobuf/j1;Landroidx/datastore/preferences/protobuf/j1$a;)V

    return-object v0
.end method
