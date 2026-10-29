/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa0459c..0xa045ec (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a0459c_0 {
    char padding_0[56];
    struct st_a0459c_0 *field_38;
} st_a0459c_0;


st_a0459c_0 * sub_a0459c(st_a0459c_0 *a0)
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
        sub_a369bc("crypto/dso/dso_lib.c", 219, "DSO_get_filename");
        sub_a36abc(37, 0xc0102, 0);
        return 0;
    }
    return a0->field_38;
}
