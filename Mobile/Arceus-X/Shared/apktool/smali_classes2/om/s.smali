.class public Lom/s;
.super Lom/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lom/s$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lom/k;-><init>()V

    return-void
.end method

.method public static f0()Lom/s;
    .locals 1

    invoke-static {}, Lom/s$b;->a()Lom/s;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public s(Lom/n;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lom/s$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x21

    if-lt p1, v0, :cond_0

    const-string p1, "android.permission.POST_NOTIFICATIONS"

    return-object p1

    :cond_0
    :goto_0
    const-string p1, ""

    return-object p1

    :pswitch_1
    const-string p1, "android.permission.READ_EXTERNAL_STORAGE"

    return-object p1

    :pswitch_2
    const-string p1, "android.permission.WRITE_EXTERNAL_STORAGE"

    return-object p1

    :pswitch_3
    const-string p1, "android.permission.MODIFY_AUDIO_SETTINGS"

    return-object p1

    :pswitch_4
    const-string p1, "android.permission.RECORD_AUDIO"

    return-object p1

    :pswitch_5
    const-string p1, "android.permission.READ_CONTACTS"

    return-object p1

    :pswitch_6
    const-string p1, "android.permission.CAMERA"

    return-object p1

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
