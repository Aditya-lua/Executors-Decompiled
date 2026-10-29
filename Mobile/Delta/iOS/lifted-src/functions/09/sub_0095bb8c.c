/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95bb8c..0x95bcfc (368 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char * sub_95bb8c(char **a0, char **a1)
{
    char *v2;  // x8
    char *v3;  // w21
    unsigned long v12;  // cc_dep1
    char *v13;  // x11
    char *v14;  // x9
    unsigned long long v15;  // 4110
    unsigned long long v16;  // 4102
    unsigned long long v17;  // 4110
    unsigned long long v18;  // 4102
    char *v19;  // x10
    char *v20;  // x12
    char *v21;  // x13
    char *v4;  // x8
    char *v22;  // x14
    unsigned long v23;  // cc_dep1
    unsigned long v24;  // cc_dep2
    unsigned long long v25;  // 4110
    unsigned long long v26;  // 4102
    unsigned long long v27;  // 4110
    unsigned long long v28;  // 4102
    char *v29;  // x14
    char *v5;  // w9
    char *v6;  // x0
    char *v7;  // x8
    char *v8;  // x8
    char *v9;  // x9
    char *v10;  // x8
    char *v11;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *a0;
    if (*a0)
    {
        v3 = (char *)0;
        do
        {
            v4 = v2;
            if (*(int *)&v4[8])
            {
                v5 = (char *)*(int *)(*(long long *)v4 + 0x44);
                if (v3 < *(int *)(*(long long *)v4 + 0x44))
                    v3 = v5;
            }
        } while ((v2 = *(long long *)&v4[16], *(long long *)&v4[16]));
    }
    else
    {
        v3 = (char *)0;
    }
    v6 = sub_a6bffc(((unsigned long long)(v3 + 1) * 4 | (unsigned long long)(v3 + 1) >> 62) & 0x3fffffffc & 0x3ffffffff, "ssl/ssl_ciph.c", 929);
    if (!v6)
        return v6;
    v7 = *a0;
    if (v7)
    {
        do
        {
            v8 = v7;
            if (*(int *)&v8[8])
            {
                v9 = *(int *)(*(long long *)v8 + 0x44);
                *(int *)(v6 + 0x4 * v9) = *(int *)(v6 + 0x4 * v9) + 1;
            }
        } while ((v7 = *(long long *)&v8[16], *(long long *)&v8[16]));
    }
    v10 = v3;
    do
    {
        v11 = v10;
        v12 = *(int *)(v6 + 0x4 * v11);
        if (*(int *)(v6 + 0x4 * v11) < 1)
            continue;
        v13 = *a0;
        v14 = *a1;
        if (v14)
        {
            v15 = arm64g_calculate_condition(19, v12, 1, 0);
            v16 = arm64g_calculate_condition(4, (v15 & 1 ? v13 : 0x40000000), 0, 0);
            if (!(v16 & 1))
                goto LABEL_95bc70;
            goto LABEL_95bc30;
        }
        else
        {
            v17 = arm64g_calculate_condition(19, v12, 1, 0);
            v18 = arm64g_calculate_condition(0, (v17 & 1 ? v13 : 0x40000000), 0, 0);
            if (v18 & 1)
            {
LABEL_95bc30:
                v19 = v13;
                v20 = v14;
                goto LABEL_95bc38;
            }
            else
            {
LABEL_95bc70:
                v20 = v14;
                v19 = v13;
                do
                {
                    v21 = *(long long *)&v13[16];
                    v22 = *(int *)(*(long long *)v13 + 0x44);
                    v23 = v11;
                    v24 = v22;
                    if (v11 != v22)
                        continue;
                    if (*(int *)&v13[8])
                    {
                        v25 = arm64g_calculate_condition(20, v23, v24, 0);
                        v26 = arm64g_calculate_condition(4, (v25 & 1 ? v20 : 0x40000000), (v25 & 1 ? v13 : 0), 0);
                        if (v26 & 1)
                            continue;
                    }
                    else
                    {
                        v27 = arm64g_calculate_condition(20, v23, v24, 0);
                        v28 = arm64g_calculate_condition(0, (v27 & 1 ? v20 : 0x40000000), (v27 & 1 ? v13 : 0), 0);
                        if (v28 & 1)
                            continue;
                    }
                    if (v19 == v13)
                        v19 = v21;
                    v29 = *(long long *)&v13[24];
                    if (v29)
                        *(char **)&v29[16] = v21;
                    if (v21)
                        *(char **)&v21[24] = v29;
                    *(char **)&v20[16] = v13;
                    *(unsigned long long *)&v13[16] = 0;
                    *(char **)&v13[24] = v20;
                    v20 = v13;
                } while (v13 != v14 && (v13 = v21, v21));
LABEL_95bc38:
                *a0 = v19;
                *a1 = v20;
            }
        }
    } while ((v10 = v11 - 1, v11 > 0));
    sub_a6c2e4();
    return 1;
}
