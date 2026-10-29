.class public Lqi/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqi/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqi/h;->b(Landroid/content/Context;ZLqi/h$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Lqi/h$c;

.field public final synthetic d:Lqi/h;


# direct methods
.method public constructor <init>(Lqi/h;ZLandroid/content/Context;Lqi/h$c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lqi/h$a;->d:Lqi/h;

    iput-boolean p2, p0, Lqi/h$a;->a:Z

    iput-object p3, p0, Lqi/h$a;->b:Landroid/content/Context;

    iput-object p4, p0, Lqi/h$a;->c:Lqi/h$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lqi/f;Lqi/f;Ljava/lang/String;)V
    .locals 2

    iget-boolean v0, p0, Lqi/h$a;->a:Z

    if-nez v0, :cond_1

    invoke-static {}, Lvi/h;->e()Lvi/h;

    move-result-object v0

    invoke-virtual {v0}, Lvi/h;->i()Z

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

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lqi/h$a;->d:Lqi/h;

    iget-object v0, v0, Lqi/h;->b:Lqi/b;

    iget-object v1, p0, Lqi/h$a;->b:Landroid/content/Context;

    invoke-virtual {v0, p1, v1}, Lqi/b;->o(Lqi/f;Landroid/content/Context;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lqi/h$a;->d:Lqi/h;

    iget-object p1, p1, Lqi/h;->b:Lqi/b;

    iget-object v0, p0, Lqi/h$a;->b:Landroid/content/Context;

    invoke-virtual {p1, v0}, Lqi/b;->d(Landroid/content/Context;)Lqi/f;

    move-result-object p1

    :goto_0
    iget-object v0, p0, Lqi/h$a;->d:Lqi/h;

    iget-object v0, v0, Lqi/h;->b:Lqi/b;

    sget-object v1, Lqi/b$c;->a:Lqi/b$c;

    invoke-virtual {v0, v1}, Lqi/b;->s(Lqi/b$c;)V

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lqi/h$a;->d:Lqi/h;

    iget-object p1, p1, Lqi/h;->b:Lqi/b;

    sget-object v0, Lqi/b$c;->b:Lqi/b$c;

    invoke-virtual {p1, v0}, Lqi/b;->s(Lqi/b$c;)V

    move-object p1, p2

    :goto_1
    iget-object v0, p0, Lqi/h$a;->d:Lqi/h;

    iget-object v0, v0, Lqi/h;->b:Lqi/b;

    iget-object v1, p0, Lqi/h$a;->b:Landroid/content/Context;

    invoke-virtual {v0, v1, p3}, Lqi/b;->t(Landroid/content/Context;Ljava/lang/String;)V

    iget-object p3, p0, Lqi/h$a;->d:Lqi/h;

    iget-object p3, p3, Lqi/h;->b:Lqi/b;

    invoke-virtual {p3, p2}, Lqi/b;->r(Lqi/f;)V

    iget-object p2, p0, Lqi/h$a;->d:Lqi/h;

    iget-object p2, p2, Lqi/h;->b:Lqi/b;

    iget-object p3, p0, Lqi/h$a;->b:Landroid/content/Context;

    invoke-virtual {p2, p1, p3}, Lqi/b;->n(Lqi/f;Landroid/content/Context;)Z

    move-result p1

    iget-object p2, p0, Lqi/h$a;->c:Lqi/h$c;

    invoke-interface {p2, p1}, Lqi/h$c;->a(Z)V

    return-void
.end method
