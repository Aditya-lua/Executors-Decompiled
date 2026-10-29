/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf1500..0xaf160c (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af1500_0 {
    struct st_af1500_0 *field_0;
} st_af1500_0;


st_af1500_0 ** sub_af1500(st_af1500_0 **a0, st_af1500_0 **a1)
{
    st_af1500_0 **v2;  // x19
    st_af1500_0 **v3;  // x21
    long long v4;  // x22
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0 || !a1)
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/x509_att.c", 89, "ossl_x509at_add1_attr");
        sub_a36abc(11, 0xc0102, 0);
        goto LABEL_af15f4;
    }
    v2 = *a0;
    if (*a0 || !(v2 = sub_ad61b4(), !v2))
    {
        v3 = sub_af9570(a1);
        if (!v3)
            goto LABEL_af15dc;
        if (!sub_ad68a0(v2, v3))
        {
            v4 = 105;
LABEL_af15ac:
            sub_a368c8();
            sub_a369bc("crypto/x509/x509_att.c", v4, "ossl_x509at_add1_attr");
            sub_a36abc(11, 0x8000f, 0);
LABEL_af15dc:
            sub_af9564(v3);
            if (!*a0)
                sub_ad6020(v2);
LABEL_af15f4:
            v2 = 0;
        }
        else if (!*a0)
        {
            *a0 = v2;
        }
    }
    else
    {
        v3 = 0;
        v4 = 95;
        goto LABEL_af15ac;
    }
    return v2;
}
