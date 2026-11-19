.class public Lx7/g$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx7/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public a:Lx7/g$p;

.field public b:Lx7/g$p;

.field public c:Lx7/g$p;

.field public d:Lx7/g$p;


# direct methods
.method public constructor <init>(Lx7/g$p;Lx7/g$p;Lx7/g$p;Lx7/g$p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx7/g$c;->a:Lx7/g$p;

    iput-object p2, p0, Lx7/g$c;->b:Lx7/g$p;

    iput-object p3, p0, Lx7/g$c;->c:Lx7/g$p;

    iput-object p4, p0, Lx7/g$c;->d:Lx7/g$p;

    return-void
.end method
