.class public final synthetic Lj8/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll8/b$a;


# instance fields
.field public final synthetic a:Lj8/r;

.field public final synthetic b:Lc8/o;


# direct methods
.method public synthetic constructor <init>(Lj8/r;Lc8/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj8/k;->a:Lj8/r;

    iput-object p2, p0, Lj8/k;->b:Lc8/o;

    return-void
.end method


# virtual methods
.method public final j()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lj8/k;->a:Lj8/r;

    iget-object v1, p0, Lj8/k;->b:Lc8/o;

    invoke-static {v0, v1}, Lj8/r;->d(Lj8/r;Lc8/o;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
