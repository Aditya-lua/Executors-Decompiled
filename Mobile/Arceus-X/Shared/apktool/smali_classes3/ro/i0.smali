.class public final synthetic Lro/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;

.field public final synthetic b:Lro/m0;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

.field public final synthetic d:Lvr/f;

.field public final synthetic e:Luo/l;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;Lro/m0;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lvr/f;Luo/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lro/i0;->a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;

    iput-object p2, p0, Lro/i0;->b:Lro/m0;

    iput-object p3, p0, Lro/i0;->c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    iput-object p4, p0, Lro/i0;->d:Lvr/f;

    iput-object p5, p0, Lro/i0;->e:Luo/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lro/i0;->a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;

    iget-object v1, p0, Lro/i0;->b:Lro/m0;

    iget-object v2, p0, Lro/i0;->c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    iget-object v3, p0, Lro/i0;->d:Lvr/f;

    iget-object v4, p0, Lro/i0;->e:Luo/l;

    move-object v5, p1

    check-cast v5, Ljava/util/List;

    move-object v6, p2

    check-cast v6, Lcom/withpersona/sdk2/camera/CameraProperties;

    invoke-static/range {v0 .. v6}, Lro/m0;->v(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;Lro/m0;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lvr/f;Luo/l;Ljava/util/List;Lcom/withpersona/sdk2/camera/CameraProperties;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
