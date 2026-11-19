.class public Lad/a$b;
.super Landroid/graphics/drawable/Drawable$ConstantState;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lad/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:Lad/a;


# direct methods
.method public constructor <init>(Lad/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lad/a$b;->a:Lad/a;

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lad/a;Lad/a$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lad/a$b;-><init>(Lad/a;)V

    return-void
.end method


# virtual methods
.method public getChangingConfigurations()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lad/a$b;->a:Lad/a;

    return-object v0
.end method
