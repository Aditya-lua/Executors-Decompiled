.class public final synthetic Lg/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/p;


# instance fields
.field public final synthetic a:Lg/g;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lg/b;

.field public final synthetic d:Lh/a;


# direct methods
.method public synthetic constructor <init>(Lg/g;Ljava/lang/String;Lg/b;Lh/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg/e;->a:Lg/g;

    iput-object p2, p0, Lg/e;->b:Ljava/lang/String;

    iput-object p3, p0, Lg/e;->c:Lg/b;

    iput-object p4, p0, Lg/e;->d:Lh/a;

    return-void
.end method


# virtual methods
.method public final g(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V
    .locals 6

    iget-object v0, p0, Lg/e;->a:Lg/g;

    iget-object v1, p0, Lg/e;->b:Ljava/lang/String;

    iget-object v2, p0, Lg/e;->c:Lg/b;

    iget-object v3, p0, Lg/e;->d:Lh/a;

    move-object v4, p1

    move-object v5, p2

    invoke-static/range {v0 .. v5}, Lg/g;->b(Lg/g;Ljava/lang/String;Lg/b;Lh/a;Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V

    return-void
.end method
