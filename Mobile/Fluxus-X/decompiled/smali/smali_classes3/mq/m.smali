.class public final synthetic Lmq/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lmq/n;


# direct methods
.method public synthetic constructor <init>(Lmq/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmq/m;->a:Lmq/n;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lmq/m;->a:Lmq/n;

    invoke-static {v0}, Lmq/n$a;->a(Lmq/n;)V

    return-void
.end method
