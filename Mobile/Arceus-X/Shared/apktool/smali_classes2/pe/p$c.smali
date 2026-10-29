.class public final Lpe/p$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpe/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:Lpe/l;

.field public final b:Lpe/n;

.field public final c:I

.field public final d:Z


# direct methods
.method public constructor <init>(Lpe/l;Lpe/n;IZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lpe/p$c;->a:Lpe/l;

    .line 4
    iput-object p2, p0, Lpe/p$c;->b:Lpe/n;

    .line 5
    iput p3, p0, Lpe/p$c;->c:I

    .line 6
    iput-boolean p4, p0, Lpe/p$c;->d:Z

    return-void
.end method

.method public synthetic constructor <init>(Lpe/l;Lpe/n;IZLpe/p$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lpe/p$c;-><init>(Lpe/l;Lpe/n;IZ)V

    return-void
.end method


# virtual methods
.method public a()Lpe/l;
    .locals 1

    iget-object v0, p0, Lpe/p$c;->a:Lpe/l;

    return-object v0
.end method
