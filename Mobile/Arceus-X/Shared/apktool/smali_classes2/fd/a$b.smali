.class public final Lfd/a$b;
.super Landroid/graphics/drawable/Drawable$ConstantState;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfd/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Lhd/g;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public b:Z


# direct methods
.method public constructor <init>(Lfd/a$b;)V
    .locals 1
    .param p1    # Lfd/a$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 4
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    .line 5
    iget-object v0, p1, Lfd/a$b;->a:Lhd/g;

    invoke-virtual {v0}, Lhd/g;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Lhd/g;

    iput-object v0, p0, Lfd/a$b;->a:Lhd/g;

    .line 6
    iget-boolean p1, p1, Lfd/a$b;->b:Z

    iput-boolean p1, p0, Lfd/a$b;->b:Z

    return-void
.end method

.method public constructor <init>(Lhd/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    .line 2
    iput-object p1, p0, Lfd/a$b;->a:Lhd/g;

    const/4 p1, 0x0

    .line 3
    iput-boolean p1, p0, Lfd/a$b;->b:Z

    return-void
.end method


# virtual methods
.method public a()Lfd/a;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lfd/a;

    new-instance v1, Lfd/a$b;

    invoke-direct {v1, p0}, Lfd/a$b;-><init>(Lfd/a$b;)V

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lfd/a;-><init>(Lfd/a$b;Lfd/a$a;)V

    return-object v0
.end method

.method public getChangingConfigurations()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0}, Lfd/a$b;->a()Lfd/a;

    move-result-object v0

    return-object v0
.end method
