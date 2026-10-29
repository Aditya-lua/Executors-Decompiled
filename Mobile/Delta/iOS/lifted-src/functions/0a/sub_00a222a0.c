/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa222a0..0xa223a0 (256 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_a222a0(unsigned long long *a0, unsigned long a1, unsigned long long a2)
{
    unsigned long long v3;  // x30
    unsigned long long v4;  // x3
    unsigned long long v13;  // 4104
    unsigned long long v14;  // 4104
    unsigned long long v15;  // x6
    unsigned long long v16;  // 4104
    unsigned long long v17;  // 4104
    unsigned int *v18;  // x1
    unsigned long long v19;  // x7
    unsigned long long v20;  // 4187
    unsigned long long v21;  // x4
    unsigned long long v22;  // 4104
    unsigned int *v5;  // x1
    unsigned long long v23;  // 4104
    unsigned long long v24;  // x5
    unsigned long long v25;  // 4104
    unsigned long long v26;  // 4104
    unsigned long long v27;  // x6
    unsigned long long v28;  // 4104
    unsigned long long v29;  // 4104
    unsigned long long v30;  // x7
    unsigned long long v31;  // 4184
    unsigned long long v32;  // x4
    unsigned int *v6;  // x1
    unsigned long long v33;  // 4104
    unsigned long long v34;  // 4104
    unsigned long long v35;  // x5
    unsigned long long v36;  // 4104
    unsigned long long v37;  // 4104
    unsigned long long v38;  // x6
    unsigned long long v39;  // 4104
    unsigned long long v40;  // 4104
    unsigned long long v7;  // x7
    unsigned long long v8;  // 4179
    unsigned long long v9;  // x4
    unsigned long long v10;  // 4104
    unsigned long long v11;  // 4104
    unsigned long long v12;  // x5
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    v0 = &v2;
    v1 = v3;
    if (!a2)
        v4 = 0;
    else
        v4 = 0xffffffffffffffff;
    v5 = a1 + (a2 + v4) * 4;
    v6 = v5 + 128;
    v7 = v5[48] | v5[112] * 0x100000000;
    v8 = arm64g_calculate_condition(20, a2, 0, 0);
    if (v8 & 1)
    {
        v9 = *v5 | v5[64] * 0x100000000;
        v10 = arm64g_calculate_condition(20, a2, 0, 0);
        if (!(v10 & 1))
            goto LABEL_a222f2;
LABEL_a222f1:
        v12 = v5[16] | v5[80] * 0x100000000;
        v13 = arm64g_calculate_condition(20, a2, 0, 0);
        if (!(v13 & 1))
            goto LABEL_a222f6;
LABEL_a222f5:
        v15 = v5[32] | v5[96] * 0x100000000;
        v16 = arm64g_calculate_condition(20, a2, 0, 0);
        if (!(v16 & 1))
            goto LABEL_a222fa;
LABEL_a222f9:
    }
    else
    {
        v9 = 0;
        v11 = arm64g_calculate_condition(20, a2, 0, 0);
        if (v11 & 1)
            goto LABEL_a222f1;
LABEL_a222f2:
        v12 = 0;
        v14 = arm64g_calculate_condition(20, a2, 0, 0);
        if (v14 & 1)
            goto LABEL_a222f5;
LABEL_a222f6:
        v15 = 0;
        v17 = arm64g_calculate_condition(20, a2, 0, 0);
        if (v17 & 1)
            goto LABEL_a222f9;
LABEL_a222fa:
        v7 = 0;
    }
    *a0 = v9;
    a0[1] = v12;
    a0[2] = v15;
    a0[3] = v7;
    v18 = v6 + 128;
    v19 = v6[48] | v6[112] * 0x100000000;
    v20 = arm64g_calculate_condition(20, a2, 0, 0);
    if (v20 & 1)
    {
        v21 = *v6 | v6[64] * 0x100000000;
        v22 = arm64g_calculate_condition(20, a2, 0, 0);
        if (!(v22 & 1))
            goto LABEL_a2233e;
LABEL_a2233d:
        v24 = v6[16] | v6[80] * 0x100000000;
        v25 = arm64g_calculate_condition(20, a2, 0, 0);
        if (!(v25 & 1))
            goto LABEL_a22342;
LABEL_a22341:
        v27 = v6[32] | v6[96] * 0x100000000;
        v28 = arm64g_calculate_condition(20, a2, 0, 0);
        if (!(v28 & 1))
            goto LABEL_a22346;
LABEL_a22345:
    }
    else
    {
        v21 = 0;
        v23 = arm64g_calculate_condition(20, a2, 0, 0);
        if (v23 & 1)
            goto LABEL_a2233d;
LABEL_a2233e:
        v24 = 0;
        v26 = arm64g_calculate_condition(20, a2, 0, 0);
        if (v26 & 1)
            goto LABEL_a22341;
LABEL_a22342:
        v27 = 0;
        v29 = arm64g_calculate_condition(20, a2, 0, 0);
        if (v29 & 1)
            goto LABEL_a22345;
LABEL_a22346:
        v19 = 0;
    }
    a0[4] = v21;
    a0[5] = v24;
    a0[6] = v27;
    a0[7] = v19;
    v30 = v18[48] | v18[112] * 0x100000000;
    v31 = arm64g_calculate_condition(20, a2, 0, 0);
    if (v31 & 1)
    {
        v32 = *v18 | v18[64] * 0x100000000;
        v33 = arm64g_calculate_condition(20, a2, 0, 0);
        if (!(v33 & 1))
            goto LABEL_a22386;
LABEL_a22385:
        v35 = v18[16] | v18[80] * 0x100000000;
        v36 = arm64g_calculate_condition(20, a2, 0, 0);
        if (!(v36 & 1))
            goto LABEL_a2238a;
LABEL_a22389:
        v38 = v18[32] | v18[96] * 0x100000000;
        v39 = arm64g_calculate_condition(20, a2, 0, 0);
        if (!(v39 & 1))
            goto LABEL_a2238e;
LABEL_a2238d:
    }
    else
    {
        v32 = 0;
        v34 = arm64g_calculate_condition(20, a2, 0, 0);
        if (v34 & 1)
            goto LABEL_a22385;
LABEL_a22386:
        v35 = 0;
        v37 = arm64g_calculate_condition(20, a2, 0, 0);
        if (v37 & 1)
            goto LABEL_a22389;
LABEL_a2238a:
        v38 = 0;
        v40 = arm64g_calculate_condition(20, a2, 0, 0);
        if (v40 & 1)
            goto LABEL_a2238d;
LABEL_a2238e:
        v30 = 0;
    }
    a0[8] = v32;
    a0[9] = v35;
    a0[10] = v38;
    a0[11] = v30;
    return a0;
}
