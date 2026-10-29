.class public final synthetic Lzn/f2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;

.field public final synthetic c:Lbo/a$b;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lbo/a$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzn/f2;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;

    iput-object p2, p0, Lzn/f2;->b:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;

    iput-object p3, p0, Lzn/f2;->c:Lbo/a$b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lzn/f2;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;

    iget-object v1, p0, Lzn/f2;->b:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;

    iget-object v2, p0, Lzn/f2;->c:Lbo/a$b;

    check-cast p1, Lym/r$c;

    invoke-static {v0, v1, v2, p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->x(Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lbo/a$b;Lym/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
