.class public Lsw/q$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmv/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsw/q;->L(Lsw/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lsw/f;

.field public final synthetic b:Lsw/q;


# direct methods
.method public constructor <init>(Lsw/q;Lsw/f;)V
    .locals 0

    iput-object p1, p0, Lsw/q$a;->b:Lsw/q;

    iput-object p2, p0, Lsw/q$a;->a:Lsw/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lsw/q$a;->a:Lsw/f;

    iget-object v1, p0, Lsw/q$a;->b:Lsw/q;

    invoke-interface {v0, v1, p1}, Lsw/f;->a(Lsw/d;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lsw/c0;->t(Ljava/lang/Throwable;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method public onFailure(Lmv/e;Ljava/io/IOException;)V
    .locals 0

    invoke-virtual {p0, p2}, Lsw/q$a;->a(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onResponse(Lmv/e;Lmv/h0;)V
    .locals 1

    :try_start_0
    iget-object p1, p0, Lsw/q$a;->b:Lsw/q;

    invoke-virtual {p1, p2}, Lsw/q;->e(Lmv/h0;)Lsw/x;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object p2, p0, Lsw/q$a;->a:Lsw/f;

    iget-object v0, p0, Lsw/q$a;->b:Lsw/q;

    invoke-interface {p2, v0, p1}, Lsw/f;->b(Lsw/d;Lsw/x;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lsw/c0;->t(Ljava/lang/Throwable;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-void

    :catchall_1
    move-exception p1

    invoke-static {p1}, Lsw/c0;->t(Ljava/lang/Throwable;)V

    invoke-virtual {p0, p1}, Lsw/q$a;->a(Ljava/lang/Throwable;)V

    return-void
.end method
