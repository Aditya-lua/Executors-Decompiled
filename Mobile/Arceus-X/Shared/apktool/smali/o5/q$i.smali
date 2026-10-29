.class public interface abstract Lo5/q$i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo5/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "i"
.end annotation


# static fields
.field public static final a:Lo5/q$i;

.field public static final b:Lo5/q$i;

.field public static final c:Lo5/q$i;

.field public static final d:Lo5/q$i;

.field public static final e:Lo5/q$i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo5/s;

    invoke-direct {v0}, Lo5/s;-><init>()V

    sput-object v0, Lo5/q$i;->a:Lo5/q$i;

    new-instance v0, Lo5/t;

    invoke-direct {v0}, Lo5/t;-><init>()V

    sput-object v0, Lo5/q$i;->b:Lo5/q$i;

    new-instance v0, Lo5/u;

    invoke-direct {v0}, Lo5/u;-><init>()V

    sput-object v0, Lo5/q$i;->c:Lo5/q$i;

    new-instance v0, Lo5/v;

    invoke-direct {v0}, Lo5/v;-><init>()V

    sput-object v0, Lo5/q$i;->d:Lo5/q$i;

    new-instance v0, Lo5/w;

    invoke-direct {v0}, Lo5/w;-><init>()V

    sput-object v0, Lo5/q$i;->e:Lo5/q$i;

    return-void
.end method

.method public static synthetic b(Lo5/q$h;Lo5/q;Z)V
    .locals 0

    invoke-interface {p0, p1}, Lo5/q$h;->a(Lo5/q;)V

    return-void
.end method

.method public static synthetic c(Lo5/q$h;Lo5/q;Z)V
    .locals 0

    invoke-interface {p0, p1}, Lo5/q$h;->d(Lo5/q;)V

    return-void
.end method

.method public static synthetic d(Lo5/q$h;Lo5/q;Z)V
    .locals 0

    invoke-interface {p0, p1}, Lo5/q$h;->b(Lo5/q;)V

    return-void
.end method


# virtual methods
.method public abstract a(Lo5/q$h;Lo5/q;Z)V
    .param p1    # Lo5/q$h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lo5/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method
