/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb057c8..0xb057fc (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b057c8_0 {
    char padding_0[192];
    char field_c0;
    char padding_c1[247];
    char field_1b8;
    char padding_1b9[247];
    unsigned long long field_2b0;
    unsigned long long field_2b8;
} st_b057c8_0;


void sub_b057c8(st_b057c8_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    _memcpy();
    a0->field_2b0 = &a0->field_c0;
    a0->field_2b8 = &a0->field_1b8;
    return;
}
