.class public Lri/a;
.super Lal/b;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "Analytics"

    invoke-direct {p0, v0}, Lal/b;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Lal/a;)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lal/a;->a(ZLorg/json/JSONObject;)V

    return-void
.end method
