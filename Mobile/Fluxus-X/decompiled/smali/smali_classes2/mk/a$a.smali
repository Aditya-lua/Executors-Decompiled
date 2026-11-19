.class public Lmk/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsw/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmk/a;->d(JLlk/a;)V
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
.field public final synthetic a:Llk/a;

.field public final synthetic b:Lmk/a;


# direct methods
.method public constructor <init>(Lmk/a;Llk/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lmk/a$a;->b:Lmk/a;

    iput-object p2, p0, Lmk/a$a;->a:Llk/a;

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

    iget-object p1, p0, Lmk/a$a;->b:Lmk/a;

    iget-object p2, p0, Lmk/a$a;->a:Llk/a;

    invoke-virtual {p1, p2}, Lmk/a;->b(Llk/a;)V

    return-void
.end method

.method public b(Lsw/d;Lsw/x;)V
    .locals 2
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

    iget-object p1, p0, Lmk/a$a;->b:Lmk/a;

    invoke-static {p2}, Lok/y;->a(Lsw/x;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lsw/x;->b()I

    move-result p2

    iget-object v1, p0, Lmk/a$a;->a:Llk/a;

    invoke-virtual {p1, v0, p2, v1}, Lmk/a;->c(Ljava/lang/String;ILlk/a;)V

    return-void
.end method
