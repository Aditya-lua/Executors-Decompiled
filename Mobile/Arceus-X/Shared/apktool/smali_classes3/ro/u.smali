.class public final synthetic Lro/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lro/m0;

.field public final synthetic b:Lvr/f;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

.field public final synthetic d:Luo/l;


# direct methods
.method public synthetic constructor <init>(Lro/m0;Lvr/f;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Luo/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lro/u;->a:Lro/m0;

    iput-object p2, p0, Lro/u;->b:Lvr/f;

    iput-object p3, p0, Lro/u;->c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    iput-object p4, p0, Lro/u;->d:Luo/l;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lro/u;->a:Lro/m0;

    iget-object v1, p0, Lro/u;->b:Lvr/f;

    iget-object v2, p0, Lro/u;->c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    iget-object v3, p0, Lro/u;->d:Luo/l;

    invoke-static {v0, v1, v2, v3}, Lro/m0;->c(Lro/m0;Lvr/f;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Luo/l;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
