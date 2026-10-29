/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6e5dc..0xa6e830 (596 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6e5dc_0 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
    unsigned int field_10;
    unsigned int field_14;
} st_a6e5dc_0;

extern char g_6b01c0;

unsigned long long sub_a6e5dc(unsigned int a0, unsigned int a1, st_a6e5dc_0 *a2, st_a6e5dc_0 *a3)
{
    unsigned long long v0;  // x10
    unsigned int v1;  // w11
    long long v10;  // x17
    unsigned int v11;  // w2
    int v12;  // w13
    long long v13;  // x13
    unsigned long long v14;  // 4319
    unsigned long long v15;  // x12
    unsigned int v16;  // w12
    unsigned long long v17;  // x15
    unsigned int v18;  // w17
    unsigned int v19;  // w3
    unsigned long v2;  // cc_dep1
    long long v20;  // w16
    unsigned int v21;  // w11
    long long v22;  // x14
    unsigned int v23;  // w16
    int v24;  // w11
    long long v25;  // x11
    unsigned long long v26;  // 4318
    unsigned int iter;  // w10
    unsigned int v28;  // w12
    unsigned int v29;  // w13
    unsigned long long v3;  // x4
    unsigned int v30;  // x9
    unsigned int v31;  // w10
    unsigned int v32;  // w11
    unsigned long long v4;  // 4108
    unsigned long long v5;  // 4108
    unsigned int v6;  // w17
    unsigned int v7;  // w2
    long long v8;  // w6
    unsigned int v9;  // w14

    v0 = 3600 * a2->field_8 + 60 * a2->field_4 + a2->field_0;
    if ((int)v0 < 0)
        v1 = (unsigned int)v0 + 86400;
    else
        v1 = v0;
    v2 = v0 & 0xffffffff;
    if ((int)v0 <= 86399)
    {
        v3 = (long long)(v0 * 0x100000000) >> 63 & 0xfffffffffffffffe | __ROL__(v0, 33) & 0xfffffffe00000001 & 1;
        v4 = arm64g_calculate_condition(211, v2, "T", 0);
        if (!(v4 & 1))
            goto LABEL_a6e62e;
LABEL_a6e62d:
    }
    else
    {
        v3 = 1;
        v5 = arm64g_calculate_condition(211, v2, "T", 0);
        if (v5 & 1)
            goto LABEL_a6e62d;
LABEL_a6e62e:
        v1 = (unsigned int)v0 + 0xfffeae80;
    }
    v6 = a2->field_10;
    v7 = ((int)((v6 - 13) * 715827883) >> 33) + ((v6 - 13) * 715827883 >> 63);
    v8 = a2->field_14 + v7;
    v9 = (unsigned int)&(&g_6b01c0)[2775900 + 1461 * v8];
    if ((int)v9 < 0)
        v9 += 3;
    v10 = (0xfffffe91 + 367 * (v6 + 0xfffffff4 * v7)) * 715827883;
    v11 = ((int)((v8 + 6800) * 1374389535 >> 37) + (int)((unsigned long long)((v8 + 6800) * 1374389535) >> 63)) * 3;
    v12 = a2->field_c + ((int)(v9) >> 2) + (int)(v10 >> 33) + (int)((unsigned long long)(v10) >> 63) - ((int)(((int)v11 < 0 ? v11 + 3 : v11)) >> 2) + 0xffff82b5;
    v13 = v3 + v12;
    v14 = arm64g_calculate_condition(66, v3, v12, 0);
    if (v14 & 1)
        return 0;
    v15 = 3600 * a3->field_8 + 60 * a3->field_4 + a3->field_0;
    if ((int)v15 > 86399)
    {
        v16 = (unsigned int)v15 + 0xfffeae80;
        v17 = 1;
    }
    else
    {
        v17 = (long long)(v15 * 0x100000000) >> 63 & 0xfffffffffffffffe | __ROL__(v15, 33) & 0xfffffffe00000001 & 1;
        if ((int)v15 < 0)
            v16 = (unsigned int)v15 + 86400;
        else
            v16 = v15;
    }
    v18 = a3->field_10;
    v19 = ((int)((v18 - 13) * 715827883) >> 33) + ((v18 - 13) * 715827883 >> 63);
    v20 = a3->field_14 + v19;
    v21 = (unsigned int)&(&g_6b01c0)[2775900 + 1461 * v20];
    if ((int)v21 < 0)
        v21 += 3;
    v22 = (0xfffffe91 + 367 * (v18 + 0xfffffff4 * v19)) * 715827883;
    v23 = ((int)((v20 + 6800) * 1374389535 >> 37) + (int)((unsigned long long)((v20 + 6800) * 1374389535) >> 63)) * 3;
    v24 = a3->field_c + ((int)(v21) >> 2) + (int)(v22 >> 33) + (int)((unsigned long long)(v22) >> 63) - ((int)(((int)v23 < 0 ? v23 + 3 : v23)) >> 2) + 0xffff82b5;
    v25 = v17 + v24;
    v26 = arm64g_calculate_condition(66, v17, v24, 0);
    if (v26 & 1)
        return 0;
    iter = v16 - v1;
    v28 = v25 > v13;
    v29 = 0 > (int)iter;
    if (v28 & v29)
        iter += 86400;
    v30 = v25 - v13 - (v28 & v29);
    v31 = 0 > v30;
    v32 = (int)iter > 0;
    if (v31 & v32)
        iter += 0xfffeae80;
    if (a0)
        *(unsigned int *)a0 = v30 + (v31 & v32 & 1);
    if (!a1)
        return 1;
    *(unsigned int *)a1 = iter;
    return 1;
}
