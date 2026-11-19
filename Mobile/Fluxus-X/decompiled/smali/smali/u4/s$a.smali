.class public final Lu4/s$a;
.super Lgu/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu4/s;->e(Lu4/s;Lu4/b;Leu/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lgu/f;
    c = "androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon"
    f = "TopicsManagerImplCommon.kt"
    l = {
        0x28
    }
    m = "getTopics$suspendImpl"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Lu4/s;

.field public w:I


# direct methods
.method public constructor <init>(Lu4/s;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu4/s;",
            "Leu/b<",
            "-",
            "Lu4/s$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lu4/s$a;->v:Lu4/s;

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

    iput-object p1, p0, Lu4/s$a;->u:Ljava/lang/Object;

    iget p1, p0, Lu4/s$a;->w:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lu4/s$a;->w:I

    iget-object p1, p0, Lu4/s$a;->v:Lu4/s;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lu4/s;->e(Lu4/s;Lu4/b;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
