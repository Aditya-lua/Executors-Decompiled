.class public final Lch/f$c;
.super Lgu/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lch/f;->d(Leu/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lgu/f;
    c = "com.roblox.client.ads.GmaSdkInstaller"
    f = "GmaSdkInstaller.kt"
    l = {
        0x5b,
        0x5c
    }
    m = "awaitInstalled"
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
.field public synthetic t:Ljava/lang/Object;

.field public final synthetic u:Lch/f;

.field public v:I


# direct methods
.method public constructor <init>(Lch/f;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lch/f;",
            "Leu/b<",
            "-",
            "Lch/f$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lch/f$c;->u:Lch/f;

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

    iput-object p1, p0, Lch/f$c;->t:Ljava/lang/Object;

    iget p1, p0, Lch/f$c;->v:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lch/f$c;->v:I

    iget-object p1, p0, Lch/f$c;->u:Lch/f;

    invoke-virtual {p1, p0}, Lch/f;->d(Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
