.class public final synthetic Lz/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lz/u0;

.field public final synthetic b:Ly1/c$a;


# direct methods
.method public synthetic constructor <init>(Lz/u0;Ly1/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/r0;->a:Lz/u0;

    iput-object p2, p0, Lz/r0;->b:Ly1/c$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lz/r0;->a:Lz/u0;

    iget-object v1, p0, Lz/r0;->b:Ly1/c$a;

    invoke-static {v0, v1}, Lz/u0;->D(Lz/u0;Ly1/c$a;)V

    return-void
.end method
