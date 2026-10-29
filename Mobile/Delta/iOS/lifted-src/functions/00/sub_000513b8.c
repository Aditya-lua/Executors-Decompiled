/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x513b8..0x51400 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_513b8_0 {
    char padding_0[8];
    unsigned int field_8;
} st_513b8_0;

extern unsigned int g_f00b90;

long long sub_513b8(unsigned long a0, st_513b8_0 *a1)
{
    if (!a1)
    {
        return a0;
    }
    else if (a1->field_8 != g_f00b90)
    {
        return a0;
    }
}
