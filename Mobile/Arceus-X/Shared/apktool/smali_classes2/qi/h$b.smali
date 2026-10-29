.class public Lqi/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqi/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqi/h;->c(Landroid/content/Context;Lqi/h$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Lqi/h$d;

.field public final synthetic c:Lqi/h;


# direct methods
.method public constructor <init>(Lqi/h;Landroid/content/Context;Lqi/h$d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lqi/h$b;->c:Lqi/h;

    iput-object p2, p0, Lqi/h$b;->a:Landroid/content/Context;

    iput-object p3, p0, Lqi/h$b;->b:Lqi/h$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lqi/f;Lqi/f;Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Lvi/h;->e()Lvi/h;

    move-result-object v0

    invoke-virtual {v0}, Lvi/h;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lqi/h$b;->c:Lqi/h;

    iget-object v0, v0, Lqi/h;->b:Lqi/b;

    invoke-virtual {v0}, Lqi/b;->g()Lqi/b$c;

    move-result-object v0

    sget-object v1, Lqi/b$c;->b:Lqi/b$c;

    if-ne v0, v1, :cond_1

    :goto_0
    move-object p1, p2

    :cond_1
    iget-object p2, p0, Lqi/h$b;->c:Lqi/h;

    iget-object p2, p2, Lqi/h;->b:Lqi/b;

    iget-object v0, p0, Lqi/h$b;->a:Landroid/content/Context;

    invoke-virtual {p2, v0, p3}, Lqi/b;->t(Landroid/content/Context;Ljava/lang/String;)V

    iget-object p2, p0, Lqi/h$b;->b:Lqi/h$d;

    iget-object p3, p0, Lqi/h$b;->c:Lqi/h;

    iget-object p3, p3, Lqi/h;->b:Lqi/b;

    iget-object v0, p0, Lqi/h$b;->a:Landroid/content/Context;

    invoke-virtual {p3, p1, v0}, Lqi/b;->n(Lqi/f;Landroid/content/Context;)Z

    move-result p1

    invoke-interface {p2, p1}, Lqi/h$d;->a(Z)V

    return-void
.end method
