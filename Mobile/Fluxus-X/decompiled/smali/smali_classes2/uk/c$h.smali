.class public final Luk/c$h;
.super Lgu/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Luk/c;->w(Leu/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lgu/f;
    c = "com.roblox.engine.AndroidAssetsHelper"
    f = "AndroidAssetsHelper.kt"
    l = {
        0x76
    }
    m = "updateCaCert"
    v = 0x1
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:I

.field public synthetic v:Ljava/lang/Object;

.field public final synthetic w:Luk/c;

.field public x:I


# direct methods
.method public constructor <init>(Luk/c;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Luk/c;",
            "Leu/b<",
            "-",
            "Luk/c$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Luk/c$h;->w:Luk/c;

    invoke-direct {p0, p2}, Lgu/d;-><init>(Leu/b;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iput-object p1, p0, Luk/c$h;->v:Ljava/lang/Object;

    iget p1, p0, Luk/c$h;->x:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Luk/c$h;->x:I

    iget-object p1, p0, Luk/c$h;->w:Luk/c;

    invoke-virtual {p1, p0}, Luk/c;->w(Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
