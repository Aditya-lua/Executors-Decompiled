.class public final synthetic Lob/lf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lob/l7;


# direct methods
.method public synthetic constructor <init>(Lob/l7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lob/lf;->a:Lob/l7;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 3

    iget-object v0, p0, Lob/lf;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->C()Lob/ff;

    move-result-object v1

    invoke-virtual {v1}, Lob/ff;->G()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lob/l7;->a()Lob/b6;

    move-result-object v0

    invoke-virtual {v0}, Lob/b6;->r()Lob/z5;

    move-result-object v0

    const-string v1, "registerTrigger called but app not eligible"

    invoke-virtual {v0, v1}, Lob/z5;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {v0}, Lob/l7;->B()Lob/va;

    move-result-object v1

    invoke-virtual {v1}, Lob/va;->t0()V

    new-instance v1, Ljava/lang/Thread;

    invoke-virtual {v0}, Lob/l7;->B()Lob/va;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lob/mf;

    invoke-direct {v2, v0}, Lob/mf;-><init>(Lob/va;)V

    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    return-void
.end method
