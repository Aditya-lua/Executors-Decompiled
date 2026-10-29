/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e6cc0..0x9e6f30 (624 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e6cc0_0 {
    struct st_9e6cc0_1 *field_0;
    struct st_9e6cc0_0 *field_8;
} st_9e6cc0_0;

typedef struct st_9e6cc0_1 {
    struct st_9e6cc0_0 *field_0;
} st_9e6cc0_1;

typedef struct st_9e6cc0_2 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
    int field_10;
    char padding_14[12];
    char field_20;
    char padding_21[7];
    unsigned int field_28;
    char padding_2c[4];
    struct st_9e6cc0_0 *field_30;
    char padding_38[24];
    struct st_9e6cc0_0 *field_50;
    struct st_9e6cc0_0 *field_58;
} st_9e6cc0_2;

extern char g_10002b0;

st_9e6cc0_0 * sub_9e6cc0(st_9e6cc0_2 *a0, st_9e6cc0_1 **a1, long long a2)
{
    st_9e6cc0_0 *v8;  // x20
    st_9e6cc0_0 *v9;  // x0
    st_9e6cc0_0 *v10;  // x21
    unsigned int v11;  // w0
    unsigned long long v12;  // 4125
    unsigned int v13;  // w8
    st_9e6cc0_0 *v14;  // x8
    unsigned long v15;  // x8
    unsigned long v16;  // x21
    char *v0;  // [bp-0x60], Other Possible Types: char
    unsigned int v1;  // [bp-0x58]
    double v2;  // [bp-0x54]
    st_9e6cc0_0 *v3;  // [bp-0x48], Other Possible Types: char
    st_9e6cc0_0 *v4;  // [bp-0x40]
    unsigned long v5;  // [bp-0x38]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    if (sub_9e4828(a1))
    {
        v8 = 0;
    }
    else
    {
        sub_9de064(a2);
        v9 = sub_9de208(a2);
        if (v9 && !(v10 = v9, !sub_9e4c34(&a0->field_20, a1)))
        {
            if (sub_9e48c8(a1, 4))
                sub_9e5d14(&a0->field_20, 4);
            *(unsigned int *)&a0->field_30 = 0;
            sub_991a38(&v0);
            v0 = &v3;
            v2 = 1e-323;
            if (sub_9e48c8(a1, 4))
                sub_9e5d14(&v0, 4);
            v11 = sub_9e46a8(a1);
            v12 = arm64g_calculate_condition(177, v11, 63, 0);
            if (v12 & 1)
                v13 = v11 + 126;
            else
                v13 = v11 + 63;
            a0->field_0 = v13 & 0xffffffc0;
            sub_9e5b4c();
            if (sub_9e55d4(&a0->field_8, 64))
            {
                v3 = *(long long *)*a1;
                v4 = 0;
                v1 = *(long long *)*a1 != 0;
                if (sub_9e5b90(&v0))
                {
                    sub_9e5b4c(v10);
LABEL_9e6e00:
                    if (sub_9ea668(v10, v10, 64))
                    {
                        if (sub_9e4828(v10))
                        {
                            if (sub_9e4d58(v10, -0x1))
                                goto LABEL_9e6e44;
                        }
                        else
                        {
                            if (sub_9ebaf8(v10, 1))
                            {
LABEL_9e6e44:
                                if (sub_9de520(v10, 0, v10, &v0, a2))
                                {
                                    if ((int)v10->field_8 >= 1)
                                        v14 = *(long long *)v10->field_0;
                                    else
                                        v14 = 0;
                                    a0->field_50 = v14;
                                    a0->field_58 = 0;
                                    sub_9e5b4c(&a0->field_8);
                                    if (sub_9e55d4(&a0->field_8, a0->field_0 * 2) && sub_9de520(0, &a0->field_8, &a0->field_8, &a0->field_20, a2))
                                    {
                                        v15 = a0->field_10;
                                        v16 = a0->field_28;
                                        if ((int)v16 > (int)v15)
                                            _bzero(a0->field_8 + v15 * 8, (((v16 + ~(unsigned int)v15) * 8 | v16 + ~(unsigned int)v15 >> 61) & 0x7fffffff8 & 0x7ffffffff) + 8);
                                        a0->field_10 = v16;
                                        v8 = 1;
                                        goto LABEL_9e6ef4;
                                    }
                                }
                            }
                        }
                    }
                }
                else if (!(!sub_9e1750(v10, &a0->field_8, &v0, a2)))
                {
                    goto LABEL_9e6e00;
                }
            }
        }
        v8 = 0;
LABEL_9e6ef4:
        sub_9de17c(a2);
    }
    if (*(long long *)&g_10002b0 == v5)
        return v8;
    ___stack_chk_fail();
}
