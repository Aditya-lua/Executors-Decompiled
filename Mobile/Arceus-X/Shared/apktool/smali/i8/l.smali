.class public final synthetic Li8/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk8/b$a;


# instance fields
.field public final synthetic a:Li8/r;

.field public final synthetic b:Lb8/o;


# direct methods
.method public synthetic constructor <init>(Li8/r;Lb8/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li8/l;->a:Li8/r;

    iput-object p2, p0, Li8/l;->b:Lb8/o;

    return-void
.end method


# virtual methods
.method public final execute()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Li8/l;->a:Li8/r;

    iget-object v1, p0, Li8/l;->b:Lb8/o;

    invoke-static {v0, v1}, Li8/r;->a(Li8/r;Lb8/o;)Ljava/lang/Iterable;

    move-result-object v0

    return-object v0
.end method
