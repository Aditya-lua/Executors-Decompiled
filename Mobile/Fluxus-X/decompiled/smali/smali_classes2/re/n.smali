.class public final Lre/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lre/n;

.field public static final c:Lre/n;

.field public static final d:Lre/n;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lre/n;

    const-string v1, "ENABLED"

    invoke-direct {v0, v1}, Lre/n;-><init>(Ljava/lang/String;)V

    sput-object v0, Lre/n;->b:Lre/n;

    new-instance v0, Lre/n;

    const-string v1, "DISABLED"

    invoke-direct {v0, v1}, Lre/n;-><init>(Ljava/lang/String;)V

    sput-object v0, Lre/n;->c:Lre/n;

    new-instance v0, Lre/n;

    const-string v1, "DESTROYED"

    invoke-direct {v0, v1}, Lre/n;-><init>(Ljava/lang/String;)V

    sput-object v0, Lre/n;->d:Lre/n;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lre/n;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lre/n;->a:Ljava/lang/String;

    return-object v0
.end method
