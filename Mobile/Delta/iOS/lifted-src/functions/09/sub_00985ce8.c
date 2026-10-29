/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x985ce8..0x985d10 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_985ce8_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_985ce8_0;

typedef struct st_985ce8_1 {
    struct st_985ce8_0 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_985ce8_1;

extern st_985ce8_1 g_e88710;

long long sub_985ce8(unsigned int a0)
{
    if (2 < a0 - 1)
        return 0;
    return *(long long *)(*(long long *)((char *)&(&g_e88710.field_0)[a0] - 8) + 8);
}
