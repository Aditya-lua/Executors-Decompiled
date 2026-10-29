.class public final Lj9/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/Boolean;

.field public c:Ljava/lang/Boolean;


# direct methods
.method public synthetic constructor <init>([B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Lj9/g0;->a:Ljava/lang/String;

    iput-object p1, p0, Lj9/g0;->b:Ljava/lang/Boolean;

    iput-object p1, p0, Lj9/g0;->c:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lj9/g0;
    .locals 0

    iput-object p1, p0, Lj9/g0;->a:Ljava/lang/String;

    return-object p0
.end method

.method public final b(Z)Lj9/g0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lj9/g0;->b:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final c(Z)Lj9/g0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lj9/g0;->c:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final d()Lj9/h0;
    .locals 10

    iget-object v0, p0, Lj9/g0;->b:Ljava/lang/Boolean;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lj9/g0;->c:Ljava/lang/Boolean;

    if-eqz v1, :cond_0

    new-instance v2, Lj9/h0;

    iget-object v3, p0, Lj9/g0;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    iget-object v0, p0, Lj9/g0;->c:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v9}, Lj9/h0;-><init>(Ljava/lang/String;ZZZZZ[B)V

    return-object v2

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "isGoogleOrPlatformOnly must be set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "allowTestKeys must be set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
