.class public final synthetic Lmq/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpu/o;


# instance fields
.field public final synthetic a:Ltt/a;

.field public final synthetic b:Lsn/t;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;


# direct methods
.method public synthetic constructor <init>(Ltt/a;Lsn/t;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmq/o;->a:Ltt/a;

    iput-object p2, p0, Lmq/o;->b:Lsn/t;

    iput-object p3, p0, Lmq/o;->c:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lmq/o;->a:Ltt/a;

    iget-object v1, p0, Lmq/o;->b:Lsn/t;

    iget-object v2, p0, Lmq/o;->c:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-object v3, p1

    check-cast v3, Lmq/q5$d$c;

    move-object v4, p2

    check-cast v4, Lnn/z;

    move-object v5, p3

    check-cast v5, Landroid/content/Context;

    move-object v6, p4

    check-cast v6, Landroid/view/ViewGroup;

    invoke-static/range {v0 .. v6}, Lmq/p;->b(Ltt/a;Lsn/t;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lmq/q5$d$c;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
