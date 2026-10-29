.class public Lk9/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk9/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk9/e$a$a;
    }
.end annotation


# static fields
.field public static final c:Lk9/e$a;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# instance fields
.field public final a:Ll9/s;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final b:Landroid/os/Looper;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk9/e$a$a;

    invoke-direct {v0}, Lk9/e$a$a;-><init>()V

    invoke-virtual {v0}, Lk9/e$a$a;->a()Lk9/e$a;

    move-result-object v0

    sput-object v0, Lk9/e$a;->c:Lk9/e$a;

    return-void
.end method

.method public constructor <init>(Ll9/s;Landroid/accounts/Account;Landroid/os/Looper;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk9/e$a;->a:Ll9/s;

    iput-object p3, p0, Lk9/e$a;->b:Landroid/os/Looper;

    return-void
.end method

.method public synthetic constructor <init>(Ll9/s;Landroid/accounts/Account;Landroid/os/Looper;Lk9/r;)V
    .locals 0

    const/4 p2, 0x0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lk9/e$a;-><init>(Ll9/s;Landroid/accounts/Account;Landroid/os/Looper;)V

    return-void
.end method
