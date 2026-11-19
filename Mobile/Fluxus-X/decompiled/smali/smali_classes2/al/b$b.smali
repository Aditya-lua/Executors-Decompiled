.class public Lal/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lal/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lal/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:Lal/b;


# direct methods
.method public constructor <init>(Lal/b;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lal/b$b;->a:Lal/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lal/b;Lal/c;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lal/b$b;-><init>(Lal/b;)V

    return-void
.end method


# virtual methods
.method public a(Lal/a;)V
    .locals 3

    invoke-virtual {p1}, Lal/a;->f()Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "functionName"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lal/b$b;->a:Lal/b;

    invoke-virtual {v1, v0}, Lal/b;->c(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lal/a;->a(ZLorg/json/JSONObject;)V

    return-void
.end method
