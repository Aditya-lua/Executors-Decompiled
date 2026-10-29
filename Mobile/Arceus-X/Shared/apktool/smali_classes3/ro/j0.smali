.class public final synthetic Lro/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lvr/f;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

.field public final synthetic d:Luo/l;


# direct methods
.method public synthetic constructor <init>(Lvr/f;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Luo/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lro/j0;->a:Lvr/f;

    iput-object p2, p0, Lro/j0;->b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;

    iput-object p3, p0, Lro/j0;->c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    iput-object p4, p0, Lro/j0;->d:Luo/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lro/j0;->a:Lvr/f;

    iget-object v1, p0, Lro/j0;->b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;

    iget-object v2, p0, Lro/j0;->c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    iget-object v3, p0, Lro/j0;->d:Luo/l;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, v1, v2, v3, p1}, Lro/m0;->b(Lvr/f;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Luo/l;Ljava/lang/Throwable;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
