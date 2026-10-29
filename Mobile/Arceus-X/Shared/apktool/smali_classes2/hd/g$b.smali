.class public Lhd/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/k$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhd/g;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:F

.field public final synthetic b:Lhd/g;


# direct methods
.method public constructor <init>(Lhd/g;F)V
    .locals 0

    iput-object p1, p0, Lhd/g$b;->b:Lhd/g;

    iput p2, p0, Lhd/g$b;->a:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lhd/c;)Lhd/c;
    .locals 2
    .param p1    # Lhd/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    instance-of v0, p1, Lhd/i;

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, Lhd/b;

    iget v1, p0, Lhd/g$b;->a:F

    invoke-direct {v0, v1, p1}, Lhd/b;-><init>(FLhd/c;)V

    return-object v0
.end method
