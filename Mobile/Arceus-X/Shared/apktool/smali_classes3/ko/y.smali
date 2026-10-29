.class public final synthetic Lko/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzt/o;


# instance fields
.field public final synthetic a:Lfn/x;

.field public final synthetic b:Lcom/withpersona/sdk2/camera/b;

.field public final synthetic c:Lgo/e;

.field public final synthetic d:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;


# direct methods
.method public synthetic constructor <init>(Lfn/x;Lcom/withpersona/sdk2/camera/b;Lgo/e;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lko/y;->a:Lfn/x;

    iput-object p2, p0, Lko/y;->b:Lcom/withpersona/sdk2/camera/b;

    iput-object p3, p0, Lko/y;->c:Lgo/e;

    iput-object p4, p0, Lko/y;->d:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lko/y;->a:Lfn/x;

    iget-object v1, p0, Lko/y;->b:Lcom/withpersona/sdk2/camera/b;

    iget-object v2, p0, Lko/y;->c:Lgo/e;

    iget-object v3, p0, Lko/y;->d:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-object v4, p1

    check-cast v4, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;

    move-object v5, p2

    check-cast v5, Lan/y;

    move-object v6, p3

    check-cast v6, Landroid/content/Context;

    move-object v7, p4

    check-cast v7, Landroid/view/ViewGroup;

    invoke-static/range {v0 .. v7}, Lko/z;->b(Lfn/x;Lcom/withpersona/sdk2/camera/b;Lgo/e;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
