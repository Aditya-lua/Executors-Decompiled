.class public final synthetic Lq4/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/c$c;


# instance fields
.field public final synthetic a:Lku/w0;

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lku/w0;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq4/a;->a:Lku/w0;

    iput-object p2, p0, Lq4/a;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Ly1/c$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lq4/a;->a:Lku/w0;

    iget-object v1, p0, Lq4/a;->b:Ljava/lang/Object;

    invoke-static {v0, v1, p1}, Lq4/b;->a(Lku/w0;Ljava/lang/Object;Ly1/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
