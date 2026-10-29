/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9687c4..0x9689f0 (556 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9687c4_0 {
    unsigned short field_0;
} st_9687c4_0;

extern void g_d280f4;

unsigned long long sub_9687c4(st_9687c4_0 **a0, unsigned long long *a1, unsigned long long *a2, unsigned long long *a3, unsigned long long *a4, unsigned long long *a5, unsigned int *a6, unsigned long a7)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x20
    unsigned long long v12;  // x15
    unsigned long v13;  // cc_dep1
    unsigned long v14;  // cc_dep2
    unsigned int v15;  // w13
    unsigned int v16;  // w14
    unsigned long long v17;  // 4112
    unsigned long long v18;  // 4102
    unsigned long long v19;  // 4112
    unsigned long long v20;  // 4102
    unsigned long v21;  // x14
    unsigned long long v4;  // x21
    unsigned long long v22;  // x15
    unsigned long long v23;  // x14
    unsigned long v24;  // cc_dep1
    unsigned long long v25;  // 4105
    unsigned long long v26;  // 4105
    unsigned long long idx;  // x8
    unsigned long long v6;  // x9
    unsigned long long v7;  // x10
    void* v8;  // x12
    unsigned short *v9;  // x0
    unsigned long long v10;  // x15
    void* v11;  // x14
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a7)
    {
        v2 = sub_a6bf4c(a7 * 2, "ssl/t1_lib.c", 1099);
        if (v2)
        {
            v3 = sub_a6bf4c(2, "ssl/t1_lib.c", 1101);
            if (v3)
            {
                v4 = sub_a6bf4c(8, "ssl/t1_lib.c", 1103);
                if (!v4)
                    goto LABEL_968994;
                idx = 0;
                v6 = 0;
                v7 = 0;
                v8 = &g_d280f4;
                v9 = v2;
                while (1)
                {
                    v10 = 45;
                    v11 = v8;
                    while (1)
                    {
                        v12 = v10;
                        v13 = *(int *)((char *)v11 - 4);
                        v14 = a6[idx];
                        if (*(int *)((char *)v11 - 4) == a6[idx])
                            break;
                        v11 += 8;
                        v10 = v12 - 1;
                        if (v12 == 1)
                            goto LABEL_968998;
                    }
                    v15 = *(short *)v11;
                    v16 = v15 & 0xff;
                    if (v16 <= 63)
                    {
                        v17 = arm64g_calculate_condition(147, v13, v14, 0);
                        v18 = arm64g_calculate_condition(3, (v17 & 1 ? v15 & 0xffff : 0x40000000), 0, 0);
                        if (v18 & 1)
                            break;
                    }
                    else
                    {
                        v19 = arm64g_calculate_condition(147, v13, v14, 0);
                        v20 = arm64g_calculate_condition(0, (v19 & 1 ? v15 & 0xffff : 0x40000000), 0, 0);
                        if (v20 & 1)
                            break;
                    }
                    v21 = 1 << ((char)v16 & 63);
                    if (v15 < 0x100)
                        v22 = v7;
                    else
                        v22 = v6;
                    if (v21 & v22)
                        break;
                    v23 = v21 | v22;
                    v24 = v15 & 0xffff;
                    if (v15 < 0x100)
                    {
                        v7 = v23;
                        v25 = arm64g_calculate_condition(0x33, v24, 0x100, 0);
                        if (!(v25 & 1))
                            goto LABEL_9688d6;
LABEL_9688d5:
                    }
                    else
                    {
                        v7 = v7;
                        v26 = arm64g_calculate_condition(0x33, v24, 0x100, 0);
                        if (v26 & 1)
                            goto LABEL_9688d5;
LABEL_9688d6:
                        v6 = v23;
                    }
                    v9[idx] = v15;
                    idx += 1;
                    if (idx == a7)
                    {
                        sub_a6c2e4(*a0, "ssl/t1_lib.c", 1118);
                        sub_a6c2e4(*a2, "ssl/t1_lib.c", 1119);
                        sub_a6c2e4(*a4, "ssl/t1_lib.c", 1120);
                        *a0 = v9;
                        *a1 = a7;
                        *(unsigned short *)v3 = 0;
                        *a2 = v3;
                        *a3 = 1;
                        *(unsigned long *)v4 = a7;
                        *a4 = v4;
                        *a5 = 1;
                        return 1;
                    }
                }
            }
            else
            {
                v4 = 0;
LABEL_968994:
            }
        }
        else
        {
            v3 = 0;
            v4 = 0;
        }
LABEL_968998:
        sub_a6c2e4();
        sub_a6c2e4(v3, "ssl/t1_lib.c", 1138);
        sub_a6c2e4(v4, "ssl/t1_lib.c", 1139);
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/t1_lib.c", 1096, "tls1_set_groups");
        sub_a36abc(20, 271, 0);
    }
    return 0;
}
