.class public final synthetic Lvg/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbacktraceio/library/events/OnBeforeSendEventListener;


# instance fields
.field public final synthetic a:Lvg/e;

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lvg/e;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvg/a;->a:Lvg/e;

    iput-object p2, p0, Lvg/a;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final onEvent(Lbacktraceio/library/models/BacktraceData;)Lbacktraceio/library/models/BacktraceData;
    .locals 2

    iget-object v0, p0, Lvg/a;->a:Lvg/e;

    iget-object v1, p0, Lvg/a;->b:Landroid/content/Context;

    invoke-static {v0, v1, p1}, Lvg/e;->a(Lvg/e;Landroid/content/Context;Lbacktraceio/library/models/BacktraceData;)Lbacktraceio/library/models/BacktraceData;

    move-result-object p1

    return-object p1
.end method
