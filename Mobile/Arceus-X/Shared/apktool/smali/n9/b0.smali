.class public final Ln9/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln9/c$a;


# instance fields
.field public final synthetic a:Ll9/e;


# direct methods
.method public constructor <init>(Ll9/e;)V
    .locals 0

    iput-object p1, p0, Ln9/b0;->a:Ll9/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onConnected(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Ln9/b0;->a:Ll9/e;

    invoke-interface {v0, p1}, Ll9/e;->onConnected(Landroid/os/Bundle;)V

    return-void
.end method

.method public final onConnectionSuspended(I)V
    .locals 1

    iget-object v0, p0, Ln9/b0;->a:Ll9/e;

    invoke-interface {v0, p1}, Ll9/e;->onConnectionSuspended(I)V

    return-void
.end method
