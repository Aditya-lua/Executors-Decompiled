.class public Lyi/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lyi/h$c;,
        Lyi/h$d;
    }
.end annotation


# instance fields
.field public a:Laj/a;

.field public b:Lyi/b;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Laj/a;

    invoke-direct {v0}, Laj/a;-><init>()V

    iput-object v0, p0, Lyi/h;->a:Laj/a;

    invoke-static {}, Lyi/b;->f()Lyi/b;

    move-result-object v0

    iput-object v0, p0, Lyi/h;->b:Lyi/b;

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Lyi/h$c;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, p2}, Lyi/h;->b(Landroid/content/Context;ZLyi/h$c;)V

    return-void
.end method

.method public b(Landroid/content/Context;ZLyi/h$c;)V
    .locals 3

    iget-object v0, p0, Lyi/h;->a:Laj/a;

    iget-object v1, p0, Lyi/h;->b:Lyi/b;

    invoke-virtual {v1}, Lyi/b;->e()Ljava/util/Locale;

    move-result-object v1

    new-instance v2, Lyi/h$a;

    invoke-direct {v2, p0, p2, p1, p3}, Lyi/h$a;-><init>(Lyi/h;ZLandroid/content/Context;Lyi/h$c;)V

    invoke-virtual {v0, v1, v2}, Laj/a;->d(Ljava/util/Locale;Lyi/g;)V

    return-void
.end method

.method public c(Landroid/content/Context;Lyi/h$d;)V
    .locals 3

    iget-object v0, p0, Lyi/h;->a:Laj/a;

    iget-object v1, p0, Lyi/h;->b:Lyi/b;

    invoke-virtual {v1}, Lyi/b;->e()Ljava/util/Locale;

    move-result-object v1

    new-instance v2, Lyi/h$b;

    invoke-direct {v2, p0, p1, p2}, Lyi/h$b;-><init>(Lyi/h;Landroid/content/Context;Lyi/h$d;)V

    invoke-virtual {v0, v1, v2}, Laj/a;->d(Ljava/util/Locale;Lyi/g;)V

    return-void
.end method
