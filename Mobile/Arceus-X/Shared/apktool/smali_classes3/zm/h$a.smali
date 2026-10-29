.class public final synthetic Lzm/h$a;
.super Lkotlin/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzm/h;->d(Lym/q;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lzm/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/k;",
        "Lkotlin/jvm/functions/Function1<",
        "TChildOutputT;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lkotlin/jvm/internal/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/c0<",
            "Lzm/i<",
            "TChildPropsT;TChildOutputT;TPropsT;TStateT;TOutputT;>;>;"
        }
    .end annotation
.end field

.field public final synthetic b:Lzm/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lzm/h<",
            "TPropsT;TStateT;TOutputT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/c0;Lzm/h;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/c0<",
            "Lzm/i<",
            "TChildPropsT;TChildOutputT;TPropsT;TStateT;TOutputT;>;>;",
            "Lzm/h<",
            "TPropsT;TStateT;TOutputT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lzm/h$a;->a:Lkotlin/jvm/internal/c0;

    iput-object p2, p0, Lzm/h$a;->b:Lzm/h;

    const-string v4, "createChildNode$acceptChildOutput(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/squareup/workflow1/internal/SubtreeManager;Ljava/lang/Object;)Ljava/lang/Object;"

    const/4 v5, 0x0

    const/4 v1, 0x1

    const-class v2, Lkotlin/jvm/internal/Intrinsics$a;

    const-string v3, "acceptChildOutput"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/k;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TChildOutputT;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lzm/h$a;->a:Lkotlin/jvm/internal/c0;

    iget-object v1, p0, Lzm/h$a;->b:Lzm/h;

    invoke-static {v0, v1, p1}, Lzm/h;->b(Lkotlin/jvm/internal/c0;Lzm/h;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
