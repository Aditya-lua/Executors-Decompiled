.class public Lr3/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr3/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr3/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lr3/b$a<",
        "Ly2/p;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Landroid/graphics/Rect;)V
    .locals 0

    check-cast p1, Ly2/p;

    invoke-virtual {p0, p1, p2}, Lr3/a$a;->b(Ly2/p;Landroid/graphics/Rect;)V

    return-void
.end method

.method public b(Ly2/p;Landroid/graphics/Rect;)V
    .locals 0

    invoke-virtual {p1, p2}, Ly2/p;->j(Landroid/graphics/Rect;)V

    return-void
.end method
