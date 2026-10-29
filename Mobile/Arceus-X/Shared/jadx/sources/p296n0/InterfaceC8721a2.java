package p296n0;

import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: n0.a2 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC8721a2 {

    /* JADX INFO: renamed from: n0.a2$a */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public static a m34979a(int i10, String str, int i11, int i12, int i13, int i14) {
            return new C8778k(i10, str, i11, i12, i13, i14);
        }

        /* JADX INFO: renamed from: b */
        public abstract int mo34980b();

        /* JADX INFO: renamed from: c */
        public abstract int mo34981c();

        /* JADX INFO: renamed from: d */
        public abstract int mo34982d();

        /* JADX INFO: renamed from: e */
        public abstract String mo34983e();

        /* JADX INFO: renamed from: f */
        public abstract int mo34984f();

        /* JADX INFO: renamed from: g */
        public abstract int mo34985g();
    }

    /* JADX INFO: renamed from: n0.a2$b */
    public static abstract class b implements InterfaceC8721a2 {
        /* JADX INFO: renamed from: h */
        public static b m34986h(int i10, int i11, List<a> list, List<c> list2) {
            return new C8783l(i10, i11, Collections.unmodifiableList(new ArrayList(list)), Collections.unmodifiableList(new ArrayList(list2)));
        }
    }

    /* JADX INFO: renamed from: n0.a2$c */
    public static abstract class c {
        /* JADX INFO: renamed from: a */
        public static c m34987a(int i10, String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            return new C8788m(i10, str, i11, i12, i13, i14, i15, i16, i17, i18);
        }

        /* JADX INFO: renamed from: b */
        public abstract int mo34988b();

        /* JADX INFO: renamed from: c */
        public abstract int mo34989c();

        /* JADX INFO: renamed from: d */
        public abstract int mo34990d();

        /* JADX INFO: renamed from: e */
        public abstract int mo34991e();

        /* JADX INFO: renamed from: f */
        public abstract int mo34992f();

        /* JADX INFO: renamed from: g */
        public abstract int mo34993g();

        /* JADX INFO: renamed from: h */
        public abstract int mo34994h();

        /* JADX INFO: renamed from: i */
        public abstract String mo34995i();

        /* JADX INFO: renamed from: j */
        public abstract int mo34996j();

        /* JADX INFO: renamed from: k */
        public Size m34997k() {
            return new Size(mo34998l(), mo34994h());
        }

        /* JADX INFO: renamed from: l */
        public abstract int mo34998l();
    }

    /* JADX INFO: renamed from: c */
    static int m34976c(int i10) {
        if (i10 == 3) {
            return 2;
        }
        if (i10 != 4) {
            return i10 != 5 ? -1 : 39;
        }
        return 5;
    }

    /* JADX INFO: renamed from: d */
    static String m34977d(int i10) {
        switch (i10) {
            case 1:
                return "video/3gpp";
            case 2:
                return "video/avc";
            case 3:
                return "video/mp4v-es";
            case 4:
                return "video/x-vnd.on2.vp8";
            case 5:
                return "video/hevc";
            case 6:
                return "video/x-vnd.on2.vp9";
            case 7:
                return "video/dolby-vision";
            case 8:
                return "video/av01";
            default:
                return "video/none";
        }
    }

    /* JADX INFO: renamed from: g */
    static String m34978g(int i10) {
        switch (i10) {
            case 1:
                return "audio/3gpp";
            case 2:
                return "audio/amr-wb";
            case 3:
            case 4:
            case 5:
                return "audio/mp4a-latm";
            case 6:
                return "audio/vorbis";
            case 7:
                return "audio/opus";
            default:
                return "audio/none";
        }
    }

    /* JADX INFO: renamed from: a */
    int mo27489a();

    /* JADX INFO: renamed from: b */
    List<c> mo27490b();

    /* JADX INFO: renamed from: e */
    int mo27491e();

    /* JADX INFO: renamed from: f */
    List<a> mo27492f();
}
