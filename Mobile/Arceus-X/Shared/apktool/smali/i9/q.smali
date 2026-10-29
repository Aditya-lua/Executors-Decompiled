.class public final synthetic Li9/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Li9/v;


# direct methods
.method public synthetic constructor <init>(Li9/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li9/q;->a:Li9/v;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Li9/q;->a:Li9/v;

    invoke-virtual {v0}, Li9/v;->d()V

    return-void
.end method
