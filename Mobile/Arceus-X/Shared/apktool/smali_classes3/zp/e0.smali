.class public final synthetic Lzp/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lzp/k0;

.field public final synthetic b:Lfn/g;


# direct methods
.method public synthetic constructor <init>(Lzp/k0;Lfn/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzp/e0;->a:Lzp/k0;

    iput-object p2, p0, Lzp/e0;->b:Lfn/g;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lzp/e0;->a:Lzp/k0;

    iget-object v1, p0, Lzp/e0;->b:Lfn/g;

    invoke-static {v0, v1}, Lzp/k0;->l(Lzp/k0;Lfn/g;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
