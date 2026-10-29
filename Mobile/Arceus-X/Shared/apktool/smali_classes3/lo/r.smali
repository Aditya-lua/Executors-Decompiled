.class public final synthetic Llo/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;

.field public final synthetic d:Lcom/withpersona/sdk2/camera/CameraProperties;

.field public final synthetic e:I

.field public final synthetic f:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/camera/CameraProperties;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llo/r;->a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    iput-object p2, p0, Llo/r;->b:Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;

    iput-object p3, p0, Llo/r;->c:Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;

    iput-object p4, p0, Llo/r;->d:Lcom/withpersona/sdk2/camera/CameraProperties;

    iput p5, p0, Llo/r;->e:I

    iput-object p6, p0, Llo/r;->f:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Llo/r;->a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    iget-object v1, p0, Llo/r;->b:Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;

    iget-object v2, p0, Llo/r;->c:Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;

    iget-object v3, p0, Llo/r;->d:Lcom/withpersona/sdk2/camera/CameraProperties;

    iget v4, p0, Llo/r;->e:I

    iget-object v5, p0, Llo/r;->f:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;

    move-object v6, p1

    check-cast v6, Lym/r$c;

    invoke-static/range {v0 .. v6}, Llo/t0;->x(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/camera/CameraProperties;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;Lym/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
