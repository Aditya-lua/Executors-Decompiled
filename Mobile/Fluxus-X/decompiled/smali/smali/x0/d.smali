.class public final synthetic Lx0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/c$c;


# instance fields
.field public final synthetic a:Lx0/t;

.field public final synthetic b:I

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lx0/t;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx0/d;->a:Lx0/t;

    iput p2, p0, Lx0/d;->b:I

    iput p3, p0, Lx0/d;->c:I

    return-void
.end method


# virtual methods
.method public final a(Ly1/c$a;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lx0/d;->a:Lx0/t;

    iget v1, p0, Lx0/d;->b:I

    iget v2, p0, Lx0/d;->c:I

    invoke-static {v0, v1, v2, p1}, Lx0/t;->i(Lx0/t;IILy1/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
