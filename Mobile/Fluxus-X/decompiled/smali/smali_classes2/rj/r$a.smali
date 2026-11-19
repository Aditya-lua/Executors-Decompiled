.class public Lrj/r$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrj/r$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrj/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lrj/r;


# direct methods
.method public constructor <init>(Lrj/r;)V
    .locals 0

    iput-object p1, p0, Lrj/r$a;->a:Lrj/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Luj/k0;Landroid/content/Context;)V
    .locals 3

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Luj/k0;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lrj/r$a;->a:Lrj/r;

    invoke-static {v0, p2}, Lrj/r;->d(Lrj/r;Landroid/content/Context;)Lrj/s;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lrj/r$a;->a:Lrj/r;

    invoke-virtual {p1}, Luj/k0;->a()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lrj/x;

    invoke-direct {v1}, Lrj/x;-><init>()V

    iget-object v2, p0, Lrj/r$a;->a:Lrj/r;

    invoke-static {v2, p2}, Lrj/r;->d(Lrj/r;Landroid/content/Context;)Lrj/s;

    move-result-object v2

    invoke-interface {v2}, Lrj/s;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, p2, p1, v1, v2}, Lrj/r;->H(Landroid/content/Context;Ljava/lang/String;Lrj/x;Ljava/lang/String;)V

    invoke-static {}, Lbh/a1;->q0()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lrj/r$a;->a:Lrj/r;

    invoke-static {p1, p2}, Lrj/r;->e(Lrj/r;Landroid/content/Context;)V

    :cond_0
    return-void
.end method
