.class public final synthetic Lnb/kc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lnb/mc;


# direct methods
.method public synthetic constructor <init>(Lnb/mc;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnb/kc;->a:Lnb/mc;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 3

    iget-object v0, p0, Lnb/kc;->a:Lnb/mc;

    iget-object v0, v0, Lnb/mc;->b:Lnb/nc;

    iget-object v0, v0, Lnb/nc;->c:Lnb/tc;

    iget-object v1, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->b()Lnb/c7;

    move-result-object v1

    new-instance v2, Lnb/lc;

    invoke-direct {v2, v0}, Lnb/lc;-><init>(Lnb/tc;)V

    invoke-virtual {v1, v2}, Lnb/c7;->t(Ljava/lang/Runnable;)V

    return-void
.end method
