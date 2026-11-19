.class public Lbacktraceio/library/anr/ExitInfoAdapter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbacktraceio/library/anr/ExitInfo;


# instance fields
.field private final systemExitInfo:Landroid/app/ApplicationExitInfo;


# direct methods
.method public constructor <init>(Landroid/app/ApplicationExitInfo;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbacktraceio/library/anr/ExitInfoAdapter;->systemExitInfo:Landroid/app/ApplicationExitInfo;

    return-void
.end method


# virtual methods
.method public getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/anr/ExitInfoAdapter;->systemExitInfo:Landroid/app/ApplicationExitInfo;

    invoke-virtual {v0}, Landroid/app/ApplicationExitInfo;->getDescription()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getImportance()I
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/anr/ExitInfoAdapter;->systemExitInfo:Landroid/app/ApplicationExitInfo;

    invoke-virtual {v0}, Landroid/app/ApplicationExitInfo;->getImportance()I

    move-result v0

    return v0
.end method

.method public getPid()I
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/anr/ExitInfoAdapter;->systemExitInfo:Landroid/app/ApplicationExitInfo;

    invoke-virtual {v0}, Landroid/app/ApplicationExitInfo;->getPid()I

    move-result v0

    return v0
.end method

.method public getPss()J
    .locals 2

    iget-object v0, p0, Lbacktraceio/library/anr/ExitInfoAdapter;->systemExitInfo:Landroid/app/ApplicationExitInfo;

    invoke-virtual {v0}, Landroid/app/ApplicationExitInfo;->getPss()J

    move-result-wide v0

    return-wide v0
.end method

.method public getReason()I
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/anr/ExitInfoAdapter;->systemExitInfo:Landroid/app/ApplicationExitInfo;

    invoke-virtual {v0}, Landroid/app/ApplicationExitInfo;->getReason()I

    move-result v0

    return v0
.end method

.method public getRss()J
    .locals 2

    iget-object v0, p0, Lbacktraceio/library/anr/ExitInfoAdapter;->systemExitInfo:Landroid/app/ApplicationExitInfo;

    invoke-virtual {v0}, Landroid/app/ApplicationExitInfo;->getRss()J

    move-result-wide v0

    return-wide v0
.end method

.method public getTimestamp()J
    .locals 2

    iget-object v0, p0, Lbacktraceio/library/anr/ExitInfoAdapter;->systemExitInfo:Landroid/app/ApplicationExitInfo;

    invoke-virtual {v0}, Landroid/app/ApplicationExitInfo;->getTimestamp()J

    move-result-wide v0

    return-wide v0
.end method

.method public getTraceInputStream()Ljava/io/InputStream;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/anr/ExitInfoAdapter;->systemExitInfo:Landroid/app/ApplicationExitInfo;

    invoke-virtual {v0}, Landroid/app/ApplicationExitInfo;->getTraceInputStream()Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public getUid()I
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/anr/ExitInfoAdapter;->systemExitInfo:Landroid/app/ApplicationExitInfo;

    invoke-virtual {v0}, Landroid/app/ApplicationExitInfo;->getDefiningUid()I

    move-result v0

    return v0
.end method
