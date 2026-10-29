.class public final synthetic Li8/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Li8/v;


# direct methods
.method public synthetic constructor <init>(Li8/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li8/t;->a:Li8/v;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Li8/t;->a:Li8/v;

    invoke-static {v0}, Li8/v;->b(Li8/v;)V

    return-void
.end method
