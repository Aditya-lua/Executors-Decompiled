/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa71744..0xa71800 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a71744_0 {
    struct st_a71744_0 *field_0;
    unsigned int field_8;
    char padding_c[4];
    struct st_a71744_0 *field_10;
    char padding_18[8];
    struct st_a71744_0 *field_20;
} st_a71744_0;


st_a71744_0 * sub_a71744(st_a71744_0 *a0, st_a71744_0 *a1)
{
    st_a71744_0 *len;  // x0
    long long v3;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0)
    {
        a0->field_20 = 0;
        if (a1)
            len = _strlen(a1);
        else
            len = 0;
        if (a0->field_8 == 6)
        {
            a0->field_20 = len;
            if (!a0->field_10)
                return 1;
            a0->field_10->field_0 = a1;
            return 1;
        }
        sub_a368c8();
        sub_a369bc("crypto/params.c", 1506, "set_ptr_internal");
        v3 = 129;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/params.c", 1518, "OSSL_PARAM_set_utf8_ptr");
        v3 = 786690;
    }
    sub_a36abc(15, v3, 0);
    return 0;
}
