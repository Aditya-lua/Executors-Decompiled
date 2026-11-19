.class public Lp5/a;
.super Lp5/b0;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lp5/b0;-><init>()V

    invoke-virtual {p0}, Lp5/a;->T0()V

    return-void
.end method


# virtual methods
.method public final T0()V
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lp5/b0;->Q0(I)Lp5/b0;

    new-instance v1, Lp5/e;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lp5/e;-><init>(I)V

    invoke-virtual {p0, v1}, Lp5/b0;->H0(Lp5/q;)Lp5/b0;

    move-result-object v1

    new-instance v2, Lp5/b;

    invoke-direct {v2}, Lp5/b;-><init>()V

    invoke-virtual {v1, v2}, Lp5/b0;->H0(Lp5/q;)Lp5/b0;

    move-result-object v1

    new-instance v2, Lp5/e;

    invoke-direct {v2, v0}, Lp5/e;-><init>(I)V

    invoke-virtual {v1, v2}, Lp5/b0;->H0(Lp5/q;)Lp5/b0;

    return-void
.end method
