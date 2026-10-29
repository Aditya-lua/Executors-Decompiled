.class public final Leb/s4;
.super Lk9/a$a;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lk9/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Landroid/content/Context;Landroid/os/Looper;Ln9/d;Ljava/lang/Object;Lk9/f$a;Lk9/f$b;)Lk9/a$f;
    .locals 6

    check-cast p4, Lk9/a$d$c;

    new-instance v0, Leb/t4;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    move-object v5, p6

    invoke-direct/range {v0 .. v5}, Leb/t4;-><init>(Landroid/content/Context;Landroid/os/Looper;Ln9/d;Lk9/f$a;Lk9/f$b;)V

    return-object v0
.end method
