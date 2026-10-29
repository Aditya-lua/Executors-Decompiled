/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa71e24..0xa71e38 (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a71e24_0 {
    unsigned long long field_0;
    unsigned int field_8;
    char padding_c[4];
    unsigned long long field_10;
    unsigned long long field_18;
} st_a71e24_0;


st_a71e24_0 * sub_a71e24(st_a71e24_0 *a0, unsigned long a1, unsigned long a2)
{
    a0->field_0 = 0;
    a0->field_10 = a1;
    a0->field_18 = a2;
    a0->field_8 = 127;
    return a0;
}
