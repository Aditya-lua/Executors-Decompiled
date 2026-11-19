.class public final synthetic Lz/v3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lz/h4;

.field public final synthetic b:Ly1/c$a;


# direct methods
.method public synthetic constructor <init>(Lz/h4;Ly1/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/v3;->a:Lz/h4;

    iput-object p2, p0, Lz/v3;->b:Ly1/c$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lz/v3;->a:Lz/h4;

    iget-object v1, p0, Lz/v3;->b:Ly1/c$a;

    invoke-static {v0, v1}, Lz/h4;->g(Lz/h4;Ly1/c$a;)V

    return-void
.end method
