.class public final Lo9/j1;
.super Lo9/v0;
.source "SourceFile"


# instance fields
.field public final synthetic g:Lo9/d;


# direct methods
.method public constructor <init>(Lo9/d;ILandroid/os/Bundle;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lo9/j1;->g:Lo9/d;

    invoke-direct {p0, p1, p2, p3}, Lo9/v0;-><init>(Lo9/d;ILandroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method public final e()Z
    .locals 2

    iget-object v0, p0, Lo9/j1;->g:Lo9/d;

    iget-object v0, v0, Lo9/d;->zzc:Lo9/d$c;

    sget-object v1, Lk9/b;->k:Lk9/b;

    invoke-interface {v0, v1}, Lo9/d$c;->c(Lk9/b;)V

    const/4 v0, 0x1

    return v0
.end method

.method public final f(Lk9/b;)V
    .locals 2

    iget-object v0, p0, Lo9/j1;->g:Lo9/d;

    invoke-virtual {v0}, Lo9/d;->enableLocalFallback()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lo9/d;->zzg()Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 p1, 0x10

    invoke-virtual {v0, p1}, Lo9/d;->zzf(I)V

    return-void

    :cond_0
    iget-object v1, v0, Lo9/d;->zzc:Lo9/d$c;

    invoke-interface {v1, p1}, Lo9/d$c;->c(Lk9/b;)V

    invoke-virtual {v0, p1}, Lo9/d;->onConnectionFailed(Lk9/b;)V

    return-void
.end method
