.class public final Lbf/a$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbf/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# static fields
.field public static final b:Lbf/a$d;

.field public static final c:Lbf/a$d;

.field public static final d:Lbf/a$d;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lbf/a$d;

    const-string v1, "SHA256"

    invoke-direct {v0, v1}, Lbf/a$d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lbf/a$d;->b:Lbf/a$d;

    new-instance v0, Lbf/a$d;

    const-string v1, "SHA384"

    invoke-direct {v0, v1}, Lbf/a$d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lbf/a$d;->c:Lbf/a$d;

    new-instance v0, Lbf/a$d;

    const-string v1, "SHA512"

    invoke-direct {v0, v1}, Lbf/a$d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lbf/a$d;->d:Lbf/a$d;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbf/a$d;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbf/a$d;->a:Ljava/lang/String;

    return-object v0
.end method
