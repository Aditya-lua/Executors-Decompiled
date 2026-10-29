/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb8a3c0..0xb8a584 (452 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b8a3c0_0 {
    unsigned long long field_0;
    struct st_b8a3c0_1 *field_8;
    unsigned int field_10;
    char padding_14[4];
    struct st_b8a3c0_1 *field_18;
} st_b8a3c0_0;

typedef struct st_b8a3c0_1 {
    unsigned long long field_0;
} st_b8a3c0_1;

extern char g_b8a408;
extern char g_b8a440;
extern char g_e0629e;
extern char g_e062aa;

unsigned int sub_b8a3c0(st_b8a3c0_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_0 == 1)
    {
        a0->field_8 = 0;
        if (a0->field_8)
            goto *((void *)(&(&g_b8a408)[4 * (&g_e0629e)[*(long long *)a0->field_8]]));
        else
            a0->field_0 = 0;
    }
    if (!(a0->field_10 & 1))
        return 0;
    a0->field_18 = 0;
    if (!a0->field_18)
        return 0;
    goto *((void *)(&(&g_b8a440)[4 * (&g_e062aa)[*(long long *)a0->field_18]]));
}
