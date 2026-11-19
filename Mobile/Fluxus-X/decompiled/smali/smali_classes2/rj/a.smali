.class public final synthetic Lrj/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:Lrj/b;

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Lrj/b;Landroid/content/Context;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrj/a;->a:Lrj/b;

    iput-object p2, p0, Lrj/a;->b:Landroid/content/Context;

    iput-boolean p3, p0, Lrj/a;->c:Z

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lrj/a;->a:Lrj/b;

    iget-object v1, p0, Lrj/a;->b:Landroid/content/Context;

    iget-boolean v2, p0, Lrj/a;->c:Z

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-static {v0, v1, v2, p1}, Lrj/b;->e(Lrj/b;Landroid/content/Context;ZLandroid/graphics/Bitmap;)V

    return-void
.end method
