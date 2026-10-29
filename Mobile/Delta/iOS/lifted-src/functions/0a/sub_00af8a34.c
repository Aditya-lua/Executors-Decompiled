/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf8a34..0xaf8a94 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af8a34_0 {
    char padding_0[72];
    struct st_af8a34_0 *field_48;
} st_af8a34_0;


st_af8a34_0 * sub_af8a34(st_af8a34_0 *a0, st_af8a34_0 *a1)
{
    st_af8a34_0 *v2;  // x21
    st_af8a34_0 *v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1)
        v2 = a1->field_48;
    else
        v2 = 0;
    v3 = a0->field_48;
    if (v3 != v2)
    {
        v3 = sub_a6c2e4(v3, "crypto/x509/x509_vpm.c", 427);
        a0->field_48 = v2;
    }
    if (a1)
        a1->field_48 = 0;
    return v3;
}
