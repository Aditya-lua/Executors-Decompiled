.class public Landroidx/camera/core/e$a;
.super Ln0/u;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroidx/camera/core/e;


# direct methods
.method public constructor <init>(Landroidx/camera/core/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/core/e$a;->a:Landroidx/camera/core/e;

    invoke-direct {p0}, Ln0/u;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILn0/e0;)V
    .locals 0

    invoke-super {p0, p1, p2}, Ln0/u;->b(ILn0/e0;)V

    iget-object p1, p0, Landroidx/camera/core/e$a;->a:Landroidx/camera/core/e;

    invoke-virtual {p1, p2}, Landroidx/camera/core/e;->q(Ln0/e0;)V

    return-void
.end method
