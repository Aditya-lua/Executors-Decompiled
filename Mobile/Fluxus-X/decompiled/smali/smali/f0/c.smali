.class public final synthetic Lf0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/c$c;


# instance fields
.field public final synthetic a:Lf0/g;


# direct methods
.method public synthetic constructor <init>(Lf0/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf0/c;->a:Lf0/g;

    return-void
.end method


# virtual methods
.method public final a(Ly1/c$a;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lf0/c;->a:Lf0/g;

    invoke-static {v0, p1}, Lf0/g;->b(Lf0/g;Ly1/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
