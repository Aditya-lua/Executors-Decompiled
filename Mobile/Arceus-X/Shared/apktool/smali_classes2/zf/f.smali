.class public final synthetic Lzf/f;
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

    iput-object p1, p0, Lzf/f;->a:Lzf/g;

    iput-boolean p2, p0, Lzf/f;->b:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lzf/f;->a:Lzf/g;

    iget-boolean v1, p0, Lzf/f;->b:Z

    invoke-static {v0, v1}, Lzf/g;->b(Lzf/g;Z)V

    return-void
.end method
