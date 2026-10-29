/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xcaba4..0xcad5c (440 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_caba4_1 {
    char padding_0[16];
    long long field_10;
} st_caba4_1;

typedef struct st_caba4_0 {
    char field_0;
} st_caba4_0;

extern char g_1000001;

unsigned long long sub_caba4(st_caba4_1 *a0, long long a1, long long a2, long long a3, long long a4, long long a5)
{
    long long v5;  // x19
    unsigned long long v6;  // x0
    unsigned long long v15;  // 4110
    unsigned long v16;  // 4110
    unsigned long v17;  // cc_op
    unsigned long v18;  // cc_dep1
    unsigned long v19;  // x23
    unsigned long long v20;  // 4118
    unsigned long v21;  // 4110
    unsigned long long v22;  // 4118
    unsigned long v23;  // 4112
    unsigned long v24;  // cc_op
    unsigned long long v7;  // 4106
    unsigned long v25;  // cc_dep1
    unsigned long v26;  // 4112
    unsigned long long v27;  // 4118
    long long v28;  // x24
    long long v29;  // x3
    long long v30;  // x2
    long long v31;  // x4
    unsigned long v32;  // x5
    unsigned long idx;  // x25
    unsigned long long v9;  // x22
    long long v10;  // x0
    long long v11;  // w26
    unsigned long long v12;  // x0
    unsigned long long v13;  // x8
    unsigned long v14;  // cc_dep1
    st_caba4_0 **v0;  // [bp-0x78], Other Possible Types: char
    st_caba4_0 *v1;  // [bp-0x70]
    unsigned int v2;  // [bp-0x64]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a2;
    v1 = &v0;
    v0 = &v1;
    if ((unsigned long long)a4 > sub_c628c())
        return 0xffffffffffffffb8;
    v6 = sub_c64b8(a0, a3, a4, a1, v5, a5);
    v7 = arm64g_calculate_condition(130, v6, 120, 0);
    if (v7 & 1)
        return v6;
    idx = &a0[1194].field_10;
    v9 = a3 + v6;
    v10 = sub_c628c(a0);
    if ((unsigned long long)v10 >= (unsigned long long)v5)
        v10 = v5;
    v11 = *(int *)(idx + 1532);
    v12 = sub_c6f44();
    v13 = v12;
    v14 = v12;
    v15 = arm64g_calculate_condition(130, v12, 120, 0);
    if (!(v15 & 1))
    {
        if (a1)
        {
            v16 = arm64g_calculate_condition(18, v14, 120, 0);
            v17 = 4;
            v18 = (v16 & 1 ? v5 : 0x40000000);
            v19 = v2;
            v20 = arm64g_calculate_condition(4, v18, 0, 0);
            if (!(v20 & 1))
                goto LABEL_cac76;
LABEL_cac75:
            v23 = arm64g_calculate_condition(v17, v18, 0, 0);
            v24 = 3;
            v25 = (v23 & 1 ? v19 & 0xffffffff : 0x40000000);
        }
        else
        {
            v21 = arm64g_calculate_condition(18, v14, 120, 0);
            v17 = 0;
            v18 = (v21 & 1 ? v5 : 0x40000000);
            v19 = v2;
            v22 = arm64g_calculate_condition(0, v18, 0, 0);
            if (v22 & 1)
                goto LABEL_cac75;
LABEL_cac76:
            v26 = arm64g_calculate_condition(v17, v18, 0, 0);
            v24 = 0;
            v25 = (v26 & 1 ? v19 & 0xffffffff : 0x40000000);
        }
        v27 = arm64g_calculate_condition(v24 | 208, v25, 0, 0);
        v13 = 0xffffffffffffffba;
        if (0xffffffffffefffff >= (unsigned long long)a1 && v27 & 1)
        {
            v28 = a4 - v6 - v12;
            if (!v11 && (unsigned long long)(a1 + v10 - *(long long *)&a0[1246].padding_0[0]) >= &g_1000001 && (int)v19 >= 9)
                v11 = sub_c6a20(a0->field_10, v19) > 6;
            *(unsigned int *)(idx + 1532) = 0;
            if (v11)
            {
                v13 = sub_c8c64(a0, a1, v5, v9 + v12, v28, v19);
            }
            else
            {
                v29 = v9 + v12;
                v30 = v5;
                v31 = v28;
                v32 = v19;
                if (*(int *)(idx + 1696) == 2)
                    v13 = sub_c7a68(a0, a1, v30, v29, v31, v32);
                else
                    v13 = sub_c7168(a0, a1, v30, v29, v31, v32);
            }
        }
    }
    return v13;
}
