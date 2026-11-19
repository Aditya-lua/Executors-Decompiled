.class public final synthetic Ln0/w1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lpe/x;


# direct methods
.method public synthetic constructor <init>(Lpe/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln0/w1;->a:Lpe/x;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Ln0/w1;->a:Lpe/x;

    invoke-static {v0}, Ln0/x1;->b(Lpe/x;)V

    return-void
.end method
