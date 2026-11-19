.class public Lbacktraceio/library/anr/BacktraceANRExitInfoException;
.super Ljava/lang/Exception;
.source "SourceFile"


# instance fields
.field private final transient anrStackTrace:[Ljava/lang/StackTraceElement;


# direct methods
.method public constructor <init>(Lbacktraceio/library/anr/ExitInfo;[Ljava/lang/StackTraceElement;)V
    .locals 0

    invoke-static {p1}, Lbacktraceio/library/anr/AppExitInfoDetailsExtractor;->getANRMessage(Lbacktraceio/library/anr/ExitInfo;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lbacktraceio/library/anr/BacktraceANRExitInfoException;->anrStackTrace:[Ljava/lang/StackTraceElement;

    return-void
.end method


# virtual methods
.method public getStackTrace()[Ljava/lang/StackTraceElement;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lbacktraceio/library/anr/BacktraceANRExitInfoException;->anrStackTrace:[Ljava/lang/StackTraceElement;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-super {p0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    return-object v0
.end method
