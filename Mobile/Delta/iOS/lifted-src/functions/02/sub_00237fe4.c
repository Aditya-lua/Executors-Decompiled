/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x237fe4..0x2380cc (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_237fe4_1 {
    unsigned long long field_0;
    unsigned long long field_8;
} st_237fe4_1;

typedef struct st_237fe4_0 {
    char padding_0[608];
    unsigned long long field_260;
    char padding_268[296];
    struct st_237fe4_1 *field_390;
} st_237fe4_0;

extern unsigned long long g_f0d1e8;
extern st_237fe4_0 *g_f0d3d8;
extern char g_10002b0;

unsigned long long sub_237fe4(void)
{
    unsigned long long *v7;  // x9
    unsigned long long i;  // [bp-0x48]
    int v1;  // [bp-0x40], Other Possible Types: unsigned long long
    unsigned long long v2;  // [bp-0x38]
    unsigned long long v3;  // [bp-0x30]
    unsigned long v4;  // [bp-0x18]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    v7 = &g_f0d3d8->field_390->field_0;
    v7[1] = 2326356;
    v1 = 0;
    v2 = 0;
    v3 = 0;
    v1 = (unsigned int)(6.244090885e-315 >> 0);
    i = 0;
    if (16 >= i)
    {
        do
        {
            *((char *)&v1 + i) = (char)((unsigned int)i + 2056307341 + *((char *)&v1 + i) - ((unsigned int)i + 2056307341 & *((char *)&v1 + i)) * 2) + 37;
            i += 1;
        } while (i < 0x11);
    }
    *v7 = v1;
    g_f0d1e8 = g_f0d3d8->field_260;
    if (*(long long *)&g_10002b0 == v4)
        return 0;
    ___stack_chk_fail();
}
