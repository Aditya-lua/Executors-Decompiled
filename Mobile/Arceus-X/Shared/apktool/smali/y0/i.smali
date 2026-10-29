.class public final synthetic Ly0/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ly0/o;

.field public final synthetic b:Lg0/k0;

.field public final synthetic c:Ljava/util/Map;

.field public final synthetic d:Ly1/c$a;


# direct methods
.method public synthetic constructor <init>(Ly0/o;Lg0/k0;Ljava/util/Map;Ly1/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly0/i;->a:Ly0/o;

    iput-object p2, p0, Ly0/i;->b:Lg0/k0;

    iput-object p3, p0, Ly0/i;->c:Ljava/util/Map;

    iput-object p4, p0, Ly0/i;->d:Ly1/c$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Ly0/i;->a:Ly0/o;

    iget-object v1, p0, Ly0/i;->b:Lg0/k0;

    iget-object v2, p0, Ly0/i;->c:Ljava/util/Map;

    iget-object v3, p0, Ly0/i;->d:Ly1/c$a;

    invoke-static {v0, v1, v2, v3}, Ly0/o;->l(Ly0/o;Lg0/k0;Ljava/util/Map;Ly1/c$a;)V

    return-void
.end method
