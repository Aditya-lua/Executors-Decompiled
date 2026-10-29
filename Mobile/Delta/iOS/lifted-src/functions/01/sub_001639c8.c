/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1639c8..0x1639f4 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1639c8_0 {
    unsigned long long field_0;
    char padding_8[4];
    unsigned int field_c;
} st_1639c8_0;

typedef struct st_1639c8_1 {
    char padding_0[88];
    struct st_1639c8_0 *field_58;
} st_1639c8_1;


int sub_1639c8(st_1639c8_1 *a0)
{
    st_1639c8_0 *v0;  // x8

    v0 = a0->field_58;
    v0->field_0 = 0x40f223c000000000;
    v0->field_c = 3;
    a0->field_58 = a0->field_58 + 1;
    return 1;
}
