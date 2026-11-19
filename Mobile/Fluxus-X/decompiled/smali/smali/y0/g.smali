.class public final synthetic Ly0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/c$c;


# instance fields
.field public final synthetic a:Ly0/o;

.field public final synthetic b:Lg0/k0;

.field public final synthetic c:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Ly0/o;Lg0/k0;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly0/g;->a:Ly0/o;

    iput-object p2, p0, Ly0/g;->b:Lg0/k0;

    iput-object p3, p0, Ly0/g;->c:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final a(Ly1/c$a;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Ly0/g;->a:Ly0/o;

    iget-object v1, p0, Ly0/g;->b:Lg0/k0;

    iget-object v2, p0, Ly0/g;->c:Ljava/util/Map;

    invoke-static {v0, v1, v2, p1}, Ly0/o;->m(Ly0/o;Lg0/k0;Ljava/util/Map;Ly1/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
