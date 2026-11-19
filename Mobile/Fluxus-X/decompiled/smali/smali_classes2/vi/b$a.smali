.class public Lvi/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsw/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvi/b;->b(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsw/f<",
        "Lmv/i0;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lvi/b;


# direct methods
.method public constructor <init>(Lvi/b;)V
    .locals 0

    iput-object p1, p0, Lvi/b$a;->a:Lvi/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lsw/d;Ljava/lang/Throwable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsw/d<",
            "Lmv/i0;",
            ">;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    return-void
.end method

.method public b(Lsw/d;Lsw/x;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsw/d<",
            "Lmv/i0;",
            ">;",
            "Lsw/x<",
            "Lmv/i0;",
            ">;)V"
        }
    .end annotation

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "sendSessionReport() success:"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lsw/x;->g()Z

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "rbx.jni"

    invoke-static {p2, p1}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
