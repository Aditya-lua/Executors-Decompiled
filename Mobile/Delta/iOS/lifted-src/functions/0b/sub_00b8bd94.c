/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb8bd94..0xb8bec4 (304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b8bd94(unsigned long long a0, unsigned long long a1, unsigned long long a2)
{
    unsigned long v0;  // x9
    unsigned long long v1;  // x11
    unsigned long v10;  // x9
    unsigned long long v11;  // x11
    unsigned long long v12;  // x10
    unsigned long v13;  // x8
    unsigned long v14;  // x9
    unsigned long long v15;  // x10
    unsigned long long v16;  // x11
    unsigned long v17;  // x8
    unsigned long v18;  // x9
    unsigned long long v19;  // x11
    unsigned long v2;  // x12
    unsigned long long v20;  // x10
    unsigned long v21;  // x8
    unsigned long v22;  // x9
    unsigned long long v23;  // x10
    unsigned long long v24;  // x11
    unsigned long v25;  // x8
    unsigned long v26;  // x9
    unsigned long long v27;  // x11
    unsigned long long v28;  // x10
    unsigned long v29;  // x8
    unsigned long long v3;  // x10
    unsigned long v30;  // x9
    unsigned long long v31;  // x10
    unsigned long long v32;  // x11
    unsigned long long v33;  // x10
    unsigned long v34;  // x8
    unsigned long v4;  // x12
    unsigned long long v5;  // x8
    unsigned long long v6;  // x13
    unsigned long v7;  // x8
    unsigned long long v8;  // x9
    unsigned long v9;  // x8

    v0 = a1 ^ 7237128888997146477;
    v1 = a2 + 8;
    v2 = a1 ^ v1 ^ 8387220255154660723;
    v3 = v2 + (a0 ^ 7816392313619706465);
    v4 = v3 ^ __ROL__(v2, 16);
    v5 = (a0 ^ 8317987319222330741) + v0;
    v6 = __ROL__(v5, 32) + v4;
    v7 = v5 ^ __ROL__(v0, 13);
    v8 = v7 + v3;
    v9 = v8 ^ __ROL__(v7, 0x11);
    v10 = v6 ^ __ROL__(v4, 21) ^ 0x800000000000000;
    v11 = v9 + (v6 ^ v1);
    v12 = v10 + __ROL__(v8, 32);
    v13 = v11 ^ __ROL__(v9, 13);
    v14 = v12 ^ __ROL__(v10, 16);
    v15 = v12 + v13;
    v16 = v14 + __ROL__(v11, 32);
    v17 = v15 ^ __ROL__(v13, 0x11);
    v18 = v16 ^ __ROL__(v14, 21);
    v19 = (v16 ^ 0x800000000000000) + v17;
    v20 = v18 + (__ROL__(v15, 32) ^ 0xff);
    v21 = v19 ^ __ROL__(v17, 13);
    v22 = v20 ^ __ROL__(v18, 16);
    v23 = v21 + v20;
    v24 = v22 + __ROL__(v19, 32);
    v25 = v23 ^ __ROL__(v21, 0x11);
    v26 = v24 ^ __ROL__(v22, 21);
    v27 = v25 + v24;
    v28 = v26 + __ROL__(v23, 32);
    v29 = v27 ^ __ROL__(v25, 13);
    v30 = v28 ^ __ROL__(v26, 16);
    v31 = v29 + v28;
    v32 = v30 + __ROL__(v27, 32);
    v33 = (v32 ^ __ROL__(v30, 21)) + __ROL__(v31, 32);
    v34 = (v31 ^ __ROL__(v29, 0x11)) + v32 ^ __ROL__(v31 ^ __ROL__(v29, 0x11), 13);
    return __ROL__(v33 ^ __ROL__(v32 ^ __ROL__(v30, 21), 16), 21) ^ __ROL__(v34, 0x11) ^ __ROL__(v34 + v33, 32) ^ v34 + v33;
}
