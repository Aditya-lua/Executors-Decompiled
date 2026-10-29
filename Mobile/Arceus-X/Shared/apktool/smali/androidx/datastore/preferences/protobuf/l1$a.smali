.class public Landroidx/datastore/preferences/protobuf/l1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/datastore/preferences/protobuf/l1$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/datastore/preferences/protobuf/l1;->a(Landroidx/datastore/preferences/protobuf/g;)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroidx/datastore/preferences/protobuf/g;


# direct methods
.method public constructor <init>(Landroidx/datastore/preferences/protobuf/g;)V
    .locals 0

    iput-object p1, p0, Landroidx/datastore/preferences/protobuf/l1$a;->a:Landroidx/datastore/preferences/protobuf/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)B
    .locals 1

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/l1$a;->a:Landroidx/datastore/preferences/protobuf/g;

    invoke-virtual {v0, p1}, Landroidx/datastore/preferences/protobuf/g;->b(I)B

    move-result p1

    return p1
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/l1$a;->a:Landroidx/datastore/preferences/protobuf/g;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/g;->size()I

    move-result v0

    return v0
.end method
