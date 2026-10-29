.class public final Lbf/a$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbf/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final c:Lbf/a$c;

.field public static final d:Lbf/a$c;

.field public static final e:Lbf/a$c;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/security/spec/ECParameterSpec;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lbf/a$c;

    const-string v1, "NIST_P256"

    sget-object v2, Lwe/g;->a:Ljava/security/spec/ECParameterSpec;

    invoke-direct {v0, v1, v2}, Lbf/a$c;-><init>(Ljava/lang/String;Ljava/security/spec/ECParameterSpec;)V

    sput-object v0, Lbf/a$c;->c:Lbf/a$c;

    new-instance v0, Lbf/a$c;

    const-string v1, "NIST_P384"

    sget-object v2, Lwe/g;->b:Ljava/security/spec/ECParameterSpec;

    invoke-direct {v0, v1, v2}, Lbf/a$c;-><init>(Ljava/lang/String;Ljava/security/spec/ECParameterSpec;)V

    sput-object v0, Lbf/a$c;->d:Lbf/a$c;

    new-instance v0, Lbf/a$c;

    const-string v1, "NIST_P521"

    sget-object v2, Lwe/g;->c:Ljava/security/spec/ECParameterSpec;

    invoke-direct {v0, v1, v2}, Lbf/a$c;-><init>(Ljava/lang/String;Ljava/security/spec/ECParameterSpec;)V

    sput-object v0, Lbf/a$c;->e:Lbf/a$c;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/security/spec/ECParameterSpec;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbf/a$c;->a:Ljava/lang/String;

    iput-object p2, p0, Lbf/a$c;->b:Ljava/security/spec/ECParameterSpec;

    return-void
.end method


# virtual methods
.method public a()Ljava/security/spec/ECParameterSpec;
    .locals 1

    iget-object v0, p0, Lbf/a$c;->b:Ljava/security/spec/ECParameterSpec;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbf/a$c;->a:Ljava/lang/String;

    return-object v0
.end method
