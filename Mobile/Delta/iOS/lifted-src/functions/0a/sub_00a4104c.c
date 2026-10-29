/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4104c..0xa41080 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4104c_0 {
    char padding_0[120];
    unsigned int field_78;
} st_a4104c_0;


int sub_a4104c(void)
{
    st_a4104c_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(248, "crypto/evp/digest.c", 943);
    if (v2)
    {
        /* unsupported instruction */;
        v2->field_78 = 1;
    }
    return (unsigned int)v2;
}
