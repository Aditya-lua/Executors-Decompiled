.class public final synthetic Lz/f6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/c$c;


# instance fields
.field public final synthetic a:Lz/g6;

.field public final synthetic b:Lg0/z2;


# direct methods
.method public synthetic constructor <init>(Lz/g6;Lg0/z2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/f6;->a:Lz/g6;

    iput-object p2, p0, Lz/f6;->b:Lg0/z2;

    return-void
.end method


# virtual methods
.method public final a(Ly1/c$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lz/f6;->a:Lz/g6;

    iget-object v1, p0, Lz/f6;->b:Lg0/z2;

    invoke-static {v0, v1, p1}, Lz/g6;->c(Lz/g6;Lg0/z2;Ly1/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
