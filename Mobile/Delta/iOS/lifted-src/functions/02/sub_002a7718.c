/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a7718..0x2a7898 (384 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a7718_1 {
    unsigned long long field_0;
    unsigned long long field_8;
} st_2a7718_1;

typedef struct st_2a7718_0 {
    char padding_0[776];
    unsigned long long field_308;
    unsigned long long field_310;
    char padding_318[64];
    struct st_2a7718_1 *field_358;
    struct st_2a7718_1 *field_360;
} st_2a7718_0;

extern unsigned long long g_f0d3c8;
extern unsigned long long g_f0d3d0;
extern st_2a7718_0 *g_f0d3d8;
extern char g_10002b0;

unsigned long long sub_2a7718(void)
{
    unsigned long long *v8;  // x9
    unsigned long long *v9;  // x9
    unsigned long long iter;  // [bp-0x48]
    int v1;  // [bp-0x40], Other Possible Types: unsigned long long
    unsigned long long v2;  // [bp-0x38]
    unsigned long long v3;  // [bp-0x30]
    unsigned long long v4;  // [bp-0x28]
    unsigned long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    v8 = &g_f0d3d8->field_358->field_0;
    v8[1] = 2817092;
    v1 = 0;
    v2 = 0;
    v3 = 0;
    v1 = (unsigned int)(2.088612165e-314 >> 0);
    iter = 0;
    if (16 >= iter)
    {
        do
        {
            *((char *)&v1 + iter) = (char)((unsigned int)iter + 3388481375 + *((char *)&v1 + iter) - ((unsigned int)iter + 3388481375 & *((char *)&v1 + iter)) * 2) + 103;
            iter += 1;
        } while (iter < 0x11);
    }
    *v8 = v1;
    g_f0d3c8 = g_f0d3d8->field_308;
    v9 = &g_f0d3d8->field_360->field_0;
    v9[1] = 2785992;
    v1 = 0;
    v2 = 0;
    v4 = 0;
    v3 = 0;
    v1 = (unsigned int)(5.575128827e-315 >> 0);
    iter = 0;
    if (24 >= iter)
    {
        do
        {
            *((char *)&v1 + iter) = (unsigned int)iter + 2679179318 + *((char *)&v1 + iter) - ((unsigned int)iter + 2679179318 & *((char *)&v1 + iter)) * 2 - 122;
            iter += 1;
        } while (iter < 25);
    }
    *v9 = v1;
    g_f0d3d0 = g_f0d3d8->field_310;
    if (*(long long *)&g_10002b0 == v5)
        return 0;
    ___stack_chk_fail();
}
