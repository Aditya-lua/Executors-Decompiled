/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb52bd8..0xb52c14 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b52bd8_0 {
    char padding_0[16];
    long long field_10;
    char padding_18[176];
    unsigned long long field_c8;
} st_b52bd8_0;


void sub_b52bd8(st_b52bd8_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0->field_c8)
        return;
    sub_aafbcc(a0->field_10);
}
