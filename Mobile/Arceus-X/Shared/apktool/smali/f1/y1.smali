.class public final synthetic Lf1/y1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm1/l$c$a;


# instance fields
.field public final synthetic a:Lf1/z1;

.field public final synthetic b:Ly1/c$a;

.field public final synthetic c:Lg0/v2;


# direct methods
.method public synthetic constructor <init>(Lf1/z1;Ly1/c$a;Lg0/v2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/y1;->a:Lf1/z1;

    iput-object p2, p0, Lf1/y1;->b:Ly1/c$a;

    iput-object p3, p0, Lf1/y1;->c:Lg0/v2;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/Surface;)V
    .locals 3

    iget-object v0, p0, Lf1/y1;->a:Lf1/z1;

    iget-object v1, p0, Lf1/y1;->b:Ly1/c$a;

    iget-object v2, p0, Lf1/y1;->c:Lg0/v2;

    invoke-static {v0, v1, v2, p1}, Lf1/z1;->g(Lf1/z1;Ly1/c$a;Lg0/v2;Landroid/view/Surface;)V

    return-void
.end method
