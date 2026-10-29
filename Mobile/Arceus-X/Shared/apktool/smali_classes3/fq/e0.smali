.class public final synthetic Lfq/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lfq/k2;


# direct methods
.method public synthetic constructor <init>(Lfq/k2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfq/e0;->a:Lfq/k2;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lfq/e0;->a:Lfq/k2;

    check-cast p1, Lcom/withpersona/sdk2/camera/CameraProperties$b;

    invoke-static {v0, p1}, Lfq/k2;->j(Lfq/k2;Lcom/withpersona/sdk2/camera/CameraProperties$b;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
