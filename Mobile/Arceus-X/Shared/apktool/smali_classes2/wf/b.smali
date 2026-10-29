.class public final synthetic Lwf/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lwf/f;


# direct methods
.method public synthetic constructor <init>(Lwf/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwf/b;->a:Lwf/f;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lwf/b;->a:Lwf/f;

    invoke-static {v0}, Lwf/f;->f(Lwf/f;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
