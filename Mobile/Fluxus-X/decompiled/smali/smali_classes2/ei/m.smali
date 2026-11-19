.class public final synthetic Lei/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lcom/roblox/client/a;


# direct methods
.method public synthetic constructor <init>(ZLcom/roblox/client/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lei/m;->a:Z

    iput-object p2, p0, Lei/m;->b:Lcom/roblox/client/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-boolean v0, p0, Lei/m;->a:Z

    iget-object v1, p0, Lei/m;->b:Lcom/roblox/client/a;

    invoke-static {v0, v1}, Lei/n;->c(ZLcom/roblox/client/a;)V

    return-void
.end method
