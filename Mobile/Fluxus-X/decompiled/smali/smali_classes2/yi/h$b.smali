.class public Lyi/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyi/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyi/h;->c(Landroid/content/Context;Lyi/h$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Lyi/h$d;

.field public final synthetic c:Lyi/h;


# direct methods
.method public constructor <init>(Lyi/h;Landroid/content/Context;Lyi/h$d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lyi/h$b;->c:Lyi/h;

    iput-object p2, p0, Lyi/h$b;->a:Landroid/content/Context;

    iput-object p3, p0, Lyi/h$b;->b:Lyi/h$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lyi/f;Lyi/f;Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Ldj/h;->e()Ldj/h;

    move-result-object v0

    invoke-virtual {v0}, Ldj/h;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lyi/h$b;->c:Lyi/h;

    iget-object v0, v0, Lyi/h;->b:Lyi/b;

    invoke-virtual {v0}, Lyi/b;->g()Lyi/b$c;

    move-result-object v0

    sget-object v1, Lyi/b$c;->b:Lyi/b$c;

    if-ne v0, v1, :cond_1

    :goto_0
    move-object p1, p2

    :cond_1
    iget-object p2, p0, Lyi/h$b;->c:Lyi/h;

    iget-object p2, p2, Lyi/h;->b:Lyi/b;

    iget-object v0, p0, Lyi/h$b;->a:Landroid/content/Context;

    invoke-virtual {p2, v0, p3}, Lyi/b;->t(Landroid/content/Context;Ljava/lang/String;)V

    iget-object p2, p0, Lyi/h$b;->b:Lyi/h$d;

    iget-object p3, p0, Lyi/h$b;->c:Lyi/h;

    iget-object p3, p3, Lyi/h;->b:Lyi/b;

    iget-object v0, p0, Lyi/h$b;->a:Landroid/content/Context;

    invoke-virtual {p3, p1, v0}, Lyi/b;->n(Lyi/f;Landroid/content/Context;)Z

    move-result p1

    invoke-interface {p2, p1}, Lyi/h$d;->a(Z)V

    return-void
.end method
