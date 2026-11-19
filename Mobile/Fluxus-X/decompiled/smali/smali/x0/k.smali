.class public final synthetic Lx0/k;
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

    iput-object p1, p0, Lx0/k;->a:Ly1/c$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lx0/k;->a:Ly1/c$a;

    invoke-static {v0}, Lx0/t;->o(Ly1/c$a;)V

    return-void
.end method
