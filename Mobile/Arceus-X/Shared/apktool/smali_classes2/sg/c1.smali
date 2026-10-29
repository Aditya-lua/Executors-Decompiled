.class public final synthetic Lsg/c1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg/a;


# instance fields
.field public final synthetic a:Lcom/roblox/client/c;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsg/c1;->a:Lcom/roblox/client/c;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lsg/c1;->a:Lcom/roblox/client/c;

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {v0, p1}, Lcom/roblox/client/c;->H2(Lcom/roblox/client/c;Ljava/lang/Boolean;)V

    return-void
.end method
