.class public final synthetic Lbacktraceio/library/models/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbacktraceio/library/events/OnServerResponseEventListener;


# instance fields
.field public final synthetic a:Lbacktraceio/library/models/BacktraceExceptionHandler;

.field public final synthetic b:Ljava/lang/Thread;

.field public final synthetic c:Ljava/lang/Throwable;


# direct methods
.method public synthetic constructor <init>(Lbacktraceio/library/models/BacktraceExceptionHandler;Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbacktraceio/library/models/a;->a:Lbacktraceio/library/models/BacktraceExceptionHandler;

    iput-object p2, p0, Lbacktraceio/library/models/a;->b:Ljava/lang/Thread;

    iput-object p3, p0, Lbacktraceio/library/models/a;->c:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public final onEvent(Lbacktraceio/library/models/BacktraceResult;)V
    .locals 3

    iget-object v0, p0, Lbacktraceio/library/models/a;->a:Lbacktraceio/library/models/BacktraceExceptionHandler;

    iget-object v1, p0, Lbacktraceio/library/models/a;->b:Ljava/lang/Thread;

    iget-object v2, p0, Lbacktraceio/library/models/a;->c:Ljava/lang/Throwable;

    invoke-static {v0, v1, v2, p1}, Lbacktraceio/library/models/BacktraceExceptionHandler;->a(Lbacktraceio/library/models/BacktraceExceptionHandler;Ljava/lang/Thread;Ljava/lang/Throwable;Lbacktraceio/library/models/BacktraceResult;)V

    return-void
.end method
