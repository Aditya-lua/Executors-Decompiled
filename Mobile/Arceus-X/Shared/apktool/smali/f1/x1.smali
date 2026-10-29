.class public final synthetic Lf1/x1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/c$c;


# instance fields
.field public final synthetic a:Lf1/z1;

.field public final synthetic b:Lg0/v2;

.field public final synthetic c:Lm1/p1;


# direct methods
.method public synthetic constructor <init>(Lf1/z1;Lg0/v2;Lm1/p1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/x1;->a:Lf1/z1;

    iput-object p2, p0, Lf1/x1;->b:Lg0/v2;

    iput-object p3, p0, Lf1/x1;->c:Lm1/p1;

    return-void
.end method


# virtual methods
.method public final a(Ly1/c$a;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lf1/x1;->a:Lf1/z1;

    iget-object v1, p0, Lf1/x1;->b:Lg0/v2;

    iget-object v2, p0, Lf1/x1;->c:Lm1/p1;

    invoke-static {v0, v1, v2, p1}, Lf1/z1;->f(Lf1/z1;Lg0/v2;Lm1/p1;Ly1/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
