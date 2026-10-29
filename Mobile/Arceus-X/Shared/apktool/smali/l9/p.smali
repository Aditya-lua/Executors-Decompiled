.class public Ll9/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll9/p$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<A::",
        "Lk9/a$b;",
        "L:Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Ll9/o;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll9/o<",
            "TA;T",
            "L;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ll9/w;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final c:Ljava/lang/Runnable;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public synthetic constructor <init>(Ll9/o;Ll9/w;Ljava/lang/Runnable;Ll9/b1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll9/p;->a:Ll9/o;

    iput-object p2, p0, Ll9/p;->b:Ll9/w;

    iput-object p3, p0, Ll9/p;->c:Ljava/lang/Runnable;

    return-void
.end method

.method public static a()Ll9/p$a;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lk9/a$b;",
            "L:Ljava/lang/Object;",
            ">()",
            "Ll9/p$a<",
            "TA;T",
            "L;",
            ">;"
        }
    .end annotation

    new-instance v0, Ll9/p$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll9/p$a;-><init>(Ll9/a1;)V

    return-object v0
.end method
