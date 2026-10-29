.class public final synthetic Lz/e4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/c$c;


# instance fields
.field public final synthetic a:Lz/h4;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(Lz/h4;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/e4;->a:Lz/h4;

    iput-boolean p2, p0, Lz/e4;->b:Z

    return-void
.end method


# virtual methods
.method public final a(Ly1/c$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lz/e4;->a:Lz/h4;

    iget-boolean v1, p0, Lz/e4;->b:Z

    invoke-static {v0, v1, p1}, Lz/h4;->f(Lz/h4;ZLy1/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
