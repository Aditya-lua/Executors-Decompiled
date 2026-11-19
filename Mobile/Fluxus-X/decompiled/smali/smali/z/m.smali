.class public final synthetic Lz/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lz/y;

.field public final synthetic b:Ly1/c$a;


# direct methods
.method public synthetic constructor <init>(Lz/y;Ly1/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/m;->a:Lz/y;

    iput-object p2, p0, Lz/m;->b:Ly1/c$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lz/m;->a:Lz/y;

    iget-object v1, p0, Lz/m;->b:Ly1/c$a;

    invoke-static {v0, v1}, Lz/y;->s(Lz/y;Ly1/c$a;)V

    return-void
.end method
