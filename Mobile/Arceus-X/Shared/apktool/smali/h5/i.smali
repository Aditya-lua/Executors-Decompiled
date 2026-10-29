.class public final Lh5/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg5/d$c;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lh5/i;",
        "Lg5/d$c;",
        "<init>",
        "()V",
        "Lg5/d$b;",
        "configuration",
        "Lg5/d;",
        "a",
        "(Lg5/d$b;)Lg5/d;",
        "sqlite-framework"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lg5/d$b;)Lg5/d;
    .locals 7
    .param p1    # Lg5/d$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lh5/g;

    iget-object v2, p1, Lg5/d$b;->a:Landroid/content/Context;

    iget-object v3, p1, Lg5/d$b;->b:Ljava/lang/String;

    iget-object v4, p1, Lg5/d$b;->c:Lg5/d$a;

    iget-boolean v5, p1, Lg5/d$b;->d:Z

    iget-boolean v6, p1, Lg5/d$b;->e:Z

    invoke-direct/range {v1 .. v6}, Lh5/g;-><init>(Landroid/content/Context;Ljava/lang/String;Lg5/d$a;ZZ)V

    return-object v1
.end method
