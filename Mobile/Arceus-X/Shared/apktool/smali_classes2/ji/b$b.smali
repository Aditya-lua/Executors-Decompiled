.class public Lji/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltk/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lji/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:Lji/b;


# direct methods
.method public constructor <init>(Lji/b;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lji/b$b;->a:Lji/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lji/b;Lji/c;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lji/b$b;-><init>(Lji/b;)V

    return-void
.end method


# virtual methods
.method public a(Ltk/a;)V
    .locals 9

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Ltk/a;->f()Lorg/json/JSONObject;

    move-result-object v1

    const-wide/16 v2, -0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    const-string v5, "params"

    invoke-virtual {v1, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_1

    const-string v5, "userIds"

    invoke-virtual {v1, v5}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    move v5, v4

    :goto_0
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v6

    if-ge v5, v6, :cond_1

    invoke-virtual {v1, v5, v2, v3}, Lorg/json/JSONArray;->optLong(IJ)J

    move-result-wide v6

    cmp-long v8, v6, v2

    if-eqz v8, :cond_0

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v5, 0x0

    if-lez v1, :cond_2

    new-instance v1, Lph/f;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    invoke-direct {v1, v2, v3, v6, v7}, Lph/f;-><init>(JJ)V

    invoke-static {}, Lfv/c;->d()Lfv/c;

    move-result-object v0

    invoke-virtual {v0, v1}, Lfv/c;->j(Ljava/lang/Object;)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0, v5}, Ltk/a;->a(ZLorg/json/JSONObject;)V

    return-void

    :cond_2
    invoke-virtual {p1, v4, v5}, Ltk/a;->a(ZLorg/json/JSONObject;)V

    return-void
.end method
