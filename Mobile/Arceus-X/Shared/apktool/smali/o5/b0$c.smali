.class public Lo5/b0$c;
.super Lo5/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo5/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public a:Lo5/b0;


# direct methods
.method public constructor <init>(Lo5/b0;)V
    .locals 0

    invoke-direct {p0}, Lo5/x;-><init>()V

    iput-object p1, p0, Lo5/b0$c;->a:Lo5/b0;

    return-void
.end method


# virtual methods
.method public g(Lo5/q;)V
    .locals 1
    .param p1    # Lo5/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object p1, p0, Lo5/b0$c;->a:Lo5/b0;

    iget-boolean v0, p1, Lo5/b0;->T:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lo5/q;->z0()V

    iget-object p1, p0, Lo5/b0$c;->a:Lo5/b0;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lo5/b0;->T:Z

    :cond_0
    return-void
.end method

.method public k(Lo5/q;)V
    .locals 2
    .param p1    # Lo5/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lo5/b0$c;->a:Lo5/b0;

    iget v1, v0, Lo5/b0;->S:I

    add-int/lit8 v1, v1, -0x1

    iput v1, v0, Lo5/b0;->S:I

    if-nez v1, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, v0, Lo5/b0;->T:Z

    invoke-virtual {v0}, Lo5/q;->w()V

    :cond_0
    invoke-virtual {p1, p0}, Lo5/q;->m0(Lo5/q$h;)Lo5/q;

    return-void
.end method
