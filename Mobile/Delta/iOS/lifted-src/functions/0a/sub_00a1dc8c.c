/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1dc8c..0xa1dcd0 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1dc8c_1 {
    char padding_0[152];
    struct st_a1dc8c_0 *field_98;
} st_a1dc8c_1;

typedef struct st_a1dc8c_0 {
    char padding_0[24];
    unsigned short field_18;
} st_a1dc8c_0;


int sub_a1dc8c(st_a1dc8c_1 *a0)
{
    st_a1dc8c_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(64, "crypto/ec/ec_pmeth.c", 0x33);
    if (v2)
    {
        v2->field_18 = 0x1ff;
        a0->field_98 = v2;
        v2 = 1;
    }
    return (unsigned int)v2;
}
