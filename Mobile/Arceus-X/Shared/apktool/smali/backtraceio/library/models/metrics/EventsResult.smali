.class public Lbacktraceio/library/models/metrics/EventsResult;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private eventsPayload:Lbacktraceio/library/models/metrics/EventsPayload;

.field public message:Ljava/lang/String;

.field public status:Lbacktraceio/library/models/types/BacktraceResultStatus;

.field private statusCode:I


# direct methods
.method public constructor <init>(Lbacktraceio/library/models/metrics/EventsPayload;Ljava/lang/String;Lbacktraceio/library/models/types/BacktraceResultStatus;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lbacktraceio/library/models/types/BacktraceResultStatus;->Ok:Lbacktraceio/library/models/types/BacktraceResultStatus;

    iput-object v0, p0, Lbacktraceio/library/models/metrics/EventsResult;->status:Lbacktraceio/library/models/types/BacktraceResultStatus;

    const/4 v0, -0x1

    iput v0, p0, Lbacktraceio/library/models/metrics/EventsResult;->statusCode:I

    invoke-virtual {p0, p1}, Lbacktraceio/library/models/metrics/EventsResult;->setEventsPayload(Lbacktraceio/library/models/metrics/EventsPayload;)V

    iput-object p2, p0, Lbacktraceio/library/models/metrics/EventsResult;->message:Ljava/lang/String;

    iput-object p3, p0, Lbacktraceio/library/models/metrics/EventsResult;->status:Lbacktraceio/library/models/types/BacktraceResultStatus;

    iput p4, p0, Lbacktraceio/library/models/metrics/EventsResult;->statusCode:I

    return-void
.end method

.method public static OnError(Lbacktraceio/library/models/metrics/EventsPayload;Ljava/lang/Exception;I)Lbacktraceio/library/models/metrics/EventsResult;
    .locals 2

    new-instance v0, Lbacktraceio/library/models/metrics/EventsResult;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Lbacktraceio/library/models/types/BacktraceResultStatus;->ServerError:Lbacktraceio/library/models/types/BacktraceResultStatus;

    invoke-direct {v0, p0, p1, v1, p2}, Lbacktraceio/library/models/metrics/EventsResult;-><init>(Lbacktraceio/library/models/metrics/EventsPayload;Ljava/lang/String;Lbacktraceio/library/models/types/BacktraceResultStatus;I)V

    return-object v0
.end method


# virtual methods
.method public getEventsPayload()Lbacktraceio/library/models/metrics/EventsPayload;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/models/metrics/EventsResult;->eventsPayload:Lbacktraceio/library/models/metrics/EventsPayload;

    return-object v0
.end method

.method public getStatusCode()I
    .locals 1

    iget v0, p0, Lbacktraceio/library/models/metrics/EventsResult;->statusCode:I

    return v0
.end method

.method public setEventsPayload(Lbacktraceio/library/models/metrics/EventsPayload;)V
    .locals 0

    iput-object p1, p0, Lbacktraceio/library/models/metrics/EventsResult;->eventsPayload:Lbacktraceio/library/models/metrics/EventsPayload;

    return-void
.end method

.method public setStatusCode(I)V
    .locals 0

    iput p1, p0, Lbacktraceio/library/models/metrics/EventsResult;->statusCode:I

    return-void
.end method
