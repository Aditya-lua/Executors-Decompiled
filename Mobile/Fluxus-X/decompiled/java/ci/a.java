package ci;

import backtraceio.library.anr.BacktraceANRSettings;
import backtraceio.library.services.BacktraceMetrics;
import bi.i;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.common.MlKitException;
import com.roblox.client.flags.c;
import com.roblox.platform.http.interfaces.ThumbnailsInterface;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends c implements i {
    public final com.roblox.client.flags.a.b A;
    public final com.roblox.client.flags.a.C0143a A0;
    public final com.roblox.client.flags.a.C0143a A1;
    public final com.roblox.client.flags.a.d A2;
    public final com.roblox.client.flags.a.d A3;
    public final com.roblox.client.flags.a.f A4;
    public final com.roblox.client.flags.a.d A5;
    public final com.roblox.client.flags.a.d A6;
    public final com.roblox.client.flags.a.b B;
    public final com.roblox.client.flags.a.i B0;
    public final com.roblox.client.flags.a.C0143a B1;
    public final com.roblox.client.flags.a.d B2;
    public final com.roblox.client.flags.a.d B3;
    public final com.roblox.client.flags.a.d B4;
    public final com.roblox.client.flags.a.d B5;
    public final com.roblox.client.flags.a.d B6;
    public final com.roblox.client.flags.a.b C;
    public final com.roblox.client.flags.a.C0143a C0;
    public final com.roblox.client.flags.a.C0143a C1;
    public final com.roblox.client.flags.a.d C2;
    public final com.roblox.client.flags.a.d C3;
    public final com.roblox.client.flags.a.d C4;
    public final com.roblox.client.flags.a.d C5;
    public final com.roblox.client.flags.a.d C6;
    public final com.roblox.client.flags.a.C0143a D;
    public final com.roblox.client.flags.a.C0143a D0;
    public final com.roblox.client.flags.a.C0143a D1;
    public final com.roblox.client.flags.a.f D2;
    public final com.roblox.client.flags.a.f D3;
    public final com.roblox.client.flags.a.d D4;
    public final com.roblox.client.flags.a.d D5;
    public final com.roblox.client.flags.a.d D6;
    public final com.roblox.client.flags.a.C0143a E;
    public final com.roblox.client.flags.a.C0143a E0;
    public final com.roblox.client.flags.a.C0143a E1;
    public final com.roblox.client.flags.a.d E2;
    public final com.roblox.client.flags.a.d E3;
    public final com.roblox.client.flags.a.d E4;
    public final com.roblox.client.flags.a.d E5;
    public final com.roblox.client.flags.a.d E6;
    public final com.roblox.client.flags.a.c F;
    public final com.roblox.client.flags.a.C0143a F0;
    public final com.roblox.client.flags.a.C0143a F1;
    public final com.roblox.client.flags.a.d F2;
    public final com.roblox.client.flags.a.f F3;
    public final com.roblox.client.flags.a.d F4;
    public final com.roblox.client.flags.a.d F5;
    public final com.roblox.client.flags.a.d F6;
    public final com.roblox.client.flags.a.C0143a G;
    public final com.roblox.client.flags.a.C0143a G0;
    public final com.roblox.client.flags.a.C0143a G1;
    public final com.roblox.client.flags.a.d G2;
    public final com.roblox.client.flags.a.d G3;
    public final com.roblox.client.flags.a.d G4;
    public final com.roblox.client.flags.a.d G5;
    public final com.roblox.client.flags.a.d G6;
    public final com.roblox.client.flags.a.C0143a H;
    public final com.roblox.client.flags.a.C0143a H0;
    public final com.roblox.client.flags.a.C0143a H1;
    public final com.roblox.client.flags.a.d H2;
    public final com.roblox.client.flags.a.d H3;
    public final com.roblox.client.flags.a.d H4;
    public final com.roblox.client.flags.a.d H5;
    public final com.roblox.client.flags.a.d H6;
    public final com.roblox.client.flags.a.i I;
    public final com.roblox.client.flags.a.C0143a I0;
    public final com.roblox.client.flags.a.C0143a I1;
    public final com.roblox.client.flags.a.d I2;
    public final com.roblox.client.flags.a.d I3;
    public final com.roblox.client.flags.a.f I4;
    public final com.roblox.client.flags.a.d I5;
    public final com.roblox.client.flags.a.d I6;
    public final com.roblox.client.flags.a.C0143a J;
    public final com.roblox.client.flags.a.C0143a J0;
    public final com.roblox.client.flags.a.b J1;
    public final com.roblox.client.flags.a.d J2;
    public final com.roblox.client.flags.a.f J3;
    public final com.roblox.client.flags.a.f J4;
    public final com.roblox.client.flags.a.d J5;
    public final com.roblox.client.flags.a.d J6;
    public final com.roblox.client.flags.a.C0143a K;
    public final com.roblox.client.flags.a.C0143a K0;
    public final com.roblox.client.flags.a.C0143a K1;
    public final com.roblox.client.flags.a.d K2;
    public final com.roblox.client.flags.a.f K3;
    public final com.roblox.client.flags.a.d K4;
    public final com.roblox.client.flags.a.d K5;
    public final com.roblox.client.flags.a.d K6;
    public final com.roblox.client.flags.a.i L;
    public final com.roblox.client.flags.a.C0143a L0;
    public final com.roblox.client.flags.a.i L1;
    public final com.roblox.client.flags.a.d L2;
    public final com.roblox.client.flags.a.f L3;
    public final com.roblox.client.flags.a.d L4;
    public final com.roblox.client.flags.a.d L5;
    public final com.roblox.client.flags.a.f L6;
    public final com.roblox.client.flags.a.i M;
    public final com.roblox.client.flags.a.C0143a M0;
    public final com.roblox.client.flags.a.b M1;
    public final com.roblox.client.flags.a.d M2;
    public final com.roblox.client.flags.a.f M3;
    public final com.roblox.client.flags.a.d M4;
    public final com.roblox.client.flags.a.d M5;
    public final com.roblox.client.flags.a.d M6;
    public final com.roblox.client.flags.a.i N;
    public final com.roblox.client.flags.a.C0143a N0;
    public final com.roblox.client.flags.a.b N1;
    public final com.roblox.client.flags.a.d N2;
    public final com.roblox.client.flags.a.g N3;
    public final com.roblox.client.flags.a.d N4;
    public final com.roblox.client.flags.a.d N5;
    public final com.roblox.client.flags.a.d N6;
    public final com.roblox.client.flags.a.i O;
    public final com.roblox.client.flags.a.C0143a O0;
    public final com.roblox.client.flags.a.b O1;
    public final com.roblox.client.flags.a.d O2;
    public final com.roblox.client.flags.a.d O3;
    public final com.roblox.client.flags.a.d O4;
    public final com.roblox.client.flags.a.d O5;
    public final com.roblox.client.flags.a.d O6;
    public final com.roblox.client.flags.a.b P;
    public final com.roblox.client.flags.a.C0143a P0;
    public final com.roblox.client.flags.a.b P1;
    public final com.roblox.client.flags.a.d P2;
    public final com.roblox.client.flags.a.d P3;
    public final com.roblox.client.flags.a.d P4;
    public final com.roblox.client.flags.a.d P5;
    public final com.roblox.client.flags.a.d P6;
    public final com.roblox.client.flags.a.c Q;
    public final com.roblox.client.flags.a.C0143a Q0;
    public final com.roblox.client.flags.a.C0143a Q1;
    public final com.roblox.client.flags.a.d Q2;
    public final com.roblox.client.flags.a.d Q3;
    public final com.roblox.client.flags.a.d Q4;
    public final com.roblox.client.flags.a.d Q5;
    public final com.roblox.client.flags.a.d Q6;
    public final com.roblox.client.flags.a.b R;
    public final com.roblox.client.flags.a.C0143a R0;
    public final com.roblox.client.flags.a.C0143a R1;
    public final com.roblox.client.flags.a.d R2;
    public final com.roblox.client.flags.a.d R3;
    public final com.roblox.client.flags.a.d R4;
    public final com.roblox.client.flags.a.d R5;
    public final com.roblox.client.flags.a.d R6;
    public final com.roblox.client.flags.a.b S;
    public final com.roblox.client.flags.a.C0143a S0;
    public final com.roblox.client.flags.a.C0143a S1;
    public final com.roblox.client.flags.a.d S2;
    public final com.roblox.client.flags.a.d S3;
    public final com.roblox.client.flags.a.d S4;
    public final com.roblox.client.flags.a.d S5;
    public final com.roblox.client.flags.a.d S6;
    public final com.roblox.client.flags.a.C0143a T;
    public final com.roblox.client.flags.a.C0143a T0;
    public final com.roblox.client.flags.a.C0143a T1;
    public final com.roblox.client.flags.a.d T2;
    public final com.roblox.client.flags.a.d T3;
    public final com.roblox.client.flags.a.d T4;
    public final com.roblox.client.flags.a.d T5;
    public final com.roblox.client.flags.a.c U;
    public final com.roblox.client.flags.a.C0143a U0;
    public final com.roblox.client.flags.a.C0143a U1;
    public final com.roblox.client.flags.a.d U2;
    public final com.roblox.client.flags.a.d U3;
    public final com.roblox.client.flags.a.d U4;
    public final com.roblox.client.flags.a.d U5;
    public final com.roblox.client.flags.a.i V;
    public final com.roblox.client.flags.a.b V0;
    public final com.roblox.client.flags.a.c V1;
    public final com.roblox.client.flags.a.d V2;
    public final com.roblox.client.flags.a.d V3;
    public final com.roblox.client.flags.a.d V4;
    public final com.roblox.client.flags.a.d V5;
    public final com.roblox.client.flags.a.i W;
    public final com.roblox.client.flags.a.c W0;
    public final com.roblox.client.flags.a.c W1;
    public final com.roblox.client.flags.a.d W2;
    public final com.roblox.client.flags.a.d W3;
    public final com.roblox.client.flags.a.d W4;
    public final com.roblox.client.flags.a.d W5;
    public final com.roblox.client.flags.a.i X;
    public final com.roblox.client.flags.a.C0143a X0;
    public final com.roblox.client.flags.a.c X1;
    public final com.roblox.client.flags.a.d X2;
    public final com.roblox.client.flags.a.d X3;
    public final com.roblox.client.flags.a.d X4;
    public final com.roblox.client.flags.a.d X5;
    public final com.roblox.client.flags.a.C0143a Y;
    public final com.roblox.client.flags.a.b Y0;
    public final com.roblox.client.flags.a.b Y1;
    public final com.roblox.client.flags.a.d Y2;
    public final com.roblox.client.flags.a.d Y3;
    public final com.roblox.client.flags.a.d Y4;
    public final com.roblox.client.flags.a.d Y5;
    public final com.roblox.client.flags.a.i Z;
    public final com.roblox.client.flags.a.C0143a Z0;
    public final com.roblox.client.flags.a.C0143a Z1;
    public final com.roblox.client.flags.a.d Z2;
    public final com.roblox.client.flags.a.d Z3;
    public final com.roblox.client.flags.a.d Z4;
    public final com.roblox.client.flags.a.d Z5;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5266a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5267a1;

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5268a2;

    /* JADX INFO: renamed from: a3, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5269a3;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5270a4;

    /* JADX INFO: renamed from: a5, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5271a5;

    /* JADX INFO: renamed from: a6, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5272a6;
    public final com.roblox.client.flags.a.b b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5273b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5274b1;

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5275b2;

    /* JADX INFO: renamed from: b3, reason: collision with root package name */
    public final com.roblox.client.flags.a.f f5276b3;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5277b4;

    /* JADX INFO: renamed from: b5, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5278b5;

    /* JADX INFO: renamed from: b6, reason: collision with root package name */
    public final com.roblox.client.flags.a.g f5279b6;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.roblox.client.flags.a.i f5280c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5281c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5282c1;

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5283c2;

    /* JADX INFO: renamed from: c3, reason: collision with root package name */
    public final com.roblox.client.flags.a.f f5284c3;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5285c4;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5286c5;

    /* JADX INFO: renamed from: c6, reason: collision with root package name */
    public final com.roblox.client.flags.a.g f5287c6;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f5288d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5289d0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5290d1;

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5291d2;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5292d3;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5293d4;

    /* JADX INFO: renamed from: d5, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5294d5;

    /* JADX INFO: renamed from: d6, reason: collision with root package name */
    public final com.roblox.client.flags.a.f f5295d6;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f5296e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final com.roblox.client.flags.a.i f5297e0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f5298e1;

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f5299e2;

    /* JADX INFO: renamed from: e3, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5300e3;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    public final com.roblox.client.flags.a.f f5301e4;

    /* JADX INFO: renamed from: e5, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5302e5;

    /* JADX INFO: renamed from: e6, reason: collision with root package name */
    public final com.roblox.client.flags.a.f f5303e6;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.roblox.client.flags.a.i f5304f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final com.roblox.client.flags.a.i f5305f0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5306f1;

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5307f2;

    /* JADX INFO: renamed from: f3, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5308f3;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5309f4;

    /* JADX INFO: renamed from: f5, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5310f5;

    /* JADX INFO: renamed from: f6, reason: collision with root package name */
    public final com.roblox.client.flags.a.f f5311f6;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f5312g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final com.roblox.client.flags.a.i f5313g0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f5314g1;

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5315g2;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5316g3;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5317g4;

    /* JADX INFO: renamed from: g5, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5318g5;

    /* JADX INFO: renamed from: g6, reason: collision with root package name */
    public final com.roblox.client.flags.a.f f5319g6;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5320h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5321h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5322h1;

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5323h2;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5324h3;

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    public final com.roblox.client.flags.a.f f5325h4;

    /* JADX INFO: renamed from: h5, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5326h5;

    /* JADX INFO: renamed from: h6, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5327h6;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5328i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5329i0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5330i1;

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5331i2;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5332i3;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5333i4;

    /* JADX INFO: renamed from: i5, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5334i5;

    /* JADX INFO: renamed from: i6, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5335i6;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f5336j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final com.roblox.client.flags.a.c f5337j0;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f5338j1;

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5339j2;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5340j3;

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5341j4;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5342j5;

    /* JADX INFO: renamed from: j6, reason: collision with root package name */
    public final com.roblox.client.flags.a.f f5343j6;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f5344k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f5345k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5346k1;

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5347k2;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5348k3;

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5349k4;

    /* JADX INFO: renamed from: k5, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5350k5;

    /* JADX INFO: renamed from: k6, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5351k6;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f5352l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f5353l0;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f5354l1;

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5355l2;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5356l3;

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5357l4;

    /* JADX INFO: renamed from: l5, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5358l5;

    /* JADX INFO: renamed from: l6, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5359l6;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f5360m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5361m0;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5362m1;

    /* JADX INFO: renamed from: m2, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5363m2;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    public final com.roblox.client.flags.a.f f5364m3;

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5365m4;

    /* JADX INFO: renamed from: m5, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5366m5;

    /* JADX INFO: renamed from: m6, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5367m6;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f5368n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final com.roblox.client.flags.a.i f5369n0;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public final com.roblox.client.flags.a.i f5370n1;

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5371n2;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5372n3;

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5373n4;

    /* JADX INFO: renamed from: n5, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5374n5;

    /* JADX INFO: renamed from: n6, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5375n6;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f5376o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5377o0;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5378o1;

    /* JADX INFO: renamed from: o2, reason: collision with root package name */
    public final com.roblox.client.flags.a.c f5379o2;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5380o3;

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5381o4;

    /* JADX INFO: renamed from: o5, reason: collision with root package name */
    public final com.roblox.client.flags.a.g f5382o5;

    /* JADX INFO: renamed from: o6, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5383o6;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f5384p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5385p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5386p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5387p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5388p3;

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5389p4;

    /* JADX INFO: renamed from: p5, reason: collision with root package name */
    public final com.roblox.client.flags.a.g f5390p5;

    /* JADX INFO: renamed from: p6, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5391p6;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.roblox.client.flags.a.c f5392q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5393q0;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f5394q1;

    /* JADX INFO: renamed from: q2, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5395q2;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5396q3;

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    public final com.roblox.client.flags.a.f f5397q4;

    /* JADX INFO: renamed from: q5, reason: collision with root package name */
    public final com.roblox.client.flags.a.f f5398q5;

    /* JADX INFO: renamed from: q6, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5399q6;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f5400r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5401r0;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f5402r1;

    /* JADX INFO: renamed from: r2, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5403r2;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5404r3;

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    public final com.roblox.client.flags.a.g f5405r4;

    /* JADX INFO: renamed from: r5, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5406r5;

    /* JADX INFO: renamed from: r6, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5407r6;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f5408s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5409s0;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f5410s1;

    /* JADX INFO: renamed from: s2, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f5411s2;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    public final com.roblox.client.flags.a.g f5412s3;

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    public final com.roblox.client.flags.a.g f5413s4;

    /* JADX INFO: renamed from: s5, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5414s5;

    /* JADX INFO: renamed from: s6, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5415s6;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f5416t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5417t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5418t1;

    /* JADX INFO: renamed from: t2, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5419t2;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5420t3;

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5421t4;

    /* JADX INFO: renamed from: t5, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5422t5;

    /* JADX INFO: renamed from: t6, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5423t6;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f5424u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5425u0;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5426u1;

    /* JADX INFO: renamed from: u2, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5427u2;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5428u3;

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5429u4;

    /* JADX INFO: renamed from: u5, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5430u5;

    /* JADX INFO: renamed from: u6, reason: collision with root package name */
    public final com.roblox.client.flags.a.f f5431u6;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final com.roblox.client.flags.a.i f5432v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5433v0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5434v1;

    /* JADX INFO: renamed from: v2, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5435v2;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5436v3;

    /* JADX INFO: renamed from: v4, reason: collision with root package name */
    public final com.roblox.client.flags.a.g f5437v4;

    /* JADX INFO: renamed from: v5, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5438v5;

    /* JADX INFO: renamed from: v6, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5439v6;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.roblox.client.flags.a.i f5440w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5441w0;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5442w1;

    /* JADX INFO: renamed from: w2, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5443w2;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5444w3;

    /* JADX INFO: renamed from: w4, reason: collision with root package name */
    public final com.roblox.client.flags.a.f f5445w4;
    public final com.roblox.client.flags.a.d w5;

    /* JADX INFO: renamed from: w6, reason: collision with root package name */
    public final com.roblox.client.flags.a.f f5446w6;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f5447x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f5448x0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public final com.roblox.client.flags.a.i f5449x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5450x2;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5451x3;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public final com.roblox.client.flags.a.f f5452x4;
    public final com.roblox.client.flags.a.d x5;

    /* JADX INFO: renamed from: x6, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5453x6;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final com.roblox.client.flags.a.i f5454y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5455y0;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5456y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    public final com.roblox.client.flags.a.g f5457y2;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5458y3;

    /* JADX INFO: renamed from: y4, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5459y4;

    /* JADX INFO: renamed from: y5, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5460y5;

    /* JADX INFO: renamed from: y6, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5461y6;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final com.roblox.client.flags.a.i f5462z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5463z0;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0143a f5464z1;

    /* JADX INFO: renamed from: z2, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5465z2;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5466z3;

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5467z4;

    /* JADX INFO: renamed from: z5, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5468z5;

    /* JADX INFO: renamed from: z6, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f5469z6;

    public a() {
        com.roblox.client.flags.a.b bVar = new com.roblox.client.flags.a.b("InfluxThrottleRate", 10, false);
        this.b = bVar;
        h6("InfluxThrottleRate", bVar);
        com.roblox.client.flags.a.i iVar = new com.roblox.client.flags.a.i("InfluxTcpHost", "ec2-54-165-151-168.compute-1.amazonaws.com", false);
        this.f5280c = iVar;
        h6("InfluxTcpHost", iVar);
        com.roblox.client.flags.a.b bVar2 = new com.roblox.client.flags.a.b("InfluxTcpPort", 8094, false);
        this.f5288d = bVar2;
        h6("InfluxTcpPort", bVar2);
        com.roblox.client.flags.a.b bVar3 = new com.roblox.client.flags.a.b("InfluxTcpTimeToLiveInSeconds", 10, false);
        this.f5296e = bVar3;
        h6("InfluxTcpTimeToLiveInSeconds", bVar3);
        com.roblox.client.flags.a.i iVar2 = new com.roblox.client.flags.a.i("NotificationStreamPath", "notificationstream/embedded", false);
        this.f5304f = iVar2;
        h6("NotificationStreamPath", iVar2);
        com.roblox.client.flags.a.b bVar4 = new com.roblox.client.flags.a.b("NumberOfFailedLoginsBeforeResetPasswordMessage", 5, false);
        this.f5312g = bVar4;
        h6("NumberOfFailedLoginsBeforeResetPasswordMessage", bVar4);
        Boolean bool = Boolean.FALSE;
        com.roblox.client.flags.a.C0143a c0143a = new com.roblox.client.flags.a.C0143a("FFlagAppRatingTelemetry", bool, false);
        this.f5320h = c0143a;
        h6("FFlagAppRatingTelemetry", c0143a);
        com.roblox.client.flags.a.C0143a c0143a2 = new com.roblox.client.flags.a.C0143a("AndroidTextFieldDefaultHintFix", bool, false);
        this.f5328i = c0143a2;
        h6("AndroidTextFieldDefaultHintFix", c0143a2);
        com.roblox.client.flags.a.b bVar5 = new com.roblox.client.flags.a.b("AppRatingsPlayTimeInMinutes", 10, false);
        this.f5336j = bVar5;
        h6("AppRatingsPlayTimeInMinutes", bVar5);
        com.roblox.client.flags.a.b bVar6 = new com.roblox.client.flags.a.b("AppRatingsNumberOfFriendsForLaunch", 1, false);
        this.f5344k = bVar6;
        h6("AppRatingsNumberOfFriendsForLaunch", bVar6);
        com.roblox.client.flags.a.b bVar7 = new com.roblox.client.flags.a.b("AppRatingsLaunchCount", 3, false);
        this.f5352l = bVar7;
        h6("AppRatingsLaunchCount", bVar7);
        com.roblox.client.flags.a.b bVar8 = new com.roblox.client.flags.a.b("AppRatingsDaysSinceFirstUse", 5, false);
        this.f5360m = bVar8;
        h6("AppRatingsDaysSinceFirstUse", bVar8);
        com.roblox.client.flags.a.b bVar9 = new com.roblox.client.flags.a.b("AppRatingsLaunchesUntilReminder", 4, false);
        this.f5368n = bVar9;
        h6("AppRatingsLaunchesUntilReminder", bVar9);
        com.roblox.client.flags.a.b bVar10 = new com.roblox.client.flags.a.b("AppRatingsDaysUntilReminder", 6, false);
        this.f5376o = bVar10;
        h6("AppRatingsDaysUntilReminder", bVar10);
        com.roblox.client.flags.a.b bVar11 = new com.roblox.client.flags.a.b("AppRatingsGamesPlayed", 7, false);
        this.f5384p = bVar11;
        h6("AppRatingsGamesPlayed", bVar11);
        com.roblox.client.flags.a.c cVar = new com.roblox.client.flags.a.c("TimeBeforeWebViewRefreshInMs", 180000L, false);
        this.f5392q = cVar;
        h6("TimeBeforeWebViewRefreshInMs", cVar);
        com.roblox.client.flags.a.b bVar12 = new com.roblox.client.flags.a.b("EventStreamBatchSize", 10, false);
        this.f5400r = bVar12;
        h6("EventStreamBatchSize", bVar12);
        com.roblox.client.flags.a.b bVar13 = new com.roblox.client.flags.a.b("EventStreamBatchTimeInSecs", 60, false);
        this.f5408s = bVar13;
        h6("EventStreamBatchTimeInSecs", bVar13);
        com.roblox.client.flags.a.b bVar14 = new com.roblox.client.flags.a.b("MinFunCaptchaWidthInPx", 400, false);
        this.f5416t = bVar14;
        h6("MinFunCaptchaWidthInPx", bVar14);
        com.roblox.client.flags.a.b bVar15 = new com.roblox.client.flags.a.b("MinFunCaptchaHeightInPx", 500, false);
        this.f5424u = bVar15;
        h6("MinFunCaptchaHeightInPx", bVar15);
        com.roblox.client.flags.a.i iVar3 = new com.roblox.client.flags.a.i("CrashpadUploadToBacktraceUrl", "https://uploads.backtrace.rbx.com/post", false);
        this.f5432v = iVar3;
        h6("CrashpadUploadToBacktraceUrl", iVar3);
        com.roblox.client.flags.a.i iVar4 = new com.roblox.client.flags.a.i("CrashpadUploadToBacktraceAndroidPlayerToken", "3fd27180e359d21ab86e48526adecaf75bfb062c138eb23e847ef1ed906f9aaf", false);
        this.f5440w = iVar4;
        h6("CrashpadUploadToBacktraceAndroidPlayerToken", iVar4);
        com.roblox.client.flags.a.b bVar16 = new com.roblox.client.flags.a.b("JavaCrashUploadToBacktracePercentage", 10, false);
        this.f5447x = bVar16;
        h6("JavaCrashUploadToBacktracePercentage", bVar16);
        com.roblox.client.flags.a.i iVar5 = new com.roblox.client.flags.a.i("JavaCrashUploadToBacktraceUrl", "https://uploads.backtrace.rbx.com/post", false);
        this.f5454y = iVar5;
        h6("JavaCrashUploadToBacktraceUrl", iVar5);
        com.roblox.client.flags.a.i iVar6 = new com.roblox.client.flags.a.i("JavaCrashUploadToBacktraceToken", "1d680abdb860308199d85e6e5b570e6990f0693c3f3a3628905f9157318fa0ea", false);
        this.f5462z = iVar6;
        h6("JavaCrashUploadToBacktraceToken", iVar6);
        com.roblox.client.flags.a.b bVar17 = new com.roblox.client.flags.a.b("JavaANRUploadToBacktracePercentage", 10, false);
        this.A = bVar17;
        h6("JavaANRUploadToBacktracePercentage", bVar17);
        Integer numValueOf = Integer.valueOf(BacktraceANRSettings.DEFAULT_ANR_TIMEOUT);
        com.roblox.client.flags.a.b bVar18 = new com.roblox.client.flags.a.b("JavaANRMaximumTimeout", numValueOf, false);
        this.B = bVar18;
        h6("JavaANRMaximumTimeout", bVar18);
        com.roblox.client.flags.a.b bVar19 = new com.roblox.client.flags.a.b("DefaultTapFilterLevel", 0, false);
        this.C = bVar19;
        h6("DefaultTapFilterLevel", bVar19);
        Boolean bool2 = Boolean.TRUE;
        com.roblox.client.flags.a.C0143a c0143a3 = new com.roblox.client.flags.a.C0143a("EnableTencentLinkingFeature", bool2, false);
        this.D = c0143a3;
        h6("EnableTencentLinkingFeature", c0143a3);
        com.roblox.client.flags.a.C0143a c0143a4 = new com.roblox.client.flags.a.C0143a("DisableLoadingOfRobuxUrlForTencentBuild", bool2, false);
        this.E = c0143a4;
        h6("DisableLoadingOfRobuxUrlForTencentBuild", c0143a4);
        com.roblox.client.flags.a.c cVar2 = new com.roblox.client.flags.a.c("EnableGameOrientationWithDelayInMs", 0L, false);
        this.F = cVar2;
        h6("EnableGameOrientationWithDelayInMs", cVar2);
        com.roblox.client.flags.a.C0143a c0143a5 = new com.roblox.client.flags.a.C0143a("EnableTencentWebHelpPage", bool, false);
        this.G = c0143a5;
        h6("EnableTencentWebHelpPage", c0143a5);
        com.roblox.client.flags.a.C0143a c0143a6 = new com.roblox.client.flags.a.C0143a("EnableTencentMSDKNotice", bool, false);
        this.H = c0143a6;
        h6("EnableTencentMSDKNotice", c0143a6);
        com.roblox.client.flags.a.i iVar7 = new com.roblox.client.flags.a.i("TencentMSDKNoticeActivityPath", "/act", false);
        this.I = iVar7;
        h6("TencentMSDKNoticeActivityPath", iVar7);
        com.roblox.client.flags.a.C0143a c0143a7 = new com.roblox.client.flags.a.C0143a("EnableFetchAgreementRetryOnLogin", bool, false);
        this.J = c0143a7;
        h6("EnableFetchAgreementRetryOnLogin", c0143a7);
        com.roblox.client.flags.a.C0143a c0143a8 = new com.roblox.client.flags.a.C0143a("EnableAgreementIdReuseOnSignUp", bool, false);
        this.K = c0143a8;
        h6("EnableAgreementIdReuseOnSignUp", c0143a8);
        com.roblox.client.flags.a.i iVar8 = new com.roblox.client.flags.a.i("DefaultLuobuShareThumbnailsSize", ThumbnailsInterface.HEADSHOT_SIZE_150X150, false);
        this.L = iVar8;
        h6("DefaultLuobuShareThumbnailsSize", iVar8);
        com.roblox.client.flags.a.i iVar9 = new com.roblox.client.flags.a.i("DefaultLuobuShareThumbnailsFormat", ThumbnailsInterface.FORMAT_PNG, false);
        this.M = iVar9;
        h6("DefaultLuobuShareThumbnailsFormat", iVar9);
        com.roblox.client.flags.a.i iVar10 = new com.roblox.client.flags.a.i("DefaultLuobuHelpCenterThumbnailsSize", "75x75", false);
        this.N = iVar10;
        h6("DefaultLuobuHelpCenterThumbnailsSize", iVar10);
        com.roblox.client.flags.a.i iVar11 = new com.roblox.client.flags.a.i("DefaultLuobuHelpCenterThumbnailsFormat", "png", false);
        this.O = iVar11;
        h6("DefaultLuobuHelpCenterThumbnailsFormat", iVar11);
        com.roblox.client.flags.a.b bVar20 = new com.roblox.client.flags.a.b("LuobuShareThumbnailsRetryNumber", 3, false);
        this.P = bVar20;
        h6("LuobuShareThumbnailsRetryNumber", bVar20);
        com.roblox.client.flags.a.c cVar3 = new com.roblox.client.flags.a.c("RetryIntervalMs", 500L, false);
        this.Q = cVar3;
        h6("RetryIntervalMs", cVar3);
        com.roblox.client.flags.a.b bVar21 = new com.roblox.client.flags.a.b("LuobuThumbnailRetryBackoffMultiplier", 1, false);
        this.R = bVar21;
        h6("LuobuThumbnailRetryBackoffMultiplier", bVar21);
        com.roblox.client.flags.a.b bVar22 = new com.roblox.client.flags.a.b("LuobuShareThumbnailsRetryTimeoutMs", numValueOf, false);
        this.S = bVar22;
        h6("LuobuShareThumbnailsRetryTimeoutMs", bVar22);
        com.roblox.client.flags.a.C0143a c0143a9 = new com.roblox.client.flags.a.C0143a("TestCJVPayAPI", bool, false);
        this.T = c0143a9;
        h6("TestCJVPayAPI", c0143a9);
        com.roblox.client.flags.a.c cVar4 = new com.roblox.client.flags.a.c("NativeTextBoxOpenUpdateWaitTimeMs", 200L, false);
        this.U = cVar4;
        h6("NativeTextBoxOpenUpdateWaitTimeMs", cVar4);
        com.roblox.client.flags.a.i iVar12 = new com.roblox.client.flags.a.i("CustomLuobuCorpUrl", "https://roblox.qq.com/?webview=true0409", false);
        this.V = iVar12;
        h6("CustomLuobuCorpUrl", iVar12);
        com.roblox.client.flags.a.i iVar13 = new com.roblox.client.flags.a.i("ChannelIdsEnabledForStructureShare", BuildConfig.FLAVOR, false);
        this.W = iVar13;
        h6("ChannelIdsEnabledForStructureShare", iVar13);
        com.roblox.client.flags.a.i iVar14 = new com.roblox.client.flags.a.i("LuobuShareUrl", "https://luobu.qq.com/fx/a20210622fxy/index.html", false);
        this.X = iVar14;
        h6("LuobuShareUrl", iVar14);
        com.roblox.client.flags.a.C0143a c0143a10 = new com.roblox.client.flags.a.C0143a("EnableLuobuSignupCheck", bool, false);
        this.Y = c0143a10;
        h6("EnableLuobuSignupCheck", c0143a10);
        com.roblox.client.flags.a.i iVar15 = new com.roblox.client.flags.a.i("LuobuAgeRatingInstructionUrl", "https://roblox.qq.com/m/m202106/newsDetail.html?newsid=14640697", false);
        this.Z = iVar15;
        h6("LuobuAgeRatingInstructionUrl", iVar15);
        com.roblox.client.flags.a.C0143a c0143a11 = new com.roblox.client.flags.a.C0143a("FFlagShouldDisableAdIds", bool, false);
        this.f5266a0 = c0143a11;
        h6("FFlagShouldDisableAdIds", c0143a11);
        com.roblox.client.flags.a.C0143a c0143a12 = new com.roblox.client.flags.a.C0143a("FFlagDisableLuobuAutoLoginCheckImprovement2", bool, false);
        this.f5273b0 = c0143a12;
        h6("FFlagDisableLuobuAutoLoginCheckImprovement2", c0143a12);
        com.roblox.client.flags.a.C0143a c0143a13 = new com.roblox.client.flags.a.C0143a("FFlagDisableLuobuTDMReport", bool, false);
        this.f5281c0 = c0143a13;
        h6("FFlagDisableLuobuTDMReport", c0143a13);
        com.roblox.client.flags.a.C0143a c0143a14 = new com.roblox.client.flags.a.C0143a("EnabledLuobuSignupSuspensionNotice", bool, false);
        this.f5289d0 = c0143a14;
        h6("EnabledLuobuSignupSuspensionNotice", c0143a14);
        com.roblox.client.flags.a.i iVar16 = new com.roblox.client.flags.a.i("LuobuSignupSuspensionNoticeUrl", "https://roblox.qq.com/m/m202106/newsDetail.html?newsid=15196933", false);
        this.f5297e0 = iVar16;
        h6("LuobuSignupSuspensionNoticeUrl", iVar16);
        com.roblox.client.flags.a.i iVar17 = new com.roblox.client.flags.a.i("AndroidIAPList", BuildConfig.FLAVOR, false);
        this.f5305f0 = iVar17;
        h6("AndroidIAPList", iVar17);
        com.roblox.client.flags.a.i iVar18 = new com.roblox.client.flags.a.i("AndroidIAPSubList", BuildConfig.FLAVOR, false);
        this.f5313g0 = iVar18;
        h6("AndroidIAPSubList", iVar18);
        com.roblox.client.flags.a.C0143a c0143a15 = new com.roblox.client.flags.a.C0143a("EnableBackgroundExperiment", bool, false);
        this.f5321h0 = c0143a15;
        h6("EnableBackgroundExperiment", c0143a15);
        com.roblox.client.flags.a.C0143a c0143a16 = new com.roblox.client.flags.a.C0143a("GrantPendingPurchaseIntervalEnabled", bool, false);
        this.f5329i0 = c0143a16;
        h6("GrantPendingPurchaseIntervalEnabled", c0143a16);
        com.roblox.client.flags.a.c cVar5 = new com.roblox.client.flags.a.c("GrantPendingPurchaseInterval", 10L, false);
        this.f5337j0 = cVar5;
        h6("GrantPendingPurchaseInterval", cVar5);
        com.roblox.client.flags.a.b bVar23 = new com.roblox.client.flags.a.b("MemoryInfoThresholdsMaxAndroidVersionAllowed", 33, false);
        this.f5345k0 = bVar23;
        h6("MemoryInfoThresholdsMaxAndroidVersionAllowed", bVar23);
        com.roblox.client.flags.a.b bVar24 = new com.roblox.client.flags.a.b("AndroidApplicationExitReasonNumEntriesToFetch", 10, false);
        this.f5353l0 = bVar24;
        h6("AndroidApplicationExitReasonNumEntriesToFetch", bVar24);
        com.roblox.client.flags.a.C0143a c0143a17 = new com.roblox.client.flags.a.C0143a("EnableIrisGameJoinAndroid2", bool, false);
        this.f5361m0 = c0143a17;
        h6("EnableIrisGameJoinAndroid2", c0143a17);
        com.roblox.client.flags.a.i iVar19 = new com.roblox.client.flags.a.i("BacktraceLogSize", "200", false);
        this.f5369n0 = iVar19;
        h6("BacktraceLogSize", iVar19);
        com.roblox.client.flags.a.C0143a c0143a18 = new com.roblox.client.flags.a.C0143a("RemoveUserThemeSignalRReceiver", bool, false);
        this.f5377o0 = c0143a18;
        h6("RemoveUserThemeSignalRReceiver", c0143a18);
        com.roblox.client.flags.a.C0143a c0143a19 = new com.roblox.client.flags.a.C0143a("DisableSendrSilentPushNotificationDisplay", bool, true);
        this.f5385p0 = c0143a19;
        h6("DisableSendrSilentPushNotificationDisplay", c0143a19);
        com.roblox.client.flags.a.C0143a c0143a20 = new com.roblox.client.flags.a.C0143a("DisableUserAgeCheckInPushUpsell", bool, false);
        this.f5393q0 = c0143a20;
        h6("DisableUserAgeCheckInPushUpsell", c0143a20);
        com.roblox.client.flags.a.C0143a c0143a21 = new com.roblox.client.flags.a.C0143a("DisablePushReceivedNativeLogging", bool, true);
        this.f5401r0 = c0143a21;
        h6("DisablePushReceivedNativeLogging", c0143a21);
        com.roblox.client.flags.a.C0143a c0143a22 = new com.roblox.client.flags.a.C0143a("EnableMaquettesForceKill", bool, false);
        this.f5409s0 = c0143a22;
        h6("EnableMaquettesForceKill", c0143a22);
        com.roblox.client.flags.a.C0143a c0143a23 = new com.roblox.client.flags.a.C0143a("CleanupHttpAgentOnRestart", bool, true);
        this.f5417t0 = c0143a23;
        h6("CleanupHttpAgentOnRestart", c0143a23);
        com.roblox.client.flags.a.C0143a c0143a24 = new com.roblox.client.flags.a.C0143a("RetryFlagPrefetchOnBackgroundFailure", bool, true);
        this.f5425u0 = c0143a24;
        h6("RetryFlagPrefetchOnBackgroundFailure", c0143a24);
        com.roblox.client.flags.a.C0143a c0143a25 = new com.roblox.client.flags.a.C0143a("AndroidAddBuildVariantToGlobalTags", bool, true);
        this.f5433v0 = c0143a25;
        h6("AndroidAddBuildVariantToGlobalTags", c0143a25);
        com.roblox.client.flags.a.C0143a c0143a26 = new com.roblox.client.flags.a.C0143a("AndroidEnableBatteryPowerMetrics", bool, true);
        this.f5441w0 = c0143a26;
        h6("AndroidEnableBatteryPowerMetrics", c0143a26);
        com.roblox.client.flags.a.b bVar25 = new com.roblox.client.flags.a.b("QuestDeviceAttestationTimeoutMs", 3000, false);
        this.f5448x0 = bVar25;
        h6("QuestDeviceAttestationTimeoutMs", bVar25);
        com.roblox.client.flags.a.C0143a c0143a27 = new com.roblox.client.flags.a.C0143a("DisableLoginSignupScreenshot", bool, true);
        this.f5455y0 = c0143a27;
        h6("DisableLoginSignupScreenshot", c0143a27);
        com.roblox.client.flags.a.C0143a c0143a28 = new com.roblox.client.flags.a.C0143a("ValidateAppAssetsContentProviderCaller", bool, false);
        this.f5463z0 = c0143a28;
        h6("ValidateAppAssetsContentProviderCaller", c0143a28);
        com.roblox.client.flags.a.C0143a c0143a29 = new com.roblox.client.flags.a.C0143a("EnableUpsellRobuxBonusItemIXPExperiment", bool, false);
        this.A0 = c0143a29;
        h6("EnableUpsellRobuxBonusItemIXPExperiment", c0143a29);
        com.roblox.client.flags.a.i iVar20 = new com.roblox.client.flags.a.i("UpsellRobuxBonusItemProductIdList", BuildConfig.FLAVOR, false);
        this.B0 = iVar20;
        h6("UpsellRobuxBonusItemProductIdList", iVar20);
        com.roblox.client.flags.a.C0143a c0143a30 = new com.roblox.client.flags.a.C0143a("EnableScreentimeClientBehavior", bool, false);
        this.C0 = c0143a30;
        h6("EnableScreentimeClientBehavior", c0143a30);
        com.roblox.client.flags.a.C0143a c0143a31 = new com.roblox.client.flags.a.C0143a("EnablePreferImmediatelyAvailableCredentialsSupport", bool, true);
        this.D0 = c0143a31;
        h6("EnablePreferImmediatelyAvailableCredentialsSupport", c0143a31);
        com.roblox.client.flags.a.C0143a c0143a32 = new com.roblox.client.flags.a.C0143a("EnableUsernameParameterForCMPasswords", bool, true);
        this.E0 = c0143a32;
        h6("EnableUsernameParameterForCMPasswords", c0143a32);
        com.roblox.client.flags.a.C0143a c0143a33 = new com.roblox.client.flags.a.C0143a("EnableAppsFlyerOptOutStorageAndroid", bool, true);
        this.F0 = c0143a33;
        h6("EnableAppsFlyerOptOutStorageAndroid", c0143a33);
        com.roblox.client.flags.a.C0143a c0143a34 = new com.roblox.client.flags.a.C0143a("EnableToSwitchToSettingsAppWithRouteAndroid", bool, false);
        this.G0 = c0143a34;
        h6("EnableToSwitchToSettingsAppWithRouteAndroid", c0143a34);
        com.roblox.client.flags.a.C0143a c0143a35 = new com.roblox.client.flags.a.C0143a("AndroidTrackingToggleEnabled", bool, true);
        this.H0 = c0143a35;
        h6("AndroidTrackingToggleEnabled", c0143a35);
        com.roblox.client.flags.a.C0143a c0143a36 = new com.roblox.client.flags.a.C0143a("ExposeAppSuspended2", bool, true);
        this.I0 = c0143a36;
        h6("ExposeAppSuspended2", c0143a36);
        com.roblox.client.flags.a.C0143a c0143a37 = new com.roblox.client.flags.a.C0143a("EnableAndroidAssertDialog", bool, false);
        this.J0 = c0143a37;
        h6("EnableAndroidAssertDialog", c0143a37);
        com.roblox.client.flags.a.C0143a c0143a38 = new com.roblox.client.flags.a.C0143a("CrashWhenFlagsNotLoaded", bool, true);
        this.K0 = c0143a38;
        h6("CrashWhenFlagsNotLoaded", c0143a38);
        com.roblox.client.flags.a.C0143a c0143a39 = new com.roblox.client.flags.a.C0143a("PermissionsProtocolAndroidDisableSpecialHandling", bool, true);
        this.L0 = c0143a39;
        h6("PermissionsProtocolAndroidDisableSpecialHandling", c0143a39);
        com.roblox.client.flags.a.C0143a c0143a40 = new com.roblox.client.flags.a.C0143a("DisableAndroidAppsflyerFirstPlayerEvent", bool, true);
        this.M0 = c0143a40;
        h6("DisableAndroidAppsflyerFirstPlayerEvent", c0143a40);
        com.roblox.client.flags.a.C0143a c0143a41 = new com.roblox.client.flags.a.C0143a("DisableAndroidAppsflyerPlayCompleteEvent", bool, true);
        this.N0 = c0143a41;
        h6("DisableAndroidAppsflyerPlayCompleteEvent", c0143a41);
        com.roblox.client.flags.a.C0143a c0143a42 = new com.roblox.client.flags.a.C0143a("DisableAndroidAppsflyerRetentionEvent", bool, true);
        this.O0 = c0143a42;
        h6("DisableAndroidAppsflyerRetentionEvent", c0143a42);
        com.roblox.client.flags.a.C0143a c0143a43 = new com.roblox.client.flags.a.C0143a("EnableAndroidAppsflyerCustomerUserID", bool, true);
        this.P0 = c0143a43;
        h6("EnableAndroidAppsflyerCustomerUserID", c0143a43);
        com.roblox.client.flags.a.C0143a c0143a44 = new com.roblox.client.flags.a.C0143a("EnableGrantPendingPurchasesRefactor", bool, false);
        this.Q0 = c0143a44;
        h6("EnableGrantPendingPurchasesRefactor", c0143a44);
        com.roblox.client.flags.a.C0143a c0143a45 = new com.roblox.client.flags.a.C0143a("AndroidFixKeyboardScreenRotation2", bool, false);
        this.R0 = c0143a45;
        h6("AndroidFixKeyboardScreenRotation2", c0143a45);
        com.roblox.client.flags.a.C0143a c0143a46 = new com.roblox.client.flags.a.C0143a("AndroidAppChatPushSupportsGuid", bool, true);
        this.S0 = c0143a46;
        h6("AndroidAppChatPushSupportsGuid", c0143a46);
        com.roblox.client.flags.a.C0143a c0143a47 = new com.roblox.client.flags.a.C0143a("EnableReferredByPlayerIdAndroid", bool, true);
        this.T0 = c0143a47;
        h6("EnableReferredByPlayerIdAndroid", c0143a47);
        com.roblox.client.flags.a.C0143a c0143a48 = new com.roblox.client.flags.a.C0143a("EnableAndroidBinaryChannelsLogging", bool, false);
        this.U0 = c0143a48;
        h6("EnableAndroidBinaryChannelsLogging", c0143a48);
        com.roblox.client.flags.a.b bVar26 = new com.roblox.client.flags.a.b("AndroidBinaryChannelsLoggingThrottlingHundredthPercentage", 0, false);
        this.V0 = bVar26;
        h6("AndroidBinaryChannelsLoggingThrottlingHundredthPercentage", bVar26);
        com.roblox.client.flags.a.c cVar6 = new com.roblox.client.flags.a.c("AndroidSoftwareKeyboardOpenConfirmationTimeMs", 250L, false);
        this.W0 = cVar6;
        h6("AndroidSoftwareKeyboardOpenConfirmationTimeMs", cVar6);
        com.roblox.client.flags.a.C0143a c0143a49 = new com.roblox.client.flags.a.C0143a("AndroidGestureMultitouch", bool, false);
        this.X0 = c0143a49;
        h6("AndroidGestureMultitouch", c0143a49);
        com.roblox.client.flags.a.b bVar27 = new com.roblox.client.flags.a.b("AndroidAssetReadLoggingThrottleHundredthsPercent", 0, false);
        this.Y0 = bVar27;
        h6("AndroidAssetReadLoggingThrottleHundredthsPercent", bVar27);
        com.roblox.client.flags.a.C0143a c0143a50 = new com.roblox.client.flags.a.C0143a("AndroidLogAssetReads", bool, false);
        this.Z0 = c0143a50;
        h6("AndroidLogAssetReads", c0143a50);
        com.roblox.client.flags.a.C0143a c0143a51 = new com.roblox.client.flags.a.C0143a("MoveNotificationManagerRemoveObserverFromPauseToStop2", bool, true);
        this.f5267a1 = c0143a51;
        h6("MoveNotificationManagerRemoveObserverFromPauseToStop2", c0143a51);
        com.roblox.client.flags.a.C0143a c0143a52 = new com.roblox.client.flags.a.C0143a("InternalForceConsumePlayPointsOOAP2", bool, false);
        this.f5274b1 = c0143a52;
        h6("InternalForceConsumePlayPointsOOAP2", c0143a52);
        com.roblox.client.flags.a.C0143a c0143a53 = new com.roblox.client.flags.a.C0143a("EnableEnhancedClientMetricsForGooglePurchaseFlowV2", bool, false);
        this.f5282c1 = c0143a53;
        h6("EnableEnhancedClientMetricsForGooglePurchaseFlowV2", c0143a53);
        com.roblox.client.flags.a.C0143a c0143a54 = new com.roblox.client.flags.a.C0143a("FeatureDeliverySendUserId", bool, false);
        this.f5290d1 = c0143a54;
        h6("FeatureDeliverySendUserId", c0143a54);
        com.roblox.client.flags.a.b bVar28 = new com.roblox.client.flags.a.b("FeatureDeliveryLoggingAndroidThrottlingHundredthPercentage", 0, false);
        this.f5298e1 = bVar28;
        h6("FeatureDeliveryLoggingAndroidThrottlingHundredthPercentage", bVar28);
        com.roblox.client.flags.a.C0143a c0143a55 = new com.roblox.client.flags.a.C0143a("DownloadPersonaSDKImmediately", bool, false);
        this.f5306f1 = c0143a55;
        h6("DownloadPersonaSDKImmediately", c0143a55);
        com.roblox.client.flags.a.b bVar29 = new com.roblox.client.flags.a.b("SkipReportingIsolatedProcessAsInferredCrashReportingThrottleHundredthPercent", 0, false);
        this.f5314g1 = bVar29;
        h6("SkipReportingIsolatedProcessAsInferredCrashReportingThrottleHundredthPercent", bVar29);
        com.roblox.client.flags.a.C0143a c0143a56 = new com.roblox.client.flags.a.C0143a("UpdateRetryAttemptCountBeforeUpload", bool, true);
        this.f5322h1 = c0143a56;
        h6("UpdateRetryAttemptCountBeforeUpload", c0143a56);
        com.roblox.client.flags.a.C0143a c0143a57 = new com.roblox.client.flags.a.C0143a("UseUrlEncodedStringForEventUpload", bool, true);
        this.f5330i1 = c0143a57;
        h6("UseUrlEncodedStringForEventUpload", c0143a57);
        com.roblox.client.flags.a.b bVar30 = new com.roblox.client.flags.a.b("EventUploadBatchSize", 10, false);
        this.f5338j1 = bVar30;
        h6("EventUploadBatchSize", bVar30);
        com.roblox.client.flags.a.C0143a c0143a58 = new com.roblox.client.flags.a.C0143a("NotificationEnableDuplicateNotificationIdMonitoring", bool, false);
        this.f5346k1 = c0143a58;
        h6("NotificationEnableDuplicateNotificationIdMonitoring", c0143a58);
        com.roblox.client.flags.a.b bVar31 = new com.roblox.client.flags.a.b("NotificationPastNotificationIdsCount", 100, false);
        this.f5354l1 = bVar31;
        h6("NotificationPastNotificationIdsCount", bVar31);
        com.roblox.client.flags.a.C0143a c0143a59 = new com.roblox.client.flags.a.C0143a("EnableDeepLinkWhitelist", bool, false);
        this.f5362m1 = c0143a59;
        h6("EnableDeepLinkWhitelist", c0143a59);
        com.roblox.client.flags.a.i iVar21 = new com.roblox.client.flags.a.i("DeepLinkWhitelist", "https://www.roblox.com/commerce/app-redirect", false);
        this.f5370n1 = iVar21;
        h6("DeepLinkWhitelist", iVar21);
        com.roblox.client.flags.a.C0143a c0143a60 = new com.roblox.client.flags.a.C0143a("EnableAppStartFunnelEvents", bool, true);
        this.f5378o1 = c0143a60;
        h6("EnableAppStartFunnelEvents", c0143a60);
        com.roblox.client.flags.a.C0143a c0143a61 = new com.roblox.client.flags.a.C0143a("GmasdkAdReportUnrequestedAd", bool, false);
        this.f5386p1 = c0143a61;
        h6("GmasdkAdReportUnrequestedAd", c0143a61);
        com.roblox.client.flags.a.b bVar32 = new com.roblox.client.flags.a.b("GmaSdkRewardedVideoControlsFadeDelayMs", 3000, false);
        this.f5394q1 = bVar32;
        h6("GmaSdkRewardedVideoControlsFadeDelayMs", bVar32);
        com.roblox.client.flags.a.b bVar33 = new com.roblox.client.flags.a.b("GmaSdkDelayedExitDurationMs", numValueOf, false);
        this.f5402r1 = bVar33;
        h6("GmaSdkDelayedExitDurationMs", bVar33);
        com.roblox.client.flags.a.b bVar34 = new com.roblox.client.flags.a.b("GmasdkRewardCountdownMessageRetentionMsAndroid", 3000, false);
        this.f5410s1 = bVar34;
        h6("GmasdkRewardCountdownMessageRetentionMsAndroid", bVar34);
        com.roblox.client.flags.a.C0143a c0143a62 = new com.roblox.client.flags.a.C0143a("GmaSdkTopRightCloseButton", bool, false);
        this.f5418t1 = c0143a62;
        h6("GmaSdkTopRightCloseButton", c0143a62);
        com.roblox.client.flags.a.C0143a c0143a63 = new com.roblox.client.flags.a.C0143a("LinkingProtocolNewMessageBus", bool, true);
        this.f5426u1 = c0143a63;
        h6("LinkingProtocolNewMessageBus", c0143a63);
        com.roblox.client.flags.a.C0143a c0143a64 = new com.roblox.client.flags.a.C0143a("EnablePushNotificationSettingsMethodsForAndroid", bool, true);
        this.f5434v1 = c0143a64;
        h6("EnablePushNotificationSettingsMethodsForAndroid", c0143a64);
        com.roblox.client.flags.a.C0143a c0143a65 = new com.roblox.client.flags.a.C0143a("EnableSpaceTelemetry", bool, true);
        this.f5442w1 = c0143a65;
        h6("EnableSpaceTelemetry", c0143a65);
        com.roblox.client.flags.a.i iVar22 = new com.roblox.client.flags.a.i("EUDSAReportBaseUrlAndroid", "https://www.roblox.com/illegal-content-reporting?contentURL=%s", false);
        this.f5449x1 = iVar22;
        h6("EUDSAReportBaseUrlAndroid", iVar22);
        com.roblox.client.flags.a.C0143a c0143a66 = new com.roblox.client.flags.a.C0143a("IsUrlRegisteredNewRequestResponse", bool, true);
        this.f5456y1 = c0143a66;
        h6("IsUrlRegisteredNewRequestResponse", c0143a66);
        com.roblox.client.flags.a.C0143a c0143a67 = new com.roblox.client.flags.a.C0143a("GmasdkUseDeferredInstall2", bool, false);
        this.f5464z1 = c0143a67;
        h6("GmasdkUseDeferredInstall2", c0143a67);
        com.roblox.client.flags.a.C0143a c0143a68 = new com.roblox.client.flags.a.C0143a("AndroidArm32MimallocTuning", bool, true);
        this.A1 = c0143a68;
        h6("AndroidArm32MimallocTuning", c0143a68);
        com.roblox.client.flags.a.C0143a c0143a69 = new com.roblox.client.flags.a.C0143a("AndroidArm32MimallocReserveOsMemory512M", bool, true);
        this.B1 = c0143a69;
        h6("AndroidArm32MimallocReserveOsMemory512M", c0143a69);
        com.roblox.client.flags.a.C0143a c0143a70 = new com.roblox.client.flags.a.C0143a("AndroidArm32MimallocReserveOsMemory768M", bool, true);
        this.C1 = c0143a70;
        h6("AndroidArm32MimallocReserveOsMemory768M", c0143a70);
        com.roblox.client.flags.a.C0143a c0143a71 = new com.roblox.client.flags.a.C0143a("AndroidArm32MimallocReserveOsMemory1024M", bool, true);
        this.D1 = c0143a71;
        h6("AndroidArm32MimallocReserveOsMemory1024M", c0143a71);
        com.roblox.client.flags.a.C0143a c0143a72 = new com.roblox.client.flags.a.C0143a("AndroidArm32MimallocLimitOsAlloc", bool, true);
        this.E1 = c0143a72;
        h6("AndroidArm32MimallocLimitOsAlloc", c0143a72);
        com.roblox.client.flags.a.C0143a c0143a73 = new com.roblox.client.flags.a.C0143a("AndroidArm32MimallocDisableEagerCommit", bool, true);
        this.F1 = c0143a73;
        h6("AndroidArm32MimallocDisableEagerCommit", c0143a73);
        com.roblox.client.flags.a.C0143a c0143a74 = new com.roblox.client.flags.a.C0143a("AndroidArm32MimallocDisableArenaEagerCommit", bool, true);
        this.G1 = c0143a74;
        h6("AndroidArm32MimallocDisableArenaEagerCommit", c0143a74);
        com.roblox.client.flags.a.C0143a c0143a75 = new com.roblox.client.flags.a.C0143a("AndroidCollectThermalThrottling", bool, false);
        this.H1 = c0143a75;
        h6("AndroidCollectThermalThrottling", c0143a75);
        com.roblox.client.flags.a.C0143a c0143a76 = new com.roblox.client.flags.a.C0143a("IdentityProtocolConstructLauncherInternally", bool, true);
        this.I1 = c0143a76;
        h6("IdentityProtocolConstructLauncherInternally", c0143a76);
        com.roblox.client.flags.a.b bVar35 = new com.roblox.client.flags.a.b("GmasdkMaxScreenHoldDurationMs", numValueOf, false);
        this.J1 = bVar35;
        h6("GmasdkMaxScreenHoldDurationMs", bVar35);
        com.roblox.client.flags.a.C0143a c0143a77 = new com.roblox.client.flags.a.C0143a("AndroidTestEnableTestDeviceName", bool, false);
        this.K1 = c0143a77;
        h6("AndroidTestEnableTestDeviceName", c0143a77);
        com.roblox.client.flags.a.i iVar23 = new com.roblox.client.flags.a.i("GmaSdkAppPromoAdTypeString", "AppPromo", false);
        this.L1 = iVar23;
        h6("GmaSdkAppPromoAdTypeString", iVar23);
        com.roblox.client.flags.a.b bVar36 = new com.roblox.client.flags.a.b("GoogleAdViewHeartbeatIntervalMs", 1000, false);
        this.M1 = bVar36;
        h6("GoogleAdViewHeartbeatIntervalMs", bVar36);
        com.roblox.client.flags.a.b bVar37 = new com.roblox.client.flags.a.b("GoogleAdViewHeartbeatCount", 1, false);
        this.N1 = bVar37;
        h6("GoogleAdViewHeartbeatCount", bVar37);
        com.roblox.client.flags.a.b bVar38 = new com.roblox.client.flags.a.b("AdsCtrDebuggingLoggingThrottleHundredthsPercent", 0, false);
        this.O1 = bVar38;
        h6("AdsCtrDebuggingLoggingThrottleHundredthsPercent", bVar38);
        com.roblox.client.flags.a.b bVar39 = new com.roblox.client.flags.a.b("EndCardTelemetryThrottleHundredthsPercent", 0, false);
        this.P1 = bVar39;
        h6("EndCardTelemetryThrottleHundredthsPercent", bVar39);
        com.roblox.client.flags.a.C0143a c0143a78 = new com.roblox.client.flags.a.C0143a("MoveIsFreshInstall", bool, false);
        this.Q1 = c0143a78;
        h6("MoveIsFreshInstall", c0143a78);
        com.roblox.client.flags.a.C0143a c0143a79 = new com.roblox.client.flags.a.C0143a("EnableFullDiskUsageTelemetry", bool, false);
        this.R1 = c0143a79;
        h6("EnableFullDiskUsageTelemetry", c0143a79);
        com.roblox.client.flags.a.C0143a c0143a80 = new com.roblox.client.flags.a.C0143a("UseAndroidGooglePaymentsProtocol6", bool, false);
        this.S1 = c0143a80;
        h6("UseAndroidGooglePaymentsProtocol6", c0143a80);
        com.roblox.client.flags.a.C0143a c0143a81 = new com.roblox.client.flags.a.C0143a("UseAndroidGooglePaymentsProtocolForGrantPendingPurchases3", bool, false);
        this.T1 = c0143a81;
        h6("UseAndroidGooglePaymentsProtocolForGrantPendingPurchases3", c0143a81);
        com.roblox.client.flags.a.C0143a c0143a82 = new com.roblox.client.flags.a.C0143a("UseAndroidSamsungPaymentsProtocol5", bool, false);
        this.U1 = c0143a82;
        h6("UseAndroidSamsungPaymentsProtocol5", c0143a82);
        com.roblox.client.flags.a.c cVar7 = new com.roblox.client.flags.a.c("GmaSdkGetQueryInfoTimeoutInSeconds", 3L, false);
        this.V1 = cVar7;
        h6("GmaSdkGetQueryInfoTimeoutInSeconds", cVar7);
        com.roblox.client.flags.a.c cVar8 = new com.roblox.client.flags.a.c("GmaSdkDestroyTimeoutInSeconds", 3L, false);
        this.W1 = cVar8;
        h6("GmaSdkDestroyTimeoutInSeconds", cVar8);
        com.roblox.client.flags.a.c cVar9 = new com.roblox.client.flags.a.c("GmaSdkMakeAdRequestWithStringTimeoutInSeconds", 3L, false);
        this.X1 = cVar9;
        h6("GmaSdkMakeAdRequestWithStringTimeoutInSeconds", cVar9);
        com.roblox.client.flags.a.b bVar40 = new com.roblox.client.flags.a.b("IsolatedGmaSdkBindPriority", 0, false);
        this.Y1 = bVar40;
        h6("IsolatedGmaSdkBindPriority", bVar40);
        com.roblox.client.flags.a.C0143a c0143a83 = new com.roblox.client.flags.a.C0143a("DFFlagSaveMicroProfileScreenshotsInExternalStorage", bool, false);
        this.Z1 = c0143a83;
        h6("DFFlagSaveMicroProfileScreenshotsInExternalStorage", c0143a83);
        com.roblox.client.flags.a.C0143a c0143a84 = new com.roblox.client.flags.a.C0143a("EnableRefreshIntegrityTokenProvider", bool, false);
        this.f5268a2 = c0143a84;
        h6("EnableRefreshIntegrityTokenProvider", c0143a84);
        com.roblox.client.flags.a.C0143a c0143a85 = new com.roblox.client.flags.a.C0143a("DetectUnusualLateNativeActivity", bool, true);
        this.f5275b2 = c0143a85;
        h6("DetectUnusualLateNativeActivity", c0143a85);
        com.roblox.client.flags.a.C0143a c0143a86 = new com.roblox.client.flags.a.C0143a("VideoCaptureEnableAndroidLocalSave2", bool, false);
        this.f5283c2 = c0143a86;
        h6("VideoCaptureEnableAndroidLocalSave2", c0143a86);
        com.roblox.client.flags.a.C0143a c0143a87 = new com.roblox.client.flags.a.C0143a("EnableMagicLoginAndroidDebug", bool, false);
        this.f5291d2 = c0143a87;
        h6("EnableMagicLoginAndroidDebug", c0143a87);
        Integer numValueOf2 = Integer.valueOf(BacktraceMetrics.defaultTimeBetweenRetriesMs);
        com.roblox.client.flags.a.b bVar41 = new com.roblox.client.flags.a.b("MagicLoginSocketTimeout", numValueOf2, false);
        this.f5299e2 = bVar41;
        h6("MagicLoginSocketTimeout", bVar41);
        com.roblox.client.flags.a.C0143a c0143a88 = new com.roblox.client.flags.a.C0143a("UseSamsungPaymentSandboxTestMode", bool, false);
        this.f5307f2 = c0143a88;
        h6("UseSamsungPaymentSandboxTestMode", c0143a88);
        com.roblox.client.flags.a.C0143a c0143a89 = new com.roblox.client.flags.a.C0143a("VideoCaptureEnableAndroidShare", bool, true);
        this.f5315g2 = c0143a89;
        h6("VideoCaptureEnableAndroidShare", c0143a89);
        com.roblox.client.flags.a.C0143a c0143a90 = new com.roblox.client.flags.a.C0143a("EnableMainActivityStartTimeLogging", bool, true);
        this.f5323h2 = c0143a90;
        h6("EnableMainActivityStartTimeLogging", c0143a90);
        com.roblox.client.flags.a.C0143a c0143a91 = new com.roblox.client.flags.a.C0143a("EnableOnDemandModuleCheckOnAppStartup", bool, true);
        this.f5331i2 = c0143a91;
        h6("EnableOnDemandModuleCheckOnAppStartup", c0143a91);
        com.roblox.client.flags.a.C0143a c0143a92 = new com.roblox.client.flags.a.C0143a("AndroidHapticProtocolUpdateStateWithJNI", bool, false);
        this.f5339j2 = c0143a92;
        h6("AndroidHapticProtocolUpdateStateWithJNI", c0143a92);
        com.roblox.client.flags.a.C0143a c0143a93 = new com.roblox.client.flags.a.C0143a("BeginScheduledFlagFetch5", bool, true);
        this.f5347k2 = c0143a93;
        h6("BeginScheduledFlagFetch5", c0143a93);
        com.roblox.client.flags.a.C0143a c0143a94 = new com.roblox.client.flags.a.C0143a("EnableCachedFlagVersionBBackgroundFlush", bool, true);
        this.f5355l2 = c0143a94;
        h6("EnableCachedFlagVersionBBackgroundFlush", c0143a94);
        com.roblox.client.flags.a.C0143a c0143a95 = new com.roblox.client.flags.a.C0143a("UsePersistentFlagCacheStorage", bool, true);
        this.f5363m2 = c0143a95;
        h6("UsePersistentFlagCacheStorage", c0143a95);
        com.roblox.client.flags.a.C0143a c0143a96 = new com.roblox.client.flags.a.C0143a("LogCookieManagerInit", bool, true);
        this.f5371n2 = c0143a96;
        h6("LogCookieManagerInit", c0143a96);
        com.roblox.client.flags.a.c cVar10 = new com.roblox.client.flags.a.c("CustomRewardedVideoCallToActionTimingMS", 0L, false);
        this.f5379o2 = cVar10;
        h6("CustomRewardedVideoCallToActionTimingMS", cVar10);
        com.roblox.client.flags.a.C0143a c0143a97 = new com.roblox.client.flags.a.C0143a("LogScheduledFlagFetchTask", bool, true);
        this.f5387p2 = c0143a97;
        h6("LogScheduledFlagFetchTask", c0143a97);
        com.roblox.client.flags.a.C0143a c0143a98 = new com.roblox.client.flags.a.C0143a("EnableLazyRetryLayoutInflation", bool, false);
        this.f5395q2 = c0143a98;
        h6("EnableLazyRetryLayoutInflation", c0143a98);
        com.roblox.client.flags.a.C0143a c0143a99 = new com.roblox.client.flags.a.C0143a("DeferAppSettingsCacheWrite2", bool, false);
        this.f5403r2 = c0143a99;
        h6("DeferAppSettingsCacheWrite2", c0143a99);
        com.roblox.client.flags.a.b bVar42 = new com.roblox.client.flags.a.b("DeferAppSettingTimerInMs", 20000, false);
        this.f5411s2 = bVar42;
        h6("DeferAppSettingTimerInMs", bVar42);
        com.roblox.client.flags.a.d dVar = new com.roblox.client.flags.a.d("EnableRedirectLegacyRatingPromptToGoogleNativePrompt", bool, true);
        this.f5419t2 = dVar;
        h6("EnableRedirectLegacyRatingPromptToGoogleNativePrompt", dVar);
        com.roblox.client.flags.a.d dVar2 = new com.roblox.client.flags.a.d("EnableLegacyRatingPromptNewDesign", bool, true);
        this.f5427u2 = dVar2;
        h6("EnableLegacyRatingPromptNewDesign", dVar2);
        com.roblox.client.flags.a.d dVar3 = new com.roblox.client.flags.a.d("DisableLegacyRatingPromptSubheader", bool, true);
        this.f5435v2 = dVar3;
        h6("DisableLegacyRatingPromptSubheader", dVar3);
        com.roblox.client.flags.a.d dVar4 = new com.roblox.client.flags.a.d("EnableRedirectLegacyRatingPromptToSurvey", bool, true);
        this.f5443w2 = dVar4;
        h6("EnableRedirectLegacyRatingPromptToSurvey", dVar4);
        com.roblox.client.flags.a.d dVar5 = new com.roblox.client.flags.a.d("DisableLegacyRatingPrompt", bool, true);
        this.f5450x2 = dVar5;
        h6("DisableLegacyRatingPrompt", dVar5);
        com.roblox.client.flags.a.g gVar = new com.roblox.client.flags.a.g("LegacyRatingPromptSurveyUrl", "https://survey.roblox.com/jfe/form/SV_9XitwSm104jB4PQ", false);
        this.f5457y2 = gVar;
        h6("LegacyRatingPromptSurveyUrl", gVar);
        com.roblox.client.flags.a.d dVar6 = new com.roblox.client.flags.a.d("EnableClassicLauncherIconAndroid", bool, true);
        this.f5465z2 = dVar6;
        h6("EnableClassicLauncherIconAndroid", dVar6);
        com.roblox.client.flags.a.d dVar7 = new com.roblox.client.flags.a.d("EnableSetAppIconAndroid", bool, true);
        this.A2 = dVar7;
        h6("EnableSetAppIconAndroid", dVar7);
        com.roblox.client.flags.a.d dVar8 = new com.roblox.client.flags.a.d("EnableCleanUpHalloweenIconAndroid", bool, true);
        this.B2 = dVar8;
        h6("EnableCleanUpHalloweenIconAndroid", dVar8);
        com.roblox.client.flags.a.d dVar9 = new com.roblox.client.flags.a.d("EnableClassicIconChangedDialogAndroid", bool, true);
        this.C2 = dVar9;
        h6("EnableClassicIconChangedDialogAndroid", dVar9);
        com.roblox.client.flags.a.f fVar = new com.roblox.client.flags.a.f("AndroidClassicLauncherIconTelemetryThrottlingPercentage", numValueOf2, false);
        this.D2 = fVar;
        h6("AndroidClassicLauncherIconTelemetryThrottlingPercentage", fVar);
        com.roblox.client.flags.a.d dVar10 = new com.roblox.client.flags.a.d("EnableAppLaunchFirstInstallTime", bool, true);
        this.E2 = dVar10;
        h6("EnableAppLaunchFirstInstallTime", dVar10);
        com.roblox.client.flags.a.d dVar11 = new com.roblox.client.flags.a.d("EnableBaselineProfileVerification", bool, true);
        this.F2 = dVar11;
        h6("EnableBaselineProfileVerification", dVar11);
        com.roblox.client.flags.a.d dVar12 = new com.roblox.client.flags.a.d("EnableJavaCrashClientCrashTelemetry", bool, true);
        this.G2 = dVar12;
        h6("EnableJavaCrashClientCrashTelemetry", dVar12);
        com.roblox.client.flags.a.d dVar13 = new com.roblox.client.flags.a.d("CollectLogcatOnNativeCrashAndroid", bool, true);
        this.H2 = dVar13;
        h6("CollectLogcatOnNativeCrashAndroid", dVar13);
        com.roblox.client.flags.a.d dVar14 = new com.roblox.client.flags.a.d("EnableGameActivity12", bool, true);
        this.I2 = dVar14;
        h6("EnableGameActivity12", dVar14);
        com.roblox.client.flags.a.d dVar15 = new com.roblox.client.flags.a.d("EnableGameActivityParityFixes", bool, true);
        this.J2 = dVar15;
        h6("EnableGameActivityParityFixes", dVar15);
        com.roblox.client.flags.a.d dVar16 = new com.roblox.client.flags.a.d("EnableHasRobloxSubscriptionParse", bool, true);
        this.K2 = dVar16;
        h6("EnableHasRobloxSubscriptionParse", dVar16);
        com.roblox.client.flags.a.d dVar17 = new com.roblox.client.flags.a.d("EnableToastMsgInGActivity", bool, true);
        this.L2 = dVar17;
        h6("EnableToastMsgInGActivity", dVar17);
        com.roblox.client.flags.a.d dVar18 = new com.roblox.client.flags.a.d("EnableAndroidLiveThemeUpdate", bool, true);
        this.M2 = dVar18;
        h6("EnableAndroidLiveThemeUpdate", dVar18);
        com.roblox.client.flags.a.d dVar19 = new com.roblox.client.flags.a.d("EnableRetryDialogTelemetry", bool, false);
        this.N2 = dVar19;
        h6("EnableRetryDialogTelemetry", dVar19);
        com.roblox.client.flags.a.d dVar20 = new com.roblox.client.flags.a.d("DisablePasswordCredentialRegistrationOnTv", bool, true);
        this.O2 = dVar20;
        h6("DisablePasswordCredentialRegistrationOnTv", dVar20);
        com.roblox.client.flags.a.d dVar21 = new com.roblox.client.flags.a.d("EnableMinApiLevelCheckForCredentialManagerOnTv", bool, true);
        this.P2 = dVar21;
        h6("EnableMinApiLevelCheckForCredentialManagerOnTv", dVar21);
        com.roblox.client.flags.a.d dVar22 = new com.roblox.client.flags.a.d("EnableAppsFlyerInitAfterFlagCache", bool2, true);
        this.Q2 = dVar22;
        h6("EnableAppsFlyerInitAfterFlagCache", dVar22);
        com.roblox.client.flags.a.d dVar23 = new com.roblox.client.flags.a.d("EnableDLICBridgeAndroid", bool, true);
        this.R2 = dVar23;
        h6("EnableDLICBridgeAndroid", dVar23);
        com.roblox.client.flags.a.d dVar24 = new com.roblox.client.flags.a.d("EnableDLICInternalIngressSeeding", bool, true);
        this.S2 = dVar24;
        h6("EnableDLICInternalIngressSeeding", dVar24);
        com.roblox.client.flags.a.d dVar25 = new com.roblox.client.flags.a.d("EnableDLICSeedAndroidWebView", bool, false);
        this.T2 = dVar25;
        h6("EnableDLICSeedAndroidWebView", dVar25);
        com.roblox.client.flags.a.d dVar26 = new com.roblox.client.flags.a.d("EnableDLICReportReceivedUnifyAndroid", bool, false);
        this.U2 = dVar26;
        h6("EnableDLICReportReceivedUnifyAndroid", dVar26);
        com.roblox.client.flags.a.d dVar27 = new com.roblox.client.flags.a.d("EnableExternalOriginOnlyUrlRegistration", bool, false);
        this.V2 = dVar27;
        h6("EnableExternalOriginOnlyUrlRegistration", dVar27);
        com.roblox.client.flags.a.d dVar28 = new com.roblox.client.flags.a.d("EnableDeferredDeeplinkResolutionFallbackAndroid", bool2, true);
        this.W2 = dVar28;
        h6("EnableDeferredDeeplinkResolutionFallbackAndroid", dVar28);
        com.roblox.client.flags.a.d dVar29 = new com.roblox.client.flags.a.d("EnableDeeplinkCodeParamMergeAndroid", bool, true);
        this.X2 = dVar29;
        h6("EnableDeeplinkCodeParamMergeAndroid", dVar29);
        com.roblox.client.flags.a.d dVar30 = new com.roblox.client.flags.a.d("EnableDeeplinkCodeParamMergeBeforeSeedAndroid", bool, true);
        this.Y2 = dVar30;
        h6("EnableDeeplinkCodeParamMergeBeforeSeedAndroid", dVar30);
        com.roblox.client.flags.a.d dVar31 = new com.roblox.client.flags.a.d("DropHeldDeeplinksAndroid", bool, false);
        this.Z2 = dVar31;
        h6("DropHeldDeeplinksAndroid", dVar31);
        com.roblox.client.flags.a.d dVar32 = new com.roblox.client.flags.a.d("EnableOpenExternalBrowserDeepLinkAndroid", bool, true);
        this.f5269a3 = dVar32;
        h6("EnableOpenExternalBrowserDeepLinkAndroid", dVar32);
        com.roblox.client.flags.a.f fVar2 = new com.roblox.client.flags.a.f("DelayedAppsFlyerStartConsentBackstopSeconds", 600, false);
        this.f5276b3 = fVar2;
        h6("DelayedAppsFlyerStartConsentBackstopSeconds", fVar2);
        com.roblox.client.flags.a.f fVar3 = new com.roblox.client.flags.a.f("DelayedAppsFlyerStartEligibilityTtlSeconds", 2592000, false);
        this.f5284c3 = fVar3;
        h6("DelayedAppsFlyerStartEligibilityTtlSeconds", fVar3);
        com.roblox.client.flags.a.d dVar33 = new com.roblox.client.flags.a.d("EnableDelayedAppsFlyerStartAttributionBlock", bool2, true);
        this.f5292d3 = dVar33;
        h6("EnableDelayedAppsFlyerStartAttributionBlock", dVar33);
        com.roblox.client.flags.a.d dVar34 = new com.roblox.client.flags.a.d("EnableAndroidUnlockOrientation", bool, true);
        this.f5300e3 = dVar34;
        h6("EnableAndroidUnlockOrientation", dVar34);
        com.roblox.client.flags.a.d dVar35 = new com.roblox.client.flags.a.d("EnableAndroidUnlockOrientationTabletOnly", bool, true);
        this.f5308f3 = dVar35;
        h6("EnableAndroidUnlockOrientationTabletOnly", dVar35);
        com.roblox.client.flags.a.d dVar36 = new com.roblox.client.flags.a.d("EnableAndroidBinaryChannelDownloadTiming", bool, true);
        this.f5316g3 = dVar36;
        h6("EnableAndroidBinaryChannelDownloadTiming", dVar36);
        com.roblox.client.flags.a.d dVar37 = new com.roblox.client.flags.a.d("AndroidMouseLockButtonFix", bool, false);
        this.f5324h3 = dVar37;
        h6("AndroidMouseLockButtonFix", dVar37);
        com.roblox.client.flags.a.d dVar38 = new com.roblox.client.flags.a.d("TextBoxSelectableWhenNotEditable", bool, false);
        this.f5332i3 = dVar38;
        h6("TextBoxSelectableWhenNotEditable", dVar38);
        com.roblox.client.flags.a.d dVar39 = new com.roblox.client.flags.a.d("TextBoxTextEditableSignal", bool, false);
        this.f5340j3 = dVar39;
        h6("TextBoxTextEditableSignal", dVar39);
        com.roblox.client.flags.a.d dVar40 = new com.roblox.client.flags.a.d("AndroidTouchUnbufferedDispatch", bool, true);
        this.f5348k3 = dVar40;
        h6("AndroidTouchUnbufferedDispatch", dVar40);
        com.roblox.client.flags.a.d dVar41 = new com.roblox.client.flags.a.d("EnableNativeLibResolvePathTelemetry", bool, true);
        this.f5356l3 = dVar41;
        h6("EnableNativeLibResolvePathTelemetry", dVar41);
        com.roblox.client.flags.a.f fVar4 = new com.roblox.client.flags.a.f("NativeLibResolvePathTelemetryThrottlingHundredthPercentage", numValueOf2, false);
        this.f5364m3 = fVar4;
        h6("NativeLibResolvePathTelemetryThrottlingHundredthPercentage", fVar4);
        com.roblox.client.flags.a.d dVar42 = new com.roblox.client.flags.a.d("EnableFeatureDeliveryRetry", bool, true);
        this.f5372n3 = dVar42;
        h6("EnableFeatureDeliveryRetry", dVar42);
        com.roblox.client.flags.a.d dVar43 = new com.roblox.client.flags.a.d("DebugFeatureDeliveryUseFakeManager", bool, true);
        this.f5380o3 = dVar43;
        h6("DebugFeatureDeliveryUseFakeManager", dVar43);
        com.roblox.client.flags.a.d dVar44 = new com.roblox.client.flags.a.d("DeleteRoomDBEventsOnClientError", bool, true);
        this.f5388p3 = dVar44;
        h6("DeleteRoomDBEventsOnClientError", dVar44);
        com.roblox.client.flags.a.d dVar45 = new com.roblox.client.flags.a.d("UseGsonForEventUpload", bool, true);
        this.f5396q3 = dVar45;
        h6("UseGsonForEventUpload", dVar45);
        com.roblox.client.flags.a.d dVar46 = new com.roblox.client.flags.a.d("EnablePinnedShortcutsOnHomeScreenAndroid4", bool, true);
        this.f5404r3 = dVar46;
        h6("EnablePinnedShortcutsOnHomeScreenAndroid4", dVar46);
        com.roblox.client.flags.a.g gVar2 = new com.roblox.client.flags.a.g("PinShortcutSilentManufacturers1", "huawei,xiaomi,oppo,vivo,realme", false);
        this.f5412s3 = gVar2;
        h6("PinShortcutSilentManufacturers1", gVar2);
        com.roblox.client.flags.a.d dVar47 = new com.roblox.client.flags.a.d("EnableShortcutStableTargetActivityAndroid2", bool, true);
        this.f5420t3 = dVar47;
        h6("EnableShortcutStableTargetActivityAndroid2", dVar47);
        com.roblox.client.flags.a.d dVar48 = new com.roblox.client.flags.a.d("EnableEdpPinnedShortcutsAndroid", bool, true);
        this.f5428u3 = dVar48;
        h6("EnableEdpPinnedShortcutsAndroid", dVar48);
        com.roblox.client.flags.a.d dVar49 = new com.roblox.client.flags.a.d("EnableRecreatePinShortcutCoroutine", bool, true);
        this.f5436v3 = dVar49;
        h6("EnableRecreatePinShortcutCoroutine", dVar49);
        com.roblox.client.flags.a.d dVar50 = new com.roblox.client.flags.a.d("EnableRecentlyPlayedWidgetAndroidShell6", bool, true);
        this.f5444w3 = dVar50;
        h6("EnableRecentlyPlayedWidgetAndroidShell6", dVar50);
        com.roblox.client.flags.a.d dVar51 = new com.roblox.client.flags.a.d("EnableRecentlyPlayedWidgetCounter", bool, true);
        this.f5451x3 = dVar51;
        h6("EnableRecentlyPlayedWidgetCounter", dVar51);
        com.roblox.client.flags.a.d dVar52 = new com.roblox.client.flags.a.d("EnableRecentlyPlayedWidgetOpenDeeplink", bool, true);
        this.f5458y3 = dVar52;
        h6("EnableRecentlyPlayedWidgetOpenDeeplink", dVar52);
        com.roblox.client.flags.a.d dVar53 = new com.roblox.client.flags.a.d("AndroidEnableFlushingTelemetryV1Events", bool, true);
        this.f5466z3 = dVar53;
        h6("AndroidEnableFlushingTelemetryV1Events", dVar53);
        com.roblox.client.flags.a.d dVar54 = new com.roblox.client.flags.a.d("AndroidEnableFlushingTelemetryV2Events", bool, true);
        this.A3 = dVar54;
        h6("AndroidEnableFlushingTelemetryV2Events", dVar54);
        com.roblox.client.flags.a.d dVar55 = new com.roblox.client.flags.a.d("AndroidEnableTelemetryFlushWorker2", bool, true);
        this.B3 = dVar55;
        h6("AndroidEnableTelemetryFlushWorker2", dVar55);
        com.roblox.client.flags.a.d dVar56 = new com.roblox.client.flags.a.d("EnableWebRtcOnDemandPathLoad", bool, true);
        this.C3 = dVar56;
        h6("EnableWebRtcOnDemandPathLoad", dVar56);
        com.roblox.client.flags.a.f fVar5 = new com.roblox.client.flags.a.f("AndroidPinnedShortcutActionThrottlingPercentage", numValueOf2, false);
        this.D3 = fVar5;
        h6("AndroidPinnedShortcutActionThrottlingPercentage", fVar5);
        com.roblox.client.flags.a.d dVar57 = new com.roblox.client.flags.a.d("DebugForceShowEndCardAndroid", bool, false);
        this.E3 = dVar57;
        h6("DebugForceShowEndCardAndroid", dVar57);
        com.roblox.client.flags.a.f fVar6 = new com.roblox.client.flags.a.f("DebugEndCardDurationMsAndroid", 0, false);
        this.F3 = fVar6;
        h6("DebugEndCardDurationMsAndroid", fVar6);
        com.roblox.client.flags.a.d dVar58 = new com.roblox.client.flags.a.d("DebugHideEndCardIconAndroid", bool, false);
        this.G3 = dVar58;
        h6("DebugHideEndCardIconAndroid", dVar58);
        com.roblox.client.flags.a.d dVar59 = new com.roblox.client.flags.a.d("EnableNewLocalStorageTelemetry", bool, true);
        this.H3 = dVar59;
        h6("EnableNewLocalStorageTelemetry", dVar59);
        com.roblox.client.flags.a.d dVar60 = new com.roblox.client.flags.a.d("EnableCLI198900_2", bool, true);
        this.I3 = dVar60;
        h6("EnableCLI198900_2", dVar60);
        com.roblox.client.flags.a.f fVar7 = new com.roblox.client.flags.a.f("IsolatedAdsBacktraceCrashUploadPercent", 0, false);
        this.J3 = fVar7;
        h6("IsolatedAdsBacktraceCrashUploadPercent", fVar7);
        com.roblox.client.flags.a.f fVar8 = new com.roblox.client.flags.a.f("VersionBCacheStatusThrottlePercentage", 10, false);
        this.K3 = fVar8;
        h6("VersionBCacheStatusThrottlePercentage", fVar8);
        com.roblox.client.flags.a.f fVar9 = new com.roblox.client.flags.a.f("IsolatedAdsBacktraceAnrUploadPercent", 0, false);
        this.L3 = fVar9;
        h6("IsolatedAdsBacktraceAnrUploadPercent", fVar9);
        com.roblox.client.flags.a.f fVar10 = new com.roblox.client.flags.a.f("IsolatedAdsBacktraceAnrTimeoutMs", numValueOf, false);
        this.M3 = fVar10;
        h6("IsolatedAdsBacktraceAnrTimeoutMs", fVar10);
        com.roblox.client.flags.a.g gVar3 = new com.roblox.client.flags.a.g("AdCtaExternalExitActivitySuffix", "MarketDeepLinkHandlerActivity", false);
        this.N3 = gVar3;
        h6("AdCtaExternalExitActivitySuffix", gVar3);
        com.roblox.client.flags.a.d dVar61 = new com.roblox.client.flags.a.d("UseABCEndpoint", bool, true);
        this.O3 = dVar61;
        h6("UseABCEndpoint", dVar61);
        com.roblox.client.flags.a.d dVar62 = new com.roblox.client.flags.a.d("UseAndroidGooglePaymentsProtocolQueryPurchases", bool, true);
        this.P3 = dVar62;
        h6("UseAndroidGooglePaymentsProtocolQueryPurchases", dVar62);
        com.roblox.client.flags.a.d dVar63 = new com.roblox.client.flags.a.d("UseAndroidPaymentsProtocolSurfacePreparePaymentErrorMessages", bool, false);
        this.Q3 = dVar63;
        h6("UseAndroidPaymentsProtocolSurfacePreparePaymentErrorMessages", dVar63);
        com.roblox.client.flags.a.d dVar64 = new com.roblox.client.flags.a.d("UseAndroidPaymentsProtocolThrobber", bool, true);
        this.R3 = dVar64;
        h6("UseAndroidPaymentsProtocolThrobber", dVar64);
        com.roblox.client.flags.a.d dVar65 = new com.roblox.client.flags.a.d("UseAndroidPaymentsProtocolThreadsafeSessionId", bool, true);
        this.S3 = dVar65;
        h6("UseAndroidPaymentsProtocolThreadsafeSessionId", dVar65);
        com.roblox.client.flags.a.d dVar66 = new com.roblox.client.flags.a.d("FixAndroidPaymentsProtocolPurchaseFinishedNpe", bool, true);
        this.T3 = dVar66;
        h6("FixAndroidPaymentsProtocolPurchaseFinishedNpe", dVar66);
        com.roblox.client.flags.a.d dVar67 = new com.roblox.client.flags.a.d("AndroidPaymentsProtocolUsePurchaseListenerForUserCancellation", bool, true);
        this.U3 = dVar67;
        h6("AndroidPaymentsProtocolUsePurchaseListenerForUserCancellation", dVar67);
        com.roblox.client.flags.a.d dVar68 = new com.roblox.client.flags.a.d("EnableAndroidGooglePaymentsProtocolV2V2", bool, true);
        this.V3 = dVar68;
        h6("EnableAndroidGooglePaymentsProtocolV2V2", dVar68);
        com.roblox.client.flags.a.d dVar69 = new com.roblox.client.flags.a.d("EnableAndroidPaymentsProtocolPaymentSessionId", bool, true);
        this.W3 = dVar69;
        h6("EnableAndroidPaymentsProtocolPaymentSessionId", dVar69);
        com.roblox.client.flags.a.d dVar70 = new com.roblox.client.flags.a.d("EnableNativePurchaseWithContext", bool, true);
        this.X3 = dVar70;
        h6("EnableNativePurchaseWithContext", dVar70);
        com.roblox.client.flags.a.d dVar71 = new com.roblox.client.flags.a.d("FixAndroidWebDialogPaymentSessionId", bool, true);
        this.Y3 = dVar71;
        h6("FixAndroidWebDialogPaymentSessionId", dVar71);
        com.roblox.client.flags.a.d dVar72 = new com.roblox.client.flags.a.d("FixSamsungWebDialogPaymentSessionId", bool, true);
        this.Z3 = dVar72;
        h6("FixSamsungWebDialogPaymentSessionId", dVar72);
        com.roblox.client.flags.a.d dVar73 = new com.roblox.client.flags.a.d("FixSamsungWebFragmentPaymentSessionId", bool, true);
        this.f5270a4 = dVar73;
        h6("FixSamsungWebFragmentPaymentSessionId", dVar73);
        com.roblox.client.flags.a.d dVar74 = new com.roblox.client.flags.a.d("BlackbirdSubscriptionOfferIdEnabled2", bool, false);
        this.f5277b4 = dVar74;
        h6("BlackbirdSubscriptionOfferIdEnabled2", dVar74);
        com.roblox.client.flags.a.d dVar75 = new com.roblox.client.flags.a.d("AndroidSubscriptionFailOnOfferIdNotFound", bool, false);
        this.f5285c4 = dVar75;
        h6("AndroidSubscriptionFailOnOfferIdNotFound", dVar75);
        com.roblox.client.flags.a.d dVar76 = new com.roblox.client.flags.a.d("BlackbirdEnableWebviewSubscriptionPurchaseGoogleV2", bool, false);
        this.f5293d4 = dVar76;
        h6("BlackbirdEnableWebviewSubscriptionPurchaseGoogleV2", dVar76);
        com.roblox.client.flags.a.f fVar11 = new com.roblox.client.flags.a.f("GmaSdkInitTimeoutInSeconds", 20, false);
        this.f5301e4 = fVar11;
        h6("GmaSdkInitTimeoutInSeconds", fVar11);
        com.roblox.client.flags.a.d dVar77 = new com.roblox.client.flags.a.d("EnableAppRatingPromptAndroidShell3", bool, true);
        this.f5309f4 = dVar77;
        h6("EnableAppRatingPromptAndroidShell3", dVar77);
        com.roblox.client.flags.a.d dVar78 = new com.roblox.client.flags.a.d("EnableAppRatingPromptSamsung", bool, false);
        this.f5317g4 = dVar78;
        h6("EnableAppRatingPromptSamsung", dVar78);
        com.roblox.client.flags.a.f fVar12 = new com.roblox.client.flags.a.f("AppRatingPromptErrorEventThrottlingHundredthPercentage", 0, false);
        this.f5325h4 = fVar12;
        h6("AppRatingPromptErrorEventThrottlingHundredthPercentage", fVar12);
        com.roblox.client.flags.a.d dVar79 = new com.roblox.client.flags.a.d("EnableGooglePlayGamesIntegration9", bool, true);
        this.f5333i4 = dVar79;
        h6("EnableGooglePlayGamesIntegration9", dVar79);
        com.roblox.client.flags.a.d dVar80 = new com.roblox.client.flags.a.d("EnablePGSAnalytics3", bool, true);
        this.f5341j4 = dVar80;
        h6("EnablePGSAnalytics3", dVar80);
        com.roblox.client.flags.a.d dVar81 = new com.roblox.client.flags.a.d("UseMinutesForPGSStreaks", bool, true);
        this.f5349k4 = dVar81;
        h6("UseMinutesForPGSStreaks", dVar81);
        com.roblox.client.flags.a.d dVar82 = new com.roblox.client.flags.a.d("PgsForceEnabled", bool, true);
        this.f5357l4 = dVar82;
        h6("PgsForceEnabled", dVar82);
        com.roblox.client.flags.a.d dVar83 = new com.roblox.client.flags.a.d("PgsExperimentEnabled2", bool, true);
        this.f5365m4 = dVar83;
        h6("PgsExperimentEnabled2", dVar83);
        com.roblox.client.flags.a.d dVar84 = new com.roblox.client.flags.a.d("PgsRolloutEnabled4", bool, true);
        this.f5373n4 = dVar84;
        h6("PgsRolloutEnabled4", dVar84);
        com.roblox.client.flags.a.d dVar85 = new com.roblox.client.flags.a.d("UsesPgsModuleForCountryEligibility3", bool, true);
        this.f5381o4 = dVar85;
        h6("UsesPgsModuleForCountryEligibility3", dVar85);
        com.roblox.client.flags.a.d dVar86 = new com.roblox.client.flags.a.d("PgsTreatmentActive", bool, true);
        this.f5389p4 = dVar86;
        h6("PgsTreatmentActive", dVar86);
        com.roblox.client.flags.a.f fVar13 = new com.roblox.client.flags.a.f("PgsExperimentPercent", 0, false);
        this.f5397q4 = fVar13;
        h6("PgsExperimentPercent", fVar13);
        com.roblox.client.flags.a.g gVar4 = new com.roblox.client.flags.a.g("PgsExperimentCountries", "ID,MX,GB,FR", false);
        this.f5405r4 = gVar4;
        h6("PgsExperimentCountries", gVar4);
        com.roblox.client.flags.a.g gVar5 = new com.roblox.client.flags.a.g("PgsRolloutCountries", "TH,IN,MX,BR,ID,JP,DE,GB,KR", false);
        this.f5413s4 = gVar5;
        h6("PgsRolloutCountries", gVar5);
        com.roblox.client.flags.a.d dVar87 = new com.roblox.client.flags.a.d("EnableAppAgeSignalsOnAndroid", bool, true);
        this.f5421t4 = dVar87;
        h6("EnableAppAgeSignalsOnAndroid", dVar87);
        com.roblox.client.flags.a.d dVar88 = new com.roblox.client.flags.a.d("AppAgeSignalsUseFakeManager", bool, true);
        this.f5429u4 = dVar88;
        h6("AppAgeSignalsUseFakeManager", dVar88);
        com.roblox.client.flags.a.g gVar6 = new com.roblox.client.flags.a.g("AppAgeSignalsFakeUserStatus", "VERIFIED", false);
        this.f5437v4 = gVar6;
        h6("AppAgeSignalsFakeUserStatus", gVar6);
        com.roblox.client.flags.a.f fVar14 = new com.roblox.client.flags.a.f("AppAgeSignalsFakeAgeLower", 18, false);
        this.f5445w4 = fVar14;
        h6("AppAgeSignalsFakeAgeLower", fVar14);
        com.roblox.client.flags.a.f fVar15 = new com.roblox.client.flags.a.f("AppAgeSignalsFakeAgeUpper", 99, false);
        this.f5452x4 = fVar15;
        h6("AppAgeSignalsFakeAgeUpper", fVar15);
        com.roblox.client.flags.a.d dVar89 = new com.roblox.client.flags.a.d("EnableAndroidShareViaFileProvider", bool, true);
        this.f5459y4 = dVar89;
        h6("EnableAndroidShareViaFileProvider", dVar89);
        com.roblox.client.flags.a.d dVar90 = new com.roblox.client.flags.a.d("EnableCookieManagerVersionB6", bool, true);
        this.f5467z4 = dVar90;
        h6("EnableCookieManagerVersionB6", dVar90);
        com.roblox.client.flags.a.f fVar16 = new com.roblox.client.flags.a.f("CookieVersionBLogoutBacktracePercentage", 5, false);
        this.A4 = fVar16;
        h6("CookieVersionBLogoutBacktracePercentage", fVar16);
        com.roblox.client.flags.a.d dVar91 = new com.roblox.client.flags.a.d("HardcodeWebViewUserAgent", bool, true);
        this.B4 = dVar91;
        h6("HardcodeWebViewUserAgent", dVar91);
        com.roblox.client.flags.a.d dVar92 = new com.roblox.client.flags.a.d("EnableWebViewCameraPermission", bool, true);
        this.C4 = dVar92;
        h6("EnableWebViewCameraPermission", dVar92);
        com.roblox.client.flags.a.d dVar93 = new com.roblox.client.flags.a.d("EnableAndroidDevBranchConfiguration", bool, true);
        this.D4 = dVar93;
        h6("EnableAndroidDevBranchConfiguration", dVar93);
        com.roblox.client.flags.a.d dVar94 = new com.roblox.client.flags.a.d("EnableRegisterBackgroundPushSettingsReportingOnPush", bool, true);
        this.E4 = dVar94;
        h6("EnableRegisterBackgroundPushSettingsReportingOnPush", dVar94);
        com.roblox.client.flags.a.d dVar95 = new com.roblox.client.flags.a.d("DisablePauseSessionInPersonaFlow", bool, true);
        this.F4 = dVar95;
        h6("DisablePauseSessionInPersonaFlow", dVar95);
        com.roblox.client.flags.a.d dVar96 = new com.roblox.client.flags.a.d("EnablePasskeySilentUpgradeForAndroid", bool, true);
        this.G4 = dVar96;
        h6("EnablePasskeySilentUpgradeForAndroid", dVar96);
        com.roblox.client.flags.a.d dVar97 = new com.roblox.client.flags.a.d("AddPowerSaverStats", bool, true);
        this.H4 = dVar97;
        h6("AddPowerSaverStats", dVar97);
        com.roblox.client.flags.a.f fVar17 = new com.roblox.client.flags.a.f("ScheduledFlagFetchPeriodMinutes", Integer.valueOf(MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE), false);
        this.I4 = fVar17;
        h6("ScheduledFlagFetchPeriodMinutes", fVar17);
        com.roblox.client.flags.a.f fVar18 = new com.roblox.client.flags.a.f("ScheduledFlagFetchPeriodFlexMinutes", 10, false);
        this.J4 = fVar18;
        h6("ScheduledFlagFetchPeriodFlexMinutes", fVar18);
        com.roblox.client.flags.a.d dVar98 = new com.roblox.client.flags.a.d("EnableAndroidHybridModuleTelemetry", bool, false);
        this.K4 = dVar98;
        h6("EnableAndroidHybridModuleTelemetry", dVar98);
        com.roblox.client.flags.a.d dVar99 = new com.roblox.client.flags.a.d("DisableAndroidDialogsHybridModule", bool, false);
        this.L4 = dVar99;
        h6("DisableAndroidDialogsHybridModule", dVar99);
        com.roblox.client.flags.a.d dVar100 = new com.roblox.client.flags.a.d("DisableAndroidAnalyticsHybridModule", bool, false);
        this.M4 = dVar100;
        h6("DisableAndroidAnalyticsHybridModule", dVar100);
        com.roblox.client.flags.a.d dVar101 = new com.roblox.client.flags.a.d("EnableNetworkStatusObserving", bool, true);
        this.N4 = dVar101;
        h6("EnableNetworkStatusObserving", dVar101);
        com.roblox.client.flags.a.d dVar102 = new com.roblox.client.flags.a.d("EnableConnectivityV2ForAndroid", bool, true);
        this.O4 = dVar102;
        h6("EnableConnectivityV2ForAndroid", dVar102);
        com.roblox.client.flags.a.d dVar103 = new com.roblox.client.flags.a.d("ConnectivityV2Metering", bool, true);
        this.P4 = dVar103;
        h6("ConnectivityV2Metering", dVar103);
        com.roblox.client.flags.a.d dVar104 = new com.roblox.client.flags.a.d("EnableSystemDialogHandlerInAndroid", bool, true);
        this.Q4 = dVar104;
        h6("EnableSystemDialogHandlerInAndroid", dVar104);
        com.roblox.client.flags.a.d dVar105 = new com.roblox.client.flags.a.d("EnableDeviceDisplayHandlerInAndroid", bool, true);
        this.R4 = dVar105;
        h6("EnableDeviceDisplayHandlerInAndroid", dVar105);
        com.roblox.client.flags.a.d dVar106 = new com.roblox.client.flags.a.d("EnableDisplayWakeLock", bool, true);
        this.S4 = dVar106;
        h6("EnableDisplayWakeLock", dVar106);
        com.roblox.client.flags.a.d dVar107 = new com.roblox.client.flags.a.d("EnableAppPlatformQoSEmergencyOnAndroidStartup", bool, true);
        this.T4 = dVar107;
        h6("EnableAppPlatformQoSEmergencyOnAndroidStartup", dVar107);
        com.roblox.client.flags.a.d dVar108 = new com.roblox.client.flags.a.d("EnableInitHelperNativeWrappers", bool, true);
        this.U4 = dVar108;
        h6("EnableInitHelperNativeWrappers", dVar108);
        com.roblox.client.flags.a.d dVar109 = new com.roblox.client.flags.a.d("EnableAdditionalTTIEvents", bool, true);
        this.V4 = dVar109;
        h6("EnableAdditionalTTIEvents", dVar109);
        com.roblox.client.flags.a.d dVar110 = new com.roblox.client.flags.a.d("EnableAttachBaseContextMilestone", bool, true);
        this.W4 = dVar110;
        h6("EnableAttachBaseContextMilestone", dVar110);
        com.roblox.client.flags.a.d dVar111 = new com.roblox.client.flags.a.d("EnableAndroidTTISetupMilestones", bool, true);
        this.X4 = dVar111;
        h6("EnableAndroidTTISetupMilestones", dVar111);
        com.roblox.client.flags.a.d dVar112 = new com.roblox.client.flags.a.d("RefreshAndroidCachedFlagsOnBackgroundFetch", bool, true);
        this.Y4 = dVar112;
        h6("RefreshAndroidCachedFlagsOnBackgroundFetch", dVar112);
        com.roblox.client.flags.a.d dVar113 = new com.roblox.client.flags.a.d("EnableSendNotificationSettingsOnPushAck", bool, true);
        this.Z4 = dVar113;
        h6("EnableSendNotificationSettingsOnPushAck", dVar113);
        com.roblox.client.flags.a.d dVar114 = new com.roblox.client.flags.a.d("RefreshRbxKeyboardAutofill2", bool, true);
        this.f5271a5 = dVar114;
        h6("RefreshRbxKeyboardAutofill2", dVar114);
        com.roblox.client.flags.a.d dVar115 = new com.roblox.client.flags.a.d("EnableAndroidPasskeyAvailabilityPreflight", bool, true);
        this.f5278b5 = dVar115;
        h6("EnableAndroidPasskeyAvailabilityPreflight", dVar115);
        com.roblox.client.flags.a.d dVar116 = new com.roblox.client.flags.a.d("FixKeyboardMinAdjustment", bool, true);
        this.f5286c5 = dVar116;
        h6("FixKeyboardMinAdjustment", dVar116);
        com.roblox.client.flags.a.d dVar117 = new com.roblox.client.flags.a.d("FixKeyboardPositionReportingOffset", bool, true);
        this.f5294d5 = dVar117;
        h6("FixKeyboardPositionReportingOffset", dVar117);
        com.roblox.client.flags.a.d dVar118 = new com.roblox.client.flags.a.d("VisiblePasswordIsText", bool, true);
        this.f5302e5 = dVar118;
        h6("VisiblePasswordIsText", dVar118);
        com.roblox.client.flags.a.d dVar119 = new com.roblox.client.flags.a.d("EnableAndroidSafeAreaInsetsInLuaApp", bool, true);
        this.f5310f5 = dVar119;
        h6("EnableAndroidSafeAreaInsetsInLuaApp", dVar119);
        com.roblox.client.flags.a.d dVar120 = new com.roblox.client.flags.a.d("EnableAndroidNavBarInSafeAreaInsets", bool, true);
        this.f5318g5 = dVar120;
        h6("EnableAndroidNavBarInSafeAreaInsets", dVar120);
        com.roblox.client.flags.a.d dVar121 = new com.roblox.client.flags.a.d("ExcludeKeyboardFromSafeAreaInsets", bool, true);
        this.f5326h5 = dVar121;
        h6("ExcludeKeyboardFromSafeAreaInsets", dVar121);
        com.roblox.client.flags.a.d dVar122 = new com.roblox.client.flags.a.d("AndroidConsumeContainerInsets", bool, true);
        this.f5334i5 = dVar122;
        h6("AndroidConsumeContainerInsets", dVar122);
        com.roblox.client.flags.a.d dVar123 = new com.roblox.client.flags.a.d("AndroidUseTypedWindowInsets", bool, true);
        this.f5342j5 = dVar123;
        h6("AndroidUseTypedWindowInsets", dVar123);
        com.roblox.client.flags.a.d dVar124 = new com.roblox.client.flags.a.d("AndroidKeyboardHeightFromImeInsets", bool, true);
        this.f5350k5 = dVar124;
        h6("AndroidKeyboardHeightFromImeInsets", dVar124);
        com.roblox.client.flags.a.d dVar125 = new com.roblox.client.flags.a.d("AndroidWebViewInsetDrivenOffset", bool, true);
        this.f5358l5 = dVar125;
        h6("AndroidWebViewInsetDrivenOffset", dVar125);
        com.roblox.client.flags.a.d dVar126 = new com.roblox.client.flags.a.d("EnableAndroidPasswordSuggestion2", bool, true);
        this.f5366m5 = dVar126;
        h6("EnableAndroidPasswordSuggestion2", dVar126);
        com.roblox.client.flags.a.d dVar127 = new com.roblox.client.flags.a.d("EnableAutofillEvents", bool, true);
        this.f5374n5 = dVar127;
        h6("EnableAutofillEvents", dVar127);
        com.roblox.client.flags.a.g gVar7 = new com.roblox.client.flags.a.g("DebugNativeAdProcessContextOverride", BuildConfig.FLAVOR, false);
        this.f5382o5 = gVar7;
        h6("DebugNativeAdProcessContextOverride", gVar7);
        com.roblox.client.flags.a.g gVar8 = new com.roblox.client.flags.a.g("DebugRewardedAdProcessContextOverride", BuildConfig.FLAVOR, false);
        this.f5390p5 = gVar8;
        h6("DebugRewardedAdProcessContextOverride", gVar8);
        com.roblox.client.flags.a.f fVar19 = new com.roblox.client.flags.a.f("RewardedAdExperimentVariantMismatchTelemetryHundredthsPercent", 0, false);
        this.f5398q5 = fVar19;
        h6("RewardedAdExperimentVariantMismatchTelemetryHundredthsPercent", fVar19);
        com.roblox.client.flags.a.d dVar128 = new com.roblox.client.flags.a.d("CloseDeeplinkFlowEarlier", bool, false);
        this.f5406r5 = dVar128;
        h6("CloseDeeplinkFlowEarlier", dVar128);
        com.roblox.client.flags.a.d dVar129 = new com.roblox.client.flags.a.d("EnableDeeplinkReceivedExtendedCoverageAndroid2", bool, true);
        this.f5414s5 = dVar129;
        h6("EnableDeeplinkReceivedExtendedCoverageAndroid2", dVar129);
        com.roblox.client.flags.a.d dVar130 = new com.roblox.client.flags.a.d("PassFlagSignatureToEngine", bool, true);
        this.f5422t5 = dVar130;
        h6("PassFlagSignatureToEngine", dVar130);
        com.roblox.client.flags.a.d dVar131 = new com.roblox.client.flags.a.d("EnableChannelsMigrationSecondPhase3", bool, true);
        this.f5430u5 = dVar131;
        h6("EnableChannelsMigrationSecondPhase3", dVar131);
        com.roblox.client.flags.a.d dVar132 = new com.roblox.client.flags.a.d("EnableFriendPresenceNotificationChannel", bool, true);
        this.f5438v5 = dVar132;
        h6("EnableFriendPresenceNotificationChannel", dVar132);
        com.roblox.client.flags.a.d dVar133 = new com.roblox.client.flags.a.d("EnableAndroidCallPushNotification", bool, true);
        this.w5 = dVar133;
        h6("EnableAndroidCallPushNotification", dVar133);
        com.roblox.client.flags.a.d dVar134 = new com.roblox.client.flags.a.d("EnableWarmPushNotificationLaunch", bool, true);
        this.x5 = dVar134;
        h6("EnableWarmPushNotificationLaunch", dVar134);
        com.roblox.client.flags.a.d dVar135 = new com.roblox.client.flags.a.d("EnableVesta", bool, true);
        this.f5460y5 = dVar135;
        h6("EnableVesta", dVar135);
        com.roblox.client.flags.a.d dVar136 = new com.roblox.client.flags.a.d("EnableSamsungIapNewVersionWithObfuscatedProfileId", bool, true);
        this.f5468z5 = dVar136;
        h6("EnableSamsungIapNewVersionWithObfuscatedProfileId", dVar136);
        com.roblox.client.flags.a.d dVar137 = new com.roblox.client.flags.a.d("SkipChannelBurnOnBackgroundStart", bool, true);
        this.A5 = dVar137;
        h6("SkipChannelBurnOnBackgroundStart", dVar137);
        com.roblox.client.flags.a.d dVar138 = new com.roblox.client.flags.a.d("PTFDisablesPersonaSdk", bool, true);
        this.B5 = dVar138;
        h6("PTFDisablesPersonaSdk", dVar138);
        com.roblox.client.flags.a.d dVar139 = new com.roblox.client.flags.a.d("PTFDisableSurfaceViewRequestFocus", bool, true);
        this.C5 = dVar139;
        h6("PTFDisableSurfaceViewRequestFocus", dVar139);
        com.roblox.client.flags.a.d dVar140 = new com.roblox.client.flags.a.d("EnableTextInputRestoreOnShowKeyboard", bool, true);
        this.D5 = dVar140;
        h6("EnableTextInputRestoreOnShowKeyboard", dVar140);
        com.roblox.client.flags.a.d dVar141 = new com.roblox.client.flags.a.d("StratusEnableSetStatusBarVisibility", bool, true);
        this.E5 = dVar141;
        h6("StratusEnableSetStatusBarVisibility", dVar141);
        com.roblox.client.flags.a.d dVar142 = new com.roblox.client.flags.a.d("EnableHideAndroidStatusBarInLandscape", bool, true);
        this.F5 = dVar142;
        h6("EnableHideAndroidStatusBarInLandscape", dVar142);
        com.roblox.client.flags.a.d dVar143 = new com.roblox.client.flags.a.d("EnableAndroidUnifiedSystemBarControl2", bool, false);
        this.G5 = dVar143;
        h6("EnableAndroidUnifiedSystemBarControl2", dVar143);
        com.roblox.client.flags.a.d dVar144 = new com.roblox.client.flags.a.d("RevertNewPasswordInputTypeChange", bool, true);
        this.H5 = dVar144;
        h6("RevertNewPasswordInputTypeChange", dVar144);
        com.roblox.client.flags.a.d dVar145 = new com.roblox.client.flags.a.d("AndroidWebViewFocusFix", bool, true);
        this.I5 = dVar145;
        h6("AndroidWebViewFocusFix", dVar145);
        com.roblox.client.flags.a.d dVar146 = new com.roblox.client.flags.a.d("SkipFlagFetchWorkerAppForeground", bool, true);
        this.J5 = dVar146;
        h6("SkipFlagFetchWorkerAppForeground", dVar146);
        com.roblox.client.flags.a.d dVar147 = new com.roblox.client.flags.a.d("ShowHeaderForRobux", bool, true);
        this.K5 = dVar147;
        h6("ShowHeaderForRobux", dVar147);
        com.roblox.client.flags.a.d dVar148 = new com.roblox.client.flags.a.d("AndroidSendTouchEndVelocity", bool, true);
        this.L5 = dVar148;
        h6("AndroidSendTouchEndVelocity", dVar148);
        com.roblox.client.flags.a.d dVar149 = new com.roblox.client.flags.a.d("AndroidProcessHistoricalTouchEvents", bool, true);
        this.M5 = dVar149;
        h6("AndroidProcessHistoricalTouchEvents", dVar149);
        com.roblox.client.flags.a.d dVar150 = new com.roblox.client.flags.a.d("AndroidGuardNullInputAdapter", bool, true);
        this.N5 = dVar150;
        h6("AndroidGuardNullInputAdapter", dVar150);
        com.roblox.client.flags.a.d dVar151 = new com.roblox.client.flags.a.d("FixHapticProtocolCrash", bool, true);
        this.O5 = dVar151;
        h6("FixHapticProtocolCrash", dVar151);
        com.roblox.client.flags.a.d dVar152 = new com.roblox.client.flags.a.d("EnableInflateTracking", bool, true);
        this.P5 = dVar152;
        h6("EnableInflateTracking", dVar152);
        com.roblox.client.flags.a.d dVar153 = new com.roblox.client.flags.a.d("EnableDeferredLayoutInflation", bool, true);
        this.Q5 = dVar153;
        h6("EnableDeferredLayoutInflation", dVar153);
        com.roblox.client.flags.a.d dVar154 = new com.roblox.client.flags.a.d("StratusKeepScreenOn", bool, true);
        this.R5 = dVar154;
        h6("StratusKeepScreenOn", dVar154);
        com.roblox.client.flags.a.d dVar155 = new com.roblox.client.flags.a.d("EnableGameStreamingOrientationChangeAndroid", bool, true);
        this.S5 = dVar155;
        h6("EnableGameStreamingOrientationChangeAndroid", dVar155);
        com.roblox.client.flags.a.d dVar156 = new com.roblox.client.flags.a.d("CrashWhenAppBridgeNotStarted", bool, true);
        this.T5 = dVar156;
        h6("CrashWhenAppBridgeNotStarted", dVar156);
        com.roblox.client.flags.a.d dVar157 = new com.roblox.client.flags.a.d("EnableBackgroundOtaPolling2", bool, true);
        this.U5 = dVar157;
        h6("EnableBackgroundOtaPolling2", dVar157);
        com.roblox.client.flags.a.d dVar158 = new com.roblox.client.flags.a.d("DebugSkipInAppOtaDownload", bool, true);
        this.V5 = dVar158;
        h6("DebugSkipInAppOtaDownload", dVar158);
        com.roblox.client.flags.a.d dVar159 = new com.roblox.client.flags.a.d("DebugSkipOtaPatchVerification", bool, true);
        this.W5 = dVar159;
        h6("DebugSkipOtaPatchVerification", dVar159);
        com.roblox.client.flags.a.d dVar160 = new com.roblox.client.flags.a.d("EnableOtaWorkerFlagsFromSchedule", bool, false);
        this.X5 = dVar160;
        h6("EnableOtaWorkerFlagsFromSchedule", dVar160);
        com.roblox.client.flags.a.d dVar161 = new com.roblox.client.flags.a.d("EnableOtaWorkerMaxAppVersionCheck", bool, true);
        this.Y5 = dVar161;
        h6("EnableOtaWorkerMaxAppVersionCheck", dVar161);
        com.roblox.client.flags.a.d dVar162 = new com.roblox.client.flags.a.d("EnableOtaWorkerRetargetConfigUrl", bool, false);
        this.Z5 = dVar162;
        h6("EnableOtaWorkerRetargetConfigUrl", dVar162);
        com.roblox.client.flags.a.d dVar163 = new com.roblox.client.flags.a.d("EnableOtaWorkerBindNetwork", bool, false);
        this.f5272a6 = dVar163;
        h6("EnableOtaWorkerBindNetwork", dVar163);
        com.roblox.client.flags.a.g gVar9 = new com.roblox.client.flags.a.g("DataModelPatcherRevokedPublicKeyIds", BuildConfig.FLAVOR, false);
        this.f5279b6 = gVar9;
        h6("DataModelPatcherRevokedPublicKeyIds", gVar9);
        com.roblox.client.flags.a.g gVar10 = new com.roblox.client.flags.a.g("DataModelPatcherRevokedSignatureTypes", BuildConfig.FLAVOR, false);
        this.f5287c6 = gVar10;
        h6("DataModelPatcherRevokedSignatureTypes", gVar10);
        com.roblox.client.flags.a.f fVar20 = new com.roblox.client.flags.a.f("BackgroundOtaPollingIntervalMinutes", 60, false);
        this.f5295d6 = fVar20;
        h6("BackgroundOtaPollingIntervalMinutes", fVar20);
        com.roblox.client.flags.a.f fVar21 = new com.roblox.client.flags.a.f("BackgroundOtaPollingFlexMinutes", 30, false);
        this.f5303e6 = fVar21;
        h6("BackgroundOtaPollingFlexMinutes", fVar21);
        com.roblox.client.flags.a.f fVar22 = new com.roblox.client.flags.a.f("BackgroundOtaPollingMaxRetryAttempts", 3, false);
        this.f5311f6 = fVar22;
        h6("BackgroundOtaPollingMaxRetryAttempts", fVar22);
        com.roblox.client.flags.a.f fVar23 = new com.roblox.client.flags.a.f("BackgroundOtaPollingInactivityDays", 3, false);
        this.f5319g6 = fVar23;
        h6("BackgroundOtaPollingInactivityDays", fVar23);
        com.roblox.client.flags.a.d dVar164 = new com.roblox.client.flags.a.d("BackgroundOtaPollingWifiOnly", bool, true);
        this.f5327h6 = dVar164;
        h6("BackgroundOtaPollingWifiOnly", dVar164);
        com.roblox.client.flags.a.d dVar165 = new com.roblox.client.flags.a.d("EnableDesignFoundations", bool, true);
        this.f5335i6 = dVar165;
        h6("EnableDesignFoundations", dVar165);
        com.roblox.client.flags.a.f fVar24 = new com.roblox.client.flags.a.f("GmaSdkAdapterInitInfoEventThrottleHundredthsPercent", 0, false);
        this.f5343j6 = fVar24;
        h6("GmaSdkAdapterInitInfoEventThrottleHundredthsPercent", fVar24);
        com.roblox.client.flags.a.d dVar166 = new com.roblox.client.flags.a.d("MigrateDesyncCounterToTelemetryBindings", bool, true);
        this.f5351k6 = dVar166;
        h6("MigrateDesyncCounterToTelemetryBindings", dVar166);
        com.roblox.client.flags.a.d dVar167 = new com.roblox.client.flags.a.d("EnableAndroidWebViewMemoryTelemetry", bool, true);
        this.f5359l6 = dVar167;
        h6("EnableAndroidWebViewMemoryTelemetry", dVar167);
        com.roblox.client.flags.a.d dVar168 = new com.roblox.client.flags.a.d("EnableAndroidWebViewLeakFix", bool, true);
        this.f5367m6 = dVar168;
        h6("EnableAndroidWebViewLeakFix", dVar168);
        com.roblox.client.flags.a.d dVar169 = new com.roblox.client.flags.a.d("EnablePayloadDrivenNotificationChannels", bool, true);
        this.f5375n6 = dVar169;
        h6("EnablePayloadDrivenNotificationChannels", dVar169);
        com.roblox.client.flags.a.d dVar170 = new com.roblox.client.flags.a.d("EnableSignalCheckoutSessionIdOnPurchase", bool, true);
        this.f5383o6 = dVar170;
        h6("EnableSignalCheckoutSessionIdOnPurchase", dVar170);
        com.roblox.client.flags.a.d dVar171 = new com.roblox.client.flags.a.d("EnableGameIdToExcludeParameterAndroid", bool, true);
        this.f5391p6 = dVar171;
        h6("EnableGameIdToExcludeParameterAndroid", dVar171);
        com.roblox.client.flags.a.d dVar172 = new com.roblox.client.flags.a.d("EnableGmaSdkInSessionActivation", bool, true);
        this.f5399q6 = dVar172;
        h6("EnableGmaSdkInSessionActivation", dVar172);
        com.roblox.client.flags.a.d dVar173 = new com.roblox.client.flags.a.d("EnableGmaSdkControllerImpl", bool, true);
        this.f5407r6 = dVar173;
        h6("EnableGmaSdkControllerImpl", dVar173);
        com.roblox.client.flags.a.d dVar174 = new com.roblox.client.flags.a.d("EnableGmaSdkEarlyInit", bool, true);
        this.f5415s6 = dVar174;
        h6("EnableGmaSdkEarlyInit", dVar174);
        com.roblox.client.flags.a.d dVar175 = new com.roblox.client.flags.a.d("EnableRewardedAdEntryPointDestroyFix", bool, false);
        this.f5423t6 = dVar175;
        h6("EnableRewardedAdEntryPointDestroyFix", dVar175);
        com.roblox.client.flags.a.f fVar25 = new com.roblox.client.flags.a.f("GmaSdkServeAdTimeoutInSeconds", 10, false);
        this.f5431u6 = fVar25;
        h6("GmaSdkServeAdTimeoutInSeconds", fVar25);
        com.roblox.client.flags.a.d dVar176 = new com.roblox.client.flags.a.d("FixAdNotReadyPlaybackStatus", bool, true);
        this.f5439v6 = dVar176;
        h6("FixAdNotReadyPlaybackStatus", dVar176);
        com.roblox.client.flags.a.f fVar26 = new com.roblox.client.flags.a.f("RewardedVideoGetQueryInfoResultThrottleHundredthsPercent", 0, false);
        this.f5446w6 = fVar26;
        h6("RewardedVideoGetQueryInfoResultThrottleHundredthsPercent", fVar26);
        com.roblox.client.flags.a.d dVar177 = new com.roblox.client.flags.a.d("EnableLazyWorkManagerInit", bool, true);
        this.f5453x6 = dVar177;
        h6("EnableLazyWorkManagerInit", dVar177);
        com.roblox.client.flags.a.d dVar178 = new com.roblox.client.flags.a.d("EnableLibLoadParallelWork", bool, true);
        this.f5461y6 = dVar178;
        h6("EnableLibLoadParallelWork", dVar178);
        com.roblox.client.flags.a.d dVar179 = new com.roblox.client.flags.a.d("EnableOrderedLibRobloxPrefetch", bool, true);
        this.f5469z6 = dVar179;
        h6("EnableOrderedLibRobloxPrefetch", dVar179);
        com.roblox.client.flags.a.d dVar180 = new com.roblox.client.flags.a.d("EnableEarlyAssetUnpack", bool, true);
        this.A6 = dVar180;
        h6("EnableEarlyAssetUnpack", dVar180);
        com.roblox.client.flags.a.d dVar181 = new com.roblox.client.flags.a.d("EnableEarlyPlayIntegrityWarmup", bool, true);
        this.B6 = dVar181;
        h6("EnableEarlyPlayIntegrityWarmup", dVar181);
        com.roblox.client.flags.a.d dVar182 = new com.roblox.client.flags.a.d("EnableEarlySharedPrefsWarmup", bool, true);
        this.C6 = dVar182;
        h6("EnableEarlySharedPrefsWarmup", dVar182);
        com.roblox.client.flags.a.d dVar183 = new com.roblox.client.flags.a.d("EnableClassicLauncherIconTelemetryFixAndroid", bool, true);
        this.D6 = dVar183;
        h6("EnableClassicLauncherIconTelemetryFixAndroid", dVar183);
        com.roblox.client.flags.a.d dVar184 = new com.roblox.client.flags.a.d("EnableSSOOptions3", bool, true);
        this.E6 = dVar184;
        h6("EnableSSOOptions3", dVar184);
        com.roblox.client.flags.a.d dVar185 = new com.roblox.client.flags.a.d("EnableGoogleSSO", bool, false);
        this.F6 = dVar185;
        h6("EnableGoogleSSO", dVar185);
        com.roblox.client.flags.a.d dVar186 = new com.roblox.client.flags.a.d("EnableAppleSSO3", bool, false);
        this.G6 = dVar186;
        h6("EnableAppleSSO3", dVar186);
        com.roblox.client.flags.a.d dVar187 = new com.roblox.client.flags.a.d("EnableEdgeToEdgeMigrationAndroid", bool, true);
        this.H6 = dVar187;
        h6("EnableEdgeToEdgeMigrationAndroid", dVar187);
        com.roblox.client.flags.a.d dVar188 = new com.roblox.client.flags.a.d("EnableIncomingCallBottomInsetAndroid", bool, true);
        this.I6 = dVar188;
        h6("EnableIncomingCallBottomInsetAndroid", dVar188);
        com.roblox.client.flags.a.d dVar189 = new com.roblox.client.flags.a.d("EnableGameActivityVersionBFlagCache", bool, true);
        this.J6 = dVar189;
        h6("EnableGameActivityVersionBFlagCache", dVar189);
        com.roblox.client.flags.a.d dVar190 = new com.roblox.client.flags.a.d("EnableAppEventsAfterLuaAppRestartAndroid", bool, true);
        this.K6 = dVar190;
        h6("EnableAppEventsAfterLuaAppRestartAndroid", dVar190);
        com.roblox.client.flags.a.f fVar27 = new com.roblox.client.flags.a.f("GmasdkBackgroundInstallDelayMs", numValueOf, false);
        this.L6 = fVar27;
        h6("GmasdkBackgroundInstallDelayMs", fVar27);
        com.roblox.client.flags.a.d dVar191 = new com.roblox.client.flags.a.d("GmasdkBackgroundInstallEnabledAndroid", bool, false);
        this.M6 = dVar191;
        h6("GmasdkBackgroundInstallEnabledAndroid", dVar191);
        com.roblox.client.flags.a.d dVar192 = new com.roblox.client.flags.a.d("PioneerExitOnNativeExit", bool, false);
        this.N6 = dVar192;
        h6("PioneerExitOnNativeExit", dVar192);
        com.roblox.client.flags.a.d dVar193 = new com.roblox.client.flags.a.d("AndroidSoftButtonsHeightFromInsets", bool2, false);
        this.O6 = dVar193;
        h6("AndroidSoftButtonsHeightFromInsets", dVar193);
        com.roblox.client.flags.a.d dVar194 = new com.roblox.client.flags.a.d("PioneerPublishIdleLeave", bool, false);
        this.P6 = dVar194;
        h6("PioneerPublishIdleLeave", dVar194);
        com.roblox.client.flags.a.d dVar195 = new com.roblox.client.flags.a.d("DisableAndroidFirebaseAnalyticsConsentGate", bool, true);
        this.Q6 = dVar195;
        h6("DisableAndroidFirebaseAnalyticsConsentGate", dVar195);
        com.roblox.client.flags.a.d dVar196 = new com.roblox.client.flags.a.d("DisableAndroidAppsFlyerHonorSavedBlock", bool, true);
        this.R6 = dVar196;
        h6("DisableAndroidAppsFlyerHonorSavedBlock", dVar196);
        com.roblox.client.flags.a.d dVar197 = new com.roblox.client.flags.a.d("EnableAndroidHoldUnflaggedUntilConsent", bool, true);
        this.S6 = dVar197;
        h6("EnableAndroidHoldUnflaggedUntilConsent", dVar197);
    }

    @Override // bi.i
    public boolean A() {
        return this.M4.o().booleanValue();
    }

    @Override // bi.i
    public boolean A0() {
        return this.E0.k().booleanValue();
    }

    @Override // bi.i
    public boolean A1() {
        return this.f5342j5.o().booleanValue();
    }

    @Override // bi.i
    public boolean A2() {
        return this.S0.k().booleanValue();
    }

    @Override // bi.i
    public boolean A3() {
        return this.f5347k2.k().booleanValue();
    }

    @Override // bi.i
    public int A4() {
        return this.L3.i().intValue();
    }

    @Override // bi.i
    public boolean A5() {
        return this.f5308f3.o().booleanValue();
    }

    @Override // bi.i
    public boolean B() {
        return this.K0.k().booleanValue();
    }

    @Override // bi.i
    public String B0() {
        return this.f5457y2.i();
    }

    @Override // bi.i
    public boolean B1() {
        return this.f5363m2.k().booleanValue();
    }

    @Override // bi.i
    public String B2() {
        return this.f5369n0.i();
    }

    @Override // bi.i
    public boolean B3() {
        return this.H1.k().booleanValue();
    }

    @Override // bi.i
    public boolean B4() {
        return this.F2.o().booleanValue();
    }

    @Override // bi.i
    public boolean B5() {
        return this.f5350k5.o().booleanValue();
    }

    @Override // bi.i
    public boolean C() {
        return this.f5341j4.o().booleanValue();
    }

    @Override // bi.i
    public boolean C0() {
        return this.f5365m4.o().booleanValue();
    }

    @Override // bi.i
    public boolean C1() {
        return this.H4.o().booleanValue();
    }

    @Override // bi.i
    public boolean C2() {
        return this.f5346k1.k().booleanValue();
    }

    @Override // bi.i
    public boolean C3() {
        return this.C0.k().booleanValue();
    }

    @Override // bi.i
    public String C4() {
        return this.f5382o5.i();
    }

    @Override // bi.i
    public boolean C5() {
        return this.Q2.o().booleanValue();
    }

    @Override // bi.i
    public boolean D() {
        return this.P3.o().booleanValue();
    }

    @Override // bi.i
    public boolean D0() {
        return this.f5285c4.o().booleanValue();
    }

    @Override // bi.i
    public boolean D1() {
        return this.f5351k6.o().booleanValue();
    }

    @Override // bi.i
    public boolean D2() {
        return this.A6.o().booleanValue();
    }

    @Override // bi.i
    public boolean D3() {
        return this.J2.o().booleanValue();
    }

    @Override // bi.i
    public boolean D4() {
        return this.f5436v3.o().booleanValue();
    }

    @Override // bi.i
    public boolean D5() {
        return this.f5266a0.k().booleanValue();
    }

    @Override // bi.i
    public int E() {
        return this.f5384p.i().intValue();
    }

    @Override // bi.i
    public String E0() {
        return this.f5405r4.i();
    }

    @Override // bi.i
    public boolean E1() {
        return this.B3.o().booleanValue();
    }

    @Override // bi.i
    public String E2() {
        return this.f5462z.i();
    }

    @Override // bi.i
    public boolean E3() {
        return this.N6.o().booleanValue();
    }

    @Override // bi.i
    public boolean E4() {
        return this.X3.o().booleanValue();
    }

    @Override // bi.i
    public boolean E5() {
        return this.f5283c2.k().booleanValue();
    }

    @Override // bi.i
    public boolean F() {
        return this.f5456y1.k().booleanValue();
    }

    @Override // bi.i
    public boolean F0() {
        return this.G4.o().booleanValue();
    }

    @Override // bi.i
    public boolean F1() {
        return this.f5415s6.o().booleanValue();
    }

    @Override // bi.i
    public boolean F2() {
        return this.f5362m1.k().booleanValue();
    }

    @Override // bi.i
    public boolean F3() {
        return this.Z5.o().booleanValue();
    }

    @Override // bi.i
    public int F4() {
        return this.f5276b3.i().intValue();
    }

    @Override // bi.i
    public boolean F5() {
        return this.I0.k().booleanValue();
    }

    @Override // bi.i
    public boolean G() {
        return this.H6.o().booleanValue();
    }

    @Override // bi.i
    public boolean G0() {
        return this.f5318g5.o().booleanValue();
    }

    @Override // bi.i
    public boolean G1() {
        return this.U5.o().booleanValue();
    }

    @Override // bi.i
    public boolean G2() {
        return this.O2.o().booleanValue();
    }

    @Override // bi.i
    public boolean G3() {
        return this.f5331i2.k().booleanValue();
    }

    @Override // bi.i
    public long G4() {
        return this.W1.i().longValue();
    }

    @Override // bi.i
    public boolean G5() {
        return this.L4.o().booleanValue();
    }

    @Override // bi.i
    public int H() {
        return this.V0.i().intValue();
    }

    @Override // bi.i
    public boolean H0() {
        return this.S6.o().booleanValue();
    }

    @Override // bi.i
    public boolean H1() {
        return this.C2.o().booleanValue();
    }

    @Override // bi.i
    public boolean H2() {
        return this.W4.o().booleanValue();
    }

    @Override // bi.i
    public boolean H3() {
        return this.f5391p6.o().booleanValue();
    }

    @Override // bi.i
    public boolean H4() {
        return this.O5.o().booleanValue();
    }

    @Override // bi.i
    public int H5() {
        return this.f5345k0.i().intValue();
    }

    @Override // bi.i
    public boolean I() {
        return this.J5.o().booleanValue();
    }

    @Override // bi.i
    public boolean I0() {
        return this.K5.o().booleanValue();
    }

    @Override // bi.i
    public int I1() {
        return this.f5394q1.i().intValue();
    }

    @Override // bi.i
    public boolean I2() {
        return this.f5330i1.k().booleanValue();
    }

    @Override // bi.i
    public boolean I3() {
        return this.F4.o().booleanValue();
    }

    @Override // bi.i
    public int I4() {
        return this.I4.i().intValue();
    }

    @Override // bi.i
    public String I5() {
        return this.f5412s3.i();
    }

    @Override // bi.i
    public boolean J() {
        return this.f5324h3.o().booleanValue();
    }

    @Override // bi.i
    public boolean J0() {
        return this.f5361m0.k().booleanValue();
    }

    @Override // bi.i
    public boolean J1() {
        return this.f5420t3.o().booleanValue();
    }

    @Override // bi.i
    public int J2() {
        return this.f5416t.i().intValue();
    }

    @Override // bi.i
    public boolean J3() {
        return this.R5.o().booleanValue();
    }

    @Override // bi.i
    public boolean J4() {
        return this.f5395q2.k().booleanValue();
    }

    @Override // bi.i
    public int J5() {
        return this.f5319g6.i().intValue();
    }

    @Override // bi.i
    public int K() {
        return this.b.i().intValue();
    }

    @Override // bi.i
    public String K0() {
        return this.f5313g0.i();
    }

    @Override // bi.i
    public boolean K1() {
        return this.f5292d3.o().booleanValue();
    }

    @Override // bi.i
    public boolean K2() {
        return this.f5271a5.o().booleanValue();
    }

    @Override // bi.i
    public boolean K3() {
        return this.f5358l5.o().booleanValue();
    }

    @Override // bi.i
    public int K4() {
        return this.K3.i().intValue();
    }

    @Override // bi.i
    public long K5() {
        return this.U.i().longValue();
    }

    @Override // bi.i
    public int L() {
        return this.Y1.i().intValue();
    }

    @Override // bi.i
    public boolean L0() {
        return this.f5282c1.k().booleanValue();
    }

    @Override // bi.i
    public boolean L1() {
        return this.V3.o().booleanValue();
    }

    @Override // bi.i
    public boolean L2() {
        return this.X4.o().booleanValue();
    }

    @Override // bi.i
    public long L3() {
        return this.f5337j0.i().longValue();
    }

    @Override // bi.i
    public boolean L4() {
        return this.F0.k().booleanValue();
    }

    @Override // bi.i
    public boolean L5() {
        return this.U1.k().booleanValue();
    }

    @Override // bi.i
    public int M() {
        return this.J1.i().intValue();
    }

    @Override // bi.i
    public boolean M0() {
        return this.V2.o().booleanValue();
    }

    @Override // bi.i
    public boolean M1() {
        return this.f5373n4.o().booleanValue();
    }

    @Override // bi.i
    public int M2() {
        return this.J3.i().intValue();
    }

    @Override // bi.i
    public long M3() {
        return this.X1.i().longValue();
    }

    @Override // bi.i
    public boolean M4() {
        return this.f5322h1.k().booleanValue();
    }

    @Override // bi.i
    public boolean M5() {
        return this.H2.o().booleanValue();
    }

    @Override // bi.i
    public boolean N() {
        return this.f5434v1.k().booleanValue();
    }

    @Override // bi.i
    public int N0() {
        return this.C.i().intValue();
    }

    @Override // bi.i
    public boolean N1() {
        return this.f5463z0.k().booleanValue();
    }

    @Override // bi.i
    public boolean N2() {
        return this.f5441w0.k().booleanValue();
    }

    @Override // bi.i
    public int N3() {
        return this.O1.i().intValue();
    }

    @Override // bi.i
    public boolean N4() {
        return this.f5300e3.o().booleanValue();
    }

    @Override // bi.i
    public boolean N5() {
        return this.f5444w3.o().booleanValue();
    }

    @Override // bi.i
    public boolean O() {
        return this.O6.o().booleanValue();
    }

    @Override // bi.i
    public boolean O0() {
        return this.Q5.o().booleanValue();
    }

    @Override // bi.i
    public boolean O1() {
        return this.E4.o().booleanValue();
    }

    @Override // bi.i
    public boolean O2() {
        return this.Q3.o().booleanValue();
    }

    @Override // bi.i
    public boolean O3() {
        return this.f5291d2.k().booleanValue();
    }

    @Override // bi.i
    public int O4() {
        return this.D2.i().intValue();
    }

    @Override // bi.i
    public boolean O5() {
        return this.V5.o().booleanValue();
    }

    @Override // bi.i
    public boolean P() {
        return this.f5293d4.o().booleanValue();
    }

    @Override // bi.i
    public boolean P0() {
        return this.I3.o().booleanValue();
    }

    @Override // bi.i
    public boolean P1() {
        return this.W3.o().booleanValue();
    }

    @Override // bi.i
    public String P2() {
        return this.f5432v.i();
    }

    @Override // bi.i
    public boolean P3() {
        return this.f5374n5.o().booleanValue();
    }

    @Override // bi.i
    public int P4() {
        return this.A4.i().intValue();
    }

    @Override // bi.i
    public boolean P5() {
        return this.N0.k().booleanValue();
    }

    @Override // bi.i
    public int Q() {
        return this.A.i().intValue();
    }

    @Override // bi.i
    public String Q0() {
        return this.B0.i();
    }

    @Override // bi.i
    public boolean Q1() {
        return this.I2.o().booleanValue();
    }

    @Override // bi.i
    public boolean Q2() {
        return this.f5367m6.o().booleanValue();
    }

    @Override // bi.i
    public int Q3() {
        return this.f5296e.i().intValue();
    }

    @Override // bi.i
    public String Q4() {
        return this.f5449x1.i();
    }

    @Override // bi.i
    public boolean Q5() {
        return this.L0.k().booleanValue();
    }

    @Override // bi.i
    public boolean R() {
        return this.R4.o().booleanValue();
    }

    @Override // bi.i
    public int R1() {
        return this.f5314g1.i().intValue();
    }

    @Override // bi.i
    public boolean R2() {
        return this.f5418t1.k().booleanValue();
    }

    @Override // bi.i
    public boolean R3() {
        return this.f5393q0.k().booleanValue();
    }

    @Override // bi.i
    public String R4() {
        return this.f5454y.i();
    }

    @Override // bi.i
    public boolean R5() {
        return this.f5357l4.o().booleanValue();
    }

    @Override // bi.i
    public boolean S() {
        return this.W2.o().booleanValue();
    }

    @Override // bi.i
    public boolean S0() {
        return this.f5321h0.k().booleanValue();
    }

    @Override // bi.i
    public boolean S1() {
        return this.G6.o().booleanValue();
    }

    @Override // bi.i
    public boolean S2() {
        return this.f5409s0.k().booleanValue();
    }

    @Override // bi.i
    public boolean S3() {
        return this.f5275b2.k().booleanValue();
    }

    @Override // bi.i
    public long S4() {
        return this.f5379o2.i().longValue();
    }

    @Override // bi.i
    public int S5() {
        return this.f5284c3.i().intValue();
    }

    @Override // bi.i
    public int T() {
        return this.f5298e1.i().intValue();
    }

    @Override // bi.i
    public boolean T0() {
        return this.f5302e5.o().booleanValue();
    }

    @Override // bi.i
    public int T1() {
        return this.f5424u.i().intValue();
    }

    @Override // bi.i
    public boolean T2() {
        return this.f5466z3.o().booleanValue();
    }

    @Override // bi.i
    public boolean T3() {
        return this.M0.k().booleanValue();
    }

    @Override // bi.i
    public boolean T4() {
        return this.f5385p0.k().booleanValue();
    }

    @Override // bi.i
    public boolean T5() {
        return this.G5.o().booleanValue();
    }

    @Override // bi.i
    public boolean U() {
        return this.f5438v5.o().booleanValue();
    }

    @Override // bi.i
    public boolean U0() {
        return this.f5375n6.o().booleanValue();
    }

    @Override // bi.i
    public int U1() {
        return this.f5364m3.i().intValue();
    }

    @Override // bi.i
    public boolean U2() {
        return this.f5386p1.k().booleanValue();
    }

    @Override // bi.i
    public int U3() {
        return this.f5288d.i().intValue();
    }

    @Override // bi.i
    public int U4() {
        return this.f5431u6.i().intValue();
    }

    @Override // bi.i
    public boolean U5() {
        return this.C4.o().booleanValue();
    }

    @Override // bi.i
    public boolean V() {
        return this.U3.o().booleanValue();
    }

    @Override // bi.i
    public int V0() {
        return this.M1.i().intValue();
    }

    @Override // bi.i
    public boolean V1() {
        return this.Q1.k().booleanValue();
    }

    @Override // bi.i
    public boolean V2() {
        return this.f5359l6.o().booleanValue();
    }

    @Override // bi.i
    public String V3() {
        return this.f5305f0.i();
    }

    @Override // bi.i
    public boolean V4() {
        return this.F5.o().booleanValue();
    }

    @Override // bi.i
    public boolean V5() {
        return this.f5387p2.k().booleanValue();
    }

    @Override // bi.i
    public boolean W() {
        return this.A1.k().booleanValue();
    }

    @Override // bi.i
    public boolean W0() {
        return this.f5423t6.o().booleanValue();
    }

    @Override // bi.i
    public boolean W1() {
        return this.f5467z4.o().booleanValue();
    }

    @Override // bi.i
    public int W2() {
        return this.f5411s2.i().intValue();
    }

    @Override // bi.i
    public boolean W3() {
        return this.f5372n3.o().booleanValue();
    }

    @Override // bi.i
    public boolean W4() {
        return this.f5425u0.k().booleanValue();
    }

    @Override // bi.i
    public boolean W5() {
        return this.f5333i4.o().booleanValue();
    }

    @Override // bi.i
    public boolean X() {
        return this.f5407r6.o().booleanValue();
    }

    @Override // bi.i
    public boolean X0() {
        return this.N5.o().booleanValue();
    }

    @Override // bi.i
    public boolean X1() {
        return this.S5.o().booleanValue();
    }

    @Override // bi.i
    public boolean X2() {
        return this.B2.o().booleanValue();
    }

    @Override // bi.i
    public boolean X3() {
        return this.E1.k().booleanValue();
    }

    @Override // bi.i
    public boolean X4() {
        return this.f5306f1.k().booleanValue();
    }

    @Override // bi.i
    public int X5() {
        return this.f5336j.i().intValue();
    }

    @Override // bi.i
    public boolean Y() {
        return this.f5388p3.o().booleanValue();
    }

    @Override // bi.i
    public boolean Y0() {
        return this.f5465z2.o().booleanValue();
    }

    @Override // bi.i
    public boolean Y1() {
        return this.C5.o().booleanValue();
    }

    @Override // bi.i
    public boolean Y2() {
        return this.f5439v6.o().booleanValue();
    }

    @Override // bi.i
    public boolean Y3() {
        return this.f5455y0.k().booleanValue();
    }

    @Override // bi.i
    public boolean Y4() {
        return this.D4.o().booleanValue();
    }

    @Override // bi.i
    public boolean Y5() {
        return this.X2.o().booleanValue();
    }

    @Override // bi.i
    public String Z() {
        return this.f5437v4.i();
    }

    @Override // bi.i
    public boolean Z0() {
        return this.f5428u3.o().booleanValue();
    }

    @Override // bi.i
    public boolean Z1() {
        return this.G0.k().booleanValue();
    }

    @Override // bi.i
    public int Z2() {
        return this.f5445w4.i().intValue();
    }

    @Override // bi.i
    public String Z3() {
        return this.f5440w.i();
    }

    @Override // bi.i
    public boolean Z4() {
        return this.f5310f5.o().booleanValue();
    }

    @Override // bi.i
    public boolean Z5() {
        return this.U0.k().booleanValue();
    }

    @Override // bi.i
    public int a() {
        return this.f5299e2.i().intValue();
    }

    @Override // bi.i
    public int a0() {
        return this.Y0.i().intValue();
    }

    @Override // bi.i
    public boolean a1() {
        return this.f5404r3.o().booleanValue();
    }

    @Override // bi.i
    public boolean a2() {
        return this.f5377o0.k().booleanValue();
    }

    @Override // bi.i
    public boolean a3() {
        return this.N4.o().booleanValue();
    }

    @Override // bi.i
    public boolean a4() {
        return this.f5451x3.o().booleanValue();
    }

    @Override // bi.i
    public boolean a5() {
        return this.C6.o().booleanValue();
    }

    @Override // bi.i
    public boolean a6() {
        return this.P6.o().booleanValue();
    }

    @Override // bi.i
    public int b() {
        return this.f5353l0.i().intValue();
    }

    @Override // bi.i
    public int b0() {
        return this.L6.i().intValue();
    }

    @Override // bi.i
    public boolean b1() {
        return this.f5403r2.k().booleanValue();
    }

    @Override // bi.i
    public String b2() {
        return this.f5304f.i();
    }

    @Override // bi.i
    public boolean b3() {
        return this.f5270a4.o().booleanValue();
    }

    @Override // bi.i
    public boolean b5() {
        return this.f5294d5.o().booleanValue();
    }

    @Override // bi.i
    public int b6() {
        return this.f5446w6.i().intValue();
    }

    @Override // bi.i
    public boolean c() {
        return this.f5417t0.k().booleanValue();
    }

    @Override // bi.i
    public boolean c0() {
        return this.M5.o().booleanValue();
    }

    @Override // bi.i
    public boolean c1() {
        return this.f5356l3.o().booleanValue();
    }

    @Override // bi.i
    public boolean c2() {
        return this.K1.k().booleanValue();
    }

    @Override // bi.i
    public boolean c3() {
        return this.Q4.o().booleanValue();
    }

    @Override // bi.i
    public boolean c4() {
        return this.f5323h2.k().booleanValue();
    }

    @Override // bi.i
    public boolean c5() {
        return this.f5427u2.o().booleanValue();
    }

    @Override // bi.i
    public boolean c6() {
        return this.O0.k().booleanValue();
    }

    @Override // bi.i
    public boolean d() {
        return this.f5339j2.k().booleanValue();
    }

    @Override // bi.i
    public boolean d0() {
        return this.U4.o().booleanValue();
    }

    @Override // bi.i
    public boolean d1() {
        return this.f5326h5.o().booleanValue();
    }

    @Override // bi.i
    public int d2() {
        return this.D3.i().intValue();
    }

    @Override // bi.i
    public boolean d3() {
        return this.B1.k().booleanValue();
    }

    @Override // bi.i
    public boolean d4() {
        return this.f5277b4.o().booleanValue();
    }

    @Override // bi.i
    public int d5() {
        return this.F3.i().intValue();
    }

    @Override // bi.i
    public boolean d6() {
        return this.f5401r0.k().booleanValue();
    }

    @Override // bi.i
    public boolean e() {
        return this.U2.o().booleanValue();
    }

    @Override // bi.i
    public int e0() {
        return this.f5303e6.i().intValue();
    }

    @Override // bi.i
    public boolean e1() {
        return this.B5.o().booleanValue();
    }

    @Override // bi.i
    public long e2() {
        return this.f5392q.i().longValue();
    }

    @Override // bi.i
    public boolean e3() {
        return this.T0.k().booleanValue();
    }

    @Override // bi.i
    public int e4() {
        return this.N1.i().intValue();
    }

    @Override // bi.i
    public int e5() {
        return this.f5295d6.i().intValue();
    }

    @Override // bi.i
    public boolean e6() {
        return this.f5422t5.o().booleanValue();
    }

    @Override // bi.i
    public boolean f() {
        return this.A3.o().booleanValue();
    }

    @Override // bi.i
    public String f0() {
        return this.N3.i();
    }

    @Override // bi.i
    public boolean f1() {
        return this.B6.o().booleanValue();
    }

    @Override // bi.i
    public boolean f2() {
        return this.I1.k().booleanValue();
    }

    @Override // bi.i
    public boolean f3() {
        return this.f5268a2.k().booleanValue();
    }

    @Override // bi.i
    public boolean f4() {
        return this.f5269a3.o().booleanValue();
    }

    @Override // bi.i
    public boolean f5() {
        return this.A2.o().booleanValue();
    }

    @Override // bi.i
    public boolean f6() {
        return this.X5.o().booleanValue();
    }

    @Override // bi.i
    public boolean g() {
        return this.f5381o4.o().booleanValue();
    }

    @Override // bi.i
    public boolean g0() {
        return this.X0.k().booleanValue();
    }

    @Override // bi.i
    public boolean g1() {
        return this.S2.o().booleanValue();
    }

    @Override // bi.i
    public boolean g2() {
        return this.P2.o().booleanValue();
    }

    @Override // bi.i
    public boolean g3() {
        return this.E3.o().booleanValue();
    }

    @Override // bi.i
    public boolean g4() {
        return this.f5419t2.o().booleanValue();
    }

    @Override // bi.i
    public boolean g5() {
        return this.Q0.k().booleanValue();
    }

    @Override // bi.i
    public boolean g6() {
        return this.J6.o().booleanValue();
    }

    @Override // bi.i
    public boolean h() {
        return this.f5328i.k().booleanValue();
    }

    @Override // bi.i
    public boolean h0() {
        return this.f5272a6.o().booleanValue();
    }

    @Override // bi.i
    public boolean h1() {
        return this.Z0.k().booleanValue();
    }

    @Override // bi.i
    public boolean h2() {
        return this.S3.o().booleanValue();
    }

    @Override // bi.i
    public boolean h3() {
        return this.f5315g2.k().booleanValue();
    }

    @Override // bi.i
    public boolean h4() {
        return this.f5286c5.o().booleanValue();
    }

    @Override // bi.i
    public int h5() {
        return this.P1.i().intValue();
    }

    @Override // bi.i
    public boolean i() {
        return this.E.k().booleanValue();
    }

    @Override // bi.i
    public boolean i0() {
        return this.f5332i3.o().booleanValue();
    }

    @Override // bi.i
    public boolean i1() {
        return this.f5340j3.o().booleanValue();
    }

    @Override // bi.i
    public int i2() {
        return this.f5452x4.i().intValue();
    }

    @Override // bi.i
    public int i3() {
        return this.f5402r1.i().intValue();
    }

    @Override // bi.i
    public boolean i4() {
        return this.w5.o().booleanValue();
    }

    @Override // bi.i
    public boolean i5() {
        return this.S4.o().booleanValue();
    }

    @Override // bi.i
    public boolean j() {
        return this.Y5.o().booleanValue();
    }

    @Override // bi.i
    public boolean j0() {
        return this.f5399q6.o().booleanValue();
    }

    @Override // bi.i
    public boolean j1() {
        return this.f5433v0.k().booleanValue();
    }

    @Override // bi.i
    public boolean j2() {
        return this.R6.o().booleanValue();
    }

    @Override // bi.i
    public boolean j3() {
        return this.f5380o3.o().booleanValue();
    }

    @Override // bi.i
    public int j4() {
        return this.f5447x.i().intValue();
    }

    @Override // bi.i
    public boolean j5() {
        return this.f5443w2.o().booleanValue();
    }

    @Override // bi.i
    public boolean k() {
        return this.C1.k().booleanValue();
    }

    @Override // bi.i
    public boolean k0() {
        return this.L2.o().booleanValue();
    }

    @Override // bi.i
    public boolean k1() {
        return this.T3.o().booleanValue();
    }

    @Override // bi.i
    public boolean k2() {
        return this.F1.k().booleanValue();
    }

    @Override // bi.i
    public boolean k3() {
        return this.f5278b5.o().booleanValue();
    }

    @Override // bi.i
    public boolean k4() {
        return this.f5453x6.o().booleanValue();
    }

    @Override // bi.i
    public boolean k5() {
        return this.H5.o().booleanValue();
    }

    @Override // bi.i
    public boolean l() {
        return this.f5459y4.o().booleanValue();
    }

    @Override // bi.i
    public boolean l0() {
        return this.M2.o().booleanValue();
    }

    @Override // bi.i
    public int l1() {
        return this.f5410s1.i().intValue();
    }

    @Override // bi.i
    public boolean l2() {
        return this.f5378o1.k().booleanValue();
    }

    @Override // bi.i
    public int l3() {
        return this.f5397q4.i().intValue();
    }

    @Override // bi.i
    public boolean l4() {
        return this.Y4.o().booleanValue();
    }

    @Override // bi.i
    public boolean l5() {
        return this.E5.o().booleanValue();
    }

    @Override // bi.i
    public String m() {
        return this.f5390p5.i();
    }

    @Override // bi.i
    public boolean m0() {
        return this.f5371n2.k().booleanValue();
    }

    @Override // bi.i
    public int m1() {
        return this.f5354l1.i().intValue();
    }

    @Override // bi.i
    public boolean m2() {
        return this.B4.o().booleanValue();
    }

    @Override // bi.i
    public boolean m3() {
        return this.f5309f4.o().booleanValue();
    }

    @Override // bi.i
    public boolean m4() {
        return this.E2.o().booleanValue();
    }

    @Override // bi.i
    public boolean m5() {
        return this.R2.o().booleanValue();
    }

    @Override // bi.i
    public long n() {
        return this.F.i().longValue();
    }

    @Override // bi.i
    public boolean n0() {
        return this.f5320h.k().booleanValue();
    }

    @Override // bi.i
    public boolean n1() {
        return this.E6.o().booleanValue();
    }

    @Override // bi.i
    public boolean n2() {
        return this.f5450x2.o().booleanValue();
    }

    @Override // bi.i
    public boolean n3() {
        return this.Y3.o().booleanValue();
    }

    @Override // bi.i
    public boolean n4() {
        return this.f5267a1.k().booleanValue();
    }

    @Override // bi.i
    public boolean n5() {
        return this.C3.o().booleanValue();
    }

    @Override // bi.i
    public int o() {
        return this.f5352l.i().intValue();
    }

    @Override // bi.i
    public int o0() {
        return this.M3.i().intValue();
    }

    @Override // bi.i
    public boolean o1() {
        return this.K2.o().booleanValue();
    }

    @Override // bi.i
    public boolean o2() {
        return this.K6.o().booleanValue();
    }

    @Override // bi.i
    public boolean o3() {
        return this.G1.k().booleanValue();
    }

    @Override // bi.i
    public boolean o4() {
        return this.J0.k().booleanValue();
    }

    @Override // bi.i
    public boolean o5() {
        return this.G3.o().booleanValue();
    }

    @Override // bi.i
    public String p() {
        return this.f5413s4.i();
    }

    @Override // bi.i
    public boolean p0() {
        return this.f5355l2.k().booleanValue();
    }

    @Override // bi.i
    public int p1() {
        return this.f5311f6.i().intValue();
    }

    @Override // bi.i
    public boolean p2() {
        return this.I5.o().booleanValue();
    }

    @Override // bi.i
    public boolean p3() {
        return this.Q6.o().booleanValue();
    }

    @Override // bi.i
    public boolean p4() {
        return this.H0.k().booleanValue();
    }

    @Override // bi.i
    public boolean p5() {
        return this.R3.o().booleanValue();
    }

    @Override // bi.i
    public boolean q() {
        return this.T1.k().booleanValue();
    }

    @Override // bi.i
    public boolean q0() {
        return this.T4.o().booleanValue();
    }

    @Override // bi.i
    public boolean q1() {
        return this.M6.o().booleanValue();
    }

    @Override // bi.i
    public boolean q2() {
        return this.K4.o().booleanValue();
    }

    @Override // bi.i
    public boolean q3() {
        return this.O4.o().booleanValue();
    }

    @Override // bi.i
    public int q4() {
        return this.f5301e4.i().intValue();
    }

    @Override // bi.i
    public boolean q5() {
        return this.f5396q3.o().booleanValue();
    }

    @Override // bi.i
    public boolean r() {
        return this.V4.o().booleanValue();
    }

    @Override // bi.i
    public boolean r0() {
        return this.f5329i0.k().booleanValue();
    }

    @Override // bi.i
    public int r1() {
        return this.f5400r.i().intValue();
    }

    @Override // bi.i
    public boolean r2() {
        return this.P5.o().booleanValue();
    }

    @Override // bi.i
    public boolean r3() {
        return this.f5464z1.k().booleanValue();
    }

    @Override // bi.i
    public int r4() {
        return this.f5360m.i().intValue();
    }

    @Override // bi.i
    public boolean r5() {
        return this.A0.k().booleanValue();
    }

    @Override // bi.i
    public boolean s() {
        return this.f5426u1.k().booleanValue();
    }

    @Override // bi.i
    public int s0() {
        return this.f5398q5.i().intValue();
    }

    @Override // bi.i
    public boolean s1() {
        return this.R0.k().booleanValue();
    }

    @Override // bi.i
    public String s2() {
        return this.f5370n1.i();
    }

    @Override // bi.i
    public int s3() {
        return this.f5368n.i().intValue();
    }

    @Override // bi.i
    public boolean s4() {
        return this.A5.o().booleanValue();
    }

    @Override // bi.i
    public int s5() {
        return this.f5325h4.i().intValue();
    }

    @Override // bi.i
    public int t() {
        return this.f5344k.i().intValue();
    }

    @Override // bi.i
    public int t0() {
        return this.f5376o.i().intValue();
    }

    @Override // bi.i
    public long t1() {
        return this.W0.i().longValue();
    }

    @Override // bi.i
    public boolean t2() {
        return this.f5429u4.o().booleanValue();
    }

    @Override // bi.i
    public boolean t3() {
        return this.S1.k().booleanValue();
    }

    @Override // bi.i
    public boolean t4() {
        return this.f5406r5.o().booleanValue();
    }

    @Override // bi.i
    public boolean t5() {
        return this.f5290d1.k().booleanValue();
    }

    @Override // bi.i
    public int u() {
        return this.f5408s.i().intValue();
    }

    @Override // bi.i
    public boolean u0() {
        return this.f5274b1.k().booleanValue();
    }

    @Override // bi.i
    public boolean u1() {
        return this.f5383o6.o().booleanValue();
    }

    @Override // bi.i
    public boolean u2() {
        return this.Y2.o().booleanValue();
    }

    @Override // bi.i
    public String u3() {
        return this.f5280c.i();
    }

    @Override // bi.i
    public boolean u4() {
        return this.R1.k().booleanValue();
    }

    @Override // bi.i
    public boolean u5() {
        return this.f5435v2.o().booleanValue();
    }

    @Override // bi.i
    public int v() {
        return this.f5338j1.i().intValue();
    }

    @Override // bi.i
    public boolean v0() {
        return this.f5430u5.o().booleanValue();
    }

    @Override // bi.i
    public boolean v1() {
        return this.N2.o().booleanValue();
    }

    @Override // bi.i
    public boolean v2() {
        return this.f5348k3.o().booleanValue();
    }

    @Override // bi.i
    public boolean v3() {
        return this.T5.o().booleanValue();
    }

    @Override // bi.i
    public boolean v4() {
        return this.f5461y6.o().booleanValue();
    }

    @Override // bi.i
    public boolean v5() {
        return this.f5334i5.o().booleanValue();
    }

    @Override // bi.i
    public String w() {
        return this.L1.i();
    }

    @Override // bi.i
    public boolean w0() {
        return this.Z2.o().booleanValue();
    }

    @Override // bi.i
    public boolean w1() {
        return this.f5316g3.o().booleanValue();
    }

    @Override // bi.i
    public boolean w2() {
        return this.Z1.k().booleanValue();
    }

    @Override // bi.i
    public boolean w3() {
        return this.O3.o().booleanValue();
    }

    @Override // bi.i
    public boolean w4() {
        return this.f5327h6.o().booleanValue();
    }

    @Override // bi.i
    public boolean w5() {
        return this.L5.o().booleanValue();
    }

    @Override // bi.i
    public boolean x() {
        return this.T2.o().booleanValue();
    }

    @Override // bi.i
    public boolean x0() {
        return this.I6.o().booleanValue();
    }

    @Override // bi.i
    public boolean x1() {
        return this.P0.k().booleanValue();
    }

    @Override // bi.i
    public boolean x2() {
        return this.f5349k4.o().booleanValue();
    }

    @Override // bi.i
    public boolean x3() {
        return this.f5442w1.k().booleanValue();
    }

    @Override // bi.i
    public boolean x4() {
        return this.G2.o().booleanValue();
    }

    @Override // bi.i
    public boolean x5() {
        return this.f5421t4.o().booleanValue();
    }

    @Override // bi.i
    public boolean y() {
        return this.f5458y3.o().booleanValue();
    }

    @Override // bi.i
    public boolean y0() {
        return this.D6.o().booleanValue();
    }

    @Override // bi.i
    public int y1() {
        return this.J4.i().intValue();
    }

    @Override // bi.i
    public boolean y2() {
        return this.x5.o().booleanValue();
    }

    @Override // bi.i
    public boolean y3() {
        return this.f5389p4.o().booleanValue();
    }

    @Override // bi.i
    public long y4() {
        return this.V1.i().longValue();
    }

    @Override // bi.i
    public int y5() {
        return this.f5343j6.i().intValue();
    }

    @Override // bi.i
    public boolean z() {
        return this.P4.o().booleanValue();
    }

    @Override // bi.i
    public boolean z0() {
        return this.f5366m5.o().booleanValue();
    }

    @Override // bi.i
    public boolean z1() {
        return this.D5.o().booleanValue();
    }

    @Override // bi.i
    public boolean z2() {
        return this.D1.k().booleanValue();
    }

    @Override // bi.i
    public boolean z3() {
        return this.D0.k().booleanValue();
    }

    @Override // bi.i
    public int z4() {
        return this.B.i().intValue();
    }

    @Override // bi.i
    public boolean z5() {
        return this.F6.o().booleanValue();
    }
}
