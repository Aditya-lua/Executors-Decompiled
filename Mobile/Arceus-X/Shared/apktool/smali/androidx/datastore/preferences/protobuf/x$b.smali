.class public Landroidx/datastore/preferences/protobuf/x$b;
.super Landroidx/datastore/preferences/protobuf/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/datastore/preferences/protobuf/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Landroidx/datastore/preferences/protobuf/x<",
        "TT;*>;>",
        "Landroidx/datastore/preferences/protobuf/b<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final b:Landroidx/datastore/preferences/protobuf/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/datastore/preferences/protobuf/x;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-direct {p0}, Landroidx/datastore/preferences/protobuf/b;-><init>()V

    iput-object p1, p0, Landroidx/datastore/preferences/protobuf/x$b;->b:Landroidx/datastore/preferences/protobuf/x;

    return-void
.end method


# virtual methods
.method public bridge synthetic b(Landroidx/datastore/preferences/protobuf/h;Landroidx/datastore/preferences/protobuf/o;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/x$b;->g(Landroidx/datastore/preferences/protobuf/h;Landroidx/datastore/preferences/protobuf/o;)Landroidx/datastore/preferences/protobuf/x;

    move-result-object p1

    return-object p1
.end method

.method public g(Landroidx/datastore/preferences/protobuf/h;Landroidx/datastore/preferences/protobuf/o;)Landroidx/datastore/preferences/protobuf/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/datastore/preferences/protobuf/h;",
            "Landroidx/datastore/preferences/protobuf/o;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/x$b;->b:Landroidx/datastore/preferences/protobuf/x;

    invoke-static {v0, p1, p2}, Landroidx/datastore/preferences/protobuf/x;->Q(Landroidx/datastore/preferences/protobuf/x;Landroidx/datastore/preferences/protobuf/h;Landroidx/datastore/preferences/protobuf/o;)Landroidx/datastore/preferences/protobuf/x;

    move-result-object p1

    return-object p1
.end method
