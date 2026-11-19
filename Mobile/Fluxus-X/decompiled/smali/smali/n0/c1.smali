.class public final synthetic Ln0/c1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ln0/d1;

.field public final synthetic b:Ln0/p0;


# direct methods
.method public synthetic constructor <init>(Ln0/d1;Ln0/p0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln0/c1;->a:Ln0/d1;

    iput-object p2, p0, Ln0/c1;->b:Ln0/p0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ln0/c1;->a:Ln0/d1;

    iget-object v1, p0, Ln0/c1;->b:Ln0/p0;

    invoke-static {v0, v1}, Ln0/d1;->i(Ln0/d1;Ln0/p0;)V

    return-void
.end method
