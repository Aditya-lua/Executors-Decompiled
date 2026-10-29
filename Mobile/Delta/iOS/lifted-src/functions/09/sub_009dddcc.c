/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9dddcc..0x9dde10 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9dddcc_0 {
    char padding_0[64];
    unsigned long long field_40;
} st_9dddcc_0;


int sub_9dddcc(unsigned long a0)
{
    st_9dddcc_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(72, "crypto/bn/bn_ctx.c", 126);
    if (v2)
    {
        memset(v2, 0, 48);
        v2->field_40 = a0;
    }
    return (unsigned int)v2;
}
