/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x58ec4..0x5913c (632 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_58ec4(unsigned long a0, char *a1)
{
    unsigned int v0;  // w8
    unsigned int v1;  // w9
    unsigned int v10;  // w10
    unsigned int v11;  // w11
    unsigned int v12;  // w13
    unsigned int v13;  // w14
    unsigned int v14;  // w12
    unsigned int v15;  // w12
    unsigned int v16;  // w12
    unsigned int v17;  // w15
    unsigned int v18;  // w12
    unsigned int v19;  // w10
    unsigned int v2;  // w10
    unsigned int v20;  // w10
    unsigned int v21;  // w10
    unsigned int v22;  // w10
    unsigned int v23;  // w10
    unsigned int v24;  // w11
    unsigned int v25;  // w9
    unsigned int v26;  // w9
    unsigned int v27;  // w9
    unsigned int v28;  // w10
    unsigned int v29;  // w10
    unsigned int v3;  // w12
    unsigned int v30;  // w10
    unsigned int v4;  // w14
    unsigned int v5;  // w10
    unsigned int v6;  // w11
    unsigned int v7;  // w13
    unsigned int v8;  // w14
    unsigned int v9;  // w10

    v0 = *a1;
    v1 = ~v0;
    v2 = (v0 ^ 1) + v1 * 2 + (__ROL__(v0, 1) & 2 & 3);
    v3 = 0xfffffffe - v0;
    v4 = v0 + 1;
    v5 = ((v2 * 2 | v3) + (v2 + v0) * 2 - (v2 * 2 & v4) | 1) + (v3 & 1) + 2;
    v6 = v5 * 2;
    v7 = v0 + v6;
    v8 = (v7 + 1 ^ -(v6 | v4)) + (v7 + 1 & -(v6 | v4)) * 2;
    v9 = v7 + (v6 + (0xffffffff ^ v5 * 4) | v3);
    v10 = (v8 & (unsigned int)(0xfffffffd - v9)) + v9 + 2 + (v8 & v9 + 2);
    v11 = v10 * 2;
    v12 = v10 + 1;
    v13 = ~v10;
    v14 = v10 + (4 & ~v11) + (v12 + (v13 | 2)) * 2 - 2;
    v15 = v14 + ~v14 * 2 + v14 * 2;
    v16 = v15 + 2;
    v17 = v16 + (v16 & 1) + (v16 + ~(v15 + 1) * 2 ^ 1);
    v18 = (v17 ^ (v10 & 1) + v16) + (v17 & (v10 & 1) + v16) * 2;
    v19 = ((v10 ^ 1) + v13 * 2 + 1 + (v11 & 2) ^ 1) + (__ROL__((v10 ^ 1) + v13 * 2 + 1, 1) & 2 & 3) + 0x7ffffffe;
    v20 = (((v12 + (v13 | 1)) * 2 | v10) ^ 1) + ((v12 + (v13 | 1)) * 2 & v10) + v19 * 4 + 1;
    v21 = (unsigned int)((1 | __ROL__(v19, 1) & 0xfffffffe) - (v10 | 0xfffffffe) - v20) - 2;
    v22 = (v20 - v19 * 2 ^ v21) + (v20 - v19 * 2 & v21) * 2 - ((v20 - v19 * 2 ^ v21) & 1) + (v20 - v19 * 2 ^ v21 | 0xfffffffe) + 1;
    v23 = ~v18 + v18 * 2 - v22 + (v22 & -v18) * 2 + (~v18 + v18 * 2 & v22) * 2;
    v24 = v0 - (v0 - 1 | 1) + (v0 | 0xfffffffe);
    v25 = (((v24 & v0) + v1 + (v24 & ~v0)) * 2 & 4) + ((v24 & v0) + v1 + (v24 & ~v0) ^ 2) + (-(((((v24 & v0) + v1 + (v24 & ~v0)) * 2 & 4) + ((v24 & v0) + v1 + (v24 & ~v0) ^ 2)) * 2) | ~((((v24 & v0) + v1 + (v24 & ~v0)) * 2 & 4) + ((v24 & v0) + v1 + (v24 & ~v0) ^ 2))) + (-(((((v24 & v0) + v1 + (v24 & ~v0)) * 2 & 4) + ((v24 & v0) + v1 + (v24 & ~v0) ^ 2)) * 2) | (((v24 & v0) + v1 + (v24 & ~v0)) * 2 & 4) + ((v24 & v0) + v1 + (v24 & ~v0) ^ 2)) + 1;
    v26 = (unsigned int)((v25 ^ 0xfffffffe) + v25 * 4 - (v25 * 2 + (v25 * 2 & 2))) + 3;
    v27 = v23 - 1 ^ v26;
    v28 = v27 + (v23 + (-v23 | v26)) * 2;
    v29 = v28 + ~v28 * 2 + v28 * 2;
    v30 = v29 + 2;
    if ((v30 + (v30 + ~(v29 + 1) * 2 | 1) ^ (v27 & 1) + v30) + (v30 + (v30 + ~(v29 + 1) * 2 | 1) & (v27 & 1) + v30) * 2 != 1)
        return (int)(v0) >> 2;
    return 0;
}
