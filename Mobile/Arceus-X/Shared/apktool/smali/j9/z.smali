.class public final synthetic Lj9/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lj9/x;


# direct methods
.method public synthetic constructor <init>(ZLjava/lang/String;Lj9/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lj9/z;->a:Z

    iput-object p2, p0, Lj9/z;->b:Ljava/lang/String;

    iput-object p3, p0, Lj9/z;->c:Lj9/x;

    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 3

    iget-boolean v0, p0, Lj9/z;->a:Z

    iget-object v1, p0, Lj9/z;->b:Ljava/lang/String;

    iget-object v2, p0, Lj9/z;->c:Lj9/x;

    invoke-static {v0, v1, v2}, Lj9/c0;->e(ZLjava/lang/String;Lj9/x;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
