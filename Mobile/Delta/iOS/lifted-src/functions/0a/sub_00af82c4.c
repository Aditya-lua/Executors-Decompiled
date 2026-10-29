/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf82c4..0xaf82fc (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af82c4_0 {
    char padding_0[36];
    unsigned long long field_24;
    unsigned int field_2c;
} st_af82c4_0;


double sub_af82c4(void)
{
    st_af82c4_0 *v2;  // x0
    unsigned long long v3;  // d0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(112, "crypto/x509/x509_vpm.c", 0x55);
    if (!v2)
        return v3;
    *(unsigned long long *)&(v2->padding_0)[1] = 0xffffffff00000000;
    *(unsigned int *)((char *)&v2->field_24 + 4) = 0xffffffff;
    return 0xffffffff00000000;
}
