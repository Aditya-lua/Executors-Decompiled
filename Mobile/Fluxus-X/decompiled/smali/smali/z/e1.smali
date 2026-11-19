.class public final synthetic Lz/e1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/c$c;


# instance fields
.field public final synthetic a:Lz/g1$a;


# direct methods
.method public synthetic constructor <init>(Lz/g1$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/e1;->a:Lz/g1$a;

    return-void
.end method


# virtual methods
.method public final a(Ly1/c$a;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lz/e1;->a:Lz/g1$a;

    invoke-static {v0, p1}, Lz/g1$a;->e(Lz/g1$a;Ly1/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
