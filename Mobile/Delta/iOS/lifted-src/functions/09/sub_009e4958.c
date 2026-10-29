/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e4958..0x9e4988 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e4958_0 {
    char padding_0[20];
    unsigned int field_14;
} st_9e4958_0;


int sub_9e4958(void)
{
    st_9e4958_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(24, "crypto/bn/bn_lib.c", 246);
    if (v2)
        v2->field_14 = 1;
    return (unsigned int)v2;
}
