.class public final synthetic Llo/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;

.field public final synthetic d:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

.field public final synthetic e:Lcom/withpersona/sdk2/camera/CameraProperties;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Lcom/withpersona/sdk2/camera/CameraProperties;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llo/t;->a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    iput-object p2, p0, Llo/t;->b:Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;

    iput-object p3, p0, Llo/t;->c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;

    iput-object p4, p0, Llo/t;->d:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    iput-object p5, p0, Llo/t;->e:Lcom/withpersona/sdk2/camera/CameraProperties;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Llo/t;->a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    iget-object v1, p0, Llo/t;->b:Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;

    iget-object v2, p0, Llo/t;->c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;

    iget-object v3, p0, Llo/t;->d:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    iget-object v4, p0, Llo/t;->e:Lcom/withpersona/sdk2/camera/CameraProperties;

    move-object v5, p1

    check-cast v5, Lym/r$c;

    invoke-static/range {v0 .. v5}, Llo/t0;->M(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Lcom/withpersona/sdk2/camera/CameraProperties;Lym/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
