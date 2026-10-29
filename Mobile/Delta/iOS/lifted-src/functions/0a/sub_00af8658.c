/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf8658..0xaf8754 (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af8658_0 {
    char padding_0[24];
    unsigned long long field_18;
    char padding_20[16];
    struct st_af8658_0 *field_30;
} st_af8658_0;


st_af8658_0 * sub_af8658(st_af8658_0 *a0, st_af8658_0 *a1)
{
    st_af8658_0 *v2;  // x0
    st_af8658_0 *v3;  // x21
    st_af8658_0 *v4;  // x0
    st_af8658_0 *v5;  // x22
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/x509_vpm.c", 355, "X509_VERIFY_PARAM_set1_policies");
        sub_a36abc(11, 0xc0102, 0);
        return 0;
    }
    sub_ad6958(a0->field_30, sub_9c3580);
    if (a1)
    {
        v2 = sub_ad61b4();
        a0->field_30 = v2;
        if (!v2)
            return v2;
        if ((int)sub_ad69e4(a1) >= 1)
        {
            v3 = 0;
            do
            {
                v4 = sub_a9ad24(sub_ad69f8(a1, v3), v3);
                if (!v4)
                    return v4;
                v5 = v4;
                if (!sub_ad68a0(a0->field_30, v5))
                {
                    sub_9c3580(v5);
                    return 0;
                }
                v3 = (unsigned int)v3 + 1;
            } while ((int)(unsigned int)v3 < (int)sub_ad69e4(a1));
        }
        a0->field_18 = a0->field_18 | 128;
    }
    else
    {
        a0->field_30 = 0;
    }
    return 1;
}
