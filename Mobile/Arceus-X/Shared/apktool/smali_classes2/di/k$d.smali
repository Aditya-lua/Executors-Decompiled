.class public final Ldi/k$d;
.super Lpt/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldi/k;->a(Lnt/b;)Ljava/lang/Object;
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
    c = "com.roblox.client.googleplaygames.PlayStoreRemoteAchievementRepository"
    f = "PlayStoreRemoteAchievementRepository.kt"
    l = {
        0x39
    }
    m = "listGrantedAchievements-IoAF18A"
    v = 0x1
.end annotation


# instance fields
.field public synthetic t:Ljava/lang/Object;

.field public final synthetic u:Ldi/k;

.field public v:I


# direct methods
.method public constructor <init>(Ldi/k;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldi/k;",
            "Lnt/b<",
            "-",
            "Ldi/k$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldi/k$d;->u:Ldi/k;

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

    iput-object p1, p0, Ldi/k$d;->t:Ljava/lang/Object;

    iget p1, p0, Ldi/k$d;->v:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ldi/k$d;->v:I

    iget-object p1, p0, Ldi/k$d;->u:Ldi/k;

    invoke-virtual {p1, p0}, Ldi/k;->a(Lnt/b;)Ljava/lang/Object;

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
