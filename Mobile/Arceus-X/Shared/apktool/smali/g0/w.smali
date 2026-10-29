.class public abstract Lg0/w;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg0/w$b;,
        Lg0/w$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lg0/w$b;)Lg0/w;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lg0/w;->b(Lg0/w$b;Lg0/w$a;)Lg0/w;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lg0/w$b;Lg0/w$a;)Lg0/w;
    .locals 1

    new-instance v0, Lg0/e;

    invoke-direct {v0, p0, p1}, Lg0/e;-><init>(Lg0/w$b;Lg0/w$a;)V

    return-object v0
.end method


# virtual methods
.method public abstract c()Lg0/w$a;
.end method

.method public abstract d()Lg0/w$b;
.end method
