.class public final synthetic Lz/g4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lz/h4;

.field public final synthetic b:Z

.field public final synthetic c:Ly1/c$a;


# direct methods
.method public synthetic constructor <init>(Lz/h4;ZLy1/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/g4;->a:Lz/h4;

    iput-boolean p2, p0, Lz/g4;->b:Z

    iput-object p3, p0, Lz/g4;->c:Ly1/c$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lz/g4;->a:Lz/h4;

    iget-boolean v1, p0, Lz/g4;->b:Z

    iget-object v2, p0, Lz/g4;->c:Ly1/c$a;

    invoke-static {v0, v1, v2}, Lz/h4;->b(Lz/h4;ZLy1/c$a;)V

    return-void
.end method
