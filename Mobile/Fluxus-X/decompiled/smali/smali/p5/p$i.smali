.class public abstract Lp5/p$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp5/p$g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp5/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "i"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lp5/p$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lp5/p$i;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/view/ViewGroup;Landroid/view/View;)F
    .locals 0

    invoke-virtual {p2}, Landroid/view/View;->getTranslationX()F

    move-result p1

    return p1
.end method
