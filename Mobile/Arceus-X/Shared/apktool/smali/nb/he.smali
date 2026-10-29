.class public final Lnb/he;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnb/ue;


# instance fields
.field public final synthetic a:Lnb/me;


# direct methods
.method public constructor <init>(Lnb/me;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/he;->a:Lnb/me;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lnb/he;->a:Lnb/me;

    invoke-virtual {p1}, Lnb/me;->x0()Lnb/g7;

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-virtual {p1}, Lnb/me;->x0()Lnb/g7;

    move-result-object p1

    invoke-virtual {p1}, Lnb/g7;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->o()Lnb/u5;

    move-result-object p1

    const-string p3, "AppId not known when logging event"

    invoke-virtual {p1, p3, p2}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lnb/he;->a:Lnb/me;

    invoke-virtual {v0}, Lnb/me;->b()Lnb/c7;

    move-result-object v0

    new-instance v1, Lnb/ge;

    invoke-direct {v1, p0, p1, p2, p3}, Lnb/ge;-><init>(Lnb/he;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Lnb/c7;->t(Ljava/lang/Runnable;)V

    return-void
.end method
