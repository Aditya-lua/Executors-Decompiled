/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f4470..0x1f44c0 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f4470_0 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_1f4470_0;

extern st_1f4470_0 g_ccab54;
extern unsigned int g_cd1f54[4];
extern st_1f4470_0 g_cd26fc;

unsigned long long sub_1f4470(unsigned int a0)
{
    unsigned int v0;  // w8

    if (125251 < a0)
        return 0xffffffff;
    v0 = g_cd1f54[a0 >> 8] + (a0 & 0xff);
    if (!(&g_cd26fc.field_0)[(&g_ccab54.field_0)[v0]])
        return 0xffffffff;
    return (&g_cd26fc.field_0)[(&g_ccab54.field_0)[v0]];
}
