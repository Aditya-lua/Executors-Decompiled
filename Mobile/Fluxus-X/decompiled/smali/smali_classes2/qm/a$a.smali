.class public Lqm/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqm/a;->b(Lqm/a$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lqm/a$b;

.field public final synthetic b:Lqm/a;


# direct methods
.method public constructor <init>(Lqm/a;Lqm/a$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lqm/a$a;->b:Lqm/a;

    iput-object p2, p0, Lqm/a$a;->a:Lqm/a$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run(Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Lqm/a$a;->a:Lqm/a$b;

    invoke-interface {v0, p1}, Lqm/a$b;->a(Lorg/json/JSONObject;)V

    return-void
.end method
