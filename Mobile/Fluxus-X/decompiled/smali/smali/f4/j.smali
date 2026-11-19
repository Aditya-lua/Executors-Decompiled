.class public final synthetic Lf4/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lf4/c1$d;

.field public final synthetic b:Lf4/c1$d;

.field public final synthetic c:Lf4/f$g;


# direct methods
.method public synthetic constructor <init>(Lf4/c1$d;Lf4/c1$d;Lf4/f$g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/j;->a:Lf4/c1$d;

    iput-object p2, p0, Lf4/j;->b:Lf4/c1$d;

    iput-object p3, p0, Lf4/j;->c:Lf4/f$g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lf4/j;->a:Lf4/c1$d;

    iget-object v1, p0, Lf4/j;->b:Lf4/c1$d;

    iget-object v2, p0, Lf4/j;->c:Lf4/f$g;

    invoke-static {v0, v1, v2}, Lf4/f$g;->h(Lf4/c1$d;Lf4/c1$d;Lf4/f$g;)V

    return-void
.end method
