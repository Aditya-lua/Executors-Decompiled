.class public Lyi/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyi/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyi/h;->b(Landroid/content/Context;ZLyi/h$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Lyi/h$c;

.field public final synthetic d:Lyi/h;


# direct methods
.method public constructor <init>(Lyi/h;ZLandroid/content/Context;Lyi/h$c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lyi/h$a;->d:Lyi/h;

    iput-boolean p2, p0, Lyi/h$a;->a:Z

    iput-object p3, p0, Lyi/h$a;->b:Landroid/content/Context;

    iput-object p4, p0, Lyi/h$a;->c:Lyi/h$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lyi/f;Lyi/f;Ljava/lang/String;)V
    .locals 2

    iget-boolean v0, p0, Lyi/h$a;->a:Z

    if-nez v0, :cond_1

    invoke-static {}, Ldj/h;->e()Ldj/h;

    move-result-object v0

    invoke-virtual {v0}, Ldj/h;->i()Z

    move-result v0

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "persisting loginSignUpLocale locale: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.locale"

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lyi/h$a;->d:Lyi/h;

    iget-object v0, v0, Lyi/h;->b:Lyi/b;

    iget-object v1, p0, Lyi/h$a;->b:Landroid/content/Context;

    invoke-virtual {v0, p1, v1}, Lyi/b;->o(Lyi/f;Landroid/content/Context;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lyi/h$a;->d:Lyi/h;

    iget-object p1, p1, Lyi/h;->b:Lyi/b;

    iget-object v0, p0, Lyi/h$a;->b:Landroid/content/Context;

    invoke-virtual {p1, v0}, Lyi/b;->d(Landroid/content/Context;)Lyi/f;

    move-result-object p1

    :goto_0
    iget-object v0, p0, Lyi/h$a;->d:Lyi/h;

    iget-object v0, v0, Lyi/h;->b:Lyi/b;

    sget-object v1, Lyi/b$c;->a:Lyi/b$c;

    invoke-virtual {v0, v1}, Lyi/b;->s(Lyi/b$c;)V

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lyi/h$a;->d:Lyi/h;

    iget-object p1, p1, Lyi/h;->b:Lyi/b;

    sget-object v0, Lyi/b$c;->b:Lyi/b$c;

    invoke-virtual {p1, v0}, Lyi/b;->s(Lyi/b$c;)V

    move-object p1, p2

    :goto_1
    iget-object v0, p0, Lyi/h$a;->d:Lyi/h;

    iget-object v0, v0, Lyi/h;->b:Lyi/b;

    iget-object v1, p0, Lyi/h$a;->b:Landroid/content/Context;

    invoke-virtual {v0, v1, p3}, Lyi/b;->t(Landroid/content/Context;Ljava/lang/String;)V

    iget-object p3, p0, Lyi/h$a;->d:Lyi/h;

    iget-object p3, p3, Lyi/h;->b:Lyi/b;

    invoke-virtual {p3, p2}, Lyi/b;->r(Lyi/f;)V

    iget-object p2, p0, Lyi/h$a;->d:Lyi/h;

    iget-object p2, p2, Lyi/h;->b:Lyi/b;

    iget-object p3, p0, Lyi/h$a;->b:Landroid/content/Context;

    invoke-virtual {p2, p1, p3}, Lyi/b;->n(Lyi/f;Landroid/content/Context;)Z

    move-result p1

    iget-object p2, p0, Lyi/h$a;->c:Lyi/h$c;

    invoke-interface {p2, p1}, Lyi/h$c;->a(Z)V

    return-void
.end method
