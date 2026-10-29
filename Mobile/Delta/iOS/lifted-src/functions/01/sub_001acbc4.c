/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1acbc4..0x1acbe8 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1acbc4_0 {
    unsigned int field_0;
    char padding_4[76];
    unsigned long long field_50;
} st_1acbc4_0;


unsigned long long * sub_1acbc4(unsigned long long *a0, unsigned int a1, st_1acbc4_0 *a2)
{
    unsigned long long v0;  // x8

    a2->field_0 = 0xfffffc1e;
    v0 = 8;
    if (a1)
        v0 = 16;
    a2->field_50 = *(long long *)((char *)a0 + v0);
    return a0;
}
