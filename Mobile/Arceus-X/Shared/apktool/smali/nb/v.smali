.class public final Lnb/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lnb/l8;

.field public final synthetic b:Lnb/w;


# direct methods
.method public constructor <init>(Lnb/w;Lnb/l8;)V
    .locals 0

    iput-object p2, p0, Lnb/v;->a:Lnb/l8;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/v;->b:Lnb/w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lnb/v;->a:Lnb/l8;

    invoke-interface {v0}, Lnb/l8;->c()Lnb/f;

    invoke-static {}, Lnb/f;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Lnb/l8;->b()Lnb/c7;

    move-result-object v0

    invoke-virtual {v0, p0}, Lnb/c7;->t(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    iget-object v0, p0, Lnb/v;->b:Lnb/w;

    invoke-virtual {v0}, Lnb/w;->c()Z

    move-result v1

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v2, v3}, Lnb/w;->e(J)V

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lnb/w;->a()V

    :cond_1
    return-void
.end method
