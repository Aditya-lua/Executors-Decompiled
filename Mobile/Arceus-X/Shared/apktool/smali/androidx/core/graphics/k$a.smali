.class public Landroidx/core/graphics/k$a;
.super Lv2/g$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/graphics/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Ln2/h$f;


# direct methods
.method public constructor <init>(Ln2/h$f;)V
    .locals 0

    invoke-direct {p0}, Lv2/g$c;-><init>()V

    iput-object p1, p0, Landroidx/core/graphics/k$a;->a:Ln2/h$f;

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    iget-object v0, p0, Landroidx/core/graphics/k$a;->a:Ln2/h$f;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ln2/h$f;->f(I)V

    :cond_0
    return-void
.end method

.method public b(Landroid/graphics/Typeface;)V
    .locals 1

    iget-object v0, p0, Landroidx/core/graphics/k$a;->a:Ln2/h$f;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ln2/h$f;->g(Landroid/graphics/Typeface;)V

    :cond_0
    return-void
.end method
