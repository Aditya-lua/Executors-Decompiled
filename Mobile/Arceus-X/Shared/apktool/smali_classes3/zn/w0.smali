.class public final synthetic Lzn/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzn/w0;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;

    iput-object p2, p0, Lzn/w0;->b:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;

    iput-object p3, p0, Lzn/w0;->c:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lzn/w0;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;

    iget-object v1, p0, Lzn/w0;->b:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;

    iget-object v2, p0, Lzn/w0;->c:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/document/i$c;

    invoke-static {v0, v1, v2, p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->g0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lcom/withpersona/sdk2/inquiry/document/i$c;)Lym/r;

    move-result-object p1

    return-object p1
.end method
