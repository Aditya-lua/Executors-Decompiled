.class public final Ldf/a$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldf/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final c:Ldf/a$c;

.field public static final d:Ldf/a$c;

.field public static final e:Ldf/a$c;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/security/spec/ECParameterSpec;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ldf/a$c;

    const-string v1, "NIST_P256"

    sget-object v2, Lye/g;->a:Ljava/security/spec/ECParameterSpec;

    invoke-direct {v0, v1, v2}, Ldf/a$c;-><init>(Ljava/lang/String;Ljava/security/spec/ECParameterSpec;)V

    sput-object v0, Ldf/a$c;->c:Ldf/a$c;

    new-instance v0, Ldf/a$c;

    const-string v1, "NIST_P384"

    sget-object v2, Lye/g;->b:Ljava/security/spec/ECParameterSpec;

    invoke-direct {v0, v1, v2}, Ldf/a$c;-><init>(Ljava/lang/String;Ljava/security/spec/ECParameterSpec;)V

    sput-object v0, Ldf/a$c;->d:Ldf/a$c;

    new-instance v0, Ldf/a$c;

    const-string v1, "NIST_P521"

    sget-object v2, Lye/g;->c:Ljava/security/spec/ECParameterSpec;

    invoke-direct {v0, v1, v2}, Ldf/a$c;-><init>(Ljava/lang/String;Ljava/security/spec/ECParameterSpec;)V

    sput-object v0, Ldf/a$c;->e:Ldf/a$c;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/security/spec/ECParameterSpec;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldf/a$c;->a:Ljava/lang/String;

    iput-object p2, p0, Ldf/a$c;->b:Ljava/security/spec/ECParameterSpec;

    return-void
.end method


# virtual methods
.method public a()Ljava/security/spec/ECParameterSpec;
    .locals 1

    iget-object v0, p0, Ldf/a$c;->b:Ljava/security/spec/ECParameterSpec;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ldf/a$c;->a:Ljava/lang/String;

    return-object v0
.end method
