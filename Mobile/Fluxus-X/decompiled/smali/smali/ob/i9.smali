.class public final Lob/i9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lob/va;


# direct methods
.method public constructor <init>(Lob/va;Z)V
    .locals 0

    iput-boolean p2, p0, Lob/i9;->a:Z

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/i9;->b:Lob/va;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Lob/i9;->b:Lob/va;

    iget-object v1, v0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v1}, Lob/l7;->g()Z

    move-result v2

    invoke-virtual {v1}, Lob/l7;->f()Z

    move-result v3

    iget-boolean v4, p0, Lob/i9;->a:Z

    invoke-virtual {v1, v4}, Lob/l7;->P(Z)V

    if-ne v3, v4, :cond_0

    invoke-virtual {v1}, Lob/l7;->a()Lob/b6;

    move-result-object v3

    invoke-virtual {v3}, Lob/b6;->w()Lob/z5;

    move-result-object v3

    const-string v5, "Default data collection state already set to"

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-virtual {v3, v5, v6}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    invoke-virtual {v1}, Lob/l7;->g()Z

    move-result v3

    if-eq v3, v2, :cond_1

    invoke-virtual {v1}, Lob/l7;->g()Z

    move-result v3

    invoke-virtual {v1}, Lob/l7;->f()Z

    move-result v5

    if-eq v3, v5, :cond_2

    :cond_1
    invoke-virtual {v1}, Lob/l7;->a()Lob/b6;

    move-result-object v1

    invoke-virtual {v1}, Lob/b6;->t()Lob/z5;

    move-result-object v1

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const-string v4, "Default data collection is different than actual status"

    invoke-virtual {v1, v4, v3, v2}, Lob/z5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    invoke-virtual {v0}, Lob/va;->Y()V

    return-void
.end method
