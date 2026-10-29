.class public final Lwp/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwp/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lwp/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lwp/h;

    invoke-direct {v0}, Lwp/h;-><init>()V

    sput-object v0, Lwp/h$a;->a:Lwp/h;

    return-void
.end method
