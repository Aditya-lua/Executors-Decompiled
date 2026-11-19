.class public Lo9/d$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo9/d$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo9/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public final synthetic a:Lo9/d;


# direct methods
.method public constructor <init>(Lo9/d;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lo9/d$d;->a:Lo9/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Lk9/b;)V
    .locals 2
    .param p1    # Lk9/b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Lk9/b;->F3()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lo9/d$d;->a:Lo9/d;

    invoke-virtual {p1}, Lo9/d;->getScopes()Ljava/util/Set;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Lo9/d;->getRemoteService(Lo9/l;Ljava/util/Set;)V

    return-void

    :cond_0
    iget-object v0, p0, Lo9/d$d;->a:Lo9/d;

    invoke-virtual {v0}, Lo9/d;->zzl()Lo9/d$b;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lo9/d;->zzl()Lo9/d$b;

    move-result-object v0

    invoke-interface {v0, p1}, Lo9/d$b;->onConnectionFailed(Lk9/b;)V

    :cond_1
    return-void
.end method
