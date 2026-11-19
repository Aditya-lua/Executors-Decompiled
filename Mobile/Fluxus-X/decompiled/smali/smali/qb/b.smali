.class public final Lqb/b;
.super Ll9/a$a;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ll9/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Landroid/content/Context;Landroid/os/Looper;Lo9/f;Ljava/lang/Object;Ll9/h$a;Ll9/h$b;)Ll9/a$f;
    .locals 8

    check-cast p4, Lqb/a;

    new-instance v0, Lrb/a;

    const/4 v3, 0x1

    invoke-static {p3}, Lrb/a;->g(Lo9/f;)Landroid/os/Bundle;

    move-result-object v5

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lrb/a;-><init>(Landroid/content/Context;Landroid/os/Looper;ZLo9/f;Landroid/os/Bundle;Ll9/h$a;Ll9/h$b;)V

    return-object v0
.end method
