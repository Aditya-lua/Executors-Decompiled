.class public final synthetic Lzl/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lzl/e;


# direct methods
.method public synthetic constructor <init>(Lzl/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzl/c;->a:Lzl/e;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lzl/c;->a:Lzl/e;

    invoke-static {v0}, Lzl/e;->d(Lzl/e;)V

    return-void
.end method
