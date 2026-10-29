.class public final synthetic Lco/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/document/step/b;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/w0;->a:Lcom/withpersona/sdk2/inquiry/document/step/b;

    iput-object p2, p0, Lco/w0;->b:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lco/w0;->a:Lcom/withpersona/sdk2/inquiry/document/step/b;

    iget-object v1, p0, Lco/w0;->b:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    invoke-static {v0, v1}, Lcom/withpersona/sdk2/inquiry/document/step/b;->F(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
