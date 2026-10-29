package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.b0 */
/* JADX INFO: loaded from: classes2.dex */
public class C2903b0 extends IOException {

    /* JADX INFO: renamed from: a */
    public InterfaceC2954s0 f10801a;

    /* JADX INFO: renamed from: b */
    public boolean f10802b;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.b0$a */
    public static class a extends C2903b0 {
        public a(String str) {
            super(str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2903b0(String str) {
        super(str);
        this.f10801a = null;
    }

    /* JADX INFO: renamed from: b */
    public static C2903b0 m13397b() {
        return new C2903b0("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: renamed from: c */
    public static C2903b0 m13398c() {
        return new C2903b0("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: renamed from: d */
    public static C2903b0 m13399d() {
        return new C2903b0("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: renamed from: e */
    public static a m13400e() {
        return new a("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: renamed from: f */
    public static C2903b0 m13401f() {
        return new C2903b0("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: g */
    public static C2903b0 m13402g() {
        return new C2903b0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: renamed from: h */
    public static C2903b0 m13403h() {
        return new C2903b0("Failed to parse the message.");
    }

    /* JADX INFO: renamed from: i */
    public static C2903b0 m13404i() {
        return new C2903b0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    /* JADX INFO: renamed from: l */
    public static C2903b0 m13405l() {
        return new C2903b0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* JADX INFO: renamed from: m */
    public static C2903b0 m13406m() {
        return new C2903b0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: renamed from: a */
    public boolean m13407a() {
        return this.f10802b;
    }

    /* JADX INFO: renamed from: j */
    public void m13408j() {
        this.f10802b = true;
    }

    /* JADX INFO: renamed from: k */
    public C2903b0 m13409k(InterfaceC2954s0 interfaceC2954s0) {
        this.f10801a = interfaceC2954s0;
        return this;
    }

    public C2903b0(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f10801a = null;
    }
}
