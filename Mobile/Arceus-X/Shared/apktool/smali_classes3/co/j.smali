.class public final synthetic Lco/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lku/p0;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/document/step/b;


# direct methods
.method public synthetic constructor <init>(Lku/p0;Lcom/withpersona/sdk2/inquiry/document/step/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/j;->a:Lku/p0;

    iput-object p2, p0, Lco/j;->b:Lcom/withpersona/sdk2/inquiry/document/step/b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lco/j;->a:Lku/p0;

    iget-object v1, p0, Lco/j;->b:Lcom/withpersona/sdk2/inquiry/document/step/b;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    invoke-static {v0, v1, p1}, Lcom/withpersona/sdk2/inquiry/document/step/b;->J(Lku/p0;Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
