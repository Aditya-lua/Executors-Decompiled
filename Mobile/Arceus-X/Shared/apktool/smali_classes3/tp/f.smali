.class public final Ltp/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltp/f$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/g;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Ltp/f;
    .locals 1

    sget-object v0, Ltp/f$a;->a:Ltp/f;

    return-object v0
.end method

.method public static c()Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/g;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/g;

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/g;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/g;
    .locals 1

    invoke-static {}, Ltp/f;->c()Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/g;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ltp/f;->b()Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/g;

    move-result-object v0

    return-object v0
.end method
