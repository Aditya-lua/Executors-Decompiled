.class public final synthetic Lyp/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzt/o;


# instance fields
.field public final synthetic a:Lct/a;

.field public final synthetic b:Lcom/withpersona/sdk2/camera/b;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;


# direct methods
.method public synthetic constructor <init>(Lct/a;Lcom/withpersona/sdk2/camera/b;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyp/l;->a:Lct/a;

    iput-object p2, p0, Lyp/l;->b:Lcom/withpersona/sdk2/camera/b;

    iput-object p3, p0, Lyp/l;->c:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lyp/l;->a:Lct/a;

    iget-object v1, p0, Lyp/l;->b:Lcom/withpersona/sdk2/camera/b;

    iget-object v2, p0, Lyp/l;->c:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-object v3, p1

    check-cast v3, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;

    move-object v4, p2

    check-cast v4, Lan/y;

    move-object v5, p3

    check-cast v5, Landroid/content/Context;

    move-object v6, p4

    check-cast v6, Landroid/view/ViewGroup;

    invoke-static/range {v0 .. v6}, Lcom/withpersona/sdk2/inquiry/selfie/d;->b(Lct/a;Lcom/withpersona/sdk2/camera/b;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
