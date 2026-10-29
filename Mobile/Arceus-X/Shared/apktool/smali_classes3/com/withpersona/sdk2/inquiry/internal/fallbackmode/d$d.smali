.class public final Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$d;
.super Lpt/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;->h(Ljava/lang/String;Lokhttp3/RequestBody;Ldp/h;Lnt/b;)Ljava/lang/Object;
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
    c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController"
    f = "ApiController.kt"
    l = {
        0xaf,
        0xd2
    }
    m = "transition"
.end annotation


# instance fields
.field public A:I

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Object;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$d;->z:Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;

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

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$d;->y:Ljava/lang/Object;

    iget p1, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$d;->A:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$d;->A:I

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$d;->z:Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, v0, p0}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;->e(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;Ljava/lang/String;Lokhttp3/RequestBody;Ldp/h;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
