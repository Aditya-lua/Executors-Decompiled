.class public Lnb/a4;
.super Lnb/j8;
.source "SourceFile"

# interfaces
.implements Lnb/l8;


# direct methods
.method public constructor <init>(Lnb/g7;)V
    .locals 0

    invoke-direct {p0, p1}, Lnb/j8;-><init>(Lnb/g7;)V

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final h()V
    .locals 1

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->b()Lnb/c7;

    move-result-object v0

    invoke-virtual {v0}, Lnb/j8;->h()V

    return-void
.end method
