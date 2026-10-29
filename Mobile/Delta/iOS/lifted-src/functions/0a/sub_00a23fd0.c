/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa23fd0..0xa24024 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a23fd0_0 {
    char padding_0[152];
    unsigned int field_98;
    char padding_9c[4];
    unsigned long long field_a0;
} st_a23fd0_0;


long long sub_a23fd0(st_a23fd0_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_c4c40() && sub_a248a0())
        return 1;
    if (a0->field_98 != 5)
        return 0;
    return a0->field_a0 != 0;
}
