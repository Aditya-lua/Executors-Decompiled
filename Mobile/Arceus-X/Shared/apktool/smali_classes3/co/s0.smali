.class public final synthetic Lco/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/document/step/b;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/s0;->a:Lcom/withpersona/sdk2/inquiry/document/step/b;

    iput-object p2, p0, Lco/s0;->b:Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;

    iput-object p3, p0, Lco/s0;->c:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lco/s0;->a:Lcom/withpersona/sdk2/inquiry/document/step/b;

    iget-object v1, p0, Lco/s0;->b:Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;

    iget-object v2, p0, Lco/s0;->c:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;

    check-cast p1, Lbo/a$b;

    invoke-static {v0, v1, v2, p1}, Lcom/withpersona/sdk2/inquiry/document/step/b;->W(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lbo/a$b;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
