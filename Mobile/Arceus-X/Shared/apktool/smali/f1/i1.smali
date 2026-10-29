.class public final synthetic Lf1/i1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/c$c;


# instance fields
.field public final synthetic a:Lf1/p1;

.field public final synthetic b:Ln0/o3$b;


# direct methods
.method public synthetic constructor <init>(Lf1/p1;Ln0/o3$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/i1;->a:Lf1/p1;

    iput-object p2, p0, Lf1/i1;->b:Ln0/o3$b;

    return-void
.end method


# virtual methods
.method public final a(Ly1/c$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lf1/i1;->a:Lf1/p1;

    iget-object v1, p0, Lf1/i1;->b:Ln0/o3$b;

    invoke-static {v0, v1, p1}, Lf1/p1;->m0(Lf1/p1;Ln0/o3$b;Ly1/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
