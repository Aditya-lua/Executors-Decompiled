.class public final Lnb/f6;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Z

.field public c:Z

.field public d:Z

.field public final synthetic e:Lnb/k6;


# direct methods
.method public constructor <init>(Lnb/k6;Ljava/lang/String;Z)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/f6;->e:Lnb/k6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    iput-object p2, p0, Lnb/f6;->a:Ljava/lang/String;

    iput-boolean p3, p0, Lnb/f6;->b:Z

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 3

    iget-boolean v0, p0, Lnb/f6;->c:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lnb/f6;->c:Z

    iget-object v0, p0, Lnb/f6;->e:Lnb/k6;

    iget-object v1, p0, Lnb/f6;->a:Ljava/lang/String;

    iget-boolean v2, p0, Lnb/f6;->b:Z

    invoke-virtual {v0}, Lnb/k6;->p()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lnb/f6;->d:Z

    :cond_0
    iget-boolean v0, p0, Lnb/f6;->d:Z

    return v0
.end method

.method public final b(Z)V
    .locals 2

    iget-object v0, p0, Lnb/f6;->e:Lnb/k6;

    invoke-virtual {v0}, Lnb/k6;->p()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lnb/f6;->a:Ljava/lang/String;

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    iput-boolean p1, p0, Lnb/f6;->d:Z

    return-void
.end method
