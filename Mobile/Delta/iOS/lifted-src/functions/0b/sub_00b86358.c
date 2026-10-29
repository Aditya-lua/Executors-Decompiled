/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb86358..0xb86478 (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b86358_0 {
    unsigned long long field_0;
    unsigned long long field_8;
} st_b86358_0;

typedef struct st_b86358_1 {
    struct st_b86358_0 *field_0;
} st_b86358_1;


long long sub_b86358(st_b86358_1 **a0, unsigned long long *a1, unsigned long a2)
{
    st_b86358_0 **v0;  // x8
    unsigned long v1;  // x12
    unsigned long v10;  // x12
    unsigned long v11;  // x8
    unsigned long long v12;  // x9
    unsigned long long v13;  // x10
    unsigned long v14;  // x11
    unsigned long v15;  // x8
    unsigned long long v16;  // x10
    unsigned long long v17;  // x9
    unsigned long v18;  // x11
    unsigned long v19;  // x8
    unsigned long long v2;  // x9
    unsigned long long v20;  // x9
    unsigned long long v21;  // x10
    unsigned long v22;  // x11
    unsigned long v23;  // x8
    unsigned long long v24;  // x10
    unsigned long long v25;  // x9
    unsigned long long v26;  // x10
    unsigned long v27;  // x9
    unsigned long v3;  // x8
    unsigned long long v4;  // x11
    unsigned long long v5;  // x10
    unsigned long v6;  // x12
    unsigned long v7;  // x8
    unsigned long long v8;  // x10
    unsigned long long v9;  // x11

    v0 = *a0;
    v1 = *(long long *)(*(long long *)*a0 + 8) ^ 7237128888997146477;
    v2 = *(int *)(*a1 + -(56 * a2) - 56) | 0x400000000000000;
    v3 = *v0->field_8 ^ v2 ^ 8387220255154660723;
    v4 = v1 + (*v0->field_0 ^ 8317987319222330741);
    v5 = v3 + (*v0->field_0 ^ 7816392313619706465);
    v6 = v4 ^ __ROL__(v1, 13);
    v7 = v5 ^ __ROL__(v3, 16);
    v8 = v5 + v6;
    v9 = v7 + __ROL__(v4, 32);
    v10 = v8 ^ __ROL__(v6, 0x11);
    v11 = v9 ^ __ROL__(v7, 21);
    v12 = (v9 ^ v2) + v10;
    v13 = v11 + (__ROL__(v8, 32) ^ 0xff);
    v14 = v12 ^ __ROL__(v10, 13);
    v15 = v13 ^ __ROL__(v11, 16);
    v16 = v14 + v13;
    v17 = v15 + __ROL__(v12, 32);
    v18 = v16 ^ __ROL__(v14, 0x11);
    v19 = v17 ^ __ROL__(v15, 21);
    v20 = v18 + v17;
    v21 = v19 + __ROL__(v16, 32);
    v22 = v20 ^ __ROL__(v18, 13);
    v23 = v21 ^ __ROL__(v19, 16);
    v24 = v22 + v21;
    v25 = v23 + __ROL__(v20, 32);
    v26 = (v25 ^ __ROL__(v23, 21)) + __ROL__(v24, 32);
    v27 = (v24 ^ __ROL__(v22, 0x11)) + v25 ^ __ROL__(v24 ^ __ROL__(v22, 0x11), 13);
    return __ROL__(v26 ^ __ROL__(v25 ^ __ROL__(v23, 21), 16), 21) ^ __ROL__(v27, 0x11) ^ __ROL__(v27 + v26, 32) ^ v27 + v26;
}
