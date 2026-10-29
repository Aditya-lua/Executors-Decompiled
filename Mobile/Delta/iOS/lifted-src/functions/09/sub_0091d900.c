/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x91d900..0x91da14 (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_91d900_1 {
    unsigned long long field_0;
    unsigned long long field_8;
} st_91d900_1;

typedef struct st_91d900_0 {
    char padding_0[768];
    unsigned long long field_300;
    char padding_308[72];
    struct st_91d900_1 *field_350;
} st_91d900_0;

extern char g_91e084;
extern st_91d900_0 *g_f0d3d8;
extern unsigned long long g_f0d548;
extern char g_10002b0;

unsigned long long sub_91d900(void)
{
    unsigned long long *v8;  // x9
    char v9;  // x12
    char v10;  // x13
    char v11;  // x14
    unsigned long long i;  // [bp-0x48]
    int v1;  // [bp-0x40], Other Possible Types: unsigned long long
    unsigned long long v2;  // [bp-0x38]
    unsigned long long v3;  // [bp-0x30]
    unsigned long long v4;  // [bp-0x29]
    unsigned long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    v8 = &g_f0d3d8->field_350->field_0;
    v8[1] = &g_91e084;
    v1 = 0;
    v2 = 0;
    v4 = 0;
    v3 = 0;
    v1 = (unsigned int)(1.58012101e-315 >> 0);
    i = 0;
    if (30 >= i)
    {
        do
        {
            v9 = *((char *)&v1 + i);
            v10 = (char)i + 131;
            v11 = ((v10 & v9) + 1 ^ v10 & v9) + ((v10 & v9) + 1 & v10 & v9) * 2;
            *((char *)&v1 + i) = (char)(v11 + v10 + v9 - v11 * 2) + 108;
            i = ~((i * 2 & 4) + (i ^ 2)) + ((i * 2 & 4) + (i ^ 2)) * 2;
        } while (i < 31);
    }
    *v8 = v1;
    g_f0d548 = g_f0d3d8->field_300;
    if (*(long long *)&g_10002b0 == v5)
        return 0;
    ___stack_chk_fail();
}
