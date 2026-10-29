.class public final Lwa/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lwa/l;


# direct methods
.method public synthetic constructor <init>(Lwa/l;Lwa/i;)V
    .locals 0

    iput-object p1, p0, Lwa/j;->a:Lwa/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lwa/j;->a:Lwa/l;

    invoke-virtual {v0}, Lwa/l;->a()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    invoke-static {}, Lu9/h;->c()Lu9/e;

    move-result-object v2

    invoke-interface {v2}, Lu9/e;->a()J

    move-result-wide v2

    cmp-long v0, v2, v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lwa/j;->a:Lwa/l;

    invoke-static {v0}, Lwa/l;->b(Lwa/l;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lwa/l;->e(Landroid/content/Context;)V

    :cond_0
    return-void
.end method
