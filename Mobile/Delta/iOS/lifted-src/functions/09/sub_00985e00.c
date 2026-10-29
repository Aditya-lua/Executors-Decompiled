/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x985e00..0x985e28 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_985e00_0 {
    char padding_0[40];
    unsigned long long field_28;
} st_985e00_0;

typedef struct st_985e00_1 {
    struct st_985e00_0 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_985e00_1;

extern st_985e00_1 g_e88710;

unsigned long long sub_985e00(unsigned int a0)
{
    if (2 < a0 - 1)
        return 0xffffffffffffffff;
    return *(long long *)(*(long long *)((char *)&(&g_e88710.field_0)[a0] - 8) + 40);
}
