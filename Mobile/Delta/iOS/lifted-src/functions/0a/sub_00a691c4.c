/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa691c4..0xa6924c (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a691c4_0 {
    struct st_a691c4_0 *field_0;
    char padding_8[8];
    long long field_10;
} st_a691c4_0;


st_a691c4_0 * sub_a691c4(st_a691c4_0 *a0, long long a1, st_a691c4_0 *a2)
{
    unsigned long v2;  // cc_op
    unsigned long v3;  // cc_dep1
    unsigned long v4;  // cc_dep2
    unsigned long v5;  // cc_ndep
    unsigned long long v6;  // 4110
    unsigned long long v7;  // 4102
    unsigned long long v8;  // 4110
    unsigned long long v9;  // 4102
    st_a691c4_0 *v10;  // x21
    st_a691c4_0 *v11;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        a0 = sub_a68f38();
        if (a2)
        {
LABEL_a691f0:
            if ((char)a2->field_0)
            {
                v6 = arm64g_calculate_condition(v2 | 16, v3, v4, v5);
                v7 = arm64g_calculate_condition(4, (v6 & 1 ? a0 : 0x40000000), 0, 0);
                if (!(v7 & 1))
                    goto LABEL_a69200;
            }
            else
            {
                v8 = arm64g_calculate_condition(v2 | 16, v3, v4, v5);
                v9 = arm64g_calculate_condition(0, (v8 & 1 ? a0 : 0x40000000), 0, 0);
                if (!(v9 & 1))
                {
LABEL_a69200:
                    v10 = a0;
                    if (sub_a7c198(a0->field_10))
                    {
                        v11 = sub_c6811c(v10, a1, a2);
                        sub_a7c1b4(v10->field_10);
                        return v11;
                    }
                }
            }
        }
    }
    else if (a2)
    {
        goto LABEL_a691f0;
    }
    return 0;
}
