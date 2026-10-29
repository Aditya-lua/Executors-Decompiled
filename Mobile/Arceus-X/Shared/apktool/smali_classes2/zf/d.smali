.class public final synthetic Lzf/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lzf/g;


# direct methods
.method public synthetic constructor <init>(Lzf/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzf/d;->a:Lzf/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lzf/d;->a:Lzf/g;

    invoke-static {v0}, Lzf/g;->d(Lzf/g;)V

    return-void
.end method
