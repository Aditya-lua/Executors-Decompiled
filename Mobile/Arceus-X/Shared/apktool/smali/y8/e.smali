.class public final Ly8/e;
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
    .locals 7

    move-object v4, p4

    check-cast v4, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    new-instance v0, Ld9/h;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Ld9/h;-><init>(Landroid/content/Context;Landroid/os/Looper;Ln9/d;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;Lk9/f$a;Lk9/f$b;)V

    return-object v0
.end method
