.class public Lo5/b0$b;
.super Lo5/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo5/b0;->l0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lo5/b0;


# direct methods
.method public constructor <init>(Lo5/b0;)V
    .locals 0

    iput-object p1, p0, Lo5/b0$b;->a:Lo5/b0;

    invoke-direct {p0}, Lo5/x;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lo5/q;)V
    .locals 2
    .param p1    # Lo5/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lo5/b0$b;->a:Lo5/b0;

    iget-object v0, v0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, Lo5/b0$b;->a:Lo5/b0;

    invoke-virtual {p1}, Lo5/b0;->X()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lo5/b0$b;->a:Lo5/b0;

    sget-object v0, Lo5/q$i;->c:Lo5/q$i;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lo5/q;->i0(Lo5/q$i;Z)V

    iget-object p1, p0, Lo5/b0$b;->a:Lo5/b0;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lo5/q;->B:Z

    sget-object v0, Lo5/q$i;->b:Lo5/q$i;

    invoke-virtual {p1, v0, v1}, Lo5/q;->i0(Lo5/q$i;Z)V

    :cond_0
    return-void
.end method
