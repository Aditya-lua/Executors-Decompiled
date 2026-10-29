.class public final synthetic Lr0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Ly1/c$a;

.field public final synthetic b:Lne/x;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Ly1/c$a;Lne/x;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr0/g;->a:Ly1/c$a;

    iput-object p2, p0, Lr0/g;->b:Lne/x;

    iput-wide p3, p0, Lr0/g;->c:J

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lr0/g;->a:Ly1/c$a;

    iget-object v1, p0, Lr0/g;->b:Lne/x;

    iget-wide v2, p0, Lr0/g;->c:J

    invoke-static {v0, v1, v2, v3}, Lr0/n;->e(Ly1/c$a;Lne/x;J)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
