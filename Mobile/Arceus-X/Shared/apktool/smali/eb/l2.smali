.class public final Leb/l2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Leb/j2;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Leb/p2;

    const-string v1, "SHA-256"

    const-string v2, "Hashing.sha256()"

    invoke-direct {v0, v1, v2}, Leb/p2;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Leb/l2;->a:Leb/j2;

    return-void
.end method
