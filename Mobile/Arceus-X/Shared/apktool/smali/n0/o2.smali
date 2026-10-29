.class public final synthetic Ln0/o2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ln0/u2;

.field public final synthetic b:Ly1/c$a;


# direct methods
.method public synthetic constructor <init>(Ln0/u2;Ly1/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln0/o2;->a:Ln0/u2;

    iput-object p2, p0, Ln0/o2;->b:Ly1/c$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ln0/o2;->a:Ln0/u2;

    iget-object v1, p0, Ln0/o2;->b:Ly1/c$a;

    invoke-static {v0, v1}, Ln0/u2;->k(Ln0/u2;Ly1/c$a;)V

    return-void
.end method
