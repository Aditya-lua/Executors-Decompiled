.class public Lbacktraceio/library/common/RequestHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final CRLF:Ljava/lang/String; = "\r\n"

.field private static final ENCODING:Ljava/lang/String; = "utf-8"

.field private static final transient LOG_TAG:Ljava/lang/String; = "RequestHelper"


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

.method public static addEndOfRequest(Ljava/io/OutputStream;)V
    .locals 1

    if-nez p0, :cond_0

    sget-object p0, Lbacktraceio/library/common/RequestHelper;->LOG_TAG:Ljava/lang/String;

    const-string v0, "Output stream is null"

    invoke-static {p0, v0}, Lbacktraceio/library/logger/BacktraceLogger;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    const-string v0, "\r\n"

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write([B)V

    return-void
.end method

.method public static addJson(Ljava/io/OutputStream;Ljava/lang/String;)V
    .locals 1

    invoke-static {p1}, Lbacktraceio/library/common/BacktraceStringHelper;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lbacktraceio/library/common/RequestHelper;->LOG_TAG:Ljava/lang/String;

    const-string p1, "JSON is null or empty"

    invoke-static {p0, p1}, Lbacktraceio/library/logger/BacktraceLogger;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    if-nez p0, :cond_1

    sget-object p0, Lbacktraceio/library/common/RequestHelper;->LOG_TAG:Ljava/lang/String;

    const-string p1, "Output stream is null"

    invoke-static {p0, p1}, Lbacktraceio/library/logger/BacktraceLogger;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    const-string v0, "utf-8"

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write([B)V

    return-void
.end method

.method public static getContentType()Ljava/lang/String;
    .locals 1

    const-string v0, "application/json"

    return-object v0
.end method
