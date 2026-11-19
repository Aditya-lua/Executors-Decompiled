.class public final synthetic Lnq/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpu/o;


# instance fields
.field public final synthetic a:Lsn/t;

.field public final synthetic b:Ltt/a;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

.field public final synthetic d:Lto/e;


# direct methods
.method public synthetic constructor <init>(Lsn/t;Ltt/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lto/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnq/n0;->a:Lsn/t;

    iput-object p2, p0, Lnq/n0;->b:Ltt/a;

    iput-object p3, p0, Lnq/n0;->c:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    iput-object p4, p0, Lnq/n0;->d:Lto/e;

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lnq/n0;->a:Lsn/t;

    iget-object v1, p0, Lnq/n0;->b:Ltt/a;

    iget-object v2, p0, Lnq/n0;->c:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    iget-object v3, p0, Lnq/n0;->d:Lto/e;

    move-object v4, p1

    check-cast v4, Lmq/q5$d$a;

    move-object v5, p2

    check-cast v5, Lnn/z;

    move-object v6, p3

    check-cast v6, Landroid/content/Context;

    move-object v7, p4

    check-cast v7, Landroid/view/ViewGroup;

    invoke-static/range {v0 .. v7}, Lnq/p0;->b(Lsn/t;Ltt/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lto/e;Lmq/q5$d$a;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
