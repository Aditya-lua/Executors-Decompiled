.class public final Lsw/s$h;
.super Lsw/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsw/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lsw/s<",
        "Lmv/y;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/reflect/Method;

.field public final b:I


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;I)V
    .locals 0

    invoke-direct {p0}, Lsw/s;-><init>()V

    iput-object p1, p0, Lsw/s$h;->a:Ljava/lang/reflect/Method;

    iput p2, p0, Lsw/s$h;->b:I

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lsw/v;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lmv/y;

    invoke-virtual {p0, p1, p2}, Lsw/s$h;->d(Lsw/v;Lmv/y;)V

    return-void
.end method

.method public d(Lsw/v;Lmv/y;)V
    .locals 2

    if-eqz p2, :cond_0

    invoke-virtual {p1, p2}, Lsw/v;->c(Lmv/y;)V

    return-void

    :cond_0
    iget-object p1, p0, Lsw/s$h;->a:Ljava/lang/reflect/Method;

    iget p2, p0, Lsw/s$h;->b:I

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Headers parameter must not be null."

    invoke-static {p1, p2, v1, v0}, Lsw/c0;->p(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1
.end method
