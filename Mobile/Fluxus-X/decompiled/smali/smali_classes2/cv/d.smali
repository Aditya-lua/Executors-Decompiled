.class public final synthetic Lcv/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpu/n;


# instance fields
.field public final synthetic a:Ljava/lang/Object;

.field public final synthetic b:Lcv/e;

.field public final synthetic c:Ljv/l;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lcv/e;Ljv/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcv/d;->a:Ljava/lang/Object;

    iput-object p2, p0, Lcv/d;->b:Lcv/e;

    iput-object p3, p0, Lcv/d;->c:Ljv/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lcv/d;->a:Ljava/lang/Object;

    iget-object v1, p0, Lcv/d;->b:Lcv/e;

    iget-object v2, p0, Lcv/d;->c:Ljv/l;

    move-object v3, p1

    check-cast v3, Ljava/lang/Throwable;

    move-object v5, p3

    check-cast v5, Lkotlin/coroutines/CoroutineContext;

    move-object v4, p2

    invoke-static/range {v0 .. v5}, Lcv/e;->b(Ljava/lang/Object;Lcv/e;Ljv/l;Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
