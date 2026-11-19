.class public final Lze/o$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lze/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final b:Lze/o$c;

.field public static final c:Lze/o$c;

.field public static final d:Lze/o$c;

.field public static final e:Lze/o$c;

.field public static final f:Lze/o$c;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lze/o$c;

    const-string v1, "SHA1"

    invoke-direct {v0, v1}, Lze/o$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lze/o$c;->b:Lze/o$c;

    new-instance v0, Lze/o$c;

    const-string v1, "SHA224"

    invoke-direct {v0, v1}, Lze/o$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lze/o$c;->c:Lze/o$c;

    new-instance v0, Lze/o$c;

    const-string v1, "SHA256"

    invoke-direct {v0, v1}, Lze/o$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lze/o$c;->d:Lze/o$c;

    new-instance v0, Lze/o$c;

    const-string v1, "SHA384"

    invoke-direct {v0, v1}, Lze/o$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lze/o$c;->e:Lze/o$c;

    new-instance v0, Lze/o$c;

    const-string v1, "SHA512"

    invoke-direct {v0, v1}, Lze/o$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lze/o$c;->f:Lze/o$c;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lze/o$c;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lze/o$c;->a:Ljava/lang/String;

    return-object v0
.end method
