.class public final synthetic Lzp/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzt/o;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/camera/b;

.field public final synthetic b:Lct/a;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

.field public final synthetic d:Lgo/e;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/camera/b;Lct/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lgo/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzp/n0;->a:Lcom/withpersona/sdk2/camera/b;

    iput-object p2, p0, Lzp/n0;->b:Lct/a;

    iput-object p3, p0, Lzp/n0;->c:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    iput-object p4, p0, Lzp/n0;->d:Lgo/e;

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lzp/n0;->a:Lcom/withpersona/sdk2/camera/b;

    iget-object v1, p0, Lzp/n0;->b:Lct/a;

    iget-object v2, p0, Lzp/n0;->c:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    iget-object v3, p0, Lzp/n0;->d:Lgo/e;

    move-object v4, p1

    check-cast v4, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;

    move-object v5, p2

    check-cast v5, Lan/y;

    move-object v6, p3

    check-cast v6, Landroid/content/Context;

    move-object v7, p4

    check-cast v7, Landroid/view/ViewGroup;

    invoke-static/range {v0 .. v7}, Lzp/p0;->b(Lcom/withpersona/sdk2/camera/b;Lct/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lgo/e;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
