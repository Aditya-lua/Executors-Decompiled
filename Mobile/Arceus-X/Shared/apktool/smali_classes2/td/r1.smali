.class public abstract Ltd/r1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lee/t0;

.field public final b:Ljava/lang/String;

.field public final c:J

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/String;J)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lee/t0;

    const-string v1, "IntegrityDialogWrapper"

    invoke-direct {v0, v1}, Lee/t0;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Ltd/r1;->a:Lee/t0;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ltd/r1;->d:Ljava/lang/Object;

    iput-object p1, p0, Ltd/r1;->b:Ljava/lang/String;

    iput-wide p2, p0, Ltd/r1;->c:J

    return-void
.end method
