/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a52ec..0x2a53d8 (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a52ec_1 {
    unsigned long long field_0;
    unsigned long long field_8;
} st_2a52ec_1;

typedef struct st_2a52ec_0 {
    char padding_0[736];
    unsigned long long field_2e0;
    char padding_2e8[72];
    struct st_2a52ec_1 *field_330;
} st_2a52ec_0;

extern unsigned long long g_f0d3c0;
extern st_2a52ec_0 *g_f0d3d8;
extern char g_10002b0;

unsigned long long sub_2a52ec(void)
{
    unsigned long long *v8;  // x9
    unsigned long long i;  // [bp-0x48]
    int v1;  // [bp-0x40], Other Possible Types: unsigned long long
    unsigned long long v2;  // [bp-0x38]
    unsigned long long v3;  // [bp-0x30]
    unsigned long long v4;  // [bp-0x2b]
    unsigned long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    v8 = &g_f0d3d8->field_330->field_0;
    v8[1] = 2773464;
    v1 = 0;
    v2 = 0;
    v4 = 0;
    v3 = 0;
    v1 = (unsigned int)(2.49972914e-316 >> 0);
    i = 0;
    if (28 >= i)
    {
        do
        {
            *((char *)&v1 + i) = (unsigned int)i + 2563270913 + *((char *)&v1 + i) - ((unsigned int)i + 2563270913 & *((char *)&v1 + i)) * 2 - 7;
            i += 1;
        } while (i < 29);
    }
    *v8 = v1;
    g_f0d3c0 = g_f0d3d8->field_2e0;
    if (*(long long *)&g_10002b0 == v5)
        return 0;
    ___stack_chk_fail();
}
