.class public final synthetic Lz/u5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lz/x5;

.field public final synthetic b:Ly1/c$a;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lz/x5;Ly1/c$a;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/u5;->a:Lz/x5;

    iput-object p2, p0, Lz/u5;->b:Ly1/c$a;

    iput p3, p0, Lz/u5;->c:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lz/u5;->a:Lz/x5;

    iget-object v1, p0, Lz/u5;->b:Ly1/c$a;

    iget v2, p0, Lz/u5;->c:I

    invoke-static {v0, v1, v2}, Lz/x5;->a(Lz/x5;Ly1/c$a;I)V

    return-void
.end method
