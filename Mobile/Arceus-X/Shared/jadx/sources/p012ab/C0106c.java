package p012ab;

import com.google.android.gms.common.Feature;

/* JADX INFO: renamed from: ab.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0106c {

    /* JADX INFO: renamed from: a */
    public static final Feature f364a;

    /* JADX INFO: renamed from: b */
    public static final Feature f365b;

    /* JADX INFO: renamed from: c */
    public static final Feature f366c;

    /* JADX INFO: renamed from: d */
    public static final Feature f367d;

    /* JADX INFO: renamed from: e */
    public static final Feature f368e;

    /* JADX INFO: renamed from: f */
    public static final Feature f369f;

    /* JADX INFO: renamed from: g */
    public static final Feature f370g;

    /* JADX INFO: renamed from: h */
    public static final Feature f371h;

    /* JADX INFO: renamed from: i */
    public static final Feature f372i;

    /* JADX INFO: renamed from: j */
    public static final Feature f373j;

    /* JADX INFO: renamed from: k */
    public static final Feature f374k;

    /* JADX INFO: renamed from: l */
    public static final Feature[] f375l;

    static {
        Feature feature = new Feature("auth_blockstore", 3L);
        f364a = feature;
        Feature feature2 = new Feature("blockstore_data_transfer", 1L);
        f365b = feature2;
        Feature feature3 = new Feature("blockstore_notify_app_restore", 1L);
        f366c = feature3;
        Feature feature4 = new Feature("blockstore_store_bytes_with_options", 2L);
        f367d = feature4;
        Feature feature5 = new Feature("blockstore_is_end_to_end_encryption_available", 1L);
        f368e = feature5;
        Feature feature6 = new Feature("blockstore_enable_cloud_backup", 1L);
        f369f = feature6;
        Feature feature7 = new Feature("blockstore_delete_bytes", 2L);
        f370g = feature7;
        Feature feature8 = new Feature("blockstore_retrieve_bytes_with_options", 3L);
        f371h = feature8;
        Feature feature9 = new Feature("auth_clear_restore_credential", 1L);
        f372i = feature9;
        Feature feature10 = new Feature("auth_create_restore_credential", 1L);
        f373j = feature10;
        Feature feature11 = new Feature("auth_get_restore_credential", 1L);
        f374k = feature11;
        f375l = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7, feature8, feature9, feature10, feature11};
    }
}
