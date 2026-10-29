/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9a87c..0xa9a8c0 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a9a87c_0 {
    char padding_0[20];
    int field_14;
} st_a9a87c_0;

extern char g_ea1ec8;

long long sub_a9a87c(st_a9a87c_0 **a0, unsigned int *a1)
{
    unsigned long v0;  // x2
    unsigned long v1;  // x10

    v0 = *a0->field_14;
    v1 = *(int *)&(&g_ea1ec8)[20 + *a1 * 40];
    if ((unsigned int)v0 != (unsigned int)v1)
    {
        return v0 - v1;
    }
    else if (!(unsigned int)v0)
    {
        return 0;
    }
}
