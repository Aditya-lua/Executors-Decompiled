.class public final Leh/r$f;
.super Lgu/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Leh/r;->o(Luh/a;Ljava/util/List;Leu/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lgu/f;
    c = "com.roblox.client.analytics.EventUploadWorker"
    f = "EventUploadWorker.kt"
    l = {
        0xd2,
        0xd9,
        0xe1,
        0xe6,
        0xed,
        0xf4,
        0xfb
    }
    m = "sendUploadRequest"
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
.field public A:Ljava/lang/Object;

.field public B:Ljava/lang/Object;

.field public C:Ljava/lang/Object;

.field public D:Z

.field public E:I

.field public F:I

.field public G:I

.field public synthetic H:Ljava/lang/Object;

.field public final synthetic I:Leh/r;

.field public J:I

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Leh/r;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leh/r;",
            "Leu/b<",
            "-",
            "Leh/r$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Leh/r$f;->I:Leh/r;

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

    iput-object p1, p0, Leh/r$f;->H:Ljava/lang/Object;

    iget p1, p0, Leh/r$f;->J:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Leh/r$f;->J:I

    iget-object p1, p0, Leh/r$f;->I:Leh/r;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Leh/r;->h(Leh/r;Luh/a;Ljava/util/List;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
