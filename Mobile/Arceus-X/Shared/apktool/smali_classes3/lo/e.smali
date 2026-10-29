.class public final synthetic Llo/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;

.field public final synthetic c:Llo/t0;

.field public final synthetic d:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

.field public final synthetic e:Lym/k$a;

.field public final synthetic f:Luo/l;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Llo/t0;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lym/k$a;Luo/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llo/e;->a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    iput-object p2, p0, Llo/e;->b:Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;

    iput-object p3, p0, Llo/e;->c:Llo/t0;

    iput-object p4, p0, Llo/e;->d:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    iput-object p5, p0, Llo/e;->e:Lym/k$a;

    iput-object p6, p0, Llo/e;->f:Luo/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Llo/e;->a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    iget-object v1, p0, Llo/e;->b:Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;

    iget-object v2, p0, Llo/e;->c:Llo/t0;

    iget-object v3, p0, Llo/e;->d:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    iget-object v4, p0, Llo/e;->e:Lym/k$a;

    iget-object v5, p0, Llo/e;->f:Luo/l;

    move-object v6, p1

    check-cast v6, Ljava/util/List;

    move-object v7, p2

    check-cast v7, Lcom/withpersona/sdk2/camera/CameraProperties;

    invoke-static/range {v0 .. v7}, Llo/t0;->l(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Llo/t0;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lym/k$a;Luo/l;Ljava/util/List;Lcom/withpersona/sdk2/camera/CameraProperties;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
