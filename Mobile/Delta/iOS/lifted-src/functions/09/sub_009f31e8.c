/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f31e8..0x9f3214 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f31e8_0 {
    struct st_9f31e8_0 *field_0;
    char field_8;
    char padding_9[7];
    struct st_9f31e8_0 *field_10;
    char padding_18[8];
    struct st_9f31e8_0 *field_20;
} st_9f31e8_0;

extern char g_d35f9c;
extern char g_f08538;

int sub_9f31e8(st_9f31e8_0 *a0)
{
    if (a0)
    {
        *(uint128_t *)&a0->field_10 = 0;
        *(uint128_t *)&a0->field_20 = 0;
        *(uint128_t *)&a0->field_0 = 0;
        a0->field_0 = &g_f08538;
        *(char **)&a0->field_8 = &g_d35f9c;
        a0 = 1;
    }
    return (unsigned int)a0;
}
