/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6f9cc..0xa6fa7c (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6f9cc_0 {
    char padding_0[16];
    struct st_a6f9cc_0 *field_10;
    unsigned long long field_18;
    unsigned long long field_20;
} st_a6f9cc_0;


st_a6f9cc_0 * sub_a6f9cc(st_a6f9cc_0 *a0, long long a1, long long a2, unsigned long a3, unsigned long a4)
{
    st_a6f9cc_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        v2 = sub_a6fbc4(a1, a2);
        if (!v2)
            return 1;
        if (v2->field_10)
        {
            if (a4 > v2->field_18)
            {
                sub_a368c8();
                sub_a369bc("crypto/param_build_set.c", 82, "ossl_param_build_set_bn_pad");
                sub_a36abc(15, 116, 0);
                return 0;
            }
            v2->field_18 = a4;
        }
        else
        {
            v2->field_20 = a4;
        }
        return 1;
    }
}
