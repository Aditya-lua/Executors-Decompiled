.class public final enum Landroidx/datastore/preferences/protobuf/x$f;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/datastore/preferences/protobuf/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Landroidx/datastore/preferences/protobuf/x$f;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Landroidx/datastore/preferences/protobuf/x$f;

.field public static final enum b:Landroidx/datastore/preferences/protobuf/x$f;

.field public static final enum c:Landroidx/datastore/preferences/protobuf/x$f;

.field public static final enum d:Landroidx/datastore/preferences/protobuf/x$f;

.field public static final enum e:Landroidx/datastore/preferences/protobuf/x$f;

.field public static final enum f:Landroidx/datastore/preferences/protobuf/x$f;

.field public static final enum g:Landroidx/datastore/preferences/protobuf/x$f;

.field public static final synthetic h:[Landroidx/datastore/preferences/protobuf/x$f;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Landroidx/datastore/preferences/protobuf/x$f;

    const-string v1, "GET_MEMOIZED_IS_INITIALIZED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/datastore/preferences/protobuf/x$f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/datastore/preferences/protobuf/x$f;->a:Landroidx/datastore/preferences/protobuf/x$f;

    new-instance v1, Landroidx/datastore/preferences/protobuf/x$f;

    const-string v2, "SET_MEMOIZED_IS_INITIALIZED"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Landroidx/datastore/preferences/protobuf/x$f;-><init>(Ljava/lang/String;I)V

    sput-object v1, Landroidx/datastore/preferences/protobuf/x$f;->b:Landroidx/datastore/preferences/protobuf/x$f;

    new-instance v2, Landroidx/datastore/preferences/protobuf/x$f;

    const-string v3, "BUILD_MESSAGE_INFO"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Landroidx/datastore/preferences/protobuf/x$f;-><init>(Ljava/lang/String;I)V

    sput-object v2, Landroidx/datastore/preferences/protobuf/x$f;->c:Landroidx/datastore/preferences/protobuf/x$f;

    new-instance v3, Landroidx/datastore/preferences/protobuf/x$f;

    const-string v4, "NEW_MUTABLE_INSTANCE"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Landroidx/datastore/preferences/protobuf/x$f;-><init>(Ljava/lang/String;I)V

    sput-object v3, Landroidx/datastore/preferences/protobuf/x$f;->d:Landroidx/datastore/preferences/protobuf/x$f;

    new-instance v4, Landroidx/datastore/preferences/protobuf/x$f;

    const-string v5, "NEW_BUILDER"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Landroidx/datastore/preferences/protobuf/x$f;-><init>(Ljava/lang/String;I)V

    sput-object v4, Landroidx/datastore/preferences/protobuf/x$f;->e:Landroidx/datastore/preferences/protobuf/x$f;

    new-instance v5, Landroidx/datastore/preferences/protobuf/x$f;

    const-string v6, "GET_DEFAULT_INSTANCE"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7}, Landroidx/datastore/preferences/protobuf/x$f;-><init>(Ljava/lang/String;I)V

    sput-object v5, Landroidx/datastore/preferences/protobuf/x$f;->f:Landroidx/datastore/preferences/protobuf/x$f;

    new-instance v6, Landroidx/datastore/preferences/protobuf/x$f;

    const-string v7, "GET_PARSER"

    const/4 v8, 0x6

    invoke-direct {v6, v7, v8}, Landroidx/datastore/preferences/protobuf/x$f;-><init>(Ljava/lang/String;I)V

    sput-object v6, Landroidx/datastore/preferences/protobuf/x$f;->g:Landroidx/datastore/preferences/protobuf/x$f;

    filled-new-array/range {v0 .. v6}, [Landroidx/datastore/preferences/protobuf/x$f;

    move-result-object v0

    sput-object v0, Landroidx/datastore/preferences/protobuf/x$f;->h:[Landroidx/datastore/preferences/protobuf/x$f;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Landroidx/datastore/preferences/protobuf/x$f;
    .locals 1

    const-class v0, Landroidx/datastore/preferences/protobuf/x$f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Landroidx/datastore/preferences/protobuf/x$f;

    return-object p0
.end method

.method public static values()[Landroidx/datastore/preferences/protobuf/x$f;
    .locals 1

    sget-object v0, Landroidx/datastore/preferences/protobuf/x$f;->h:[Landroidx/datastore/preferences/protobuf/x$f;

    invoke-virtual {v0}, [Landroidx/datastore/preferences/protobuf/x$f;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroidx/datastore/preferences/protobuf/x$f;

    return-object v0
.end method
