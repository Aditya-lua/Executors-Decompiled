.class public final synthetic Loj/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:Loj/i;

.field public final synthetic b:Lk2/k$f;

.field public final synthetic c:Landroid/content/Context;

.field public final synthetic d:Lpj/f;


# direct methods
.method public synthetic constructor <init>(Loj/i;Lk2/k$f;Landroid/content/Context;Lpj/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loj/d;->a:Loj/i;

    iput-object p2, p0, Loj/d;->b:Lk2/k$f;

    iput-object p3, p0, Loj/d;->c:Landroid/content/Context;

    iput-object p4, p0, Loj/d;->d:Lpj/f;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Loj/d;->a:Loj/i;

    iget-object v1, p0, Loj/d;->b:Lk2/k$f;

    iget-object v2, p0, Loj/d;->c:Landroid/content/Context;

    iget-object v3, p0, Loj/d;->d:Lpj/f;

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-static {v0, v1, v2, v3, p1}, Loj/i;->g(Loj/i;Lk2/k$f;Landroid/content/Context;Lpj/f;Landroid/graphics/Bitmap;)V

    return-void
.end method
