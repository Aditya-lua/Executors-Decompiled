.class public final Ldp/i$c;
.super Lpt/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldp/i;->f(Ljava/lang/String;Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;
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
    c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.RealFallbackModeManager"
    f = "RealFallbackModeManager.kt"
    l = {
        0x7d,
        0x89
    }
    m = "transitionBack"
.end annotation


# instance fields
.field public A:I

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Object;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ldp/i;


# direct methods
.method public constructor <init>(Ldp/i;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldp/i;",
            "Lnt/b<",
            "-",
            "Ldp/i$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldp/i$c;->z:Ldp/i;

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

    iput-object p1, p0, Ldp/i$c;->y:Ljava/lang/Object;

    iget p1, p0, Ldp/i$c;->A:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ldp/i$c;->A:I

    iget-object p1, p0, Ldp/i$c;->z:Ldp/i;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Ldp/i;->f(Ljava/lang/String;Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
