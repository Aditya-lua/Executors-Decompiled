.class public final Lw3/f$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw3/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:Landroidx/datastore/preferences/protobuf/k0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/datastore/preferences/protobuf/k0<",
            "Ljava/lang/String;",
            "Lw3/h;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, Landroidx/datastore/preferences/protobuf/s1$b;->k:Landroidx/datastore/preferences/protobuf/s1$b;

    sget-object v1, Landroidx/datastore/preferences/protobuf/s1$b;->m:Landroidx/datastore/preferences/protobuf/s1$b;

    invoke-static {}, Lw3/h;->f0()Lw3/h;

    move-result-object v2

    const-string v3, ""

    invoke-static {v0, v3, v1, v2}, Landroidx/datastore/preferences/protobuf/k0;->d(Landroidx/datastore/preferences/protobuf/s1$b;Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/s1$b;Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/k0;

    move-result-object v0

    sput-object v0, Lw3/f$b;->a:Landroidx/datastore/preferences/protobuf/k0;

    return-void
.end method
