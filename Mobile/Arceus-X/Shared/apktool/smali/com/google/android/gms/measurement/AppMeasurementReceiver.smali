.class public final Lcom/google/android/gms/measurement/AppMeasurementReceiver;
.super Lh4/a;
.source "SourceFile"

# interfaces
.implements Lnb/o6;


# instance fields
.field public c:Lnb/p6;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lh4/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/content/Intent;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1, p2}, Lh4/a;->c(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/ComponentName;

    return-void
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/content/Intent;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/android/gms/measurement/AppMeasurementReceiver;->c:Lnb/p6;

    if-nez v0, :cond_0

    new-instance v0, Lnb/p6;

    invoke-direct {v0, p0}, Lnb/p6;-><init>(Lnb/o6;)V

    iput-object v0, p0, Lcom/google/android/gms/measurement/AppMeasurementReceiver;->c:Lnb/p6;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/AppMeasurementReceiver;->c:Lnb/p6;

    invoke-virtual {v0, p1, p2}, Lnb/p6;->a(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method
