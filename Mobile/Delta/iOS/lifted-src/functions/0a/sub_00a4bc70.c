/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4bc70..0xa4bca0 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4bc70_0 {
    char padding_0[108];
    unsigned int field_6c;
} st_a4bc70_0;


int sub_a4bc70(void)
{
    st_a4bc70_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(192, "crypto/evp/evp_enc.c", 76);
    if (v2)
        v2->field_6c = 0xffffffff;
    return (unsigned int)v2;
}
