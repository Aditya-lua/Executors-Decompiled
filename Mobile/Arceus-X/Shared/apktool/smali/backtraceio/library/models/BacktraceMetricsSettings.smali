.class public Lbacktraceio/library/models/BacktraceMetricsSettings;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final baseUrl:Ljava/lang/String;

.field private final timeBetweenRetriesMillis:I

.field private final timeIntervalMillis:J

.field private final token:Ljava/lang/String;

.field private final universe:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lj6/b;)V
    .locals 6

    const-wide/32 v3, 0x1b7740

    const/16 v5, 0x2710

    .line 1
    const-string v2, "https://events.backtrace.io/api"

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lbacktraceio/library/models/BacktraceMetricsSettings;-><init>(Lj6/b;Ljava/lang/String;JI)V

    return-void
.end method

.method public constructor <init>(Lj6/b;J)V
    .locals 6

    .line 3
    const-string v2, "https://events.backtrace.io/api"

    const/16 v5, 0x2710

    move-object v0, p0

    move-object v1, p1

    move-wide v3, p2

    invoke-direct/range {v0 .. v5}, Lbacktraceio/library/models/BacktraceMetricsSettings;-><init>(Lj6/b;Ljava/lang/String;JI)V

    return-void
.end method

.method public constructor <init>(Lj6/b;Ljava/lang/String;)V
    .locals 6

    const-wide/32 v3, 0x1b7740

    const/16 v5, 0x2710

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    .line 2
    invoke-direct/range {v0 .. v5}, Lbacktraceio/library/models/BacktraceMetricsSettings;-><init>(Lj6/b;Ljava/lang/String;JI)V

    return-void
.end method

.method public constructor <init>(Lj6/b;Ljava/lang/String;J)V
    .locals 6

    const/16 v5, 0x2710

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-wide v3, p3

    .line 4
    invoke-direct/range {v0 .. v5}, Lbacktraceio/library/models/BacktraceMetricsSettings;-><init>(Lj6/b;Ljava/lang/String;JI)V

    return-void
.end method

.method public constructor <init>(Lj6/b;Ljava/lang/String;JI)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    invoke-virtual {p1}, Lj6/b;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lbacktraceio/library/models/BacktraceMetricsSettings;->universe:Ljava/lang/String;

    .line 7
    invoke-virtual {p1}, Lj6/b;->e()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lbacktraceio/library/models/BacktraceMetricsSettings;->token:Ljava/lang/String;

    .line 8
    iput-object p2, p0, Lbacktraceio/library/models/BacktraceMetricsSettings;->baseUrl:Ljava/lang/String;

    .line 9
    iput-wide p3, p0, Lbacktraceio/library/models/BacktraceMetricsSettings;->timeIntervalMillis:J

    .line 10
    iput p5, p0, Lbacktraceio/library/models/BacktraceMetricsSettings;->timeBetweenRetriesMillis:I

    return-void
.end method


# virtual methods
.method public getBaseUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/models/BacktraceMetricsSettings;->baseUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getSubmissionUrl(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lbacktraceio/library/models/BacktraceMetricsSettings;->getBaseUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "/submit?token="

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lbacktraceio/library/models/BacktraceMetricsSettings;->getToken()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "&universe="

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lbacktraceio/library/models/BacktraceMetricsSettings;->getUniverseName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getTimeBetweenRetriesMillis()I
    .locals 1

    iget v0, p0, Lbacktraceio/library/models/BacktraceMetricsSettings;->timeBetweenRetriesMillis:I

    return v0
.end method

.method public getTimeIntervalMillis()J
    .locals 2

    iget-wide v0, p0, Lbacktraceio/library/models/BacktraceMetricsSettings;->timeIntervalMillis:J

    return-wide v0
.end method

.method public getToken()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/models/BacktraceMetricsSettings;->token:Ljava/lang/String;

    return-object v0
.end method

.method public getUniverseName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/models/BacktraceMetricsSettings;->universe:Ljava/lang/String;

    return-object v0
.end method

.method public isBacktraceServer()Z
    .locals 1

    invoke-virtual {p0}, Lbacktraceio/library/models/BacktraceMetricsSettings;->getUniverseName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
