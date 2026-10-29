.class public final synthetic Lg/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/p;


# instance fields
.field public final synthetic a:Lg/f;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lg/a;

.field public final synthetic d:Lh/a;


# direct methods
.method public synthetic constructor <init>(Lg/f;Ljava/lang/String;Lg/a;Lh/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg/d;->a:Lg/f;

    iput-object p2, p0, Lg/d;->b:Ljava/lang/String;

    iput-object p3, p0, Lg/d;->c:Lg/a;

    iput-object p4, p0, Lg/d;->d:Lh/a;

    return-void
.end method


# virtual methods
.method public final g(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V
    .locals 6

    iget-object v0, p0, Lg/d;->a:Lg/f;

    iget-object v1, p0, Lg/d;->b:Ljava/lang/String;

    iget-object v2, p0, Lg/d;->c:Lg/a;

    iget-object v3, p0, Lg/d;->d:Lh/a;

    move-object v4, p1

    move-object v5, p2

    invoke-static/range {v0 .. v5}, Lg/f;->b(Lg/f;Ljava/lang/String;Lg/a;Lh/a;Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V

    return-void
.end method
