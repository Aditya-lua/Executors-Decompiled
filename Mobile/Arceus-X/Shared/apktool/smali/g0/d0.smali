.class public final synthetic Lg0/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lg0/f0;

.field public final synthetic b:Ly1/c$a;


# direct methods
.method public synthetic constructor <init>(Lg0/f0;Ly1/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg0/d0;->a:Lg0/f0;

    iput-object p2, p0, Lg0/d0;->b:Ly1/c$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lg0/d0;->a:Lg0/f0;

    iget-object v1, p0, Lg0/d0;->b:Ly1/c$a;

    invoke-static {v0, v1}, Lg0/f0;->b(Lg0/f0;Ly1/c$a;)V

    return-void
.end method
