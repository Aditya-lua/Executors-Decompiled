.class public final synthetic Lx0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lx0/t;

.field public final synthetic b:Lg0/k0;

.field public final synthetic c:Ljava/util/Map;

.field public final synthetic d:Ly1/c$a;


# direct methods
.method public synthetic constructor <init>(Lx0/t;Lg0/k0;Ljava/util/Map;Ly1/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx0/g;->a:Lx0/t;

    iput-object p2, p0, Lx0/g;->b:Lg0/k0;

    iput-object p3, p0, Lx0/g;->c:Ljava/util/Map;

    iput-object p4, p0, Lx0/g;->d:Ly1/c$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lx0/g;->a:Lx0/t;

    iget-object v1, p0, Lx0/g;->b:Lg0/k0;

    iget-object v2, p0, Lx0/g;->c:Ljava/util/Map;

    iget-object v3, p0, Lx0/g;->d:Ly1/c$a;

    invoke-static {v0, v1, v2, v3}, Lx0/t;->h(Lx0/t;Lg0/k0;Ljava/util/Map;Ly1/c$a;)V

    return-void
.end method
