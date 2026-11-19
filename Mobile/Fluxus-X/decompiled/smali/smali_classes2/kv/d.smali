.class public final synthetic Lkv/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpu/n;


# instance fields
.field public final synthetic a:Lkv/f;

.field public final synthetic b:Lkv/f$a;


# direct methods
.method public synthetic constructor <init>(Lkv/f;Lkv/f$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkv/d;->a:Lkv/f;

    iput-object p2, p0, Lkv/d;->b:Lkv/f$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lkv/d;->a:Lkv/f;

    iget-object v1, p0, Lkv/d;->b:Lkv/f$a;

    check-cast p1, Ljava/lang/Throwable;

    check-cast p2, Lkotlin/Unit;

    check-cast p3, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v0, v1, p1, p2, p3}, Lkv/f$a;->a(Lkv/f;Lkv/f$a;Ljava/lang/Throwable;Lkotlin/Unit;Lkotlin/coroutines/CoroutineContext;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
