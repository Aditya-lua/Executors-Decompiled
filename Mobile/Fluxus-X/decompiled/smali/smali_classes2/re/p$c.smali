.class public final Lre/p$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lre/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:Lre/l;

.field public final b:Lre/n;

.field public final c:I

.field public final d:Z


# direct methods
.method public constructor <init>(Lre/l;Lre/n;IZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lre/p$c;->a:Lre/l;

    .line 4
    iput-object p2, p0, Lre/p$c;->b:Lre/n;

    .line 5
    iput p3, p0, Lre/p$c;->c:I

    .line 6
    iput-boolean p4, p0, Lre/p$c;->d:Z

    return-void
.end method

.method public synthetic constructor <init>(Lre/l;Lre/n;IZLre/p$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lre/p$c;-><init>(Lre/l;Lre/n;IZ)V

    return-void
.end method


# virtual methods
.method public a()Lre/l;
    .locals 1

    iget-object v0, p0, Lre/p$c;->a:Lre/l;

    return-object v0
.end method
