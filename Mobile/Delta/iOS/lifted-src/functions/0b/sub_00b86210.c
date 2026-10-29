/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb86210..0xb86328 (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b86210_0 {
    unsigned long long field_0;
    unsigned long long field_8;
} st_b86210_0;

typedef struct st_b86210_1 {
    struct st_b86210_0 *field_0;
} st_b86210_1;


long long sub_b86210(st_b86210_1 **a0, unsigned long long *a1, unsigned long a2)
{
    unsigned long v0;  // x12
    unsigned long long v1;  // x9
    unsigned long v10;  // x8
    unsigned long long v11;  // x9
    unsigned long long v12;  // x10
    unsigned long v13;  // x11
    unsigned long v14;  // x8
    unsigned long long v15;  // x10
    unsigned long long v16;  // x9
    unsigned long v17;  // x11
    unsigned long v18;  // x8
    unsigned long long v19;  // x9
    unsigned long v2;  // x8
    unsigned long long v20;  // x10
    unsigned long v21;  // x11
    unsigned long v22;  // x8
    unsigned long long v23;  // x10
    unsigned long long v24;  // x9
    unsigned long long v25;  // x10
    unsigned long v26;  // x9
    unsigned long long v3;  // x11
    unsigned long long v4;  // x10
    unsigned long v5;  // x12
    unsigned long v6;  // x8
    unsigned long long v7;  // x10
    unsigned long long v8;  // x11
    unsigned long v9;  // x12

    v0 = *(long long *)(*(long long *)*a0 + 8) ^ 7237128888997146477;
    v1 = *(int *)(*a1 - a2 * 8 - 8) | 0x400000000000000;
    v2 = *(long long *)(*(long long *)*a0 + 8) ^ v1 ^ 8387220255154660723;
    v3 = v0 + (*(long long *)*(long long *)*a0 ^ 8317987319222330741);
    v4 = v2 + (*(long long *)*(long long *)*a0 ^ 7816392313619706465);
    v5 = v3 ^ __ROL__(v0, 13);
    v6 = v4 ^ __ROL__(v2, 16);
    v7 = v4 + v5;
    v8 = v6 + __ROL__(v3, 32);
    v9 = v7 ^ __ROL__(v5, 0x11);
    v10 = v8 ^ __ROL__(v6, 21);
    v11 = (v8 ^ v1) + v9;
    v12 = v10 + (__ROL__(v7, 32) ^ 0xff);
    v13 = v11 ^ __ROL__(v9, 13);
    v14 = v12 ^ __ROL__(v10, 16);
    v15 = v13 + v12;
    v16 = v14 + __ROL__(v11, 32);
    v17 = v15 ^ __ROL__(v13, 0x11);
    v18 = v16 ^ __ROL__(v14, 21);
    v19 = v17 + v16;
    v20 = v18 + __ROL__(v15, 32);
    v21 = v19 ^ __ROL__(v17, 13);
    v22 = v20 ^ __ROL__(v18, 16);
    v23 = v21 + v20;
    v24 = v22 + __ROL__(v19, 32);
    v25 = (v24 ^ __ROL__(v22, 21)) + __ROL__(v23, 32);
    v26 = (v23 ^ __ROL__(v21, 0x11)) + v24 ^ __ROL__(v23 ^ __ROL__(v21, 0x11), 13);
    return __ROL__(v25 ^ __ROL__(v24 ^ __ROL__(v22, 21), 16), 21) ^ __ROL__(v26, 0x11) ^ __ROL__(v26 + v25, 32) ^ v26 + v25;
}
