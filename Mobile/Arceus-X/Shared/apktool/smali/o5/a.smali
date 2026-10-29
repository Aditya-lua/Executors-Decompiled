.class public Lo5/a;
.super Lo5/b0;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lo5/b0;-><init>()V

    invoke-virtual {p0}, Lo5/a;->P0()V

    return-void
.end method


# virtual methods
.method public final P0()V
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo5/b0;->M0(I)Lo5/b0;

    new-instance v1, Lo5/e;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lo5/e;-><init>(I)V

    invoke-virtual {p0, v1}, Lo5/b0;->D0(Lo5/q;)Lo5/b0;

    move-result-object v1

    new-instance v2, Lo5/b;

    invoke-direct {v2}, Lo5/b;-><init>()V

    invoke-virtual {v1, v2}, Lo5/b0;->D0(Lo5/q;)Lo5/b0;

    move-result-object v1

    new-instance v2, Lo5/e;

    invoke-direct {v2, v0}, Lo5/e;-><init>(I)V

    invoke-virtual {v1, v2}, Lo5/b0;->D0(Lo5/q;)Lo5/b0;

    return-void
.end method
