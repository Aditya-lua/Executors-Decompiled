.class public final synthetic Lkv/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpu/n;


# instance fields
.field public final synthetic a:Lkv/j;


# direct methods
.method public synthetic constructor <init>(Lkv/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkv/i;->a:Lkv/j;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lkv/i;->a:Lkv/j;

    check-cast p1, Ljava/lang/Throwable;

    check-cast p2, Lkotlin/Unit;

    check-cast p3, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v0, p1, p2, p3}, Lkv/j;->g(Lkv/j;Ljava/lang/Throwable;Lkotlin/Unit;Lkotlin/coroutines/CoroutineContext;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
