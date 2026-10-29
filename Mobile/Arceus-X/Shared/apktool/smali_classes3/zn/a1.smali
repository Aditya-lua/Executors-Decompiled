.class public final synthetic Lzn/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;

.field public final synthetic d:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzn/a1;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;

    iput-object p2, p0, Lzn/a1;->b:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;

    iput-object p3, p0, Lzn/a1;->c:Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;

    iput-object p4, p0, Lzn/a1;->d:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lzn/a1;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;

    iget-object v1, p0, Lzn/a1;->b:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;

    iget-object v2, p0, Lzn/a1;->c:Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;

    iget-object v3, p0, Lzn/a1;->d:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/document/network/c$b;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->K(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/network/c$b;)Lym/r;

    move-result-object p1

    return-object p1
.end method
