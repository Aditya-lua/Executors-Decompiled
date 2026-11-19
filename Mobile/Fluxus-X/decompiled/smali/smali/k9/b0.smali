.class public final synthetic Lk9/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lk9/z;


# direct methods
.method public synthetic constructor <init>(ZLjava/lang/String;Lk9/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lk9/b0;->a:Z

    iput-object p2, p0, Lk9/b0;->b:Ljava/lang/String;

    iput-object p3, p0, Lk9/b0;->c:Lk9/z;

    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 3

    iget-boolean v0, p0, Lk9/b0;->a:Z

    iget-object v1, p0, Lk9/b0;->b:Ljava/lang/String;

    iget-object v2, p0, Lk9/b0;->c:Lk9/z;

    invoke-static {v0, v1, v2}, Lk9/e0;->e(ZLjava/lang/String;Lk9/z;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
