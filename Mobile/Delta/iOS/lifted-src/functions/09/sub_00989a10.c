/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x989a10..0x989a44 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_989a10_0 {
    char padding_0[256];
    unsigned long long field_100;
} st_989a10_0;

extern char g_1000000;

int sub_989a10(unsigned long a0, st_989a10_0 *a1)
{
    unsigned long long v0;  // x8
    unsigned int v1;  // w9

    v0 = a1->field_100;
    v1 = ((unsigned int)v0 * &g_1000000 | (unsigned int)v0 >> 8) & 0xff0000ff & 0xff;
    if (v1 == 6)
    {
        return 1;
    }
    else if (v1 == 5)
    {
        a1->field_100 = v0 & 0xffffffffffff00ff | 0x600;
        return 1;
    }
    else
    {
        return 0;
    }
}
