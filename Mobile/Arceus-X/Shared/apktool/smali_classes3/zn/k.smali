.class public final synthetic Lzn/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzn/k;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lzn/k;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/document/DocumentFile;

    invoke-static {v0, p1}, Lcom/withpersona/sdk2/inquiry/document/e;->c(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
