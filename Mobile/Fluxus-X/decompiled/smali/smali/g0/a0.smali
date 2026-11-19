.class public final synthetic Lg0/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/c$c;


# instance fields
.field public final synthetic a:Lg0/f0;

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lg0/f0;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg0/a0;->a:Lg0/f0;

    iput-object p2, p0, Lg0/a0;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final a(Ly1/c$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lg0/a0;->a:Lg0/f0;

    iget-object v1, p0, Lg0/a0;->b:Landroid/content/Context;

    invoke-static {v0, v1, p1}, Lg0/f0;->c(Lg0/f0;Landroid/content/Context;Ly1/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
