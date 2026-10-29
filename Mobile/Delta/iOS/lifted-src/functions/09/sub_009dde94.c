/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9dde94..0x9dded4 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9dde94_0 {
    struct st_9dde94_0 *field_0;
    char padding_8[8];
    struct st_9dde94_0 *field_10;
    char padding_18[8];
    struct st_9dde94_0 *field_20;
    char padding_28[20];
    unsigned int field_3c;
    struct st_9dde94_0 *field_40;
} st_9dde94_0;


int sub_9dde94(void)
{
    st_9dde94_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(72, "crypto/bn/bn_ctx.c", 126);
    if (v2)
    {
        *(uint128_t *)&v2->field_10 = 0;
        *(uint128_t *)&v2->field_20 = 0;
        *(uint128_t *)&v2->field_0 = 0;
        v2->field_40 = 0;
        v2->field_3c = 8;
    }
    return (unsigned int)v2;
}
