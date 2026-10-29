/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa947f4..0xa94a84 (656 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a947f4_0 {
    char padding_0[12];
    unsigned int field_c;
} st_a947f4_0;


void sub_a947f4(char *a0, char *iter, unsigned int a2, unsigned long a3, st_a947f4_0 *a4, char *a5, unsigned int *a6, unsigned long long *a7)
{
    unsigned int v2;  // w27
    unsigned long v3;  // cc_op
    unsigned long v6;  // cc_ndep
    unsigned long long v7;  // 4110
    unsigned long long v8;  // 4102
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    unsigned int v11;  // x28
    unsigned long long v12;  // x2
    char *v13;  // x22
    unsigned int v14;  // w8
    unsigned long v15;  // x8
    unsigned long long v16;  // x8
    unsigned long long v17;  // x9
    unsigned long v18;  // cc_dep1
    unsigned long v19;  // cc_dep2
    unsigned long long v20;  // 4104
    unsigned long long v21;  // 4104
    unsigned long long v4;  // 4110
    unsigned long long v5;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *a6;
    if (v2)
    {
        v4 = arm64g_calculate_condition(v3 | 16, v9, v10, v6);
        v5 = arm64g_calculate_condition(20, (v4 & 1 ? a2 : 0x40000000), 0, 0);
        if (v5 & 1)
            goto LABEL_a94844;
LABEL_a9483c:
        v11 = a2;
    }
    else
    {
        v7 = arm64g_calculate_condition(v3 | 16, v9, v10, v6);
        v8 = arm64g_calculate_condition(16, (v7 & 1 ? a2 : 0x40000000), 0, 0);
        if (!(v8 & 1))
            goto LABEL_a9483c;
        do
        {
LABEL_a94844:
            v12 = a2;
            v13 = a0 + 1;
            *iter = a5[v2] ^ *a0;
            iter += 1;
            v11 = v12 - 1;
            v14 = v2 + 1;
            v2 = v14 & 15;
        } while (v14 & 15 && (a0 = v13, a2 = v11, v12 != 1));
    }
    v15 = a4->field_c;
    if (v11 >= 16)
    {
        v16 = v11 >> 4;
        if (v16 >= 0x10000000)
            v16 = 0x10000000;
        v17 = ((((((v15 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v15 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v15 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v15 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) + v16;
        v18 = v16;
        v19 = v17;
        if (v17 < v16)
        {
            v20 = arm64g_calculate_condition(132, v18, v19, 0);
            if (!(v20 & 1))
                goto LABEL_a948ba;
LABEL_a948b9:
        }
        else
        {
            v21 = arm64g_calculate_condition(132, v18, v19, 0);
            if (v21 & 1)
                goto LABEL_a948b9;
LABEL_a948ba:
        }
        a7();
    }
    else if (v11)
    {
        *(unsigned long long *)a5 = 0;
        *(unsigned long long *)&a5[8] = 0;
        a7();
    }
    else
    {
        *a6 = v2;
        return;
    }
}
