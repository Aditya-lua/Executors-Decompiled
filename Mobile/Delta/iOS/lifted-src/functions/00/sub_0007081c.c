/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7081c..0x70980 (356 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_7081c(unsigned long a0, unsigned int *a1, unsigned int *a2)
{
    unsigned long long v3;  // x0
    unsigned int v4;  // w12
    unsigned int v13;  // w13
    unsigned int v14;  // w10
    unsigned int v15;  // w12
    unsigned int v16;  // w11
    unsigned int v17;  // w9
    unsigned int v5;  // w9
    unsigned int v6;  // w10
    unsigned int v7;  // w11
    unsigned int v8;  // w13
    unsigned int v9;  // w10
    unsigned int v10;  // w12
    unsigned int v11;  // w11
    unsigned int v12;  // w9
    char v0;  // [bp-0x21]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_6d05c(&v0);
    v4 = a1[3];
    v5 = a1[4];
    v6 = *a1;
    v7 = a1[1];
    v8 = a2[7] + (v5 & v6 | v4 & ~v6) + (v7 * 32 | v7 >> 27) + a1[2] + 1518500249;
    v9 = __ROL__(v6, 30);
    a1[2] = v8;
    *a1 = v9;
    v10 = v4 + a2[8] + (v9 & v7 | v5 & ~v7) + 1518500249 + (v8 * 32 | v8 >> 27);
    a1[3] = v10;
    v11 = __ROL__(v7, 30);
    a1[1] = v11;
    v12 = v5 + a2[9] + (v11 & v8 | v9 & ~v8) + 1518500249 + (v10 * 32 | v10 >> 27);
    a1[4] = v12;
    v13 = __ROL__(v8, 30);
    a1[2] = v13;
    v14 = v9 + a2[10] + (v13 & v10 | v11 & ~v10) + 1518500249 + (v12 * 32 | v12 >> 27);
    v15 = __ROL__(v10, 30);
    *a1 = v14;
    a1[3] = v15;
    v16 = v11 + a2[11] + (v15 & v12 | v13 & ~v12) + 1518500249 + (v14 * 32 | v14 >> 27);
    a1[1] = v16;
    v17 = __ROL__(v12, 30);
    a1[4] = v17;
    a1[2] = v13 + a2[12] + (v17 & v14 | v15 & ~v14) + 1518500249 + (v16 * 32 | v16 >> 27);
    *a1 = v14 * 0x40000000 | v14 >> 2;
    return v3;
}
