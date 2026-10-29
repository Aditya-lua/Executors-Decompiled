.class public Landroidx/camera/view/a$b;
.super Ln0/u;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/view/a;->j(Lg0/t;Ljava/util/List;)Lne/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ly1/c$a;

.field public final synthetic b:Lg0/t;

.field public final synthetic c:Landroidx/camera/view/a;


# direct methods
.method public constructor <init>(Landroidx/camera/view/a;Ly1/c$a;Lg0/t;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/view/a$b;->c:Landroidx/camera/view/a;

    iput-object p2, p0, Landroidx/camera/view/a$b;->a:Ly1/c$a;

    iput-object p3, p0, Landroidx/camera/view/a$b;->b:Lg0/t;

    invoke-direct {p0}, Ln0/u;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILn0/e0;)V
    .locals 0

    iget-object p1, p0, Landroidx/camera/view/a$b;->a:Ly1/c$a;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    iget-object p1, p0, Landroidx/camera/view/a$b;->b:Lg0/t;

    check-cast p1, Ln0/o0;

    invoke-interface {p1, p0}, Ln0/o0;->v(Ln0/u;)V

    return-void
.end method
