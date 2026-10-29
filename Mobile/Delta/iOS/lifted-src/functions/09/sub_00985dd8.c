/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x985dd8..0x985e00 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_985dd8_0 {
    char padding_0[32];
    unsigned int field_20;
} st_985dd8_0;

typedef struct st_985dd8_1 {
    struct st_985dd8_0 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_985dd8_1;

extern st_985dd8_1 g_e88710;

int sub_985dd8(unsigned int a0)
{
    if (2 < a0 - 1)
        return 0;
    return *(int *)(*(long long *)((char *)&(&g_e88710.field_0)[a0] - 8) + 32);
}
