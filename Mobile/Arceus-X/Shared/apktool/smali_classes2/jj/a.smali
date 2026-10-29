.class public final synthetic Ljj/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:Ljj/b;

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Ljj/b;Landroid/content/Context;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljj/a;->a:Ljj/b;

    iput-object p2, p0, Ljj/a;->b:Landroid/content/Context;

    iput-boolean p3, p0, Ljj/a;->c:Z

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Ljj/a;->a:Ljj/b;

    iget-object v1, p0, Ljj/a;->b:Landroid/content/Context;

    iget-boolean v2, p0, Ljj/a;->c:Z

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-static {v0, v1, v2, p1}, Ljj/b;->e(Ljj/b;Landroid/content/Context;ZLandroid/graphics/Bitmap;)V

    return-void
.end method
