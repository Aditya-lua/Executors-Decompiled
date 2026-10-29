/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa71800..0xa7189c (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a71800_0 {
    unsigned long long field_0;
    unsigned int field_8;
    char padding_c[4];
    struct st_a71800_0 *field_10;
    char padding_18[8];
    struct st_a71800_0 *field_20;
} st_a71800_0;


st_a71800_0 * sub_a71800(st_a71800_0 *a0, unsigned long a1, st_a71800_0 *a2)
{
    long long v2;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0)
    {
        a0->field_20 = 0;
        if (a0->field_8 == 7)
        {
            a0->field_20 = a2;
            if (!a0->field_10)
                return 1;
            a0->field_10->field_0 = a1;
            return 1;
        }
        sub_a368c8();
        sub_a369bc("crypto/params.c", 1506, "set_ptr_internal");
        v2 = 129;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/params.c", 1530, "OSSL_PARAM_set_octet_ptr");
        v2 = 786690;
    }
    sub_a36abc(15, v2, 0);
    return 0;
}
