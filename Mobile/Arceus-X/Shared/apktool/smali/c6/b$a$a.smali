.class public final Lc6/b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb6/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc6/b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lb6/a<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00028\u00000\u0001J\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "c6/b$a$a",
        "Lb6/a;",
        "newValue",
        "",
        "a",
        "(Ljava/lang/Object;)V",
        "work-runtime_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lc6/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc6/b<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic b:Lmu/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmu/v<",
            "Lb6/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lc6/b;Lmu/v;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc6/b<",
            "TT;>;",
            "Lmu/v<",
            "-",
            "Lb6/b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lc6/b$a$a;->a:Lc6/b;

    iput-object p2, p0, Lc6/b$a$a;->b:Lmu/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lc6/b$a$a;->a:Lc6/b;

    invoke-virtual {v0, p1}, Lc6/b;->e(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lb6/b$b;

    iget-object v0, p0, Lc6/b$a$a;->a:Lc6/b;

    invoke-virtual {v0}, Lc6/b;->d()I

    move-result v0

    invoke-direct {p1, v0}, Lb6/b$b;-><init>(I)V

    goto :goto_0

    :cond_0
    sget-object p1, Lb6/b$a;->a:Lb6/b$a;

    :goto_0
    iget-object v0, p0, Lc6/b$a$a;->b:Lmu/v;

    invoke-interface {v0}, Lmu/v;->a()Lmu/y;

    move-result-object v0

    invoke-interface {v0, p1}, Lmu/y;->w(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
