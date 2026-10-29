.class public final synthetic Luo/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;

.field public final synthetic b:Lym/k$a;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

.field public final synthetic d:Luo/l;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Luo/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luo/e;->a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;

    iput-object p2, p0, Luo/e;->b:Lym/k$a;

    iput-object p3, p0, Luo/e;->c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    iput-object p4, p0, Luo/e;->d:Luo/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Luo/e;->a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;

    iget-object v1, p0, Luo/e;->b:Lym/k$a;

    iget-object v2, p0, Luo/e;->c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    iget-object v3, p0, Luo/e;->d:Luo/l;

    move-object v4, p1

    check-cast v4, Ljava/io/File;

    move-object v5, p2

    check-cast v5, Lcom/withpersona/sdk2/camera/CameraProperties;

    invoke-static/range {v0 .. v5}, Luo/j;->f(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Luo/l;Ljava/io/File;Lcom/withpersona/sdk2/camera/CameraProperties;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
