.class public final synthetic Lz/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/c$c;


# instance fields
.field public final synthetic a:Lz/y;


# direct methods
.method public synthetic constructor <init>(Lz/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/s;->a:Lz/y;

    return-void
.end method


# virtual methods
.method public final a(Ly1/c$a;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lz/s;->a:Lz/y;

    invoke-static {v0, p1}, Lz/y;->p(Lz/y;Ly1/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
