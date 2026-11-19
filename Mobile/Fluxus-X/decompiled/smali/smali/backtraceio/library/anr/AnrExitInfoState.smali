.class public Lbacktraceio/library/anr/AnrExitInfoState;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final PREFS_NAME:Ljava/lang/String; = "ANR_APP_EXIT_INFO_STATE"

.field private static final TIMESTAMP_DEFAULT:J = 0x0L

.field private static final TIMESTAMP_PREF_KEY:Ljava/lang/String; = "LAST_ANR_TIMESTAMP"


# instance fields
.field private final sharedPreferencesManager:Lbacktraceio/library/common/SharedPreferencesManager;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lbacktraceio/library/common/SharedPreferencesManager;

    invoke-direct {v0, p1}, Lbacktraceio/library/common/SharedPreferencesManager;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lbacktraceio/library/anr/AnrExitInfoState;->sharedPreferencesManager:Lbacktraceio/library/common/SharedPreferencesManager;

    return-void
.end method


# virtual methods
.method public getLastTimestamp()J
    .locals 4

    iget-object v0, p0, Lbacktraceio/library/anr/AnrExitInfoState;->sharedPreferencesManager:Lbacktraceio/library/common/SharedPreferencesManager;

    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "ANR_APP_EXIT_INFO_STATE"

    const-string v3, "LAST_ANR_TIMESTAMP"

    invoke-virtual {v0, v2, v3, v1}, Lbacktraceio/library/common/SharedPreferencesManager;->readLongFromSharedPreferences(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public saveTimestamp(J)V
    .locals 2

    iget-object v0, p0, Lbacktraceio/library/anr/AnrExitInfoState;->sharedPreferencesManager:Lbacktraceio/library/common/SharedPreferencesManager;

    const-string v1, "LAST_ANR_TIMESTAMP"

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const-string p2, "ANR_APP_EXIT_INFO_STATE"

    invoke-virtual {v0, p2, v1, p1}, Lbacktraceio/library/common/SharedPreferencesManager;->saveLongToSharedPreferences(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    return-void
.end method
