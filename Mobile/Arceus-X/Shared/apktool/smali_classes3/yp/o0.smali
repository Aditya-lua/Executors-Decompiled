.class public final synthetic Lyp/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/camera/CameraProperties$b;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/camera/CameraProperties$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyp/o0;->a:Lcom/withpersona/sdk2/camera/CameraProperties$b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lyp/o0;->a:Lcom/withpersona/sdk2/camera/CameraProperties$b;

    check-cast p1, Lym/r$c;

    invoke-static {v0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/o;->c(Lcom/withpersona/sdk2/camera/CameraProperties$b;Lym/r$c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
