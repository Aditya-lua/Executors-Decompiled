.class public final Lo9/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo9/d$a;


# instance fields
.field public final synthetic a:Lm9/e;


# direct methods
.method public constructor <init>(Lm9/e;)V
    .locals 0

    iput-object p1, p0, Lo9/j0;->a:Lm9/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onConnected(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lo9/j0;->a:Lm9/e;

    invoke-interface {v0, p1}, Lm9/e;->onConnected(Landroid/os/Bundle;)V

    return-void
.end method

.method public final onConnectionSuspended(I)V
    .locals 1

    iget-object v0, p0, Lo9/j0;->a:Lm9/e;

    invoke-interface {v0, p1}, Lm9/e;->onConnectionSuspended(I)V

    return-void
.end method
