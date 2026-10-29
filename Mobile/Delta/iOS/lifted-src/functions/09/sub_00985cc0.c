/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x985cc0..0x985ce8 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_985cc0_1 {
    unsigned long long field_0;
} st_985cc0_1;

typedef struct st_985cc0_0 {
    struct st_985cc0_1 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_985cc0_0;

extern st_985cc0_0 g_e88710;

long long sub_985cc0(unsigned int a0)
{
    if (2 < a0 - 1)
        return 0;
    return *(long long *)*(long long *)((char *)&(&g_e88710.field_0)[a0] - 8);
}
