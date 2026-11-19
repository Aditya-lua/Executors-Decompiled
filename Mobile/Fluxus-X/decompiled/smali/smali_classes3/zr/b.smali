.class public final synthetic Lzr/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lzr/c;

.field public final synthetic b:Lmv/f0;


# direct methods
.method public synthetic constructor <init>(Lzr/c;Lmv/f0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzr/b;->a:Lzr/c;

    iput-object p2, p0, Lzr/b;->b:Lmv/f0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lzr/b;->a:Lzr/c;

    iget-object v1, p0, Lzr/b;->b:Lmv/f0;

    invoke-static {v0, v1}, Lzr/c;->f(Lzr/c;Lmv/f0;)Lmv/h0;

    move-result-object v0

    return-object v0
.end method
