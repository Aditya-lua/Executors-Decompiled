.class public Lr7/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr7/n0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lr7/n0<",
        "Landroid/graphics/PointF;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lr7/a0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lr7/a0;

    invoke-direct {v0}, Lr7/a0;-><init>()V

    sput-object v0, Lr7/a0;->a:Lr7/a0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ls7/c;F)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lr7/a0;->b(Ls7/c;F)Landroid/graphics/PointF;

    move-result-object p1

    return-object p1
.end method

.method public b(Ls7/c;F)Landroid/graphics/PointF;
    .locals 0

    invoke-static {p1, p2}, Lr7/s;->e(Ls7/c;F)Landroid/graphics/PointF;

    move-result-object p1

    return-object p1
.end method
