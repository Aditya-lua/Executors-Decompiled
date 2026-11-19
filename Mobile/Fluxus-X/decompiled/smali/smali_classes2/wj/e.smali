.class public final synthetic Lwj/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:Lwj/j;

.field public final synthetic b:Lk2/k$f;

.field public final synthetic c:Landroid/content/Context;

.field public final synthetic d:Lxj/f;


# direct methods
.method public synthetic constructor <init>(Lwj/j;Lk2/k$f;Landroid/content/Context;Lxj/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwj/e;->a:Lwj/j;

    iput-object p2, p0, Lwj/e;->b:Lk2/k$f;

    iput-object p3, p0, Lwj/e;->c:Landroid/content/Context;

    iput-object p4, p0, Lwj/e;->d:Lxj/f;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Lwj/e;->a:Lwj/j;

    iget-object v1, p0, Lwj/e;->b:Lk2/k$f;

    iget-object v2, p0, Lwj/e;->c:Landroid/content/Context;

    iget-object v3, p0, Lwj/e;->d:Lxj/f;

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-static {v0, v1, v2, v3, p1}, Lwj/j;->g(Lwj/j;Lk2/k$f;Landroid/content/Context;Lxj/f;Landroid/graphics/Bitmap;)V

    return-void
.end method
