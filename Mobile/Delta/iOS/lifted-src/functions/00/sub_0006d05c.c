/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6d05c..0x6d1c4 (360 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_6d05c(unsigned long a0, unsigned int *a1, unsigned int *a2)
{
    unsigned int v0;  // w10
    unsigned int v1;  // w9
    unsigned int v10;  // w9
    unsigned int v11;  // w11
    unsigned int v12;  // w13
    unsigned int v13;  // w10
    unsigned int v14;  // w12
    unsigned int v15;  // w9
    unsigned int v2;  // w11
    unsigned int v3;  // w14
    unsigned int v4;  // w12
    unsigned int v5;  // w9
    unsigned int v6;  // w11
    unsigned int v7;  // w13
    unsigned int v8;  // w10
    unsigned int v9;  // w12

    v0 = a1[2];
    v1 = a1[3];
    v2 = a1[1];
    v3 = a1[4];
    v4 = *a2 + (v0 & v1 | v2 & ~v1) + (v3 * 32 | v3 >> 27) + *a1 + 1518500249;
    *a1 = v4;
    v5 = __ROL__(v1, 30);
    a1[3] = v5;
    v6 = v2 + a2[1] + (v5 & v3 | v0 & ~v3) + 1518500249 + (v4 * 32 | v4 >> 27);
    v7 = __ROL__(v3, 30);
    a1[1] = v6;
    a1[4] = v7;
    v8 = v0 + a2[2] + (v7 & v4 | v5 & ~v4) + 1518500249 + (v6 * 32 | v6 >> 27);
    a1[2] = v8;
    v9 = __ROL__(v4, 30);
    *a1 = v9;
    v10 = v5 + a2[3] + (v9 & v6 | v7 & ~v6) + 1518500249 + (v8 * 32 | v8 >> 27);
    a1[3] = v10;
    v11 = __ROL__(v6, 30);
    a1[1] = v11;
    v12 = v7 + a2[4] + (v11 & v8 | v9 & ~v8) + 1518500249 + (v10 * 32 | v10 >> 27);
    v13 = __ROL__(v8, 30);
    a1[4] = v12;
    a1[2] = v13;
    v14 = v9 + a2[5] + (v13 & v10 | v11 & ~v10) + 1518500249 + (v12 * 32 | v12 >> 27);
    *a1 = v14;
    v15 = __ROL__(v10, 30);
    a1[3] = v15;
    a1[1] = v11 + a2[6] + (v15 & v12 | v13 & ~v12) + 1518500249 + (v14 * 32 | v14 >> 27);
    a1[4] = v12 * 0x40000000 | v12 >> 2;
    return a0;
}
