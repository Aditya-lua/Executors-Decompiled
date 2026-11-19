.class public final Lrp/i$c;
.super Lgu/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrp/i;->f(Ljava/lang/String;Ljava/lang/Object;Leu/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lgu/f;
    c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.RealFallbackModeManager"
    f = "RealFallbackModeManager.kt"
    l = {
        0x7d,
        0x89
    }
    m = "transitionBack"
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
.field public A:I

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Object;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lrp/i;


# direct methods
.method public constructor <init>(Lrp/i;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrp/i;",
            "Leu/b<",
            "-",
            "Lrp/i$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lrp/i$c;->z:Lrp/i;

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

    iput-object p1, p0, Lrp/i$c;->y:Ljava/lang/Object;

    iget p1, p0, Lrp/i$c;->A:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lrp/i$c;->A:I

    iget-object p1, p0, Lrp/i$c;->z:Lrp/i;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Lrp/i;->f(Ljava/lang/String;Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
