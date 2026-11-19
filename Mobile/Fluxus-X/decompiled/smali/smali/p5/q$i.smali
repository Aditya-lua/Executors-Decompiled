.class public interface abstract Lp5/q$i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp5/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "i"
.end annotation


# static fields
.field public static final a:Lp5/q$i;

.field public static final b:Lp5/q$i;

.field public static final c:Lp5/q$i;

.field public static final d:Lp5/q$i;

.field public static final e:Lp5/q$i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp5/s;

    invoke-direct {v0}, Lp5/s;-><init>()V

    sput-object v0, Lp5/q$i;->a:Lp5/q$i;

    new-instance v0, Lp5/t;

    invoke-direct {v0}, Lp5/t;-><init>()V

    sput-object v0, Lp5/q$i;->b:Lp5/q$i;

    new-instance v0, Lp5/u;

    invoke-direct {v0}, Lp5/u;-><init>()V

    sput-object v0, Lp5/q$i;->c:Lp5/q$i;

    new-instance v0, Lp5/v;

    invoke-direct {v0}, Lp5/v;-><init>()V

    sput-object v0, Lp5/q$i;->d:Lp5/q$i;

    new-instance v0, Lp5/w;

    invoke-direct {v0}, Lp5/w;-><init>()V

    sput-object v0, Lp5/q$i;->e:Lp5/q$i;

    return-void
.end method

.method public static synthetic b(Lp5/q$h;Lp5/q;Z)V
    .locals 0

    invoke-interface {p0, p1}, Lp5/q$h;->k(Lp5/q;)V

    return-void
.end method

.method public static synthetic c(Lp5/q$h;Lp5/q;Z)V
    .locals 0

    invoke-interface {p0, p1}, Lp5/q$h;->h(Lp5/q;)V

    return-void
.end method

.method public static synthetic d(Lp5/q$h;Lp5/q;Z)V
    .locals 0

    invoke-interface {p0, p1}, Lp5/q$h;->f(Lp5/q;)V

    return-void
.end method


# virtual methods
.method public abstract a(Lp5/q$h;Lp5/q;Z)V
    .param p1    # Lp5/q$h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lp5/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method
