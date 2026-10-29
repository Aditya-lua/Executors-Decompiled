/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbeb8c..0xbeca8 (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_beb8c_0 {
    char field_0;
} st_beb8c_0;

typedef struct st_beb8c_1 {
    unsigned long long field_0;
    unsigned int field_8;
} st_beb8c_1;

extern char g_10002b0;

unsigned long long sub_beb8c(void* a0, unsigned long long *a1, st_beb8c_1 *a2, unsigned int a3, unsigned long long a4)
{
    unsigned int v9;  // w8
    unsigned int v10;  // w9
    unsigned long long v19;  // 4102
    unsigned long long v20;  // 4112
    unsigned long long v21;  // 4102
    unsigned int v22;  // w8
    unsigned long long v23;  // x0
    unsigned long v11;  // 4110
    unsigned long v12;  // cc_op
    unsigned long v13;  // cc_dep1
    unsigned long v14;  // cc_dep2
    unsigned long long v15;  // 4112
    unsigned long v16;  // 4110
    unsigned long long v17;  // 4112
    unsigned long long v18;  // 4112
    st_beb8c_0 **v0;  // [bp-0x78], Other Possible Types: char
    st_beb8c_0 *v1;  // [bp-0x70]
    st_beb8c_0 **v2;  // [bp-0x68], Other Possible Types: char
    st_beb8c_0 *v3;  // [bp-0x60]
    unsigned long v4;  // [bp-0x58]
    unsigned int v5;  // [bp-0x50]
    unsigned long v6;  // [bp-0x48]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    if (!(int)a0[196] && a1[1] == *a1)
    {
        v9 = a3 - (int)a0[8];
        v10 = (int)a0[24];
        if (v10 == (int)a0[28])
        {
            v11 = arm64g_calculate_condition(4, a1[1], *a1, 0);
            v12 = 4;
            v13 = (v11 & 1 ? a4 : 0);
            v14 = (v11 & 1 ? 9 : 0);
            v15 = arm64g_calculate_condition(36, v13, v14, 0);
            if (!(v15 & 1))
                goto LABEL_bebee;
LABEL_bebed:
            v18 = arm64g_calculate_condition(v12 | 32, v13, v14, 0);
            v19 = arm64g_calculate_condition(19, (v18 & 1 ? v10 : 0), (v18 & 1 ? v9 : 0), 0);
            if (!(v19 & 1))
                goto LABEL_bebf4;
        }
        else
        {
            v16 = arm64g_calculate_condition(4, a1[1], *a1, 0);
            v12 = 0;
            v13 = (v16 & 1 ? a4 : 0);
            v14 = (v16 & 1 ? 9 : 0);
            v17 = arm64g_calculate_condition(32, v13, v14, 0);
            if (v17 & 1)
                goto LABEL_bebed;
LABEL_bebee:
            v20 = arm64g_calculate_condition(v12 | 32, v13, v14, 0);
            v21 = arm64g_calculate_condition(16, (v20 & 1 ? v10 : 0), (v20 & 1 ? v9 : 0), 0);
            if (!(v21 & 1))
            {
LABEL_bebf4:
                v3 = &v2;
                v2 = &v3;
                v4 = a2->field_0;
                v5 = a2->field_8;
                sub_b5b68();
                sub_7fe58(a1);
                *(unsigned long long *)&a0[8] = (long long)a0[8] - a4;
                v22 = (int)a0[24] + (unsigned int)a4;
                *(unsigned int *)&a0[24] = v22;
                *(unsigned int *)&a0[28] = v22;
                *(unsigned int *)&a0[44] = v22;
            }
        }
    }
    v23 = sub_b5b68();
    if (*(long long *)&g_10002b0 == v6)
        return v23;
    ___stack_chk_fail();
}
