.class public final Lob/qe;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lob/ef;


# instance fields
.field public final synthetic a:Lob/ve;


# direct methods
.method public constructor <init>(Lob/ve;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/qe;->a:Lob/ve;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lob/qe;->a:Lob/ve;

    invoke-virtual {p1}, Lob/ve;->x0()Lob/l7;

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-virtual {p1}, Lob/ve;->x0()Lob/l7;

    move-result-object p1

    invoke-virtual {p1}, Lob/l7;->a()Lob/b6;

    move-result-object p1

    invoke-virtual {p1}, Lob/b6;->o()Lob/z5;

    move-result-object p1

    const-string p3, "AppId not known when logging event"

    invoke-virtual {p1, p3, p2}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lob/qe;->a:Lob/ve;

    invoke-virtual {v0}, Lob/ve;->b()Lob/h7;

    move-result-object v0

    new-instance v1, Lob/pe;

    invoke-direct {v1, p0, p1, p2, p3}, Lob/pe;-><init>(Lob/qe;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Lob/h7;->t(Ljava/lang/Runnable;)V

    return-void
.end method
