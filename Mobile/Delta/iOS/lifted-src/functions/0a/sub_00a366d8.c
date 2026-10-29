/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa366d8..0xa36720 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a366d8_0 {
    unsigned int field_0;
    char padding_4[892];
    int field_380;
} st_a366d8_0;


void sub_a366d8(unsigned int a0)
{
    st_a366d8_0 *v2;  // x0
    unsigned long idx;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a35bc0();
    if (!v2)
        return;
    idx = v2->field_380;
    (&v2->field_0)[idx] = (&v2->field_0)[idx] | (0xffffffff ^ (int)(a0 - 1 & ~a0) >> 31) & 2;
    return;
}
