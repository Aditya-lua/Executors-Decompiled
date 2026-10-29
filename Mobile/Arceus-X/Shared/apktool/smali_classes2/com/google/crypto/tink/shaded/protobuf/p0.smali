.class public final Lcom/google/crypto/tink/shaded/protobuf/p0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/crypto/tink/shaded/protobuf/n0;

.field public static final b:Lcom/google/crypto/tink/shaded/protobuf/n0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p0;->c()Lcom/google/crypto/tink/shaded/protobuf/n0;

    move-result-object v0

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/p0;->a:Lcom/google/crypto/tink/shaded/protobuf/n0;

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/o0;

    invoke-direct {v0}, Lcom/google/crypto/tink/shaded/protobuf/o0;-><init>()V

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/p0;->b:Lcom/google/crypto/tink/shaded/protobuf/n0;

    return-void
.end method

.method public static a()Lcom/google/crypto/tink/shaded/protobuf/n0;
    .locals 1

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/p0;->a:Lcom/google/crypto/tink/shaded/protobuf/n0;

    return-object v0
.end method

.method public static b()Lcom/google/crypto/tink/shaded/protobuf/n0;
    .locals 1

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/p0;->b:Lcom/google/crypto/tink/shaded/protobuf/n0;

    return-object v0
.end method

.method public static c()Lcom/google/crypto/tink/shaded/protobuf/n0;
    .locals 2

    sget-boolean v0, Lcom/google/crypto/tink/shaded/protobuf/c1;->d:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    :try_start_0
    const-string v0, "com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/n0;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    return-object v1
.end method
