.class public final synthetic Lnb/ma;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lnb/qa;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lnb/qa;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnb/ma;->a:Lnb/qa;

    iput-object p2, p0, Lnb/ma;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 3

    iget-object v0, p0, Lnb/ma;->a:Lnb/qa;

    iget-object v0, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->L()Lnb/k5;

    move-result-object v1

    iget-object v2, p0, Lnb/ma;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lnb/k5;->x(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lnb/g7;->L()Lnb/k5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/k5;->p()V

    :cond_0
    return-void
.end method
