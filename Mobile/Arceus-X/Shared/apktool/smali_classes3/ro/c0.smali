.class public final synthetic Lro/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lro/m0;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;


# direct methods
.method public synthetic constructor <init>(Lro/m0;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lro/c0;->a:Lro/m0;

    iput-object p2, p0, Lro/c0;->b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lro/c0;->a:Lro/m0;

    iget-object v1, p0, Lro/c0;->b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    invoke-static {v0, v1}, Lro/m0;->n(Lro/m0;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
