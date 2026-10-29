.class public final synthetic Lj6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbacktraceio/library/events/OnSuccessfulBreadcrumbAddEventListener;


# instance fields
.field public final synthetic a:Lbacktraceio/library/BacktraceDatabase;


# direct methods
.method public synthetic constructor <init>(Lbacktraceio/library/BacktraceDatabase;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj6/c;->a:Lbacktraceio/library/BacktraceDatabase;

    return-void
.end method


# virtual methods
.method public final onSuccessfulAdd(J)V
    .locals 1

    iget-object v0, p0, Lj6/c;->a:Lbacktraceio/library/BacktraceDatabase;

    invoke-static {v0, p1, p2}, Lbacktraceio/library/BacktraceDatabase;->a(Lbacktraceio/library/BacktraceDatabase;J)V

    return-void
.end method
