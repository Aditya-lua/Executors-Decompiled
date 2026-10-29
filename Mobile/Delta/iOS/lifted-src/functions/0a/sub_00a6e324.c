/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6e324..0xa6e5dc (696 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_6b01c0;
extern char g_6b01c3;

unsigned long long sub_a6e324(unsigned int *a0, int a1, uint128_t a2)
{
    unsigned long long v0;  // x9
    unsigned long long v1;  // x9
    unsigned long long v10;  // 4108
    unsigned long long v11;  // 4108
    unsigned int v12;  // w11
    unsigned int v13;  // w12
    long long v14;  // w10
    unsigned long long v15;  // w14
    unsigned long long v16;  // w16
    long long v17;  // x11
    unsigned long long v18;  // w10
    int v19;  // w10
    unsigned long long v2;  // w11
    unsigned long long v20;  // 4319
    unsigned long long v21;  // x9
    unsigned long long v22;  // x12
    unsigned long long v23;  // x9
    long long v24;  // x10
    unsigned long long v25;  // x13
    unsigned long long v26;  // x10
    unsigned long long v27;  // x9
    unsigned long long v28;  // x11
    unsigned int v29;  // w10
    unsigned long v3;  // cc_dep1
    unsigned int v30;  // w12
    long long v31;  // x11
    unsigned long long v32;  // x11
    unsigned long long v33;  // x11
    int v34;  // w10
    unsigned long long v35;  // w10
    int v36;  // w9
    unsigned long long v4;  // x12
    unsigned long long v5;  // 4109
    unsigned long long v6;  // 4109
    unsigned long long v7;  // w13
    unsigned long v8;  // cc_dep1
    unsigned long long v9;  // x9

    v0 = (unsigned long long)((int128_t)(a2 * 1749024623285053783) >> 77) + (unsigned long long)(a2 * 1749024623285053783 >> 127);
    v1 = v0 + a1;
    v2 = (unsigned int)a2 + 0xfffeae80 * (unsigned int)v0 + 3600 * a0[2] + 60 * a0[1] + *a0;
    v3 = v2 & 0x80000000;
    if (!(v2 & 0x80000000))
    {
        v4 = v1;
        v5 = arm64g_calculate_condition(9, v3, 0, 0);
        if (!(v5 & 1))
            goto LABEL_a6e386;
LABEL_a6e385:
        v7 = v2;
    }
    else
    {
        v4 = v1 - 1;
        v6 = arm64g_calculate_condition(9, v3, 0, 0);
        if (v6 & 1)
            goto LABEL_a6e385;
LABEL_a6e386:
        v7 = 86399 + v2 + 1;
    }
    v8 = v2;
    if (v2 <= 86399)
    {
        v9 = v4;
        v10 = arm64g_calculate_condition(211, v8, 86399, 0);
        if (!(v10 & 1))
            goto LABEL_a6e396;
LABEL_a6e395:
    }
    else
    {
        v9 = v1 + 1;
        v11 = arm64g_calculate_condition(211, v8, 86399, 0);
        if (v11 & 1)
            goto LABEL_a6e395;
LABEL_a6e396:
        v7 = v2 + 0xfffeae80;
    }
    v12 = a0[4];
    v13 = ((int)((v12 - 13) * 715827883) >> 33) + ((v12 - 13) * 715827883 >> 63);
    v14 = a0[5] + v13;
    v15 = 1461 * (v14 + 1900);
    v16 = &(&g_6b01c0)[v15];
    if (v16 < 0)
        v16 = &(&g_6b01c3)[v15];
    v17 = (0xfffffe91 + 367 * (v12 + 0xfffffff4 * v13)) * 715827883;
    v18 = ((int)((v14 + 6800) * 1374389535 >> 37) + (int)((unsigned long long)((v14 + 6800) * 1374389535) >> 63)) * 3;
    v19 = a0[3] + ((long long)(v16) >> 2) + (int)(v17 >> 33) + (int)((unsigned long long)(v17) >> 63) - ((long long)((v18 < 0 ? v18 + 3 : v18)) >> 2) + 0xffff82b5;
    v20 = arm64g_calculate_condition(66, v9, v19, 0);
    if (v20 & 1)
        return 0;
    v21 = v9 + v19 + 68569;
    v22 = v21 * 4 / 146097;
    v23 = v21 - (3 + 146097 * v22 >> 2);
    v24 = (4000 + 4000 * v23) * 1654928120671552141 >> 64;
    v25 = (v24 >> 0x11) + ((unsigned long long)(v24) >> 63);
    v26 = 1461 * v25;
    v27 = v23 - ((long long)(((long long)v26 < 0 ? v26 + 3 : v26)) >> 2) + 31;
    v28 = v27 * 80;
    v29 = (unsigned int)((long long)(v28 * 1403534266930087369) >> 75) + (unsigned int)(v28 * 1403534266930087369 >> 127);
    v30 = (unsigned int)v25 + 100 * (unsigned int)v22 + v29;
    if (0xffffe05c <= v30 + 0xffffc5cc)
    {
        v31 = (v28 * -0x29be1739a4fb805d >> 64) + v28;
        v32 = (v31 >> 11) + ((unsigned long long)(v31) >> 63);
        v33 = (2447 * v32) * -0x6666666666666667 >> 64;
        a0[4] = (unsigned int)v32 + 0xfffffff4 * v29 + 1;
        a0[5] = v30 - -4294960496;
        v34 = (unsigned int)(v7 * -1851608123 >> 32) + v7;
        a0[2] = (v34 >> 11) + ((unsigned int)(v34) >> 31);
        a0[3] = (unsigned int)(v33 >> 5) + (unsigned int)(v33 >> 63) + (unsigned int)v27;
        v35 = ((long long)((unsigned int)(v7 * -2004318071 >> 32) + v7) >> 5) + ((unsigned int)(v7 * -2004318071 >> 32) + v7 >> 31);
        v36 = (unsigned int)(v35 * -2004318071 >> 32) + v35;
        *a0 = v7 - 60 * v35;
        a0[1] = v35 - 60 * ((v36 >> 5) + ((unsigned int)(v36) >> 31));
        return 1;
    }
    return 0;
}
