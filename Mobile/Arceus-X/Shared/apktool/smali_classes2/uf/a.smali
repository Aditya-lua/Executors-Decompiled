.class public final Luf/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Luf/a$a;
    }
.end annotation


# instance fields
.field public a:I

.field public b:Luf/d$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Luf/d$a;->a:Luf/d$a;

    iput-object v0, p0, Luf/a;->b:Luf/d$a;

    return-void
.end method

.method public static b()Luf/a;
    .locals 1

    new-instance v0, Luf/a;

    invoke-direct {v0}, Luf/a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Luf/d;
    .locals 3

    new-instance v0, Luf/a$a;

    iget v1, p0, Luf/a;->a:I

    iget-object v2, p0, Luf/a;->b:Luf/d$a;

    invoke-direct {v0, v1, v2}, Luf/a$a;-><init>(ILuf/d$a;)V

    return-object v0
.end method

.method public c(I)Luf/a;
    .locals 0

    iput p1, p0, Luf/a;->a:I

    return-object p0
.end method
