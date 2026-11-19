.class public final synthetic Lf1/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx2/a;


# instance fields
.field public final synthetic a:Lf1/r0;

.field public final synthetic b:Ly1/c$a;


# direct methods
.method public synthetic constructor <init>(Lf1/r0;Ly1/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/g0;->a:Lf1/r0;

    iput-object p2, p0, Lf1/g0;->b:Ly1/c$a;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lf1/g0;->a:Lf1/r0;

    iget-object v1, p0, Lf1/g0;->b:Ly1/c$a;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, v1, p1}, Lf1/r0;->j(Lf1/r0;Ly1/c$a;Ljava/lang/Throwable;)V

    return-void
.end method
