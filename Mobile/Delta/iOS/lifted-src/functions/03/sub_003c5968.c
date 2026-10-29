/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c5968..0x3c599c (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c5968_0 {
    char padding_0[12];
    char field_c;
} st_3c5968_0;

typedef struct st_3c5968_1 {
    unsigned long long field_0;
} st_3c5968_1;

extern st_3c5968_1 *g_f0d3d8;

long long sub_3c5968(unsigned long a0, st_3c5968_0 *a1)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x9

    v0 = 168;
    v1 = 152;
    if (a1->field_c)
        v0 = v1;
    goto *((void *)(*(long long *)((char *)g_f0d3d8 + v0)));
}
