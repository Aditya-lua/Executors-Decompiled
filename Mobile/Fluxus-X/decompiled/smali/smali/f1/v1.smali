.class public final synthetic Lf1/v1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/c$c;


# instance fields
.field public final synthetic a:Lf1/z1;


# direct methods
.method public synthetic constructor <init>(Lf1/z1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/v1;->a:Lf1/z1;

    return-void
.end method


# virtual methods
.method public final a(Ly1/c$a;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lf1/v1;->a:Lf1/z1;

    invoke-static {v0, p1}, Lf1/z1;->c(Lf1/z1;Ly1/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
