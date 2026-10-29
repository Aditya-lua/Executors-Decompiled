.class public final synthetic Lzp/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lzp/q;


# direct methods
.method public synthetic constructor <init>(Lzp/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzp/c;->a:Lzp/q;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lzp/c;->a:Lzp/q;

    invoke-static {v0}, Lzp/q;->D(Lzp/q;)V

    return-void
.end method
