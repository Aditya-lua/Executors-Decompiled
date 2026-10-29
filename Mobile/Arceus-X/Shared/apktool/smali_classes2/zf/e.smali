.class public final synthetic Lzf/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lzf/g;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(Lzf/g;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzf/e;->a:Lzf/g;

    iput-boolean p2, p0, Lzf/e;->b:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lzf/e;->a:Lzf/g;

    iget-boolean v1, p0, Lzf/e;->b:Z

    invoke-static {v0, v1}, Lzf/g;->c(Lzf/g;Z)V

    return-void
.end method
