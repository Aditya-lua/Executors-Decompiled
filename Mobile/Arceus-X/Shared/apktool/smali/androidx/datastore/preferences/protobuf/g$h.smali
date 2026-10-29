.class public final Landroidx/datastore/preferences/protobuf/g$h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/datastore/preferences/protobuf/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "h"
.end annotation


# instance fields
.field public final a:Landroidx/datastore/preferences/protobuf/j;

.field public final b:[B


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-array p1, p1, [B

    iput-object p1, p0, Landroidx/datastore/preferences/protobuf/g$h;->b:[B

    .line 4
    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/j;->f0([B)Landroidx/datastore/preferences/protobuf/j;

    move-result-object p1

    iput-object p1, p0, Landroidx/datastore/preferences/protobuf/g$h;->a:Landroidx/datastore/preferences/protobuf/j;

    return-void
.end method

.method public synthetic constructor <init>(ILandroidx/datastore/preferences/protobuf/g$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/datastore/preferences/protobuf/g$h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public a()Landroidx/datastore/preferences/protobuf/g;
    .locals 2

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/g$h;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/j;->c()V

    new-instance v0, Landroidx/datastore/preferences/protobuf/g$j;

    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/g$h;->b:[B

    invoke-direct {v0, v1}, Landroidx/datastore/preferences/protobuf/g$j;-><init>([B)V

    return-object v0
.end method

.method public b()Landroidx/datastore/preferences/protobuf/j;
    .locals 1

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/g$h;->a:Landroidx/datastore/preferences/protobuf/j;

    return-object v0
.end method
