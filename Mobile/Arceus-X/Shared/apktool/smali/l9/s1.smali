.class public final Ll9/s1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:Ll9/q1;

.field public final synthetic b:Ll9/t1;


# direct methods
.method public constructor <init>(Ll9/t1;Ll9/q1;)V
    .locals 0

    iput-object p1, p0, Ll9/s1;->b:Ll9/t1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll9/s1;->a:Ll9/q1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    iget-object v0, p0, Ll9/s1;->b:Ll9/t1;

    iget-boolean v0, v0, Ll9/t1;->b:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ll9/s1;->a:Ll9/q1;

    invoke-virtual {v0}, Ll9/q1;->b()Lcom/google/android/gms/common/ConnectionResult;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/ConnectionResult;->z3()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll9/s1;->b:Ll9/t1;

    iget-object v2, v1, Ll9/i;->a:Ll9/j;

    invoke-virtual {v1}, Ll9/i;->b()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/common/ConnectionResult;->y3()Landroid/app/PendingIntent;

    move-result-object v0

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/PendingIntent;

    iget-object v3, p0, Ll9/s1;->a:Ll9/q1;

    invoke-virtual {v3}, Ll9/q1;->a()I

    move-result v3

    const/4 v4, 0x0

    invoke-static {v1, v0, v3, v4}, Lcom/google/android/gms/common/api/GoogleApiActivity;->a(Landroid/content/Context;Landroid/app/PendingIntent;IZ)Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v2, v0, v1}, Ll9/j;->startActivityForResult(Landroid/content/Intent;I)V

    return-void

    :cond_1
    iget-object v1, p0, Ll9/s1;->b:Ll9/t1;

    invoke-virtual {v1}, Ll9/i;->b()Landroid/app/Activity;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/common/ConnectionResult;->w3()I

    move-result v3

    iget-object v1, v1, Ll9/t1;->e:Lj9/c;

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v3, v4}, Lj9/c;->b(Landroid/content/Context;ILjava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll9/s1;->b:Ll9/t1;

    invoke-virtual {v1}, Ll9/i;->b()Landroid/app/Activity;

    move-result-object v3

    iget-object v4, v1, Ll9/i;->a:Ll9/j;

    invoke-virtual {v0}, Lcom/google/android/gms/common/ConnectionResult;->w3()I

    move-result v5

    iget-object v7, p0, Ll9/s1;->b:Ll9/t1;

    iget-object v2, v1, Ll9/t1;->e:Lj9/c;

    const/4 v6, 0x2

    invoke-virtual/range {v2 .. v7}, Lj9/c;->x(Landroid/app/Activity;Ll9/j;IILandroid/content/DialogInterface$OnCancelListener;)Z

    return-void

    :cond_2
    invoke-virtual {v0}, Lcom/google/android/gms/common/ConnectionResult;->w3()I

    move-result v1

    const/16 v2, 0x12

    if-ne v1, v2, :cond_3

    iget-object v0, p0, Ll9/s1;->b:Ll9/t1;

    iget-object v1, v0, Ll9/t1;->e:Lj9/c;

    invoke-virtual {v0}, Ll9/i;->b()Landroid/app/Activity;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lj9/c;->s(Landroid/app/Activity;Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/Dialog;

    move-result-object v0

    iget-object v1, p0, Ll9/s1;->b:Ll9/t1;

    invoke-virtual {v1}, Ll9/i;->b()Landroid/app/Activity;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    new-instance v3, Ll9/r1;

    invoke-direct {v3, p0, v0}, Ll9/r1;-><init>(Ll9/s1;Landroid/app/Dialog;)V

    iget-object v0, v1, Ll9/t1;->e:Lj9/c;

    invoke-virtual {v0, v2, v3}, Lj9/c;->t(Landroid/content/Context;Ll9/p0;)Ll9/q0;

    return-void

    :cond_3
    iget-object v1, p0, Ll9/s1;->b:Ll9/t1;

    iget-object v2, p0, Ll9/s1;->a:Ll9/q1;

    invoke-virtual {v2}, Ll9/q1;->a()I

    move-result v2

    invoke-static {v1, v0, v2}, Ll9/t1;->q(Ll9/t1;Lcom/google/android/gms/common/ConnectionResult;I)V

    return-void
.end method
