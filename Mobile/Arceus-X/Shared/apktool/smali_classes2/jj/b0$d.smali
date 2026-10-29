.class public final Ljj/b0$d;
.super Lpt/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljj/b0;->d(Landroid/content/Context;JLnt/b;)Ljava/lang/Object;
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
    c = "com.roblox.client.pushnotification.ThumbnailFetcher"
    f = "ThumbnailFetcher.kt"
    l = {
        0x40,
        0x50
    }
    m = "loadUserThumbnail"
    v = 0x1
.end annotation


# instance fields
.field public A:I

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:J

.field public x:I

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljj/b0;


# direct methods
.method public constructor <init>(Ljj/b0;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljj/b0;",
            "Lnt/b<",
            "-",
            "Ljj/b0$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ljj/b0$d;->z:Ljj/b0;

    invoke-direct {p0, p2}, Lpt/d;-><init>(Lnt/b;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iput-object p1, p0, Ljj/b0$d;->y:Ljava/lang/Object;

    iget p1, p0, Ljj/b0$d;->A:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ljj/b0$d;->A:I

    iget-object p1, p0, Ljj/b0$d;->z:Ljj/b0;

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    invoke-virtual {p1, v0, v1, v2, p0}, Ljj/b0;->d(Landroid/content/Context;JLnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
