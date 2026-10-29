/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c76f4..0x9c7710 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c76f4_0 {
    char padding_0[16];
    unsigned long long field_10;
} st_9c76f4_0;


st_9c76f4_0 * sub_9c76f4(st_9c76f4_0 *a0, unsigned int a1)
{
    a0->field_10 = a0->field_10 & 0xfffffffffffffff0 | 8 | (8 | a1 & 7) & 7;
    return a0;
}
