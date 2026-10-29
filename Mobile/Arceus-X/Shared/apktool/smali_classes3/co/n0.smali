.class public final synthetic Lco/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/document/step/b;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/n0;->a:Lcom/withpersona/sdk2/inquiry/document/step/b;

    iput-object p2, p0, Lco/n0;->b:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lco/n0;->a:Lcom/withpersona/sdk2/inquiry/document/step/b;

    iget-object v1, p0, Lco/n0;->b:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/document/a$b;

    invoke-static {v0, v1, p1}, Lcom/withpersona/sdk2/inquiry/document/step/b;->n(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/a$b;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
