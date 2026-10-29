/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8f1d34..0x8f1d4c (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8f1d34_0 {
    struct st_8f1d34_1 *field_0;
    unsigned long long field_8;
} st_8f1d34_0;

typedef struct st_8f1d34_1 {
    unsigned long long field_0;
} st_8f1d34_1;


st_8f1d34_0 * sub_8f1d34(st_8f1d34_0 *a0, unsigned long long *a1)
{
    a0->field_0 = a1;
    a0->field_8 = 0;
    a0->field_8 = *a1;
    *a1 = 0xffffffffffffffff;
    return a0;
}
