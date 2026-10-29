/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f78f0..0x9f7918 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f78f0_0 {
    char padding_0[88];
    unsigned int field_58;
    unsigned int field_5c;
    unsigned int field_60;
} st_9f78f0_0;

extern unsigned int g_d3609c[4];

int sub_9f78f0(st_9f78f0_0 *a0, unsigned int a1)
{
    unsigned int v0;  // w8

    a0->field_5c = a1;
    a0->field_60 = 0;
    v0 = a1 - 1;
    if (2 >= v0)
        a0->field_58 = g_d3609c[v0];
    return 1;
}
