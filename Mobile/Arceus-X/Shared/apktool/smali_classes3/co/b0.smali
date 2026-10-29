.class public final synthetic Lco/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/document/step/b;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/b0;->a:Lcom/withpersona/sdk2/inquiry/document/step/b;

    iput-object p2, p0, Lco/b0;->b:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lco/b0;->a:Lcom/withpersona/sdk2/inquiry/document/step/b;

    iget-object v1, p0, Lco/b0;->b:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$b;

    invoke-static {v0, v1, p1}, Lcom/withpersona/sdk2/inquiry/document/step/b;->B(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$b;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
