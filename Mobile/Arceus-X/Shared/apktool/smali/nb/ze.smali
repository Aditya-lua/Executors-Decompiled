.class public final synthetic Lnb/ze;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lnb/g7;


# direct methods
.method public synthetic constructor <init>(Lnb/g7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnb/ze;->a:Lnb/g7;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 3

    iget-object v0, p0, Lnb/ze;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->C()Lnb/ve;

    move-result-object v1

    invoke-virtual {v1}, Lnb/ve;->G()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->r()Lnb/u5;

    move-result-object v0

    const-string v1, "registerTrigger called but app not eligible"

    invoke-virtual {v0, v1}, Lnb/u5;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {v0}, Lnb/g7;->B()Lnb/qa;

    move-result-object v1

    invoke-virtual {v1}, Lnb/qa;->t0()V

    new-instance v1, Ljava/lang/Thread;

    invoke-virtual {v0}, Lnb/g7;->B()Lnb/qa;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lnb/af;

    invoke-direct {v2, v0}, Lnb/af;-><init>(Lnb/qa;)V

    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    return-void
.end method
