.class public final synthetic Lm0/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/c$c;


# instance fields
.field public final synthetic a:Lm0/y0;


# direct methods
.method public synthetic constructor <init>(Lm0/y0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/x0;->a:Lm0/y0;

    return-void
.end method


# virtual methods
.method public final a(Ly1/c$a;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lm0/x0;->a:Lm0/y0;

    invoke-static {v0, p1}, Lm0/y0;->k(Lm0/y0;Ly1/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
