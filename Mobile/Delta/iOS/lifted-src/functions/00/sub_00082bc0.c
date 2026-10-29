/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x82bc0..0x82ea8 (744 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_82bc0_1 {
    char padding_0[2056];
    unsigned int field_808;
} st_82bc0_1;

typedef struct st_82bc0_0 {
    char field_0;
} st_82bc0_0;


unsigned long long sub_82bc0(unsigned long a0, unsigned long long a1, unsigned long a2, unsigned long long a3, unsigned long a4, unsigned long a5, st_82bc0_1 *a6, unsigned long long a7, unsigned long a8, unsigned long long a9)
{
    unsigned long long v9;  // x8
    unsigned int v10;  // w8
    unsigned long v19;  // cc_dep1
    unsigned long v20;  // cc_dep2
    unsigned long long v21;  // 4111
    unsigned long v22;  // 4110
    unsigned long long v23;  // 4111
    unsigned long v24;  // 4110
    unsigned long v25;  // cc_op
    unsigned long v26;  // cc_dep1
    unsigned long v27;  // cc_dep2
    unsigned long v28;  // 4110
    unsigned int v11;  // w9
    unsigned long long v29;  // 4135
    unsigned long long v30;  // w14
    unsigned long long v31;  // 4110
    unsigned long long v32;  // 4107
    unsigned long long v33;  // 4110
    unsigned long long v34;  // 4107
    unsigned long long v35;  // w9
    unsigned int v36;  // w8
    unsigned long long *v37;  // x8
    unsigned long long v12;  // w10
    unsigned long long v13;  // x10
    unsigned long long v14;  // x10
    unsigned long v15;  // cc_dep2
    unsigned long long v16;  // x27
    unsigned long v17;  // 4110
    unsigned long v18;  // cc_op
    unsigned long long v0;  // [bp-0xa0]
    char *v1;  // [bp-0x98]
    unsigned int v2;  // [bp-0x90]
    unsigned long long v3;  // [bp-0x84]
    st_82bc0_0 **v4;  // [bp-0x78], Other Possible Types: char
    st_82bc0_0 *v5;  // [bp-0x70]
    unsigned int v6;  // [bp-0x64]
    char *v7;  // [bp-0x10]
    unsigned long long v8;  // [bp+0xc]

    v7 = &a8;
    v5 = &v4;
    v4 = &v5;
    v9 = 3;
    if (a3 > 0x3ff)
        v9 = 4;
    if (a3 & 0xffffffffffffc000)
        v9 += 1;
    _memcpy();
    if (*(unsigned int *)((void*)&a8 + 4))
        return sub_82f78();
    v10 = a8;
    v11 = a6->field_808;
    v12 = 9 - v10;
    if (v12 < 3)
        v13 = (char)v12;
    else
        v13 = 3;
    v14 = 8 << (v13 & 63);
    if (v11 == 2)
        v14 = 6;
    if (v14 <= a3)
    {
        v15 = v9;
        if (a1 <= v9)
            return 0xffffffffffffffba;
        v16 = v9;
        v6 = v11;
        if (v11 == 2)
        {
            v17 = arm64g_calculate_condition(4, a1, v15, 0);
            v18 = 4;
            v19 = (v17 & 1 ? v16 : 0);
            v20 = (v17 & 1 ? 3 : 0);
            v21 = arm64g_calculate_condition(20, v19, v20, 0);
            if (!(v21 & 1))
                goto LABEL_82cea;
LABEL_82ce9:
            v24 = arm64g_calculate_condition(v18 | 16, v19, v20, 0);
            v25 = 4;
            v26 = (v24 & 1 ? a3 : 0);
            v27 = (v24 & 1 ? 0x100 : 0);
        }
        else
        {
            v22 = arm64g_calculate_condition(4, a1, v15, 0);
            v18 = 0;
            v19 = (v22 & 1 ? v16 : 0);
            v20 = (v22 & 1 ? 3 : 0);
            v23 = arm64g_calculate_condition(16, v19, v20, 0);
            if (v23 & 1)
                goto LABEL_82ce9;
LABEL_82cea:
            v28 = arm64g_calculate_condition(v18 | 16, v19, v20, 0);
            v25 = 0;
            v26 = (v28 & 1 ? a3 : 0);
            v27 = (v28 & 1 ? 0x100 : 0);
        }
        v29 = arm64g_calculate_condition(v25 | 32, v26, v27, 0);
        v30 = (unsigned int)!(v29 & 1);
        if (v10 < 4)
        {
            v31 = arm64g_calculate_condition(v25 | 48, v26, v27, 0);
            v32 = arm64g_calculate_condition(52, (v31 & 1 ? a3 : 0x20000000), (v31 & 1 ? 1025 : 0), 0);
            if (!(v32 & 1))
                goto LABEL_82d02;
LABEL_82d01:
            v35 = 4;
        }
        else
        {
            v33 = arm64g_calculate_condition(v25 | 48, v26, v27, 0);
            v34 = arm64g_calculate_condition(48, (v33 & 1 ? a3 : 0x20000000), (v33 & 1 ? 1025 : 0), 0);
            if (v34 & 1)
                goto LABEL_82d01;
LABEL_82d02:
            v35 = 0;
        }
        v36 = v35 | (v10 > 7) * 2 | (a9 != 0) * 8;
        if (v8)
            v36 += 1;
        v3 = v30;
        v0 = a7;
        v1 = &v6;
        v2 = v36;
        if (v30)
            v37 = 498168;
        else
            v37 = 508700;
        v37();
    }
    return sub_82f78();
}
