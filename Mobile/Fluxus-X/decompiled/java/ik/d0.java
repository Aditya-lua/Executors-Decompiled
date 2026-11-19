package ik;

import android.os.SystemClock;
import android.util.Pair;
import com.roblox.universalapp.logging.LoggingProtocol;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes2.dex */
public class d0 extends mv.s {
    public ConcurrentLinkedQueue<Pair<String, Long>> b = new ConcurrentLinkedQueue<>();

    public void a() {
        this.b.add(new Pair<>("cacheConditionalHit", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    public void b() {
        this.b.add(new Pair<>("cacheHit", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    public void c() {
        this.b.add(new Pair<>("cacheMiss", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // mv.s
    public void callEnd(mv.e eVar) {
        this.b.add(new Pair<>("callEnd", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // mv.s
    public void callStart(mv.e eVar) {
        this.b.add(new Pair<>("callStart", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // mv.s
    public void connectEnd(mv.e eVar, InetSocketAddress inetSocketAddress, Proxy proxy, mv.e0 e0Var) {
        this.b.add(new Pair<>("connectEnd", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // mv.s
    public void connectStart(mv.e eVar, InetSocketAddress inetSocketAddress, Proxy proxy) {
        this.b.add(new Pair<>("connectStart", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // mv.s
    public void connectionAcquired(mv.e eVar, mv.k kVar) {
        this.b.add(new Pair<>("connectionAcquired", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // mv.s
    public void connectionReleased(mv.e eVar, mv.k kVar) {
        this.b.add(new Pair<>("connectionReleased", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    public void d() {
        this.b.add(new Pair<>("cdnAkamaiResponse", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // mv.s
    public void dnsEnd(mv.e eVar, String str, List<InetAddress> list) {
        this.b.add(new Pair<>("dnsEnd", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // mv.s
    public void dnsStart(mv.e eVar, String str) {
        this.b.add(new Pair<>("dnsStart", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    public void e() {
        this.b.add(new Pair<>("cdnCacheHit", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    public void f() {
        this.b.add(new Pair<>("cdnCacheMiss", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    public void g() {
        this.b.add(new Pair<>("cdnCacheRefreshHit", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    public void h() {
        this.b.add(new Pair<>("cdnCloudFrontResponse", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    public void i() {
        this.b.clear();
    }

    public void j() {
        Iterator<Pair<String, Long>> it = this.b.iterator();
        while (it.hasNext()) {
            k(it.next());
        }
        i();
    }

    public void k(Pair<String, Long> pair) {
        LoggingProtocol.l((String) pair.first, (Long) pair.second);
    }

    public void l() {
        this.b.add(new Pair<>("responseBodyDictCompressed", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    public void m() {
        this.b.add(new Pair<>("responseBodyZstdCompressed", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    public void n() {
        this.b.add(new Pair<>("tlsPreWarmWaitBegin", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    public void o() {
        this.b.add(new Pair<>("tlsPreWarmWaitEnd", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // mv.s
    public void requestBodyEnd(mv.e eVar, long j10) {
        this.b.add(new Pair<>("requestBodyEnd", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // mv.s
    public void requestBodyStart(mv.e eVar) {
        this.b.add(new Pair<>("requestBodyStart", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // mv.s
    public void requestHeadersEnd(mv.e eVar, mv.f0 f0Var) {
        this.b.add(new Pair<>("requestHeadersEnd", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // mv.s
    public void requestHeadersStart(mv.e eVar) {
        this.b.add(new Pair<>("requestHeadersStart", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // mv.s
    public void responseBodyEnd(mv.e eVar, long j10) {
        this.b.add(new Pair<>("responseBodyEnd", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // mv.s
    public void responseBodyStart(mv.e eVar) {
        this.b.add(new Pair<>("responseBodyStart", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // mv.s
    public void responseHeadersEnd(mv.e eVar, mv.h0 h0Var) {
        this.b.add(new Pair<>("responseHeadersEnd", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // mv.s
    public void responseHeadersStart(mv.e eVar) {
        this.b.add(new Pair<>("responseHeadersStart", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // mv.s
    public void secureConnectEnd(mv.e eVar, mv.x xVar) {
        this.b.add(new Pair<>("secureConnectEnd", Long.valueOf(SystemClock.elapsedRealtime())));
    }

    @Override // mv.s
    public void secureConnectStart(mv.e eVar) {
        this.b.add(new Pair<>("secureConnectStart", Long.valueOf(SystemClock.elapsedRealtime())));
    }
}
