.class public final Ldf/a$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldf/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# static fields
.field public static final b:Ldf/a$d;

.field public static final c:Ldf/a$d;

.field public static final d:Ldf/a$d;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldf/a$d;

    const-string v1, "SHA256"

    invoke-direct {v0, v1}, Ldf/a$d;-><init>(Ljava/lang/String;)V

    sput-object v0, Ldf/a$d;->b:Ldf/a$d;

    new-instance v0, Ldf/a$d;

    const-string v1, "SHA384"

    invoke-direct {v0, v1}, Ldf/a$d;-><init>(Ljava/lang/String;)V

    sput-object v0, Ldf/a$d;->c:Ldf/a$d;

    new-instance v0, Ldf/a$d;

    const-string v1, "SHA512"

    invoke-direct {v0, v1}, Ldf/a$d;-><init>(Ljava/lang/String;)V

    sput-object v0, Ldf/a$d;->d:Ldf/a$d;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldf/a$d;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ldf/a$d;->a:Ljava/lang/String;

    return-object v0
.end method
