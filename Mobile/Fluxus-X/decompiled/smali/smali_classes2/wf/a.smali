.class public final Lwf/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwf/a$a;
    }
.end annotation


# instance fields
.field public a:I

.field public b:Lwf/d$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lwf/d$a;->a:Lwf/d$a;

    iput-object v0, p0, Lwf/a;->b:Lwf/d$a;

    return-void
.end method

.method public static b()Lwf/a;
    .locals 1

    new-instance v0, Lwf/a;

    invoke-direct {v0}, Lwf/a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Lwf/d;
    .locals 3

    new-instance v0, Lwf/a$a;

    iget v1, p0, Lwf/a;->a:I

    iget-object v2, p0, Lwf/a;->b:Lwf/d$a;

    invoke-direct {v0, v1, v2}, Lwf/a$a;-><init>(ILwf/d$a;)V

    return-object v0
.end method

.method public c(I)Lwf/a;
    .locals 0

    iput p1, p0, Lwf/a;->a:I

    return-object p0
.end method
