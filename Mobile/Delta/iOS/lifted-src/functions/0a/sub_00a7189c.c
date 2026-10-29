/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7189c..0xa718b8 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7189c_0 {
    unsigned long long field_0;
    unsigned int field_8;
    char padding_c[4];
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
} st_a7189c_0;


long long sub_a7189c(unsigned long a0, unsigned long a1, unsigned long a2)
{
    st_a7189c_0 *v0;  // x8

    v0->field_0 = a0;
    v0->field_8 = 6;
    v0->field_10 = a1;
    v0->field_18 = a2;
    v0->field_20 = 0xffffffffffffffff;
    return a0;
}
