.class public Ll9/g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll9/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll9/g$a$a;
    }
.end annotation


# static fields
.field public static final c:Ll9/g$a;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# instance fields
.field public final a:Lm9/s;
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

    new-instance v0, Ll9/g$a$a;

    invoke-direct {v0}, Ll9/g$a$a;-><init>()V

    invoke-virtual {v0}, Ll9/g$a$a;->a()Ll9/g$a;

    move-result-object v0

    sput-object v0, Ll9/g$a;->c:Ll9/g$a;

    return-void
.end method

.method public constructor <init>(Lm9/s;Landroid/accounts/Account;Landroid/os/Looper;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll9/g$a;->a:Lm9/s;

    iput-object p3, p0, Ll9/g$a;->b:Landroid/os/Looper;

    return-void
.end method

.method public synthetic constructor <init>(Lm9/s;Landroid/accounts/Account;Landroid/os/Looper;Ll9/t;)V
    .locals 0

    const/4 p2, 0x0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Ll9/g$a;-><init>(Lm9/s;Landroid/accounts/Account;Landroid/os/Looper;)V

    return-void
.end method
