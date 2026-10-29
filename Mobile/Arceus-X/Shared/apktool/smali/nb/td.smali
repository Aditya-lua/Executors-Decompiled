.class public Lnb/td;
.super Lnb/j8;
.source "SourceFile"

# interfaces
.implements Lnb/l8;


# instance fields
.field public final b:Lnb/me;


# direct methods
.method public constructor <init>(Lnb/me;)V
    .locals 1

    invoke-virtual {p1}, Lnb/me;->g0()Lnb/g7;

    move-result-object v0

    invoke-direct {p0, v0}, Lnb/j8;-><init>(Lnb/g7;)V

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/td;->b:Lnb/me;

    return-void
.end method
