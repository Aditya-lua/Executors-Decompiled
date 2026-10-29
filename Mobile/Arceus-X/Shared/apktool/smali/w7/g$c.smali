.class public Lw7/g$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw7/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public a:Lw7/g$p;

.field public b:Lw7/g$p;

.field public c:Lw7/g$p;

.field public d:Lw7/g$p;


# direct methods
.method public constructor <init>(Lw7/g$p;Lw7/g$p;Lw7/g$p;Lw7/g$p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw7/g$c;->a:Lw7/g$p;

    iput-object p2, p0, Lw7/g$c;->b:Lw7/g$p;

    iput-object p3, p0, Lw7/g$c;->c:Lw7/g$p;

    iput-object p4, p0, Lw7/g$c;->d:Lw7/g$p;

    return-void
.end method
