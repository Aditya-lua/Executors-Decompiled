.class public final Lw3/f;
.super Landroidx/datastore/preferences/protobuf/x;
.source "SourceFile"

# interfaces
.implements Landroidx/datastore/preferences/protobuf/s0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw3/f$a;,
        Lw3/f$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/datastore/preferences/protobuf/x<",
        "Lw3/f;",
        "Lw3/f$a;",
        ">;",
        "Landroidx/datastore/preferences/protobuf/s0;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lw3/f;

.field private static volatile PARSER:Landroidx/datastore/preferences/protobuf/z0; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/datastore/preferences/protobuf/z0<",
            "Lw3/f;",
            ">;"
        }
    .end annotation
.end field

.field public static final PREFERENCES_FIELD_NUMBER:I = 0x1


# instance fields
.field private preferences_:Landroidx/datastore/preferences/protobuf/l0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/datastore/preferences/protobuf/l0<",
            "Ljava/lang/String;",
            "Lw3/h;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lw3/f;

    invoke-direct {v0}, Lw3/f;-><init>()V

    sput-object v0, Lw3/f;->DEFAULT_INSTANCE:Lw3/f;

    const-class v1, Lw3/f;

    invoke-static {v1, v0}, Landroidx/datastore/preferences/protobuf/x;->R(Ljava/lang/Class;Landroidx/datastore/preferences/protobuf/x;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/datastore/preferences/protobuf/x;-><init>()V

    invoke-static {}, Landroidx/datastore/preferences/protobuf/l0;->e()Landroidx/datastore/preferences/protobuf/l0;

    move-result-object v0

    iput-object v0, p0, Lw3/f;->preferences_:Landroidx/datastore/preferences/protobuf/l0;

    return-void
.end method

.method public static synthetic U()Lw3/f;
    .locals 1

    sget-object v0, Lw3/f;->DEFAULT_INSTANCE:Lw3/f;

    return-object v0
.end method

.method public static synthetic V(Lw3/f;)Ljava/util/Map;
    .locals 0

    invoke-virtual {p0}, Lw3/f;->W()Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static a0()Lw3/f$a;
    .locals 1

    sget-object v0, Lw3/f;->DEFAULT_INSTANCE:Lw3/f;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/x;->w()Landroidx/datastore/preferences/protobuf/x$a;

    move-result-object v0

    check-cast v0, Lw3/f$a;

    return-object v0
.end method

.method public static b0(Ljava/io/InputStream;)Lw3/f;
    .locals 1

    sget-object v0, Lw3/f;->DEFAULT_INSTANCE:Lw3/f;

    invoke-static {v0, p0}, Landroidx/datastore/preferences/protobuf/x;->P(Landroidx/datastore/preferences/protobuf/x;Ljava/io/InputStream;)Landroidx/datastore/preferences/protobuf/x;

    move-result-object p0

    check-cast p0, Lw3/f;

    return-object p0
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
    sget-object p1, Lw3/f;->PARSER:Landroidx/datastore/preferences/protobuf/z0;

    if-nez p1, :cond_1

    const-class p2, Lw3/f;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lw3/f;->PARSER:Landroidx/datastore/preferences/protobuf/z0;

    if-nez p1, :cond_0

    new-instance p1, Landroidx/datastore/preferences/protobuf/x$b;

    sget-object p3, Lw3/f;->DEFAULT_INSTANCE:Lw3/f;

    invoke-direct {p1, p3}, Landroidx/datastore/preferences/protobuf/x$b;-><init>(Landroidx/datastore/preferences/protobuf/x;)V

    sput-object p1, Lw3/f;->PARSER:Landroidx/datastore/preferences/protobuf/z0;

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
    sget-object p1, Lw3/f;->DEFAULT_INSTANCE:Lw3/f;

    return-object p1

    :pswitch_4
    const-string p1, "preferences_"

    sget-object p2, Lw3/f$b;->a:Landroidx/datastore/preferences/protobuf/k0;

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012"

    sget-object p3, Lw3/f;->DEFAULT_INSTANCE:Lw3/f;

    invoke-static {p3, p2, p1}, Landroidx/datastore/preferences/protobuf/x;->N(Landroidx/datastore/preferences/protobuf/r0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lw3/f$a;

    invoke-direct {p1, p2}, Lw3/f$a;-><init>(Lw3/e;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lw3/f;

    invoke-direct {p1}, Lw3/f;-><init>()V

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

.method public final W()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lw3/h;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lw3/f;->Y()Landroidx/datastore/preferences/protobuf/l0;

    move-result-object v0

    return-object v0
.end method

.method public X()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lw3/h;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lw3/f;->Z()Landroidx/datastore/preferences/protobuf/l0;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final Y()Landroidx/datastore/preferences/protobuf/l0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/datastore/preferences/protobuf/l0<",
            "Ljava/lang/String;",
            "Lw3/h;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lw3/f;->preferences_:Landroidx/datastore/preferences/protobuf/l0;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/l0;->k()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lw3/f;->preferences_:Landroidx/datastore/preferences/protobuf/l0;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/l0;->p()Landroidx/datastore/preferences/protobuf/l0;

    move-result-object v0

    iput-object v0, p0, Lw3/f;->preferences_:Landroidx/datastore/preferences/protobuf/l0;

    :cond_0
    iget-object v0, p0, Lw3/f;->preferences_:Landroidx/datastore/preferences/protobuf/l0;

    return-object v0
.end method

.method public final Z()Landroidx/datastore/preferences/protobuf/l0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/datastore/preferences/protobuf/l0<",
            "Ljava/lang/String;",
            "Lw3/h;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lw3/f;->preferences_:Landroidx/datastore/preferences/protobuf/l0;

    return-object v0
.end method
