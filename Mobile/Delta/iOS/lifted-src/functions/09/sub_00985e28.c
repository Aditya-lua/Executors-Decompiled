/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x985e28..0x985e50 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_985e28_0 {
    char padding_0[48];
    unsigned long long field_30;
} st_985e28_0;

typedef struct st_985e28_1 {
    struct st_985e28_0 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_985e28_1;

extern st_985e28_1 g_e88710;
extern unsigned int g_fffffffffffffffc;

unsigned long long sub_985e28(unsigned int a0)
{
    if (2 < a0 - 1)
        return (char *)&g_fffffffffffffffc + 3;
    return *(long long *)(*(long long *)((char *)&(&g_e88710.field_0)[a0] - 8) + 48);
}
