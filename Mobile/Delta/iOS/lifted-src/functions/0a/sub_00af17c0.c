/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf17c0..0xaf1810 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af17c0_0 {
    struct st_af17c0_0 *field_0;
} st_af17c0_0;


st_af17c0_0 ** sub_af17c0(st_af17c0_0 **a0)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!a0)
    {
        v0 = &v2;
        v1 = v3;
        sub_a368c8();
        sub_a369bc("crypto/x509/x509_att.c", 417, "X509_ATTRIBUTE_get0_object");
        sub_a36abc(11, 0xc0102, 0);
        return 0;
    }
    return *a0;
}
