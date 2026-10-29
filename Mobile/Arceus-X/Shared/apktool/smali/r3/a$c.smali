.class public Lr3/a$c;
.super Ly2/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr3/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public final synthetic b:Lr3/a;


# direct methods
.method public constructor <init>(Lr3/a;)V
    .locals 0

    iput-object p1, p0, Lr3/a$c;->b:Lr3/a;

    invoke-direct {p0}, Ly2/q;-><init>()V

    return-void
.end method


# virtual methods
.method public b(I)Ly2/p;
    .locals 1

    iget-object v0, p0, Lr3/a$c;->b:Lr3/a;

    invoke-virtual {v0, p1}, Lr3/a;->H(I)Ly2/p;

    move-result-object p1

    invoke-static {p1}, Ly2/p;->a0(Ly2/p;)Ly2/p;

    move-result-object p1

    return-object p1
.end method

.method public d(I)Ly2/p;
    .locals 1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lr3/a$c;->b:Lr3/a;

    iget p1, p1, Lr3/a;->k:I

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lr3/a$c;->b:Lr3/a;

    iget p1, p1, Lr3/a;->l:I

    :goto_0
    const/high16 v0, -0x80000000

    if-ne p1, v0, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    invoke-virtual {p0, p1}, Lr3/a$c;->b(I)Ly2/p;

    move-result-object p1

    return-object p1
.end method

.method public f(IILandroid/os/Bundle;)Z
    .locals 1

    iget-object v0, p0, Lr3/a$c;->b:Lr3/a;

    invoke-virtual {v0, p1, p2, p3}, Lr3/a;->P(IILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method
