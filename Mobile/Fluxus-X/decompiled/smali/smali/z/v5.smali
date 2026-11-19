.class public final synthetic Lz/v5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/c$c;


# instance fields
.field public final synthetic a:Lz/x5;

.field public final synthetic b:I

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Lz/x5;IZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/v5;->a:Lz/x5;

    iput p2, p0, Lz/v5;->b:I

    iput-boolean p3, p0, Lz/v5;->c:Z

    return-void
.end method


# virtual methods
.method public final a(Ly1/c$a;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lz/v5;->a:Lz/x5;

    iget v1, p0, Lz/v5;->b:I

    iget-boolean v2, p0, Lz/v5;->c:Z

    invoke-static {v0, v1, v2, p1}, Lz/x5;->c(Lz/x5;IZLy1/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
