/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf50b4..0xaf5130 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af50b4_0 {
    char padding_0[264];
    unsigned long long field_108;
    struct st_af50b4_0 *field_110;
} st_af50b4_0;


st_af50b4_0 * sub_af50b4(unsigned long a0, st_af50b4_0 *a1)
{
    st_af50b4_0 *v2;  // x0
    st_af50b4_0 *v3;  // x8
    st_af50b4_0 *v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(280, "crypto/x509/x509_vfy.c", 2469);
    if (!v2)
        return v2;
    v2->field_108 = a0;
    if (!a1)
        return v2;
    v3 = sub_a6d9b4(a1, "crypto/x509/x509_vfy.c", 2476);
    v4 = v2;
    v4->field_110 = v3;
    if (v3)
        return v4;
    sub_a6c2e4(v4, "crypto/x509/x509_vfy.c", 2478);
    return 0;
}
