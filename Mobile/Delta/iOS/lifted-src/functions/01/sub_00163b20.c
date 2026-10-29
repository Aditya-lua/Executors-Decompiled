/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x163b20..0x163b44 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_163b20_1 {
    unsigned int field_0;
    char padding_4[8];
    unsigned int field_c;
} st_163b20_1;

typedef struct st_163b20_0 {
    char padding_0[88];
    struct st_163b20_1 *field_58;
} st_163b20_0;


int sub_163b20(st_163b20_0 *a0)
{
    unsigned int *v0;  // x8

    v0 = &a0->field_58->field_0;
    *v0 = 0;
    v0[3] = 1;
    a0->field_58 = a0->field_58 + 1;
    return 1;
}
