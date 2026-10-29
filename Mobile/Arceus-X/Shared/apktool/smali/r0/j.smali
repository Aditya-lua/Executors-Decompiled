.class public final synthetic Lr0/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ly1/c$a;

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Z

.field public final synthetic d:Lne/x;


# direct methods
.method public synthetic constructor <init>(Ly1/c$a;Ljava/lang/Object;ZLne/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr0/j;->a:Ly1/c$a;

    iput-object p2, p0, Lr0/j;->b:Ljava/lang/Object;

    iput-boolean p3, p0, Lr0/j;->c:Z

    iput-object p4, p0, Lr0/j;->d:Lne/x;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lr0/j;->a:Ly1/c$a;

    iget-object v1, p0, Lr0/j;->b:Ljava/lang/Object;

    iget-boolean v2, p0, Lr0/j;->c:Z

    iget-object v3, p0, Lr0/j;->d:Lne/x;

    invoke-static {v0, v1, v2, v3}, Lr0/n;->h(Ly1/c$a;Ljava/lang/Object;ZLne/x;)V

    return-void
.end method
