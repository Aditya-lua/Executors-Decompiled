.class public final synthetic Lcom/withpersona/sdk2/inquiry/tracking/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/b;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/b;->a:Ljava/lang/String;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$TrackingEventData;

    invoke-static {v0, p1}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;->a(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$TrackingEventData;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
