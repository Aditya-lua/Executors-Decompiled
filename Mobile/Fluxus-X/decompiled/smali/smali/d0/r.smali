.class public final synthetic Ld0/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/c$c;


# instance fields
.field public final synthetic a:Ld0/s$a;


# direct methods
.method public synthetic constructor <init>(Ld0/s$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld0/r;->a:Ld0/s$a;

    return-void
.end method


# virtual methods
.method public final a(Ly1/c$a;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ld0/r;->a:Ld0/s$a;

    invoke-static {v0, p1}, Ld0/s$a;->a(Ld0/s$a;Ly1/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
