/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x961c84..0x961c90 (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_961c84_0 {
    char padding_0[384];
    unsigned int field_180;
    char padding_184[44];
    unsigned long long field_1b0;
} st_961c84_0;


st_961c84_0 * sub_961c84(st_961c84_0 *a0, unsigned int a1, unsigned long a2)
{
    a0->field_180 = a1;
    a0->field_1b0 = a2;
    return a0;
}
