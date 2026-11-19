.class public final Lob/e5;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final A:Lob/d5;

.field public static final A0:Lob/d5;

.field public static final B:Lob/d5;

.field public static final B0:Lob/d5;

.field public static final C:Lob/d5;

.field public static final C0:Lob/d5;

.field public static final D:Lob/d5;

.field public static final D0:Lob/d5;

.field public static final E:Lob/d5;

.field public static final E0:Lob/d5;

.field public static final F:Lob/d5;

.field public static final F0:Lob/d5;

.field public static final G:Lob/d5;

.field public static final G0:Lob/d5;

.field public static final H:Lob/d5;

.field public static final H0:Lob/d5;

.field public static final I:Lob/d5;

.field public static final I0:Lob/d5;

.field public static final J:Lob/d5;

.field public static final J0:Lob/d5;

.field public static final K:Lob/d5;

.field public static final K0:Lob/d5;

.field public static final L:Lob/d5;

.field public static final L0:Lob/d5;

.field public static final M:Lob/d5;

.field public static final M0:Lob/d5;

.field public static final N:Lob/d5;

.field public static final N0:Lob/d5;

.field public static final O:Lob/d5;

.field public static final O0:Lob/d5;

.field public static final P:Lob/d5;

.field public static final P0:Lob/d5;

.field public static final Q:Lob/d5;

.field public static final Q0:Lob/d5;

.field public static final R:Lob/d5;

.field public static final R0:Lob/d5;

.field public static final S:Lob/d5;

.field public static final S0:Lob/d5;

.field public static final T:Lob/d5;

.field public static final T0:Lob/d5;

.field public static final U:Lob/d5;

.field public static final U0:Lob/d5;

.field public static final V:Lob/d5;

.field public static final V0:Lob/d5;

.field public static final W:Lob/d5;

.field public static final W0:Lob/d5;

.field public static final X:Lob/d5;

.field public static final X0:Lob/d5;

.field public static final Y:Lob/d5;

.field public static final Y0:Lob/d5;

.field public static final Z:Lob/d5;

.field public static final Z0:Lob/d5;

.field public static final a:Ljava/util/List;

.field public static final a0:Lob/d5;

.field public static final a1:Lob/d5;

.field public static final b:Lob/d5;

.field public static final b0:Lob/d5;

.field public static final b1:Lob/d5;

.field public static final c:Lob/d5;

.field public static final c0:Lob/d5;

.field public static final c1:Lob/d5;

.field public static final d:Lob/d5;

.field public static final d0:Lob/d5;

.field public static final d1:Lob/d5;

.field public static final e:Lob/d5;

.field public static final e0:Lob/d5;

.field public static final e1:Lob/d5;

.field public static final f:Lob/d5;

.field public static final f0:Lob/d5;

.field public static final f1:Lob/d5;

.field public static final g:Lob/d5;

.field public static final g0:Lob/d5;

.field public static final g1:Lob/d5;

.field public static final h:Lob/d5;

.field public static final h0:Lob/d5;

.field public static final h1:Lob/d5;

.field public static final i:Lob/d5;

.field public static final i0:Lob/d5;

.field public static final i1:Lob/d5;

.field public static final j:Lob/d5;

.field public static final j0:Lob/d5;

.field public static final j1:Lob/d5;

.field public static final k:Lob/d5;

.field public static final k0:Lob/d5;

.field public static final k1:Lob/d5;

.field public static final l:Lob/d5;

.field public static final l0:Lob/d5;

.field public static final l1:Lob/d5;

.field public static final m:Lob/d5;

.field public static final m0:Lob/d5;

.field public static final n:Lob/d5;

.field public static final n0:Lob/d5;

.field public static final o:Lob/d5;

.field public static final o0:Lob/d5;

.field public static final p:Lob/d5;

.field public static final p0:Lob/d5;

.field public static final q:Lob/d5;

.field public static final q0:Lob/d5;

.field public static final r:Lob/d5;

.field public static final r0:Lob/d5;

.field public static final s:Lob/d5;

.field public static final s0:Lob/d5;

.field public static final t:Lob/d5;

.field public static final t0:Lob/d5;

.field public static final u:Lob/d5;

.field public static final u0:Lob/d5;

.field public static final v:Lob/d5;

.field public static final v0:Lob/d5;

.field public static final w:Lob/d5;

.field public static final w0:Lob/d5;

.field public static final x:Lob/d5;

.field public static final x0:Lob/d5;

.field public static final y:Lob/d5;

.field public static final y0:Lob/d5;

.field public static final z:Lob/d5;

.field public static final z0:Lob/d5;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lob/e5;->a:Ljava/util/List;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    const-wide/16 v0, 0x2710

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Lob/w4;->a:Lob/w4;

    const-string v2, "measurement.ad_id_cache_time"

    const/4 v3, 0x0

    invoke-static {v2, v0, v0, v1, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v1

    sput-object v1, Lob/e5;->b:Lob/d5;

    const-wide/32 v1, 0x36ee80

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    sget-object v2, Lob/q0;->a:Lob/q0;

    const-string v4, "measurement.app_uninstalled_additional_ad_id_cache_time"

    invoke-static {v4, v1, v1, v2, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v2

    sput-object v2, Lob/e5;->c:Lob/d5;

    const-wide/32 v4, 0x5265c00

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    sget-object v4, Lob/i1;->a:Lob/i1;

    const-string v5, "measurement.monitoring.sample_period_millis"

    invoke-static {v5, v2, v2, v4, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v4

    sput-object v4, Lob/e5;->d:Lob/d5;

    sget-object v4, Lob/t1;->a:Lob/t1;

    const-string v5, "measurement.config.cache_time"

    invoke-static {v5, v2, v1, v4, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v4

    sput-object v4, Lob/e5;->e:Lob/d5;

    sget-object v4, Lob/f2;->a:Lob/f2;

    const-string v5, "measurement.config.url_scheme"

    const-string v6, "https"

    invoke-static {v5, v6, v6, v4, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v4

    sput-object v4, Lob/e5;->f:Lob/d5;

    sget-object v4, Lob/q2;->a:Lob/q2;

    const-string v5, "measurement.config.url_authority"

    const-string v7, "app-measurement.com"

    invoke-static {v5, v7, v7, v4, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v4

    sput-object v4, Lob/e5;->g:Lob/d5;

    const/16 v4, 0x64

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget-object v5, Lob/b3;->a:Lob/b3;

    const-string v7, "measurement.upload.max_bundles"

    invoke-static {v7, v4, v4, v5, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v5

    sput-object v5, Lob/e5;->h:Lob/d5;

    const/high16 v5, 0x10000

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    sget-object v7, Lob/n3;->a:Lob/n3;

    const-string v8, "measurement.upload.max_batch_size"

    invoke-static {v8, v5, v5, v7, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v7

    sput-object v7, Lob/e5;->i:Lob/d5;

    sget-object v7, Lob/y3;->a:Lob/y3;

    const-string v8, "measurement.upload.max_bundle_size"

    invoke-static {v8, v5, v5, v7, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v5

    sput-object v5, Lob/e5;->j:Lob/d5;

    const/16 v5, 0x3e8

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    sget-object v7, Lob/k4;->a:Lob/k4;

    const-string v8, "measurement.upload.max_events_per_bundle"

    invoke-static {v8, v5, v5, v7, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v7

    sput-object v7, Lob/e5;->k:Lob/d5;

    const v7, 0x186a0

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    sget-object v8, Lob/v4;->a:Lob/v4;

    const-string v9, "measurement.upload.max_events_per_day"

    invoke-static {v9, v7, v7, v8, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v8

    sput-object v8, Lob/e5;->l:Lob/d5;

    sget-object v8, Lob/x0;->a:Lob/x0;

    const-string v9, "measurement.upload.max_error_events_per_day"

    invoke-static {v9, v5, v5, v8, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v8

    sput-object v8, Lob/e5;->m:Lob/d5;

    const v8, 0xc350

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    sget-object v9, Lob/y0;->a:Lob/y0;

    const-string v10, "measurement.upload.max_public_events_per_day"

    invoke-static {v10, v8, v8, v9, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v8

    sput-object v8, Lob/e5;->n:Lob/d5;

    const/16 v8, 0x2710

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    sget-object v9, Lob/z0;->a:Lob/z0;

    const-string v10, "measurement.upload.max_conversions_per_day"

    invoke-static {v10, v8, v8, v9, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v8

    sput-object v8, Lob/e5;->o:Lob/d5;

    const/16 v8, 0xa

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    sget-object v9, Lob/a1;->a:Lob/a1;

    const-string v10, "measurement.upload.max_realtime_events_per_day"

    invoke-static {v10, v8, v8, v9, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v9

    sput-object v9, Lob/e5;->p:Lob/d5;

    sget-object v9, Lob/b1;->a:Lob/b1;

    const-string v10, "measurement.store.max_stored_events_per_app"

    invoke-static {v10, v7, v7, v9, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v7

    sput-object v7, Lob/e5;->q:Lob/d5;

    sget-object v7, Lob/d1;->a:Lob/d1;

    const-string v9, "measurement.upload.url"

    const-string v10, "https://app-measurement.com/a"

    invoke-static {v9, v10, v10, v7, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v7

    sput-object v7, Lob/e5;->r:Lob/d5;

    sget-object v7, Lob/e1;->a:Lob/e1;

    const-string v9, "measurement.sgtm.google_signal.url"

    const-string v10, "https://app-measurement.com/s/d"

    invoke-static {v9, v10, v10, v7, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v7

    sput-object v7, Lob/e5;->s:Lob/d5;

    sget-object v7, Lob/f1;->a:Lob/f1;

    const-string v9, "measurement.sgtm.service_upload_apps_list"

    const-string v10, ""

    invoke-static {v9, v10, v10, v7, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v7

    sput-object v7, Lob/e5;->t:Lob/d5;

    sget-object v7, Lob/g1;->a:Lob/g1;

    const-string v9, "measurement.sgtm.upload.backoff_http_codes"

    const-string v11, "404,429,503,504"

    invoke-static {v9, v11, v11, v7, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v7

    sput-object v7, Lob/e5;->u:Lob/d5;

    const-wide/32 v11, 0x927c0

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    sget-object v9, Lob/h1;->a:Lob/h1;

    const-string v11, "measurement.sgtm.upload.retry_interval"

    invoke-static {v11, v7, v7, v9, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v9

    sput-object v9, Lob/e5;->v:Lob/d5;

    const-wide/32 v11, 0x1499700

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    sget-object v11, Lob/j1;->a:Lob/j1;

    const-string v12, "measurement.sgtm.upload.retry_max_wait"

    invoke-static {v12, v9, v9, v11, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v11

    sput-object v11, Lob/e5;->w:Lob/d5;

    const-wide/32 v11, 0x1b7740

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    sget-object v12, Lob/k1;->a:Lob/k1;

    const-string v13, "measurement.sgtm.batch.retry_interval"

    invoke-static {v13, v11, v11, v12, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v12

    sput-object v12, Lob/e5;->x:Lob/d5;

    sget-object v12, Lob/l1;->a:Lob/l1;

    const-string v13, "measurement.sgtm.batch.retry_max_wait"

    invoke-static {v13, v9, v9, v12, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v9

    sput-object v9, Lob/e5;->y:Lob/d5;

    sget-object v9, Lob/m1;->a:Lob/m1;

    const-string v12, "measurement.sgtm.batch.retry_max_count"

    invoke-static {v12, v8, v8, v9, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v8

    sput-object v8, Lob/e5;->z:Lob/d5;

    const/16 v8, 0x1388

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    sget-object v9, Lob/n1;->a:Lob/n1;

    const-string v12, "measurement.sgtm.upload.max_queued_batches"

    invoke-static {v12, v8, v8, v9, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v8

    sput-object v8, Lob/e5;->A:Lob/d5;

    const/4 v8, 0x5

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    sget-object v9, Lob/o1;->a:Lob/o1;

    const-string v12, "measurement.sgtm.upload.batches_retrieval_limit"

    invoke-static {v12, v8, v8, v9, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v8

    sput-object v8, Lob/e5;->B:Lob/d5;

    const-wide/16 v8, 0x1388

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    sget-object v9, Lob/p1;->a:Lob/p1;

    const-string v12, "measurement.sgtm.upload.min_delay_after_startup"

    invoke-static {v12, v8, v8, v9, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v9

    sput-object v9, Lob/e5;->C:Lob/d5;

    const-wide/16 v12, 0x3e8

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    sget-object v12, Lob/q1;->a:Lob/q1;

    const-string v13, "measurement.sgtm.upload.min_delay_after_broadcast"

    invoke-static {v13, v9, v9, v12, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v12

    sput-object v12, Lob/e5;->D:Lob/d5;

    sget-object v12, Lob/r1;->a:Lob/r1;

    const-string v13, "measurement.sgtm.upload.min_delay_after_background"

    invoke-static {v13, v7, v7, v12, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v7

    sput-object v7, Lob/e5;->E:Lob/d5;

    const-wide/32 v12, 0xdbba00

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    sget-object v12, Lob/s1;->a:Lob/s1;

    const-string v13, "measurement.sgtm.batch.long_queuing_threshold"

    invoke-static {v13, v7, v7, v12, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v7

    sput-object v7, Lob/e5;->F:Lob/d5;

    const-wide/32 v12, 0x2932e00

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    sget-object v12, Lob/u1;->a:Lob/u1;

    const-string v13, "measurement.upload.backoff_period"

    invoke-static {v13, v7, v7, v12, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v7

    sput-object v7, Lob/e5;->G:Lob/d5;

    sget-object v7, Lob/v1;->a:Lob/v1;

    const-string v12, "measurement.upload.window_interval"

    invoke-static {v12, v1, v1, v7, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v7

    sput-object v7, Lob/e5;->H:Lob/d5;

    sget-object v7, Lob/w1;->a:Lob/w1;

    const-string v12, "measurement.upload.interval"

    invoke-static {v12, v1, v1, v7, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v7

    sput-object v7, Lob/e5;->I:Lob/d5;

    sget-object v7, Lob/x1;->a:Lob/x1;

    const-string v12, "measurement.upload.realtime_upload_interval"

    invoke-static {v12, v0, v0, v7, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v0

    sput-object v0, Lob/e5;->J:Lob/d5;

    sget-object v0, Lob/y1;->a:Lob/y1;

    const-string v7, "measurement.upload.debug_upload_interval"

    invoke-static {v7, v9, v9, v0, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v0

    sput-object v0, Lob/e5;->K:Lob/d5;

    const-wide/16 v12, 0x1f4

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sget-object v7, Lob/z1;->a:Lob/z1;

    const-string v12, "measurement.upload.minimum_delay"

    invoke-static {v12, v0, v0, v7, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v0

    sput-object v0, Lob/e5;->L:Lob/d5;

    const-wide/32 v12, 0xea60

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sget-object v7, Lob/a2;->a:Lob/a2;

    const-string v12, "measurement.alarm_manager.minimum_interval"

    invoke-static {v12, v0, v0, v7, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v0

    sput-object v0, Lob/e5;->M:Lob/d5;

    sget-object v0, Lob/b2;->a:Lob/b2;

    const-string v7, "measurement.upload.stale_data_deletion_interval"

    invoke-static {v7, v2, v2, v0, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v0

    sput-object v0, Lob/e5;->N:Lob/d5;

    const-wide/32 v12, 0x240c8400

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sget-object v2, Lob/c2;->a:Lob/c2;

    const-string v7, "measurement.upload.refresh_blacklisted_config_interval"

    invoke-static {v7, v0, v0, v2, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v2

    sput-object v2, Lob/e5;->O:Lob/d5;

    const-wide/16 v12, 0x3a98

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    sget-object v7, Lob/e2;->a:Lob/e2;

    const-string v12, "measurement.upload.initial_upload_delay_time"

    invoke-static {v12, v2, v2, v7, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v2

    sput-object v2, Lob/e5;->P:Lob/d5;

    sget-object v2, Lob/g2;->a:Lob/g2;

    const-string v7, "measurement.upload.retry_time"

    invoke-static {v7, v11, v11, v2, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v2

    sput-object v2, Lob/e5;->Q:Lob/d5;

    const/4 v2, 0x6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    sget-object v7, Lob/h2;->a:Lob/h2;

    const-string v11, "measurement.upload.retry_count"

    invoke-static {v11, v2, v2, v7, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v2

    sput-object v2, Lob/e5;->R:Lob/d5;

    const-wide/32 v11, 0x1ee62800

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    sget-object v7, Lob/i2;->a:Lob/i2;

    const-string v11, "measurement.upload.max_queue_time"

    invoke-static {v11, v2, v2, v7, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v2

    sput-object v2, Lob/e5;->S:Lob/d5;

    const-wide/32 v11, 0x493e0

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    sget-object v7, Lob/j2;->a:Lob/j2;

    const-string v11, "measurement.upload.google_signal_max_queue_time"

    invoke-static {v11, v2, v2, v7, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v2

    sput-object v2, Lob/e5;->T:Lob/d5;

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    sget-object v7, Lob/k2;->a:Lob/k2;

    const-string v11, "measurement.lifetimevalue.max_currency_tracked"

    invoke-static {v11, v2, v2, v7, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v2

    sput-object v2, Lob/e5;->U:Lob/d5;

    const/16 v2, 0xc8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    sget-object v7, Lob/l2;->a:Lob/l2;

    const-string v11, "measurement.audience.filter_result_max_count"

    invoke-static {v11, v2, v2, v7, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v2

    sput-object v2, Lob/e5;->V:Lob/d5;

    const-string v2, "measurement.upload.max_public_user_properties"

    const/4 v7, 0x0

    invoke-static {v2, v4, v4, v7, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v2

    sput-object v2, Lob/e5;->W:Lob/d5;

    const/16 v2, 0x7d0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v11, "measurement.upload.max_event_name_cardinality"

    invoke-static {v11, v2, v2, v7, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v2

    sput-object v2, Lob/e5;->X:Lob/d5;

    const-string v2, "measurement.upload.max_public_event_params"

    invoke-static {v2, v4, v4, v7, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v2

    sput-object v2, Lob/e5;->Y:Lob/d5;

    sget-object v2, Lob/m2;->a:Lob/m2;

    const-string v11, "measurement.service_client.idle_disconnect_millis"

    invoke-static {v11, v8, v8, v2, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v2

    sput-object v2, Lob/e5;->Z:Lob/d5;

    sget-object v2, Lob/n2;->a:Lob/n2;

    const-string v8, "measurement.service_client.reconnect_millis"

    invoke-static {v8, v9, v9, v2, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v2

    sput-object v2, Lob/e5;->a0:Lob/d5;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget-object v8, Lob/o2;->a:Lob/o2;

    const-string v9, "measurement.test.boolean_flag"

    invoke-static {v9, v2, v2, v8, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v8

    sput-object v8, Lob/e5;->b0:Lob/d5;

    sget-object v8, Lob/p2;->a:Lob/p2;

    const-string v9, "measurement.test.string_flag"

    const-string v11, "---"

    invoke-static {v9, v11, v11, v8, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v8

    sput-object v8, Lob/e5;->c0:Lob/d5;

    const-wide/16 v8, -0x1

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    sget-object v9, Lob/r2;->a:Lob/r2;

    const-string v11, "measurement.test.long_flag"

    invoke-static {v11, v8, v8, v9, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v9

    sput-object v9, Lob/e5;->d0:Lob/d5;

    sget-object v9, Lob/s2;->a:Lob/s2;

    const-string v11, "measurement.test.cached_long_flag"

    const/4 v12, 0x1

    invoke-static {v11, v8, v8, v9, v12}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    const/4 v8, -0x2

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    sget-object v9, Lob/t2;->a:Lob/t2;

    const-string v11, "measurement.test.int_flag"

    invoke-static {v11, v8, v8, v9, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v8

    sput-object v8, Lob/e5;->e0:Lob/d5;

    const-wide/high16 v8, -0x3ff8000000000000L    # -3.0

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v8

    sget-object v9, Lob/u2;->a:Lob/u2;

    const-string v11, "measurement.test.double_flag"

    invoke-static {v11, v8, v8, v9, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v8

    sput-object v8, Lob/e5;->f0:Lob/d5;

    const/16 v8, 0x32

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    sget-object v9, Lob/v2;->a:Lob/v2;

    const-string v11, "measurement.experiment.max_ids"

    invoke-static {v11, v8, v8, v9, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v8

    sput-object v8, Lob/e5;->g0:Lob/d5;

    const/16 v8, 0x1b

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    sget-object v9, Lob/w2;->a:Lob/w2;

    const-string v11, "measurement.upload.max_item_scoped_custom_parameters"

    invoke-static {v11, v8, v8, v9, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v8

    sput-object v8, Lob/e5;->h0:Lob/d5;

    const/16 v8, 0x1f4

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    sget-object v9, Lob/x2;->a:Lob/x2;

    const-string v11, "measurement.upload.max_event_parameter_value_length"

    invoke-static {v11, v8, v8, v9, v12}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v8

    sput-object v8, Lob/e5;->i0:Lob/d5;

    sget-object v8, Lob/y2;->a:Lob/y2;

    const-string v9, "measurement.max_bundles_per_iteration"

    invoke-static {v9, v4, v4, v8, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v4

    sput-object v4, Lob/e5;->j0:Lob/d5;

    sget-object v4, Lob/z2;->a:Lob/z2;

    const-string v8, "measurement.sdk.attribution.cache.ttl"

    invoke-static {v8, v0, v0, v4, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v0

    sput-object v0, Lob/e5;->k0:Lob/d5;

    const-wide/32 v8, 0x6ddd00

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sget-object v4, Lob/a3;->a:Lob/a3;

    const-string v8, "measurement.redaction.app_instance_id.ttl"

    invoke-static {v8, v0, v0, v4, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v0

    sput-object v0, Lob/e5;->l0:Lob/d5;

    const/4 v0, 0x7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v4, Lob/c3;->a:Lob/c3;

    const-string v8, "measurement.rb.attribution.client.min_ad_services_version"

    invoke-static {v8, v0, v0, v4, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v0

    sput-object v0, Lob/e5;->m0:Lob/d5;

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v4, Lob/d3;->a:Lob/d3;

    const-string v8, "measurement.dma_consent.max_daily_dcu_realtime_events"

    invoke-static {v8, v0, v0, v4, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v0

    sput-object v0, Lob/e5;->n0:Lob/d5;

    sget-object v0, Lob/f3;->a:Lob/f3;

    const-string v4, "measurement.rb.attribution.uri_scheme"

    invoke-static {v4, v6, v6, v0, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v0

    sput-object v0, Lob/e5;->o0:Lob/d5;

    sget-object v0, Lob/g3;->a:Lob/g3;

    const-string v4, "measurement.rb.attribution.uri_authority"

    const-string v6, "google-analytics.com"

    invoke-static {v4, v6, v6, v0, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v0

    sput-object v0, Lob/e5;->p0:Lob/d5;

    sget-object v0, Lob/h3;->a:Lob/h3;

    const-string v4, "measurement.rb.attribution.uri_path"

    const-string v6, "privacy-sandbox/register-app-conversion"

    invoke-static {v4, v6, v6, v0, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v0

    sput-object v0, Lob/e5;->q0:Lob/d5;

    sget-object v0, Lob/i3;->a:Lob/i3;

    const-string v4, "measurement.session.engagement_interval"

    invoke-static {v4, v1, v1, v0, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v0

    sput-object v0, Lob/e5;->r0:Lob/d5;

    sget-object v0, Lob/j3;->a:Lob/j3;

    const-string v1, "measurement.rb.attribution.app_allowlist"

    invoke-static {v1, v10, v10, v0, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v0

    sput-object v0, Lob/e5;->s0:Lob/d5;

    sget-object v0, Lob/k3;->a:Lob/k3;

    const-string v1, "measurement.rb.attribution.user_properties"

    const-string v4, "_npa,npa|_fot,fot"

    invoke-static {v1, v4, v4, v0, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v0

    sput-object v0, Lob/e5;->t0:Lob/d5;

    sget-object v0, Lob/l3;->a:Lob/l3;

    const-string v1, "measurement.rb.attribution.event_params"

    const-string v4, "value|currency"

    invoke-static {v1, v4, v4, v0, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v0

    sput-object v0, Lob/e5;->u0:Lob/d5;

    sget-object v0, Lob/m3;->a:Lob/m3;

    const-string v1, "measurement.rb.attribution.query_parameters_to_remove"

    invoke-static {v1, v10, v10, v0, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v0

    sput-object v0, Lob/e5;->v0:Lob/d5;

    const-wide/32 v0, 0x337f9800

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Lob/o3;->a:Lob/o3;

    const-string v4, "measurement.rb.attribution.max_queue_time"

    invoke-static {v4, v0, v0, v1, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v0

    sput-object v0, Lob/e5;->w0:Lob/d5;

    const/16 v0, 0x10

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Lob/p3;->a:Lob/p3;

    const-string v4, "measurement.rb.attribution.max_retry_delay_seconds"

    invoke-static {v4, v0, v0, v1, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v0

    sput-object v0, Lob/e5;->x0:Lob/d5;

    const/16 v0, 0x5a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Lob/q3;->a:Lob/q3;

    const-string v4, "measurement.rb.attribution.client.min_time_after_boot_seconds"

    invoke-static {v4, v0, v0, v1, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v0

    sput-object v0, Lob/e5;->y0:Lob/d5;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Lob/r3;->a:Lob/r3;

    const-string v4, "measurement.rb.attribution.max_trigger_uris_queried_at_once"

    invoke-static {v4, v0, v0, v1, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    sget-object v0, Lob/s3;->a:Lob/s3;

    const-string v1, "measurement.rb.max_trigger_registrations_per_day"

    invoke-static {v1, v5, v5, v0, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v0

    sput-object v0, Lob/e5;->z0:Lob/d5;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v1, Lob/t3;->a:Lob/t3;

    const-string v4, "measurement.config.bundle_for_all_apps_on_backgrounded"

    invoke-static {v4, v0, v0, v1, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v1

    sput-object v1, Lob/e5;->A0:Lob/d5;

    sget-object v1, Lob/u3;->a:Lob/u3;

    const-string v4, "measurement.config.notify_trigger_uris_on_backgrounded"

    invoke-static {v4, v0, v0, v1, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v1

    sput-object v1, Lob/e5;->B0:Lob/d5;

    const/16 v1, 0xbb8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v4, Lob/v3;->a:Lob/v3;

    const-string v5, "measurement.rb.attribution.notify_app_delay_millis"

    invoke-static {v5, v1, v1, v4, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v1

    sput-object v1, Lob/e5;->C0:Lob/d5;

    const-string v1, "measurement.quality.checksum"

    invoke-static {v1, v2, v2, v7, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v1

    sput-object v1, Lob/e5;->D0:Lob/d5;

    sget-object v1, Lob/w3;->a:Lob/w3;

    const-string v4, "measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters"

    invoke-static {v4, v2, v2, v1, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v1

    sput-object v1, Lob/e5;->E0:Lob/d5;

    sget-object v1, Lob/x3;->a:Lob/x3;

    const-string v4, "measurement.audience.refresh_event_count_filters_timestamp"

    invoke-static {v4, v2, v2, v1, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v1

    sput-object v1, Lob/e5;->F0:Lob/d5;

    sget-object v1, Lob/z3;->a:Lob/z3;

    const-string v4, "measurement.audience.use_bundle_timestamp_for_event_count_filters"

    invoke-static {v4, v2, v2, v1, v12}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v1

    sput-object v1, Lob/e5;->G0:Lob/d5;

    sget-object v1, Lob/a4;->a:Lob/a4;

    const-string v4, "measurement.sdk.collection.last_deep_link_referrer_campaign2"

    invoke-static {v4, v2, v2, v1, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v1

    sput-object v1, Lob/e5;->H0:Lob/d5;

    sget-object v1, Lob/b4;->a:Lob/b4;

    const-string v4, "measurement.integration.disable_firebase_instance_id"

    invoke-static {v4, v2, v2, v1, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v1

    sput-object v1, Lob/e5;->I0:Lob/d5;

    sget-object v1, Lob/c4;->a:Lob/c4;

    const-string v4, "measurement.collection.service.update_with_analytics_fix"

    invoke-static {v4, v2, v2, v1, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v1

    sput-object v1, Lob/e5;->J0:Lob/d5;

    const v1, 0x31b50

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v4, Lob/d4;->a:Lob/d4;

    const-string v5, "measurement.service.storage_consent_support_version"

    invoke-static {v5, v1, v1, v4, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v1

    sput-object v1, Lob/e5;->K0:Lob/d5;

    sget-object v1, Lob/e4;->a:Lob/e4;

    const-string v4, "measurement.service.store_null_safelist"

    invoke-static {v4, v0, v0, v1, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v1

    sput-object v1, Lob/e5;->L0:Lob/d5;

    sget-object v1, Lob/g4;->a:Lob/g4;

    const-string v4, "measurement.service.store_safelist"

    invoke-static {v4, v0, v0, v1, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v1

    sput-object v1, Lob/e5;->M0:Lob/d5;

    sget-object v1, Lob/h4;->a:Lob/h4;

    const-string v4, "measurement.session_stitching_token_enabled"

    invoke-static {v4, v2, v2, v1, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v1

    sput-object v1, Lob/e5;->N0:Lob/d5;

    sget-object v1, Lob/i4;->a:Lob/i4;

    const-string v4, "measurement.sgtm.client.upload_on_backgrounded.dev"

    invoke-static {v4, v2, v2, v1, v12}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v1

    sput-object v1, Lob/e5;->O0:Lob/d5;

    sget-object v1, Lob/z4;->a:Lob/z4;

    const-string v4, "measurement.gmscore_client_telemetry"

    invoke-static {v4, v2, v2, v1, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v1

    sput-object v1, Lob/e5;->P0:Lob/d5;

    sget-object v1, Lob/j4;->a:Lob/j4;

    const-string v4, "measurement.rb.attribution.service"

    invoke-static {v4, v0, v0, v1, v12}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v1

    sput-object v1, Lob/e5;->Q0:Lob/d5;

    sget-object v1, Lob/l4;->a:Lob/l4;

    const-string v4, "measurement.rb.attribution.client2"

    invoke-static {v4, v0, v0, v1, v12}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v1

    sput-object v1, Lob/e5;->R0:Lob/d5;

    sget-object v1, Lob/m4;->a:Lob/m4;

    const-string v4, "measurement.rb.attribution.uuid_generation"

    invoke-static {v4, v0, v0, v1, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v1

    sput-object v1, Lob/e5;->S0:Lob/d5;

    sget-object v1, Lob/n4;->a:Lob/n4;

    const-string v4, "measurement.rb.attribution.enable_trigger_redaction"

    invoke-static {v4, v0, v0, v1, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v1

    sput-object v1, Lob/e5;->T0:Lob/d5;

    sget-object v1, Lob/o4;->a:Lob/o4;

    const-string v4, "measurement.rb.attribution.followup1.service"

    invoke-static {v4, v2, v2, v1, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    sget-object v1, Lob/p4;->a:Lob/p4;

    const-string v4, "measurement.rb.attribution.retry_disposition"

    invoke-static {v4, v2, v2, v1, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v1

    sput-object v1, Lob/e5;->U0:Lob/d5;

    sget-object v1, Lob/c5;->a:Lob/c5;

    const-string v4, "measurement.client.sessions.enable_fix_background_engagement"

    invoke-static {v4, v2, v2, v1, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v1

    sput-object v1, Lob/e5;->V0:Lob/d5;

    sget-object v1, Lob/q4;->a:Lob/q4;

    const-string v4, "measurement.set_default_event_parameters_propagate_clear.service.dev"

    invoke-static {v4, v0, v0, v1, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v1

    sput-object v1, Lob/e5;->W0:Lob/d5;

    sget-object v1, Lob/r4;->a:Lob/r4;

    const-string v4, "measurement.set_default_event_parameters_propagate_clear.client.dev"

    invoke-static {v4, v0, v0, v1, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v1

    sput-object v1, Lob/e5;->X0:Lob/d5;

    sget-object v1, Lob/s4;->a:Lob/s4;

    const-string v4, "measurement.service.ad_impression.convert_value_to_double"

    invoke-static {v4, v0, v0, v1, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v1

    sput-object v1, Lob/e5;->Y0:Lob/d5;

    sget-object v1, Lob/t4;->a:Lob/t4;

    const-string v4, "measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once"

    invoke-static {v4, v0, v0, v1, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    sget-object v1, Lob/u4;->a:Lob/u4;

    const-string v4, "measurement.remove_conflicting_first_party_apis.dev"

    invoke-static {v4, v2, v2, v1, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    sget-object v1, Lob/r0;->a:Lob/r0;

    const-string v4, "measurement.rb.attribution.service.trigger_uris_high_priority"

    invoke-static {v4, v0, v0, v1, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v1

    sput-object v1, Lob/e5;->Z0:Lob/d5;

    sget-object v1, Lob/s0;->a:Lob/s0;

    const-string v4, "measurement.tcf.consent_fix"

    invoke-static {v4, v0, v0, v1, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v1

    sput-object v1, Lob/e5;->a1:Lob/d5;

    sget-object v1, Lob/t0;->a:Lob/t0;

    const-string v4, "measurement.experiment.enable_phenotype_experiment_reporting"

    invoke-static {v4, v0, v0, v1, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v1

    sput-object v1, Lob/e5;->b1:Lob/d5;

    sget-object v1, Lob/l0;->a:Lob/l0;

    const-string v4, "measurement.set_default_event_parameters.fix_service_request_ordering"

    invoke-static {v4, v2, v2, v1, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v1

    sput-object v1, Lob/e5;->c1:Lob/d5;

    sget-object v1, Lob/k0;->a:Lob/k0;

    const-string v4, "measurement.set_default_event_parameters.fix_app_update_logging"

    invoke-static {v4, v0, v0, v1, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v1

    sput-object v1, Lob/e5;->d1:Lob/d5;

    sget-object v1, Lob/o0;->a:Lob/o0;

    const-string v4, "measurement.service.fix_stop_bundling_bug"

    invoke-static {v4, v0, v0, v1, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v1

    sput-object v1, Lob/e5;->e1:Lob/d5;

    sget-object v1, Lob/n0;->a:Lob/n0;

    const-string v4, "measurement.fix_params_logcat_spam"

    invoke-static {v4, v0, v0, v1, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v0

    sput-object v0, Lob/e5;->f1:Lob/d5;

    sget-object v0, Lob/y4;->a:Lob/y4;

    const-string v1, "measurement.gbraid_campaign.stop_lgclid"

    invoke-static {v1, v2, v2, v0, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v0

    sput-object v0, Lob/e5;->g1:Lob/d5;

    sget-object v0, Lob/u0;->a:Lob/u0;

    const-string v1, "measurement.gbraid_compaign.compaign_params_triggering_info_update"

    const-string v4, "gclid,gbraid,gad_campaignid"

    invoke-static {v1, v4, v4, v0, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v0

    sput-object v0, Lob/e5;->h1:Lob/d5;

    sget-object v0, Lob/m0;->a:Lob/m0;

    const-string v1, "measurement.edpb.service"

    invoke-static {v1, v2, v2, v0, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v0

    sput-object v0, Lob/e5;->i1:Lob/d5;

    sget-object v0, Lob/v0;->a:Lob/v0;

    const-string v1, "measurement.edpb.events_cached_in_no_data_mode"

    const-string v4, "_f,_v,_cmp"

    invoke-static {v1, v4, v4, v0, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v0

    sput-object v0, Lob/e5;->j1:Lob/d5;

    sget-object v0, Lob/b5;->a:Lob/b5;

    const-string v1, "measurement.add_first_launch_logging_timestamp.service"

    invoke-static {v1, v2, v2, v0, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v0

    sput-object v0, Lob/e5;->k1:Lob/d5;

    sget-object v0, Lob/w0;->a:Lob/w0;

    const-string v1, "measurement.overlapping_bundles_fix"

    invoke-static {v1, v2, v2, v0, v3}, Lob/e5;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;

    move-result-object v0

    sput-object v0, Lob/e5;->l1:Lob/d5;

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;Z)Lob/d5;
    .locals 6

    new-instance v0, Lob/d5;

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lob/d5;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lob/p0;[B)V

    if-eqz p4, :cond_0

    sget-object p0, Lob/e5;->a:Ljava/util/List;

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object v0
.end method

.method public static synthetic b()Ljava/util/List;
    .locals 1

    sget-object v0, Lob/e5;->a:Ljava/util/List;

    return-object v0
.end method
