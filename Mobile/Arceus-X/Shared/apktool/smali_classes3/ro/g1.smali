.class public final synthetic Lro/g1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lro/j1;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

.field public final synthetic c:Lur/a;

.field public final synthetic d:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeWebRtc;

.field public final synthetic e:Lvr/f;

.field public final synthetic f:Luo/l;


# direct methods
.method public synthetic constructor <init>(Lro/j1;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lur/a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeWebRtc;Lvr/f;Luo/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lro/g1;->a:Lro/j1;

    iput-object p2, p0, Lro/g1;->b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    iput-object p3, p0, Lro/g1;->c:Lur/a;

    iput-object p4, p0, Lro/g1;->d:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeWebRtc;

    iput-object p5, p0, Lro/g1;->e:Lvr/f;

    iput-object p6, p0, Lro/g1;->f:Luo/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lro/g1;->a:Lro/j1;

    iget-object v1, p0, Lro/g1;->b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    iget-object v2, p0, Lro/g1;->c:Lur/a;

    iget-object v3, p0, Lro/g1;->d:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeWebRtc;

    iget-object v4, p0, Lro/g1;->e:Lvr/f;

    iget-object v5, p0, Lro/g1;->f:Luo/l;

    move-object v6, p1

    check-cast v6, Ljava/lang/String;

    invoke-static/range {v0 .. v6}, Lro/j1;->f(Lro/j1;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lur/a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeWebRtc;Lvr/f;Luo/l;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
