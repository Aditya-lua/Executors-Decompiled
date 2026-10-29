/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x985d60..0x985d88 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_985d60_0 {
    char padding_0[24];
    unsigned int field_18;
} st_985d60_0;

typedef struct st_985d60_1 {
    struct st_985d60_0 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_985d60_1;

extern st_985d60_1 g_e88710;

int sub_985d60(unsigned int a0)
{
    if (2 < a0 - 1)
        return 0;
    return *(int *)(*(long long *)((char *)&(&g_e88710.field_0)[a0] - 8) + 24);
}
