.class public final Lzi/a$a;
.super Lpt/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzi/a;->c(Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;Lcom/roblox/client/ossearch/c;Lku/l0;Landroid/content/Context;Lnt/b;)Ljava/lang/Object;
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
    c = "com.roblox.client.ossearch.OSSearchUtilKt"
    f = "OSSearchUtil.kt"
    l = {
        0x40,
        0x42,
        0x43
    }
    m = "getThumbnail"
    v = 0x1
.end annotation


# instance fields
.field public A:I

.field public synthetic B:Ljava/lang/Object;

.field public C:I

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "-",
            "Lzi/a$a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lpt/d;-><init>(Lnt/b;)V

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

    iput-object p1, p0, Lzi/a$a;->B:Ljava/lang/Object;

    iget p1, p0, Lzi/a$a;->C:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lzi/a$a;->C:I

    const/4 p1, 0x0

    invoke-static {p1, p1, p1, p1, p0}, Lzi/a;->c(Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;Lcom/roblox/client/ossearch/c;Lku/l0;Landroid/content/Context;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
