.class public final synthetic Lrp/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lym/k$a;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;


# direct methods
.method public synthetic constructor <init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrp/j0;->a:Lym/k$a;

    iput-object p2, p0, Lrp/j0;->b:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lrp/j0;->a:Lym/k$a;

    iget-object v1, p0, Lrp/j0;->b:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, v1, p1}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;->y(Lym/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Z)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
