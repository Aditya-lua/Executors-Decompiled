.class public final Lzr/c$f;
.super Lgu/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzr/c;->k(Ljava/lang/String;Ljava/io/File;Leu/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lgu/f;
    c = "com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader"
    f = "RealFontDownloader.kt"
    l = {
        0x8a
    }
    m = "downloadFontFile"
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

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Lzr/c;

.field public y:I


# direct methods
.method public constructor <init>(Lzr/c;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzr/c;",
            "Leu/b<",
            "-",
            "Lzr/c$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lzr/c$f;->x:Lzr/c;

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

    iput-object p1, p0, Lzr/c$f;->w:Ljava/lang/Object;

    iget p1, p0, Lzr/c$f;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lzr/c$f;->y:I

    iget-object p1, p0, Lzr/c$f;->x:Lzr/c;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lzr/c;->g(Lzr/c;Ljava/lang/String;Ljava/io/File;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
