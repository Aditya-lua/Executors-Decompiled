.class public final synthetic Lbacktraceio/library/anr/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbacktraceio/library/events/OnServerResponseEventListener;


# instance fields
.field public final synthetic a:Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler;

.field public final synthetic b:Lbacktraceio/library/anr/ExitInfo;


# direct methods
.method public synthetic constructor <init>(Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler;Lbacktraceio/library/anr/ExitInfo;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbacktraceio/library/anr/a;->a:Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler;

    iput-object p2, p0, Lbacktraceio/library/anr/a;->b:Lbacktraceio/library/anr/ExitInfo;

    return-void
.end method


# virtual methods
.method public final onEvent(Lbacktraceio/library/models/BacktraceResult;)V
    .locals 2

    iget-object v0, p0, Lbacktraceio/library/anr/a;->a:Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler;

    iget-object v1, p0, Lbacktraceio/library/anr/a;->b:Lbacktraceio/library/anr/ExitInfo;

    invoke-static {v0, v1, p1}, Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler;->a(Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler;Lbacktraceio/library/anr/ExitInfo;Lbacktraceio/library/models/BacktraceResult;)V

    return-void
.end method
