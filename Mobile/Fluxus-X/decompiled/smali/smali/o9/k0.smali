.class public final Lo9/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo9/d$b;


# instance fields
.field public final synthetic a:Lm9/n;


# direct methods
.method public constructor <init>(Lm9/n;)V
    .locals 0

    iput-object p1, p0, Lo9/k0;->a:Lm9/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onConnectionFailed(Lk9/b;)V
    .locals 1
    .param p1    # Lk9/b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lo9/k0;->a:Lm9/n;

    invoke-interface {v0, p1}, Lm9/n;->onConnectionFailed(Lk9/b;)V

    return-void
.end method
