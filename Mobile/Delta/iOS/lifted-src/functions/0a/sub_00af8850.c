/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf8850..0xaf88bc (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af8850_0 {
    char padding_0[16];
    unsigned int field_10;
} st_af8850_0;


st_af8850_0 * sub_af8850(st_af8850_0 *a0)
{
    unsigned int v2;  // w20
    st_af8850_0 *v3;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/x509_vpm.c", 224, "X509_VERIFY_PARAM_set1");
        sub_a36abc(11, 0xc0102, 0);
        return 0;
    }
    v2 = a0->field_10;
    a0->field_10 = v2 | 1;
    v3 = (st_af8850_0 *)(unsigned int)sub_af8398();
    a0->field_10 = v2;
    return v3;
}
