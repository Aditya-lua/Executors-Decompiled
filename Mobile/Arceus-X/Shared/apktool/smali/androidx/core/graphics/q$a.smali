.class public Landroidx/core/graphics/q$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/core/graphics/q$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/core/graphics/q;->g([Lv2/g$b;I)Lv2/g$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/core/graphics/q$b<",
        "Lv2/g$b;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Landroidx/core/graphics/q;


# direct methods
.method public constructor <init>(Landroidx/core/graphics/q;)V
    .locals 0

    iput-object p1, p0, Landroidx/core/graphics/q$a;->a:Landroidx/core/graphics/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lv2/g$b;

    invoke-virtual {p0, p1}, Landroidx/core/graphics/q$a;->d(Lv2/g$b;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lv2/g$b;

    invoke-virtual {p0, p1}, Landroidx/core/graphics/q$a;->c(Lv2/g$b;)I

    move-result p1

    return p1
.end method

.method public c(Lv2/g$b;)I
    .locals 0

    invoke-virtual {p1}, Lv2/g$b;->g()I

    move-result p1

    return p1
.end method

.method public d(Lv2/g$b;)Z
    .locals 0

    invoke-virtual {p1}, Lv2/g$b;->h()Z

    move-result p1

    return p1
.end method
