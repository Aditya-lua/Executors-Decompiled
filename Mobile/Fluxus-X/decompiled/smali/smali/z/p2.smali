.class public final synthetic Lz/p2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/c$c;


# instance fields
.field public final synthetic a:Lz/q2;


# direct methods
.method public synthetic constructor <init>(Lz/q2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/p2;->a:Lz/q2;

    return-void
.end method


# virtual methods
.method public final a(Ly1/c$a;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lz/p2;->a:Lz/q2;

    invoke-static {v0, p1}, Lz/q2;->m(Lz/q2;Ly1/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
