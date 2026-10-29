.class public Ltk/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltk/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltk/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:Ltk/b;


# direct methods
.method public constructor <init>(Ltk/b;)V
    .locals 0

    .line 2
    iput-object p1, p0, Ltk/b$b;->a:Ltk/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ltk/b;Ltk/c;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ltk/b$b;-><init>(Ltk/b;)V

    return-void
.end method


# virtual methods
.method public a(Ltk/a;)V
    .locals 3

    invoke-virtual {p1}, Ltk/a;->f()Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "functionName"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ltk/b$b;->a:Ltk/b;

    invoke-virtual {v1, v0}, Ltk/b;->c(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Ltk/a;->a(ZLorg/json/JSONObject;)V

    return-void
.end method
