/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf2ca0..0xaf2ebc (540 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af2ca0_0 {
    struct st_af2ca0_0 *field_0;
    char field_1;
    char padding_2[6];
    long long field_8;
    long long field_10;
    char padding_18[24];
    struct st_af2ca0_0 *field_30;
    char padding_38[24];
    struct st_af2ca0_0 *field_50;
    char padding_58[64];
    long long field_98;
} st_af2ca0_0;

typedef struct st_af2ca0_1 {
    char padding_0[4];
    struct st_af2ca0_0 *field_4;
    struct st_af2ca0_0 *field_8;
} st_af2ca0_1;

extern char g_10002b0;

st_af2ca0_0 * sub_af2ca0(st_af2ca0_0 **a0, st_af2ca0_0 *a1, unsigned long a2, st_af2ca0_0 *a3)
{
    st_af2ca0_0 *v11;  // x25
    st_af2ca0_0 *v12;  // x0
    st_af2ca0_0 *v21;  // x8
    st_af2ca0_0 *v22;  // w8
    long long v13;  // x23
    unsigned long long *v14;  // x8
    long long v15;  // x0
    unsigned long long v16;  // 4112
    st_af2ca0_0 *v17;  // x23
    st_af2ca0_0 *v18;  // x24
    st_af2ca0_1 *v19;  // x0
    st_af2ca0_0 *v20;  // x8
    st_af2ca0_0 *v0;  // [bp-0x2f0]
    st_af2ca0_0 *v1;  // [bp-0x2e8]
    st_af2ca0_0 *v2;  // [bp-0x2e0]
    char *v3;  // [bp-0x2d8]
    char v4;  // [bp-0x2d0]
    char v5;  // [bp-0x2b8]
    char v6;  // [bp-0x1d8]
    char v7;  // [bp-0x190]
    unsigned long v8;  // [bp-0x58]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v8 = *(long long *)&g_10002b0;
    v11 = *a0;
    if (v11)
    {
        v0 = (st_af2ca0_0 *)0;
        v1 = 0;
        v12 = sub_a7c17c(*(long long *)&v11->padding_58[56]);
        if (!(unsigned int)v12)
        {
            if (*(long long *)&g_10002b0 == v8)
                return v12;
            ___stack_chk_fail();
        }
        if (!sub_ab8cf8(*(long long *)&v11->field_1))
        {
            sub_a7c1b4(*(long long *)&v11->padding_58[56]);
            v12 = sub_a7c198(*(long long *)&v11->padding_58[56]);
            if ((unsigned int)v12)
            {
                sub_ad6ae4(*(long long *)&v11->field_1);
            }
            else
            {
                if (*(long long *)&g_10002b0 == v8)
                    return v12;
                ___stack_chk_fail();
            }
        }
        v13 = *(long long *)&v11->field_1;
        v2 = a1;
        if (a1 != 1)
        {
            if (a1 != 2)
                goto LABEL_af2d84;
            v3 = &v4;
            v14 = &v5;
        }
        else
        {
            v3 = &v6;
            v14 = &v7;
        }
        *v14 = a2;
        v15 = sub_ad6894(v13, &v2, 0);
        v16 = arm64g_calculate_condition(1, v15 & 0xffffffff, 1, 0);
        if (!(v16 & 1))
        {
            v17 = sub_ad69f8(v13, v15);
        }
        else
        {
LABEL_af2d84:
            v17 = 0;
        }
        sub_a7c1b4(*(long long *)&v11->padding_58[56]);
        if (a1 == 2 || !v17)
        {
            if ((int)sub_ad69e4(v11->field_8) >= 1)
            {
                v18 = 0;
                do
                {
                    v19 = sub_ad69f8(v11->field_8, v18);
                    if ((v19->padding_0)[1])
                        continue;
                    v20 = v19->field_4;
                    if (!v20)
                        goto LABEL_af2eb0;
                    v21 = *(long long *)&v20->padding_38[16];
                    if (!*(long long *)&v20->padding_18[16])
                    {
                        if (v21)
                            v21();
                    }
                    else
                    {
                        if (v21)
                            v21();
                        (*(long long *)&v20->padding_18[16])();
                    }
                } while ((v18 = (unsigned int)v18 + 1, (int)sub_ad69e4(v11->field_8) > (int)(unsigned int)v18));
            }
            if (!v17)
                goto LABEL_af2e6c;
        }
        if (a3)
        {
            v22 = (st_af2ca0_0 *)(int)v17->field_0;
            if (v22 != 2)
            {
                if (v22 != 1)
                    goto LABEL_af2e58;
                if (!sub_af3b1c(*(long long *)&v17->field_1))
                    goto LABEL_af2eb0;
LABEL_af2e54:
                v22 = (st_af2ca0_0 *)(int)v17->field_0;
LABEL_af2e58:
                *(unsigned int *)&a3->field_0 = (unsigned int)v22;
                *(long long *)&a3->field_1 = *(long long *)&v17->field_1;
                goto LABEL_af2e64;
            }
            else
            {
                if (sub_af8b80(*(long long *)&v17->field_1))
                    goto LABEL_af2e54;
LABEL_af2eb0:
                v12 = 0xffffffff;
            }
        }
        else
        {
LABEL_af2e64:
            v12 = 1;
        }
    }
    else
    {
LABEL_af2e6c:
        v12 = 0;
    }
    if (*(long long *)&g_10002b0 == v8)
        return v12;
    ___stack_chk_fail();
}
