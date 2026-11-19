.class public final synthetic Lw7/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lw7/p0;


# direct methods
.method public synthetic constructor <init>(Lw7/p0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw7/n0;->a:Lw7/p0;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lw7/n0;->a:Lw7/p0;

    invoke-static {v0}, Lw7/p0;->a(Lw7/p0;)Ljava/lang/Object;

    const/4 v0, 0x0

    return-object v0
.end method
