.class public final synthetic Lr0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ly1/c$a;


# direct methods
.method public synthetic constructor <init>(Ly1/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr0/e;->a:Ly1/c$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lr0/e;->a:Ly1/c$a;

    invoke-static {v0}, Lr0/n;->g(Ly1/c$a;)V

    return-void
.end method
