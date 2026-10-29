/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b7334..0x1b7348 (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b7334_1 {
    char padding_0[8];
    unsigned long long field_8;
} st_1b7334_1;

typedef struct st_1b7334_0 {
    unsigned int field_0;
    char padding_4[76];
    unsigned long long field_50;
} st_1b7334_0;


st_1b7334_1 * sub_1b7334(st_1b7334_1 *a0, st_1b7334_0 *a1)
{
    a1->field_0 = 0xfffffc1e;
    a1->field_50 = a0->field_8;
    return a0;
}
