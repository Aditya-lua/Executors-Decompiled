.class public abstract Log/c$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Log/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/util/Date;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final b:Log/c$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Log/c$b<",
            "Ljava/util/Date;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Log/c$b$a;

    const-class v1, Ljava/util/Date;

    invoke-direct {v0, v1}, Log/c$b$a;-><init>(Ljava/lang/Class;)V

    sput-object v0, Log/c$b;->b:Log/c$b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Log/c$b;->a:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public final a(II)Llg/b0;
    .locals 2

    new-instance v0, Log/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Log/c;-><init>(Log/c$b;IILog/c$a;)V

    invoke-virtual {p0, v0}, Log/c$b;->c(Log/c;)Llg/b0;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/String;)Llg/b0;
    .locals 2

    new-instance v0, Log/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Log/c;-><init>(Log/c$b;Ljava/lang/String;Log/c$a;)V

    invoke-virtual {p0, v0}, Log/c$b;->c(Log/c;)Llg/b0;

    move-result-object p1

    return-object p1
.end method

.method public final c(Log/c;)Llg/b0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Log/c<",
            "TT;>;)",
            "Llg/b0;"
        }
    .end annotation

    iget-object v0, p0, Log/c$b;->a:Ljava/lang/Class;

    invoke-static {v0, p1}, Log/p;->b(Ljava/lang/Class;Llg/a0;)Llg/b0;

    move-result-object p1

    return-object p1
.end method

.method public abstract d(Ljava/util/Date;)Ljava/util/Date;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Date;",
            ")TT;"
        }
    .end annotation
.end method
