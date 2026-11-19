.class public final synthetic Lj8/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll8/b$a;


# instance fields
.field public final synthetic a:Lj8/r;

.field public final synthetic b:Lc8/o;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lj8/r;Lc8/o;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj8/j;->a:Lj8/r;

    iput-object p2, p0, Lj8/j;->b:Lc8/o;

    iput p3, p0, Lj8/j;->c:I

    return-void
.end method


# virtual methods
.method public final j()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lj8/j;->a:Lj8/r;

    iget-object v1, p0, Lj8/j;->b:Lc8/o;

    iget v2, p0, Lj8/j;->c:I

    invoke-static {v0, v1, v2}, Lj8/r;->f(Lj8/r;Lc8/o;I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
