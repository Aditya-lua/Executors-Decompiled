.class public final Lli/i$b;
.super Lgu/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lli/i;->k(Lea/g;Leu/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lgu/f;
    c = "com.roblox.client.googleplaygames.PlayGamesIntegration"
    f = "PlayGamesIntegration.kt"
    l = {
        0xe7
    }
    m = "isPgsAuthenticated-gIAlu-s"
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

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Lli/i;

.field public w:I


# direct methods
.method public constructor <init>(Lli/i;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lli/i;",
            "Leu/b<",
            "-",
            "Lli/i$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lli/i$b;->v:Lli/i;

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

    iput-object p1, p0, Lli/i$b;->u:Ljava/lang/Object;

    iget p1, p0, Lli/i$b;->w:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lli/i$b;->w:I

    iget-object p1, p0, Lli/i$b;->v:Lli/i;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lli/i;->e(Lli/i;Lea/g;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    invoke-static {p1}, Lzt/n;->a(Ljava/lang/Object;)Lzt/n;

    move-result-object p1

    return-object p1
.end method
