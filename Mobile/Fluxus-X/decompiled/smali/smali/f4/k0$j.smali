.class public Lf4/k0$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf4/k0;->p(Lf4/a0;Lf4/x;Lf4/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lg/b<",
        "Lg/a;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lf4/k0;


# direct methods
.method public constructor <init>(Lf4/k0;)V
    .locals 0

    iput-object p1, p0, Lf4/k0$j;->a:Lf4/k0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lg/a;

    invoke-virtual {p0, p1}, Lf4/k0$j;->b(Lg/a;)V

    return-void
.end method

.method public b(Lg/a;)V
    .locals 4

    iget-object v0, p0, Lf4/k0$j;->a:Lf4/k0;

    iget-object v0, v0, Lf4/k0;->I:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf4/k0$m;

    const-string v1, "FragmentManager"

    if-nez v0, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "No IntentSenders were started for "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-object v2, v0, Lf4/k0$m;->a:Ljava/lang/String;

    iget v0, v0, Lf4/k0$m;->b:I

    iget-object v3, p0, Lf4/k0$j;->a:Lf4/k0;

    invoke-static {v3}, Lf4/k0;->j(Lf4/k0;)Lf4/s0;

    move-result-object v3

    invoke-virtual {v3, v2}, Lf4/s0;->i(Ljava/lang/String;)Lf4/q;

    move-result-object v3

    if-nez v3, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Intent Sender result delivered for unknown Fragment "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    invoke-virtual {p1}, Lg/a;->f()I

    move-result v1

    invoke-virtual {p1}, Lg/a;->a()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {v3, v0, v1, p1}, Lf4/q;->A0(IILandroid/content/Intent;)V

    return-void
.end method
