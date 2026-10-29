/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d8478..0x1d84b0 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1d8478_0 {
    char padding_0[8];
    char field_8;
} st_1d8478_0;

typedef struct st_1d8478_1 {
    char padding_0[160];
    unsigned long long field_a0;
    unsigned long long field_a8;
} st_1d8478_1;

extern st_1d8478_1 *g_f0d3d8;

long long sub_1d8478(unsigned long a0, st_1d8478_0 *a1)
{
    if (a1->field_8 == 1)
        goto *((void *)(g_f0d3d8->field_a0));
    else
        goto *((void *)(g_f0d3d8->field_a8));
}
