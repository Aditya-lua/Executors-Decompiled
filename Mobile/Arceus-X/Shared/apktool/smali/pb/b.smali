.class public final Lpb/b;
.super Lk9/a$a;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lk9/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Landroid/content/Context;Landroid/os/Looper;Ln9/d;Ljava/lang/Object;Lk9/f$a;Lk9/f$b;)Lk9/a$f;
    .locals 8

    check-cast p4, Lpb/a;

    new-instance v0, Lqb/a;

    const/4 v3, 0x1

    invoke-static {p3}, Lqb/a;->g(Ln9/d;)Landroid/os/Bundle;

    move-result-object v5

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lqb/a;-><init>(Landroid/content/Context;Landroid/os/Looper;ZLn9/d;Landroid/os/Bundle;Lk9/f$a;Lk9/f$b;)V

    return-object v0
.end method
