.class public Lm9/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm9/p$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<A::",
        "Ll9/a$b;",
        "L:Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Lm9/o;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm9/o<",
            "TA;T",
            "L;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lm9/w;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final c:Ljava/lang/Runnable;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public synthetic constructor <init>(Lm9/o;Lm9/w;Ljava/lang/Runnable;Lm9/b1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm9/p;->a:Lm9/o;

    iput-object p2, p0, Lm9/p;->b:Lm9/w;

    iput-object p3, p0, Lm9/p;->c:Ljava/lang/Runnable;

    return-void
.end method

.method public static a()Lm9/p$a;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Ll9/a$b;",
            "L:Ljava/lang/Object;",
            ">()",
            "Lm9/p$a<",
            "TA;T",
            "L;",
            ">;"
        }
    .end annotation

    new-instance v0, Lm9/p$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lm9/p$a;-><init>(Lm9/a1;)V

    return-object v0
.end method
