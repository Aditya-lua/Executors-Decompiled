.class public final Ln9/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln9/c$b;


# instance fields
.field public final synthetic a:Ll9/n;


# direct methods
.method public constructor <init>(Ll9/n;)V
    .locals 0

    iput-object p1, p0, Ln9/c0;->a:Ll9/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 1
    .param p1    # Lcom/google/android/gms/common/ConnectionResult;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Ln9/c0;->a:Ll9/n;

    invoke-interface {v0, p1}, Ll9/n;->onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V

    return-void
.end method
