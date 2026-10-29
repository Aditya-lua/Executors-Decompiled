.class public final synthetic Lro/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lro/v0;

.field public final synthetic b:Lvr/f;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;


# direct methods
.method public synthetic constructor <init>(Lro/v0;Lvr/f;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lro/u0;->a:Lro/v0;

    iput-object p2, p0, Lro/u0;->b:Lvr/f;

    iput-object p3, p0, Lro/u0;->c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lro/u0;->a:Lro/v0;

    iget-object v1, p0, Lro/u0;->b:Lvr/f;

    iget-object v2, p0, Lro/u0;->c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    invoke-static {v0, v1, v2}, Lro/v0;->d(Lro/v0;Lvr/f;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
