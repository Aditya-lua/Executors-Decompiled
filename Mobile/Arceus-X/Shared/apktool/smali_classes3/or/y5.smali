.class public final synthetic Lor/y5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/ui/d$b;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;

.field public final synthetic d:Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/ui/d$b;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor/y5;->a:Lcom/withpersona/sdk2/inquiry/ui/d$b;

    iput-object p2, p0, Lor/y5;->b:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;

    iput-object p3, p0, Lor/y5;->c:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;

    iput-object p4, p0, Lor/y5;->d:Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lor/y5;->a:Lcom/withpersona/sdk2/inquiry/ui/d$b;

    iget-object v1, p0, Lor/y5;->b:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;

    iget-object v2, p0, Lor/y5;->c:Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;

    iget-object v3, p0, Lor/y5;->d:Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction;

    check-cast p1, Lym/r$c;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;->F(Lcom/withpersona/sdk2/inquiry/ui/d$b;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow;Lcom/withpersona/sdk2/inquiry/ui/UiState$PendingAction;Lym/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
