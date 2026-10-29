.class public final synthetic Ln0/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/c$c;


# instance fields
.field public final synthetic a:Ln0/d1;


# direct methods
.method public synthetic constructor <init>(Ln0/d1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln0/b1;->a:Ln0/d1;

    return-void
.end method


# virtual methods
.method public final a(Ly1/c$a;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ln0/b1;->a:Ln0/d1;

    invoke-static {v0, p1}, Ln0/d1;->j(Ln0/d1;Ly1/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
