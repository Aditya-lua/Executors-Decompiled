/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x980028..0x98026c (580 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_980028_3 {
    char padding_0[120];
    long long field_78;
} st_980028_3;

typedef struct st_980028_0 {
    char padding_0[160];
    unsigned long long field_a0;
} st_980028_0;

typedef struct st_980028_1 {
    char padding_0[120];
    struct st_980028_0 *field_78;
    struct st_980028_1 *field_80;
    char field_88;
    char padding_89[23];
    unsigned long long field_a0;
    char padding_a8[16];
    unsigned int field_b8;
    char padding_bc[70];
    char field_102;
} st_980028_1;

typedef struct st_980028_2 {
    char padding_0[24];
    struct st_980028_1 *field_18;
    struct st_980028_1 *field_20;
    struct st_980028_1 *field_28;
    char padding_30[4];
    struct st_980028_1 *field_34;
} st_980028_2;


st_980028_1 * sub_980028(st_980028_2 *a0, st_980028_3 *a1, long long a2, long long a3, st_980028_1 **a4, st_980028_1 *a5)
{
    st_980028_1 *v4;  // x20
    unsigned int v5;  // w8
    st_980028_2 *v6;  // x20
    st_980028_2 *v7;  // x20
    long long v9;  // x0
    long long v13;  // x0
    long long v0;  // [bp-0x58]
    st_980028_1 *v1;  // [bp-0x34]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = (st_980028_1 *)0;
    v4 = a0->field_20;
    if (!v4 || !v4->field_80)
    {
LABEL_9800f0:
        goto LABEL_980260;
    }
    v5 = v4->field_80->field_102;
    if (3 < (int)v5)
    {
        if (v5 != 4)
        {
            if (v5 != 6)
            {
                if (v5 != 5)
                    goto LABEL_9800f0;
                v13 = sub_97724c(v4->field_78->field_a0);
                sub_989bd4(v13, v4->field_80);
            }
            goto LABEL_9800f0;
        }
        else
        {
            v4->field_88 = v4->field_88 | 1;
            if ((a0->padding_30)[1])
            {
                if ((int)a0->field_28)
                {
                    if (a0->field_20)
                    {
                        a0->field_20->field_b8 = 6;
                        return 0;
                    }
                }
                else
                {
                    if (!a0->field_18)
                        return 0;
                    *(unsigned int *)&a0->field_18[1].padding_0[117] = 6;
                    return 0;
                }
            }
        }
        goto LABEL_980104;
    }
    if (3 <= v5 - 1)
        goto LABEL_9800f0;
    if (a5)
    {
        v6 = a0;
        if (sub_c633b0(a1->field_78, a2, a3, a4, &v1))
            goto LABEL_9801a8;
    }
    else
    {
        v7 = a0;
        if (sub_9861dc(a1->field_78, a2, a3, a4, &v1))
        {
            if (*a4)
            {
                sub_989228(sub_977254(a0->field_18->field_a0), &v0);
                if (sub_97bc6c(&a1[1].padding_0[32], *a4, v0))
                    goto LABEL_980170;
            }
            else
            {
LABEL_980170:
                if (v1)
                {
                    v9 = sub_97724c(v7->field_18->field_a0);
                    sub_989aa4(v9, v7->field_20->field_80);
                }
                v6 = v7;
                if (*a4)
                {
                    sub_98959c(sub_97724c(a0->field_18->field_a0), a1);
                    v6 = v7;
                }
LABEL_9801a8:
                if (*a4)
                {
                    return 1;
                }
                else if (!v1)
                {
                    return 1;
                }
                else
                {
                    v6->field_20->field_88 = v6->field_20->field_88 | 1;
                    if ((v6->padding_30)[1])
                    {
                        if ((int)v6->field_28)
                        {
                            if (!v6->field_20)
                                return 0;
                            v6->field_20->field_b8 = 6;
                            return 0;
                        }
                        else
                        {
                            if (v6->field_18)
                            {
                                *(unsigned int *)&v6->field_18[1].padding_0[117] = 6;
                                return 0;
                            }
                        }
                    }
                }
                goto LABEL_980104;
            }
        }
    }
LABEL_980260:
    sub_97c738();
LABEL_980104:
    return 0;
}
