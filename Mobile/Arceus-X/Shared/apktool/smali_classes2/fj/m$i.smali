.class public Lfj/m$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/m$r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfj/m;->V1(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;JLej/j;Z)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lfj/m;


# direct methods
.method public constructor <init>(Lfj/m;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lfj/m$i;->b:Lfj/m;

    iput-object p2, p0, Lfj/m$i;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    iget-object v0, p0, Lfj/m$i;->b:Lfj/m;

    iget-object v1, p0, Lfj/m$i;->a:Ljava/lang/String;

    invoke-static {v0}, Lfj/m;->y(Lfj/m;)Z

    move-result v2

    invoke-static {v0, v1, v2}, Lfj/m;->Q(Lfj/m;Ljava/lang/String;Z)Lcom/android/billingclient/api/e;

    move-result-object v0

    iget-object v1, p0, Lfj/m$i;->b:Lfj/m;

    iget-object v2, p0, Lfj/m$i;->a:Ljava/lang/String;

    invoke-static {v1}, Lfj/m;->y(Lfj/m;)Z

    move-result v3

    invoke-static {v1, v2, v0, v3}, Lfj/m;->Z(Lfj/m;Ljava/lang/String;Lcom/android/billingclient/api/e;Z)Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lfj/m$i;->b:Lfj/m;

    invoke-static {v1}, Lfj/m;->y(Lfj/m;)Z

    move-result v2

    invoke-static {v1, v0, v2}, Lfj/m;->R(Lfj/m;Lcom/android/billingclient/api/e;Z)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lfj/m;->I(Lfj/m;Ljava/lang/String;)V

    iget-object v0, p0, Lfj/m$i;->b:Lfj/m;

    invoke-static {v0}, Lfj/m;->B(Lfj/m;)Lvi/g;

    move-result-object v0

    new-instance v1, Lej/h;

    iget-object v2, p0, Lfj/m$i;->b:Lfj/m;

    invoke-static {v2}, Lfj/m;->E(Lfj/m;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lfj/m$i;->a:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v4}, Lej/h;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v0, v1}, Lvi/g;->h0(Lej/h;)V

    iget-object v0, p0, Lfj/m$i;->b:Lfj/m;

    invoke-static {v0}, Lfj/m;->M(Lfj/m;)V

    return-void
.end method
