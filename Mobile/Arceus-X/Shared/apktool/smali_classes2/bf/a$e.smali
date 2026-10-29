.class public final Lbf/a$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbf/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# static fields
.field public static final b:Lbf/a$e;

.field public static final c:Lbf/a$e;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lbf/a$e;

    const-string v1, "IEEE_P1363"

    invoke-direct {v0, v1}, Lbf/a$e;-><init>(Ljava/lang/String;)V

    sput-object v0, Lbf/a$e;->b:Lbf/a$e;

    new-instance v0, Lbf/a$e;

    const-string v1, "DER"

    invoke-direct {v0, v1}, Lbf/a$e;-><init>(Ljava/lang/String;)V

    sput-object v0, Lbf/a$e;->c:Lbf/a$e;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbf/a$e;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbf/a$e;->a:Ljava/lang/String;

    return-object v0
.end method
