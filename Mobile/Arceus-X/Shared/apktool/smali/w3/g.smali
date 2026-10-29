.class public final Lw3/g;
.super Landroidx/datastore/preferences/protobuf/x;
.source "SourceFile"

# interfaces
.implements Landroidx/datastore/preferences/protobuf/s0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw3/g$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/datastore/preferences/protobuf/x<",
        "Lw3/g;",
        "Lw3/g$a;",
        ">;",
        "Landroidx/datastore/preferences/protobuf/s0;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lw3/g;

.field private static volatile PARSER:Landroidx/datastore/preferences/protobuf/z0; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/datastore/preferences/protobuf/z0<",
            "Lw3/g;",
            ">;"
        }
    .end annotation
.end field

.field public static final STRINGS_FIELD_NUMBER:I = 0x1


# instance fields
.field private strings_:Landroidx/datastore/preferences/protobuf/z$f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/datastore/preferences/protobuf/z$f<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lw3/g;

    invoke-direct {v0}, Lw3/g;-><init>()V

    sput-object v0, Lw3/g;->DEFAULT_INSTANCE:Lw3/g;

    const-class v1, Lw3/g;

    invoke-static {v1, v0}, Landroidx/datastore/preferences/protobuf/x;->R(Ljava/lang/Class;Landroidx/datastore/preferences/protobuf/x;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/datastore/preferences/protobuf/x;-><init>()V

    invoke-static {}, Landroidx/datastore/preferences/protobuf/x;->B()Landroidx/datastore/preferences/protobuf/z$f;

    move-result-object v0

    iput-object v0, p0, Lw3/g;->strings_:Landroidx/datastore/preferences/protobuf/z$f;

    return-void
.end method

.method public static synthetic U()Lw3/g;
    .locals 1

    sget-object v0, Lw3/g;->DEFAULT_INSTANCE:Lw3/g;

    return-object v0
.end method

.method public static synthetic V(Lw3/g;Ljava/lang/Iterable;)V
    .locals 0

    invoke-virtual {p0, p1}, Lw3/g;->W(Ljava/lang/Iterable;)V

    return-void
.end method

.method public static Y()Lw3/g;
    .locals 1

    sget-object v0, Lw3/g;->DEFAULT_INSTANCE:Lw3/g;

    return-object v0
.end method

.method public static a0()Lw3/g$a;
    .locals 1

    sget-object v0, Lw3/g;->DEFAULT_INSTANCE:Lw3/g;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/x;->w()Landroidx/datastore/preferences/protobuf/x$a;

    move-result-object v0

    check-cast v0, Lw3/g$a;

    return-object v0
.end method


# virtual methods
.method public final A(Landroidx/datastore/preferences/protobuf/x$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    sget-object p2, Lw3/e;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p2, p1

    const/4 p2, 0x0

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    return-object p2

    :pswitch_1
    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_2
    sget-object p1, Lw3/g;->PARSER:Landroidx/datastore/preferences/protobuf/z0;

    if-nez p1, :cond_1

    const-class p2, Lw3/g;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lw3/g;->PARSER:Landroidx/datastore/preferences/protobuf/z0;

    if-nez p1, :cond_0

    new-instance p1, Landroidx/datastore/preferences/protobuf/x$b;

    sget-object p3, Lw3/g;->DEFAULT_INSTANCE:Lw3/g;

    invoke-direct {p1, p3}, Landroidx/datastore/preferences/protobuf/x$b;-><init>(Landroidx/datastore/preferences/protobuf/x;)V

    sput-object p1, Lw3/g;->PARSER:Landroidx/datastore/preferences/protobuf/z0;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p2

    return-object p1

    :goto_1
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    return-object p1

    :pswitch_3
    sget-object p1, Lw3/g;->DEFAULT_INSTANCE:Lw3/g;

    return-object p1

    :pswitch_4
    const-string p1, "strings_"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a"

    sget-object p3, Lw3/g;->DEFAULT_INSTANCE:Lw3/g;

    invoke-static {p3, p2, p1}, Landroidx/datastore/preferences/protobuf/x;->N(Landroidx/datastore/preferences/protobuf/r0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lw3/g$a;

    invoke-direct {p1, p2}, Lw3/g$a;-><init>(Lw3/e;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lw3/g;

    invoke-direct {p1}, Lw3/g;-><init>()V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final W(Ljava/lang/Iterable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lw3/g;->X()V

    iget-object v0, p0, Lw3/g;->strings_:Landroidx/datastore/preferences/protobuf/z$f;

    invoke-static {p1, v0}, Landroidx/datastore/preferences/protobuf/a;->g(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method public final X()V
    .locals 2

    iget-object v0, p0, Lw3/g;->strings_:Landroidx/datastore/preferences/protobuf/z$f;

    invoke-interface {v0}, Landroidx/datastore/preferences/protobuf/z$f;->n()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/x;->L(Landroidx/datastore/preferences/protobuf/z$f;)Landroidx/datastore/preferences/protobuf/z$f;

    move-result-object v0

    iput-object v0, p0, Lw3/g;->strings_:Landroidx/datastore/preferences/protobuf/z$f;

    :cond_0
    return-void
.end method

.method public Z()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lw3/g;->strings_:Landroidx/datastore/preferences/protobuf/z$f;

    return-object v0
.end method
