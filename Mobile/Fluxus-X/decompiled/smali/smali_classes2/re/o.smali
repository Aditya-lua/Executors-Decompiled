.class public final Lre/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcf/h0;

.field public final b:Lre/x;


# direct methods
.method public constructor <init>(Lre/x;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lre/o;->a:Lcf/h0;

    iput-object p1, p0, Lre/o;->b:Lre/x;

    return-void
.end method

.method public static a(Lre/x;)Lre/o;
    .locals 1

    new-instance v0, Lre/o;

    invoke-direct {v0, p0}, Lre/o;-><init>(Lre/x;)V

    return-object v0
.end method


# virtual methods
.method public b()Lcf/h0;
    .locals 4

    :try_start_0
    invoke-virtual {p0}, Lre/o;->c()Lcf/h0;

    move-result-object v0
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lye/r0;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Parsing parameters failed in getProto(). You probably want to call some Tink register function for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lre/o;->b:Lre/x;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lye/r0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public c()Lcf/h0;
    .locals 3

    iget-object v0, p0, Lre/o;->a:Lcf/h0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lre/o;->b:Lre/x;

    instance-of v1, v0, Lye/q;

    if-eqz v1, :cond_1

    check-cast v0, Lye/q;

    invoke-virtual {v0}, Lye/q;->b()Lye/m0;

    move-result-object v0

    invoke-virtual {v0}, Lye/m0;->d()Lcf/h0;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-static {}, Lye/d0;->c()Lye/d0;

    move-result-object v0

    iget-object v1, p0, Lre/o;->b:Lre/x;

    const-class v2, Lye/m0;

    invoke-virtual {v0, v1, v2}, Lye/d0;->o(Lre/x;Ljava/lang/Class;)Lye/p0;

    move-result-object v0

    check-cast v0, Lye/m0;

    invoke-virtual {v0}, Lye/m0;->d()Lcf/h0;

    move-result-object v0

    return-object v0
.end method

.method public d()Lre/x;
    .locals 1

    iget-object v0, p0, Lre/o;->b:Lre/x;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lre/o;->b()Lcf/h0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/a;->n()[B

    move-result-object v0

    invoke-static {v0}, Lre/h0;->a([B)Lre/x;

    move-result-object v0

    return-object v0
.end method
