.class public Lx0/t$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx0/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static a:Lt/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt/a<",
            "Lg0/k0;",
            "Lx0/r0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx0/s;

    invoke-direct {v0}, Lx0/s;-><init>()V

    sput-object v0, Lx0/t$a;->a:Lt/a;

    return-void
.end method

.method public static a(Lg0/k0;)Lx0/r0;
    .locals 1

    sget-object v0, Lx0/t$a;->a:Lt/a;

    invoke-interface {v0, p0}, Lt/a;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lx0/r0;

    return-object p0
.end method
