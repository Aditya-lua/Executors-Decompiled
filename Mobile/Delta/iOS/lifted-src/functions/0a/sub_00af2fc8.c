/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf2fc8..0xaf311c (340 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af2fc8_0 {
    struct st_af2fc8_0 *field_0;
    struct st_af2fc8_0 *field_8;
} st_af2fc8_0;


st_af2fc8_0 * sub_af2fc8(long long *a0, st_af2fc8_0 *a1, st_af2fc8_0 *a2)
{
    st_af2fc8_0 *v2;  // x0
    st_af2fc8_0 *v3;  // x19
    st_af2fc8_0 *v4;  // x21
    st_af2fc8_0 *v5;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1)
        return a1;
    v2 = sub_a6bffc(16, "crypto/x509/x509_lu.c", 481);
    if (!v2)
        return 0;
    v3 = v2;
    if (a2)
    {
        *(unsigned int *)&v3->field_0 = 2;
        v3->field_8 = a1;
        if (!sub_af8b80(a1))
            goto LABEL_af3088;
LABEL_af3020:
        if (sub_a7c198(a0[19]))
        {
            if (sub_af3570(a0[1], v3))
            {
                sub_a7c1b4(a0[19]);
                v4 = 1;
            }
            else
            {
                v5 = (st_af2fc8_0 *)(unsigned int)sub_ad68a0(a0[1], v3);
                v4 = v5 != 0;
                sub_a7c1b4(a0[19]);
                if (v5)
                    return v5 != 0;
            }
            if ((int)v3->field_0 == 2)
            {
                sub_af99a8(v3->field_8);
            }
            else if ((int)v3->field_0 == 1)
            {
                sub_afc404(v3->field_8);
            }
        }
        else
        {
            if ((int)v3->field_0 == 2)
            {
                sub_af99a8(v3->field_8);
            }
            else if ((int)v3->field_0 == 1)
            {
                sub_afc404(v3->field_8);
            }
            v4 = 0;
        }
    }
    else
    {
        *(unsigned int *)&v3->field_0 = 1;
        v3->field_8 = a1;
        if (sub_af3b1c(a1))
            goto LABEL_af3020;
LABEL_af3088:
        v4 = 0;
        *(unsigned int *)&v3->field_0 = 0;
    }
    sub_a6c2e4(v3, "crypto/x509/x509_lu.c", 530);
    return v4;
}
