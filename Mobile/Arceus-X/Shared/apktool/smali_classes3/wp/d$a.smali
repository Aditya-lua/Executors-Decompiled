.class public final Lwp/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwp/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lwp/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lwp/d;

    invoke-direct {v0}, Lwp/d;-><init>()V

    sput-object v0, Lwp/d$a;->a:Lwp/d;

    return-void
.end method
