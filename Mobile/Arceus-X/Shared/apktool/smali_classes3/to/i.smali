.class public final synthetic Lto/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lto/j;


# direct methods
.method public synthetic constructor <init>(Lto/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lto/i;->a:Lto/j;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lto/i;->a:Lto/j;

    invoke-static {v0}, Lto/j;->f(Lto/j;)V

    return-void
.end method
