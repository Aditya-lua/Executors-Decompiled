.class public final synthetic Lor/d6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;

.field public final synthetic b:Lym/k$a;

.field public final synthetic c:Z

.field public final synthetic d:Lcom/withpersona/sdk2/inquiry/ui/UiState;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;Lym/k$a;ZLcom/withpersona/sdk2/inquiry/ui/UiState;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor/d6;->a:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;

    iput-object p2, p0, Lor/d6;->b:Lym/k$a;

    iput-boolean p3, p0, Lor/d6;->c:Z

    iput-object p4, p0, Lor/d6;->d:Lcom/withpersona/sdk2/inquiry/ui/UiState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lor/d6;->a:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;

    iget-object v1, p0, Lor/d6;->b:Lym/k$a;

    iget-boolean v2, p0, Lor/d6;->c:Z

    iget-object v3, p0, Lor/d6;->d:Lcom/withpersona/sdk2/inquiry/ui/UiState;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;->W(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;Lym/k$a;ZLcom/withpersona/sdk2/inquiry/ui/UiState;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;)Lym/r;

    move-result-object p1

    return-object p1
.end method
