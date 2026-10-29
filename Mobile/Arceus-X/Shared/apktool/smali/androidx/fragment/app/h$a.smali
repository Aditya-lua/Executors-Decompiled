.class public final Landroidx/fragment/app/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:I

.field public b:Landroidx/fragment/app/c;

.field public c:Z

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:Landroidx/lifecycle/l$b;

.field public i:Landroidx/lifecycle/l$b;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(ILandroidx/fragment/app/c;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Landroidx/fragment/app/h$a;->a:I

    .line 4
    iput-object p2, p0, Landroidx/fragment/app/h$a;->b:Landroidx/fragment/app/c;

    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Landroidx/fragment/app/h$a;->c:Z

    .line 6
    sget-object p1, Landroidx/lifecycle/l$b;->e:Landroidx/lifecycle/l$b;

    iput-object p1, p0, Landroidx/fragment/app/h$a;->h:Landroidx/lifecycle/l$b;

    .line 7
    iput-object p1, p0, Landroidx/fragment/app/h$a;->i:Landroidx/lifecycle/l$b;

    return-void
.end method

.method public constructor <init>(ILandroidx/fragment/app/c;Z)V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput p1, p0, Landroidx/fragment/app/h$a;->a:I

    .line 10
    iput-object p2, p0, Landroidx/fragment/app/h$a;->b:Landroidx/fragment/app/c;

    .line 11
    iput-boolean p3, p0, Landroidx/fragment/app/h$a;->c:Z

    .line 12
    sget-object p1, Landroidx/lifecycle/l$b;->e:Landroidx/lifecycle/l$b;

    iput-object p1, p0, Landroidx/fragment/app/h$a;->h:Landroidx/lifecycle/l$b;

    .line 13
    iput-object p1, p0, Landroidx/fragment/app/h$a;->i:Landroidx/lifecycle/l$b;

    return-void
.end method
