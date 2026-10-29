/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ffd40..0x9ffd58 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ffd40_0 {
    char padding_0[104];
    unsigned int field_68;
    char padding_6c[92];
    unsigned long long field_c8;
} st_9ffd40_0;


int sub_9ffd40(st_9ffd40_0 *a0, unsigned int a1)
{
    a0->field_68 = a1;
    a0->field_c8 = a0->field_c8 + 1;
    return 1;
}
