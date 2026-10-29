/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6eaa0..0xa6eaf8 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6eaa0_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    char field_30;
} st_a6eaa0_0;


long long sub_a6eaa0(st_a6eaa0_0 *a0)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    a0->field_0 = 0;
    a0->field_8 = 0;
    a0->field_18 = 0;
    a0->field_20 = 0xffffffffffffffff;
    a0->field_30 = a0->field_30 | 1;
    a0->field_10 = 0;
    v2 = sub_a6bffc(40, "crypto/packet.c", 110);
    a0->field_28 = v2;
    return v2 != 0;
}
