.class public final synthetic Lzn/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;

.field public final synthetic b:Lym/k$a;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzn/b0;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;

    iput-object p2, p0, Lzn/b0;->b:Lym/k$a;

    iput-object p3, p0, Lzn/b0;->c:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lzn/b0;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;

    iget-object v1, p0, Lzn/b0;->b:Lym/k$a;

    iget-object v2, p0, Lzn/b0;->c:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    invoke-static {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->l0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
