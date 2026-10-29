.class public final synthetic Lz/c6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lz/g6;

.field public final synthetic b:Ly1/c$a;

.field public final synthetic c:Lg0/z2;


# direct methods
.method public synthetic constructor <init>(Lz/g6;Ly1/c$a;Lg0/z2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/c6;->a:Lz/g6;

    iput-object p2, p0, Lz/c6;->b:Ly1/c$a;

    iput-object p3, p0, Lz/c6;->c:Lg0/z2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lz/c6;->a:Lz/g6;

    iget-object v1, p0, Lz/c6;->b:Ly1/c$a;

    iget-object v2, p0, Lz/c6;->c:Lg0/z2;

    invoke-static {v0, v1, v2}, Lz/g6;->a(Lz/g6;Ly1/c$a;Lg0/z2;)V

    return-void
.end method
