/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0b128..0xb0b158 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b0b128_0 {
    char padding_0[192];
    char field_c0;
    char padding_c1[127];
    char field_140;
    char padding_141[135];
    unsigned long long field_1c8;
    unsigned long long field_1d0;
} st_b0b128_0;


void sub_b0b128(st_b0b128_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    _memcpy();
    a0->field_1c8 = &a0->field_c0;
    a0->field_1d0 = &a0->field_140;
    return;
}
