.class public final synthetic Lf1/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/c$c;


# instance fields
.field public final synthetic a:Lf1/r0;

.field public final synthetic b:Lf1/r0$j;


# direct methods
.method public synthetic constructor <init>(Lf1/r0;Lf1/r0$j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/e0;->a:Lf1/r0;

    iput-object p2, p0, Lf1/e0;->b:Lf1/r0$j;

    return-void
.end method


# virtual methods
.method public final a(Ly1/c$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lf1/e0;->a:Lf1/r0;

    iget-object v1, p0, Lf1/e0;->b:Lf1/r0$j;

    invoke-static {v0, v1, p1}, Lf1/r0;->q(Lf1/r0;Lf1/r0$j;Ly1/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
