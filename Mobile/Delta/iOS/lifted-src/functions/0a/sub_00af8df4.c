/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf8df4..0xaf8ed8 (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af8df4_1 {
    char padding_0[16];
    int field_10;
} st_af8df4_1;

typedef struct st_af8df4_0 {
    long long field_0;
    unsigned int field_8;
} st_af8df4_0;


st_af8df4_0 * sub_af8df4(st_af8df4_0 *a0, unsigned long long a1)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    long long v19;  // x20
    unsigned long long v20;  // w0
    unsigned long long i;  // w22
    unsigned int v22;  // w23
    st_af8df4_1 *v23;  // x0
    unsigned long v24;  // cc_op
    unsigned long v25;  // cc_dep1
    unsigned long v26;  // cc_dep2
    unsigned long v27;  // cc_ndep
    unsigned long long v28;  // 4112
    unsigned long long v11;  // x22
    unsigned long long v29;  // 4102
    unsigned long long v30;  // 4112
    unsigned long long v31;  // 4102
    unsigned long long v12;  // x21
    st_af8df4_1 *v32;  // x0
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    unsigned long long v16;  // x19
    unsigned long long v17;  // w0
    unsigned long long v18;  // x0
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if (!a0)
        return a0;
    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    v16 = a1;
    v17 = (unsigned int)sub_ad69e4(a0->field_0);
    v18 = 0;
    if (!(v16 >> 31 & 1) && v17 > (int)v16)
    {
        v19 = a0->field_0;
        v18 = sub_ad664c(v19, v16);
        v20 = (unsigned int)sub_ad69e4(v19);
        a0->field_8 = 1;
        if (v20 != (unsigned int)v16)
        {
            i = v20;
            if ((unsigned int)v16)
                v22 = *(int *)(sub_ad69f8(v19, (unsigned int)v16 - 1) + 16) + 1;
            else
                v22 = *(int *)(v18 + 16);
            v23 = sub_ad69f8(v19, v16);
            if ((int)v22 < v23->field_10)
            {
                v28 = arm64g_calculate_condition(v24 | 176, v25, v26, v27);
                v29 = arm64g_calculate_condition(211, (v28 & 1 ? i : 0x40000000), (v28 & 1 ? v16 & 0xffffffff : 0), 0);
                if (!(v29 & 1))
                    goto LABEL_af8e9c;
            }
            else
            {
                v30 = arm64g_calculate_condition(v24 | 176, v25, v26, v27);
                v31 = arm64g_calculate_condition(208, (v30 & 1 ? i : 0x40000000), (v30 & 1 ? v16 & 0xffffffff : 0), 0);
                if (!(v31 & 1))
                {
                    do
                    {
LABEL_af8e9c:
                        v32 = sub_ad69f8(v19, v16);
                        v32->field_10 = v32->field_10 - 1;
                        v16 = (unsigned int)v16 + 1;
                    } while (i != (unsigned int)v16);
                }
            }
        }
    }
    return v18;
}
