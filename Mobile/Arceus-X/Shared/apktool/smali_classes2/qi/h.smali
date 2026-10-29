.class public Lqi/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqi/h$c;,
        Lqi/h$d;
    }
.end annotation


# instance fields
.field public a:Lsi/a;

.field public b:Lqi/b;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lsi/a;

    invoke-direct {v0}, Lsi/a;-><init>()V

    iput-object v0, p0, Lqi/h;->a:Lsi/a;

    invoke-static {}, Lqi/b;->f()Lqi/b;

    move-result-object v0

    iput-object v0, p0, Lqi/h;->b:Lqi/b;

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Lqi/h$c;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, p2}, Lqi/h;->b(Landroid/content/Context;ZLqi/h$c;)V

    return-void
.end method

.method public b(Landroid/content/Context;ZLqi/h$c;)V
    .locals 3

    iget-object v0, p0, Lqi/h;->a:Lsi/a;

    iget-object v1, p0, Lqi/h;->b:Lqi/b;

    invoke-virtual {v1}, Lqi/b;->e()Ljava/util/Locale;

    move-result-object v1

    new-instance v2, Lqi/h$a;

    invoke-direct {v2, p0, p2, p1, p3}, Lqi/h$a;-><init>(Lqi/h;ZLandroid/content/Context;Lqi/h$c;)V

    invoke-virtual {v0, v1, v2}, Lsi/a;->d(Ljava/util/Locale;Lqi/g;)V

    return-void
.end method

.method public c(Landroid/content/Context;Lqi/h$d;)V
    .locals 3

    iget-object v0, p0, Lqi/h;->a:Lsi/a;

    iget-object v1, p0, Lqi/h;->b:Lqi/b;

    invoke-virtual {v1}, Lqi/b;->e()Ljava/util/Locale;

    move-result-object v1

    new-instance v2, Lqi/h$b;

    invoke-direct {v2, p0, p1, p2}, Lqi/h$b;-><init>(Lqi/h;Landroid/content/Context;Lqi/h$d;)V

    invoke-virtual {v0, v1, v2}, Lsi/a;->d(Ljava/util/Locale;Lqi/g;)V

    return-void
.end method
