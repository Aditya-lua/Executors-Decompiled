.class public Lf4/k0$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf4/d1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf4/k0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lf4/k0;


# direct methods
.method public constructor <init>(Lf4/k0;)V
    .locals 0

    iput-object p1, p0, Lf4/k0$e;->a:Lf4/k0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/ViewGroup;)Lf4/c1;
    .locals 1
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lf4/f;

    invoke-direct {v0, p1}, Lf4/f;-><init>(Landroid/view/ViewGroup;)V

    return-object v0
.end method
