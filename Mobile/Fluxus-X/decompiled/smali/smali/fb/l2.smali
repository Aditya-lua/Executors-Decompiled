.class public final Lfb/l2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lfb/j2;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lfb/p2;

    const-string v1, "SHA-256"

    const-string v2, "Hashing.sha256()"

    invoke-direct {v0, v1, v2}, Lfb/p2;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lfb/l2;->a:Lfb/j2;

    return-void
.end method
