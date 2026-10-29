.class public Ln0/k0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln0/k0$a;
    }
.end annotation


# static fields
.field public static final a:Ln0/h0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln0/k0$a;

    invoke-direct {v0}, Ln0/k0$a;-><init>()V

    sput-object v0, Ln0/k0;->a:Ln0/h0;

    return-void
.end method

.method public static a()Ln0/h0;
    .locals 1

    sget-object v0, Ln0/k0;->a:Ln0/h0;

    return-object v0
.end method
