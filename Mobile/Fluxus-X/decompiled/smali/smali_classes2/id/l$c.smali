.class public final Lid/l$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lid/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:Lid/k;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final b:Landroid/graphics/Path;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final c:Landroid/graphics/RectF;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final d:Lid/l$b;

.field public final e:F


# direct methods
.method public constructor <init>(Lid/k;FLandroid/graphics/RectF;Lid/l$b;Landroid/graphics/Path;)V
    .locals 0
    .param p1    # Lid/k;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Lid/l$c;->d:Lid/l$b;

    iput-object p1, p0, Lid/l$c;->a:Lid/k;

    iput p2, p0, Lid/l$c;->e:F

    iput-object p3, p0, Lid/l$c;->c:Landroid/graphics/RectF;

    iput-object p5, p0, Lid/l$c;->b:Landroid/graphics/Path;

    return-void
.end method
