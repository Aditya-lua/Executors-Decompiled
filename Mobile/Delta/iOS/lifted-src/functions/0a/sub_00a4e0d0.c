/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4e0d0..0xa4e104 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4e0d0_0 {
    char padding_0[128];
    unsigned int field_80;
} st_a4e0d0_0;


int sub_a4e0d0(void)
{
    st_a4e0d0_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(296, "crypto/evp/evp_enc.c", 1847);
    if (v2)
    {
        /* unsupported instruction */;
        v2->field_80 = 1;
    }
    return (unsigned int)v2;
}
