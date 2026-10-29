.class public final synthetic Lzp/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lzp/k0;

.field public final synthetic b:Lkotlin/jvm/internal/c0;


# direct methods
.method public synthetic constructor <init>(Lzp/k0;Lkotlin/jvm/internal/c0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzp/d0;->a:Lzp/k0;

    iput-object p2, p0, Lzp/d0;->b:Lkotlin/jvm/internal/c0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lzp/d0;->a:Lzp/k0;

    iget-object v1, p0, Lzp/d0;->b:Lkotlin/jvm/internal/c0;

    invoke-static {v0, v1}, Lzp/k0;->d(Lzp/k0;Lkotlin/jvm/internal/c0;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
