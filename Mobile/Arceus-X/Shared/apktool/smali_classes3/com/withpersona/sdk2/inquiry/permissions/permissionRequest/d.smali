.class public final Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/c$a;


# instance fields
.field public final a:Ltp/c;


# direct methods
.method public constructor <init>(Ltp/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/d;->a:Ltp/c;

    return-void
.end method

.method public static b(Ltp/c;)Lft/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltp/c;",
            ")",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/c$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/d;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/d;-><init>(Ltp/c;)V

    invoke-static {v0}, Lft/e;->a(Ljava/lang/Object;)Lft/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/c;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/d;->a:Ltp/c;

    invoke-virtual {v0, p1}, Ltp/c;->b(Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/c;

    move-result-object p1

    return-object p1
.end method
