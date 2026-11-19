.class public Lp5/b0$c;
.super Lp5/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp5/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public a:Lp5/b0;


# direct methods
.method public constructor <init>(Lp5/b0;)V
    .locals 0

    invoke-direct {p0}, Lp5/x;-><init>()V

    iput-object p1, p0, Lp5/b0$c;->a:Lp5/b0;

    return-void
.end method


# virtual methods
.method public b(Lp5/q;)V
    .locals 2
    .param p1    # Lp5/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lp5/b0$c;->a:Lp5/b0;

    iget v1, v0, Lp5/b0;->S:I

    add-int/lit8 v1, v1, -0x1

    iput v1, v0, Lp5/b0;->S:I

    if-nez v1, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, v0, Lp5/b0;->T:Z

    invoke-virtual {v0}, Lp5/q;->y()V

    :cond_0
    invoke-virtual {p1, p0}, Lp5/q;->q0(Lp5/q$h;)Lp5/q;

    return-void
.end method

.method public c(Lp5/q;)V
    .locals 1
    .param p1    # Lp5/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object p1, p0, Lp5/b0$c;->a:Lp5/b0;

    iget-boolean v0, p1, Lp5/b0;->T:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lp5/q;->D0()V

    iget-object p1, p0, Lp5/b0$c;->a:Lp5/b0;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lp5/b0;->T:Z

    :cond_0
    return-void
.end method
