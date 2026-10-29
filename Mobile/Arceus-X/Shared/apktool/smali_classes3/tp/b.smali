.class public final synthetic Ltp/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroid/widget/FrameLayout;

.field public final synthetic b:Lrp/i;

.field public final synthetic c:Lj/b;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/FrameLayout;Lrp/i;Lj/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltp/b;->a:Landroid/widget/FrameLayout;

    iput-object p2, p0, Ltp/b;->b:Lrp/i;

    iput-object p3, p0, Ltp/b;->c:Lj/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Ltp/b;->a:Landroid/widget/FrameLayout;

    iget-object v1, p0, Ltp/b;->b:Lrp/i;

    iget-object v2, p0, Ltp/b;->c:Lj/b;

    invoke-static {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment;->j2(Landroid/widget/FrameLayout;Lrp/i;Lj/b;)V

    return-void
.end method
