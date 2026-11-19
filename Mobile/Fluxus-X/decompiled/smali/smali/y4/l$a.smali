.class public final Ly4/l$a;
.super Lgu/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly4/l;->a(Ldv/i;Leu/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lgu/f;
    c = "androidx.room.ObservedTableVersions"
    f = "InvalidationTracker.kt"
    l = {
        0x27e
    }
    m = "collect"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public synthetic t:Ljava/lang/Object;

.field public final synthetic u:Ly4/l;

.field public v:I


# direct methods
.method public constructor <init>(Ly4/l;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly4/l;",
            "Leu/b<",
            "-",
            "Ly4/l$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ly4/l$a;->u:Ly4/l;

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

    iput-object p1, p0, Ly4/l$a;->t:Ljava/lang/Object;

    iget p1, p0, Ly4/l$a;->v:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ly4/l$a;->v:I

    iget-object p1, p0, Ly4/l$a;->u:Ly4/l;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Ly4/l;->a(Ldv/i;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
