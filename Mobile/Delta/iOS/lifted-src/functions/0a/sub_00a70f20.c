/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa70f20..0xa71030 (272 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a70f20_0 {
    struct st_a70f20_0 *field_0;
    struct st_a70f20_0 *field_8;
    struct st_a70f20_0 *field_10;
    unsigned int field_18;
} st_a70f20_0;


st_a70f20_0 * sub_a70f20(st_a70f20_0 *a0, st_a70f20_0 *a1)
{
    st_a70f20_0 *v2;  // x8
    st_a70f20_0 *v3;  // x0
    long long v4;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0 && a1 && !(v2 = a0->field_10, !v2))
    {
        if ((int)a0->field_8 == 1)
        {
            v3 = sub_9e5384(v2, a0->field_18, a1->field_0);
            if (v3)
            {
                a1->field_0 = v3;
                return 1;
            }
        }
        else if ((int)a0->field_8 == 2)
        {
            v3 = sub_9e5360(v2, a0->field_18, a1->field_0);
            if (v3)
            {
                a1->field_0 = v3;
                return 1;
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/params.c", 1099, "OSSL_PARAM_get_BN");
            sub_a36abc(15, 129, 0);
        }
        sub_a368c8();
        sub_a369bc("crypto/params.c", 1104, "OSSL_PARAM_get_BN");
        v4 = 524291;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/params.c", 1087, "OSSL_PARAM_get_BN");
        v4 = 786690;
    }
    sub_a36abc(15, v4, 0);
    return 0;
}
