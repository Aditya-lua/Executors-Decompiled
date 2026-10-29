.class public final synthetic Lx0/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/a;


# instance fields
.field public final synthetic a:Lx0/n0;

.field public final synthetic b:Lx0/n0$a;

.field public final synthetic c:I

.field public final synthetic d:Lg0/j2$a;

.field public final synthetic e:Lg0/j2$a;


# direct methods
.method public synthetic constructor <init>(Lx0/n0;Lx0/n0$a;ILg0/j2$a;Lg0/j2$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx0/g0;->a:Lx0/n0;

    iput-object p2, p0, Lx0/g0;->b:Lx0/n0$a;

    iput p3, p0, Lx0/g0;->c:I

    iput-object p4, p0, Lx0/g0;->d:Lg0/j2$a;

    iput-object p5, p0, Lx0/g0;->e:Lg0/j2$a;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Lne/x;
    .locals 6

    iget-object v0, p0, Lx0/g0;->a:Lx0/n0;

    iget-object v1, p0, Lx0/g0;->b:Lx0/n0$a;

    iget v2, p0, Lx0/g0;->c:I

    iget-object v3, p0, Lx0/g0;->d:Lg0/j2$a;

    iget-object v4, p0, Lx0/g0;->e:Lg0/j2$a;

    move-object v5, p1

    check-cast v5, Landroid/view/Surface;

    invoke-static/range {v0 .. v5}, Lx0/n0;->d(Lx0/n0;Lx0/n0$a;ILg0/j2$a;Lg0/j2$a;Landroid/view/Surface;)Lne/x;

    move-result-object p1

    return-object p1
.end method
