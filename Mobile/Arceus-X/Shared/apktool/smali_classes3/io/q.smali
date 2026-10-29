.class public final synthetic Lio/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/io/File;

    check-cast p2, Lcom/withpersona/sdk2/camera/CameraProperties;

    invoke-static {p1, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/l;->a(Ljava/io/File;Lcom/withpersona/sdk2/camera/CameraProperties;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
