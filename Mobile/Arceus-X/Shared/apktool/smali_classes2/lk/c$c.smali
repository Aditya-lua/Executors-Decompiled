.class public final Llk/c$c;
.super Lpt/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llk/c;->d(Landroid/content/Context;Lnt/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
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

.annotation runtime Lpt/f;
    c = "com.roblox.client.widgets.RecentlyPlayedWidgetFileProvider"
    f = "RecentlyPlayedWidgetFileProvider.kt"
    l = {
        0x15
    }
    m = "readCache-gIAlu-s"
    v = 0x1
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Llk/c;

.field public w:I


# direct methods
.method public constructor <init>(Llk/c;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llk/c;",
            "Lnt/b<",
            "-",
            "Llk/c$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llk/c$c;->v:Llk/c;

    invoke-direct {p0, p2}, Lpt/d;-><init>(Lnt/b;)V

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

    iput-object p1, p0, Llk/c$c;->u:Ljava/lang/Object;

    iget p1, p0, Llk/c$c;->w:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Llk/c$c;->w:I

    iget-object p1, p0, Llk/c$c;->v:Llk/c;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Llk/c;->d(Landroid/content/Context;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    invoke-static {p1}, Ljt/n;->a(Ljava/lang/Object;)Ljt/n;

    move-result-object p1

    return-object p1
.end method
