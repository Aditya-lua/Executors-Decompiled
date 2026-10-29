/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1b804..0xa1b990 (396 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1b804_0 {
    struct st_a1b804_0 *field_0;
    struct st_a1b804_0 *field_8;
    char padding_10[208];
    struct st_a1b804_0 *field_e0;
} st_a1b804_0;


st_a1b804_0 * sub_a1b804(st_a1b804_0 **a0, st_a1b804_0 **a1, st_a1b804_0 *a2, st_a1b804_0 *a3, st_a1b804_0 *a4, st_a1b804_0 *a5)
{
    st_a1b804_0 *v4;  // x8
    unsigned long v5;  // cc_dep1
    st_a1b804_0 *v15;  // x20
    st_a1b804_0 *v6;  // w9
    st_a1b804_0 *v7;  // w10
    unsigned long long v8;  // 4112
    unsigned long long v9;  // 4102
    unsigned long long v10;  // 4112
    unsigned long long v11;  // 4102
    st_a1b804_0 *v13;  // x19
    st_a1b804_0 *v0;  // [bp-0x50]
    st_a1b804_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = a4;
    v1 = a3;
    v4 = *a0;
    v5 = v4;
    if (v4 == *a1)
    {
        v6 = (st_a1b804_0 *)(int)a0[4];
        if (v6)
        {
            v7 = (st_a1b804_0 *)(int)a1[1];
            if (v7)
            {
                v8 = arm64g_calculate_condition(20, v5, *a1, 0);
                v9 = arm64g_calculate_condition(19, (v8 & 1 ? (unsigned long long)v6 : 0x40000000), (v8 & 1 ? (unsigned long long)v7 : 0), 0);
                if (!(v9 & 1))
                    goto LABEL_a1b894;
            }
            else
            {
                v10 = arm64g_calculate_condition(20, v5, *a1, 0);
                v11 = arm64g_calculate_condition(16, (v10 & 1 ? (unsigned long long)v6 : 0x40000000), (v10 & 1 ? (unsigned long long)v7 : 0), 0);
                if (!(v11 & 1))
                    goto LABEL_a1b894;
            }
        }
        else
        {
LABEL_a1b894:
            if ((!a3 || v4 == a3->field_0 && (!v6 || !(int)a3->field_8 || v6 == (int)a3->field_8)) && (a2 || a4))
            {
                if (a5)
                {
                    v13 = 0;
                }
                else
                {
                    v13 = sub_9dde94();
                    if (!v13)
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/ec/ec_lib.c", 1140, "EC_POINT_mul");
                        sub_a36abc(16, 0xc0103, 0);
                        return 0;
                    }
                    v4 = *a0;
                }
                if (a3)
                {
                    if (v4->field_e0)
                        v4->field_e0();
                }
                else
                {
                    if (v4->field_e0)
                        v4->field_e0();
                }
                v15 = sub_a1cde4();
                sub_9dded4(v13);
                return v15;
            }
        }
    }
    sub_a368c8();
    sub_a369bc("crypto/ec/ec_lib.c", 1128, "EC_POINT_mul");
    sub_a36abc(16, 101, 0);
    return 0;
}
