.class public final Lpe/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lpe/n;

.field public static final c:Lpe/n;

.field public static final d:Lpe/n;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpe/n;

    const-string v1, "ENABLED"

    invoke-direct {v0, v1}, Lpe/n;-><init>(Ljava/lang/String;)V

    sput-object v0, Lpe/n;->b:Lpe/n;

    new-instance v0, Lpe/n;

    const-string v1, "DISABLED"

    invoke-direct {v0, v1}, Lpe/n;-><init>(Ljava/lang/String;)V

    sput-object v0, Lpe/n;->c:Lpe/n;

    new-instance v0, Lpe/n;

    const-string v1, "DESTROYED"

    invoke-direct {v0, v1}, Lpe/n;-><init>(Ljava/lang/String;)V

    sput-object v0, Lpe/n;->d:Lpe/n;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpe/n;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpe/n;->a:Ljava/lang/String;

    return-object v0
.end method
