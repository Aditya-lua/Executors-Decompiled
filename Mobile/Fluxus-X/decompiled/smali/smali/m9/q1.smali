.class public final Lm9/q1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Lk9/b;


# direct methods
.method public constructor <init>(Lk9/b;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lm9/q1;->b:Lk9/b;

    iput p2, p0, Lm9/q1;->a:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lm9/q1;->a:I

    return v0
.end method

.method public final b()Lk9/b;
    .locals 1

    iget-object v0, p0, Lm9/q1;->b:Lk9/b;

    return-object v0
.end method
