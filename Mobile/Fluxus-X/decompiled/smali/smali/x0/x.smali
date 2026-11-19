.class public final synthetic Lx0/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lx0/y;

.field public final synthetic b:Lg0/l1$a;

.field public final synthetic c:Ly1/c$a;


# direct methods
.method public synthetic constructor <init>(Lx0/y;Lg0/l1$a;Ly1/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx0/x;->a:Lx0/y;

    iput-object p2, p0, Lx0/x;->b:Lg0/l1$a;

    iput-object p3, p0, Lx0/x;->c:Ly1/c$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lx0/x;->a:Lx0/y;

    iget-object v1, p0, Lx0/x;->b:Lg0/l1$a;

    iget-object v2, p0, Lx0/x;->c:Ly1/c$a;

    invoke-static {v0, v1, v2}, Lx0/y;->b(Lx0/y;Lg0/l1$a;Ly1/c$a;)V

    return-void
.end method
