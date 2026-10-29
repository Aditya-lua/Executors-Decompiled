/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e5d24..0x9e5d34 (16 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e5d24_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
    unsigned long long field_10;
} st_9e5d24_0;


st_9e5d24_0 * sub_9e5d24(st_9e5d24_0 *a0, unsigned long a1, unsigned long a2)
{
    a0->field_0 = 2;
    a0->field_8 = a2;
    a0->field_10 = a1;
    return a0;
}
