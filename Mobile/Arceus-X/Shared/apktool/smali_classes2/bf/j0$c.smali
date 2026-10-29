.class public final Lbf/j0$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbf/j0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final b:Lbf/j0$c;

.field public static final c:Lbf/j0$c;

.field public static final d:Lbf/j0$c;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lbf/j0$c;

    const-string v1, "SHA256"

    invoke-direct {v0, v1}, Lbf/j0$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lbf/j0$c;->b:Lbf/j0$c;

    new-instance v0, Lbf/j0$c;

    const-string v1, "SHA384"

    invoke-direct {v0, v1}, Lbf/j0$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lbf/j0$c;->c:Lbf/j0$c;

    new-instance v0, Lbf/j0$c;

    const-string v1, "SHA512"

    invoke-direct {v0, v1}, Lbf/j0$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lbf/j0$c;->d:Lbf/j0$c;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbf/j0$c;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbf/j0$c;->a:Ljava/lang/String;

    return-object v0
.end method
