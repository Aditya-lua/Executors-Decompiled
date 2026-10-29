.class public final Lrp/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lg/c<",
            "Landroidx/activity/result/IntentSenderRequest;",
            ">;>;"
        }
    .end annotation
.end field

.field public final b:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lft/i;Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lg/c<",
            "Landroidx/activity/result/IntentSenderRequest;",
            ">;>;",
            "Lft/i<",
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrp/j;->a:Lft/i;

    iput-object p2, p0, Lrp/j;->b:Lft/i;

    return-void
.end method

.method public static a(Lft/i;Lft/i;)Lrp/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lg/c<",
            "Landroidx/activity/result/IntentSenderRequest;",
            ">;>;",
            "Lft/i<",
            "Landroid/content/Context;",
            ">;)",
            "Lrp/j;"
        }
    .end annotation

    new-instance v0, Lrp/j;

    invoke-direct {v0, p0, p1}, Lrp/j;-><init>(Lft/i;Lft/i;)V

    return-object v0
.end method

.method public static c(Lg/c;Landroid/content/Context;)Lcom/withpersona/sdk2/inquiry/permissions/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg/c<",
            "Landroidx/activity/result/IntentSenderRequest;",
            ">;",
            "Landroid/content/Context;",
            ")",
            "Lcom/withpersona/sdk2/inquiry/permissions/a;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/permissions/a;

    invoke-direct {v0, p0, p1}, Lcom/withpersona/sdk2/inquiry/permissions/a;-><init>(Lg/c;Landroid/content/Context;)V

    return-object v0
.end method


# virtual methods
.method public b()Lcom/withpersona/sdk2/inquiry/permissions/a;
    .locals 2

    iget-object v0, p0, Lrp/j;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg/c;

    iget-object v1, p0, Lrp/j;->b:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-static {v0, v1}, Lrp/j;->c(Lg/c;Landroid/content/Context;)Lcom/withpersona/sdk2/inquiry/permissions/a;

    move-result-object v0

    return-object v0
.end method
