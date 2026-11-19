.class public final Lgb/l1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>([B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 p1, 0x9

    iput p1, p0, Lgb/l1;->a:I

    return-void
.end method


# virtual methods
.method public final a(I)Lgb/l1;
    .locals 0

    const/16 p1, 0x9

    iput p1, p0, Lgb/l1;->a:I

    return-object p0
.end method

.method public final b(Ljava/lang/String;)Lgb/l1;
    .locals 0

    iput-object p1, p0, Lgb/l1;->b:Ljava/lang/String;

    return-object p0
.end method

.method public final c()Lgb/q1;
    .locals 4

    new-instance v0, Lgb/q1;

    iget v1, p0, Lgb/l1;->a:I

    iget-object v2, p0, Lgb/l1;->b:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lgb/q1;-><init>(ILjava/lang/String;[B)V

    return-object v0
.end method
