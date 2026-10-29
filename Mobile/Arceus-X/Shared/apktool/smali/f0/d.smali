.class public final synthetic Lf0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lf0/g;

.field public final synthetic b:Ly1/c$a;


# direct methods
.method public synthetic constructor <init>(Lf0/g;Ly1/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf0/d;->a:Lf0/g;

    iput-object p2, p0, Lf0/d;->b:Ly1/c$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lf0/d;->a:Lf0/g;

    iget-object v1, p0, Lf0/d;->b:Ly1/c$a;

    invoke-static {v0, v1}, Lf0/g;->c(Lf0/g;Ly1/c$a;)V

    return-void
.end method
