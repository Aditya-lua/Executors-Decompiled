.class public Lri/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lal/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lri/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:Lri/h;


# direct methods
.method public constructor <init>(Lri/h;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lri/h$b;->a:Lri/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lri/h;Lri/i;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lri/h$b;-><init>(Lri/h;)V

    return-void
.end method


# virtual methods
.method public a(Lal/a;)V
    .locals 4

    invoke-virtual {p1}, Lal/a;->f()Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "userId"

    const-wide/16 v2, -0x1

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v0

    new-instance v2, Lyh/g;

    const-string v3, "PROFILE_TAG"

    invoke-direct {v2, v3}, Lyh/g;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lyh/g;->c(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lyh/g;->i(Ljava/lang/String;)V

    invoke-static {}, Lmw/c;->d()Lmw/c;

    move-result-object v0

    invoke-virtual {v0, v2}, Lmw/c;->j(Ljava/lang/Object;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lal/a;->a(ZLorg/json/JSONObject;)V

    :cond_0
    return-void
.end method
