/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x801cc..0x8047c (688 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_801cc_0 {
    char field_0;
} st_801cc_0;

extern char g_10002b0;

unsigned long long sub_801cc(long long idx, unsigned long a1, unsigned long a2, unsigned long a3)
{
    unsigned long long v10;  // x0
    unsigned long long v11;  // 4106
    unsigned long long v20;  // 4102
    unsigned long long v21;  // 4102
    long long v22;  // x22
    unsigned long long v23;  // x0
    unsigned long long v24;  // 4106
    unsigned long long v25;  // 4106
    long long v26;  // x22
    unsigned long long v27;  // x0
    unsigned long long v28;  // 4106
    unsigned long long v29;  // 4106
    unsigned long v12;  // x24
    unsigned int *v30;  // x8
    unsigned long v31;  // x21
    unsigned long long v32;  // x22
    unsigned long long v33;  // x8
    unsigned long long v34;  // x0
    unsigned long long v35;  // x8
    unsigned long long v36;  // x8
    long long v13;  // x22
    unsigned long long v14;  // x0
    unsigned long long v15;  // 4106
    unsigned long long v16;  // x0
    unsigned long v17;  // cc_dep1
    unsigned long long v18;  // 4108
    unsigned long long v19;  // x8
    st_801cc_0 **v0;  // [bp-0x120], Other Possible Types: char
    st_801cc_0 *v1;  // [bp-0x118]
    char v2;  // [bp-0x110]
    unsigned int v3;  // [bp-0x10c]
    unsigned int v4;  // [bp-0x108]
    unsigned int v5;  // [bp-0x104]
    unsigned long long v6;  // [bp-0x98]
    unsigned long v7;  // [bp-0x58]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v7 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    *(unsigned int *)(idx + 0x808) = 1;
    v4 = 31;
    v5 = 0xff;
    v6 = 1;
    v10 = sub_7a428();
    if (!v6 && v5 == 0xff)
        *(unsigned int *)(idx + 0x808) = 2;
    v11 = arm64g_calculate_condition(130, v10, 120, 0);
    if (!(v11 & 1) && !(v12 = a2 + a3, v13 = a2 + 8 + v10, v14 = sub_76814(&v6, &v4, &v5, v13, v12 - v13), v15 = arm64g_calculate_condition(130, v14, 120, 0), v15 & 1 || 8 < v5))
    {
        v16 = sub_78ce8(idx + 2064, &v6, 31);
        v17 = v16;
        v18 = arm64g_calculate_condition(50, v16, 0x77, 0);
        if (v18 & 1)
        {
            v19 = v14;
            v20 = arm64g_calculate_condition(0x22, v17, 0x77, 0);
            if (!(v20 & 1))
                goto LABEL_802c8;
            goto LABEL_803bc;
        }
        else
        {
            v19 = 0;
            v21 = arm64g_calculate_condition(0x22, v17, 0x77, 0);
            if (v21 & 1)
                goto LABEL_803bc;
LABEL_802c8:
            v22 = v13 + v19;
            v3 = 52;
            v23 = sub_76814(&v5, &v3, &v2, v22, v12 - v22);
            v24 = arm64g_calculate_condition(130, v23, 120, 0);
            if (v24 & 1 || 9 < v2 || (v25 = arm64g_calculate_condition(130, sub_78ce8(idx + 2836, &v5, v3), 120, 0), v25 & 1))
                goto LABEL_803bc;
            *(unsigned int *)(idx + 5608) = sub_7ccdc(&v5, v3, 52);
            v26 = v22 + v23;
            v3 = 35;
            v27 = sub_76814(&v5, &v3, &v2, v26, v12 - v26);
            v28 = arm64g_calculate_condition(0x22, v27, 0x77, 0);
            if (v28 & 1 || 9 < v2 || (v29 = arm64g_calculate_condition(130, sub_78ce8(idx + 4288, &v5, v3), 120, 0), v29 & 1 || (*(unsigned int *)(idx + 5612) = sub_7ccdc(&v5, v3, 35), v30 = v26 + v27, v31 = v30 + 3, v31 > v12)))
                goto LABEL_803bc;
            *(unsigned int *)(idx + 5616) = *v30;
            *(unsigned int *)(idx + 5620) = v30[1];
            *(unsigned int *)(idx + 5624) = v30[2];
            v32 = v12 - v31;
            *(unsigned int *)(idx + 5604) = sub_7ccdc();
            v33 = *(int *)(idx + 5616);
            v34 = 0xffffffffffffffe2;
            if ((unsigned int)v33 && v32 >= v33)
            {
                v35 = *(int *)(idx + 5620);
                if ((unsigned int)v35 && v32 >= v35)
                {
                    v36 = *(int *)(idx + 5624);
                    if ((unsigned int)v36 && v32 >= v36)
                        v34 = v31 - a2;
                }
            }
        }
    }
    else
    {
LABEL_803bc:
        v34 = 0xffffffffffffffe2;
    }
    if (*(long long *)&g_10002b0 == v7)
        return v34;
    ___stack_chk_fail();
}
