package sh;

import backtraceio.library.anr.BacktraceANRSettings;
import backtraceio.library.services.BacktraceMetrics;
import com.google.mlkit.common.MlKitException;
import com.roblox.client.flags.c;
import rh.i;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends c implements i {
    public final com.roblox.client.flags.a.b A;
    public final com.roblox.client.flags.a.C0140a A0;
    public final com.roblox.client.flags.a.C0140a A1;
    public final com.roblox.client.flags.a.d A2;
    public final com.roblox.client.flags.a.f A3;
    public final com.roblox.client.flags.a.d A4;
    public final com.roblox.client.flags.a.d A5;
    public final com.roblox.client.flags.a.d A6;
    public final com.roblox.client.flags.a.b B;
    public final com.roblox.client.flags.a.i B0;
    public final com.roblox.client.flags.a.C0140a B1;
    public final com.roblox.client.flags.a.d B2;
    public final com.roblox.client.flags.a.d B3;
    public final com.roblox.client.flags.a.d B4;
    public final com.roblox.client.flags.a.d B5;
    public final com.roblox.client.flags.a.f B6;
    public final com.roblox.client.flags.a.b C;
    public final com.roblox.client.flags.a.C0140a C0;
    public final com.roblox.client.flags.a.C0140a C1;
    public final com.roblox.client.flags.a.d C2;
    public final com.roblox.client.flags.a.f C3;
    public final com.roblox.client.flags.a.d C4;
    public final com.roblox.client.flags.a.d C5;
    public final com.roblox.client.flags.a.d C6;
    public final com.roblox.client.flags.a.C0140a D;
    public final com.roblox.client.flags.a.C0140a D0;
    public final com.roblox.client.flags.a.C0140a D1;
    public final com.roblox.client.flags.a.d D2;
    public final com.roblox.client.flags.a.d D3;
    public final com.roblox.client.flags.a.d D4;
    public final com.roblox.client.flags.a.d D5;
    public final com.roblox.client.flags.a.d D6;
    public final com.roblox.client.flags.a.C0140a E;
    public final com.roblox.client.flags.a.C0140a E0;
    public final com.roblox.client.flags.a.C0140a E1;
    public final com.roblox.client.flags.a.f E2;
    public final com.roblox.client.flags.a.d E3;
    public final com.roblox.client.flags.a.d E4;
    public final com.roblox.client.flags.a.d E5;
    public final com.roblox.client.flags.a.d E6;
    public final com.roblox.client.flags.a.c F;
    public final com.roblox.client.flags.a.C0140a F0;
    public final com.roblox.client.flags.a.C0140a F1;
    public final com.roblox.client.flags.a.d F2;
    public final com.roblox.client.flags.a.d F3;
    public final com.roblox.client.flags.a.f F4;
    public final com.roblox.client.flags.a.d F5;
    public final com.roblox.client.flags.a.d F6;
    public final com.roblox.client.flags.a.C0140a G;
    public final com.roblox.client.flags.a.C0140a G0;
    public final com.roblox.client.flags.a.C0140a G1;
    public final com.roblox.client.flags.a.d G2;
    public final com.roblox.client.flags.a.f G3;
    public final com.roblox.client.flags.a.f G4;
    public final com.roblox.client.flags.a.d G5;
    public final com.roblox.client.flags.a.d G6;
    public final com.roblox.client.flags.a.C0140a H;
    public final com.roblox.client.flags.a.C0140a H0;
    public final com.roblox.client.flags.a.C0140a H1;
    public final com.roblox.client.flags.a.d H2;
    public final com.roblox.client.flags.a.f H3;
    public final com.roblox.client.flags.a.d H4;
    public final com.roblox.client.flags.a.d H5;
    public final com.roblox.client.flags.a.d H6;
    public final com.roblox.client.flags.a.i I;
    public final com.roblox.client.flags.a.C0140a I0;
    public final com.roblox.client.flags.a.C0140a I1;
    public final com.roblox.client.flags.a.d I2;
    public final com.roblox.client.flags.a.f I3;
    public final com.roblox.client.flags.a.d I4;
    public final com.roblox.client.flags.a.d I5;
    public final com.roblox.client.flags.a.d I6;
    public final com.roblox.client.flags.a.C0140a J;
    public final com.roblox.client.flags.a.C0140a J0;
    public final com.roblox.client.flags.a.C0140a J1;
    public final com.roblox.client.flags.a.d J2;
    public final com.roblox.client.flags.a.f J3;
    public final com.roblox.client.flags.a.d J4;
    public final com.roblox.client.flags.a.d J5;
    public final com.roblox.client.flags.a.d J6;
    public final com.roblox.client.flags.a.C0140a K;
    public final com.roblox.client.flags.a.C0140a K0;
    public final com.roblox.client.flags.a.b K1;
    public final com.roblox.client.flags.a.d K2;
    public final com.roblox.client.flags.a.g K3;
    public final com.roblox.client.flags.a.d K4;
    public final com.roblox.client.flags.a.d K5;
    public final com.roblox.client.flags.a.d K6;
    public final com.roblox.client.flags.a.i L;
    public final com.roblox.client.flags.a.C0140a L0;
    public final com.roblox.client.flags.a.C0140a L1;
    public final com.roblox.client.flags.a.d L2;
    public final com.roblox.client.flags.a.d L3;
    public final com.roblox.client.flags.a.d L4;
    public final com.roblox.client.flags.a.d L5;
    public final com.roblox.client.flags.a.d L6;
    public final com.roblox.client.flags.a.i M;
    public final com.roblox.client.flags.a.C0140a M0;
    public final com.roblox.client.flags.a.i M1;
    public final com.roblox.client.flags.a.d M2;
    public final com.roblox.client.flags.a.d M3;
    public final com.roblox.client.flags.a.d M4;
    public final com.roblox.client.flags.a.d M5;
    public final com.roblox.client.flags.a.d M6;
    public final com.roblox.client.flags.a.i N;
    public final com.roblox.client.flags.a.C0140a N0;
    public final com.roblox.client.flags.a.b N1;
    public final com.roblox.client.flags.a.d N2;
    public final com.roblox.client.flags.a.d N3;
    public final com.roblox.client.flags.a.d N4;
    public final com.roblox.client.flags.a.d N5;
    public final com.roblox.client.flags.a.d N6;
    public final com.roblox.client.flags.a.i O;
    public final com.roblox.client.flags.a.C0140a O0;
    public final com.roblox.client.flags.a.b O1;
    public final com.roblox.client.flags.a.d O2;
    public final com.roblox.client.flags.a.d O3;
    public final com.roblox.client.flags.a.d O4;
    public final com.roblox.client.flags.a.d O5;
    public final com.roblox.client.flags.a.d O6;
    public final com.roblox.client.flags.a.b P;
    public final com.roblox.client.flags.a.C0140a P0;
    public final com.roblox.client.flags.a.b P1;
    public final com.roblox.client.flags.a.d P2;
    public final com.roblox.client.flags.a.d P3;
    public final com.roblox.client.flags.a.d P4;
    public final com.roblox.client.flags.a.d P5;
    public final com.roblox.client.flags.a.f P6;
    public final com.roblox.client.flags.a.c Q;
    public final com.roblox.client.flags.a.C0140a Q0;
    public final com.roblox.client.flags.a.b Q1;
    public final com.roblox.client.flags.a.d Q2;
    public final com.roblox.client.flags.a.d Q3;
    public final com.roblox.client.flags.a.d Q4;
    public final com.roblox.client.flags.a.d Q5;
    public final com.roblox.client.flags.a.d Q6;
    public final com.roblox.client.flags.a.b R;
    public final com.roblox.client.flags.a.C0140a R0;
    public final com.roblox.client.flags.a.C0140a R1;
    public final com.roblox.client.flags.a.d R2;
    public final com.roblox.client.flags.a.d R3;
    public final com.roblox.client.flags.a.d R4;
    public final com.roblox.client.flags.a.d R5;
    public final com.roblox.client.flags.a.d R6;
    public final com.roblox.client.flags.a.b S;
    public final com.roblox.client.flags.a.C0140a S0;
    public final com.roblox.client.flags.a.C0140a S1;
    public final com.roblox.client.flags.a.d S2;
    public final com.roblox.client.flags.a.d S3;
    public final com.roblox.client.flags.a.d S4;
    public final com.roblox.client.flags.a.d S5;
    public final com.roblox.client.flags.a.C0140a T;
    public final com.roblox.client.flags.a.C0140a T0;
    public final com.roblox.client.flags.a.C0140a T1;
    public final com.roblox.client.flags.a.d T2;
    public final com.roblox.client.flags.a.d T3;
    public final com.roblox.client.flags.a.d T4;
    public final com.roblox.client.flags.a.d T5;
    public final com.roblox.client.flags.a.c U;
    public final com.roblox.client.flags.a.C0140a U0;
    public final com.roblox.client.flags.a.C0140a U1;
    public final com.roblox.client.flags.a.d U2;
    public final com.roblox.client.flags.a.d U3;
    public final com.roblox.client.flags.a.d U4;
    public final com.roblox.client.flags.a.d U5;
    public final com.roblox.client.flags.a.i V;
    public final com.roblox.client.flags.a.b V0;
    public final com.roblox.client.flags.a.C0140a V1;
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
    public final com.roblox.client.flags.a.C0140a X0;
    public final com.roblox.client.flags.a.c X1;
    public final com.roblox.client.flags.a.d X2;
    public final com.roblox.client.flags.a.d X3;
    public final com.roblox.client.flags.a.d X4;
    public final com.roblox.client.flags.a.d X5;
    public final com.roblox.client.flags.a.C0140a Y;
    public final com.roblox.client.flags.a.b Y0;
    public final com.roblox.client.flags.a.c Y1;
    public final com.roblox.client.flags.a.f Y2;
    public final com.roblox.client.flags.a.d Y3;
    public final com.roblox.client.flags.a.d Y4;
    public final com.roblox.client.flags.a.d Y5;
    public final com.roblox.client.flags.a.i Z;
    public final com.roblox.client.flags.a.C0140a Z0;
    public final com.roblox.client.flags.a.b Z1;
    public final com.roblox.client.flags.a.f Z2;
    public final com.roblox.client.flags.a.d Z3;
    public final com.roblox.client.flags.a.d Z4;
    public final com.roblox.client.flags.a.d Z5;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31324a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31325a1;

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31326a2;

    /* JADX INFO: renamed from: a3, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31327a3;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    public final com.roblox.client.flags.a.f f31328a4;

    /* JADX INFO: renamed from: a5, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31329a5;

    /* JADX INFO: renamed from: a6, reason: collision with root package name */
    public final com.roblox.client.flags.a.g f31330a6;
    public final com.roblox.client.flags.a.b b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31331b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31332b1;

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31333b2;

    /* JADX INFO: renamed from: b3, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31334b3;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31335b4;

    /* JADX INFO: renamed from: b5, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31336b5;

    /* JADX INFO: renamed from: b6, reason: collision with root package name */
    public final com.roblox.client.flags.a.g f31337b6;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.roblox.client.flags.a.i f31338c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31339c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31340c1;

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31341c2;

    /* JADX INFO: renamed from: c3, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31342c3;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31343c4;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31344c5;

    /* JADX INFO: renamed from: c6, reason: collision with root package name */
    public final com.roblox.client.flags.a.f f31345c6;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f31346d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31347d0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31348d1;

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31349d2;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31350d3;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    public final com.roblox.client.flags.a.f f31351d4;

    /* JADX INFO: renamed from: d5, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31352d5;

    /* JADX INFO: renamed from: d6, reason: collision with root package name */
    public final com.roblox.client.flags.a.f f31353d6;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f31354e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final com.roblox.client.flags.a.i f31355e0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f31356e1;

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31357e2;

    /* JADX INFO: renamed from: e3, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31358e3;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31359e4;

    /* JADX INFO: renamed from: e5, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31360e5;

    /* JADX INFO: renamed from: e6, reason: collision with root package name */
    public final com.roblox.client.flags.a.f f31361e6;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.roblox.client.flags.a.i f31362f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final com.roblox.client.flags.a.i f31363f0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31364f1;

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f31365f2;

    /* JADX INFO: renamed from: f3, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31366f3;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31367f4;

    /* JADX INFO: renamed from: f5, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31368f5;

    /* JADX INFO: renamed from: f6, reason: collision with root package name */
    public final com.roblox.client.flags.a.f f31369f6;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f31370g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final com.roblox.client.flags.a.i f31371g0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f31372g1;

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31373g2;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31374g3;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31375g4;

    /* JADX INFO: renamed from: g5, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31376g5;

    /* JADX INFO: renamed from: g6, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31377g6;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31378h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31379h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31380h1;

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31381h2;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31382h3;

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31383h4;

    /* JADX INFO: renamed from: h5, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31384h5;

    /* JADX INFO: renamed from: h6, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31385h6;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31386i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31387i0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31388i1;

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31389i2;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public final com.roblox.client.flags.a.f f31390i3;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31391i4;

    /* JADX INFO: renamed from: i5, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31392i5;

    /* JADX INFO: renamed from: i6, reason: collision with root package name */
    public final com.roblox.client.flags.a.f f31393i6;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f31394j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final com.roblox.client.flags.a.c f31395j0;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f31396j1;

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31397j2;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31398j3;

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31399j4;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31400j5;

    /* JADX INFO: renamed from: j6, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31401j6;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f31402k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f31403k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31404k1;

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31405k2;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31406k3;

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31407k4;

    /* JADX INFO: renamed from: k5, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31408k5;

    /* JADX INFO: renamed from: k6, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31409k6;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f31410l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f31411l0;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f31412l1;

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31413l2;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31414l3;

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31415l4;

    /* JADX INFO: renamed from: l5, reason: collision with root package name */
    public final com.roblox.client.flags.a.g f31416l5;

    /* JADX INFO: renamed from: l6, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31417l6;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f31418m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31419m0;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31420m1;

    /* JADX INFO: renamed from: m2, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31421m2;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31422m3;

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    public final com.roblox.client.flags.a.f f31423m4;

    /* JADX INFO: renamed from: m5, reason: collision with root package name */
    public final com.roblox.client.flags.a.g f31424m5;

    /* JADX INFO: renamed from: m6, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31425m6;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f31426n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final com.roblox.client.flags.a.i f31427n0;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31428n1;

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31429n2;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31430n3;

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    public final com.roblox.client.flags.a.g f31431n4;

    /* JADX INFO: renamed from: n5, reason: collision with root package name */
    public final com.roblox.client.flags.a.f f31432n5;

    /* JADX INFO: renamed from: n6, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31433n6;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f31434o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31435o0;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public final com.roblox.client.flags.a.i f31436o1;

    /* JADX INFO: renamed from: o2, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31437o2;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    public final com.roblox.client.flags.a.g f31438o3;

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    public final com.roblox.client.flags.a.g f31439o4;

    /* JADX INFO: renamed from: o5, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31440o5;

    /* JADX INFO: renamed from: o6, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31441o6;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f31442p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31443p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31444p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public final com.roblox.client.flags.a.c f31445p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31446p3;

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31447p4;

    /* JADX INFO: renamed from: p5, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31448p5;

    /* JADX INFO: renamed from: p6, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31449p6;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.roblox.client.flags.a.c f31450q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31451q0;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31452q1;

    /* JADX INFO: renamed from: q2, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31453q2;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31454q3;

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31455q4;

    /* JADX INFO: renamed from: q5, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31456q5;

    /* JADX INFO: renamed from: q6, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31457q6;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f31458r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31459r0;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f31460r1;

    /* JADX INFO: renamed from: r2, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31461r2;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31462r3;

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    public final com.roblox.client.flags.a.g f31463r4;

    /* JADX INFO: renamed from: r5, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31464r5;

    /* JADX INFO: renamed from: r6, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31465r6;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f31466s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31467s0;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f31468s1;

    /* JADX INFO: renamed from: s2, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31469s2;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31470s3;

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    public final com.roblox.client.flags.a.f f31471s4;

    /* JADX INFO: renamed from: s5, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31472s5;

    /* JADX INFO: renamed from: s6, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31473s6;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f31474t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31475t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f31476t1;

    /* JADX INFO: renamed from: t2, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f31477t2;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31478t3;

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    public final com.roblox.client.flags.a.f f31479t4;

    /* JADX INFO: renamed from: t5, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31480t5;

    /* JADX INFO: renamed from: t6, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31481t6;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f31482u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31483u0;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31484u1;

    /* JADX INFO: renamed from: u2, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31485u2;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31486u3;

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31487u4;

    /* JADX INFO: renamed from: u5, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31488u5;

    /* JADX INFO: renamed from: u6, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31489u6;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final com.roblox.client.flags.a.i f31490v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31491v0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31492v1;

    /* JADX INFO: renamed from: v2, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31493v2;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31494v3;

    /* JADX INFO: renamed from: v4, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31495v4;
    public final com.roblox.client.flags.a.d v5;

    /* JADX INFO: renamed from: v6, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31496v6;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.roblox.client.flags.a.i f31497w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31498w0;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31499w1;

    /* JADX INFO: renamed from: w2, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31500w2;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31501w3;

    /* JADX INFO: renamed from: w4, reason: collision with root package name */
    public final com.roblox.client.flags.a.f f31502w4;
    public final com.roblox.client.flags.a.d w5;

    /* JADX INFO: renamed from: w6, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31503w6;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f31504x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final com.roblox.client.flags.a.b f31505x0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31506x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31507x2;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31508x3;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31509x4;

    /* JADX INFO: renamed from: x5, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31510x5;

    /* JADX INFO: renamed from: x6, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31511x6;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final com.roblox.client.flags.a.i f31512y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31513y0;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public final com.roblox.client.flags.a.i f31514y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31515y2;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31516y3;

    /* JADX INFO: renamed from: y4, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31517y4;

    /* JADX INFO: renamed from: y5, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31518y5;

    /* JADX INFO: renamed from: y6, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31519y6;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final com.roblox.client.flags.a.i f31520z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31521z0;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public final com.roblox.client.flags.a.C0140a f31522z1;

    /* JADX INFO: renamed from: z2, reason: collision with root package name */
    public final com.roblox.client.flags.a.g f31523z2;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31524z3;

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31525z4;

    /* JADX INFO: renamed from: z5, reason: collision with root package name */
    public final com.roblox.client.flags.a.d f31526z5;

    /* JADX INFO: renamed from: z6, reason: collision with root package name */
    public final com.roblox.client.flags.a.f f31527z6;

    public a() {
        com.roblox.client.flags.a.b bVar = new com.roblox.client.flags.a.b("InfluxThrottleRate", 10, false);
        this.b = bVar;
        i6("InfluxThrottleRate", bVar);
        com.roblox.client.flags.a.i iVar = new com.roblox.client.flags.a.i("InfluxTcpHost", "ec2-54-165-151-168.compute-1.amazonaws.com", false);
        this.f31338c = iVar;
        i6("InfluxTcpHost", iVar);
        com.roblox.client.flags.a.b bVar2 = new com.roblox.client.flags.a.b("InfluxTcpPort", 8094, false);
        this.f31346d = bVar2;
        i6("InfluxTcpPort", bVar2);
        com.roblox.client.flags.a.b bVar3 = new com.roblox.client.flags.a.b("InfluxTcpTimeToLiveInSeconds", 10, false);
        this.f31354e = bVar3;
        i6("InfluxTcpTimeToLiveInSeconds", bVar3);
        com.roblox.client.flags.a.i iVar2 = new com.roblox.client.flags.a.i("NotificationStreamPath", "notificationstream/embedded", false);
        this.f31362f = iVar2;
        i6("NotificationStreamPath", iVar2);
        com.roblox.client.flags.a.b bVar4 = new com.roblox.client.flags.a.b("NumberOfFailedLoginsBeforeResetPasswordMessage", 5, false);
        this.f31370g = bVar4;
        i6("NumberOfFailedLoginsBeforeResetPasswordMessage", bVar4);
        Boolean bool = Boolean.FALSE;
        com.roblox.client.flags.a.C0140a c0140a = new com.roblox.client.flags.a.C0140a("FFlagAppRatingTelemetry", bool, false);
        this.f31378h = c0140a;
        i6("FFlagAppRatingTelemetry", c0140a);
        com.roblox.client.flags.a.C0140a c0140a2 = new com.roblox.client.flags.a.C0140a("AndroidTextFieldDefaultHintFix", bool, false);
        this.f31386i = c0140a2;
        i6("AndroidTextFieldDefaultHintFix", c0140a2);
        com.roblox.client.flags.a.b bVar5 = new com.roblox.client.flags.a.b("AppRatingsPlayTimeInMinutes", 10, false);
        this.f31394j = bVar5;
        i6("AppRatingsPlayTimeInMinutes", bVar5);
        com.roblox.client.flags.a.b bVar6 = new com.roblox.client.flags.a.b("AppRatingsNumberOfFriendsForLaunch", 1, false);
        this.f31402k = bVar6;
        i6("AppRatingsNumberOfFriendsForLaunch", bVar6);
        com.roblox.client.flags.a.b bVar7 = new com.roblox.client.flags.a.b("AppRatingsLaunchCount", 3, false);
        this.f31410l = bVar7;
        i6("AppRatingsLaunchCount", bVar7);
        com.roblox.client.flags.a.b bVar8 = new com.roblox.client.flags.a.b("AppRatingsDaysSinceFirstUse", 5, false);
        this.f31418m = bVar8;
        i6("AppRatingsDaysSinceFirstUse", bVar8);
        com.roblox.client.flags.a.b bVar9 = new com.roblox.client.flags.a.b("AppRatingsLaunchesUntilReminder", 4, false);
        this.f31426n = bVar9;
        i6("AppRatingsLaunchesUntilReminder", bVar9);
        com.roblox.client.flags.a.b bVar10 = new com.roblox.client.flags.a.b("AppRatingsDaysUntilReminder", 6, false);
        this.f31434o = bVar10;
        i6("AppRatingsDaysUntilReminder", bVar10);
        com.roblox.client.flags.a.b bVar11 = new com.roblox.client.flags.a.b("AppRatingsGamesPlayed", 7, false);
        this.f31442p = bVar11;
        i6("AppRatingsGamesPlayed", bVar11);
        com.roblox.client.flags.a.c cVar = new com.roblox.client.flags.a.c("TimeBeforeWebViewRefreshInMs", 180000L, false);
        this.f31450q = cVar;
        i6("TimeBeforeWebViewRefreshInMs", cVar);
        com.roblox.client.flags.a.b bVar12 = new com.roblox.client.flags.a.b("EventStreamBatchSize", 10, false);
        this.f31458r = bVar12;
        i6("EventStreamBatchSize", bVar12);
        com.roblox.client.flags.a.b bVar13 = new com.roblox.client.flags.a.b("EventStreamBatchTimeInSecs", 60, false);
        this.f31466s = bVar13;
        i6("EventStreamBatchTimeInSecs", bVar13);
        com.roblox.client.flags.a.b bVar14 = new com.roblox.client.flags.a.b("MinFunCaptchaWidthInPx", 400, false);
        this.f31474t = bVar14;
        i6("MinFunCaptchaWidthInPx", bVar14);
        com.roblox.client.flags.a.b bVar15 = new com.roblox.client.flags.a.b("MinFunCaptchaHeightInPx", 500, false);
        this.f31482u = bVar15;
        i6("MinFunCaptchaHeightInPx", bVar15);
        com.roblox.client.flags.a.i iVar3 = new com.roblox.client.flags.a.i("CrashpadUploadToBacktraceUrl", "https://uploads.backtrace.rbx.com/post", false);
        this.f31490v = iVar3;
        i6("CrashpadUploadToBacktraceUrl", iVar3);
        com.roblox.client.flags.a.i iVar4 = new com.roblox.client.flags.a.i("CrashpadUploadToBacktraceAndroidPlayerToken", "3fd27180e359d21ab86e48526adecaf75bfb062c138eb23e847ef1ed906f9aaf", false);
        this.f31497w = iVar4;
        i6("CrashpadUploadToBacktraceAndroidPlayerToken", iVar4);
        com.roblox.client.flags.a.b bVar16 = new com.roblox.client.flags.a.b("JavaCrashUploadToBacktracePercentage", 10, false);
        this.f31504x = bVar16;
        i6("JavaCrashUploadToBacktracePercentage", bVar16);
        com.roblox.client.flags.a.i iVar5 = new com.roblox.client.flags.a.i("JavaCrashUploadToBacktraceUrl", "https://uploads.backtrace.rbx.com/post", false);
        this.f31512y = iVar5;
        i6("JavaCrashUploadToBacktraceUrl", iVar5);
        com.roblox.client.flags.a.i iVar6 = new com.roblox.client.flags.a.i("JavaCrashUploadToBacktraceToken", "1d680abdb860308199d85e6e5b570e6990f0693c3f3a3628905f9157318fa0ea", false);
        this.f31520z = iVar6;
        i6("JavaCrashUploadToBacktraceToken", iVar6);
        com.roblox.client.flags.a.b bVar17 = new com.roblox.client.flags.a.b("JavaANRUploadToBacktracePercentage", 10, false);
        this.A = bVar17;
        i6("JavaANRUploadToBacktracePercentage", bVar17);
        Integer numValueOf = Integer.valueOf(BacktraceANRSettings.DEFAULT_ANR_TIMEOUT);
        com.roblox.client.flags.a.b bVar18 = new com.roblox.client.flags.a.b("JavaANRMaximumTimeout", numValueOf, false);
        this.B = bVar18;
        i6("JavaANRMaximumTimeout", bVar18);
        com.roblox.client.flags.a.b bVar19 = new com.roblox.client.flags.a.b("DefaultTapFilterLevel", 0, false);
        this.C = bVar19;
        i6("DefaultTapFilterLevel", bVar19);
        Boolean bool2 = Boolean.TRUE;
        com.roblox.client.flags.a.C0140a c0140a3 = new com.roblox.client.flags.a.C0140a("EnableTencentLinkingFeature", bool2, false);
        this.D = c0140a3;
        i6("EnableTencentLinkingFeature", c0140a3);
        com.roblox.client.flags.a.C0140a c0140a4 = new com.roblox.client.flags.a.C0140a("DisableLoadingOfRobuxUrlForTencentBuild", bool2, false);
        this.E = c0140a4;
        i6("DisableLoadingOfRobuxUrlForTencentBuild", c0140a4);
        com.roblox.client.flags.a.c cVar2 = new com.roblox.client.flags.a.c("EnableGameOrientationWithDelayInMs", 0L, false);
        this.F = cVar2;
        i6("EnableGameOrientationWithDelayInMs", cVar2);
        com.roblox.client.flags.a.C0140a c0140a5 = new com.roblox.client.flags.a.C0140a("EnableTencentWebHelpPage", bool, false);
        this.G = c0140a5;
        i6("EnableTencentWebHelpPage", c0140a5);
        com.roblox.client.flags.a.C0140a c0140a6 = new com.roblox.client.flags.a.C0140a("EnableTencentMSDKNotice", bool, false);
        this.H = c0140a6;
        i6("EnableTencentMSDKNotice", c0140a6);
        com.roblox.client.flags.a.i iVar7 = new com.roblox.client.flags.a.i("TencentMSDKNoticeActivityPath", "/act", false);
        this.I = iVar7;
        i6("TencentMSDKNoticeActivityPath", iVar7);
        com.roblox.client.flags.a.C0140a c0140a7 = new com.roblox.client.flags.a.C0140a("EnableFetchAgreementRetryOnLogin", bool, false);
        this.J = c0140a7;
        i6("EnableFetchAgreementRetryOnLogin", c0140a7);
        com.roblox.client.flags.a.C0140a c0140a8 = new com.roblox.client.flags.a.C0140a("EnableAgreementIdReuseOnSignUp", bool, false);
        this.K = c0140a8;
        i6("EnableAgreementIdReuseOnSignUp", c0140a8);
        com.roblox.client.flags.a.i iVar8 = new com.roblox.client.flags.a.i("DefaultLuobuShareThumbnailsSize", "150x150", false);
        this.L = iVar8;
        i6("DefaultLuobuShareThumbnailsSize", iVar8);
        com.roblox.client.flags.a.i iVar9 = new com.roblox.client.flags.a.i("DefaultLuobuShareThumbnailsFormat", "Png", false);
        this.M = iVar9;
        i6("DefaultLuobuShareThumbnailsFormat", iVar9);
        com.roblox.client.flags.a.i iVar10 = new com.roblox.client.flags.a.i("DefaultLuobuHelpCenterThumbnailsSize", "75x75", false);
        this.N = iVar10;
        i6("DefaultLuobuHelpCenterThumbnailsSize", iVar10);
        com.roblox.client.flags.a.i iVar11 = new com.roblox.client.flags.a.i("DefaultLuobuHelpCenterThumbnailsFormat", "png", false);
        this.O = iVar11;
        i6("DefaultLuobuHelpCenterThumbnailsFormat", iVar11);
        com.roblox.client.flags.a.b bVar20 = new com.roblox.client.flags.a.b("LuobuShareThumbnailsRetryNumber", 3, false);
        this.P = bVar20;
        i6("LuobuShareThumbnailsRetryNumber", bVar20);
        com.roblox.client.flags.a.c cVar3 = new com.roblox.client.flags.a.c("RetryIntervalMs", 500L, false);
        this.Q = cVar3;
        i6("RetryIntervalMs", cVar3);
        com.roblox.client.flags.a.b bVar21 = new com.roblox.client.flags.a.b("LuobuThumbnailRetryBackoffMultiplier", 1, false);
        this.R = bVar21;
        i6("LuobuThumbnailRetryBackoffMultiplier", bVar21);
        com.roblox.client.flags.a.b bVar22 = new com.roblox.client.flags.a.b("LuobuShareThumbnailsRetryTimeoutMs", numValueOf, false);
        this.S = bVar22;
        i6("LuobuShareThumbnailsRetryTimeoutMs", bVar22);
        com.roblox.client.flags.a.C0140a c0140a9 = new com.roblox.client.flags.a.C0140a("TestCJVPayAPI", bool, false);
        this.T = c0140a9;
        i6("TestCJVPayAPI", c0140a9);
        com.roblox.client.flags.a.c cVar4 = new com.roblox.client.flags.a.c("NativeTextBoxOpenUpdateWaitTimeMs", 200L, false);
        this.U = cVar4;
        i6("NativeTextBoxOpenUpdateWaitTimeMs", cVar4);
        com.roblox.client.flags.a.i iVar12 = new com.roblox.client.flags.a.i("CustomLuobuCorpUrl", "https://roblox.qq.com/?webview=true0409", false);
        this.V = iVar12;
        i6("CustomLuobuCorpUrl", iVar12);
        com.roblox.client.flags.a.i iVar13 = new com.roblox.client.flags.a.i("ChannelIdsEnabledForStructureShare", "", false);
        this.W = iVar13;
        i6("ChannelIdsEnabledForStructureShare", iVar13);
        com.roblox.client.flags.a.i iVar14 = new com.roblox.client.flags.a.i("LuobuShareUrl", "https://luobu.qq.com/fx/a20210622fxy/index.html", false);
        this.X = iVar14;
        i6("LuobuShareUrl", iVar14);
        com.roblox.client.flags.a.C0140a c0140a10 = new com.roblox.client.flags.a.C0140a("EnableLuobuSignupCheck", bool, false);
        this.Y = c0140a10;
        i6("EnableLuobuSignupCheck", c0140a10);
        com.roblox.client.flags.a.i iVar15 = new com.roblox.client.flags.a.i("LuobuAgeRatingInstructionUrl", "https://roblox.qq.com/m/m202106/newsDetail.html?newsid=14640697", false);
        this.Z = iVar15;
        i6("LuobuAgeRatingInstructionUrl", iVar15);
        com.roblox.client.flags.a.C0140a c0140a11 = new com.roblox.client.flags.a.C0140a("FFlagShouldDisableAdIds", bool, false);
        this.f31324a0 = c0140a11;
        i6("FFlagShouldDisableAdIds", c0140a11);
        com.roblox.client.flags.a.C0140a c0140a12 = new com.roblox.client.flags.a.C0140a("FFlagDisableLuobuAutoLoginCheckImprovement2", bool, false);
        this.f31331b0 = c0140a12;
        i6("FFlagDisableLuobuAutoLoginCheckImprovement2", c0140a12);
        com.roblox.client.flags.a.C0140a c0140a13 = new com.roblox.client.flags.a.C0140a("FFlagDisableLuobuTDMReport", bool, false);
        this.f31339c0 = c0140a13;
        i6("FFlagDisableLuobuTDMReport", c0140a13);
        com.roblox.client.flags.a.C0140a c0140a14 = new com.roblox.client.flags.a.C0140a("EnabledLuobuSignupSuspensionNotice", bool, false);
        this.f31347d0 = c0140a14;
        i6("EnabledLuobuSignupSuspensionNotice", c0140a14);
        com.roblox.client.flags.a.i iVar16 = new com.roblox.client.flags.a.i("LuobuSignupSuspensionNoticeUrl", "https://roblox.qq.com/m/m202106/newsDetail.html?newsid=15196933", false);
        this.f31355e0 = iVar16;
        i6("LuobuSignupSuspensionNoticeUrl", iVar16);
        com.roblox.client.flags.a.i iVar17 = new com.roblox.client.flags.a.i("AndroidIAPList", "", false);
        this.f31363f0 = iVar17;
        i6("AndroidIAPList", iVar17);
        com.roblox.client.flags.a.i iVar18 = new com.roblox.client.flags.a.i("AndroidIAPSubList", "", false);
        this.f31371g0 = iVar18;
        i6("AndroidIAPSubList", iVar18);
        com.roblox.client.flags.a.C0140a c0140a15 = new com.roblox.client.flags.a.C0140a("EnableBackgroundExperiment", bool, false);
        this.f31379h0 = c0140a15;
        i6("EnableBackgroundExperiment", c0140a15);
        com.roblox.client.flags.a.C0140a c0140a16 = new com.roblox.client.flags.a.C0140a("GrantPendingPurchaseIntervalEnabled", bool, false);
        this.f31387i0 = c0140a16;
        i6("GrantPendingPurchaseIntervalEnabled", c0140a16);
        com.roblox.client.flags.a.c cVar5 = new com.roblox.client.flags.a.c("GrantPendingPurchaseInterval", 10L, false);
        this.f31395j0 = cVar5;
        i6("GrantPendingPurchaseInterval", cVar5);
        com.roblox.client.flags.a.b bVar23 = new com.roblox.client.flags.a.b("MemoryInfoThresholdsMaxAndroidVersionAllowed", 33, false);
        this.f31403k0 = bVar23;
        i6("MemoryInfoThresholdsMaxAndroidVersionAllowed", bVar23);
        com.roblox.client.flags.a.b bVar24 = new com.roblox.client.flags.a.b("AndroidApplicationExitReasonNumEntriesToFetch", 10, false);
        this.f31411l0 = bVar24;
        i6("AndroidApplicationExitReasonNumEntriesToFetch", bVar24);
        com.roblox.client.flags.a.C0140a c0140a17 = new com.roblox.client.flags.a.C0140a("EnableIrisGameJoinAndroid2", bool, false);
        this.f31419m0 = c0140a17;
        i6("EnableIrisGameJoinAndroid2", c0140a17);
        com.roblox.client.flags.a.i iVar19 = new com.roblox.client.flags.a.i("BacktraceLogSize", "200", false);
        this.f31427n0 = iVar19;
        i6("BacktraceLogSize", iVar19);
        com.roblox.client.flags.a.C0140a c0140a18 = new com.roblox.client.flags.a.C0140a("RemoveUserThemeSignalRReceiver", bool, false);
        this.f31435o0 = c0140a18;
        i6("RemoveUserThemeSignalRReceiver", c0140a18);
        com.roblox.client.flags.a.C0140a c0140a19 = new com.roblox.client.flags.a.C0140a("DisableSendrSilentPushNotificationDisplay", bool, true);
        this.f31443p0 = c0140a19;
        i6("DisableSendrSilentPushNotificationDisplay", c0140a19);
        com.roblox.client.flags.a.C0140a c0140a20 = new com.roblox.client.flags.a.C0140a("DisableUserAgeCheckInPushUpsell", bool, false);
        this.f31451q0 = c0140a20;
        i6("DisableUserAgeCheckInPushUpsell", c0140a20);
        com.roblox.client.flags.a.C0140a c0140a21 = new com.roblox.client.flags.a.C0140a("DisablePushReceivedNativeLogging", bool, true);
        this.f31459r0 = c0140a21;
        i6("DisablePushReceivedNativeLogging", c0140a21);
        com.roblox.client.flags.a.C0140a c0140a22 = new com.roblox.client.flags.a.C0140a("EnableMaquettesForceKill", bool, false);
        this.f31467s0 = c0140a22;
        i6("EnableMaquettesForceKill", c0140a22);
        com.roblox.client.flags.a.C0140a c0140a23 = new com.roblox.client.flags.a.C0140a("CleanupHttpAgentOnRestart", bool, true);
        this.f31475t0 = c0140a23;
        i6("CleanupHttpAgentOnRestart", c0140a23);
        com.roblox.client.flags.a.C0140a c0140a24 = new com.roblox.client.flags.a.C0140a("RetryFlagPrefetchOnBackgroundFailure", bool, true);
        this.f31483u0 = c0140a24;
        i6("RetryFlagPrefetchOnBackgroundFailure", c0140a24);
        com.roblox.client.flags.a.C0140a c0140a25 = new com.roblox.client.flags.a.C0140a("AndroidAddBuildVariantToGlobalTags", bool, true);
        this.f31491v0 = c0140a25;
        i6("AndroidAddBuildVariantToGlobalTags", c0140a25);
        com.roblox.client.flags.a.C0140a c0140a26 = new com.roblox.client.flags.a.C0140a("AndroidEnableBatteryPowerMetrics", bool, true);
        this.f31498w0 = c0140a26;
        i6("AndroidEnableBatteryPowerMetrics", c0140a26);
        com.roblox.client.flags.a.b bVar25 = new com.roblox.client.flags.a.b("QuestDeviceAttestationTimeoutMs", 3000, false);
        this.f31505x0 = bVar25;
        i6("QuestDeviceAttestationTimeoutMs", bVar25);
        com.roblox.client.flags.a.C0140a c0140a27 = new com.roblox.client.flags.a.C0140a("DisableLoginSignupScreenshot", bool, true);
        this.f31513y0 = c0140a27;
        i6("DisableLoginSignupScreenshot", c0140a27);
        com.roblox.client.flags.a.C0140a c0140a28 = new com.roblox.client.flags.a.C0140a("ValidateAppAssetsContentProviderCaller", bool, false);
        this.f31521z0 = c0140a28;
        i6("ValidateAppAssetsContentProviderCaller", c0140a28);
        com.roblox.client.flags.a.C0140a c0140a29 = new com.roblox.client.flags.a.C0140a("EnableUpsellRobuxBonusItemIXPExperiment", bool, false);
        this.A0 = c0140a29;
        i6("EnableUpsellRobuxBonusItemIXPExperiment", c0140a29);
        com.roblox.client.flags.a.i iVar20 = new com.roblox.client.flags.a.i("UpsellRobuxBonusItemProductIdList", "", false);
        this.B0 = iVar20;
        i6("UpsellRobuxBonusItemProductIdList", iVar20);
        com.roblox.client.flags.a.C0140a c0140a30 = new com.roblox.client.flags.a.C0140a("EnableScreentimeClientBehavior", bool, false);
        this.C0 = c0140a30;
        i6("EnableScreentimeClientBehavior", c0140a30);
        com.roblox.client.flags.a.C0140a c0140a31 = new com.roblox.client.flags.a.C0140a("EnablePreferImmediatelyAvailableCredentialsSupport", bool, true);
        this.D0 = c0140a31;
        i6("EnablePreferImmediatelyAvailableCredentialsSupport", c0140a31);
        com.roblox.client.flags.a.C0140a c0140a32 = new com.roblox.client.flags.a.C0140a("EnableUsernameParameterForCMPasswords", bool, true);
        this.E0 = c0140a32;
        i6("EnableUsernameParameterForCMPasswords", c0140a32);
        com.roblox.client.flags.a.C0140a c0140a33 = new com.roblox.client.flags.a.C0140a("EnableAppsFlyerOptOutStorageAndroid", bool, true);
        this.F0 = c0140a33;
        i6("EnableAppsFlyerOptOutStorageAndroid", c0140a33);
        com.roblox.client.flags.a.C0140a c0140a34 = new com.roblox.client.flags.a.C0140a("EnableToSwitchToSettingsAppWithRouteAndroid", bool, false);
        this.G0 = c0140a34;
        i6("EnableToSwitchToSettingsAppWithRouteAndroid", c0140a34);
        com.roblox.client.flags.a.C0140a c0140a35 = new com.roblox.client.flags.a.C0140a("AndroidTrackingToggleEnabled", bool, true);
        this.H0 = c0140a35;
        i6("AndroidTrackingToggleEnabled", c0140a35);
        com.roblox.client.flags.a.C0140a c0140a36 = new com.roblox.client.flags.a.C0140a("ExposeAppSuspended2", bool, true);
        this.I0 = c0140a36;
        i6("ExposeAppSuspended2", c0140a36);
        com.roblox.client.flags.a.C0140a c0140a37 = new com.roblox.client.flags.a.C0140a("EnableAndroidAssertDialog", bool, false);
        this.J0 = c0140a37;
        i6("EnableAndroidAssertDialog", c0140a37);
        com.roblox.client.flags.a.C0140a c0140a38 = new com.roblox.client.flags.a.C0140a("CrashWhenFlagsNotLoaded", bool, true);
        this.K0 = c0140a38;
        i6("CrashWhenFlagsNotLoaded", c0140a38);
        com.roblox.client.flags.a.C0140a c0140a39 = new com.roblox.client.flags.a.C0140a("PermissionsProtocolAndroidDisableSpecialHandling", bool, true);
        this.L0 = c0140a39;
        i6("PermissionsProtocolAndroidDisableSpecialHandling", c0140a39);
        com.roblox.client.flags.a.C0140a c0140a40 = new com.roblox.client.flags.a.C0140a("DisableAndroidAppsflyerFirstPlayerEvent", bool, true);
        this.M0 = c0140a40;
        i6("DisableAndroidAppsflyerFirstPlayerEvent", c0140a40);
        com.roblox.client.flags.a.C0140a c0140a41 = new com.roblox.client.flags.a.C0140a("DisableAndroidAppsflyerPlayCompleteEvent", bool, true);
        this.N0 = c0140a41;
        i6("DisableAndroidAppsflyerPlayCompleteEvent", c0140a41);
        com.roblox.client.flags.a.C0140a c0140a42 = new com.roblox.client.flags.a.C0140a("DisableAndroidAppsflyerRetentionEvent", bool, true);
        this.O0 = c0140a42;
        i6("DisableAndroidAppsflyerRetentionEvent", c0140a42);
        com.roblox.client.flags.a.C0140a c0140a43 = new com.roblox.client.flags.a.C0140a("EnableAndroidAppsflyerCustomerUserID", bool, true);
        this.P0 = c0140a43;
        i6("EnableAndroidAppsflyerCustomerUserID", c0140a43);
        com.roblox.client.flags.a.C0140a c0140a44 = new com.roblox.client.flags.a.C0140a("EnableGrantPendingPurchasesRefactor", bool, false);
        this.Q0 = c0140a44;
        i6("EnableGrantPendingPurchasesRefactor", c0140a44);
        com.roblox.client.flags.a.C0140a c0140a45 = new com.roblox.client.flags.a.C0140a("AndroidFixKeyboardScreenRotation2", bool, false);
        this.R0 = c0140a45;
        i6("AndroidFixKeyboardScreenRotation2", c0140a45);
        com.roblox.client.flags.a.C0140a c0140a46 = new com.roblox.client.flags.a.C0140a("AndroidAppChatPushSupportsGuid", bool, true);
        this.S0 = c0140a46;
        i6("AndroidAppChatPushSupportsGuid", c0140a46);
        com.roblox.client.flags.a.C0140a c0140a47 = new com.roblox.client.flags.a.C0140a("EnableReferredByPlayerIdAndroid", bool, true);
        this.T0 = c0140a47;
        i6("EnableReferredByPlayerIdAndroid", c0140a47);
        com.roblox.client.flags.a.C0140a c0140a48 = new com.roblox.client.flags.a.C0140a("EnableAndroidBinaryChannelsLogging", bool, false);
        this.U0 = c0140a48;
        i6("EnableAndroidBinaryChannelsLogging", c0140a48);
        com.roblox.client.flags.a.b bVar26 = new com.roblox.client.flags.a.b("AndroidBinaryChannelsLoggingThrottlingHundredthPercentage", 0, false);
        this.V0 = bVar26;
        i6("AndroidBinaryChannelsLoggingThrottlingHundredthPercentage", bVar26);
        com.roblox.client.flags.a.c cVar6 = new com.roblox.client.flags.a.c("AndroidSoftwareKeyboardOpenConfirmationTimeMs", 250L, false);
        this.W0 = cVar6;
        i6("AndroidSoftwareKeyboardOpenConfirmationTimeMs", cVar6);
        com.roblox.client.flags.a.C0140a c0140a49 = new com.roblox.client.flags.a.C0140a("AndroidGestureMultitouch", bool, false);
        this.X0 = c0140a49;
        i6("AndroidGestureMultitouch", c0140a49);
        com.roblox.client.flags.a.b bVar27 = new com.roblox.client.flags.a.b("AndroidAssetReadLoggingThrottleHundredthsPercent", 0, false);
        this.Y0 = bVar27;
        i6("AndroidAssetReadLoggingThrottleHundredthsPercent", bVar27);
        com.roblox.client.flags.a.C0140a c0140a50 = new com.roblox.client.flags.a.C0140a("AndroidLogAssetReads", bool, false);
        this.Z0 = c0140a50;
        i6("AndroidLogAssetReads", c0140a50);
        com.roblox.client.flags.a.C0140a c0140a51 = new com.roblox.client.flags.a.C0140a("MoveNotificationManagerRemoveObserverFromPauseToStop2", bool, true);
        this.f31325a1 = c0140a51;
        i6("MoveNotificationManagerRemoveObserverFromPauseToStop2", c0140a51);
        com.roblox.client.flags.a.C0140a c0140a52 = new com.roblox.client.flags.a.C0140a("InternalForceConsumePlayPointsOOAP2", bool, false);
        this.f31332b1 = c0140a52;
        i6("InternalForceConsumePlayPointsOOAP2", c0140a52);
        com.roblox.client.flags.a.C0140a c0140a53 = new com.roblox.client.flags.a.C0140a("EnableEnhancedClientMetricsForGooglePurchaseFlowV2", bool, false);
        this.f31340c1 = c0140a53;
        i6("EnableEnhancedClientMetricsForGooglePurchaseFlowV2", c0140a53);
        com.roblox.client.flags.a.C0140a c0140a54 = new com.roblox.client.flags.a.C0140a("FeatureDeliverySendUserId", bool, false);
        this.f31348d1 = c0140a54;
        i6("FeatureDeliverySendUserId", c0140a54);
        com.roblox.client.flags.a.b bVar28 = new com.roblox.client.flags.a.b("FeatureDeliveryLoggingAndroidThrottlingHundredthPercentage", 0, false);
        this.f31356e1 = bVar28;
        i6("FeatureDeliveryLoggingAndroidThrottlingHundredthPercentage", bVar28);
        com.roblox.client.flags.a.C0140a c0140a55 = new com.roblox.client.flags.a.C0140a("DownloadPersonaSDKImmediately", bool, false);
        this.f31364f1 = c0140a55;
        i6("DownloadPersonaSDKImmediately", c0140a55);
        com.roblox.client.flags.a.b bVar29 = new com.roblox.client.flags.a.b("SkipReportingIsolatedProcessAsInferredCrashReportingThrottleHundredthPercent", 0, false);
        this.f31372g1 = bVar29;
        i6("SkipReportingIsolatedProcessAsInferredCrashReportingThrottleHundredthPercent", bVar29);
        com.roblox.client.flags.a.C0140a c0140a56 = new com.roblox.client.flags.a.C0140a("UpdateRetryAttemptCountBeforeUpload", bool, true);
        this.f31380h1 = c0140a56;
        i6("UpdateRetryAttemptCountBeforeUpload", c0140a56);
        com.roblox.client.flags.a.C0140a c0140a57 = new com.roblox.client.flags.a.C0140a("UseUrlEncodedStringForEventUpload", bool, true);
        this.f31388i1 = c0140a57;
        i6("UseUrlEncodedStringForEventUpload", c0140a57);
        com.roblox.client.flags.a.b bVar30 = new com.roblox.client.flags.a.b("EventUploadBatchSize", 10, false);
        this.f31396j1 = bVar30;
        i6("EventUploadBatchSize", bVar30);
        com.roblox.client.flags.a.C0140a c0140a58 = new com.roblox.client.flags.a.C0140a("NotificationEnableDuplicateNotificationIdMonitoring", bool, false);
        this.f31404k1 = c0140a58;
        i6("NotificationEnableDuplicateNotificationIdMonitoring", c0140a58);
        com.roblox.client.flags.a.b bVar31 = new com.roblox.client.flags.a.b("NotificationPastNotificationIdsCount", 100, false);
        this.f31412l1 = bVar31;
        i6("NotificationPastNotificationIdsCount", bVar31);
        com.roblox.client.flags.a.C0140a c0140a59 = new com.roblox.client.flags.a.C0140a("AndroidEnableRemainInExperienceOnHandleDeepLinkUrl", bool, false);
        this.f31420m1 = c0140a59;
        i6("AndroidEnableRemainInExperienceOnHandleDeepLinkUrl", c0140a59);
        com.roblox.client.flags.a.C0140a c0140a60 = new com.roblox.client.flags.a.C0140a("EnableDeepLinkWhitelist", bool, false);
        this.f31428n1 = c0140a60;
        i6("EnableDeepLinkWhitelist", c0140a60);
        com.roblox.client.flags.a.i iVar21 = new com.roblox.client.flags.a.i("DeepLinkWhitelist", "https://www.roblox.com/commerce/app-redirect", false);
        this.f31436o1 = iVar21;
        i6("DeepLinkWhitelist", iVar21);
        com.roblox.client.flags.a.C0140a c0140a61 = new com.roblox.client.flags.a.C0140a("EnableAppStartFunnelEvents", bool, true);
        this.f31444p1 = c0140a61;
        i6("EnableAppStartFunnelEvents", c0140a61);
        com.roblox.client.flags.a.C0140a c0140a62 = new com.roblox.client.flags.a.C0140a("GmasdkAdReportUnrequestedAd", bool, false);
        this.f31452q1 = c0140a62;
        i6("GmasdkAdReportUnrequestedAd", c0140a62);
        com.roblox.client.flags.a.b bVar32 = new com.roblox.client.flags.a.b("GmaSdkRewardedVideoControlsFadeDelayMs", 3000, false);
        this.f31460r1 = bVar32;
        i6("GmaSdkRewardedVideoControlsFadeDelayMs", bVar32);
        com.roblox.client.flags.a.b bVar33 = new com.roblox.client.flags.a.b("GmaSdkDelayedExitDurationMs", numValueOf, false);
        this.f31468s1 = bVar33;
        i6("GmaSdkDelayedExitDurationMs", bVar33);
        com.roblox.client.flags.a.b bVar34 = new com.roblox.client.flags.a.b("GmasdkRewardCountdownMessageRetentionMsAndroid", 3000, false);
        this.f31476t1 = bVar34;
        i6("GmasdkRewardCountdownMessageRetentionMsAndroid", bVar34);
        com.roblox.client.flags.a.C0140a c0140a63 = new com.roblox.client.flags.a.C0140a("GmaSdkTopRightCloseButton", bool, false);
        this.f31484u1 = c0140a63;
        i6("GmaSdkTopRightCloseButton", c0140a63);
        com.roblox.client.flags.a.C0140a c0140a64 = new com.roblox.client.flags.a.C0140a("LinkingProtocolNewMessageBus", bool, true);
        this.f31492v1 = c0140a64;
        i6("LinkingProtocolNewMessageBus", c0140a64);
        com.roblox.client.flags.a.C0140a c0140a65 = new com.roblox.client.flags.a.C0140a("EnablePermissionsNewRequestResponseForAndroid", bool, true);
        this.f31499w1 = c0140a65;
        i6("EnablePermissionsNewRequestResponseForAndroid", c0140a65);
        com.roblox.client.flags.a.C0140a c0140a66 = new com.roblox.client.flags.a.C0140a("EnableSpaceTelemetry", bool, true);
        this.f31506x1 = c0140a66;
        i6("EnableSpaceTelemetry", c0140a66);
        com.roblox.client.flags.a.i iVar22 = new com.roblox.client.flags.a.i("EUDSAReportBaseUrlAndroid", "https://www.roblox.com/illegal-content-reporting?contentURL=%s", false);
        this.f31514y1 = iVar22;
        i6("EUDSAReportBaseUrlAndroid", iVar22);
        com.roblox.client.flags.a.C0140a c0140a67 = new com.roblox.client.flags.a.C0140a("IsUrlRegisteredNewRequestResponse", bool, true);
        this.f31522z1 = c0140a67;
        i6("IsUrlRegisteredNewRequestResponse", c0140a67);
        com.roblox.client.flags.a.C0140a c0140a68 = new com.roblox.client.flags.a.C0140a("GmasdkUseDeferredInstall2", bool, false);
        this.A1 = c0140a68;
        i6("GmasdkUseDeferredInstall2", c0140a68);
        com.roblox.client.flags.a.C0140a c0140a69 = new com.roblox.client.flags.a.C0140a("AndroidArm32MimallocTuning", bool, true);
        this.B1 = c0140a69;
        i6("AndroidArm32MimallocTuning", c0140a69);
        com.roblox.client.flags.a.C0140a c0140a70 = new com.roblox.client.flags.a.C0140a("AndroidArm32MimallocReserveOsMemory512M", bool, true);
        this.C1 = c0140a70;
        i6("AndroidArm32MimallocReserveOsMemory512M", c0140a70);
        com.roblox.client.flags.a.C0140a c0140a71 = new com.roblox.client.flags.a.C0140a("AndroidArm32MimallocReserveOsMemory768M", bool, true);
        this.D1 = c0140a71;
        i6("AndroidArm32MimallocReserveOsMemory768M", c0140a71);
        com.roblox.client.flags.a.C0140a c0140a72 = new com.roblox.client.flags.a.C0140a("AndroidArm32MimallocReserveOsMemory1024M", bool, true);
        this.E1 = c0140a72;
        i6("AndroidArm32MimallocReserveOsMemory1024M", c0140a72);
        com.roblox.client.flags.a.C0140a c0140a73 = new com.roblox.client.flags.a.C0140a("AndroidArm32MimallocLimitOsAlloc", bool, true);
        this.F1 = c0140a73;
        i6("AndroidArm32MimallocLimitOsAlloc", c0140a73);
        com.roblox.client.flags.a.C0140a c0140a74 = new com.roblox.client.flags.a.C0140a("AndroidArm32MimallocDisableEagerCommit", bool, true);
        this.G1 = c0140a74;
        i6("AndroidArm32MimallocDisableEagerCommit", c0140a74);
        com.roblox.client.flags.a.C0140a c0140a75 = new com.roblox.client.flags.a.C0140a("AndroidArm32MimallocDisableArenaEagerCommit", bool, true);
        this.H1 = c0140a75;
        i6("AndroidArm32MimallocDisableArenaEagerCommit", c0140a75);
        com.roblox.client.flags.a.C0140a c0140a76 = new com.roblox.client.flags.a.C0140a("AndroidCollectThermalThrottling", bool, false);
        this.I1 = c0140a76;
        i6("AndroidCollectThermalThrottling", c0140a76);
        com.roblox.client.flags.a.C0140a c0140a77 = new com.roblox.client.flags.a.C0140a("IdentityProtocolConstructLauncherInternally", bool, true);
        this.J1 = c0140a77;
        i6("IdentityProtocolConstructLauncherInternally", c0140a77);
        com.roblox.client.flags.a.b bVar35 = new com.roblox.client.flags.a.b("GmasdkMaxScreenHoldDurationMs", numValueOf, false);
        this.K1 = bVar35;
        i6("GmasdkMaxScreenHoldDurationMs", bVar35);
        com.roblox.client.flags.a.C0140a c0140a78 = new com.roblox.client.flags.a.C0140a("AndroidTestEnableTestDeviceName", bool, false);
        this.L1 = c0140a78;
        i6("AndroidTestEnableTestDeviceName", c0140a78);
        com.roblox.client.flags.a.i iVar23 = new com.roblox.client.flags.a.i("GmaSdkAppPromoAdTypeString", "AppPromo", false);
        this.M1 = iVar23;
        i6("GmaSdkAppPromoAdTypeString", iVar23);
        com.roblox.client.flags.a.b bVar36 = new com.roblox.client.flags.a.b("GoogleAdViewHeartbeatIntervalMs", 1000, false);
        this.N1 = bVar36;
        i6("GoogleAdViewHeartbeatIntervalMs", bVar36);
        com.roblox.client.flags.a.b bVar37 = new com.roblox.client.flags.a.b("GoogleAdViewHeartbeatCount", 1, false);
        this.O1 = bVar37;
        i6("GoogleAdViewHeartbeatCount", bVar37);
        com.roblox.client.flags.a.b bVar38 = new com.roblox.client.flags.a.b("AdsCtrDebuggingLoggingThrottleHundredthsPercent", 0, false);
        this.P1 = bVar38;
        i6("AdsCtrDebuggingLoggingThrottleHundredthsPercent", bVar38);
        com.roblox.client.flags.a.b bVar39 = new com.roblox.client.flags.a.b("EndCardTelemetryThrottleHundredthsPercent", 0, false);
        this.Q1 = bVar39;
        i6("EndCardTelemetryThrottleHundredthsPercent", bVar39);
        com.roblox.client.flags.a.C0140a c0140a79 = new com.roblox.client.flags.a.C0140a("MoveIsFreshInstall", bool, false);
        this.R1 = c0140a79;
        i6("MoveIsFreshInstall", c0140a79);
        com.roblox.client.flags.a.C0140a c0140a80 = new com.roblox.client.flags.a.C0140a("EnableFullDiskUsageTelemetry", bool, false);
        this.S1 = c0140a80;
        i6("EnableFullDiskUsageTelemetry", c0140a80);
        com.roblox.client.flags.a.C0140a c0140a81 = new com.roblox.client.flags.a.C0140a("UseAndroidGooglePaymentsProtocol6", bool, false);
        this.T1 = c0140a81;
        i6("UseAndroidGooglePaymentsProtocol6", c0140a81);
        com.roblox.client.flags.a.C0140a c0140a82 = new com.roblox.client.flags.a.C0140a("UseAndroidGooglePaymentsProtocolForGrantPendingPurchases3", bool, false);
        this.U1 = c0140a82;
        i6("UseAndroidGooglePaymentsProtocolForGrantPendingPurchases3", c0140a82);
        com.roblox.client.flags.a.C0140a c0140a83 = new com.roblox.client.flags.a.C0140a("UseAndroidSamsungPaymentsProtocol5", bool, false);
        this.V1 = c0140a83;
        i6("UseAndroidSamsungPaymentsProtocol5", c0140a83);
        com.roblox.client.flags.a.c cVar7 = new com.roblox.client.flags.a.c("GmaSdkGetQueryInfoTimeoutInSeconds", 3L, false);
        this.W1 = cVar7;
        i6("GmaSdkGetQueryInfoTimeoutInSeconds", cVar7);
        com.roblox.client.flags.a.c cVar8 = new com.roblox.client.flags.a.c("GmaSdkDestroyTimeoutInSeconds", 3L, false);
        this.X1 = cVar8;
        i6("GmaSdkDestroyTimeoutInSeconds", cVar8);
        com.roblox.client.flags.a.c cVar9 = new com.roblox.client.flags.a.c("GmaSdkMakeAdRequestWithStringTimeoutInSeconds", 3L, false);
        this.Y1 = cVar9;
        i6("GmaSdkMakeAdRequestWithStringTimeoutInSeconds", cVar9);
        com.roblox.client.flags.a.b bVar40 = new com.roblox.client.flags.a.b("IsolatedGmaSdkBindPriority", 0, false);
        this.Z1 = bVar40;
        i6("IsolatedGmaSdkBindPriority", bVar40);
        com.roblox.client.flags.a.C0140a c0140a84 = new com.roblox.client.flags.a.C0140a("DFFlagSaveMicroProfileScreenshotsInExternalStorage", bool, false);
        this.f31326a2 = c0140a84;
        i6("DFFlagSaveMicroProfileScreenshotsInExternalStorage", c0140a84);
        com.roblox.client.flags.a.C0140a c0140a85 = new com.roblox.client.flags.a.C0140a("EnableRefreshIntegrityTokenProvider", bool, false);
        this.f31333b2 = c0140a85;
        i6("EnableRefreshIntegrityTokenProvider", c0140a85);
        com.roblox.client.flags.a.C0140a c0140a86 = new com.roblox.client.flags.a.C0140a("DetectUnusualLateNativeActivity", bool, true);
        this.f31341c2 = c0140a86;
        i6("DetectUnusualLateNativeActivity", c0140a86);
        com.roblox.client.flags.a.C0140a c0140a87 = new com.roblox.client.flags.a.C0140a("VideoCaptureEnableAndroidLocalSave2", bool, false);
        this.f31349d2 = c0140a87;
        i6("VideoCaptureEnableAndroidLocalSave2", c0140a87);
        com.roblox.client.flags.a.C0140a c0140a88 = new com.roblox.client.flags.a.C0140a("EnableMagicLoginAndroidDebug", bool, false);
        this.f31357e2 = c0140a88;
        i6("EnableMagicLoginAndroidDebug", c0140a88);
        Integer numValueOf2 = Integer.valueOf(BacktraceMetrics.defaultTimeBetweenRetriesMs);
        com.roblox.client.flags.a.b bVar41 = new com.roblox.client.flags.a.b("MagicLoginSocketTimeout", numValueOf2, false);
        this.f31365f2 = bVar41;
        i6("MagicLoginSocketTimeout", bVar41);
        com.roblox.client.flags.a.C0140a c0140a89 = new com.roblox.client.flags.a.C0140a("UseSamsungPaymentSandboxTestMode", bool, false);
        this.f31373g2 = c0140a89;
        i6("UseSamsungPaymentSandboxTestMode", c0140a89);
        com.roblox.client.flags.a.C0140a c0140a90 = new com.roblox.client.flags.a.C0140a("VideoCaptureEnableAndroidShare", bool, true);
        this.f31381h2 = c0140a90;
        i6("VideoCaptureEnableAndroidShare", c0140a90);
        com.roblox.client.flags.a.C0140a c0140a91 = new com.roblox.client.flags.a.C0140a("EnableMainActivityStartTimeLogging", bool, true);
        this.f31389i2 = c0140a91;
        i6("EnableMainActivityStartTimeLogging", c0140a91);
        com.roblox.client.flags.a.C0140a c0140a92 = new com.roblox.client.flags.a.C0140a("EnableOnDemandModuleCheckOnAppStartup", bool, true);
        this.f31397j2 = c0140a92;
        i6("EnableOnDemandModuleCheckOnAppStartup", c0140a92);
        com.roblox.client.flags.a.C0140a c0140a93 = new com.roblox.client.flags.a.C0140a("AndroidHapticProtocolUpdateStateWithJNI", bool, false);
        this.f31405k2 = c0140a93;
        i6("AndroidHapticProtocolUpdateStateWithJNI", c0140a93);
        com.roblox.client.flags.a.C0140a c0140a94 = new com.roblox.client.flags.a.C0140a("BeginScheduledFlagFetch5", bool, true);
        this.f31413l2 = c0140a94;
        i6("BeginScheduledFlagFetch5", c0140a94);
        com.roblox.client.flags.a.C0140a c0140a95 = new com.roblox.client.flags.a.C0140a("EnableCachedFlagVersionBBackgroundFlush", bool, true);
        this.f31421m2 = c0140a95;
        i6("EnableCachedFlagVersionBBackgroundFlush", c0140a95);
        com.roblox.client.flags.a.C0140a c0140a96 = new com.roblox.client.flags.a.C0140a("UsePersistentFlagCacheStorage", bool, true);
        this.f31429n2 = c0140a96;
        i6("UsePersistentFlagCacheStorage", c0140a96);
        com.roblox.client.flags.a.C0140a c0140a97 = new com.roblox.client.flags.a.C0140a("LogCookieManagerInit", bool, true);
        this.f31437o2 = c0140a97;
        i6("LogCookieManagerInit", c0140a97);
        com.roblox.client.flags.a.c cVar10 = new com.roblox.client.flags.a.c("CustomRewardedVideoCallToActionTimingMS", 0L, false);
        this.f31445p2 = cVar10;
        i6("CustomRewardedVideoCallToActionTimingMS", cVar10);
        com.roblox.client.flags.a.C0140a c0140a98 = new com.roblox.client.flags.a.C0140a("LogScheduledFlagFetchTask", bool, true);
        this.f31453q2 = c0140a98;
        i6("LogScheduledFlagFetchTask", c0140a98);
        com.roblox.client.flags.a.C0140a c0140a99 = new com.roblox.client.flags.a.C0140a("EnableLazyRetryLayoutInflation", bool, false);
        this.f31461r2 = c0140a99;
        i6("EnableLazyRetryLayoutInflation", c0140a99);
        com.roblox.client.flags.a.C0140a c0140a100 = new com.roblox.client.flags.a.C0140a("DeferAppSettingsCacheWrite2", bool, false);
        this.f31469s2 = c0140a100;
        i6("DeferAppSettingsCacheWrite2", c0140a100);
        com.roblox.client.flags.a.b bVar42 = new com.roblox.client.flags.a.b("DeferAppSettingTimerInMs", 20000, false);
        this.f31477t2 = bVar42;
        i6("DeferAppSettingTimerInMs", bVar42);
        com.roblox.client.flags.a.d dVar = new com.roblox.client.flags.a.d("EnableRedirectLegacyRatingPromptToGoogleNativePrompt", bool, true);
        this.f31485u2 = dVar;
        i6("EnableRedirectLegacyRatingPromptToGoogleNativePrompt", dVar);
        com.roblox.client.flags.a.d dVar2 = new com.roblox.client.flags.a.d("EnableLegacyRatingPromptNewDesign", bool, true);
        this.f31493v2 = dVar2;
        i6("EnableLegacyRatingPromptNewDesign", dVar2);
        com.roblox.client.flags.a.d dVar3 = new com.roblox.client.flags.a.d("DisableLegacyRatingPromptSubheader", bool, true);
        this.f31500w2 = dVar3;
        i6("DisableLegacyRatingPromptSubheader", dVar3);
        com.roblox.client.flags.a.d dVar4 = new com.roblox.client.flags.a.d("EnableRedirectLegacyRatingPromptToSurvey", bool, true);
        this.f31507x2 = dVar4;
        i6("EnableRedirectLegacyRatingPromptToSurvey", dVar4);
        com.roblox.client.flags.a.d dVar5 = new com.roblox.client.flags.a.d("DisableLegacyRatingPrompt", bool, true);
        this.f31515y2 = dVar5;
        i6("DisableLegacyRatingPrompt", dVar5);
        com.roblox.client.flags.a.g gVar = new com.roblox.client.flags.a.g("LegacyRatingPromptSurveyUrl", "https://survey.roblox.com/jfe/form/SV_9XitwSm104jB4PQ", false);
        this.f31523z2 = gVar;
        i6("LegacyRatingPromptSurveyUrl", gVar);
        com.roblox.client.flags.a.d dVar6 = new com.roblox.client.flags.a.d("EnableClassicLauncherIconAndroid", bool, true);
        this.A2 = dVar6;
        i6("EnableClassicLauncherIconAndroid", dVar6);
        com.roblox.client.flags.a.d dVar7 = new com.roblox.client.flags.a.d("EnableSetAppIconAndroid", bool, true);
        this.B2 = dVar7;
        i6("EnableSetAppIconAndroid", dVar7);
        com.roblox.client.flags.a.d dVar8 = new com.roblox.client.flags.a.d("EnableCleanUpHalloweenIconAndroid", bool, true);
        this.C2 = dVar8;
        i6("EnableCleanUpHalloweenIconAndroid", dVar8);
        com.roblox.client.flags.a.d dVar9 = new com.roblox.client.flags.a.d("EnableClassicIconChangedDialogAndroid", bool, true);
        this.D2 = dVar9;
        i6("EnableClassicIconChangedDialogAndroid", dVar9);
        com.roblox.client.flags.a.f fVar = new com.roblox.client.flags.a.f("AndroidClassicLauncherIconTelemetryThrottlingPercentage", numValueOf2, false);
        this.E2 = fVar;
        i6("AndroidClassicLauncherIconTelemetryThrottlingPercentage", fVar);
        com.roblox.client.flags.a.d dVar10 = new com.roblox.client.flags.a.d("EnableAppLaunchFirstInstallTime", bool, true);
        this.F2 = dVar10;
        i6("EnableAppLaunchFirstInstallTime", dVar10);
        com.roblox.client.flags.a.d dVar11 = new com.roblox.client.flags.a.d("EnableBaselineProfileVerification", bool, true);
        this.G2 = dVar11;
        i6("EnableBaselineProfileVerification", dVar11);
        com.roblox.client.flags.a.d dVar12 = new com.roblox.client.flags.a.d("EnableJavaCrashClientCrashTelemetry", bool, true);
        this.H2 = dVar12;
        i6("EnableJavaCrashClientCrashTelemetry", dVar12);
        com.roblox.client.flags.a.d dVar13 = new com.roblox.client.flags.a.d("CollectLogcatOnNativeCrashAndroid", bool, true);
        this.I2 = dVar13;
        i6("CollectLogcatOnNativeCrashAndroid", dVar13);
        com.roblox.client.flags.a.d dVar14 = new com.roblox.client.flags.a.d("EnableGameActivity11", bool, true);
        this.J2 = dVar14;
        i6("EnableGameActivity11", dVar14);
        com.roblox.client.flags.a.d dVar15 = new com.roblox.client.flags.a.d("EnableHasRobloxSubscriptionParse", bool, true);
        this.K2 = dVar15;
        i6("EnableHasRobloxSubscriptionParse", dVar15);
        com.roblox.client.flags.a.d dVar16 = new com.roblox.client.flags.a.d("EnableToastMsgInGActivity", bool, true);
        this.L2 = dVar16;
        i6("EnableToastMsgInGActivity", dVar16);
        com.roblox.client.flags.a.d dVar17 = new com.roblox.client.flags.a.d("EnableAndroidLiveThemeUpdate", bool, true);
        this.M2 = dVar17;
        i6("EnableAndroidLiveThemeUpdate", dVar17);
        com.roblox.client.flags.a.d dVar18 = new com.roblox.client.flags.a.d("EnableRetryDialogTelemetry", bool, false);
        this.N2 = dVar18;
        i6("EnableRetryDialogTelemetry", dVar18);
        com.roblox.client.flags.a.d dVar19 = new com.roblox.client.flags.a.d("DisablePasswordCredentialRegistrationOnTv", bool, true);
        this.O2 = dVar19;
        i6("DisablePasswordCredentialRegistrationOnTv", dVar19);
        com.roblox.client.flags.a.d dVar20 = new com.roblox.client.flags.a.d("EnableMinApiLevelCheckForCredentialManagerOnTv", bool, true);
        this.P2 = dVar20;
        i6("EnableMinApiLevelCheckForCredentialManagerOnTv", dVar20);
        com.roblox.client.flags.a.d dVar21 = new com.roblox.client.flags.a.d("EnableDLICBridgeAndroid", bool, true);
        this.Q2 = dVar21;
        i6("EnableDLICBridgeAndroid", dVar21);
        com.roblox.client.flags.a.d dVar22 = new com.roblox.client.flags.a.d("EnableDLICInternalIngressSeeding", bool, true);
        this.R2 = dVar22;
        i6("EnableDLICInternalIngressSeeding", dVar22);
        com.roblox.client.flags.a.d dVar23 = new com.roblox.client.flags.a.d("EnableDLICSeedAndroidWebView", bool, false);
        this.S2 = dVar23;
        i6("EnableDLICSeedAndroidWebView", dVar23);
        com.roblox.client.flags.a.d dVar24 = new com.roblox.client.flags.a.d("EnableDLICReportReceivedUnifyAndroid", bool, false);
        this.T2 = dVar24;
        i6("EnableDLICReportReceivedUnifyAndroid", dVar24);
        com.roblox.client.flags.a.d dVar25 = new com.roblox.client.flags.a.d("EnableExternalOriginOnlyUrlRegistration", bool, false);
        this.U2 = dVar25;
        i6("EnableExternalOriginOnlyUrlRegistration", dVar25);
        com.roblox.client.flags.a.d dVar26 = new com.roblox.client.flags.a.d("EnableDeferredDeeplinkResolutionFallbackAndroid", bool2, true);
        this.V2 = dVar26;
        i6("EnableDeferredDeeplinkResolutionFallbackAndroid", dVar26);
        com.roblox.client.flags.a.d dVar27 = new com.roblox.client.flags.a.d("EnableDeeplinkCodeParamMergeAndroid", bool, true);
        this.W2 = dVar27;
        i6("EnableDeeplinkCodeParamMergeAndroid", dVar27);
        com.roblox.client.flags.a.d dVar28 = new com.roblox.client.flags.a.d("EnableOpenExternalBrowserDeepLinkAndroid", bool, true);
        this.X2 = dVar28;
        i6("EnableOpenExternalBrowserDeepLinkAndroid", dVar28);
        com.roblox.client.flags.a.f fVar2 = new com.roblox.client.flags.a.f("DelayedAppsFlyerStartConsentBackstopSeconds", 600, false);
        this.Y2 = fVar2;
        i6("DelayedAppsFlyerStartConsentBackstopSeconds", fVar2);
        com.roblox.client.flags.a.f fVar3 = new com.roblox.client.flags.a.f("DelayedAppsFlyerStartEligibilityTtlSeconds", 2592000, false);
        this.Z2 = fVar3;
        i6("DelayedAppsFlyerStartEligibilityTtlSeconds", fVar3);
        com.roblox.client.flags.a.d dVar29 = new com.roblox.client.flags.a.d("EnableAndroidUnlockOrientation", bool, true);
        this.f31327a3 = dVar29;
        i6("EnableAndroidUnlockOrientation", dVar29);
        com.roblox.client.flags.a.d dVar30 = new com.roblox.client.flags.a.d("EnableAndroidUnlockOrientationTabletOnly", bool, true);
        this.f31334b3 = dVar30;
        i6("EnableAndroidUnlockOrientationTabletOnly", dVar30);
        com.roblox.client.flags.a.d dVar31 = new com.roblox.client.flags.a.d("EnableAndroidBinaryChannelDownloadTiming", bool, true);
        this.f31342c3 = dVar31;
        i6("EnableAndroidBinaryChannelDownloadTiming", dVar31);
        com.roblox.client.flags.a.d dVar32 = new com.roblox.client.flags.a.d("AndroidMouseLockButtonFix", bool, false);
        this.f31350d3 = dVar32;
        i6("AndroidMouseLockButtonFix", dVar32);
        com.roblox.client.flags.a.d dVar33 = new com.roblox.client.flags.a.d("TextBoxSelectableWhenNotEditable", bool, false);
        this.f31358e3 = dVar33;
        i6("TextBoxSelectableWhenNotEditable", dVar33);
        com.roblox.client.flags.a.d dVar34 = new com.roblox.client.flags.a.d("TextBoxTextEditableSignal", bool, false);
        this.f31366f3 = dVar34;
        i6("TextBoxTextEditableSignal", dVar34);
        com.roblox.client.flags.a.d dVar35 = new com.roblox.client.flags.a.d("AndroidTouchUnbufferedDispatch", bool, true);
        this.f31374g3 = dVar35;
        i6("AndroidTouchUnbufferedDispatch", dVar35);
        com.roblox.client.flags.a.d dVar36 = new com.roblox.client.flags.a.d("EnableNativeLibResolvePathTelemetry", bool, true);
        this.f31382h3 = dVar36;
        i6("EnableNativeLibResolvePathTelemetry", dVar36);
        com.roblox.client.flags.a.f fVar4 = new com.roblox.client.flags.a.f("NativeLibResolvePathTelemetryThrottlingHundredthPercentage", numValueOf2, false);
        this.f31390i3 = fVar4;
        i6("NativeLibResolvePathTelemetryThrottlingHundredthPercentage", fVar4);
        com.roblox.client.flags.a.d dVar37 = new com.roblox.client.flags.a.d("EnableFeatureDeliveryRetry", bool, true);
        this.f31398j3 = dVar37;
        i6("EnableFeatureDeliveryRetry", dVar37);
        com.roblox.client.flags.a.d dVar38 = new com.roblox.client.flags.a.d("DebugFeatureDeliveryUseFakeManager", bool, true);
        this.f31406k3 = dVar38;
        i6("DebugFeatureDeliveryUseFakeManager", dVar38);
        com.roblox.client.flags.a.d dVar39 = new com.roblox.client.flags.a.d("DeleteRoomDBEventsOnClientError", bool, true);
        this.f31414l3 = dVar39;
        i6("DeleteRoomDBEventsOnClientError", dVar39);
        com.roblox.client.flags.a.d dVar40 = new com.roblox.client.flags.a.d("UseGsonForEventUpload", bool, true);
        this.f31422m3 = dVar40;
        i6("UseGsonForEventUpload", dVar40);
        com.roblox.client.flags.a.d dVar41 = new com.roblox.client.flags.a.d("EnablePinnedShortcutsOnHomeScreenAndroid4", bool, true);
        this.f31430n3 = dVar41;
        i6("EnablePinnedShortcutsOnHomeScreenAndroid4", dVar41);
        com.roblox.client.flags.a.g gVar2 = new com.roblox.client.flags.a.g("PinShortcutSilentManufacturers1", "huawei,xiaomi,oppo,vivo,realme", false);
        this.f31438o3 = gVar2;
        i6("PinShortcutSilentManufacturers1", gVar2);
        com.roblox.client.flags.a.d dVar42 = new com.roblox.client.flags.a.d("EnableShortcutStableTargetActivityAndroid2", bool, true);
        this.f31446p3 = dVar42;
        i6("EnableShortcutStableTargetActivityAndroid2", dVar42);
        com.roblox.client.flags.a.d dVar43 = new com.roblox.client.flags.a.d("EnableEdpPinnedShortcutsAndroid", bool, true);
        this.f31454q3 = dVar43;
        i6("EnableEdpPinnedShortcutsAndroid", dVar43);
        com.roblox.client.flags.a.d dVar44 = new com.roblox.client.flags.a.d("EnableRecreatePinShortcutCoroutine", bool, true);
        this.f31462r3 = dVar44;
        i6("EnableRecreatePinShortcutCoroutine", dVar44);
        com.roblox.client.flags.a.d dVar45 = new com.roblox.client.flags.a.d("EnableRecentlyPlayedWidgetAndroidShell6", bool, true);
        this.f31470s3 = dVar45;
        i6("EnableRecentlyPlayedWidgetAndroidShell6", dVar45);
        com.roblox.client.flags.a.d dVar46 = new com.roblox.client.flags.a.d("EnableRecentlyPlayedWidgetCounter", bool, true);
        this.f31478t3 = dVar46;
        i6("EnableRecentlyPlayedWidgetCounter", dVar46);
        com.roblox.client.flags.a.d dVar47 = new com.roblox.client.flags.a.d("EnableRecentlyPlayedWidgetOpenDeeplink", bool, true);
        this.f31486u3 = dVar47;
        i6("EnableRecentlyPlayedWidgetOpenDeeplink", dVar47);
        com.roblox.client.flags.a.d dVar48 = new com.roblox.client.flags.a.d("AndroidEnableFlushingTelemetryV1Events", bool, true);
        this.f31494v3 = dVar48;
        i6("AndroidEnableFlushingTelemetryV1Events", dVar48);
        com.roblox.client.flags.a.d dVar49 = new com.roblox.client.flags.a.d("AndroidEnableFlushingTelemetryV2Events", bool, true);
        this.f31501w3 = dVar49;
        i6("AndroidEnableFlushingTelemetryV2Events", dVar49);
        com.roblox.client.flags.a.d dVar50 = new com.roblox.client.flags.a.d("AndroidEnableTelemetryFlushWorker2", bool, true);
        this.f31508x3 = dVar50;
        i6("AndroidEnableTelemetryFlushWorker2", dVar50);
        com.roblox.client.flags.a.d dVar51 = new com.roblox.client.flags.a.d("DownloadWebRtcSdkImmediately", bool, true);
        this.f31516y3 = dVar51;
        i6("DownloadWebRtcSdkImmediately", dVar51);
        com.roblox.client.flags.a.d dVar52 = new com.roblox.client.flags.a.d("EnableWebRtcOnDemandPathLoad", bool, true);
        this.f31524z3 = dVar52;
        i6("EnableWebRtcOnDemandPathLoad", dVar52);
        com.roblox.client.flags.a.f fVar5 = new com.roblox.client.flags.a.f("AndroidPinnedShortcutActionThrottlingPercentage", numValueOf2, false);
        this.A3 = fVar5;
        i6("AndroidPinnedShortcutActionThrottlingPercentage", fVar5);
        com.roblox.client.flags.a.d dVar53 = new com.roblox.client.flags.a.d("DebugForceShowEndCardAndroid", bool, false);
        this.B3 = dVar53;
        i6("DebugForceShowEndCardAndroid", dVar53);
        com.roblox.client.flags.a.f fVar6 = new com.roblox.client.flags.a.f("DebugEndCardDurationMsAndroid", 0, false);
        this.C3 = fVar6;
        i6("DebugEndCardDurationMsAndroid", fVar6);
        com.roblox.client.flags.a.d dVar54 = new com.roblox.client.flags.a.d("DebugHideEndCardIconAndroid", bool, false);
        this.D3 = dVar54;
        i6("DebugHideEndCardIconAndroid", dVar54);
        com.roblox.client.flags.a.d dVar55 = new com.roblox.client.flags.a.d("EnableNewLocalStorageTelemetry", bool, true);
        this.E3 = dVar55;
        i6("EnableNewLocalStorageTelemetry", dVar55);
        com.roblox.client.flags.a.d dVar56 = new com.roblox.client.flags.a.d("EnableCLI198900_2", bool, true);
        this.F3 = dVar56;
        i6("EnableCLI198900_2", dVar56);
        com.roblox.client.flags.a.f fVar7 = new com.roblox.client.flags.a.f("IsolatedAdsBacktraceCrashUploadPercent", 0, false);
        this.G3 = fVar7;
        i6("IsolatedAdsBacktraceCrashUploadPercent", fVar7);
        com.roblox.client.flags.a.f fVar8 = new com.roblox.client.flags.a.f("VersionBCacheStatusThrottlePercentage", 10, false);
        this.H3 = fVar8;
        i6("VersionBCacheStatusThrottlePercentage", fVar8);
        com.roblox.client.flags.a.f fVar9 = new com.roblox.client.flags.a.f("IsolatedAdsBacktraceAnrUploadPercent", 0, false);
        this.I3 = fVar9;
        i6("IsolatedAdsBacktraceAnrUploadPercent", fVar9);
        com.roblox.client.flags.a.f fVar10 = new com.roblox.client.flags.a.f("IsolatedAdsBacktraceAnrTimeoutMs", numValueOf, false);
        this.J3 = fVar10;
        i6("IsolatedAdsBacktraceAnrTimeoutMs", fVar10);
        com.roblox.client.flags.a.g gVar3 = new com.roblox.client.flags.a.g("AdCtaExternalExitActivitySuffix", "MarketDeepLinkHandlerActivity", false);
        this.K3 = gVar3;
        i6("AdCtaExternalExitActivitySuffix", gVar3);
        com.roblox.client.flags.a.d dVar57 = new com.roblox.client.flags.a.d("UseABCEndpoint", bool, true);
        this.L3 = dVar57;
        i6("UseABCEndpoint", dVar57);
        com.roblox.client.flags.a.d dVar58 = new com.roblox.client.flags.a.d("UseAndroidGooglePaymentsProtocolQueryPurchases", bool, true);
        this.M3 = dVar58;
        i6("UseAndroidGooglePaymentsProtocolQueryPurchases", dVar58);
        com.roblox.client.flags.a.d dVar59 = new com.roblox.client.flags.a.d("UseAndroidPaymentsProtocolSurfacePreparePaymentErrorMessages", bool, false);
        this.N3 = dVar59;
        i6("UseAndroidPaymentsProtocolSurfacePreparePaymentErrorMessages", dVar59);
        com.roblox.client.flags.a.d dVar60 = new com.roblox.client.flags.a.d("UseAndroidPaymentsProtocolThrobber", bool, true);
        this.O3 = dVar60;
        i6("UseAndroidPaymentsProtocolThrobber", dVar60);
        com.roblox.client.flags.a.d dVar61 = new com.roblox.client.flags.a.d("UseAndroidPaymentsProtocolThreadsafeSessionId", bool, true);
        this.P3 = dVar61;
        i6("UseAndroidPaymentsProtocolThreadsafeSessionId", dVar61);
        com.roblox.client.flags.a.d dVar62 = new com.roblox.client.flags.a.d("FixAndroidPaymentsProtocolPurchaseFinishedNpe", bool, true);
        this.Q3 = dVar62;
        i6("FixAndroidPaymentsProtocolPurchaseFinishedNpe", dVar62);
        com.roblox.client.flags.a.d dVar63 = new com.roblox.client.flags.a.d("AndroidPaymentsProtocolUsePurchaseListenerForUserCancellation", bool, true);
        this.R3 = dVar63;
        i6("AndroidPaymentsProtocolUsePurchaseListenerForUserCancellation", dVar63);
        com.roblox.client.flags.a.d dVar64 = new com.roblox.client.flags.a.d("EnableAndroidGooglePaymentsProtocolV2V2", bool, true);
        this.S3 = dVar64;
        i6("EnableAndroidGooglePaymentsProtocolV2V2", dVar64);
        com.roblox.client.flags.a.d dVar65 = new com.roblox.client.flags.a.d("EnableAndroidPaymentsProtocolPaymentSessionId", bool, true);
        this.T3 = dVar65;
        i6("EnableAndroidPaymentsProtocolPaymentSessionId", dVar65);
        com.roblox.client.flags.a.d dVar66 = new com.roblox.client.flags.a.d("EnableNativePurchaseWithContext", bool, true);
        this.U3 = dVar66;
        i6("EnableNativePurchaseWithContext", dVar66);
        com.roblox.client.flags.a.d dVar67 = new com.roblox.client.flags.a.d("FixAndroidWebDialogPaymentSessionId", bool, true);
        this.V3 = dVar67;
        i6("FixAndroidWebDialogPaymentSessionId", dVar67);
        com.roblox.client.flags.a.d dVar68 = new com.roblox.client.flags.a.d("FixSamsungWebFragmentPaymentSessionId", bool, true);
        this.W3 = dVar68;
        i6("FixSamsungWebFragmentPaymentSessionId", dVar68);
        com.roblox.client.flags.a.d dVar69 = new com.roblox.client.flags.a.d("BlackbirdSubscriptionOfferIdEnabled2", bool, false);
        this.X3 = dVar69;
        i6("BlackbirdSubscriptionOfferIdEnabled2", dVar69);
        com.roblox.client.flags.a.d dVar70 = new com.roblox.client.flags.a.d("AndroidSubscriptionFailOnOfferIdNotFound", bool, false);
        this.Y3 = dVar70;
        i6("AndroidSubscriptionFailOnOfferIdNotFound", dVar70);
        com.roblox.client.flags.a.d dVar71 = new com.roblox.client.flags.a.d("BlackbirdEnableWebviewSubscriptionPurchaseGoogleV2", bool, false);
        this.Z3 = dVar71;
        i6("BlackbirdEnableWebviewSubscriptionPurchaseGoogleV2", dVar71);
        com.roblox.client.flags.a.f fVar11 = new com.roblox.client.flags.a.f("GmaSdkInitTimeoutInSeconds", 20, false);
        this.f31328a4 = fVar11;
        i6("GmaSdkInitTimeoutInSeconds", fVar11);
        com.roblox.client.flags.a.d dVar72 = new com.roblox.client.flags.a.d("EnableAppRatingPromptAndroidShell3", bool, true);
        this.f31335b4 = dVar72;
        i6("EnableAppRatingPromptAndroidShell3", dVar72);
        com.roblox.client.flags.a.d dVar73 = new com.roblox.client.flags.a.d("EnableAppRatingPromptSamsung", bool, false);
        this.f31343c4 = dVar73;
        i6("EnableAppRatingPromptSamsung", dVar73);
        com.roblox.client.flags.a.f fVar12 = new com.roblox.client.flags.a.f("AppRatingPromptErrorEventThrottlingHundredthPercentage", 0, false);
        this.f31351d4 = fVar12;
        i6("AppRatingPromptErrorEventThrottlingHundredthPercentage", fVar12);
        com.roblox.client.flags.a.d dVar74 = new com.roblox.client.flags.a.d("EnableGooglePlayGamesIntegration7", bool, true);
        this.f31359e4 = dVar74;
        i6("EnableGooglePlayGamesIntegration7", dVar74);
        com.roblox.client.flags.a.d dVar75 = new com.roblox.client.flags.a.d("EnablePGSAnalytics3", bool, true);
        this.f31367f4 = dVar75;
        i6("EnablePGSAnalytics3", dVar75);
        com.roblox.client.flags.a.d dVar76 = new com.roblox.client.flags.a.d("UseMinutesForPGSStreaks", bool, true);
        this.f31375g4 = dVar76;
        i6("UseMinutesForPGSStreaks", dVar76);
        com.roblox.client.flags.a.d dVar77 = new com.roblox.client.flags.a.d("PgsForceEnabled", bool, true);
        this.f31383h4 = dVar77;
        i6("PgsForceEnabled", dVar77);
        com.roblox.client.flags.a.d dVar78 = new com.roblox.client.flags.a.d("PgsExperimentEnabled", bool, true);
        this.f31391i4 = dVar78;
        i6("PgsExperimentEnabled", dVar78);
        com.roblox.client.flags.a.d dVar79 = new com.roblox.client.flags.a.d("PgsRolloutEnabled2", bool, true);
        this.f31399j4 = dVar79;
        i6("PgsRolloutEnabled2", dVar79);
        com.roblox.client.flags.a.d dVar80 = new com.roblox.client.flags.a.d("UsesPgsModuleForCountryEligibility", bool, true);
        this.f31407k4 = dVar80;
        i6("UsesPgsModuleForCountryEligibility", dVar80);
        com.roblox.client.flags.a.d dVar81 = new com.roblox.client.flags.a.d("PgsTreatmentActive", bool, true);
        this.f31415l4 = dVar81;
        i6("PgsTreatmentActive", dVar81);
        com.roblox.client.flags.a.f fVar13 = new com.roblox.client.flags.a.f("PgsExperimentPercent", 0, false);
        this.f31423m4 = fVar13;
        i6("PgsExperimentPercent", fVar13);
        com.roblox.client.flags.a.g gVar4 = new com.roblox.client.flags.a.g("PgsExperimentCountries", "ID,MX,GB,FR", false);
        this.f31431n4 = gVar4;
        i6("PgsExperimentCountries", gVar4);
        com.roblox.client.flags.a.g gVar5 = new com.roblox.client.flags.a.g("PgsRolloutCountries", "TH,IN,MX,BR,ID,JP,DE,GB,KR", false);
        this.f31439o4 = gVar5;
        i6("PgsRolloutCountries", gVar5);
        com.roblox.client.flags.a.d dVar82 = new com.roblox.client.flags.a.d("EnableAppAgeSignalsOnAndroid", bool, true);
        this.f31447p4 = dVar82;
        i6("EnableAppAgeSignalsOnAndroid", dVar82);
        com.roblox.client.flags.a.d dVar83 = new com.roblox.client.flags.a.d("AppAgeSignalsUseFakeManager", bool, true);
        this.f31455q4 = dVar83;
        i6("AppAgeSignalsUseFakeManager", dVar83);
        com.roblox.client.flags.a.g gVar6 = new com.roblox.client.flags.a.g("AppAgeSignalsFakeUserStatus", "VERIFIED", false);
        this.f31463r4 = gVar6;
        i6("AppAgeSignalsFakeUserStatus", gVar6);
        com.roblox.client.flags.a.f fVar14 = new com.roblox.client.flags.a.f("AppAgeSignalsFakeAgeLower", 18, false);
        this.f31471s4 = fVar14;
        i6("AppAgeSignalsFakeAgeLower", fVar14);
        com.roblox.client.flags.a.f fVar15 = new com.roblox.client.flags.a.f("AppAgeSignalsFakeAgeUpper", 99, false);
        this.f31479t4 = fVar15;
        i6("AppAgeSignalsFakeAgeUpper", fVar15);
        com.roblox.client.flags.a.d dVar84 = new com.roblox.client.flags.a.d("EnableAndroidShareViaFileProvider", bool, true);
        this.f31487u4 = dVar84;
        i6("EnableAndroidShareViaFileProvider", dVar84);
        com.roblox.client.flags.a.d dVar85 = new com.roblox.client.flags.a.d("EnableCookieManagerVersionB6", bool, true);
        this.f31495v4 = dVar85;
        i6("EnableCookieManagerVersionB6", dVar85);
        com.roblox.client.flags.a.f fVar16 = new com.roblox.client.flags.a.f("CookieVersionBLogoutBacktracePercentage", 5, false);
        this.f31502w4 = fVar16;
        i6("CookieVersionBLogoutBacktracePercentage", fVar16);
        com.roblox.client.flags.a.d dVar86 = new com.roblox.client.flags.a.d("HardcodeWebViewUserAgent", bool, true);
        this.f31509x4 = dVar86;
        i6("HardcodeWebViewUserAgent", dVar86);
        com.roblox.client.flags.a.d dVar87 = new com.roblox.client.flags.a.d("EnableWebViewCameraPermission", bool, true);
        this.f31517y4 = dVar87;
        i6("EnableWebViewCameraPermission", dVar87);
        com.roblox.client.flags.a.d dVar88 = new com.roblox.client.flags.a.d("EnableAndroidDevBranchConfiguration", bool, true);
        this.f31525z4 = dVar88;
        i6("EnableAndroidDevBranchConfiguration", dVar88);
        com.roblox.client.flags.a.d dVar89 = new com.roblox.client.flags.a.d("EnableRichPushNotification2", bool, true);
        this.A4 = dVar89;
        i6("EnableRichPushNotification2", dVar89);
        com.roblox.client.flags.a.d dVar90 = new com.roblox.client.flags.a.d("EnableRegisterBackgroundPushSettingsReportingOnPush", bool, true);
        this.B4 = dVar90;
        i6("EnableRegisterBackgroundPushSettingsReportingOnPush", dVar90);
        com.roblox.client.flags.a.d dVar91 = new com.roblox.client.flags.a.d("DisablePauseSessionInPersonaFlow", bool, true);
        this.C4 = dVar91;
        i6("DisablePauseSessionInPersonaFlow", dVar91);
        com.roblox.client.flags.a.d dVar92 = new com.roblox.client.flags.a.d("EnablePasskeySilentUpgradeForAndroid", bool, true);
        this.D4 = dVar92;
        i6("EnablePasskeySilentUpgradeForAndroid", dVar92);
        com.roblox.client.flags.a.d dVar93 = new com.roblox.client.flags.a.d("AddPowerSaverStats", bool, true);
        this.E4 = dVar93;
        i6("AddPowerSaverStats", dVar93);
        com.roblox.client.flags.a.f fVar17 = new com.roblox.client.flags.a.f("ScheduledFlagFetchPeriodMinutes", Integer.valueOf(MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE), false);
        this.F4 = fVar17;
        i6("ScheduledFlagFetchPeriodMinutes", fVar17);
        com.roblox.client.flags.a.f fVar18 = new com.roblox.client.flags.a.f("ScheduledFlagFetchPeriodFlexMinutes", 10, false);
        this.G4 = fVar18;
        i6("ScheduledFlagFetchPeriodFlexMinutes", fVar18);
        com.roblox.client.flags.a.d dVar94 = new com.roblox.client.flags.a.d("EnableAndroidHybridModuleTelemetry", bool, false);
        this.H4 = dVar94;
        i6("EnableAndroidHybridModuleTelemetry", dVar94);
        com.roblox.client.flags.a.d dVar95 = new com.roblox.client.flags.a.d("DisableAndroidDialogsHybridModule", bool, false);
        this.I4 = dVar95;
        i6("DisableAndroidDialogsHybridModule", dVar95);
        com.roblox.client.flags.a.d dVar96 = new com.roblox.client.flags.a.d("DisableAndroidAnalyticsHybridModule", bool, false);
        this.J4 = dVar96;
        i6("DisableAndroidAnalyticsHybridModule", dVar96);
        com.roblox.client.flags.a.d dVar97 = new com.roblox.client.flags.a.d("EnableNetworkStatusObserving", bool, true);
        this.K4 = dVar97;
        i6("EnableNetworkStatusObserving", dVar97);
        com.roblox.client.flags.a.d dVar98 = new com.roblox.client.flags.a.d("EnableConnectivityV2ForAndroid", bool, true);
        this.L4 = dVar98;
        i6("EnableConnectivityV2ForAndroid", dVar98);
        com.roblox.client.flags.a.d dVar99 = new com.roblox.client.flags.a.d("ConnectivityV2Metering", bool, true);
        this.M4 = dVar99;
        i6("ConnectivityV2Metering", dVar99);
        com.roblox.client.flags.a.d dVar100 = new com.roblox.client.flags.a.d("EnableSystemDialogHandlerInAndroid", bool, true);
        this.N4 = dVar100;
        i6("EnableSystemDialogHandlerInAndroid", dVar100);
        com.roblox.client.flags.a.d dVar101 = new com.roblox.client.flags.a.d("EnableDeviceDisplayHandlerInAndroid", bool, true);
        this.O4 = dVar101;
        i6("EnableDeviceDisplayHandlerInAndroid", dVar101);
        com.roblox.client.flags.a.d dVar102 = new com.roblox.client.flags.a.d("EnableDisplayWakeLock", bool, true);
        this.P4 = dVar102;
        i6("EnableDisplayWakeLock", dVar102);
        com.roblox.client.flags.a.d dVar103 = new com.roblox.client.flags.a.d("EnableAppPlatformQoSEmergencyOnAndroidStartup", bool, true);
        this.Q4 = dVar103;
        i6("EnableAppPlatformQoSEmergencyOnAndroidStartup", dVar103);
        com.roblox.client.flags.a.d dVar104 = new com.roblox.client.flags.a.d("EnableInitHelperNativeWrappers", bool, true);
        this.R4 = dVar104;
        i6("EnableInitHelperNativeWrappers", dVar104);
        com.roblox.client.flags.a.d dVar105 = new com.roblox.client.flags.a.d("EnableAdditionalTTIEvents", bool, true);
        this.S4 = dVar105;
        i6("EnableAdditionalTTIEvents", dVar105);
        com.roblox.client.flags.a.d dVar106 = new com.roblox.client.flags.a.d("EnableAttachBaseContextMilestone", bool, true);
        this.T4 = dVar106;
        i6("EnableAttachBaseContextMilestone", dVar106);
        com.roblox.client.flags.a.d dVar107 = new com.roblox.client.flags.a.d("EnableAndroidTTISetupMilestones", bool, true);
        this.U4 = dVar107;
        i6("EnableAndroidTTISetupMilestones", dVar107);
        com.roblox.client.flags.a.d dVar108 = new com.roblox.client.flags.a.d("RefreshAndroidCachedFlagsOnBackgroundFetch", bool, true);
        this.V4 = dVar108;
        i6("RefreshAndroidCachedFlagsOnBackgroundFetch", dVar108);
        com.roblox.client.flags.a.d dVar109 = new com.roblox.client.flags.a.d("EnableSendNotificationSettingsOnPushAck", bool, true);
        this.W4 = dVar109;
        i6("EnableSendNotificationSettingsOnPushAck", dVar109);
        com.roblox.client.flags.a.d dVar110 = new com.roblox.client.flags.a.d("RefreshRbxKeyboardAutofill2", bool, true);
        this.X4 = dVar110;
        i6("RefreshRbxKeyboardAutofill2", dVar110);
        com.roblox.client.flags.a.d dVar111 = new com.roblox.client.flags.a.d("EnableAndroidPasskeyAvailabilityPreflight", bool, true);
        this.Y4 = dVar111;
        i6("EnableAndroidPasskeyAvailabilityPreflight", dVar111);
        com.roblox.client.flags.a.d dVar112 = new com.roblox.client.flags.a.d("EnableAndroidWebViewService4", bool, true);
        this.Z4 = dVar112;
        i6("EnableAndroidWebViewService4", dVar112);
        com.roblox.client.flags.a.d dVar113 = new com.roblox.client.flags.a.d("FixKeyboardMinAdjustment", bool, true);
        this.f31329a5 = dVar113;
        i6("FixKeyboardMinAdjustment", dVar113);
        com.roblox.client.flags.a.d dVar114 = new com.roblox.client.flags.a.d("FixKeyboardPositionReportingOffset", bool, true);
        this.f31336b5 = dVar114;
        i6("FixKeyboardPositionReportingOffset", dVar114);
        com.roblox.client.flags.a.d dVar115 = new com.roblox.client.flags.a.d("VisiblePasswordIsText", bool, true);
        this.f31344c5 = dVar115;
        i6("VisiblePasswordIsText", dVar115);
        com.roblox.client.flags.a.d dVar116 = new com.roblox.client.flags.a.d("EnableAndroidSafeAreaInsetsInLuaApp", bool, true);
        this.f31352d5 = dVar116;
        i6("EnableAndroidSafeAreaInsetsInLuaApp", dVar116);
        com.roblox.client.flags.a.d dVar117 = new com.roblox.client.flags.a.d("EnableAndroidNavBarInSafeAreaInsets", bool, true);
        this.f31360e5 = dVar117;
        i6("EnableAndroidNavBarInSafeAreaInsets", dVar117);
        com.roblox.client.flags.a.d dVar118 = new com.roblox.client.flags.a.d("ExcludeKeyboardFromSafeAreaInsets", bool, true);
        this.f31368f5 = dVar118;
        i6("ExcludeKeyboardFromSafeAreaInsets", dVar118);
        com.roblox.client.flags.a.d dVar119 = new com.roblox.client.flags.a.d("AndroidConsumeContainerInsets", bool, true);
        this.f31376g5 = dVar119;
        i6("AndroidConsumeContainerInsets", dVar119);
        com.roblox.client.flags.a.d dVar120 = new com.roblox.client.flags.a.d("AndroidUseTypedWindowInsets", bool, true);
        this.f31384h5 = dVar120;
        i6("AndroidUseTypedWindowInsets", dVar120);
        com.roblox.client.flags.a.d dVar121 = new com.roblox.client.flags.a.d("AndroidWebViewInsetDrivenOffset", bool, true);
        this.f31392i5 = dVar121;
        i6("AndroidWebViewInsetDrivenOffset", dVar121);
        com.roblox.client.flags.a.d dVar122 = new com.roblox.client.flags.a.d("EnableAndroidPasswordSuggestion2", bool, true);
        this.f31400j5 = dVar122;
        i6("EnableAndroidPasswordSuggestion2", dVar122);
        com.roblox.client.flags.a.d dVar123 = new com.roblox.client.flags.a.d("EnableAutofillEvents", bool, true);
        this.f31408k5 = dVar123;
        i6("EnableAutofillEvents", dVar123);
        com.roblox.client.flags.a.g gVar7 = new com.roblox.client.flags.a.g("DebugNativeAdProcessContextOverride", "", false);
        this.f31416l5 = gVar7;
        i6("DebugNativeAdProcessContextOverride", gVar7);
        com.roblox.client.flags.a.g gVar8 = new com.roblox.client.flags.a.g("DebugRewardedAdProcessContextOverride", "", false);
        this.f31424m5 = gVar8;
        i6("DebugRewardedAdProcessContextOverride", gVar8);
        com.roblox.client.flags.a.f fVar19 = new com.roblox.client.flags.a.f("RewardedAdExperimentVariantMismatchTelemetryHundredthsPercent", 0, false);
        this.f31432n5 = fVar19;
        i6("RewardedAdExperimentVariantMismatchTelemetryHundredthsPercent", fVar19);
        com.roblox.client.flags.a.d dVar124 = new com.roblox.client.flags.a.d("CloseDeeplinkFlowEarlier", bool, false);
        this.f31440o5 = dVar124;
        i6("CloseDeeplinkFlowEarlier", dVar124);
        com.roblox.client.flags.a.d dVar125 = new com.roblox.client.flags.a.d("EnableDeeplinkReceivedExtendedCoverageAndroid2", bool, true);
        this.f31448p5 = dVar125;
        i6("EnableDeeplinkReceivedExtendedCoverageAndroid2", dVar125);
        com.roblox.client.flags.a.d dVar126 = new com.roblox.client.flags.a.d("PassFlagSignatureToEngine", bool, true);
        this.f31456q5 = dVar126;
        i6("PassFlagSignatureToEngine", dVar126);
        com.roblox.client.flags.a.d dVar127 = new com.roblox.client.flags.a.d("EnableChannelsMigrationFirstPhase", bool, true);
        this.f31464r5 = dVar127;
        i6("EnableChannelsMigrationFirstPhase", dVar127);
        com.roblox.client.flags.a.d dVar128 = new com.roblox.client.flags.a.d("EnableChannelsMigrationSecondPhase3", bool, true);
        this.f31472s5 = dVar128;
        i6("EnableChannelsMigrationSecondPhase3", dVar128);
        com.roblox.client.flags.a.d dVar129 = new com.roblox.client.flags.a.d("EnableFriendPresenceNotificationChannel", bool, true);
        this.f31480t5 = dVar129;
        i6("EnableFriendPresenceNotificationChannel", dVar129);
        com.roblox.client.flags.a.d dVar130 = new com.roblox.client.flags.a.d("RevertNotificationChannelsMigration", bool, true);
        this.f31488u5 = dVar130;
        i6("RevertNotificationChannelsMigration", dVar130);
        com.roblox.client.flags.a.d dVar131 = new com.roblox.client.flags.a.d("EnableNotificationChannelGrouping2", bool, true);
        this.v5 = dVar131;
        i6("EnableNotificationChannelGrouping2", dVar131);
        com.roblox.client.flags.a.d dVar132 = new com.roblox.client.flags.a.d("EnableAndroidCallPushNotification", bool, true);
        this.w5 = dVar132;
        i6("EnableAndroidCallPushNotification", dVar132);
        com.roblox.client.flags.a.d dVar133 = new com.roblox.client.flags.a.d("EnableSamsungIapNewVersionWithObfuscatedProfileId", bool, true);
        this.f31510x5 = dVar133;
        i6("EnableSamsungIapNewVersionWithObfuscatedProfileId", dVar133);
        com.roblox.client.flags.a.d dVar134 = new com.roblox.client.flags.a.d("SkipChannelBurnOnBackgroundStart", bool, true);
        this.f31518y5 = dVar134;
        i6("SkipChannelBurnOnBackgroundStart", dVar134);
        com.roblox.client.flags.a.d dVar135 = new com.roblox.client.flags.a.d("PTFDisablesPersonaSdk", bool, true);
        this.f31526z5 = dVar135;
        i6("PTFDisablesPersonaSdk", dVar135);
        com.roblox.client.flags.a.d dVar136 = new com.roblox.client.flags.a.d("PTFDisableSurfaceViewRequestFocus", bool, true);
        this.A5 = dVar136;
        i6("PTFDisableSurfaceViewRequestFocus", dVar136);
        com.roblox.client.flags.a.d dVar137 = new com.roblox.client.flags.a.d("EnableTextInputRestoreOnShowKeyboard", bool, true);
        this.B5 = dVar137;
        i6("EnableTextInputRestoreOnShowKeyboard", dVar137);
        com.roblox.client.flags.a.d dVar138 = new com.roblox.client.flags.a.d("StratusEnableSetStatusBarVisibility", bool, true);
        this.C5 = dVar138;
        i6("StratusEnableSetStatusBarVisibility", dVar138);
        com.roblox.client.flags.a.d dVar139 = new com.roblox.client.flags.a.d("EnableHideAndroidStatusBarInLandscape", bool, true);
        this.D5 = dVar139;
        i6("EnableHideAndroidStatusBarInLandscape", dVar139);
        com.roblox.client.flags.a.d dVar140 = new com.roblox.client.flags.a.d("EnableAndroidUnifiedSystemBarControl2", bool, false);
        this.E5 = dVar140;
        i6("EnableAndroidUnifiedSystemBarControl2", dVar140);
        com.roblox.client.flags.a.d dVar141 = new com.roblox.client.flags.a.d("RevertNewPasswordInputTypeChange", bool, true);
        this.F5 = dVar141;
        i6("RevertNewPasswordInputTypeChange", dVar141);
        com.roblox.client.flags.a.d dVar142 = new com.roblox.client.flags.a.d("AndroidWebViewFocusFix", bool, true);
        this.G5 = dVar142;
        i6("AndroidWebViewFocusFix", dVar142);
        com.roblox.client.flags.a.d dVar143 = new com.roblox.client.flags.a.d("SkipFlagFetchWorkerAppForeground", bool, true);
        this.H5 = dVar143;
        i6("SkipFlagFetchWorkerAppForeground", dVar143);
        com.roblox.client.flags.a.d dVar144 = new com.roblox.client.flags.a.d("ShowHeaderForRobux", bool, true);
        this.I5 = dVar144;
        i6("ShowHeaderForRobux", dVar144);
        com.roblox.client.flags.a.d dVar145 = new com.roblox.client.flags.a.d("EnableReportNotificationChannelsAsJson", bool, true);
        this.J5 = dVar145;
        i6("EnableReportNotificationChannelsAsJson", dVar145);
        com.roblox.client.flags.a.d dVar146 = new com.roblox.client.flags.a.d("AndroidSendTouchEndVelocity", bool, true);
        this.K5 = dVar146;
        i6("AndroidSendTouchEndVelocity", dVar146);
        com.roblox.client.flags.a.d dVar147 = new com.roblox.client.flags.a.d("AndroidProcessHistoricalTouchEvents", bool, true);
        this.L5 = dVar147;
        i6("AndroidProcessHistoricalTouchEvents", dVar147);
        com.roblox.client.flags.a.d dVar148 = new com.roblox.client.flags.a.d("AndroidGuardNullInputAdapter", bool, true);
        this.M5 = dVar148;
        i6("AndroidGuardNullInputAdapter", dVar148);
        com.roblox.client.flags.a.d dVar149 = new com.roblox.client.flags.a.d("FixHapticProtocolCrash", bool, true);
        this.N5 = dVar149;
        i6("FixHapticProtocolCrash", dVar149);
        com.roblox.client.flags.a.d dVar150 = new com.roblox.client.flags.a.d("EnableInflateTracking", bool, true);
        this.O5 = dVar150;
        i6("EnableInflateTracking", dVar150);
        com.roblox.client.flags.a.d dVar151 = new com.roblox.client.flags.a.d("EnableDeferredLayoutInflation", bool, true);
        this.P5 = dVar151;
        i6("EnableDeferredLayoutInflation", dVar151);
        com.roblox.client.flags.a.d dVar152 = new com.roblox.client.flags.a.d("StratusKeepScreenOn", bool, true);
        this.Q5 = dVar152;
        i6("StratusKeepScreenOn", dVar152);
        com.roblox.client.flags.a.d dVar153 = new com.roblox.client.flags.a.d("EnableGameStreamingOrientationChangeAndroid", bool, true);
        this.R5 = dVar153;
        i6("EnableGameStreamingOrientationChangeAndroid", dVar153);
        com.roblox.client.flags.a.d dVar154 = new com.roblox.client.flags.a.d("CrashWhenAppBridgeNotStarted", bool, true);
        this.S5 = dVar154;
        i6("CrashWhenAppBridgeNotStarted", dVar154);
        com.roblox.client.flags.a.d dVar155 = new com.roblox.client.flags.a.d("EnableBackgroundOtaPolling2", bool, true);
        this.T5 = dVar155;
        i6("EnableBackgroundOtaPolling2", dVar155);
        com.roblox.client.flags.a.d dVar156 = new com.roblox.client.flags.a.d("DebugSkipInAppOtaDownload", bool, true);
        this.U5 = dVar156;
        i6("DebugSkipInAppOtaDownload", dVar156);
        com.roblox.client.flags.a.d dVar157 = new com.roblox.client.flags.a.d("DebugSkipOtaPatchVerification", bool, true);
        this.V5 = dVar157;
        i6("DebugSkipOtaPatchVerification", dVar157);
        com.roblox.client.flags.a.d dVar158 = new com.roblox.client.flags.a.d("EnableOtaWorkerFlagsFromSchedule", bool, false);
        this.W5 = dVar158;
        i6("EnableOtaWorkerFlagsFromSchedule", dVar158);
        com.roblox.client.flags.a.d dVar159 = new com.roblox.client.flags.a.d("EnableOtaWorkerMaxAppVersionCheck", bool, true);
        this.X5 = dVar159;
        i6("EnableOtaWorkerMaxAppVersionCheck", dVar159);
        com.roblox.client.flags.a.d dVar160 = new com.roblox.client.flags.a.d("EnableOtaWorkerRetargetConfigUrl", bool, false);
        this.Y5 = dVar160;
        i6("EnableOtaWorkerRetargetConfigUrl", dVar160);
        com.roblox.client.flags.a.d dVar161 = new com.roblox.client.flags.a.d("EnableOtaWorkerBindNetwork", bool, false);
        this.Z5 = dVar161;
        i6("EnableOtaWorkerBindNetwork", dVar161);
        com.roblox.client.flags.a.g gVar9 = new com.roblox.client.flags.a.g("DataModelPatcherRevokedPublicKeyIds", "", false);
        this.f31330a6 = gVar9;
        i6("DataModelPatcherRevokedPublicKeyIds", gVar9);
        com.roblox.client.flags.a.g gVar10 = new com.roblox.client.flags.a.g("DataModelPatcherRevokedSignatureTypes", "", false);
        this.f31337b6 = gVar10;
        i6("DataModelPatcherRevokedSignatureTypes", gVar10);
        com.roblox.client.flags.a.f fVar20 = new com.roblox.client.flags.a.f("BackgroundOtaPollingIntervalMinutes", 60, false);
        this.f31345c6 = fVar20;
        i6("BackgroundOtaPollingIntervalMinutes", fVar20);
        com.roblox.client.flags.a.f fVar21 = new com.roblox.client.flags.a.f("BackgroundOtaPollingFlexMinutes", 30, false);
        this.f31353d6 = fVar21;
        i6("BackgroundOtaPollingFlexMinutes", fVar21);
        com.roblox.client.flags.a.f fVar22 = new com.roblox.client.flags.a.f("BackgroundOtaPollingMaxRetryAttempts", 3, false);
        this.f31361e6 = fVar22;
        i6("BackgroundOtaPollingMaxRetryAttempts", fVar22);
        com.roblox.client.flags.a.f fVar23 = new com.roblox.client.flags.a.f("BackgroundOtaPollingInactivityDays", 3, false);
        this.f31369f6 = fVar23;
        i6("BackgroundOtaPollingInactivityDays", fVar23);
        com.roblox.client.flags.a.d dVar162 = new com.roblox.client.flags.a.d("BackgroundOtaPollingWifiOnly", bool, true);
        this.f31377g6 = dVar162;
        i6("BackgroundOtaPollingWifiOnly", dVar162);
        com.roblox.client.flags.a.d dVar163 = new com.roblox.client.flags.a.d("EnableDesignFoundations", bool, true);
        this.f31385h6 = dVar163;
        i6("EnableDesignFoundations", dVar163);
        com.roblox.client.flags.a.f fVar24 = new com.roblox.client.flags.a.f("GmaSdkAdapterInitInfoEventThrottleHundredthsPercent", 0, false);
        this.f31393i6 = fVar24;
        i6("GmaSdkAdapterInitInfoEventThrottleHundredthsPercent", fVar24);
        com.roblox.client.flags.a.d dVar164 = new com.roblox.client.flags.a.d("MigrateDesyncCounterToTelemetryBindings", bool, true);
        this.f31401j6 = dVar164;
        i6("MigrateDesyncCounterToTelemetryBindings", dVar164);
        com.roblox.client.flags.a.d dVar165 = new com.roblox.client.flags.a.d("EnableAndroidWebViewMemoryTelemetry", bool, true);
        this.f31409k6 = dVar165;
        i6("EnableAndroidWebViewMemoryTelemetry", dVar165);
        com.roblox.client.flags.a.d dVar166 = new com.roblox.client.flags.a.d("EnableAndroidWebViewLeakFix", bool, true);
        this.f31417l6 = dVar166;
        i6("EnableAndroidWebViewLeakFix", dVar166);
        com.roblox.client.flags.a.d dVar167 = new com.roblox.client.flags.a.d("EnablePayloadDrivenNotificationActions", bool, true);
        this.f31425m6 = dVar167;
        i6("EnablePayloadDrivenNotificationActions", dVar167);
        com.roblox.client.flags.a.d dVar168 = new com.roblox.client.flags.a.d("EnablePayloadDrivenNotificationChannels", bool, true);
        this.f31433n6 = dVar168;
        i6("EnablePayloadDrivenNotificationChannels", dVar168);
        com.roblox.client.flags.a.d dVar169 = new com.roblox.client.flags.a.d("OSGameSearchEnabled2", bool, true);
        this.f31441o6 = dVar169;
        i6("OSGameSearchEnabled2", dVar169);
        com.roblox.client.flags.a.d dVar170 = new com.roblox.client.flags.a.d("OSGameSearchAccountSwitchFixEnabled", bool, true);
        this.f31449p6 = dVar170;
        i6("OSGameSearchAccountSwitchFixEnabled", dVar170);
        com.roblox.client.flags.a.d dVar171 = new com.roblox.client.flags.a.d("OSSearchClickTelemetryEnabled", bool, true);
        this.f31457q6 = dVar171;
        i6("OSSearchClickTelemetryEnabled", dVar171);
        com.roblox.client.flags.a.d dVar172 = new com.roblox.client.flags.a.d("OSSearchThumbnailTelemetryEnabled", bool, true);
        this.f31465r6 = dVar172;
        i6("OSSearchThumbnailTelemetryEnabled", dVar172);
        com.roblox.client.flags.a.d dVar173 = new com.roblox.client.flags.a.d("OSSearchDefaultIconEnabled", bool, true);
        this.f31473s6 = dVar173;
        i6("OSSearchDefaultIconEnabled", dVar173);
        com.roblox.client.flags.a.d dVar174 = new com.roblox.client.flags.a.d("EnableSignalCheckoutSessionIdOnPurchase", bool, true);
        this.f31481t6 = dVar174;
        i6("EnableSignalCheckoutSessionIdOnPurchase", dVar174);
        com.roblox.client.flags.a.d dVar175 = new com.roblox.client.flags.a.d("EnableGameIdToExcludeParameterAndroid", bool, true);
        this.f31489u6 = dVar175;
        i6("EnableGameIdToExcludeParameterAndroid", dVar175);
        com.roblox.client.flags.a.d dVar176 = new com.roblox.client.flags.a.d("EnableGmaSdkInSessionActivation", bool, true);
        this.f31496v6 = dVar176;
        i6("EnableGmaSdkInSessionActivation", dVar176);
        com.roblox.client.flags.a.d dVar177 = new com.roblox.client.flags.a.d("EnableGmaSdkControllerImpl", bool, true);
        this.f31503w6 = dVar177;
        i6("EnableGmaSdkControllerImpl", dVar177);
        com.roblox.client.flags.a.d dVar178 = new com.roblox.client.flags.a.d("EnableGmaSdkEarlyInit", bool, true);
        this.f31511x6 = dVar178;
        i6("EnableGmaSdkEarlyInit", dVar178);
        com.roblox.client.flags.a.d dVar179 = new com.roblox.client.flags.a.d("EnableRewardedAdEntryPointDestroyFix", bool, false);
        this.f31519y6 = dVar179;
        i6("EnableRewardedAdEntryPointDestroyFix", dVar179);
        com.roblox.client.flags.a.f fVar25 = new com.roblox.client.flags.a.f("GmaSdkServeAdTimeoutInSeconds", 10, false);
        this.f31527z6 = fVar25;
        i6("GmaSdkServeAdTimeoutInSeconds", fVar25);
        com.roblox.client.flags.a.d dVar180 = new com.roblox.client.flags.a.d("FixAdNotReadyPlaybackStatus", bool, true);
        this.A6 = dVar180;
        i6("FixAdNotReadyPlaybackStatus", dVar180);
        com.roblox.client.flags.a.f fVar26 = new com.roblox.client.flags.a.f("RewardedVideoGetQueryInfoResultThrottleHundredthsPercent", 0, false);
        this.B6 = fVar26;
        i6("RewardedVideoGetQueryInfoResultThrottleHundredthsPercent", fVar26);
        com.roblox.client.flags.a.d dVar181 = new com.roblox.client.flags.a.d("EnableLazyWorkManagerInit", bool, true);
        this.C6 = dVar181;
        i6("EnableLazyWorkManagerInit", dVar181);
        com.roblox.client.flags.a.d dVar182 = new com.roblox.client.flags.a.d("EnableLibLoadParallelWork", bool, true);
        this.D6 = dVar182;
        i6("EnableLibLoadParallelWork", dVar182);
        com.roblox.client.flags.a.d dVar183 = new com.roblox.client.flags.a.d("EnableEarlyAssetUnpack", bool, true);
        this.E6 = dVar183;
        i6("EnableEarlyAssetUnpack", dVar183);
        com.roblox.client.flags.a.d dVar184 = new com.roblox.client.flags.a.d("EnableEarlyPlayIntegrityWarmup", bool, true);
        this.F6 = dVar184;
        i6("EnableEarlyPlayIntegrityWarmup", dVar184);
        com.roblox.client.flags.a.d dVar185 = new com.roblox.client.flags.a.d("EnableEarlySharedPrefsWarmup", bool, true);
        this.G6 = dVar185;
        i6("EnableEarlySharedPrefsWarmup", dVar185);
        com.roblox.client.flags.a.d dVar186 = new com.roblox.client.flags.a.d("EnableClassicLauncherIconTelemetryFixAndroid", bool, true);
        this.H6 = dVar186;
        i6("EnableClassicLauncherIconTelemetryFixAndroid", dVar186);
        com.roblox.client.flags.a.d dVar187 = new com.roblox.client.flags.a.d("EnableSSOOptions3", bool, true);
        this.I6 = dVar187;
        i6("EnableSSOOptions3", dVar187);
        com.roblox.client.flags.a.d dVar188 = new com.roblox.client.flags.a.d("EnableGoogleSSO", bool, false);
        this.J6 = dVar188;
        i6("EnableGoogleSSO", dVar188);
        com.roblox.client.flags.a.d dVar189 = new com.roblox.client.flags.a.d("EnableAppleSSO3", bool, false);
        this.K6 = dVar189;
        i6("EnableAppleSSO3", dVar189);
        com.roblox.client.flags.a.d dVar190 = new com.roblox.client.flags.a.d("EnableEdgeToEdgeMigrationAndroid", bool, true);
        this.L6 = dVar190;
        i6("EnableEdgeToEdgeMigrationAndroid", dVar190);
        com.roblox.client.flags.a.d dVar191 = new com.roblox.client.flags.a.d("EnableIncomingCallBottomInsetAndroid", bool, true);
        this.M6 = dVar191;
        i6("EnableIncomingCallBottomInsetAndroid", dVar191);
        com.roblox.client.flags.a.d dVar192 = new com.roblox.client.flags.a.d("EnableGameActivityVersionBFlagCache", bool, true);
        this.N6 = dVar192;
        i6("EnableGameActivityVersionBFlagCache", dVar192);
        com.roblox.client.flags.a.d dVar193 = new com.roblox.client.flags.a.d("EnableAppEventsAfterLuaAppRestartAndroid", bool, true);
        this.O6 = dVar193;
        i6("EnableAppEventsAfterLuaAppRestartAndroid", dVar193);
        com.roblox.client.flags.a.f fVar27 = new com.roblox.client.flags.a.f("GmasdkBackgroundInstallDelayMs", numValueOf, false);
        this.P6 = fVar27;
        i6("GmasdkBackgroundInstallDelayMs", fVar27);
        com.roblox.client.flags.a.d dVar194 = new com.roblox.client.flags.a.d("GmasdkBackgroundInstallEnabledAndroid", bool, false);
        this.Q6 = dVar194;
        i6("GmasdkBackgroundInstallEnabledAndroid", dVar194);
        com.roblox.client.flags.a.d dVar195 = new com.roblox.client.flags.a.d("PioneerExitOnNativeExit", bool, false);
        this.R6 = dVar195;
        i6("PioneerExitOnNativeExit", dVar195);
    }

    @Override // rh.i
    public boolean A() {
        return this.J4.o().booleanValue();
    }

    @Override // rh.i
    public boolean A0() {
        return this.Y3.o().booleanValue();
    }

    @Override // rh.i
    public boolean A1() {
        return this.f31384h5.o().booleanValue();
    }

    @Override // rh.i
    public boolean A2() {
        return this.f31404k1.k().booleanValue();
    }

    @Override // rh.i
    public boolean A3() {
        return this.R6.o().booleanValue();
    }

    @Override // rh.i
    public boolean A4() {
        return this.G2.o().booleanValue();
    }

    @Override // rh.i
    public boolean A5() {
        return this.f31447p4.o().booleanValue();
    }

    @Override // rh.i
    public boolean B() {
        return this.K0.k().booleanValue();
    }

    @Override // rh.i
    public String B0() {
        return this.f31431n4.i();
    }

    @Override // rh.i
    public boolean B1() {
        return this.f31429n2.k().booleanValue();
    }

    @Override // rh.i
    public boolean B2() {
        return this.E6.o().booleanValue();
    }

    @Override // rh.i
    public boolean B3() {
        return this.Y5.o().booleanValue();
    }

    @Override // rh.i
    public String B4() {
        return this.f31416l5.i();
    }

    @Override // rh.i
    public int B5() {
        return this.f31393i6.i().intValue();
    }

    @Override // rh.i
    public boolean C() {
        return this.f31367f4.o().booleanValue();
    }

    @Override // rh.i
    public boolean C0() {
        return this.D4.o().booleanValue();
    }

    @Override // rh.i
    public boolean C1() {
        return this.J5.o().booleanValue();
    }

    @Override // rh.i
    public String C2() {
        return this.f31520z.i();
    }

    @Override // rh.i
    public boolean C3() {
        return this.f31397j2.k().booleanValue();
    }

    @Override // rh.i
    public boolean C4() {
        return this.f31462r3.o().booleanValue();
    }

    @Override // rh.i
    public boolean C5() {
        return this.J6.o().booleanValue();
    }

    @Override // rh.i
    public boolean D() {
        return this.M3.o().booleanValue();
    }

    @Override // rh.i
    public boolean D0() {
        return this.f31360e5.o().booleanValue();
    }

    @Override // rh.i
    public boolean D1() {
        return this.E4.o().booleanValue();
    }

    @Override // rh.i
    public boolean D2() {
        return this.f31428n1.k().booleanValue();
    }

    @Override // rh.i
    public boolean D3() {
        return this.f31489u6.o().booleanValue();
    }

    @Override // rh.i
    public boolean D4() {
        return this.U3.o().booleanValue();
    }

    @Override // rh.i
    public boolean D5() {
        return this.f31334b3.o().booleanValue();
    }

    @Override // rh.i
    public int E() {
        return this.f31442p.i().intValue();
    }

    @Override // rh.i
    public boolean E0() {
        return this.I5.o().booleanValue();
    }

    @Override // rh.i
    public boolean E1() {
        return this.f31401j6.o().booleanValue();
    }

    @Override // rh.i
    public boolean E2() {
        return this.O2.o().booleanValue();
    }

    @Override // rh.i
    public boolean E3() {
        return this.C4.o().booleanValue();
    }

    @Override // rh.i
    public int E4() {
        return this.Y2.i().intValue();
    }

    @Override // rh.i
    public boolean E5() {
        return this.f31324a0.k().booleanValue();
    }

    @Override // rh.i
    public boolean F() {
        return this.f31522z1.k().booleanValue();
    }

    @Override // rh.i
    public boolean F0() {
        return this.f31419m0.k().booleanValue();
    }

    @Override // rh.i
    public boolean F1() {
        return this.f31508x3.o().booleanValue();
    }

    @Override // rh.i
    public boolean F2() {
        return this.T4.o().booleanValue();
    }

    @Override // rh.i
    public boolean F3() {
        return this.Q5.o().booleanValue();
    }

    @Override // rh.i
    public long F4() {
        return this.X1.i().longValue();
    }

    @Override // rh.i
    public boolean F5() {
        return this.f31349d2.k().booleanValue();
    }

    @Override // rh.i
    public boolean G() {
        return this.L6.o().booleanValue();
    }

    @Override // rh.i
    public String G0() {
        return this.f31371g0.i();
    }

    @Override // rh.i
    public boolean G1() {
        return this.f31511x6.o().booleanValue();
    }

    @Override // rh.i
    public boolean G2() {
        return this.f31388i1.k().booleanValue();
    }

    @Override // rh.i
    public boolean G3() {
        return this.f31392i5.o().booleanValue();
    }

    @Override // rh.i
    public boolean G4() {
        return this.N5.o().booleanValue();
    }

    @Override // rh.i
    public boolean G5() {
        return this.I0.k().booleanValue();
    }

    @Override // rh.i
    public int H() {
        return this.V0.i().intValue();
    }

    @Override // rh.i
    public boolean H0() {
        return this.f31340c1.k().booleanValue();
    }

    @Override // rh.i
    public boolean H1() {
        return this.T5.o().booleanValue();
    }

    @Override // rh.i
    public int H2() {
        return this.f31474t.i().intValue();
    }

    @Override // rh.i
    public long H3() {
        return this.f31395j0.i().longValue();
    }

    @Override // rh.i
    public int H4() {
        return this.F4.i().intValue();
    }

    @Override // rh.i
    public boolean H5() {
        return this.I4.o().booleanValue();
    }

    @Override // rh.i
    public boolean I() {
        return this.H5.o().booleanValue();
    }

    @Override // rh.i
    public boolean I0() {
        return this.U2.o().booleanValue();
    }

    @Override // rh.i
    public boolean I1() {
        return this.D2.o().booleanValue();
    }

    @Override // rh.i
    public boolean I2() {
        return this.X4.o().booleanValue();
    }

    @Override // rh.i
    public long I3() {
        return this.Y1.i().longValue();
    }

    @Override // rh.i
    public boolean I4() {
        return this.f31461r2.k().booleanValue();
    }

    @Override // rh.i
    public int I5() {
        return this.f31403k0.i().intValue();
    }

    @Override // rh.i
    public boolean J() {
        return this.f31350d3.o().booleanValue();
    }

    @Override // rh.i
    public int J0() {
        return this.C.i().intValue();
    }

    @Override // rh.i
    public int J1() {
        return this.f31460r1.i().intValue();
    }

    @Override // rh.i
    public boolean J2() {
        return this.U4.o().booleanValue();
    }

    @Override // rh.i
    public int J3() {
        return this.P1.i().intValue();
    }

    @Override // rh.i
    public int J4() {
        return this.H3.i().intValue();
    }

    @Override // rh.i
    public String J5() {
        return this.f31438o3.i();
    }

    @Override // rh.i
    public int K() {
        return this.b.i().intValue();
    }

    @Override // rh.i
    public boolean K0() {
        return this.f31425m6.o().booleanValue();
    }

    @Override // rh.i
    public boolean K1() {
        return this.f31446p3.o().booleanValue();
    }

    @Override // rh.i
    public int K2() {
        return this.G3.i().intValue();
    }

    @Override // rh.i
    public boolean K3() {
        return this.f31357e2.k().booleanValue();
    }

    @Override // rh.i
    public boolean K4() {
        return this.F0.k().booleanValue();
    }

    @Override // rh.i
    public int K5() {
        return this.f31369f6.i().intValue();
    }

    @Override // rh.i
    public int L() {
        return this.Z1.i().intValue();
    }

    @Override // rh.i
    public boolean L0() {
        return this.P5.o().booleanValue();
    }

    @Override // rh.i
    public boolean L1() {
        return this.S3.o().booleanValue();
    }

    @Override // rh.i
    public boolean L2() {
        return this.f31498w0.k().booleanValue();
    }

    @Override // rh.i
    public boolean L3() {
        return this.f31408k5.o().booleanValue();
    }

    @Override // rh.i
    public boolean L4() {
        return this.f31380h1.k().booleanValue();
    }

    @Override // rh.i
    public long L5() {
        return this.U.i().longValue();
    }

    @Override // rh.i
    public int M() {
        return this.K1.i().intValue();
    }

    @Override // rh.i
    public boolean M0() {
        return this.f31473s6.o().booleanValue();
    }

    @Override // rh.i
    public boolean M1() {
        return this.f31399j4.o().booleanValue();
    }

    @Override // rh.i
    public boolean M2() {
        return this.N3.o().booleanValue();
    }

    @Override // rh.i
    public int M3() {
        return this.f31354e.i().intValue();
    }

    @Override // rh.i
    public boolean M4() {
        return this.f31327a3.o().booleanValue();
    }

    @Override // rh.i
    public boolean M5() {
        return this.V1.k().booleanValue();
    }

    @Override // rh.i
    public boolean N() {
        return this.Z3.o().booleanValue();
    }

    @Override // rh.i
    public boolean N0() {
        return this.F3.o().booleanValue();
    }

    @Override // rh.i
    public boolean N1() {
        return this.f31521z0.k().booleanValue();
    }

    @Override // rh.i
    public String N2() {
        return this.f31490v.i();
    }

    @Override // rh.i
    public boolean N3() {
        return this.f31451q0.k().booleanValue();
    }

    @Override // rh.i
    public int N4() {
        return this.E2.i().intValue();
    }

    @Override // rh.i
    public boolean N5() {
        return this.I2.o().booleanValue();
    }

    @Override // rh.i
    public int O() {
        return this.A.i().intValue();
    }

    @Override // rh.i
    public String O0() {
        return this.B0.i();
    }

    @Override // rh.i
    public boolean O1() {
        return this.B4.o().booleanValue();
    }

    @Override // rh.i
    public boolean O2() {
        return this.f31417l6.o().booleanValue();
    }

    @Override // rh.i
    public boolean O3() {
        return this.f31341c2.k().booleanValue();
    }

    @Override // rh.i
    public int O4() {
        return this.f31502w4.i().intValue();
    }

    @Override // rh.i
    public boolean O5() {
        return this.f31470s3.o().booleanValue();
    }

    @Override // rh.i
    public boolean P() {
        return this.O4.o().booleanValue();
    }

    @Override // rh.i
    public boolean P1() {
        return this.T3.o().booleanValue();
    }

    @Override // rh.i
    public boolean P2() {
        return this.f31484u1.k().booleanValue();
    }

    @Override // rh.i
    public boolean P3() {
        return this.M0.k().booleanValue();
    }

    @Override // rh.i
    public String P4() {
        return this.f31514y1.i();
    }

    @Override // rh.i
    public boolean P5() {
        return this.A4.o().booleanValue();
    }

    @Override // rh.i
    public boolean Q() {
        return this.V2.o().booleanValue();
    }

    @Override // rh.i
    public boolean Q0() {
        return this.f31379h0.k().booleanValue();
    }

    @Override // rh.i
    public boolean Q1() {
        return this.J2.o().booleanValue();
    }

    @Override // rh.i
    public boolean Q2() {
        return this.f31467s0.k().booleanValue();
    }

    @Override // rh.i
    public int Q3() {
        return this.f31346d.i().intValue();
    }

    @Override // rh.i
    public boolean Q4() {
        return this.f31464r5.o().booleanValue();
    }

    @Override // rh.i
    public boolean Q5() {
        return this.U5.o().booleanValue();
    }

    @Override // rh.i
    public int R() {
        return this.f31356e1.i().intValue();
    }

    @Override // rh.i
    public boolean R0() {
        return this.f31344c5.o().booleanValue();
    }

    @Override // rh.i
    public int R1() {
        return this.f31372g1.i().intValue();
    }

    @Override // rh.i
    public boolean R2() {
        return this.f31494v3.o().booleanValue();
    }

    @Override // rh.i
    public String R3() {
        return this.f31363f0.i();
    }

    @Override // rh.i
    public String R4() {
        return this.f31512y.i();
    }

    @Override // rh.i
    public boolean R5() {
        return this.N0.k().booleanValue();
    }

    @Override // rh.i
    public boolean S() {
        return this.f31480t5.o().booleanValue();
    }

    @Override // rh.i
    public boolean S0() {
        return this.f31433n6.o().booleanValue();
    }

    @Override // rh.i
    public boolean S1() {
        return this.K6.o().booleanValue();
    }

    @Override // rh.i
    public boolean S2() {
        return this.f31452q1.k().booleanValue();
    }

    @Override // rh.i
    public boolean S3() {
        return this.f31398j3.o().booleanValue();
    }

    @Override // rh.i
    public long S4() {
        return this.f31445p2.i().longValue();
    }

    @Override // rh.i
    public boolean S5() {
        return this.L0.k().booleanValue();
    }

    @Override // rh.i
    public boolean T() {
        return this.R3.o().booleanValue();
    }

    @Override // rh.i
    public int T0() {
        return this.N1.i().intValue();
    }

    @Override // rh.i
    public int T1() {
        return this.f31482u.i().intValue();
    }

    @Override // rh.i
    public boolean T2() {
        return this.f31409k6.o().booleanValue();
    }

    @Override // rh.i
    public boolean T3() {
        return this.F1.k().booleanValue();
    }

    @Override // rh.i
    public boolean T4() {
        return this.f31443p0.k().booleanValue();
    }

    @Override // rh.i
    public boolean T5() {
        return this.f31383h4.o().booleanValue();
    }

    @Override // rh.i
    public boolean U() {
        return this.B1.k().booleanValue();
    }

    @Override // rh.i
    public boolean U0() {
        return this.f31519y6.o().booleanValue();
    }

    @Override // rh.i
    public int U1() {
        return this.f31390i3.i().intValue();
    }

    @Override // rh.i
    public int U2() {
        return this.f31477t2.i().intValue();
    }

    @Override // rh.i
    public boolean U3() {
        return this.f31513y0.k().booleanValue();
    }

    @Override // rh.i
    public int U4() {
        return this.f31527z6.i().intValue();
    }

    @Override // rh.i
    public int U5() {
        return this.Z2.i().intValue();
    }

    @Override // rh.i
    public boolean V() {
        return this.f31503w6.o().booleanValue();
    }

    @Override // rh.i
    public boolean V0() {
        return this.M5.o().booleanValue();
    }

    @Override // rh.i
    public boolean V1() {
        return this.R1.k().booleanValue();
    }

    @Override // rh.i
    public boolean V2() {
        return this.C2.o().booleanValue();
    }

    @Override // rh.i
    public String V3() {
        return this.f31497w.i();
    }

    @Override // rh.i
    public boolean V4() {
        return this.D5.o().booleanValue();
    }

    @Override // rh.i
    public boolean V5() {
        return this.E5.o().booleanValue();
    }

    @Override // rh.i
    public boolean W() {
        return this.f31414l3.o().booleanValue();
    }

    @Override // rh.i
    public boolean W0() {
        return this.A2.o().booleanValue();
    }

    @Override // rh.i
    public boolean W1() {
        return this.f31495v4.o().booleanValue();
    }

    @Override // rh.i
    public boolean W2() {
        return this.A6.o().booleanValue();
    }

    @Override // rh.i
    public boolean W3() {
        return this.f31478t3.o().booleanValue();
    }

    @Override // rh.i
    public boolean W4() {
        return this.f31483u0.k().booleanValue();
    }

    @Override // rh.i
    public boolean W5() {
        return this.f31517y4.o().booleanValue();
    }

    @Override // rh.i
    public String X() {
        return this.f31463r4.i();
    }

    @Override // rh.i
    public boolean X0() {
        return this.f31454q3.o().booleanValue();
    }

    @Override // rh.i
    public boolean X1() {
        return this.R5.o().booleanValue();
    }

    @Override // rh.i
    public int X2() {
        return this.f31471s4.i().intValue();
    }

    @Override // rh.i
    public boolean X4() {
        return this.f31364f1.k().booleanValue();
    }

    @Override // rh.i
    public boolean X5() {
        return this.f31453q2.k().booleanValue();
    }

    @Override // rh.i
    public int Y() {
        return this.Y0.i().intValue();
    }

    @Override // rh.i
    public boolean Y0() {
        return this.f31430n3.o().booleanValue();
    }

    @Override // rh.i
    public boolean Y1() {
        return this.A5.o().booleanValue();
    }

    @Override // rh.i
    public boolean Y2() {
        return this.K4.o().booleanValue();
    }

    @Override // rh.i
    public boolean Y3() {
        return this.f31389i2.k().booleanValue();
    }

    @Override // rh.i
    public boolean Y4() {
        return this.f31525z4.o().booleanValue();
    }

    @Override // rh.i
    public boolean Y5() {
        return this.f31359e4.o().booleanValue();
    }

    @Override // rh.i
    public int Z() {
        return this.P6.i().intValue();
    }

    @Override // rh.i
    public boolean Z0() {
        return this.f31469s2.k().booleanValue();
    }

    @Override // rh.i
    public boolean Z1() {
        return this.G0.k().booleanValue();
    }

    @Override // rh.i
    public boolean Z2() {
        return this.W3.o().booleanValue();
    }

    @Override // rh.i
    public boolean Z3() {
        return this.X3.o().booleanValue();
    }

    @Override // rh.i
    public boolean Z4() {
        return this.f31352d5.o().booleanValue();
    }

    @Override // rh.i
    public int Z5() {
        return this.f31394j.i().intValue();
    }

    @Override // rh.i
    public int a() {
        return this.f31365f2.i().intValue();
    }

    @Override // rh.i
    public boolean a0() {
        return this.L5.o().booleanValue();
    }

    @Override // rh.i
    public boolean a1() {
        return this.f31382h3.o().booleanValue();
    }

    @Override // rh.i
    public boolean a2() {
        return this.f31435o0.k().booleanValue();
    }

    @Override // rh.i
    public boolean a3() {
        return this.N4.o().booleanValue();
    }

    @Override // rh.i
    public int a4() {
        return this.O1.i().intValue();
    }

    @Override // rh.i
    public boolean a5() {
        return this.G6.o().booleanValue();
    }

    @Override // rh.i
    public boolean a6() {
        return this.W2.o().booleanValue();
    }

    @Override // rh.i
    public int b() {
        return this.f31411l0.i().intValue();
    }

    @Override // rh.i
    public boolean b0() {
        return this.R4.o().booleanValue();
    }

    @Override // rh.i
    public boolean b1() {
        return this.f31368f5.o().booleanValue();
    }

    @Override // rh.i
    public String b2() {
        return this.f31362f.i();
    }

    @Override // rh.i
    public boolean b3() {
        return this.C1.k().booleanValue();
    }

    @Override // rh.i
    public boolean b4() {
        return this.X2.o().booleanValue();
    }

    @Override // rh.i
    public boolean b5() {
        return this.f31336b5.o().booleanValue();
    }

    @Override // rh.i
    public boolean b6() {
        return this.U0.k().booleanValue();
    }

    @Override // rh.i
    public boolean c() {
        return this.f31475t0.k().booleanValue();
    }

    @Override // rh.i
    public int c0() {
        return this.f31353d6.i().intValue();
    }

    @Override // rh.i
    public boolean c1() {
        return this.f31526z5.o().booleanValue();
    }

    @Override // rh.i
    public boolean c2() {
        return this.L1.k().booleanValue();
    }

    @Override // rh.i
    public boolean c3() {
        return this.T0.k().booleanValue();
    }

    @Override // rh.i
    public boolean c4() {
        return this.v5.o().booleanValue();
    }

    @Override // rh.i
    public boolean c5() {
        return this.f31493v2.o().booleanValue();
    }

    @Override // rh.i
    public int c6() {
        return this.B6.i().intValue();
    }

    @Override // rh.i
    public boolean d() {
        return this.f31405k2.k().booleanValue();
    }

    @Override // rh.i
    public String d0() {
        return this.K3.i();
    }

    @Override // rh.i
    public boolean d1() {
        return this.f31457q6.o().booleanValue();
    }

    @Override // rh.i
    public int d2() {
        return this.A3.i().intValue();
    }

    @Override // rh.i
    public boolean d3() {
        return this.f31333b2.k().booleanValue();
    }

    @Override // rh.i
    public boolean d4() {
        return this.f31485u2.o().booleanValue();
    }

    @Override // rh.i
    public int d5() {
        return this.C3.i().intValue();
    }

    @Override // rh.i
    public boolean d6() {
        return this.O0.k().booleanValue();
    }

    @Override // rh.i
    public boolean e() {
        return this.T2.o().booleanValue();
    }

    @Override // rh.i
    public boolean e0() {
        return this.X0.k().booleanValue();
    }

    @Override // rh.i
    public boolean e1() {
        return this.Z4.o().booleanValue();
    }

    @Override // rh.i
    public long e2() {
        return this.f31450q.i().longValue();
    }

    @Override // rh.i
    public boolean e3() {
        return this.B3.o().booleanValue();
    }

    @Override // rh.i
    public boolean e4() {
        return this.f31329a5.o().booleanValue();
    }

    @Override // rh.i
    public int e5() {
        return this.f31345c6.i().intValue();
    }

    @Override // rh.i
    public boolean e6() {
        return this.f31459r0.k().booleanValue();
    }

    @Override // rh.i
    public boolean f() {
        return this.f31501w3.o().booleanValue();
    }

    @Override // rh.i
    public boolean f0() {
        return this.Z5.o().booleanValue();
    }

    @Override // rh.i
    public boolean f1() {
        return this.F6.o().booleanValue();
    }

    @Override // rh.i
    public boolean f2() {
        return this.J1.k().booleanValue();
    }

    @Override // rh.i
    public boolean f3() {
        return this.f31381h2.k().booleanValue();
    }

    @Override // rh.i
    public boolean f4() {
        return this.w5.o().booleanValue();
    }

    @Override // rh.i
    public boolean f5() {
        return this.B2.o().booleanValue();
    }

    @Override // rh.i
    public boolean f6() {
        return this.f31456q5.o().booleanValue();
    }

    @Override // rh.i
    public boolean g() {
        return this.f31407k4.o().booleanValue();
    }

    @Override // rh.i
    public boolean g0() {
        return this.f31358e3.o().booleanValue();
    }

    @Override // rh.i
    public boolean g1() {
        return this.R2.o().booleanValue();
    }

    @Override // rh.i
    public boolean g2() {
        return this.P2.o().booleanValue();
    }

    @Override // rh.i
    public int g3() {
        return this.f31468s1.i().intValue();
    }

    @Override // rh.i
    public int g4() {
        return this.f31504x.i().intValue();
    }

    @Override // rh.i
    public boolean g5() {
        return this.Q0.k().booleanValue();
    }

    @Override // rh.i
    public boolean g6() {
        return this.W5.o().booleanValue();
    }

    @Override // rh.i
    public boolean h() {
        return this.f31386i.k().booleanValue();
    }

    @Override // rh.i
    public boolean h0() {
        return this.f31496v6.o().booleanValue();
    }

    @Override // rh.i
    public boolean h1() {
        return this.Z0.k().booleanValue();
    }

    @Override // rh.i
    public boolean h2() {
        return this.P3.o().booleanValue();
    }

    @Override // rh.i
    public boolean h3() {
        return this.f31406k3.o().booleanValue();
    }

    @Override // rh.i
    public boolean h4() {
        return this.C6.o().booleanValue();
    }

    @Override // rh.i
    public boolean h5() {
        return this.f31488u5.o().booleanValue();
    }

    @Override // rh.i
    public boolean h6() {
        return this.N6.o().booleanValue();
    }

    @Override // rh.i
    public boolean i() {
        return this.E.k().booleanValue();
    }

    @Override // rh.i
    public boolean i0() {
        return this.L2.o().booleanValue();
    }

    @Override // rh.i
    public boolean i1() {
        return this.f31366f3.o().booleanValue();
    }

    @Override // rh.i
    public int i2() {
        return this.f31479t4.i().intValue();
    }

    @Override // rh.i
    public boolean i3() {
        return this.Y4.o().booleanValue();
    }

    @Override // rh.i
    public boolean i4() {
        return this.V4.o().booleanValue();
    }

    @Override // rh.i
    public int i5() {
        return this.Q1.i().intValue();
    }

    @Override // rh.i
    public boolean j() {
        return this.X5.o().booleanValue();
    }

    @Override // rh.i
    public boolean j0() {
        return this.f31465r6.o().booleanValue();
    }

    @Override // rh.i
    public boolean j1() {
        return this.f31491v0.k().booleanValue();
    }

    @Override // rh.i
    public boolean j2() {
        return this.G1.k().booleanValue();
    }

    @Override // rh.i
    public int j3() {
        return this.f31423m4.i().intValue();
    }

    @Override // rh.i
    public boolean j4() {
        return this.F2.o().booleanValue();
    }

    @Override // rh.i
    public boolean j5() {
        return this.P4.o().booleanValue();
    }

    @Override // rh.i
    public boolean k() {
        return this.D1.k().booleanValue();
    }

    @Override // rh.i
    public boolean k0() {
        return this.f31437o2.k().booleanValue();
    }

    @Override // rh.i
    public boolean k1() {
        return this.Q3.o().booleanValue();
    }

    @Override // rh.i
    public boolean k2() {
        return this.f31444p1.k().booleanValue();
    }

    @Override // rh.i
    public boolean k3() {
        return this.f31335b4.o().booleanValue();
    }

    @Override // rh.i
    public boolean k4() {
        return this.f31325a1.k().booleanValue();
    }

    @Override // rh.i
    public boolean k5() {
        return this.f31507x2.o().booleanValue();
    }

    @Override // rh.i
    public boolean l() {
        return this.f31487u4.o().booleanValue();
    }

    @Override // rh.i
    public boolean l0() {
        return this.f31378h.k().booleanValue();
    }

    @Override // rh.i
    public int l1() {
        return this.f31476t1.i().intValue();
    }

    @Override // rh.i
    public boolean l2() {
        return this.f31499w1.k().booleanValue();
    }

    @Override // rh.i
    public boolean l3() {
        return this.V3.o().booleanValue();
    }

    @Override // rh.i
    public boolean l4() {
        return this.J0.k().booleanValue();
    }

    @Override // rh.i
    public boolean l5() {
        return this.F5.o().booleanValue();
    }

    @Override // rh.i
    public String m() {
        return this.f31424m5.i();
    }

    @Override // rh.i
    public int m0() {
        return this.J3.i().intValue();
    }

    @Override // rh.i
    public int m1() {
        return this.f31412l1.i().intValue();
    }

    @Override // rh.i
    public boolean m2() {
        return this.f31509x4.o().booleanValue();
    }

    @Override // rh.i
    public boolean m3() {
        return this.H1.k().booleanValue();
    }

    @Override // rh.i
    public boolean m4() {
        return this.H0.k().booleanValue();
    }

    @Override // rh.i
    public boolean m5() {
        return this.C5.o().booleanValue();
    }

    @Override // rh.i
    public long n() {
        return this.F.i().longValue();
    }

    @Override // rh.i
    public boolean n0() {
        return this.f31421m2.k().booleanValue();
    }

    @Override // rh.i
    public boolean n1() {
        return this.I6.o().booleanValue();
    }

    @Override // rh.i
    public boolean n2() {
        return this.f31515y2.o().booleanValue();
    }

    @Override // rh.i
    public boolean n3() {
        return this.L4.o().booleanValue();
    }

    @Override // rh.i
    public int n4() {
        return this.f31328a4.i().intValue();
    }

    @Override // rh.i
    public boolean n5() {
        return this.Q2.o().booleanValue();
    }

    @Override // rh.i
    public int o() {
        return this.f31410l.i().intValue();
    }

    @Override // rh.i
    public boolean o0() {
        return this.Q4.o().booleanValue();
    }

    @Override // rh.i
    public boolean o1() {
        return this.K2.o().booleanValue();
    }

    @Override // rh.i
    public boolean o2() {
        return this.O6.o().booleanValue();
    }

    @Override // rh.i
    public boolean o3() {
        return this.A1.k().booleanValue();
    }

    @Override // rh.i
    public int o4() {
        return this.f31418m.i().intValue();
    }

    @Override // rh.i
    public boolean o5() {
        return this.f31524z3.o().booleanValue();
    }

    @Override // rh.i
    public String p() {
        return this.f31439o4.i();
    }

    @Override // rh.i
    public boolean p0() {
        return this.f31387i0.k().booleanValue();
    }

    @Override // rh.i
    public int p1() {
        return this.f31361e6.i().intValue();
    }

    @Override // rh.i
    public boolean p2() {
        return this.G5.o().booleanValue();
    }

    @Override // rh.i
    public int p3() {
        return this.f31426n.i().intValue();
    }

    @Override // rh.i
    public boolean p4() {
        return this.f31518y5.o().booleanValue();
    }

    @Override // rh.i
    public boolean p5() {
        return this.D3.o().booleanValue();
    }

    @Override // rh.i
    public boolean q() {
        return this.U1.k().booleanValue();
    }

    @Override // rh.i
    public int q0() {
        return this.f31432n5.i().intValue();
    }

    @Override // rh.i
    public boolean q1() {
        return this.Q6.o().booleanValue();
    }

    @Override // rh.i
    public boolean q2() {
        return this.H4.o().booleanValue();
    }

    @Override // rh.i
    public boolean q3() {
        return this.T1.k().booleanValue();
    }

    @Override // rh.i
    public boolean q4() {
        return this.f31440o5.o().booleanValue();
    }

    @Override // rh.i
    public boolean q5() {
        return this.O3.o().booleanValue();
    }

    @Override // rh.i
    public boolean r() {
        return this.S4.o().booleanValue();
    }

    @Override // rh.i
    public int r0() {
        return this.f31434o.i().intValue();
    }

    @Override // rh.i
    public int r1() {
        return this.f31458r.i().intValue();
    }

    @Override // rh.i
    public boolean r2() {
        return this.O5.o().booleanValue();
    }

    @Override // rh.i
    public String r3() {
        return this.f31338c.i();
    }

    @Override // rh.i
    public boolean r4() {
        return this.S1.k().booleanValue();
    }

    @Override // rh.i
    public boolean r5() {
        return this.f31422m3.o().booleanValue();
    }

    @Override // rh.i
    public boolean s() {
        return this.f31492v1.k().booleanValue();
    }

    @Override // rh.i
    public boolean s0() {
        return this.f31332b1.k().booleanValue();
    }

    @Override // rh.i
    public boolean s1() {
        return this.R0.k().booleanValue();
    }

    @Override // rh.i
    public String s2() {
        return this.f31436o1.i();
    }

    @Override // rh.i
    public boolean s3() {
        return this.S5.o().booleanValue();
    }

    @Override // rh.i
    public boolean s4() {
        return this.f31516y3.o().booleanValue();
    }

    @Override // rh.i
    public boolean s5() {
        return this.A0.k().booleanValue();
    }

    @Override // rh.i
    public int t() {
        return this.f31402k.i().intValue();
    }

    @Override // rh.i
    public boolean t0() {
        return this.f31472s5.o().booleanValue();
    }

    @Override // rh.i
    public long t1() {
        return this.W0.i().longValue();
    }

    @Override // rh.i
    public boolean t2() {
        return this.f31455q4.o().booleanValue();
    }

    @Override // rh.i
    public boolean t3() {
        return this.L3.o().booleanValue();
    }

    @Override // rh.i
    public boolean t4() {
        return this.D6.o().booleanValue();
    }

    @Override // rh.i
    public boolean t5() {
        return this.f31441o6.o().booleanValue();
    }

    @Override // rh.i
    public int u() {
        return this.f31466s.i().intValue();
    }

    @Override // rh.i
    public boolean u0() {
        return this.M6.o().booleanValue();
    }

    @Override // rh.i
    public boolean u1() {
        return this.f31481t6.o().booleanValue();
    }

    @Override // rh.i
    public boolean u2() {
        return this.f31374g3.o().booleanValue();
    }

    @Override // rh.i
    public boolean u3() {
        return this.f31506x1.k().booleanValue();
    }

    @Override // rh.i
    public boolean u4() {
        return this.f31377g6.o().booleanValue();
    }

    @Override // rh.i
    public int u5() {
        return this.f31351d4.i().intValue();
    }

    @Override // rh.i
    public int v() {
        return this.f31396j1.i().intValue();
    }

    @Override // rh.i
    public boolean v0() {
        return this.H6.o().booleanValue();
    }

    @Override // rh.i
    public boolean v1() {
        return this.N2.o().booleanValue();
    }

    @Override // rh.i
    public boolean v2() {
        return this.f31326a2.k().booleanValue();
    }

    @Override // rh.i
    public boolean v3() {
        return this.f31415l4.o().booleanValue();
    }

    @Override // rh.i
    public boolean v4() {
        return this.f31420m1.k().booleanValue();
    }

    @Override // rh.i
    public boolean v5() {
        return this.f31348d1.k().booleanValue();
    }

    @Override // rh.i
    public String w() {
        return this.M1.i();
    }

    @Override // rh.i
    public boolean w0() {
        return this.f31400j5.o().booleanValue();
    }

    @Override // rh.i
    public boolean w1() {
        return this.f31342c3.o().booleanValue();
    }

    @Override // rh.i
    public boolean w2() {
        return this.f31375g4.o().booleanValue();
    }

    @Override // rh.i
    public boolean w3() {
        return this.D0.k().booleanValue();
    }

    @Override // rh.i
    public boolean w4() {
        return this.H2.o().booleanValue();
    }

    @Override // rh.i
    public boolean w5() {
        return this.f31500w2.o().booleanValue();
    }

    @Override // rh.i
    public boolean x() {
        return this.S2.o().booleanValue();
    }

    @Override // rh.i
    public boolean x0() {
        return this.E0.k().booleanValue();
    }

    @Override // rh.i
    public boolean x1() {
        return this.P0.k().booleanValue();
    }

    @Override // rh.i
    public boolean x2() {
        return this.E1.k().booleanValue();
    }

    @Override // rh.i
    public boolean x3() {
        return this.f31413l2.k().booleanValue();
    }

    @Override // rh.i
    public long x4() {
        return this.W1.i().longValue();
    }

    @Override // rh.i
    public boolean x5() {
        return this.f31449p6.o().booleanValue();
    }

    @Override // rh.i
    public boolean y() {
        return this.f31486u3.o().booleanValue();
    }

    @Override // rh.i
    public String y0() {
        return this.f31523z2.i();
    }

    @Override // rh.i
    public int y1() {
        return this.G4.i().intValue();
    }

    @Override // rh.i
    public boolean y2() {
        return this.S0.k().booleanValue();
    }

    @Override // rh.i
    public boolean y3() {
        return this.I1.k().booleanValue();
    }

    @Override // rh.i
    public int y4() {
        return this.B.i().intValue();
    }

    @Override // rh.i
    public boolean y5() {
        return this.f31376g5.o().booleanValue();
    }

    @Override // rh.i
    public boolean z() {
        return this.M4.o().booleanValue();
    }

    @Override // rh.i
    public boolean z0() {
        return this.f31391i4.o().booleanValue();
    }

    @Override // rh.i
    public boolean z1() {
        return this.B5.o().booleanValue();
    }

    @Override // rh.i
    public String z2() {
        return this.f31427n0.i();
    }

    @Override // rh.i
    public boolean z3() {
        return this.C0.k().booleanValue();
    }

    @Override // rh.i
    public int z4() {
        return this.I3.i().intValue();
    }

    @Override // rh.i
    public boolean z5() {
        return this.K5.o().booleanValue();
    }
}
