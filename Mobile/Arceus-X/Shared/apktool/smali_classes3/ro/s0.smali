.class public final synthetic Lro/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Lro/v0;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

.field public final synthetic d:Luo/l;

.field public final synthetic e:Lvr/f;


# direct methods
.method public synthetic constructor <init>(Lro/v0;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Luo/l;Lvr/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lro/s0;->a:Lro/v0;

    iput-object p2, p0, Lro/s0;->b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;

    iput-object p3, p0, Lro/s0;->c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    iput-object p4, p0, Lro/s0;->d:Luo/l;

    iput-object p5, p0, Lro/s0;->e:Lvr/f;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lro/s0;->a:Lro/v0;

    iget-object v1, p0, Lro/s0;->b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;

    iget-object v2, p0, Lro/s0;->c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    iget-object v3, p0, Lro/s0;->d:Luo/l;

    iget-object v4, p0, Lro/s0;->e:Lvr/f;

    move-object v5, p1

    check-cast v5, Ljava/io/File;

    move-object v6, p2

    check-cast v6, Lcom/withpersona/sdk2/camera/CameraProperties;

    invoke-static/range {v0 .. v6}, Lro/v0;->g(Lro/v0;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Luo/l;Lvr/f;Ljava/io/File;Lcom/withpersona/sdk2/camera/CameraProperties;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
