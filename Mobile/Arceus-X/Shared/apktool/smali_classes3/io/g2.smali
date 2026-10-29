.class public final synthetic Lio/g2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;

.field public final synthetic b:Lym/k$a;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;Lym/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/g2;->a:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;

    iput-object p2, p0, Lio/g2;->b:Lym/k$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lio/g2;->a:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;

    iget-object v1, p0, Lio/g2;->b:Lym/k$a;

    check-cast p1, Lym/r$c;

    invoke-static {v0, v1, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/n;->o(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;Lym/k$a;Lym/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
