.class public final Lye/p;
.super Lre/l;
.source "SourceFile"


# instance fields
.field public final a:Lye/l0;


# direct methods
.method public constructor <init>(Lye/l0;Lre/d0;)V
    .locals 0

    invoke-direct {p0}, Lre/l;-><init>()V

    invoke-static {p1, p2}, Lye/p;->c(Lye/l0;Lre/d0;)V

    iput-object p1, p0, Lye/p;->a:Lye/l0;

    return-void
.end method

.method public static c(Lye/l0;Lre/d0;)V
    .locals 1

    sget-object v0, Lye/p$a;->b:[I

    invoke-virtual {p0}, Lye/l0;->d()Lcf/f0$c;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    return-void

    :cond_0
    invoke-static {p1}, Lre/d0;->b(Lre/d0;)Lre/d0;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lye/p;->a:Lye/l0;

    invoke-virtual {v0}, Lye/l0;->c()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public b(Lre/d0;)Lye/l0;
    .locals 1

    iget-object v0, p0, Lye/p;->a:Lye/l0;

    invoke-static {v0, p1}, Lye/p;->c(Lye/l0;Lre/d0;)V

    iget-object p1, p0, Lye/p;->a:Lye/l0;

    return-object p1
.end method
