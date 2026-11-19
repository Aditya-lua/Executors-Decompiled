.class public final Lea/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lea/c;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static final c:Lea/c;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# instance fields
.field public final a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lea/c;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lea/c;-><init>(Z)V

    sput-object v0, Lea/c;->b:Lea/c;

    new-instance v0, Lea/c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lea/c;-><init>(Z)V

    sput-object v0, Lea/c;->c:Lea/c;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lea/c;->a:Z

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lea/c;->a:Z

    return v0
.end method
