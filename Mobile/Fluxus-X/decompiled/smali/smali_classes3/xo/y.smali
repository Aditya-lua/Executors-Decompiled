.class public final synthetic Lxo/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpu/o;


# instance fields
.field public final synthetic a:Lsn/h0;

.field public final synthetic b:Lsn/t;

.field public final synthetic c:Lto/e;

.field public final synthetic d:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;


# direct methods
.method public synthetic constructor <init>(Lsn/h0;Lsn/t;Lto/e;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxo/y;->a:Lsn/h0;

    iput-object p2, p0, Lxo/y;->b:Lsn/t;

    iput-object p3, p0, Lxo/y;->c:Lto/e;

    iput-object p4, p0, Lxo/y;->d:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lxo/y;->a:Lsn/h0;

    iget-object v1, p0, Lxo/y;->b:Lsn/t;

    iget-object v2, p0, Lxo/y;->c:Lto/e;

    iget-object v3, p0, Lxo/y;->d:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-object v4, p1

    check-cast v4, Lvo/y3$b;

    move-object v5, p2

    check-cast v5, Lnn/z;

    move-object v6, p3

    check-cast v6, Landroid/content/Context;

    move-object v7, p4

    check-cast v7, Landroid/view/ViewGroup;

    invoke-static/range {v0 .. v7}, Lxo/z;->b(Lsn/h0;Lsn/t;Lto/e;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lvo/y3$b;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
