.class public final synthetic Lx0/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/c$c;


# instance fields
.field public final synthetic a:Lx0/y;

.field public final synthetic b:Lg0/l1$a;


# direct methods
.method public synthetic constructor <init>(Lx0/y;Lg0/l1$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx0/w;->a:Lx0/y;

    iput-object p2, p0, Lx0/w;->b:Lg0/l1$a;

    return-void
.end method


# virtual methods
.method public final a(Ly1/c$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lx0/w;->a:Lx0/y;

    iget-object v1, p0, Lx0/w;->b:Lg0/l1$a;

    invoke-static {v0, v1, p1}, Lx0/y;->a(Lx0/y;Lg0/l1$a;Ly1/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
