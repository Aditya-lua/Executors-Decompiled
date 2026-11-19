.class public final synthetic Les/d4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/core/widget/NestedScrollView$e;


# instance fields
.field public final synthetic a:Les/h4;

.field public final synthetic b:Les/s6$d$a;


# direct methods
.method public synthetic constructor <init>(Les/h4;Les/s6$d$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/d4;->a:Les/h4;

    iput-object p2, p0, Les/d4;->b:Les/s6$d$a;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/core/widget/NestedScrollView;IIII)V
    .locals 7

    iget-object v0, p0, Les/d4;->a:Les/h4;

    iget-object v1, p0, Les/d4;->b:Les/s6$d$a;

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    invoke-static/range {v0 .. v6}, Les/h4;->H(Les/h4;Les/s6$d$a;Landroidx/core/widget/NestedScrollView;IIII)V

    return-void
.end method
