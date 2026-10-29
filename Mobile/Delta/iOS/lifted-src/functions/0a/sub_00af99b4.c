/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf99b4..0xaf9a18 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af99b4_0 {
    char padding_0[232];
    unsigned long long field_e8;
    struct st_af99b4_0 *field_f0;
} st_af99b4_0;


st_af99b4_0 * sub_af99b4(st_af99b4_0 *a0, unsigned long a1, st_af99b4_0 *a2)
{
    st_af99b4_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0)
    {
        a0->field_e8 = a1;
        sub_a6c2e4(a0->field_f0, "crypto/x509/x_crl.c", 533);
        a0->field_f0 = 0;
        if (a2)
        {
            v2 = sub_a6d9b4(a2, "crypto/x509/x_crl.c", 536);
            a0->field_f0 = v2;
            if (!v2)
                return v2;
        }
    }
    return 1;
}
