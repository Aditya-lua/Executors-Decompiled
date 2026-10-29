package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a0 */
/* JADX INFO: loaded from: classes.dex */
public class C0823a0 extends IOException {

    /* JADX INFO: renamed from: a */
    public InterfaceC0874r0 f2811a;

    /* JADX INFO: renamed from: b */
    public boolean f2812b;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a0$a */
    public static class a extends C0823a0 {
        public a(String str) {
            super(str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0823a0(String str) {
        super(str);
        this.f2811a = null;
    }

    /* JADX INFO: renamed from: b */
    public static C0823a0 m3339b() {
        return new C0823a0("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: renamed from: c */
    public static C0823a0 m3340c() {
        return new C0823a0("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: renamed from: d */
    public static C0823a0 m3341d() {
        return new C0823a0("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: renamed from: e */
    public static a m3342e() {
        return new a("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: renamed from: f */
    public static C0823a0 m3343f() {
        return new C0823a0("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: g */
    public static C0823a0 m3344g() {
        return new C0823a0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: renamed from: h */
    public static C0823a0 m3345h() {
        return new C0823a0("Failed to parse the message.");
    }

    /* JADX INFO: renamed from: i */
    public static C0823a0 m3346i() {
        return new C0823a0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    /* JADX INFO: renamed from: l */
    public static C0823a0 m3347l() {
        return new C0823a0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* JADX INFO: renamed from: m */
    public static C0823a0 m3348m() {
        return new C0823a0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: renamed from: a */
    public boolean m3349a() {
        return this.f2812b;
    }

    /* JADX INFO: renamed from: j */
    public void m3350j() {
        this.f2812b = true;
    }

    /* JADX INFO: renamed from: k */
    public C0823a0 m3351k(InterfaceC0874r0 interfaceC0874r0) {
        this.f2811a = interfaceC0874r0;
        return this;
    }

    public C0823a0(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f2811a = null;
    }
}
