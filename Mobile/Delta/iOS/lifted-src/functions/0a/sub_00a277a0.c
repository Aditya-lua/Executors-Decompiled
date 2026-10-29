/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa277a0..0xa277d8 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a277a0_0 {
    char padding_0[16];
    long long field_10;
    long long field_18;
    long long field_20;
    unsigned int field_28;
} st_a277a0_0;


unsigned long long sub_a277a0(st_a277a0_0 *a0)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_9e4838(a0->field_10);
    sub_9e4838(a0->field_18);
    v2 = sub_9e4838(a0->field_20);
    a0->field_28 = 0;
    return v2;
}
