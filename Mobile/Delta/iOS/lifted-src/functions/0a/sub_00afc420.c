/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafc420..0xafc484 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_afc420_0 {
    char padding_0[368];
    unsigned long long field_170;
    struct st_afc420_0 *field_178;
} st_afc420_0;


st_afc420_0 * sub_afc420(st_afc420_0 *a0, unsigned long a1, st_afc420_0 *a2)
{
    st_afc420_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0)
    {
        a0->field_170 = a1;
        sub_a6c2e4(a0->field_178, "crypto/x509/x_x509.c", 144);
        a0->field_178 = 0;
        if (a2)
        {
            v2 = sub_a6d9b4(a2, "crypto/x509/x_x509.c", 147);
            a0->field_178 = v2;
            if (!v2)
                return v2;
        }
    }
    return 1;
}
