package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class b0 extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s0 f8394a;
    public boolean b;

    public static class a extends b0 {
        public a(String str) {
            super(str);
        }
    }

    public b0(String str) {
        super(str);
        this.f8394a = null;
    }

    public static b0 b() {
        return new b0("Protocol message end-group tag did not match expected tag.");
    }

    public static b0 c() {
        return new b0("Protocol message contained an invalid tag (zero).");
    }

    public static b0 d() {
        return new b0("Protocol message had invalid UTF-8.");
    }

    public static a e() {
        return new a("Protocol message tag had invalid wire type.");
    }

    public static b0 f() {
        return new b0("CodedInputStream encountered a malformed varint.");
    }

    public static b0 g() {
        return new b0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static b0 h() {
        return new b0("Failed to parse the message.");
    }

    public static b0 i() {
        return new b0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public static b0 l() {
        return new b0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static b0 m() {
        return new b0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public boolean a() {
        return this.b;
    }

    public void j() {
        this.b = true;
    }

    public b0 k(s0 s0Var) {
        this.f8394a = s0Var;
        return this;
    }

    public b0(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f8394a = null;
    }
}
