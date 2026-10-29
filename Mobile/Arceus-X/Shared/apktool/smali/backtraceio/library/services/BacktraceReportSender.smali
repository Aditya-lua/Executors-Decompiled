.class Lbacktraceio/library/services/BacktraceReportSender;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final CHUNK_SIZE:I = 0x20000

.field private static final LOG_TAG:Ljava/lang/String; = "BacktraceReportSender"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static sendEvents(Ljava/lang/String;Ljava/lang/String;Lbacktraceio/library/models/metrics/EventsPayload;Lbacktraceio/library/events/OnServerErrorEventListener;)Lbacktraceio/library/models/metrics/EventsResult;
    .locals 8

    const-string v0, "Disconnecting HttpUrlConnection failed"

    const-string v1, "Disconnecting HttpUrlConnection successful"

    const/4 v2, 0x0

    const/4 v3, -0x1

    :try_start_0
    new-instance v4, Ljava/net/URL;

    invoke-direct {v4, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v4

    check-cast v4, Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    const-string v2, "POST"

    invoke-virtual {v4, v2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-virtual {v4, v2}, Ljava/net/URLConnection;->setUseCaches(Z)V

    const/4 v2, 0x1

    invoke-virtual {v4, v2}, Ljava/net/URLConnection;->setDoOutput(Z)V

    invoke-virtual {v4, v2}, Ljava/net/URLConnection;->setDoInput(Z)V

    const-string v2, "Connection"

    const-string v5, "Keep-Alive"

    invoke-virtual {v4, v2, v5}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "Content-Type"

    invoke-static {}, Lbacktraceio/library/common/RequestHelper;->getContentType()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v2, v5}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v2, Lbacktraceio/library/services/BacktraceReportSender;->LOG_TAG:Ljava/lang/String;

    const-string v5, "HttpURLConnection successfully initialized"

    invoke-static {v2, v5}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v5, Ljava/io/DataOutputStream;

    invoke-virtual {v4}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    invoke-static {v5, p1}, Lbacktraceio/library/common/RequestHelper;->addJson(Ljava/io/OutputStream;Ljava/lang/String;)V

    invoke-static {v5}, Lbacktraceio/library/common/RequestHelper;->addEndOfRequest(Ljava/io/OutputStream;)V

    invoke-virtual {v5}, Ljava/io/DataOutputStream;->flush()V

    invoke-virtual {v5}, Ljava/io/OutputStream;->close()V

    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v3

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Received response status from Backtrace API for HTTP request is: "

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/16 p1, 0xc8

    if-ne v3, p1, :cond_0

    new-instance p1, Lbacktraceio/library/models/metrics/EventsResult;

    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lbacktraceio/library/models/types/BacktraceResultStatus;->Ok:Lbacktraceio/library/models/types/BacktraceResultStatus;

    invoke-direct {p1, p2, v5, v6, v3}, Lbacktraceio/library/models/metrics/EventsResult;-><init>(Lbacktraceio/library/models/metrics/EventsPayload;Ljava/lang/String;Lbacktraceio/library/models/types/BacktraceResultStatus;I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    invoke-static {v2, v1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object p1

    :catch_0
    move-exception p0

    sget-object p1, Lbacktraceio/library/services/BacktraceReportSender;->LOG_TAG:Ljava/lang/String;

    invoke-static {p1, v0, p0}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    invoke-static {p2, p0, v3}, Lbacktraceio/library/models/metrics/EventsResult;->OnError(Lbacktraceio/library/models/metrics/EventsPayload;Ljava/lang/Exception;I)Lbacktraceio/library/models/metrics/EventsResult;

    move-result-object p0

    goto :goto_1

    :catchall_0
    move-exception p0

    move-object v2, v4

    goto :goto_2

    :catch_1
    move-exception p1

    move-object v2, v4

    goto :goto_0

    :cond_0
    :try_start_3
    invoke-static {v4}, Lbacktraceio/library/http/HttpHelper;->getResponseMessage(Ljava/net/HttpURLConnection;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lbacktraceio/library/common/BacktraceStringHelper;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    move-result-object p1

    :cond_1
    new-instance v2, Lbacktraceio/library/models/types/HttpException;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const-string v6, "%s: %s"

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    filled-new-array {v7, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v6, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, v5, p1}, Lbacktraceio/library/models/types/HttpException;-><init>(Ljava/lang/Integer;Ljava/lang/String;)V

    throw v2
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_1
    move-exception p0

    goto :goto_2

    :catch_2
    move-exception p1

    :goto_0
    if-eqz p3, :cond_2

    :try_start_4
    sget-object v4, Lbacktraceio/library/services/BacktraceReportSender;->LOG_TAG:Ljava/lang/String;

    const-string v5, "Custom handler on server error"

    invoke-static {v4, v5}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-interface {p3, p1}, Lbacktraceio/library/events/OnServerErrorEventListener;->onEvent(Ljava/lang/Exception;)V

    :cond_2
    sget-object p3, Lbacktraceio/library/services/BacktraceReportSender;->LOG_TAG:Ljava/lang/String;

    const-string v4, "Sending HTTP request failed to Backtrace API"

    invoke-static {p3, v4, p1}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Failed HTTP request URL "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p3, p0}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p2, p1, v3}, Lbacktraceio/library/models/metrics/EventsResult;->OnError(Lbacktraceio/library/models/metrics/EventsPayload;Ljava/lang/Exception;I)Lbacktraceio/library/models/metrics/EventsResult;

    move-result-object p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-eqz v2, :cond_3

    :try_start_5
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    invoke-static {p3, v1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    :cond_3
    :goto_1
    return-object p0

    :goto_2
    if-eqz v2, :cond_4

    :try_start_6
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    sget-object p1, Lbacktraceio/library/services/BacktraceReportSender;->LOG_TAG:Ljava/lang/String;

    invoke-static {p1, v1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    goto :goto_3

    :catch_3
    move-exception p1

    sget-object p3, Lbacktraceio/library/services/BacktraceReportSender;->LOG_TAG:Ljava/lang/String;

    invoke-static {p3, v0, p1}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    invoke-static {p2, p1, v3}, Lbacktraceio/library/models/metrics/EventsResult;->OnError(Lbacktraceio/library/models/metrics/EventsPayload;Ljava/lang/Exception;I)Lbacktraceio/library/models/metrics/EventsResult;

    :cond_4
    :goto_3
    throw p0
.end method

.method public static sendReport(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lbacktraceio/library/models/json/BacktraceReport;Lbacktraceio/library/events/OnServerErrorEventListener;)Lbacktraceio/library/models/BacktraceResult;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lbacktraceio/library/models/json/BacktraceReport;",
            "Lbacktraceio/library/events/OnServerErrorEventListener;",
            ")",
            "Lbacktraceio/library/models/BacktraceResult;"
        }
    .end annotation

    const-string v0, "Disconnecting HttpUrlConnection failed"

    const-string v1, "Disconnecting HttpUrlConnection successful"

    const/4 v2, 0x0

    :try_start_0
    new-instance v3, Ljava/net/URL;

    invoke-direct {v3, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p0

    check-cast p0, Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    const-string v2, "POST"

    invoke-virtual {p0, v2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-virtual {p0, v2}, Ljava/net/URLConnection;->setUseCaches(Z)V

    const/4 v2, 0x1

    invoke-virtual {p0, v2}, Ljava/net/URLConnection;->setDoOutput(Z)V

    invoke-virtual {p0, v2}, Ljava/net/URLConnection;->setDoInput(Z)V

    const/high16 v2, 0x20000

    invoke-virtual {p0, v2}, Ljava/net/HttpURLConnection;->setChunkedStreamingMode(I)V

    const-string v2, "Connection"

    const-string v3, "Keep-Alive"

    invoke-virtual {p0, v2, v3}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "Cache-Control"

    const-string v3, "no-cache"

    invoke-virtual {p0, v2, v3}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "Content-Type"

    invoke-static {}, Lbacktraceio/library/common/MultiFormRequestHelper;->getContentType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v2, v3}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v2, Lbacktraceio/library/services/BacktraceReportSender;->LOG_TAG:Ljava/lang/String;

    const-string v3, "HttpURLConnection successfully initialized"

    invoke-static {v2, v3}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v3, Ljava/io/DataOutputStream;

    invoke-virtual {p0}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    invoke-static {v3, p1}, Lbacktraceio/library/common/MultiFormRequestHelper;->addJson(Ljava/io/OutputStream;Ljava/lang/String;)V

    invoke-static {v3, p2}, Lbacktraceio/library/common/MultiFormRequestHelper;->addFiles(Ljava/io/OutputStream;Ljava/util/List;)V

    invoke-static {v3}, Lbacktraceio/library/common/MultiFormRequestHelper;->addEndOfRequest(Ljava/io/OutputStream;)V

    invoke-virtual {v3}, Ljava/io/DataOutputStream;->flush()V

    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V

    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Received response status from Backtrace API for HTTP request is: "

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v2, p2}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/16 p2, 0xc8

    if-ne p1, p2, :cond_0

    invoke-static {p0}, Lbacktraceio/library/http/HttpHelper;->getResponseMessage(Ljava/net/HttpURLConnection;)Ljava/lang/String;

    move-result-object p1

    const-class p2, Lbacktraceio/library/models/BacktraceApiResult;

    invoke-static {p1, p2}, Lbacktraceio/library/common/BacktraceSerializeHelper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbacktraceio/library/models/BacktraceApiResult;

    new-instance p2, Lbacktraceio/library/models/BacktraceResult;

    invoke-direct {p2, p1}, Lbacktraceio/library/models/BacktraceResult;-><init>(Lbacktraceio/library/models/BacktraceApiResult;)V

    invoke-virtual {p2, p3}, Lbacktraceio/library/models/BacktraceResult;->setBacktraceReport(Lbacktraceio/library/models/json/BacktraceReport;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->disconnect()V

    invoke-static {v2, v1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object p2

    :catch_0
    move-exception p0

    sget-object p1, Lbacktraceio/library/services/BacktraceReportSender;->LOG_TAG:Ljava/lang/String;

    invoke-static {p1, v0, p0}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    invoke-static {p3, p0}, Lbacktraceio/library/models/BacktraceResult;->OnError(Lbacktraceio/library/models/json/BacktraceReport;Ljava/lang/Exception;)Lbacktraceio/library/models/BacktraceResult;

    move-result-object p0

    goto :goto_1

    :catchall_0
    move-exception p1

    move-object v2, p0

    goto :goto_2

    :catch_1
    move-exception p1

    move-object v2, p0

    goto :goto_0

    :cond_0
    :try_start_3
    invoke-static {p0}, Lbacktraceio/library/http/HttpHelper;->getResponseMessage(Ljava/net/HttpURLConnection;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lbacktraceio/library/common/BacktraceStringHelper;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    move-result-object p2

    :cond_1
    new-instance v2, Lbacktraceio/library/models/types/HttpException;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "%s: %s"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v4, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, v3, p1}, Lbacktraceio/library/models/types/HttpException;-><init>(Ljava/lang/Integer;Ljava/lang/String;)V

    throw v2
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_1
    move-exception p1

    goto :goto_2

    :catch_2
    move-exception p1

    :goto_0
    if-eqz p4, :cond_2

    :try_start_4
    sget-object p0, Lbacktraceio/library/services/BacktraceReportSender;->LOG_TAG:Ljava/lang/String;

    const-string p2, "Custom handler on server error"

    invoke-static {p0, p2}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-interface {p4, p1}, Lbacktraceio/library/events/OnServerErrorEventListener;->onEvent(Ljava/lang/Exception;)V

    :cond_2
    sget-object p0, Lbacktraceio/library/services/BacktraceReportSender;->LOG_TAG:Ljava/lang/String;

    const-string p2, "Sending HTTP request failed to Backtrace API"

    invoke-static {p0, p2, p1}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    invoke-static {p3, p1}, Lbacktraceio/library/models/BacktraceResult;->OnError(Lbacktraceio/library/models/json/BacktraceReport;Ljava/lang/Exception;)Lbacktraceio/library/models/BacktraceResult;

    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-eqz v2, :cond_3

    :try_start_5
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    invoke-static {p0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    :cond_3
    move-object p0, p1

    :goto_1
    return-object p0

    :goto_2
    if-eqz v2, :cond_4

    :try_start_6
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    sget-object p0, Lbacktraceio/library/services/BacktraceReportSender;->LOG_TAG:Ljava/lang/String;

    invoke-static {p0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    goto :goto_3

    :catch_3
    move-exception p0

    sget-object p2, Lbacktraceio/library/services/BacktraceReportSender;->LOG_TAG:Ljava/lang/String;

    invoke-static {p2, v0, p0}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    invoke-static {p3, p0}, Lbacktraceio/library/models/BacktraceResult;->OnError(Lbacktraceio/library/models/json/BacktraceReport;Ljava/lang/Exception;)Lbacktraceio/library/models/BacktraceResult;

    :cond_4
    :goto_3
    throw p1
.end method
