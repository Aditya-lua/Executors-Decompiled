.class public final Lfd/a;
.super Lfd/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfd/a$a;
    }
.end annotation


# instance fields
.field public final a:Landroid/graphics/Typeface;

.field public final b:Lfd/a$a;

.field public c:Z


# direct methods
.method public constructor <init>(Lfd/a$a;Landroid/graphics/Typeface;)V
    .locals 0

    invoke-direct {p0}, Lfd/f;-><init>()V

    iput-object p2, p0, Lfd/a;->a:Landroid/graphics/Typeface;

    iput-object p1, p0, Lfd/a;->b:Lfd/a$a;

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 0

    iget-object p1, p0, Lfd/a;->a:Landroid/graphics/Typeface;

    invoke-virtual {p0, p1}, Lfd/a;->d(Landroid/graphics/Typeface;)V

    return-void
.end method

.method public b(Landroid/graphics/Typeface;Z)V
    .locals 0

    invoke-virtual {p0, p1}, Lfd/a;->d(Landroid/graphics/Typeface;)V

    return-void
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lfd/a;->c:Z

    return-void
.end method

.method public final d(Landroid/graphics/Typeface;)V
    .locals 1

    iget-boolean v0, p0, Lfd/a;->c:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lfd/a;->b:Lfd/a$a;

    invoke-interface {v0, p1}, Lfd/a$a;->a(Landroid/graphics/Typeface;)V

    :cond_0
    return-void
.end method
