.class public final synthetic Lyf/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lyf/f;


# direct methods
.method public synthetic constructor <init>(Lyf/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyf/c;->a:Lyf/f;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lyf/c;->a:Lyf/f;

    invoke-static {v0}, Lyf/f;->c(Lyf/f;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
