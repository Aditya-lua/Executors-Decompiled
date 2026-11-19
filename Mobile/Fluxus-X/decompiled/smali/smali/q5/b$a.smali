.class public Lq5/b$a;
.super Landroid/graphics/drawable/Animatable2$AnimationCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq5/b;->a()Landroid/graphics/drawable/Animatable2$AnimationCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lq5/b;


# direct methods
.method public constructor <init>(Lq5/b;)V
    .locals 0

    iput-object p1, p0, Lq5/b$a;->a:Lq5/b;

    invoke-direct {p0}, Landroid/graphics/drawable/Animatable2$AnimationCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    iget-object v0, p0, Lq5/b$a;->a:Lq5/b;

    invoke-virtual {v0, p1}, Lq5/b;->b(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public onAnimationStart(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    iget-object v0, p0, Lq5/b$a;->a:Lq5/b;

    invoke-virtual {v0, p1}, Lq5/b;->c(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method
