/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa02ce8..0xa02d08 (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a02ce8_0 {
    char padding_0[120];
    unsigned int field_78;
    char padding_7c[68];
    unsigned long long field_c0;
} st_a02ce8_0;


int sub_a02ce8(st_a02ce8_0 *a0)
{
    a0->field_78 = a0->field_78 | 1;
    a0->field_c0 = a0->field_c0 + 1;
    return 1;
}
