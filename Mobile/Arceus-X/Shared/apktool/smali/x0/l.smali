.class public final synthetic Lx0/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/c$c;


# instance fields
.field public final synthetic a:Lx0/t;

.field public final synthetic b:Lg0/k0;

.field public final synthetic c:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Lx0/t;Lg0/k0;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx0/l;->a:Lx0/t;

    iput-object p2, p0, Lx0/l;->b:Lg0/k0;

    iput-object p3, p0, Lx0/l;->c:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final a(Ly1/c$a;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lx0/l;->a:Lx0/t;

    iget-object v1, p0, Lx0/l;->b:Lg0/k0;

    iget-object v2, p0, Lx0/l;->c:Ljava/util/Map;

    invoke-static {v0, v1, v2, p1}, Lx0/t;->m(Lx0/t;Lg0/k0;Ljava/util/Map;Ly1/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
