.class public final Lcom/roblox/engine/jni/model/a$a;
.super Lcom/roblox/engine/jni/model/NativeInitCrashpadParams$Builder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/engine/jni/model/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public h:Z

.field public i:Ljava/lang/String;

.field public j:Z

.field public k:B


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/engine/jni/model/NativeInitCrashpadParams$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/roblox/engine/jni/model/NativeInitCrashpadParams;
    .locals 14

    iget-byte v0, p0, Lcom/roblox/engine/jni/model/a$a;->k:B

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    iget-object v3, p0, Lcom/roblox/engine/jni/model/a$a;->a:Ljava/lang/String;

    if-eqz v3, :cond_1

    iget-object v4, p0, Lcom/roblox/engine/jni/model/a$a;->b:Ljava/lang/String;

    if-eqz v4, :cond_1

    iget-object v5, p0, Lcom/roblox/engine/jni/model/a$a;->c:Ljava/lang/String;

    if-eqz v5, :cond_1

    iget-object v6, p0, Lcom/roblox/engine/jni/model/a$a;->d:Ljava/lang/String;

    if-eqz v6, :cond_1

    iget-object v7, p0, Lcom/roblox/engine/jni/model/a$a;->e:Ljava/lang/String;

    if-eqz v7, :cond_1

    iget-object v8, p0, Lcom/roblox/engine/jni/model/a$a;->f:Ljava/lang/String;

    if-eqz v8, :cond_1

    iget-object v9, p0, Lcom/roblox/engine/jni/model/a$a;->g:Ljava/util/List;

    if-eqz v9, :cond_1

    iget-object v11, p0, Lcom/roblox/engine/jni/model/a$a;->i:Ljava/lang/String;

    if-nez v11, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/roblox/engine/jni/model/a;

    iget-boolean v10, p0, Lcom/roblox/engine/jni/model/a$a;->h:Z

    iget-boolean v12, p0, Lcom/roblox/engine/jni/model/a$a;->j:Z

    const/4 v13, 0x0

    invoke-direct/range {v2 .. v13}, Lcom/roblox/engine/jni/model/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;ZLqk/b;)V

    return-object v2

    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roblox/engine/jni/model/a$a;->a:Ljava/lang/String;

    if-nez v1, :cond_2

    const-string v1, " appVersion"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    iget-object v1, p0, Lcom/roblox/engine/jni/model/a$a;->b:Ljava/lang/String;

    if-nez v1, :cond_3

    const-string v1, " baseUrl"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    iget-object v1, p0, Lcom/roblox/engine/jni/model/a$a;->c:Ljava/lang/String;

    if-nez v1, :cond_4

    const-string v1, " countName"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    iget-object v1, p0, Lcom/roblox/engine/jni/model/a$a;->d:Ljava/lang/String;

    if-nez v1, :cond_5

    const-string v1, " uploadUrl"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    iget-object v1, p0, Lcom/roblox/engine/jni/model/a$a;->e:Ljava/lang/String;

    if-nez v1, :cond_6

    const-string v1, " token"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6
    iget-object v1, p0, Lcom/roblox/engine/jni/model/a$a;->f:Ljava/lang/String;

    if-nez v1, :cond_7

    const-string v1, " handlerClassName"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_7
    iget-object v1, p0, Lcom/roblox/engine/jni/model/a$a;->g:Ljava/util/List;

    if-nez v1, :cond_8

    const-string v1, " envArgs"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_8
    iget-byte v1, p0, Lcom/roblox/engine/jni/model/a$a;->k:B

    and-int/lit8 v1, v1, 0x1

    if-nez v1, :cond_9

    const-string v1, " isAtLeastQ"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_9
    iget-object v1, p0, Lcom/roblox/engine/jni/model/a$a;->i:Ljava/lang/String;

    if-nez v1, :cond_a

    const-string v1, " buildVariant"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_a
    iget-byte v1, p0, Lcom/roblox/engine/jni/model/a$a;->k:B

    and-int/lit8 v1, v1, 0x2

    if-nez v1, :cond_b

    const-string v1, " collectLogcat"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_b
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Missing required properties:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public c(Ljava/lang/String;)Lcom/roblox/engine/jni/model/NativeInitCrashpadParams$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/model/a$a;->a:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null appVersion"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public d(Ljava/lang/String;)Lcom/roblox/engine/jni/model/NativeInitCrashpadParams$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/model/a$a;->b:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null baseUrl"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public e(Ljava/lang/String;)Lcom/roblox/engine/jni/model/NativeInitCrashpadParams$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/model/a$a;->i:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null buildVariant"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public f(Z)Lcom/roblox/engine/jni/model/NativeInitCrashpadParams$Builder;
    .locals 0

    iput-boolean p1, p0, Lcom/roblox/engine/jni/model/a$a;->j:Z

    iget-byte p1, p0, Lcom/roblox/engine/jni/model/a$a;->k:B

    or-int/lit8 p1, p1, 0x2

    int-to-byte p1, p1

    iput-byte p1, p0, Lcom/roblox/engine/jni/model/a$a;->k:B

    return-object p0
.end method

.method public g(Ljava/lang/String;)Lcom/roblox/engine/jni/model/NativeInitCrashpadParams$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/model/a$a;->c:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null countName"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public h(Ljava/util/List;)Lcom/roblox/engine/jni/model/NativeInitCrashpadParams$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/roblox/engine/jni/model/NativeInitCrashpadParams$Builder;"
        }
    .end annotation

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/model/a$a;->g:Ljava/util/List;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null envArgs"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public i(Ljava/lang/String;)Lcom/roblox/engine/jni/model/NativeInitCrashpadParams$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/model/a$a;->f:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null handlerClassName"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public j(Z)Lcom/roblox/engine/jni/model/NativeInitCrashpadParams$Builder;
    .locals 0

    iput-boolean p1, p0, Lcom/roblox/engine/jni/model/a$a;->h:Z

    iget-byte p1, p0, Lcom/roblox/engine/jni/model/a$a;->k:B

    or-int/lit8 p1, p1, 0x1

    int-to-byte p1, p1

    iput-byte p1, p0, Lcom/roblox/engine/jni/model/a$a;->k:B

    return-object p0
.end method

.method public k(Ljava/lang/String;)Lcom/roblox/engine/jni/model/NativeInitCrashpadParams$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/model/a$a;->e:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null token"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public l(Ljava/lang/String;)Lcom/roblox/engine/jni/model/NativeInitCrashpadParams$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/model/a$a;->d:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null uploadUrl"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
