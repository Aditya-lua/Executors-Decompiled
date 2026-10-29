/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a19c4..0x2a1ab0 (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a19c4_1 {
    unsigned long long field_0;
    unsigned long long field_8;
} st_2a19c4_1;

typedef struct st_2a19c4_0 {
    char padding_0[576];
    unsigned long long field_240;
    char padding_248[296];
    struct st_2a19c4_1 *field_370;
} st_2a19c4_0;

extern unsigned long long g_f0d380;
extern st_2a19c4_0 *g_f0d3d8;
extern char g_10002b0;

unsigned long long sub_2a19c4(void)
{
    unsigned long long *v8;  // x9
    unsigned long long i;  // [bp-0x48]
    int v1;  // [bp-0x40], Other Possible Types: unsigned long long
    unsigned long long v2;  // [bp-0x38]
    unsigned long long v3;  // [bp-0x30]
    unsigned long long v4;  // [bp-0x28]
    unsigned long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    v8 = &g_f0d3d8->field_370->field_0;
    v8[1] = 2759344;
    v1 = 0;
    v2 = 0;
    v4 = 0;
    v3 = 0;
    v1 = (unsigned int)(1.356381886e-314 >> 0);
    i = 0;
    if (27 >= i)
    {
        do
        {
            *((char *)&v1 + i) = (unsigned int)i + 4217788102 + *((char *)&v1 + i) - ((unsigned int)i + 4217788102 & *((char *)&v1 + i)) * 2 - 106;
            i += 1;
        } while (i < 28);
    }
    *v8 = v1;
    g_f0d380 = g_f0d3d8->field_240;
    if (*(long long *)&g_10002b0 == v5)
        return 0;
    ___stack_chk_fail();
}
