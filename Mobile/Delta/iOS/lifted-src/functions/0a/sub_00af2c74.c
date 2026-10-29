/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf2c74..0xaf2ca0 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af2c74_0 {
    struct st_af2c74_0 *field_0;
} st_af2c74_0;


int sub_af2c74(void)
{
    st_af2c74_0 **v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(16, "crypto/x509/x509_lu.c", 481);
    if (v2)
        *(unsigned int *)v2 = 0;
    return (unsigned int)v2;
}
