/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbd9d64..0xbd9e78 (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_bd9d64(unsigned long long a0, unsigned long long a1, unsigned int a2)
{
    unsigned long long v10;  // x12
    unsigned long v11;  // x11
    unsigned long long v20;  // x8
    unsigned long long v21;  // x9
    unsigned long v22;  // x10
    unsigned long v23;  // x11
    unsigned long long v24;  // x9
    unsigned long long v25;  // x8
    unsigned long v26;  // x10
    unsigned long v27;  // x11
    unsigned long long v28;  // x8
    unsigned long long v29;  // x9
    unsigned long long v12;  // x8
    unsigned long v30;  // x10
    unsigned long v31;  // x11
    unsigned long long v32;  // x9
    unsigned long long v33;  // x8
    unsigned long long v34;  // x9
    unsigned long v35;  // x8
    unsigned long long v13;  // x9
    unsigned long v14;  // x10
    unsigned long v15;  // x11
    unsigned long long v16;  // x9
    unsigned long long v17;  // x8
    unsigned long v18;  // x10
    unsigned long v19;  // x11
    uint128_t v0;  // [bp-0x60]
    uint128_t v1;  // [bp-0x50]
    unsigned long long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned int v7;  // [bp-0x14]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v0 = 0x6c7967656e657261736f6d6570736575 ^ CONCAT(a0, a0);
    v1 = 0x7465646279746573646f72616e646f6d ^ CONCAT(a1, a1);
    v2 = a0;
    v3 = a1;
    v5 = 0;
    v6 = 0;
    v4 = 0;
    v7 = a2;
    sub_bd9e78(&v0, &v7, 4);
    v10 = v5 | v4 * 0x100000000000000;
    v11 = v10 ^ *(unsigned long long *)((void*)&v1 + 8);
    v12 = *(unsigned long long *)&v1 + *(unsigned long long *)&v0;
    v13 = v11 + *(unsigned long long *)((void*)&v0 + 8);
    v14 = v12 ^ __ROL__(*(unsigned long long *)&v1, 13);
    v15 = v13 ^ __ROL__(v11, 16);
    v16 = v13 + v14;
    v17 = v15 + __ROL__(v12, 32);
    v18 = v16 ^ __ROL__(v14, 0x11);
    v19 = v17 ^ __ROL__(v15, 21);
    v20 = (v17 ^ v10) + v18;
    v21 = v19 + (__ROL__(v16, 32) ^ 0xff);
    v22 = v20 ^ __ROL__(v18, 13);
    v23 = v21 ^ __ROL__(v19, 16);
    v24 = v22 + v21;
    v25 = v23 + __ROL__(v20, 32);
    v26 = v24 ^ __ROL__(v22, 0x11);
    v27 = v25 ^ __ROL__(v23, 21);
    v28 = v26 + v25;
    v29 = v27 + __ROL__(v24, 32);
    v30 = v28 ^ __ROL__(v26, 13);
    v31 = v29 ^ __ROL__(v27, 16);
    v32 = v30 + v29;
    v33 = v31 + __ROL__(v28, 32);
    v34 = (v33 ^ __ROL__(v31, 21)) + __ROL__(v32, 32);
    v35 = (v32 ^ __ROL__(v30, 0x11)) + v33 ^ __ROL__(v32 ^ __ROL__(v30, 0x11), 13);
    return __ROL__(v34 ^ __ROL__(v33 ^ __ROL__(v31, 21), 16), 21) ^ __ROL__(v35, 0x11) ^ __ROL__(v35 + v34, 32) ^ v35 + v34;
}
