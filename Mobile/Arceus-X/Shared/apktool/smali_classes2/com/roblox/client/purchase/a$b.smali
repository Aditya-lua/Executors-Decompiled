.class public Lcom/roblox/client/purchase/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvi/h$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/purchase/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/roblox/client/purchase/a$f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Z

.field public final synthetic f:Lcom/roblox/client/purchase/a$f;

.field public final synthetic g:Lcom/roblox/client/purchase/a;


# direct methods
.method public constructor <init>(Lcom/roblox/client/purchase/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/roblox/client/purchase/a$f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/client/purchase/a$b;->g:Lcom/roblox/client/purchase/a;

    iput-object p2, p0, Lcom/roblox/client/purchase/a$b;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/roblox/client/purchase/a$b;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/roblox/client/purchase/a$b;->c:Ljava/lang/String;

    iput-object p5, p0, Lcom/roblox/client/purchase/a$b;->d:Ljava/lang/String;

    iput-boolean p6, p0, Lcom/roblox/client/purchase/a$b;->e:Z

    iput-object p7, p0, Lcom/roblox/client/purchase/a$b;->f:Lcom/roblox/client/purchase/a$f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ZI)V
    .locals 7

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/roblox/client/purchase/a$b;->g:Lcom/roblox/client/purchase/a;

    iget-object v1, p0, Lcom/roblox/client/purchase/a$b;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/roblox/client/purchase/a$b;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/roblox/client/purchase/a$b;->c:Ljava/lang/String;

    iget-object v4, p0, Lcom/roblox/client/purchase/a$b;->d:Ljava/lang/String;

    iget-boolean v5, p0, Lcom/roblox/client/purchase/a$b;->e:Z

    iget-object v6, p0, Lcom/roblox/client/purchase/a$b;->f:Lcom/roblox/client/purchase/a$f;

    invoke-virtual/range {v0 .. v6}, Lcom/roblox/client/purchase/a;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/roblox/client/purchase/a$f;)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/roblox/client/purchase/a$b;->f:Lcom/roblox/client/purchase/a$f;

    if-eqz p1, :cond_1

    sget-object p2, Lcom/roblox/client/purchase/a$e;->f:Lcom/roblox/client/purchase/a$e;

    iget-object v0, p0, Lcom/roblox/client/purchase/a$b;->b:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v0, v1}, Lcom/roblox/client/purchase/a$f;->a(Lcom/roblox/client/purchase/a$e;Ljava/lang/String;Lhj/b;)V

    :cond_1
    return-void
.end method
