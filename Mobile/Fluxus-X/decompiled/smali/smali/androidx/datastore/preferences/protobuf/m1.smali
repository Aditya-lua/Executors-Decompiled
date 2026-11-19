.class public Landroidx/datastore/preferences/protobuf/m1;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/datastore/preferences/protobuf/r0;)V
    .locals 0

    const-string p1, "Message was missing required fields.  (Lite runtime could not determine which fields were missing)."

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/datastore/preferences/protobuf/m1;->a:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a()Landroidx/datastore/preferences/protobuf/a0;
    .locals 2

    new-instance v0, Landroidx/datastore/preferences/protobuf/a0;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/datastore/preferences/protobuf/a0;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
