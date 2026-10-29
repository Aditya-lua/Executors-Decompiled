.class public final synthetic Lzp/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lzp/k0;

.field public final synthetic b:Lfn/g;


# direct methods
.method public synthetic constructor <init>(Lzp/k0;Lfn/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzp/m0;->a:Lzp/k0;

    iput-object p2, p0, Lzp/m0;->b:Lfn/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lzp/m0;->a:Lzp/k0;

    iget-object v1, p0, Lzp/m0;->b:Lfn/g;

    invoke-static {v0, v1}, Lzp/k0$c;->a(Lzp/k0;Lfn/g;)V

    return-void
.end method
