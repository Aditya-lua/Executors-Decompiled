.class public final synthetic Lak/m1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/roblox/client/startup/NativeHelper;

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(ILcom/roblox/client/startup/NativeHelper;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lak/m1;->a:I

    iput-object p2, p0, Lak/m1;->b:Lcom/roblox/client/startup/NativeHelper;

    iput p3, p0, Lak/m1;->c:I

    iput-object p4, p0, Lak/m1;->d:Ljava/lang/String;

    iput-object p5, p0, Lak/m1;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget v0, p0, Lak/m1;->a:I

    iget-object v1, p0, Lak/m1;->b:Lcom/roblox/client/startup/NativeHelper;

    iget v2, p0, Lak/m1;->c:I

    iget-object v3, p0, Lak/m1;->d:Ljava/lang/String;

    iget-object v4, p0, Lak/m1;->e:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/roblox/client/startup/NativeHelper;->b(ILcom/roblox/client/startup/NativeHelper;ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method
